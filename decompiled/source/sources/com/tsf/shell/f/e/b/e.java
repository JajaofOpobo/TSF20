package com.tsf.shell.f.e.b;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class e {
    public static a a;
    public static f b;
    private static d h;
    private static d i;
    private static int[] j = new int[4];
    public static float[] c = new float[16];
    public static float[] d = new float[16];
    public static float[] e = new float[16];
    public static float[] f = new float[16];
    public static float[] g = new float[16];

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            r1 = 0
            com.tsf.shell.f.e.b.d r0 = com.tsf.shell.f.e.b.e.h
            if (r0 != 0) goto L2a
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gNC4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjAyMDQwMDE5ODg7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggLSAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCAtIDIuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xMjE1OTE2ODgyOwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMTg5OTg1ODUxOTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55KSkgKiAwLjIyMDQ1ODYwMzE7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyBCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54ICsgMi4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCArIDQuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4wMjA0MDAxOTg4OwogICAgICAgICAgIAogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cgp9Cg=="
            java.lang.String r2 = new java.lang.String     // Catch: com.android.a.a.a.b -> L7f
            byte[] r0 = r0.getBytes()     // Catch: com.android.a.a.a.b -> L7f
            byte[] r0 = com.android.a.a.a.a.a(r0)     // Catch: com.android.a.a.a.b -> L7f
            r2.<init>(r0)     // Catch: com.android.a.a.a.b -> L7f
            java.lang.String r0 = new java.lang.String     // Catch: com.android.a.a.a.b -> La2
            byte[] r3 = r3.getBytes()     // Catch: com.android.a.a.a.b -> La2
            byte[] r3 = com.android.a.a.a.a.a(r3)     // Catch: com.android.a.a.a.b -> La2
            r0.<init>(r3)     // Catch: com.android.a.a.a.b -> La2
        L23:
            com.tsf.shell.f.e.b.d r3 = new com.tsf.shell.f.e.b.d
            r3.<init>(r2, r0)
            com.tsf.shell.f.e.b.e.h = r3
        L2a:
            com.tsf.shell.f.e.b.d r0 = com.tsf.shell.f.e.b.e.i
            if (r0 != 0) goto L53
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgkgIAoJICAJICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIDQuMCpCQkJCQkIpKSAqIDAuMDIwNDAwMTk4ODsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55IC0gMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgLSAyLjAqQkJCQkJCKSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIEJCQkJCQikpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMjIwNDU4NjAzMTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgQkJCQkJCKSkgKiAwLjE4OTk4NTg1MTk7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSArIDIuMCpCQkJCQkIpKSAqIDAuMTIxNTkxNjg4MjsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgKyA0LjAqQkJCQkJCKSkgKiAwLjAyMDQwMDE5ODg7CgogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cn0K"
            java.lang.String r2 = new java.lang.String     // Catch: com.android.a.a.a.b -> L88
            byte[] r0 = r0.getBytes()     // Catch: com.android.a.a.a.b -> L88
            byte[] r0 = com.android.a.a.a.a.a(r0)     // Catch: com.android.a.a.a.b -> L88
            r2.<init>(r0)     // Catch: com.android.a.a.a.b -> L88
            java.lang.String r0 = new java.lang.String     // Catch: com.android.a.a.a.b -> L9d
            byte[] r3 = r3.getBytes()     // Catch: com.android.a.a.a.b -> L9d
            byte[] r3 = com.android.a.a.a.a.a(r3)     // Catch: com.android.a.a.a.b -> L9d
            r0.<init>(r3)     // Catch: com.android.a.a.a.b -> L9d
        L4c:
            com.tsf.shell.f.e.b.d r3 = new com.tsf.shell.f.e.b.d
            r3.<init>(r2, r0)
            com.tsf.shell.f.e.b.e.i = r3
        L53:
            com.tsf.shell.f.e.b.f r0 = com.tsf.shell.f.e.b.e.b
            if (r0 != 0) goto L7e
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsgICAgICAKYXR0cmlidXRlIHZlYzIgVFRUVFRUOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBQUFBQUFA7ICAgICAgCnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBDQ0NDQ0M7ICAgICAgCnZhcnlpbmcgdmVjNCB2Q29sb3I7ICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKZ2xfUG9zaXRpb24gPSBNTU1NTU0gKiBQUFBQUFA7ICAgICAgCiB2VGV4dHVyZUNvb3JkID0gVFRUVFRUOyAgICAgIAogdkNvbG9yID0gQ0NDQ0NDOyAgICAgIAp9"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7CnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQwOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQxOwp2YXJ5aW5nIHZlYzQgdkNvbG9yOyAgICAgIAp1bmlmb3JtIGZsb2F0IExMTExMTDsKdm9pZCBtYWluKCkgewp2ZWM0IHRleENvbG9yQSA9ICB0ZXh0dXJlMkQoVFRUVFRUMCwgdlRleHR1cmVDb29yZCk7CnZlYzQgdGV4Q29sb3JCID0gIHRleHR1cmUyRChUVFRUVFQxLCB2VGV4dHVyZUNvb3JkKTsKZ2xfRnJhZ0NvbG9yID0gdkNvbG9yKm1peCh0ZXhDb2xvckEsIHRleENvbG9yQiwgTExMTExMKS5yZ2JhOwp9"
            java.lang.String r2 = new java.lang.String     // Catch: com.android.a.a.a.b -> L91
            byte[] r0 = r0.getBytes()     // Catch: com.android.a.a.a.b -> L91
            byte[] r0 = com.android.a.a.a.a.a(r0)     // Catch: com.android.a.a.a.b -> L91
            r2.<init>(r0)     // Catch: com.android.a.a.a.b -> L91
            java.lang.String r0 = new java.lang.String     // Catch: com.android.a.a.a.b -> L98
            byte[] r3 = r3.getBytes()     // Catch: com.android.a.a.a.b -> L98
            byte[] r3 = com.android.a.a.a.a.a(r3)     // Catch: com.android.a.a.a.b -> L98
            r0.<init>(r3)     // Catch: com.android.a.a.a.b -> L98
            r1 = r0
            r0 = r2
        L77:
            com.tsf.shell.f.e.b.f r2 = new com.tsf.shell.f.e.b.f
            r2.<init>(r0, r1)
            com.tsf.shell.f.e.b.e.b = r2
        L7e:
            return
        L7f:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L82:
            r2.printStackTrace()
            r2 = r0
            r0 = r1
            goto L23
        L88:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L8b:
            r2.printStackTrace()
            r2 = r0
            r0 = r1
            goto L4c
        L91:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L94:
            r2.printStackTrace()
            goto L77
        L98:
            r0 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L94
        L9d:
            r0 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L8b
        La2:
            r0 = move-exception
            r4 = r0
            r0 = r2
            r2 = r4
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.b.e.a():void");
    }

    public static void a(Context context, TextureElement textureElement, TextureElement textureElement2, TextureElement textureElement3, com.tsf.shell.f.a.a.a aVar) {
        GLES20.glGetIntegerv(2978, j, 0);
        int i2 = textureElement2.width;
        int i3 = textureElement2.height;
        b(i2, i3);
        System.currentTimeMillis();
        GLES20.glBindFramebuffer(36160, aVar.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement3.id, 0);
        a(textureElement.id, aVar.a, h, i2, i3);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindFramebuffer(36160, aVar.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement2.id, 0);
        a(textureElement3.id, aVar.a, i, i2, i3);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(j[0], j[1], j[2], j[3]);
    }

    private static void b(int i2, int i3) {
        GLES20.glUseProgram(h.a);
        h.a(1.0f / i2);
        GLES20.glUseProgram(i.a);
        i.a(1.0f / i3);
    }

    public static void a(int i2, int i3, d dVar, int i4, int i5) {
        Matrix.setIdentityM(g, 0);
        Matrix.setLookAtM(c, 0, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        GLES20.glViewport(0, 0, i4, i5);
        float f2 = i4 / i5;
        Matrix.frustumM(d, 0, -f2, f2, -1.0f, 1.0f, 1.0f, 10.0f);
        Matrix.multiplyMM(e, 0, d, 0, c, 0);
        GLES20.glUseProgram(dVar.a);
        if (a == null) {
            a = new a();
        }
        a.a(i2);
        a.a(dVar);
        a.a(i4, i5);
        a.a();
    }

    public static TextureElement a(int i2, int i3, TextureElement textureElement) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        textureElement.id = i4;
        textureElement.width = i2;
        textureElement.height = i3;
        return textureElement;
    }

    public static TextureElement a(int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        TextureElement textureElement = new TextureElement(i4, false);
        textureElement.width = i2;
        textureElement.height = i3;
        return textureElement;
    }

    /* loaded from: classes.dex */
    public static class a {
        protected FloatBuffer a;
        protected FloatBuffer b;
        private int c = 6;
        private int d = 6;
        private int e = -1;
        private d f;

        public a() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.c * 3 * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.a = allocateDirect.asFloatBuffer();
            this.a.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.c * 2 * 4);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.b = allocateDirect2.asFloatBuffer();
            this.b.position(0);
            b();
        }

        public void a(d dVar) {
            this.f = dVar;
        }

        public void a(int i) {
            this.e = i;
        }

        private void b() {
            this.a.put(new float[]{-this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, this.d, 0.0f, this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, -this.d, 0.0f});
            this.b.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            this.a.position(0);
            this.b.position(0);
        }

        public void a(float f, float f2) {
            float f3 = (f / f2) * 6.0f;
            this.a.put(new float[]{-f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, 6.0f, 0.0f, f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, -6.0f, 0.0f}).position(0);
        }

        public void a() {
            GLES20.glClear(16640);
            Matrix.multiplyMM(e.f, 0, e.e, 0, e.g, 0);
            GLES20.glUniformMatrix4fv(this.f.b, 1, false, e.f, 0);
            if (this.e != -1) {
                this.f.b(3, 5126, false, 0, this.a);
                this.f.a(2, 5126, false, 0, this.b);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.e);
                GLES20.glDrawArrays(4, 0, this.c);
                this.f.b();
                this.f.a();
                GLES20.glBindTexture(3553, 0);
            }
        }
    }
}
