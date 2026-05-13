package com.tsf.shell.p096f.p153i.p161c.p162a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.p163a.C3252h;
/* renamed from: com.tsf.shell.f.i.c.a.a */
/* loaded from: classes.dex */
public class C3234a extends AbstractC3322j {

    /* renamed from: a */
    public TextureElement f10565a;

    /* renamed from: b */
    public TextureElement f10566b;

    /* renamed from: c */
    private C3235a f10567c;

    /* renamed from: d */
    private VRectangle f10568d;

    /* renamed from: com.tsf.shell.f.i.c.a.a$a */
    /* loaded from: classes.dex */
    public class C3235a extends VRectangle {

        /* renamed from: a */
        public float f10569a;

        /* renamed from: b */
        public float f10570b;

        /* renamed from: c */
        public float f10571c;

        /* renamed from: e */
        private float f10573e;

        public C3235a(float f, float f2, float f3) {
            super(f, f2);
            this.f10569a = 0.1f;
            this.f10570b = (float) (360.0d * Math.random());
            this.f10573e = 0.0f;
            this.f10571c = 0.0f;
            this.f10573e = f3;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (this.f10569a != 0.0f) {
                this.f10569a = ((float) (this.f10569a + (Math.sin(Math.toRadians(this.f10570b)) / 5.0d))) * 0.97f;
                this.f10571c = this.f10570b + this.f10569a;
            }
            if (Math.abs(this.f10571c - this.f10570b) > 6.0f) {
                this.f10570b = this.f10571c;
            } else {
                this.f10570b += (this.f10571c - this.f10570b) * 0.9f;
            }
            rotation().f2528z = this.f10570b + 180.0f + this.f10573e;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (Math.abs(this.f10569a) > 0.001f && !C3252h.f10683e) {
                invalidate();
            }
        }

        /* renamed from: a */
        public void m3046a() {
            this.f10569a = ((float) ((-10.0d) + (20.0d * Math.random()))) + this.f10569a;
        }
    }

    public C3234a(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        m3048s_();
    }

    /* renamed from: s_ */
    public void m3048s_() {
        this.f10567c = new C3235a(256.0f, 256.0f, 0.0f);
        this.f10567c.position().spY(112.0f);
        this.f10567c.moveAllPointsSP(0.0f, -112.0f, 0.0f);
        addChild(this.f10567c);
        this.f10568d = new VRectangle(48.0f, 48.0f, 1, 1);
        this.f10568d.position().spY(112.0f);
        addChild(this.f10568d);
        invalidate();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        this.f10567c.m3046a();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_adornment_texture_default, this.f10567c);
            mo2854a(C1306b.C1310d.widget_preview_adornment_texture_thumbtack_hd, this.f10568d);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_adornment_texture_default) {
            this.f10565a = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_adornment_texture_thumbtack_hd) {
            this.f10566b = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10565a);
            this.f10567c.textures().removeAll();
            this.f10961j.deleteTexture(this.f10566b);
            this.f10568d.textures().removeAll();
        }
    }
}
