package com.tsf.shell.e.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class s extends o implements q {
    public TextureElement a;
    public TextureElement b;
    public TextureElement c;
    public TextureElement d;
    public TextureElement e;
    private VRectangle f;
    private t g;
    private t h;
    private t m;
    private VButton n;
    private final int o;
    private VButtonItem p;
    private VButtonItem q;
    private VButtonItem r;
    private VButtonItem s;
    private VButtonItem t;

    public s(VTextureManager vTextureManager, Context context) {
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
        this.g = new t(this, 0.0f);
        this.g.position().spY(-65.0f);
        addChild(this.g);
        this.h = new t(this, 0.0f);
        this.h.position().spX(-75.0f);
        addChild(this.h);
        this.m = new t(this, 0.0f);
        this.m.position().spX(75.0f);
        addChild(this.m);
        this.f = new VRectangle(200.0f, 200.0f);
        addChild(this.f);
    }

    @Override // com.tsf.shell.e.i.c.a.q
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
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.s.1
            boolean a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onProgress(float f3) {
                if (f3 > 0.8f && !this.a) {
                    this.a = true;
                    final int i2 = i;
                    VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.s.1.1
                        @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                        public void onComplete() {
                            if (i2 == 600) {
                                s.this.a();
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

    @Override // com.tsf.shell.e.i.c.a.q
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

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_weather_ico1, this.g);
            a(R.drawable.widget_preview_weather_ico2, this.h);
            a(R.drawable.widget_preview_weather_ico3, this.m);
            a(R.drawable.widget_preview_weather_main, this.f);
            a(R.drawable.widget_preview_weather_building, this.n);
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_weather_ico1) {
            this.b = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_weather_ico2) {
            this.c = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_weather_ico3) {
            this.d = textureElement;
        } else if (i == R.drawable.widget_preview_weather_main) {
            this.a = textureElement;
        } else if (i == R.drawable.widget_preview_weather_building) {
            this.e = textureElement;
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
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
}
