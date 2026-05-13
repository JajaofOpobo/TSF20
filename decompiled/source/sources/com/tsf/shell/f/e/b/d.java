package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import java.nio.Buffer;
/* loaded from: classes.dex */
public final class d {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public d(String str, String str2) {
        a(str, str2);
        this.d = GLES20.glGetAttribLocation(this.a, "TTTTTT");
        if (this.d == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.e = GLES20.glGetUniformLocation(this.a, "BBBBBB");
        if (this.e == -1) {
            throw new RuntimeException("Could not get attrib location for blurSize");
        }
    }

    public void a(float f) {
        GLES20.glUniform1f(this.e, f);
    }

    public void a(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, i, i2, z, i3, buffer);
    }

    public void a() {
        GLES20.glDisableVertexAttribArray(this.d);
    }

    public void b(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.c);
        GLES20.glVertexAttribPointer(this.c, i, i2, z, i3, buffer);
    }

    public void b() {
        GLES20.glDisableVertexAttribArray(this.c);
    }

    public int a(String str, String str2) {
        int a;
        int i = 0;
        int a2 = a(35633, str);
        if (a2 != 0 && (a = a(35632, str2)) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.a = glCreateProgram;
            if (glCreateProgram != 0) {
                GLES20.glAttachShader(glCreateProgram, a2);
                GLES20.glAttachShader(glCreateProgram, a);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    this.b = GLES20.glGetUniformLocation(i, "MMMMMM");
                    if (this.b != -1) {
                    }
                    this.c = GLES20.glGetAttribLocation(i, "PPPPPP");
                    if (this.c != -1) {
                    }
                    GLES20.glUseProgram(i);
                }
            }
            i = glCreateProgram;
            this.b = GLES20.glGetUniformLocation(i, "MMMMMM");
            if (this.b != -1) {
            }
            this.c = GLES20.glGetAttribLocation(i, "PPPPPP");
            if (this.c != -1) {
            }
            GLES20.glUseProgram(i);
        }
        return i;
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
        }
        return glCreateShader;
    }
}
