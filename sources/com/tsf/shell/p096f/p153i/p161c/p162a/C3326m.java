package com.tsf.shell.p096f.p153i.p161c.p162a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.p163a.C3252h;
/* renamed from: com.tsf.shell.f.i.c.a.m */
/* loaded from: classes.dex */
public class C3326m extends AbstractC3322j implements InterfaceC3324k {

    /* renamed from: a */
    public TextureElement f10968a;

    /* renamed from: b */
    public TextureElement f10969b;

    /* renamed from: c */
    public TextureElement f10970c;

    /* renamed from: d */
    public TextureElement f10971d;

    /* renamed from: e */
    public TextureElement f10972e;

    /* renamed from: f */
    private VRectangle f10973f;

    /* renamed from: g */
    private C3329a f10974g;

    /* renamed from: h */
    private C3329a f10975h;

    /* renamed from: m */
    private C3329a f10976m;

    /* renamed from: n */
    private VButton f10977n;

    /* renamed from: o */
    private final int f10978o;

    /* renamed from: p */
    private VButtonItem f10979p;

    /* renamed from: q */
    private VButtonItem f10980q;

    /* renamed from: r */
    private VButtonItem f10981r;

    /* renamed from: s */
    private VButtonItem f10982s;

    /* renamed from: t */
    private VButtonItem f10983t;

    public C3326m(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10978o = 600;
        m2830e();
    }

    /* renamed from: e */
    public void m2830e() {
        this.f10977n = new VButton(5, 36, 216, 216);
        this.f10977n.useVBO(false);
        this.f10979p = this.f10977n.getItem(4);
        this.f10979p.yOffsetSP(100);
        this.f10979p.setTextureAllAndMathSizeSP(0, 0, 4, 6);
        this.f10979p.position().spZ(50.0f);
        this.f10979p.rotation().f2528z = -15.0f;
        this.f10979p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10979p.updateAll();
        this.f10980q = this.f10977n.getItem(1);
        this.f10980q.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.f10980q.yOffsetSP(100);
        this.f10980q.position().spX(30.0f);
        this.f10980q.position().spY(0.0f);
        this.f10980q.position().spZ(50.0f);
        this.f10980q.rotation().f2528z = -30.0f;
        this.f10980q.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10980q.updateAll();
        this.f10981r = this.f10977n.getItem(0);
        this.f10981r.setTextureAllAndMathSizeSP(0, 0, 4, 6);
        this.f10981r.yOffsetSP(100);
        this.f10981r.position().spZ(30.0f);
        this.f10981r.rotation().f2528z = 25.0f;
        this.f10981r.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10981r.updateAll();
        this.f10982s = this.f10977n.getItem(2);
        this.f10982s.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.f10982s.yOffsetSP(100);
        this.f10982s.position().spX(-18.0f);
        this.f10982s.position().spZ(50.0f);
        this.f10982s.rotation().f2528z = 45.0f;
        this.f10982s.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10982s.updateAll();
        this.f10983t = this.f10977n.getItem(3);
        this.f10983t.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.f10983t.yOffsetSP(100);
        this.f10983t.position().spZ(0.0f);
        this.f10983t.position().spY(30.0f);
        this.f10983t.rotation().f2528z = 10.0f;
        this.f10983t.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10983t.updateAll();
        addChild(this.f10977n);
        this.f10974g = new C3329a(0.0f);
        this.f10974g.position().spY(-65.0f);
        addChild(this.f10974g);
        this.f10975h = new C3329a(0.0f);
        this.f10975h.position().spX(-75.0f);
        addChild(this.f10975h);
        this.f10976m = new C3329a(0.0f);
        this.f10976m.position().spX(75.0f);
        addChild(this.f10976m);
        this.f10973f = new VRectangle(200.0f, 200.0f);
        addChild(this.f10973f);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        this.f10974g.m2829a();
        this.f10975h.m2829a();
        this.f10976m.m2829a();
        m2835a(this.f10979p, 45.0f, -15.0f, 100);
        m2835a(this.f10980q, 45.0f, -30.0f, VEasing.Back.easeIn);
        m2835a(this.f10981r, -45.0f, 25.0f, 300);
        m2835a(this.f10982s, -45.0f, 45.0f, 500);
        m2835a(this.f10983t, -45.0f, 10.0f, 600);
    }

