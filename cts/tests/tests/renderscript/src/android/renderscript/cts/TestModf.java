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

public class TestModf extends RSBaseCompute {

    private ScriptC_TestModf script;
    private ScriptC_TestModfRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestModf(mRS);
        scriptRelaxed = new ScriptC_TestModfRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inX;
        public Floaty outIret;
        public Floaty out;
    }

    private void checkModfFloatFloatFloat() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xd655dc05ccaef47l, false);
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocOutIret(outIret);
            script.forEach_testModfFloatFloatFloat(inX, out);
            verifyResultsModfFloatFloatFloat(inX, outIret, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocOutIret(outIret);
            scriptRelaxed.forEach_testModfFloatFloatFloat(inX, out);
            verifyResultsModfFloatFloatFloat(inX, outIret, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsModfFloatFloatFloat(Allocation inX, Allocation outIret, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 1];
        inX.copyTo(arrayInX);
        float[] arrayOutIret = new float[INPUTSIZE * 1];
        outIret.copyTo(arrayOutIret);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inX = arrayInX[i];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeModf(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.outIret.couldBe(arrayOutIret[i * 1 + j])) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outIret: ");
                    message.append(args.outIret.toString());
                    message.append("\n");
                    message.append("Actual   output outIret: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOutIret[i * 1 + j], Float.floatToRawIntBits(arrayOutIret[i * 1 + j]), arrayOutIret[i * 1 + j]));
                    if (!args.outIret.couldBe(arrayOutIret[i * 1 + j])) {
                        message.append(" FAIL");
                    }
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
                    assertTrue("Incorrect output for checkModfFloatFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkModfFloat2Float2Float2() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x2a1dc519fa163061l, false);
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocOutIret(outIret);
            script.forEach_testModfFloat2Float2Float2(inX, out);
            verifyResultsModfFloat2Float2Float2(inX, outIret, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat2Float2Float2: " + e.toString());
        }
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocOutIret(outIret);
            scriptRelaxed.forEach_testModfFloat2Float2Float2(inX, out);
            verifyResultsModfFloat2Float2Float2(inX, outIret, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat2Float2Float2: " + e.toString());
        }
    }

    private void verifyResultsModfFloat2Float2Float2(Allocation inX, Allocation outIret, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 2];
        inX.copyTo(arrayInX);
        float[] arrayOutIret = new float[INPUTSIZE * 2];
        outIret.copyTo(arrayOutIret);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inX = arrayInX[i * 2 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeModf(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.outIret.couldBe(arrayOutIret[i * 2 + j])) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outIret: ");
                    message.append(args.outIret.toString());
                    message.append("\n");
                    message.append("Actual   output outIret: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOutIret[i * 2 + j], Float.floatToRawIntBits(arrayOutIret[i * 2 + j]), arrayOutIret[i * 2 + j]));
                    if (!args.outIret.couldBe(arrayOutIret[i * 2 + j])) {
                        message.append(" FAIL");
                    }
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
                    assertTrue("Incorrect output for checkModfFloat2Float2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkModfFloat3Float3Float3() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x7e82a339fbf43202l, false);
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocOutIret(outIret);
            script.forEach_testModfFloat3Float3Float3(inX, out);
            verifyResultsModfFloat3Float3Float3(inX, outIret, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat3Float3Float3: " + e.toString());
        }
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocOutIret(outIret);
            scriptRelaxed.forEach_testModfFloat3Float3Float3(inX, out);
            verifyResultsModfFloat3Float3Float3(inX, outIret, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat3Float3Float3: " + e.toString());
        }
    }

    private void verifyResultsModfFloat3Float3Float3(Allocation inX, Allocation outIret, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        float[] arrayOutIret = new float[INPUTSIZE * 4];
        outIret.copyTo(arrayOutIret);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeModf(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.outIret.couldBe(arrayOutIret[i * 4 + j])) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outIret: ");
                    message.append(args.outIret.toString());
                    message.append("\n");
                    message.append("Actual   output outIret: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOutIret[i * 4 + j], Float.floatToRawIntBits(arrayOutIret[i * 4 + j]), arrayOutIret[i * 4 + j]));
                    if (!args.outIret.couldBe(arrayOutIret[i * 4 + j])) {
                        message.append(" FAIL");
                    }
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
                    assertTrue("Incorrect output for checkModfFloat3Float3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkModfFloat4Float4Float4() {
        Allocation inX = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0xd2e78159fdd233a3l, false);
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocOutIret(outIret);
            script.forEach_testModfFloat4Float4Float4(inX, out);
            verifyResultsModfFloat4Float4Float4(inX, outIret, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat4Float4Float4: " + e.toString());
        }
        try {
            Allocation outIret = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocOutIret(outIret);
            scriptRelaxed.forEach_testModfFloat4Float4Float4(inX, out);
            verifyResultsModfFloat4Float4Float4(inX, outIret, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testModfFloat4Float4Float4: " + e.toString());
        }
    }

    private void verifyResultsModfFloat4Float4Float4(Allocation inX, Allocation outIret, Allocation out, boolean relaxed) {
        float[] arrayInX = new float[INPUTSIZE * 4];
        inX.copyTo(arrayInX);
        float[] arrayOutIret = new float[INPUTSIZE * 4];
        outIret.copyTo(arrayOutIret);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inX = arrayInX[i * 4 + j];
                // Figure out what the outputs should have been.
                Floaty.setRelaxed(relaxed);
                CoreMathVerifier.computeModf(args);
                // Figure out what the outputs should have been.
                boolean valid = true;
                if (!args.outIret.couldBe(arrayOutIret[i * 4 + j])) {
                    valid = false;
                }
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inX: ");
                    message.append(String.format("%14.8g %8x %15a",
                            args.inX, Float.floatToRawIntBits(args.inX), args.inX));
                    message.append("\n");
                    message.append("Expected output outIret: ");
                    message.append(args.outIret.toString());
                    message.append("\n");
                    message.append("Actual   output outIret: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayOutIret[i * 4 + j], Float.floatToRawIntBits(arrayOutIret[i * 4 + j]), arrayOutIret[i * 4 + j]));
                    if (!args.outIret.couldBe(arrayOutIret[i * 4 + j])) {
                        message.append(" FAIL");
                    }
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
                    assertTrue("Incorrect output for checkModfFloat4Float4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testModf() {
        checkModfFloatFloatFloat();
        checkModfFloat2Float2Float2();
        checkModfFloat3Float3Float3();
        checkModfFloat4Float4Float4();
    }
}
