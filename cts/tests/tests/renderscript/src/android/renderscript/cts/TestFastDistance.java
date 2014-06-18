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

public class TestFastDistance extends RSBaseCompute {

    private ScriptC_TestFastDistance script;
    private ScriptC_TestFastDistanceRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestFastDistance(mRS);
        scriptRelaxed = new ScriptC_TestFastDistanceRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inLhs;
        public float inRhs;
        public Floaty out;
    }

    private void checkFastDistanceFloatFloatFloat() {
        Allocation inLhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xfe7e5e843bff0cb7l, false);
        Allocation inRhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 1, 0xfe7e5e843bff380dl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRhs(inRhs);
            script.forEach_testFastDistanceFloatFloatFloat(inLhs, out);
            verifyResultsFastDistanceFloatFloatFloat(inLhs, inRhs, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRhs(inRhs);
            scriptRelaxed.forEach_testFastDistanceFloatFloatFloat(inLhs, out);
            verifyResultsFastDistanceFloatFloatFloat(inLhs, inRhs, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloatFloatFloat(Allocation inLhs, Allocation inRhs, Allocation out, boolean relaxed) {
        float[] arrayInLhs = new float[INPUTSIZE * 1];
        inLhs.copyTo(arrayInLhs);
        float[] arrayInRhs = new float[INPUTSIZE * 1];
        inRhs.copyTo(arrayInRhs);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
            // Create the appropriate sized arrays in args
            // Fill args with the input values
            args.inLhs = arrayInLhs[i];
            args.inRhs = arrayInRhs[i];
            Floaty.setRelaxed(relaxed);
            CoreMathVerifier.computeFastDistance(args);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                message.append("Input inLhs: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayInLhs[i], Float.floatToRawIntBits(arrayInLhs[i]), arrayInLhs[i]));
                message.append("\n");
                message.append("Input inRhs: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayInRhs[i], Float.floatToRawIntBits(arrayInRhs[i]), arrayInRhs[i]));
                message.append("\n");
                message.append("Expected output out: ");
                message.append(args.out.toString());
                message.append("\n");
                message.append("Actual   output out: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayOut[i], Float.floatToRawIntBits(arrayOut[i]), arrayOut[i]));
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloatFloatFloat" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public class ArgumentsFloatNFloatNFloat {
        public float[] inLhs;
        public float[] inRhs;
        public Floaty out;
    }

    private void checkFastDistanceFloat2Float2Float() {
        Allocation inLhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x422e8a00560ac063l, false);
        Allocation inRhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 2, 0x422e8a00560aebb9l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRhs(inRhs);
            script.forEach_testFastDistanceFloat2Float2Float(inLhs, out);
            verifyResultsFastDistanceFloat2Float2Float(inLhs, inRhs, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat2Float2Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRhs(inRhs);
            scriptRelaxed.forEach_testFastDistanceFloat2Float2Float(inLhs, out);
            verifyResultsFastDistanceFloat2Float2Float(inLhs, inRhs, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat2Float2Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat2Float2Float(Allocation inLhs, Allocation inRhs, Allocation out, boolean relaxed) {
        float[] arrayInLhs = new float[INPUTSIZE * 2];
        inLhs.copyTo(arrayInLhs);
        float[] arrayInRhs = new float[INPUTSIZE * 2];
        inRhs.copyTo(arrayInRhs);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLhs = new float[2];
            args.inRhs = new float[2];
            // Fill args with the input values
            for (int j = 0; j < 2 ; j++) {
                args.inLhs[j] = arrayInLhs[i * 2 + j];
            }
            for (int j = 0; j < 2 ; j++) {
                args.inRhs[j] = arrayInRhs[i * 2 + j];
            }
            Floaty.setRelaxed(relaxed);
            CoreMathVerifier.computeFastDistance(args);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inLhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInLhs[i * 2 + j], Float.floatToRawIntBits(arrayInLhs[i * 2 + j]), arrayInLhs[i * 2 + j]));
                    message.append("\n");
                }
                for (int j = 0; j < 2 ; j++) {
                    message.append("Input inRhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInRhs[i * 2 + j], Float.floatToRawIntBits(arrayInRhs[i * 2 + j]), arrayInRhs[i * 2 + j]));
                    message.append("\n");
                }
                message.append("Expected output out: ");
                message.append(args.out.toString());
                message.append("\n");
                message.append("Actual   output out: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayOut[i], Float.floatToRawIntBits(arrayOut[i]), arrayOut[i]));
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat2Float2Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkFastDistanceFloat3Float3Float() {
        Allocation inLhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x6f1fd960a620dbbdl, false);
        Allocation inRhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x6f1fd960a6210713l, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRhs(inRhs);
            script.forEach_testFastDistanceFloat3Float3Float(inLhs, out);
            verifyResultsFastDistanceFloat3Float3Float(inLhs, inRhs, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat3Float3Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRhs(inRhs);
            scriptRelaxed.forEach_testFastDistanceFloat3Float3Float(inLhs, out);
            verifyResultsFastDistanceFloat3Float3Float(inLhs, inRhs, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat3Float3Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat3Float3Float(Allocation inLhs, Allocation inRhs, Allocation out, boolean relaxed) {
        float[] arrayInLhs = new float[INPUTSIZE * 4];
        inLhs.copyTo(arrayInLhs);
        float[] arrayInRhs = new float[INPUTSIZE * 4];
        inRhs.copyTo(arrayInRhs);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLhs = new float[3];
            args.inRhs = new float[3];
            // Fill args with the input values
            for (int j = 0; j < 3 ; j++) {
                args.inLhs[j] = arrayInLhs[i * 4 + j];
            }
            for (int j = 0; j < 3 ; j++) {
                args.inRhs[j] = arrayInRhs[i * 4 + j];
            }
            Floaty.setRelaxed(relaxed);
            CoreMathVerifier.computeFastDistance(args);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inLhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInLhs[i * 4 + j], Float.floatToRawIntBits(arrayInLhs[i * 4 + j]), arrayInLhs[i * 4 + j]));
                    message.append("\n");
                }
                for (int j = 0; j < 3 ; j++) {
                    message.append("Input inRhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInRhs[i * 4 + j], Float.floatToRawIntBits(arrayInRhs[i * 4 + j]), arrayInRhs[i * 4 + j]));
                    message.append("\n");
                }
                message.append("Expected output out: ");
                message.append(args.out.toString());
                message.append("\n");
                message.append("Actual   output out: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayOut[i], Float.floatToRawIntBits(arrayOut[i]), arrayOut[i]));
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat3Float3Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    private void checkFastDistanceFloat4Float4Float() {
        Allocation inLhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x9c1128c0f636f717l, false);
        Allocation inRhs = createRandomAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x9c1128c0f637226dl, false);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInRhs(inRhs);
            script.forEach_testFastDistanceFloat4Float4Float(inLhs, out);
            verifyResultsFastDistanceFloat4Float4Float(inLhs, inRhs, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat4Float4Float: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInRhs(inRhs);
            scriptRelaxed.forEach_testFastDistanceFloat4Float4Float(inLhs, out);
            verifyResultsFastDistanceFloat4Float4Float(inLhs, inRhs, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testFastDistanceFloat4Float4Float: " + e.toString());
        }
    }

    private void verifyResultsFastDistanceFloat4Float4Float(Allocation inLhs, Allocation inRhs, Allocation out, boolean relaxed) {
        float[] arrayInLhs = new float[INPUTSIZE * 4];
        inLhs.copyTo(arrayInLhs);
        float[] arrayInRhs = new float[INPUTSIZE * 4];
        inRhs.copyTo(arrayInRhs);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            ArgumentsFloatNFloatNFloat args = new ArgumentsFloatNFloatNFloat();
            // Create the appropriate sized arrays in args
            args.inLhs = new float[4];
            args.inRhs = new float[4];
            // Fill args with the input values
            for (int j = 0; j < 4 ; j++) {
                args.inLhs[j] = arrayInLhs[i * 4 + j];
            }
            for (int j = 0; j < 4 ; j++) {
                args.inRhs[j] = arrayInRhs[i * 4 + j];
            }
            Floaty.setRelaxed(relaxed);
            CoreMathVerifier.computeFastDistance(args);

            // Compare the expected outputs to the actual values returned by RS.
            boolean valid = true;
            if (!args.out.couldBe(arrayOut[i])) {
                valid = false;
            }
            if (!valid) {
                StringBuilder message = new StringBuilder();
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inLhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInLhs[i * 4 + j], Float.floatToRawIntBits(arrayInLhs[i * 4 + j]), arrayInLhs[i * 4 + j]));
                    message.append("\n");
                }
                for (int j = 0; j < 4 ; j++) {
                    message.append("Input inRhs: ");
                    message.append(String.format("%14.8g %8x %15a",
                            arrayInRhs[i * 4 + j], Float.floatToRawIntBits(arrayInRhs[i * 4 + j]), arrayInRhs[i * 4 + j]));
                    message.append("\n");
                }
                message.append("Expected output out: ");
                message.append(args.out.toString());
                message.append("\n");
                message.append("Actual   output out: ");
                message.append(String.format("%14.8g %8x %15a",
                        arrayOut[i], Float.floatToRawIntBits(arrayOut[i]), arrayOut[i]));
                if (!args.out.couldBe(arrayOut[i])) {
                    message.append(" FAIL");
                }
                message.append("\n");
                assertTrue("Incorrect output for checkFastDistanceFloat4Float4Float" +
                        (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
            }
        }
    }

    public void testFastDistance() {
        checkFastDistanceFloatFloatFloat();
        checkFastDistanceFloat2Float2Float();
        checkFastDistanceFloat3Float3Float();
        checkFastDistanceFloat4Float4Float();
    }
}