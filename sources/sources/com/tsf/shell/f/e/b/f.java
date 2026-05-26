package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.shader.Shader;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends Shader {
    public String a;
    public String b;
    private int c;
    private int d;
    private int e;
    private int f;

    public f(String str, String str2) {
        this.a = "";
        this.b = "";
        this.a = str;
        this.b = str2;
        a();
        this.d = GLES20.glGetUniformLocation(this.id, "TTTTTT0");
        this.e = GLES20.glGetUniformLocation(this.id, "TTTTTT1");
        this.c = GLES20.glGetUniformLocation(this.id, "LLLLLL");
    }

    public void a(float f) {
        GLES20.glUniform1i(this.d, 0);
        GLES20.glUniform1i(this.e, 1);
        GLES20.glUniform1f(this.c, f);
    }

    public void a(int i, int i2, int i3, int i4) {
        float f = i / 255.0f;
        GLES20.glVertexAttrib4f(this.f, (i2 / 255.0f) * f, (i3 / 255.0f) * f, (i4 / 255.0f) * f, f);
    }

    private void a() {
        this.id = a(this.a, this.b);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.id, "PPPPPP");
        this.maTextureHandle = GLES20.glGetAttribLocation(this.id, "TTTTTT");
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.id, "MMMMMM");
        this.f = GLES20.glGetAttribLocation(this.id, "CCCCCC");
        if (this.f == -1) {
            throw new RuntimeException("Could not get attrib location for aColor");
        }
    }

    public static int a(String str, String str2) {
        int iA;
        int iA2 = a(35633, str);
        if (iA2 == 0 || (iA = a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iA2);
            GLES20.glAttachShader(iGlCreateProgram, iA);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    private static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }
}
