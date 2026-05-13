package com.tsf.shell.p096f.p118e.p120b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p098a.C2273a;
import com.tsf.shell.utils.C4176l;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.b.a */
/* loaded from: classes.dex */
public class C2468a extends C0980j {

    /* renamed from: k */
    private TextureElement f8109k;

    /* renamed from: b */
    private float f8100b = 120.0f;

    /* renamed from: c */
    private float f8101c = 0.0f;

    /* renamed from: d */
    private int f8102d = 0;

    /* renamed from: e */
    private int f8103e = 0;

    /* renamed from: f */
    private int f8104f = 0;

    /* renamed from: g */
    private float f8105g = 0.0f;

    /* renamed from: h */
    private ArrayList<TextureElement> f8106h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<TextureElement> f8107i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C2273a> f8108j = new ArrayList<>();

    /* renamed from: a */
    private C2472c f8099a = new C2472c();

    public C2468a() {
        addChild(this.f8099a);
    }

    /* renamed from: a */
    public void m5507a(TextureElement textureElement, float f, Runnable runnable) {
        m5505a(textureElement, 500, f, 4, 20.0f, runnable);
    }

    /* renamed from: a */
    private void m5505a(TextureElement textureElement, int i, float f, int i2, float f2, final Runnable runnable) {
        this.f8100b = f;
        m5506a(textureElement, i2, f2);
        this.f8099a.f8124a = textureElement.f2529id;
        this.f8099a.f8125b = this.f8106h.get(0).f2529id;
        this.f8099a.m5499a(textureElement.width, textureElement.height);
        m5510a(0.0f);
        final float f3 = this.f8101c;
        final float f4 = 1.0f - this.f8101c;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.b.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f5) {
                float f6 = f3 + (f4 * f5);
                if (f6 < 0.0f) {
                    C4176l.m668a(this, "BlurContainer -> blur : precent:" + f6 + "    startProgress" + f3 + "    diffProgress:" + f4 + "     precent" + f5);
                }
                C2468a.this.m5510a(f6);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        C1014c.m10326a(this);
        C1014c.m10325a(this, i, c1017d);
    }

    /* renamed from: a */
    public void m5508a(TextureElement textureElement) {
        m5506a(textureElement, this.f8104f, this.f8105g);
        m5510a(this.f8101c);
        this.f8099a.m5499a(textureElement.width, textureElement.height);
    }

    /* renamed from: a */
    public boolean m5511a() {
        return this.f8101c != 0.0f;
    }

    /* renamed from: a */
    public void m5510a(float f) {
        this.f8101c = f;
        int size = this.f8106h.size();
        if (f >= 1.0f) {
            this.f8099a.f8124a = this.f8106h.get(this.f8106h.size() - 2).f2529id;
            this.f8099a.f8125b = this.f8106h.get(this.f8106h.size() - 1).f2529id;
            this.f8099a.f8126c = 1.0f;
            this.f8099a.f8127d = (int) this.f8100b;
            return;
        }
        float f2 = 1.0f / size;
        int i = (int) (f / f2);
        float f3 = (f % f2) / f2;
        this.f8099a.f8124a = i == 0 ? this.f8109k.f2529id : this.f8106h.get(i - 1).f2529id;
        this.f8099a.f8125b = this.f8106h.get(i).f2529id;
        this.f8099a.f8126c = f3;
        this.f8099a.f8127d = (int) (this.f8100b * f);
    }

    /* renamed from: a */
    public void m5509a(int i, final Runnable runnable) {
        final float f = this.f8101c;
        final float f2 = 0.0f - this.f8101c;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.b.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                C2468a.this.m5510a(f + (f2 * f3));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        C1014c.m10326a(this);
        C1014c.m10325a(this, i, c1017d);
    }

    /* renamed from: b */
    public TextureElement m5504b() {
        if (this.f8106h.size() == 0) {
            return null;
        }
        return this.f8106h.get(this.f8106h.size() - 1);
    }

    /* renamed from: a */
    private void m5506a(TextureElement textureElement, int i, float f) {
        this.f8109k = textureElement;
        if (this.f8102d != textureElement.height || this.f8103e != textureElement.width || i != this.f8104f || this.f8105g != f) {
            m5503c();
            this.f8102d = textureElement.height;
            this.f8103e = textureElement.width;
            this.f8104f = i;
            this.f8105g = f;
            float f2 = C0892a.f2567c * (f / i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (int) ((textureElement.width / f2) / (i2 + 1));
                int i4 = (int) ((textureElement.height / f2) / (i2 + 1));
                this.f8108j.add(C3359a.f11106t.m5977a(i3, i4));
                this.f8106h.add(C2474e.m5490a(i3, i4));
                this.f8107i.add(C2474e.m5490a(i3, i4));
            }
        }
        System.currentTimeMillis();
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == 0) {
                C2474e.m5487a(C0853a.m10856d(), this.f8109k, this.f8106h.get(i5), this.f8107i.get(i5), this.f8108j.get(i5));
            } else {
                C2474e.m5487a(C0853a.m10856d(), this.f8106h.get(i5 - 1), this.f8106h.get(i5), this.f8107i.get(i5), this.f8108j.get(i5));
            }
        }
        System.currentTimeMillis();
    }

    /* renamed from: c */
    private void m5503c() {
        while (this.f8106h.size() > 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f8106h.remove(0).f2529id}, 0);
        }
        while (this.f8107i.size() > 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f8107i.remove(0).f2529id}, 0);
        }
        while (this.f8108j.size() > 0) {
            C3359a.f11106t.m5976a(this.f8108j.remove(0));
        }
    }
}