    /* renamed from: a */
    private void m2835a(final VButtonItem vButtonItem, float f, final float f2, final int i) {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.m.1

            /* renamed from: a */
            boolean f10984a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onProgress(float f3) {
                if (f3 > 0.8f && !this.f10984a) {
                    this.f10984a = true;
                    VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.m.1.1
                        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                        public void onComplete() {
                            if (i == 600) {
                                C3326m.this.mo2855a();
                            }
                        }
                    };
                    vTweenParam2.setRotationZ(f2);
                    vTweenParam2.setEase(300);
                    VTween.killTween(vButtonItem);
                    VTween.m10747to(vButtonItem, 1500, vTweenParam2);
                }
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f3) {
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
            }
        };
        vTweenParam.setTimeout(i);
        vTweenParam.setRotationZ(f);
        VTween.killTween(vButtonItem);
        VTween.m10747to(vButtonItem, 500, vTweenParam);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        VTween.killTween(this.f10979p);
        VTween.killTween(this.f10980q);
        VTween.killTween(this.f10981r);
        VTween.killTween(this.f10982s);
        VTween.killTween(this.f10983t);
        this.f10979p.rotation().f2528z = -15.0f;
        this.f10980q.rotation().f2528z = -30.0f;
        this.f10981r.rotation().f2528z = 25.0f;
        this.f10982s.rotation().f2528z = 45.0f;
        this.f10983t.rotation().f2528z = 10.0f;
        this.f10979p.updateAll();
        this.f10980q.updateAll();
        this.f10981r.updateAll();
        this.f10982s.updateAll();
        this.f10983t.updateAll();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_weather_ico1, this.f10974g);
            mo2854a(C1306b.C1310d.widget_preview_weather_ico2, this.f10975h);
            mo2854a(C1306b.C1310d.widget_preview_weather_ico3, this.f10976m);
            mo2854a(C1306b.C1310d.widget_preview_weather_main, this.f10973f);
            mo2854a(C1306b.C1310d.widget_preview_weather_building, this.f10977n);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_weather_ico1) {
            this.f10969b = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_weather_ico2) {
            this.f10970c = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_weather_ico3) {
            this.f10971d = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_weather_main) {
            this.f10968a = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_weather_building) {
            this.f10972e = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10969b);
            this.f10961j.deleteTexture(this.f10970c);
            this.f10961j.deleteTexture(this.f10971d);
            this.f10961j.deleteTexture(this.f10968a);
            this.f10961j.deleteTexture(this.f10972e);
            this.f10974g.textures().removeAll();
            this.f10975h.textures().removeAll();
            this.f10976m.textures().removeAll();
            this.f10973f.textures().removeAll();
            this.f10977n.textures().removeAll();
        }
    }

    /* renamed from: com.tsf.shell.f.i.c.a.m$a */
    /* loaded from: classes.dex */
    public class C3329a extends VRectangle {

        /* renamed from: a */
        public float f10990a;

        /* renamed from: b */
        public float f10991b;

        /* renamed from: c */
        public float f10992c;

        /* renamed from: e */
        private float f10994e;

        public C3329a(float f) {
            super(70.0f, 70.0f);
            this.f10990a = 0.1f;
            this.f10991b = (float) (360.0d * Math.random());
            this.f10994e = 0.0f;
            this.f10992c = 0.0f;
            moveAllPointsSP(0.0f, -35.0f, 0.0f);
            this.f10994e = f;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (this.f10990a != 0.0f) {
                this.f10990a = ((float) (this.f10990a + (Math.sin(Math.toRadians(this.f10991b)) / 5.0d))) * 0.97f;
                this.f10992c = this.f10991b + this.f10990a;
            }
            if (Math.abs(this.f10992c - this.f10991b) > 6.0f) {
                this.f10991b = this.f10992c;
            } else {
                this.f10991b += (this.f10992c - this.f10991b) * 0.9f;
            }
            rotation().f2528z = this.f10991b + 180.0f + this.f10994e;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (Math.abs(this.f10990a) > 0.001f && !C3252h.f10683e) {
                invalidate();
            }
        }

        /* renamed from: a */
        public void m2829a() {
            this.f10990a = ((float) ((-10.0d) + (20.0d * Math.random()))) + this.f10990a;
        }
    }
}
