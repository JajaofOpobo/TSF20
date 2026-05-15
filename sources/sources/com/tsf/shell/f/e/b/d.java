package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r5 = 1
            r4 = -1
            r0 = 0
            r1 = 35633(0x8b31, float:4.9932E-41)
            int r2 = a(r1, r7)
            if (r2 != 0) goto Ld
        Lc:
            return r0
        Ld:
            r1 = 35632(0x8b30, float:4.9931E-41)
            int r3 = a(r1, r8)
            if (r3 == 0) goto Lc
            int r1 = android.opengl.GLES20.glCreateProgram()
            r6.a = r1
            if (r1 == 0) goto L52
            android.opengl.GLES20.glAttachShader(r1, r2)
            android.opengl.GLES20.glAttachShader(r1, r3)
            android.opengl.GLES20.glLinkProgram(r1)
            int[] r2 = new int[r5]
            r3 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r1, r3, r2, r0)
            r2 = r2[r0]
            if (r2 == r5) goto L52
            android.opengl.GLES20.glDeleteProgram(r1)
        L36:
            java.lang.String r1 = "MMMMMM"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            r6.b = r1
            int r1 = r6.b
            if (r1 != r4) goto L42
        L42:
            java.lang.String r1 = "PPPPPP"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            r6.c = r1
            int r1 = r6.c
            if (r1 != r4) goto L4e
        L4e:
            android.opengl.GLES20.glUseProgram(r0)
            goto Lc
        L52:
            r0 = r1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.b.d.a(java.lang.String, java.lang.String):int");
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
