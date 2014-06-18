/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestNativePowr extends RSBaseCompute {

    private ScriptC_TestNativePowr script;
    private ScriptC_TestNativePowrRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestNativePowr(mRS);
        scriptRelaxed = new ScriptC_TestNativePowrRelaxed(mRS);
    }

    private void checkNativePowrFloatFloatFloat() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3c3550bdff7a10c2l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3c3550bdff7a10c5l, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloatFloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloatFloatFloat(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloatFloatFloat: " + e.toString());
        }
    }

    private void checkNativePowrFloat2Float2Float2() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xdbc56fbe7733c926l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xdbc56fbe7733c929l, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat2Float2Float2(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat2Float2Float2: " + e.toString());
        }
    }

    private void checkNativePowrFloat3Float3Float3() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x302a4dde7911cac7l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x302a4dde7911cacal, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat3Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat3Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat3Float3Float3(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat3Float3Float3: " + e.toString());
        }
    }

    private void checkNativePowrFloat4Float4Float4() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x848f2bfe7aefcc68l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x848f2bfe7aefcc6bl, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat4Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat4Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat4Float4Float4(inV, out);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat4Float4Float4: " + e.toString());
        }
    }

    public void testNativePowr() {
        checkNativePowrFloatFloatFloat();
        checkNativePowrFloat2Float2Float2();
        checkNativePowrFloat3Float3Float3();
        checkNativePowrFloat4Float4Float4();
    }
}
