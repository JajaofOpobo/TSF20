package com.tsf.shell.p096f.p118e.p120b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.shader.Shader;
/* renamed from: com.tsf.shell.f.e.b.f */
/* loaded from: classes.dex */
public class C2476f extends Shader {

    /* renamed from: a */
    public String f8152a;

    /* renamed from: b */
    public String f8153b;

    /* renamed from: c */
    private int f8154c;

    /* renamed from: d */
    private int f8155d;

    /* renamed from: e */
    private int f8156e;

    /* renamed from: f */
    private int f8157f;

    public C2476f(String str, String str2) {
        this.f8152a = "";
        this.f8153b = "";
        this.f8152a = str;
        this.f8153b = str2;
        m5480a();
        this.f8155d = GLES20.glGetUniformLocation(this.f3427id, "TTTTTT0");
        this.f8156e = GLES20.glGetUniformLocation(this.f3427id, "TTTTTT1");
        this.f8154c = GLES20.glGetUniformLocation(this.f3427id, "LLLLLL");
    }

    /* renamed from: a */
    public void m5479a(float f) {
        GLES20.glUniform1i(this.f8155d, 0);
        GLES20.glUniform1i(this.f8156e, 1);
        GLES20.glUniform1f(this.f8154c, f);
    }

    /* renamed from: a */
    public void m5478a(int i, int i2, int i3, int i4) {
        float f = i / 255.0f;
        GLES20.glVertexAttrib4f(this.f8157f, (i2 / 255.0f) * f, (i3 / 255.0f) * f, (i4 / 255.0f) * f, f);
    }

    /* renamed from: a */
    private void m5480a() {
        this.f3427id = m5476a(this.f8152a, this.f8153b);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.f3427id, "PPPPPP");
        this.maTextureHandle = GLES20.glGetAttribLocation(this.f3427id, "TTTTTT");
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.f3427id, "MMMMMM");
        this.f8157f = GLES20.glGetAttribLocation(this.f3427id, "CCCCCC");
        if (this.f8157f == -1) {
            throw new RuntimeException("Could not get attrib location for aColor");
        }
    }

    /* renamed from: a */
    public static int m5476a(String str, String str2) {
        int m5477a;
        int m5477a2 = m5477a(35633, str);
        if (m5477a2 == 0 || (m5477a = m5477a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, m5477a2);
            GLES20.glAttachShader(glCreateProgram, m5477a);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    /* renamed from: a */
    private static int m5477a(int i, String str) {
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
