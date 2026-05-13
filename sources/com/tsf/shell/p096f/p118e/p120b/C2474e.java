package com.tsf.shell.p096f.p118e.p120b;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.f.e.b.e */
/* loaded from: classes.dex */
public class C2474e {

    /* renamed from: a */
    public static C2475a f8136a;

    /* renamed from: b */
    public static C2476f f8137b;

    /* renamed from: h */
    private static C2473d f8143h;

    /* renamed from: i */
    private static C2473d f8144i;

    /* renamed from: j */
    private static int[] f8145j = new int[4];

    /* renamed from: c */
    public static float[] f8138c = new float[16];

    /* renamed from: d */
    public static float[] f8139d = new float[16];

    /* renamed from: e */
    public static float[] f8140e = new float[16];

    /* renamed from: f */
    public static float[] f8141f = new float[16];

    /* renamed from: g */
    public static float[] f8142g = new float[16];

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5491a() {
        /*
            r1 = 0
            com.tsf.shell.f.e.b.d r0 = com.tsf.shell.p096f.p118e.p120b.C2474e.f8143h
            if (r0 != 0) goto L2a
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gNC4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjAyMDQwMDE5ODg7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggLSAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCAtIDIuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xMjE1OTE2ODgyOwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMTg5OTg1ODUxOTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55KSkgKiAwLjIyMDQ1ODYwMzE7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyBCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54ICsgMi4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCArIDQuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4wMjA0MDAxOTg4OwogICAgICAgICAgIAogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cgp9Cg=="
            java.lang.String r2 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> L7f
            byte[] r0 = r0.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> L7f
            byte[] r0 = com.android.p021a.p022a.p023a.C0778a.m11051a(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L7f
            r2.<init>(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L7f
            java.lang.String r0 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> La2
            byte[] r3 = r3.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> La2
            byte[] r3 = com.android.p021a.p022a.p023a.C0778a.m11051a(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> La2
            r0.<init>(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> La2
        L23:
            com.tsf.shell.f.e.b.d r3 = new com.tsf.shell.f.e.b.d
            r3.<init>(r2, r0)
            com.tsf.shell.p096f.p118e.p120b.C2474e.f8143h = r3
        L2a:
            com.tsf.shell.f.e.b.d r0 = com.tsf.shell.p096f.p118e.p120b.C2474e.f8144i
            if (r0 != 0) goto L53
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgkgIAoJICAJICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIDQuMCpCQkJCQkIpKSAqIDAuMDIwNDAwMTk4ODsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55IC0gMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgLSAyLjAqQkJCQkJCKSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIEJCQkJCQikpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMjIwNDU4NjAzMTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgQkJCQkJCKSkgKiAwLjE4OTk4NTg1MTk7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSArIDIuMCpCQkJCQkIpKSAqIDAuMTIxNTkxNjg4MjsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgKyA0LjAqQkJCQkJCKSkgKiAwLjAyMDQwMDE5ODg7CgogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cn0K"
            java.lang.String r2 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> L88
            byte[] r0 = r0.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> L88
            byte[] r0 = com.android.p021a.p022a.p023a.C0778a.m11051a(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L88
            r2.<init>(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L88
            java.lang.String r0 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> L9d
            byte[] r3 = r3.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> L9d
            byte[] r3 = com.android.p021a.p022a.p023a.C0778a.m11051a(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L9d
            r0.<init>(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L9d
        L4c:
            com.tsf.shell.f.e.b.d r3 = new com.tsf.shell.f.e.b.d
            r3.<init>(r2, r0)
            com.tsf.shell.p096f.p118e.p120b.C2474e.f8144i = r3
        L53:
            com.tsf.shell.f.e.b.f r0 = com.tsf.shell.p096f.p118e.p120b.C2474e.f8137b
            if (r0 != 0) goto L7e
            java.lang.String r0 = "dW5pZm9ybSBtYXQ0IE1NTU1NTTsgICAgICAKYXR0cmlidXRlIHZlYzIgVFRUVFRUOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBQUFBQUFA7ICAgICAgCnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBDQ0NDQ0M7ICAgICAgCnZhcnlpbmcgdmVjNCB2Q29sb3I7ICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKZ2xfUG9zaXRpb24gPSBNTU1NTU0gKiBQUFBQUFA7ICAgICAgCiB2VGV4dHVyZUNvb3JkID0gVFRUVFRUOyAgICAgIAogdkNvbG9yID0gQ0NDQ0NDOyAgICAgIAp9"
            java.lang.String r3 = "cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7CnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQwOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQxOwp2YXJ5aW5nIHZlYzQgdkNvbG9yOyAgICAgIAp1bmlmb3JtIGZsb2F0IExMTExMTDsKdm9pZCBtYWluKCkgewp2ZWM0IHRleENvbG9yQSA9ICB0ZXh0dXJlMkQoVFRUVFRUMCwgdlRleHR1cmVDb29yZCk7CnZlYzQgdGV4Q29sb3JCID0gIHRleHR1cmUyRChUVFRUVFQxLCB2VGV4dHVyZUNvb3JkKTsKZ2xfRnJhZ0NvbG9yID0gdkNvbG9yKm1peCh0ZXhDb2xvckEsIHRleENvbG9yQiwgTExMTExMKS5yZ2JhOwp9"
            java.lang.String r2 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> L91
            byte[] r0 = r0.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> L91
            byte[] r0 = com.android.p021a.p022a.p023a.C0778a.m11051a(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L91
            r2.<init>(r0)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L91
            java.lang.String r0 = new java.lang.String     // Catch: com.android.p021a.p022a.p023a.C0779b -> L98
            byte[] r3 = r3.getBytes()     // Catch: com.android.p021a.p022a.p023a.C0779b -> L98
            byte[] r3 = com.android.p021a.p022a.p023a.C0778a.m11051a(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L98
            r0.<init>(r3)     // Catch: com.android.p021a.p022a.p023a.C0779b -> L98
            r1 = r0
            r0 = r2
        L77:
            com.tsf.shell.f.e.b.f r2 = new com.tsf.shell.f.e.b.f
            r2.<init>(r0, r1)
            com.tsf.shell.p096f.p118e.p120b.C2474e.f8137b = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p118e.p120b.C2474e.m5491a():void");
    }

    /* renamed from: a */
    public static void m5487a(Context context, TextureElement textureElement, TextureElement textureElement2, TextureElement textureElement3, C2273a c2273a) {
        GLES20.glGetIntegerv(2978, f8145j, 0);
        int i = textureElement2.width;
        int i2 = textureElement2.height;
        m5486b(i, i2);
        System.currentTimeMillis();
        GLES20.glBindFramebuffer(36160, c2273a.f7428a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement3.f2529id, 0);
        m5488a(textureElement.f2529id, c2273a.f7428a, f8143h, i, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindFramebuffer(36160, c2273a.f7428a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement2.f2529id, 0);
        m5488a(textureElement3.f2529id, c2273a.f7428a, f8144i, i, i2);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(f8145j[0], f8145j[1], f8145j[2], f8145j[3]);
    }

    /* renamed from: b */
    private static void m5486b(int i, int i2) {
        GLES20.glUseProgram(f8143h.f8131a);
        f8143h.m5497a(1.0f / i);
        GLES20.glUseProgram(f8144i.f8131a);
        f8144i.m5497a(1.0f / i2);
    }

    /* renamed from: a */
    public static void m5488a(int i, int i2, C2473d c2473d, int i3, int i4) {
        Matrix.setIdentityM(f8142g, 0);
        Matrix.setLookAtM(f8138c, 0, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        GLES20.glViewport(0, 0, i3, i4);
        float f = i3 / i4;
        Matrix.frustumM(f8139d, 0, -f, f, -1.0f, 1.0f, 1.0f, 10.0f);
        Matrix.multiplyMM(f8140e, 0, f8139d, 0, f8138c, 0);
        GLES20.glUseProgram(c2473d.f8131a);
        if (f8136a == null) {
            f8136a = new C2475a();
        }
        f8136a.m5483a(i);
        f8136a.m5482a(c2473d);
        f8136a.m5484a(i3, i4);
        f8136a.m5485a();
    }

    /* renamed from: a */
    public static TextureElement m5489a(int i, int i2, TextureElement textureElement) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        textureElement.f2529id = i3;
        textureElement.width = i;
        textureElement.height = i2;
        return textureElement;
    }

    /* renamed from: a */
    public static TextureElement m5490a(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        TextureElement textureElement = new TextureElement(i3, false);
        textureElement.width = i;
        textureElement.height = i2;
        return textureElement;
    }

    /* renamed from: com.tsf.shell.f.e.b.e$a */
    /* loaded from: classes.dex */
    public static class C2475a {

        /* renamed from: a */
        protected FloatBuffer f8146a;

        /* renamed from: b */
        protected FloatBuffer f8147b;

        /* renamed from: c */
        private int f8148c = 6;

        /* renamed from: d */
        private int f8149d = 6;

        /* renamed from: e */
        private int f8150e = -1;

        /* renamed from: f */
        private C2473d f8151f;

        public C2475a() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f8148c * 3 * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f8146a = allocateDirect.asFloatBuffer();
            this.f8146a.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f8148c * 2 * 4);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.f8147b = allocateDirect2.asFloatBuffer();
            this.f8147b.position(0);
            m5481b();
        }

        /* renamed from: a */
        public void m5482a(C2473d c2473d) {
            this.f8151f = c2473d;
        }

        /* renamed from: a */
        public void m5483a(int i) {
            this.f8150e = i;
        }

        /* renamed from: b */
        private void m5481b() {
            this.f8146a.put(new float[]{-this.f8149d, this.f8149d, 0.0f, -this.f8149d, -this.f8149d, 0.0f, this.f8149d, this.f8149d, 0.0f, this.f8149d, this.f8149d, 0.0f, -this.f8149d, -this.f8149d, 0.0f, this.f8149d, -this.f8149d, 0.0f});
            this.f8147b.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            this.f8146a.position(0);
            this.f8147b.position(0);
        }

        /* renamed from: a */
        public void m5484a(float f, float f2) {
            float f3 = (f / f2) * 6.0f;
            this.f8146a.put(new float[]{-f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, 6.0f, 0.0f, f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, -6.0f, 0.0f}).position(0);
        }

        /* renamed from: a */
        public void m5485a() {
            GLES20.glClear(16640);
            Matrix.multiplyMM(C2474e.f8141f, 0, C2474e.f8140e, 0, C2474e.f8142g, 0);
            GLES20.glUniformMatrix4fv(this.f8151f.f8132b, 1, false, C2474e.f8141f, 0);
            if (this.f8150e != -1) {
                this.f8151f.m5492b(3, 5126, false, 0, this.f8146a);
                this.f8151f.m5496a(2, 5126, false, 0, this.f8147b);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f8150e);
                GLES20.glDrawArrays(4, 0, this.f8148c);
                this.f8151f.m5493b();
                this.f8151f.m5498a();
                GLES20.glBindTexture(3553, 0);
            }
        }
    }
}
