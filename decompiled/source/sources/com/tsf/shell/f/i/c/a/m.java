package com.tsf.shell.f.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.b;
/* loaded from: classes.dex */
public class m extends j implements k {
    public TextureElement a;
    public TextureElement b;
    public TextureElement c;
    public TextureElement d;
    public TextureElement e;
    private VRectangle f;
    private a g;
    private a h;
    private a m;
    private VButton n;
    private final int o;
    private VButtonItem p;
    private VButtonItem q;
    private VButtonItem r;
    private VButtonItem s;
    private VButtonItem t;

    public m(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.o = 600;
        e();
    }

    public void e() {
        this.n = new VButton(5, 36, 216, 216);
        this.n.useVBO(false);
        this.p = this.n.getItem(4);
        this.p.yOffsetSP(100);
        this.p.setTextureAllAndMathSizeSP(0, 0, 4, 6);
        this.p.position().spZ(50.0f);
        this.p.rotation().z = -15.0f;
        this.p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.p.updateAll();
        this.q = this.n.getItem(1);
        this.q.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.q.yOffsetSP(100);
        this.q.position().spX(30.0f);
        this.q.position().spY(0.0f);
        this.q.position().spZ(50.0f);
        this.q.rotation().z = -30.0f;
        this.q.scale().setAll(0.8f, 0.8f, 0.8f);
        this.q.updateAll();
        this.r = this.n.getItem(0);
        this.r.setTextureAllAndMathSizeSP(0, 0, 4, 6);
        this.r.yOffsetSP(100);
        this.r.position().spZ(30.0f);
        this.r.rotation().z = 25.0f;
        this.r.scale().setAll(0.8f, 0.8f, 0.8f);
        this.r.updateAll();
        this.s = this.n.getItem(2);
        this.s.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.s.yOffsetSP(100);
        this.s.position().spX(-18.0f);
        this.s.position().spZ(50.0f);
        this.s.rotation().z = 45.0f;
        this.s.scale().setAll(0.8f, 0.8f, 0.8f);
        this.s.updateAll();
        this.t = this.n.getItem(3);
        this.t.setTextureAllAndMathSizeSP(4, 0, 2, 6);
        this.t.yOffsetSP(100);
        this.t.position().spZ(0.0f);
        this.t.position().spY(30.0f);
        this.t.rotation().z = 10.0f;
        this.t.scale().setAll(0.8f, 0.8f, 0.8f);
        this.t.updateAll();
        addChild(this.n);
        this.g = new a(0.0f);
        this.g.position().spY(-65.0f);
        addChild(this.g);
        this.h = new a(0.0f);
        this.h.position().spX(-75.0f);
        addChild(this.h);
        this.m = new a(0.0f);
        this.m.position().spX(75.0f);
        addChild(this.m);
        this.f = new VRectangle(200.0f, 200.0f);
        addChild(this.f);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        this.g.a();
        this.h.a();
        this.m.a();
        a(this.p, 45.0f, -15.0f, 100);
        a(this.q, 45.0f, -30.0f, VEasing.Back.easeIn);
        a(this.r, -45.0f, 25.0f, 300);
        a(this.s, -45.0f, 45.0f, 500);
        a(this.t, -45.0f, 10.0f, 600);
    }

    private void a(final VButtonItem vButtonItem, float f, final float f2, final int i) {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.m.1
            boolean a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onProgress(float f3) {
                if (f3 > 0.8f && !this.a) {
                    this.a = true;
                    VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.m.1.1
                        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                        public void onComplete() {
                            if (i == 600) {
                                m.this.a();
                            }
                        }
                    };
                    vTweenParam2.setRotationZ(f2);
                    vTweenParam2.setEase(300);
                    VTween.killTween(vButtonItem);
                    VTween.to(vButtonItem, 1500, vTweenParam2);
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
        VTween.to(vButtonItem, 500, vTweenParam);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
        VTween.killTween(this.p);
        VTween.killTween(this.q);
        VTween.killTween(this.r);
        VTween.killTween(this.s);
        VTween.killTween(this.t);
        this.p.rotation().z = -15.0f;
        this.q.rotation().z = -30.0f;
        this.r.rotation().z = 25.0f;
        this.s.rotation().z = 45.0f;
        this.t.rotation().z = 10.0f;
        this.p.updateAll();
        this.q.updateAll();
        this.r.updateAll();
        this.s.updateAll();
        this.t.updateAll();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_weather_ico1, this.g);
            a(b.d.widget_preview_weather_ico2, this.h);
            a(b.d.widget_preview_weather_ico3, this.m);
            a(b.d.widget_preview_weather_main, this.f);
            a(b.d.widget_preview_weather_building, this.n);
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_weather_ico1) {
            this.b = textureElement;
        } else if (i == b.d.widget_preview_weather_ico2) {
            this.c = textureElement;
        } else if (i == b.d.widget_preview_weather_ico3) {
            this.d = textureElement;
        } else if (i == b.d.widget_preview_weather_main) {
            this.a = textureElement;
        } else if (i == b.d.widget_preview_weather_building) {
            this.e = textureElement;
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.b);
            this.j.deleteTexture(this.c);
            this.j.deleteTexture(this.d);
            this.j.deleteTexture(this.a);
            this.j.deleteTexture(this.e);
            this.g.textures().removeAll();
            this.h.textures().removeAll();
            this.m.textures().removeAll();
            this.f.textures().removeAll();
            this.n.textures().removeAll();
        }
    }

    /* loaded from: classes.dex */
    public class a extends VRectangle {
        public float a;
        public float b;
        public float c;
        private float e;

        public a(float f) {
            super(70.0f, 70.0f);
            this.a = 0.1f;
            this.b = (float) (360.0d * Math.random());
            this.e = 0.0f;
            this.c = 0.0f;
            moveAllPointsSP(0.0f, -35.0f, 0.0f);
            this.e = f;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawStart() {
            if (this.a != 0.0f) {
                this.a = ((float) (this.a + (Math.sin(Math.toRadians(this.b)) / 5.0d))) * 0.97f;
                this.c = this.b + this.a;
            }
            if (Math.abs(this.c - this.b) > 6.0f) {
                this.b = this.c;
            } else {
                this.b += (this.c - this.b) * 0.9f;
            }
            rotation().z = this.b + 180.0f + this.e;
        }

        @Override // com.censivn.C3DEngine.api.core.VObject3d
        public void onDrawEnd() {
            if (Math.abs(this.a) > 0.001f && !com.tsf.shell.f.i.c.a.a.h.e) {
                invalidate();
            }
        }

        public void a() {
            this.a = ((float) ((-10.0d) + (20.0d * Math.random()))) + this.a;
        }
    }
}
