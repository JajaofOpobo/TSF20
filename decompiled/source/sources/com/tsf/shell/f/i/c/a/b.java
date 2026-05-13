package com.tsf.shell.f.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.primitives.button.VButton;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.b;
import org.acra.ACRAConstants;
/* loaded from: classes.dex */
public class b extends j {
    public TextureElement a;
    public TextureElement b;
    public TextureElement c;
    public TextureElement d;
    public TextureElement e;
    public TextureElement f;
    private final int g;
    private VRectangle h;
    private VButton m;
    private VObject3dContainer n;
    private VObject3dContainer o;
    private VObject3dContainer p;
    private VButton q;
    private VRectangle r;
    private VRectangle s;
    private VRectangle t;
    private float u;

    public b(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.g = 1000;
        this.u = 0.5f;
        scale().x = this.u;
        scale().y = this.u;
        scale().z = this.u;
        e();
    }

    private void e() {
        this.o = new VObject3dContainer();
        j();
        k();
        addChild(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.1
            private boolean b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                b.this.a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.b) {
                    b.this.b(false);
                    this.b = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.o);
        VTween.to(this.o, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    private void i() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.2
            private boolean b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.2.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        b.this.h();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.to(b.this, 1, vTweenParam2);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.b) {
                    b.this.b(false);
                    this.b = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(180.0f);
        VTween.killTween(this.o);
        VTween.to(this.o, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    public void b(boolean z) {
    }

    private void j() {
        this.p = new VObject3dContainer();
        this.p.position().spZ(-10.0f);
        this.p.rotation().y = 180.0f;
        this.t = new VRectangle(416.0f, 416.0f);
        this.t.doubleSidedEnabled(true);
        this.p.addChild(this.t);
        this.s = new VRectangle(316.0f, 316.0f);
        this.s.position().spZ(50.0f);
        this.p.addChild(this.s);
        this.r = new VRectangle(296.66666f, 107.49999f);
        this.r.position().spX(96.0f);
        this.r.position().spZ(100.0f);
        this.p.addChild(this.r);
        this.q = new VButton(7, 1, 127, 525);
        float f = 90.0f;
        for (int i = 0; i < 7; i++) {
            VButtonItem item = this.q.getItem(i);
            item.setTextureAllAndMathSizeSP(0, i * 75, 127, 75);
            item.position().spY((float) (Math.cos(Math.toRadians(f)) * 215.0d));
            item.position().spX(-((float) (Math.sin(Math.toRadians(f)) * 215.0d)));
            item.rotation().z = f;
            item.scale().setAll(0.83f, 0.83f, 0.83f);
            item.updateAll();
            f -= 24.0f;
        }
        this.p.addChild(this.q);
        this.o.addChild(this.p);
    }

    private void k() {
        this.n = new VObject3dContainer();
        this.n.position().spZ(10.0f);
        this.h = new VRectangle(416.0f, 416.0f);
        this.n.addChild(this.h);
        this.m = new VButton(6, 1, 300, 534);
        VButtonItem item = this.m.getItem(0);
        item.setTextureAllAndMathSizeSP(0, 0, 300, 234);
        item.position().spY(180.0f);
        item.position().spZ(100.0f);
        item.scale().setAll(0.8f, 0.8f, 0.8f);
        item.updateAll();
        VButtonItem item2 = this.m.getItem(1);
        item2.setTextureAllAndMathSizeSP(0, 234, 300, 78);
        item2.position().spY(75.0f);
        item2.position().spZ(90.0f);
        item2.scale().setAll(0.8f, 0.8f, 0.8f);
        item2.updateAll();
        VButtonItem item3 = this.m.getItem(2);
        item3.setTextureAllAndMathSizeSP(0, 312, 300, 48);
        item3.position().spY(40.0f);
        item3.position().spZ(60.0f);
        item3.scale().setAll(0.8f, 0.8f, 0.8f);
        item3.updateAll();
        VButtonItem item4 = this.m.getItem(3);
        item4.setTextureAllAndMathSizeSP(0, 360, 300, 40);
        item4.position().spY(5.0f);
        item4.position().spZ(40.0f);
        item4.scale().setAll(0.8f, 0.8f, 0.8f);
        item4.updateAll();
        VButtonItem item5 = this.m.getItem(4);
        item5.setTextureAllAndMathSizeSP(0, VEasing.Linear.easeNone, 300, 89);
        item5.position().spY(-45.0f);
        item5.position().spZ(100.0f);
        item5.scale().setAll(0.9f, 0.9f, 0.9f);
        item5.updateAll();
        VButtonItem item6 = this.m.getItem(5);
        item6.setTextureAllAndMathSizeSP(0, 489, 300, 45);
        item6.position().spY(-100.0f);
        item6.position().spZ(80.0f);
        item6.scale().setAll(0.8f, 0.8f, 0.8f);
        item6.updateAll();
        this.n.addChild(this.m);
        this.o.addChild(this.n);
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(b.d.widget_preview_alarm_frontbg, this.h);
            a(b.d.widget_preview_alarm_front_content, this.m);
            a(b.d.widget_preview_alarm_back_bg, this.t);
            a(b.d.widget_preview_alarm_small_circle, this.s);
            a(b.d.widget_preview_alarm_toggle, this.r);
            a(b.d.widget_preview_alarm_week, this.q);
            c(z);
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.i
    public void a(int i, TextureElement textureElement) {
        if (i == b.d.widget_preview_alarm_frontbg) {
            this.a = textureElement;
        } else if (i == b.d.widget_preview_alarm_front_content) {
            this.b = textureElement;
        } else if (i == b.d.widget_preview_alarm_back_bg) {
            this.c = textureElement;
        } else if (i == b.d.widget_preview_alarm_small_circle) {
            this.d = textureElement;
        } else if (i == b.d.widget_preview_alarm_toggle) {
            this.e = textureElement;
        } else if (i == b.d.widget_preview_alarm_week) {
            this.f = textureElement;
        }
    }

    @Override // com.tsf.shell.f.i.c.a.j, com.tsf.shell.f.i.c.a.k
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.a);
            this.h.textures().removeAll();
            this.j.deleteTexture(this.b);
            this.m.textures().removeAll();
            this.j.deleteTexture(this.c);
            this.t.textures().removeAll();
            this.j.deleteTexture(this.d);
            this.s.textures().removeAll();
            this.j.deleteTexture(this.e);
            this.r.textures().removeAll();
            this.j.deleteTexture(this.f);
            this.q.textures().removeAll();
        }
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void b() {
        i();
    }

    @Override // com.tsf.shell.f.i.c.a.k
    public void c() {
        VTween.killTween(this.o);
        VTween.killTween(this);
        b(false);
        this.o.rotation().y = 0.0f;
    }
}
