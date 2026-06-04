package com.tsf.shell.workspace3D.c;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
public final class b {
    public static a a(int i, int i2) {
        a aVar = new a();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindFramebuffer(36160, i3);
        int[] iArr2 = new int[1];
        GLES20.glGenRenderbuffers(1, iArr2, 0);
        int i4 = iArr2[0];
        GLES20.glBindRenderbuffer(36161, i4);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i4);
        GLES20.glBindFramebuffer(36160, 0);
        aVar.a = i3;
        aVar.b = i4;
        aVar.c = i;
        aVar.d = i2;
        return aVar;
    }

    public static void a(a aVar) {
        int[] iArr = {aVar.a};
        GLES20.glDeleteRenderbuffers(1, new int[]{aVar.b}, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
    }

    public static void a(a aVar, TextureElement textureElement) {
        int i = textureElement.id;
        GLES20.glBindFramebuffer(36160, aVar.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
