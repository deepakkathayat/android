# Copyright 2013 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import its.image
import its.device
import its.objects
import its.target
import pylab
import os.path
import matplotlib
import matplotlib.pyplot
import copy

def main():
    """Test that settings latch on the right frame.

    Takes a bunch of shots using back-to-back requests, varying the capture
    request parameters between shots. Checks that the images that come back
    have the expexted properties.
    """
    NAME = os.path.basename(__file__).split(".")[0]

    r_means = []
    g_means = []
    b_means = []

    with its.device.ItsSession() as cam:
        e, s = its.target.get_target_exposure_combos(cam)["midExposureTime"]
        s = s / 2.0

        reqs = [
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s*4,e  ),
            its.objects.manual_capture_request(s*4,e  ),
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s,  e*4),
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s*4,e  ),
            its.objects.manual_capture_request(s,  e  ),
            its.objects.manual_capture_request(s,  e*4),
            its.objects.manual_capture_request(s,  e  ),
            ]

        caps = cam.do_capture(reqs)
        for i,cap in enumerate(caps):
            img = its.image.convert_capture_to_rgb_image(cap)
            its.image.write_image(img, "%s_i=%02d.jpg" % (NAME, i))
            tile = its.image.get_image_patch(img, 0.45, 0.45, 0.1, 0.1)
            rgb_means = its.image.compute_image_means(tile)
            r_means.append(rgb_means[0])
            g_means.append(rgb_means[1])
            b_means.append(rgb_means[2])

    # Draw a plot.
    idxs = range(len(r_means))
    pylab.plot(idxs, r_means, 'r')
    pylab.plot(idxs, g_means, 'g')
    pylab.plot(idxs, b_means, 'b')
    pylab.ylim([0,1])
    matplotlib.pyplot.savefig("%s_plot_means.png" % (NAME))

if __name__ == '__main__':
    main()

