package com.censivn.C3DEngine.common.renderer;

import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.Color4;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
/* loaded from: classes.dex */
public class MatrixStack {
    private static final int COLOR_SIZE = 5;
    private static final int DEFAULT_MAX_DEPTH = 32;
    private static final int MATRIX_SIZE = 16;
    public static float[] color;
    private static float[] mTemp;
    public static float[] matrix;
    public static float[] rMVPMatrix;
    public static float[] rProjMatrix;
    public static float[] rSceneMatrix;
    public static float[] rVMatrix;
    public static ColorInfo tempColor = new ColorInfo();
    public static int topColorIndex;
    public static int topIndex;

    /* loaded from: classes.dex */
    public static class ColorInfo {
        public float alpha;
        public float colorA;
        public float colorB;
        public float colorG;
        public float colorR;
    }

    public static void init() {
        rSceneMatrix = new float[16];
        rMVPMatrix = new float[16];
        rProjMatrix = new float[16];
        rVMatrix = new float[16];
        commonInit(32);
    }

    private static void commonInit(int i) {
        matrix = new float[i * 16];
        color = new float[i * 5];
        color[0] = 1.0f;
        color[1] = 1.0f;
        color[2] = 1.0f;
        color[3] = 1.0f;
        color[4] = 1.0f;
        mTemp = new float[32];
        glLoadIdentity();
    }

    public static void glFrustumf(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.frustumM(matrix, topIndex, f, f2, f3, f4, f5, f6);
    }

    public static void glFrustumx(int i, int i2, int i3, int i4, int i5, int i6) {
        glFrustumf(fixedToFloat(i), fixedToFloat(i2), fixedToFloat(i3), fixedToFloat(i4), fixedToFloat(i5), fixedToFloat(i6));
    }

    public static void glLoadIdentity() {
        Matrix.setIdentityM(matrix, topIndex);
    }

    public static void glLoadMatrixf(float[] fArr, int i) {
        System.arraycopy(fArr, i, matrix, topIndex, 16);
    }

    public static void glLoadMatrixf(FloatBuffer floatBuffer) {
        floatBuffer.get(matrix, topIndex, 16);
    }

    public static void glLoadMatrixx(int[] iArr, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            matrix[topIndex + i2] = fixedToFloat(iArr[i + i2]);
        }
    }

    public static void glLoadMatrixx(IntBuffer intBuffer) {
        for (int i = 0; i < 16; i++) {
            matrix[topIndex + i] = fixedToFloat(intBuffer.get());
        }
    }

    public static void glMultMatrixf(float[] fArr, int i) {
        System.arraycopy(matrix, topIndex, mTemp, 0, 16);
        Matrix.multiplyMM(matrix, topIndex, mTemp, 0, fArr, i);
    }

    public static void glMultMatrixf(FloatBuffer floatBuffer) {
        floatBuffer.get(mTemp, 16, 16);
        glMultMatrixf(mTemp, 16);
    }

    public static void glMultMatrixx(int[] iArr, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            mTemp[i2 + 16] = fixedToFloat(iArr[i + i2]);
        }
        glMultMatrixf(mTemp, 16);
    }

    public static void glMultMatrixx(IntBuffer intBuffer) {
        for (int i = 0; i < 16; i++) {
            mTemp[i + 16] = fixedToFloat(intBuffer.get());
        }
        glMultMatrixf(mTemp, 16);
    }

    public static void glOrthof(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(matrix, topIndex, f, f2, f3, f4, f5, f6);
    }

    public static void glOrthox(int i, int i2, int i3, int i4, int i5, int i6) {
        glOrthof(fixedToFloat(i), fixedToFloat(i2), fixedToFloat(i3), fixedToFloat(i4), fixedToFloat(i5), fixedToFloat(i6));
    }

    public static void glPopMatrix() {
        preflight_adjust(-1);
        adjust(-1);
    }

    public static void glPushMatrix() {
        preflight_adjust(1);
        System.arraycopy(color, topColorIndex, color, topColorIndex + 5, 5);
        System.arraycopy(matrix, topIndex, matrix, topIndex + 16, 16);
        adjust(1);
    }

    public static void glColor(float f, Color4 color4) {
        if (color4 == null) {
            color[topColorIndex] = color[topColorIndex] * (f / 255.0f);
            color[topColorIndex + 1] = color[topColorIndex + 1];
            color[topColorIndex + 2] = color[topColorIndex + 2];
            color[topColorIndex + 3] = color[topColorIndex + 3];
            color[topColorIndex + 4] = color[topColorIndex + 4];
            return;
        }
        color[topColorIndex] = color[topColorIndex] * (f / 255.0f);
        color[topColorIndex + 1] = color[topColorIndex + 1] * color4.glA;
        color[topColorIndex + 2] = color[topColorIndex + 2] * color4.glR;
        color[topColorIndex + 3] = color[topColorIndex + 3] * color4.glG;
        color[topColorIndex + 4] = color[topColorIndex + 4] * color4.glB;
    }

    public static ColorInfo glColor() {
        tempColor.alpha = color[topColorIndex];
        tempColor.colorA = color[topColorIndex + 1];
        tempColor.colorR = color[topColorIndex + 2];
        tempColor.colorG = color[topColorIndex + 3];
        tempColor.colorB = color[topColorIndex + 4];
        return tempColor;
    }

    public static void glRotatef(float f, float f2, float f3, float f4) {
        Matrix.setRotateM(mTemp, 0, f, f2, f3, f4);
        System.arraycopy(matrix, topIndex, mTemp, 16, 16);
        Matrix.multiplyMM(matrix, topIndex, mTemp, 16, mTemp, 0);
    }

    public static void glRotatex(int i, int i2, int i3, int i4) {
        glRotatef(i, fixedToFloat(i2), fixedToFloat(i3), fixedToFloat(i4));
    }

    public static void glScalef(float f, float f2, float f3) {
        Matrix.scaleM(matrix, topIndex, f, f2, f3);
    }

    public static void glScalex(int i, int i2, int i3) {
        glScalef(fixedToFloat(i), fixedToFloat(i2), fixedToFloat(i3));
    }

    public static void glTranslatef(float f, float f2, float f3) {
        Matrix.translateM(matrix, topIndex, f, f2, f3);
    }

    public static void glTranslatex(int i, int i2, int i3) {
        glTranslatef(fixedToFloat(i), fixedToFloat(i2), fixedToFloat(i3));
    }

    public static void getMatrix(float[] fArr, int i) {
        System.arraycopy(matrix, topIndex, fArr, i, 16);
    }

    private static float fixedToFloat(int i) {
        return i * 1.5258789E-5f;
    }

    private static void preflight_adjust(int i) {
        int i2 = topIndex + (i * 16);
        if (i2 < 0) {
            throw new IllegalArgumentException("stack underflow");
        }
        if (i2 + 16 > matrix.length) {
            throw new IllegalArgumentException("stack overflow");
        }
    }

    private static void adjust(int i) {
        topIndex += i * 16;
        topColorIndex += i * 5;
    }
}
