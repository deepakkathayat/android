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

public class TestAtan2 extends RSBaseCompute {

    private ScriptC_TestAtan2 script;
    private ScriptC_TestAtan2Relaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestAtan2(mRS);
        scriptRelaxed = new ScriptC_TestAtan2Relaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inY;
        public float inX;
        public Floaty out;
    }

    private void checkAtan2FloatFloatFloat() {
        Allocation inY = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x8f58f1f953c03c32l, false);
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x8f58f1f953c03c31l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInX(inX);
            script.forEach_testAtan2FloatFloatFloat(inY, out);
            verifyResultsAtan2FloatFloatFloat(inY, inX, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2FloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInX(inX);
            scriptRelaxed.forEach_testAtan2FloatFloatFloat(inY, out);
            verifyResultsAtan2FloatFloatFloat(inY, inX, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2FloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsAtan2FloatFloatFloat(Allocation inY, Allocation inX, Allocation out, boolean relaxed) {
        float[] arrayInY = new float[INPUTSIZE * 1];
        inY.copyTo(arrayInY);
        float[] arrayInX = new float[INPUTSIZE * 1];
        inX.copyTo(arrayInX);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inY = arrayInY[i];
                args.inX = arrayInX[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeAtan2(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtan2FloatFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtan2Float2Float2Float2() {
        Allocation inY = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xbe78dcdcd414b6c0l, false);
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xbe78dcdcd414b6bfl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInX(inX);
            script.forEach_testAtan2Float2Float2Float2(inY, out);
            verifyResultsAtan2Float2Float2Float2(inY, inX, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInX(inX);
            scriptRelaxed.forEach_testAtan2Float2Float2Float2(inY, out);
            verifyResultsAtan2Float2Float2Float2(inY, inX, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float2Float2Float2: " + e.toString());
        }
    }

    private void verifyResultsAtan2Float2Float2Float2(Allocation inY, Allocation inX, Allocation out, boolean relaxed) {
        float[] arrayInY = new float[INPUTSIZE * 2];
        inY.copyTo(arrayInY);
        float[] arrayInX = new float[INPUTSIZE * 2];
        inX.copyTo(arrayInX);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inY = arrayInY[i * 2 + j];
                args.inX = arrayInX[i * 2 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeAtan2(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtan2Float2Float2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtan2Float3Float3Float3() {
        Allocation inY = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x12ddbafcd5f2b861l, false);
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x12ddbafcd5f2b860l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInX(inX);
            script.forEach_testAtan2Float3Float3Float3(inY, out);
            verifyResultsAtan2Float3Float3Float3(inY, inX, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float3Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInX(inX);
            scriptRelaxed.forEach_testAtan2Float3Float3Float3(inY, out);
            verifyResultsAtan2Float3Float3Float3(inY, inX, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float3Float3Float3: " + e.toString());
        }
    }

    private void verifyResultsAtan2Float3Float3Float3(Allocation inY, Allocation inX, Allocation out, boolean relaxed) {
        float[] arrayInY = new float[INPUTSIZE * 4];
        inY.copyTo(arrayInY);
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inY = arrayInY[i * 4 + j];
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeAtan2(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtan2Float3Float3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkAtan2Float4Float4Float4() {
        Allocation inY = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x6742991cd7d0ba02l, false);
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x6742991cd7d0ba01l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInX(inX);
            script.forEach_testAtan2Float4Float4Float4(inY, out);
            verifyResultsAtan2Float4Float4Float4(inY, inX, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float4Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInX(inX);
            scriptRelaxed.forEach_testAtan2Float4Float4Float4(inY, out);
            verifyResultsAtan2Float4Float4Float4(inY, inX, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testAtan2Float4Float4Float4: " + e.toString());
        }
    }

    private void verifyResultsAtan2Float4Float4Float4(Allocation inY, Allocation inX, Allocation out, boolean relaxed) {
        float[] arrayInY = new float[INPUTSIZE * 4];
        inY.copyTo(arrayInY);
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inY = arrayInY[i * 4 + j];
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeAtan2(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkAtan2Float4Float4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testAtan2() {
        checkAtan2FloatFloatFloat();
        checkAtan2Float2Float2Float2();
        checkAtan2Float3Float3Float3();
        checkAtan2Float4Float4Float4();
    }
}
