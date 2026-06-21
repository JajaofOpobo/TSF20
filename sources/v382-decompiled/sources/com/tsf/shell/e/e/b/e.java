package com.tsf.shell.e.e.b;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public class e {
    public static f a;
    public static g b;
    public static float[] c = new float[16];
    public static float[] d = new float[16];
    public static float[] e = new float[16];
    public static float[] f = new float[16];
    public static float[] g = new float[16];
    private static d h;
    private static d i;

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a() {
        com.a.a.a.a.b bVar;
        String str;
        com.a.a.a.a.b bVar2;
        String str2;
        String str3;
        String str4;
        com.a.a.a.a.b bVar3;
        String str5;
        String str6;
        String str7;
        String str8 = null;
        if (h == null) {
            try {
                str6 = new String(com.a.a.a.a.a.a("dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K".getBytes()));
                try {
                    str7 = new String(com.a.a.a.a.a.a("cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gNC4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjAyMDQwMDE5ODg7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggLSAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCAtIDIuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xMjE1OTE2ODgyOwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54IC0gQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMTg5OTg1ODUxOTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55KSkgKiAwLjIyMDQ1ODYwMzE7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyBCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54ICsgMi4wKkJCQkJCQiwgdlRleHR1cmVDb29yZC55KSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLnggKyAzLjAqQkJCQkJCLCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMDU3NzkyOTU5NTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCArIDQuMCpCQkJCQkIsIHZUZXh0dXJlQ29vcmQueSkpICogMC4wMjA0MDAxOTg4OwogICAgICAgICAgIAogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cgp9Cg==".getBytes()));
                } catch (com.a.a.a.a.b e2) {
                    str5 = str6;
                    bVar3 = e2;
                    bVar3.printStackTrace();
                    str6 = str5;
                    str7 = null;
                    h = new d(str6, str7);
                    if (i == null) {
                    }
                    if (b == null) {
                    }
                }
            } catch (com.a.a.a.a.b e3) {
                bVar3 = e3;
                str5 = null;
            }
            h = new d(str6, str7);
        }
        if (i == null) {
            try {
                str3 = new String(com.a.a.a.a.a.a("dW5pZm9ybSBtYXQ0IE1NTU1NTTsKCmF0dHJpYnV0ZSB2ZWMyIFRUVFRUVDsKYXR0cmlidXRlIHZlYzQgUFBQUFBQOwphdHRyaWJ1dGUgdmVjNCBhQ29sb3I7Cgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgCgp2b2lkIG1haW4oKSB7IAoKCWdsX1Bvc2l0aW9uID0gTU1NTU1NICogUFBQUFBQOwoJdlRleHR1cmVDb29yZCA9IFRUVFRUVDsKCn0K".getBytes()));
            } catch (com.a.a.a.a.b e4) {
                bVar2 = e4;
                str2 = null;
            }
            try {
                str4 = new String(com.a.a.a.a.a.a("cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7Cgp1bmlmb3JtIHNhbXBsZXIyRCBzVGV4dHVyZTsgCgp2YXJ5aW5nIHZlYzIgdlRleHR1cmVDb29yZDsgICAgICAgCgp1bmlmb3JtIGZsb2F0IEJCQkJCQjsKICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKCSAKCSAgdmVjNCBzdW0gPSB2ZWM0KDAuMCk7CgkgIAoJICAJICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIDQuMCpCQkJCQkIpKSAqIDAuMDIwNDAwMTk4ODsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55IC0gMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgLSAyLjAqQkJCQkJCKSkgKiAwLjEyMTU5MTY4ODI7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSAtIEJCQkJCQikpICogMC4xODk5ODU4NTE5OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkpKSAqIDAuMjIwNDU4NjAzMTsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgQkJCQkJCKSkgKiAwLjE4OTk4NTg1MTk7CiAgICAgICAgICAgc3VtICs9IHRleHR1cmUyRChzVGV4dHVyZSwgdmVjMih2VGV4dHVyZUNvb3JkLngsIHZUZXh0dXJlQ29vcmQueSArIDIuMCpCQkJCQkIpKSAqIDAuMTIxNTkxNjg4MjsKICAgICAgICAgICBzdW0gKz0gdGV4dHVyZTJEKHNUZXh0dXJlLCB2ZWMyKHZUZXh0dXJlQ29vcmQueCwgdlRleHR1cmVDb29yZC55ICsgMy4wKkJCQkJCQikpICogMC4wNTc3OTI5NTk1OwogICAgICAgICAgIHN1bSArPSB0ZXh0dXJlMkQoc1RleHR1cmUsIHZlYzIodlRleHR1cmVDb29yZC54LCB2VGV4dHVyZUNvb3JkLnkgKyA0LjAqQkJCQkJCKSkgKiAwLjAyMDQwMDE5ODg7CgogICAgICAgICAgIGdsX0ZyYWdDb2xvciA9IHN1bSA7Cn0K".getBytes()));
            } catch (com.a.a.a.a.b e5) {
                str2 = str3;
                bVar2 = e5;
                bVar2.printStackTrace();
                str3 = str2;
                str4 = null;
                i = new d(str3, str4);
                if (b == null) {
                }
            }
            i = new d(str3, str4);
        }
        if (b == null) {
            try {
                String str9 = new String(com.a.a.a.a.a.a("dW5pZm9ybSBtYXQ0IE1NTU1NTTsgICAgICAKYXR0cmlidXRlIHZlYzIgVFRUVFRUOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBQUFBQUFA7ICAgICAgCnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOyAgICAgIAphdHRyaWJ1dGUgdmVjNCBDQ0NDQ0M7ICAgICAgCnZhcnlpbmcgdmVjNCB2Q29sb3I7ICAgICAgCnZvaWQgbWFpbigpIHsgICAgICAKZ2xfUG9zaXRpb24gPSBNTU1NTU0gKiBQUFBQUFA7ICAgICAgCiB2VGV4dHVyZUNvb3JkID0gVFRUVFRUOyAgICAgIAogdkNvbG9yID0gQ0NDQ0NDOyAgICAgIAp9".getBytes()));
                try {
                    str8 = new String(com.a.a.a.a.a.a("cHJlY2lzaW9uIG1lZGl1bXAgZmxvYXQ7CnZhcnlpbmcgdmVjMiB2VGV4dHVyZUNvb3JkOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQwOwp1bmlmb3JtIHNhbXBsZXIyRCBUVFRUVFQxOwp2YXJ5aW5nIHZlYzQgdkNvbG9yOyAgICAgIAp1bmlmb3JtIGZsb2F0IExMTExMTDsKdm9pZCBtYWluKCkgewp2ZWM0IHRleENvbG9yQSA9ICB0ZXh0dXJlMkQoVFRUVFRUMCwgdlRleHR1cmVDb29yZCk7CnZlYzQgdGV4Q29sb3JCID0gIHRleHR1cmUyRChUVFRUVFQxLCB2VGV4dHVyZUNvb3JkKTsKZ2xfRnJhZ0NvbG9yID0gdkNvbG9yKm1peCh0ZXhDb2xvckEsIHRleENvbG9yQiwgTExMTExMKS5yZ2JhOwp9".getBytes()));
                    str = str9;
                } catch (com.a.a.a.a.b e6) {
                    str = str9;
                    bVar = e6;
                    bVar.printStackTrace();
                    b = new g(str, str8);
                }
            } catch (com.a.a.a.a.b e7) {
                bVar = e7;
                str = null;
            }
            b = new g(str, str8);
        }
    }

    public static void a(Context context, TextureElement textureElement, TextureElement textureElement2, TextureElement textureElement3, com.tsf.shell.e.a.a.a aVar) {
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
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
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
            a = new f();
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
}
