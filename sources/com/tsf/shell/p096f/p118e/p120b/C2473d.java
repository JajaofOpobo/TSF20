package com.tsf.shell.p096f.p118e.p120b;

import android.opengl.GLES20;
import java.nio.Buffer;
/* renamed from: com.tsf.shell.f.e.b.d */
/* loaded from: classes.dex */
public final class C2473d {

    /* renamed from: a */
    public int f8131a;

    /* renamed from: b */
    public int f8132b;

    /* renamed from: c */
    public int f8133c;

    /* renamed from: d */
    public int f8134d;

    /* renamed from: e */
    public int f8135e;

    public C2473d(String str, String str2) {
        m5494a(str, str2);
        this.f8134d = GLES20.glGetAttribLocation(this.f8131a, "TTTTTT");
        if (this.f8134d == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f8135e = GLES20.glGetUniformLocation(this.f8131a, "BBBBBB");
        if (this.f8135e == -1) {
            throw new RuntimeException("Could not get attrib location for blurSize");
        }
    }

    /* renamed from: a */
    public void m5497a(float f) {
        GLES20.glUniform1f(this.f8135e, f);
    }

    /* renamed from: a */
    public void m5496a(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.f8134d);
        GLES20.glVertexAttribPointer(this.f8134d, i, i2, z, i3, buffer);
    }

    /* renamed from: a */
    public void m5498a() {
        GLES20.glDisableVertexAttribArray(this.f8134d);
    }

    /* renamed from: b */
    public void m5492b(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.f8133c);
        GLES20.glVertexAttribPointer(this.f8133c, i, i2, z, i3, buffer);
    }

    /* renamed from: b */
    public void m5493b() {
        GLES20.glDisableVertexAttribArray(this.f8133c);
    }

    /* renamed from: a */
    public int m5494a(String str, String str2) {
        int m5495a;
        int i = 0;
        int m5495a2 = m5495a(35633, str);
        if (m5495a2 != 0 && (m5495a = m5495a(35632, str2)) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.f8131a = glCreateProgram;
            if (glCreateProgram != 0) {
                GLES20.glAttachShader(glCreateProgram, m5495a2);
                GLES20.glAttachShader(glCreateProgram, m5495a);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    this.f8132b = GLES20.glGetUniformLocation(i, "MMMMMM");
                    if (this.f8132b != -1) {
                    }
                    this.f8133c = GLES20.glGetAttribLocation(i, "PPPPPP");
                    if (this.f8133c != -1) {
                    }
                    GLES20.glUseProgram(i);
                }
            }
            i = glCreateProgram;
            this.f8132b = GLES20.glGetUniformLocation(i, "MMMMMM");
            if (this.f8132b != -1) {
            }
            this.f8133c = GLES20.glGetAttribLocation(i, "PPPPPP");
            if (this.f8133c != -1) {
            }
            GLES20.glUseProgram(i);
        }
        return i;
    }

    /* renamed from: a */
    private static int m5495a(int i, String str) {
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
