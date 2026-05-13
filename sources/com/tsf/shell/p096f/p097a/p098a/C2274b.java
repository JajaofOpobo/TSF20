package com.tsf.shell.p096f.p097a.p098a;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.a.a.b */
/* loaded from: classes.dex */
public class C2274b {

    /* renamed from: a */
    private ArrayList<C2275a> f7432a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<C2275a> f7433b = new ArrayList<>();

    /* renamed from: a */
    public C2273a m5977a(int i, int i2) {
        C2273a c2273a = new C2273a();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenRenderbuffers(1, iArr2, 0);
        GLES20.glBindRenderbuffer(36161, iArr2[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        c2273a.f7428a = iArr[0];
        c2273a.f7429b = iArr2[0];
        c2273a.f7430c = i;
        c2273a.f7431d = i2;
        return c2273a;
    }

    /* renamed from: a */
    public void m5976a(C2273a c2273a) {
        int[] iArr = {c2273a.f7428a};
        GLES20.glDeleteRenderbuffers(1, new int[]{c2273a.f7429b}, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
    }

    /* renamed from: a */
    public void m5975a(C2273a c2273a, TextureElement textureElement) {
        m5972b(c2273a, textureElement);
        GLES20.glViewport(0, 0, c2273a.f7430c, c2273a.f7431d);
        C0853a.m10855e().m10779a(c2273a.f7430c, c2273a.f7431d);
    }

    /* renamed from: a */
    public void m5978a() {
        m5973b();
        GLES20.glViewport(0, 0, C0892a.f2555F, C0892a.f2556G);
        C0853a.m10855e().m10779a(C0892a.f2555F, C0892a.f2556G);
    }

    /* renamed from: b */
    public void m5972b(C2273a c2273a, TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, c2273a.f7428a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement.f2529id, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, c2273a.f7429b);
        GLES20.glClear(16384);
        this.f7432a.add(m5970d(c2273a, textureElement));
    }

    /* renamed from: c */
    public void m5971c(C2273a c2273a, TextureElement textureElement) {
        GLES20.glBindFramebuffer(36160, c2273a.f7428a);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureElement.f2529id, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, c2273a.f7429b);
    }

    /* renamed from: b */
    public void m5973b() {
        GLES20.glBindFramebuffer(36160, 0);
        m5974a(this.f7432a.remove(this.f7432a.size() - 1));
        if (this.f7432a.size() > 0) {
            C2275a c2275a = this.f7432a.get(this.f7432a.size() - 1);
            m5971c(c2275a.f7434a, c2275a.f7435b);
        }
    }

    /* renamed from: d */
    private C2275a m5970d(C2273a c2273a, TextureElement textureElement) {
        if (this.f7433b.isEmpty()) {
            return new C2275a(c2273a, textureElement);
        }
        C2275a remove = this.f7433b.remove(0);
        remove.f7434a = c2273a;
        remove.f7435b = textureElement;
        return remove;
    }

    /* renamed from: a */
    private void m5974a(C2275a c2275a) {
        c2275a.m5969a();
        this.f7433b.add(c2275a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.a.a.b$a */
    /* loaded from: classes.dex */
    public class C2275a {

        /* renamed from: a */
        public C2273a f7434a;

        /* renamed from: b */
        public TextureElement f7435b;

        public C2275a(C2273a c2273a, TextureElement textureElement) {
            this.f7434a = c2273a;
            this.f7435b = textureElement;
        }

        /* renamed from: a */
        public void m5969a() {
            this.f7434a = null;
            this.f7435b = null;
        }
    }
}
