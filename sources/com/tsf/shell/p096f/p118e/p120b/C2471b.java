package com.tsf.shell.p096f.p118e.p120b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
/* renamed from: com.tsf.shell.f.e.b.b */
/* loaded from: classes.dex */
public class C2471b {

    /* renamed from: e */
    private C2273a f8122e;

    /* renamed from: f */
    private TextureElement f8123f;

    /* renamed from: b */
    private int f8119b = 0;

    /* renamed from: c */
    private int f8120c = 0;

    /* renamed from: d */
    private int f8121d = 0;

    /* renamed from: a */
    public TextureElement f8118a = new TextureElement(0, false);

    /* renamed from: a */
    public void m5501a(TextureElement textureElement, int i) {
        int i2 = textureElement.width;
        int i3 = textureElement.height;
        if (this.f8120c != i2 || this.f8121d != i3 || i != this.f8119b) {
            m5500b(textureElement, i);
        }
        C2474e.m5487a(C0853a.m10856d(), textureElement, this.f8118a, this.f8123f, this.f8122e);
    }

    /* renamed from: b */
    private void m5500b(TextureElement textureElement, int i) {
        m5502a();
        this.f8120c = textureElement.width;
        this.f8121d = textureElement.height;
        this.f8119b = i;
        int i2 = this.f8120c / this.f8119b;
        int i3 = this.f8121d / this.f8119b;
        this.f8122e = C3359a.f11106t.m5977a(i2, i3);
        this.f8118a = C2474e.m5489a(i2, i3, this.f8118a);
        this.f8123f = C2474e.m5490a(i2, i3);
    }

    /* renamed from: a */
    public void m5502a() {
        this.f8120c = 0;
        this.f8121d = 0;
        this.f8119b = 0;
        if (this.f8122e != null) {
            C3359a.f11106t.m5976a(this.f8122e);
        }
        if (this.f8118a != null) {
            GLES20.glDeleteTextures(1, new int[]{this.f8118a.f2529id}, 0);
        }
        if (this.f8123f != null) {
            GLES20.glDeleteTextures(1, new int[]{this.f8123f.f2529id}, 0);
        }
    }
}
