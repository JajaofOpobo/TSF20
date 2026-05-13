package com.tsf.shell.f.a.a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {
    private ArrayList<a> a = new ArrayList<>();
    private ArrayList<a> b = new ArrayList<>();

    public com.tsf.shell.f.a.a.a a(int i, int i2) {
        com.tsf.shell.f.a.a.a aVar = new com.tsf.shell.f.a.a.a();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenRenderbuffers(1, iArr2, 0);
        GLES20.glBindRenderbuffer(36161, iArr2[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        aVar.a = iArr[0];
        aVar.b = iArr2[0];
        aVar.c = i;
        aVar.d = i2;
        return aVar;
    }

    public void a(com.tsf.shell.f.a.a.a aVar) {
        int[] iArr = {aVar.a};
        GLES20.glDeleteRenderbuffers(1, new int[]{aVar.b}, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
    }

    public void a(com.tsf.shell.f.a.a.a aVar, TextureElement textureElement) {
        b(aVar, textureElement);
        GLES20.glViewport(0, 0, aVar.c, aVar.d);
        com.censivn.C3DEngine.a.e().a(aVar.c, aVar.d);
    }

    public void a() {
        b();
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
        com.censivn.C3DEngine.a.e().a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G);
    }

    public void b(com.tsf.shell.f.a.a.a aVar, TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, aVar.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement.id, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, aVar.b);
        GLES20.glClear(16384);
        this.a.add(d(aVar, textureElement));
    }

    public void c(com.tsf.shell.f.a.a.a aVar, TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, aVar.a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement.id, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, aVar.b);
    }

    public void b() {
        GLES20.glBindFramebuffer(36160, 0);
        a(this.a.remove(this.a.size() - 1));
        if (this.a.size() > 0) {
            a aVar = this.a.get(this.a.size() - 1);
            c(aVar.a, aVar.b);
        }
    }

    private a d(com.tsf.shell.f.a.a.a aVar, TextureElement textureElement) {
        if (this.b.isEmpty()) {
            return new a(aVar, textureElement);
        }
        a remove = this.b.remove(0);
        remove.a = aVar;
        remove.b = textureElement;
        return remove;
    }

    private void a(a aVar) {
        aVar.a();
        this.b.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        public com.tsf.shell.f.a.a.a a;
        public TextureElement b;

        public a(com.tsf.shell.f.a.a.a aVar, TextureElement textureElement) {
            this.a = aVar;
            this.b = textureElement;
        }

        public void a() {
            this.a = null;
            this.b = null;
        }
    }
}
