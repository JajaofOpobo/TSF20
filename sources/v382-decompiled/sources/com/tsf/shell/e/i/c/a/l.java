package com.tsf.shell.e.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.effects.VEffectsStack;
import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.api.effects.modifiers.VTwist;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class l extends o {
    public TextureElement a;
    public TextureElement b;
    public TextureElement c;
    public TextureElement d;
    public TextureElement e;
    public TextureElement f;
    private final int g;
    private float h;
    private VValueTweenTarget m;
    private VObject3dContainer n;
    private VRectangle o;
    private VRectangle p;
    private VRectangle q;
    private VObject3dContainer r;
    private VRectangle s;
    private VRectangle t;
    private VRectangle u;
    private VTwist v;
    private VEffectsStack w;

    public l(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.g = 1000;
        this.h = 1.2f;
        this.m = new VValueTweenTarget();
        h();
    }

    private void h() {
        j();
        i();
    }

    private void i() {
        this.n = new VObject3dContainer();
        this.n.visible(false);
        this.p = new VRectangle(455.0f / this.h, 33.0f / this.h);
        this.p.position().spY(108.0f);
        this.q = new VRectangle(400.0f / this.h, 187.0f / this.h);
        this.q.position().spY(42.0f);
        this.u = new VRectangle(455.0f / this.h, 320.0f / this.h);
        this.o = new VRectangle(455.0f / this.h, 62.0f / this.h);
        this.o.doubleSidedEnabled(true);
        this.o.moveAllPointsSP(0.0f, (((-62.0f) / this.h) / 2.0f) + 2.0f, 0.0f);
        this.o.position().spY(120.0f);
        this.n.addChild(this.p);
        this.n.addChild(this.q);
        this.n.addChild(this.u);
        this.n.addChild(this.o);
        addChild(this.n);
    }

    private void j() {
        this.r = new VObject3dContainer();
        this.t = new VRectangle(455.0f / this.h, 320.0f / this.h, 4, 4);
        this.r.addChild(this.t);
        this.t.rotation().y = 180.0f;
        this.s = new VRectangle(455.0f / this.h, 320.0f / this.h, 4, 4);
        this.r.addChild(this.s);
        addChild(this.r);
        this.v = new VTwist(0.0f);
        this.v.setCenter(new Vector3(0.0f, -227.0f, 0.0f));
        this.w = new VEffectsStack(this.t);
        this.w.addModifier(this.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        final VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.1
            boolean a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f <= 0.5f || this.a) {
                    return;
                }
                l.this.b(false);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                l.this.r.visible(true);
                l.this.n.visible(false);
                l.this.l();
            }
        };
        vTweenParam.setRotationX(0.0f);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTween.to(l.this.o, 500, vTweenParam);
            }
        };
        vTweenParam2.setSPY(42.0f);
        VTween.to(this.q, 500, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                l.this.e();
                l.this.a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.e();
            }
        };
        vTweenParam.setEase(VEasing.Back.easeOut);
        vTweenParam.setRotationY(180.0f);
        VTween.to(this.t, 800, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.v.setAngle((float) (f * 0.5d));
                l.this.w.apply();
                l.this.t.updatePointsVBO();
                l.this.e();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                l.this.o();
            }
        };
        vTweenParam2.setEase(VEasing.Linear.easeNone);
        VTween.killTween(this.m);
        VTween.to(this.m, VEasing.Back.easeIn, vTweenParam2);
    }

    private void m() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.5
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                l.this.r.visible(false);
                l.this.n.visible(true);
                l.this.e();
                l.this.n();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.e();
            }
        };
        vTweenParam.setEase(VEasing.Back.easeOut);
        vTweenParam.setRotationY(0.0f);
        VTween.to(this.t, 800, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.6
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.v.setAngle((float) (f * 0.5d));
                l.this.w.apply();
                l.this.t.updatePointsVBO();
                l.this.e();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                l.this.o();
            }
        };
        vTweenParam2.setEase(VEasing.Linear.easeNone);
        VTween.to(this.m, VEasing.Back.easeIn, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        final VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.7
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.7.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        l.this.k();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.to(l.this, 1, vTweenParam2);
            }
        };
        vTweenParam.setSPY(130.0f);
        vTweenParam.setEase(300);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.8
            boolean a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f <= 0.5f || this.a) {
                    return;
                }
                l.this.b(true);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTween.to(l.this.q, 1500, vTweenParam);
            }
        };
        vTweenParam2.setRotationX(-180.0f);
        VTween.to(this.o, 300, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.p.setZOrderOnTop();
            this.o.setZOrderOnTop();
            this.q.setZOrderOnTop();
            this.u.setZOrderOnTop();
            return;
        }
        this.p.setZOrderOnTop();
        this.q.setZOrderOnTop();
        this.u.setZOrderOnTop();
        this.o.setZOrderOnTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.e.i.c.a.l.9
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.v.setAngle((1.0f - f) * 0.5f);
                l.this.w.apply();
                l.this.t.updatePointsVBO();
                l.this.e();
            }
        };
        vTweenParam.setEase(VEasing.Linear.easeNone);
        VTween.killTween(this.m);
        VTween.to(this.m, 300, vTweenParam);
    }

    public void e() {
        int size = this.t.point().size();
        for (int i = 0; i < size; i++) {
            this.s.point().setSP(i, this.t.point().getAsNumber3dSP(i));
        }
        this.s.rotation().y = this.t.rotation().y + 180.0f;
        this.s.updatePointsVBO();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void a(boolean z) {
        if (!this.l) {
            this.l = true;
            a(R.drawable.widget_preview_message_back_inside, this.p);
            a(R.drawable.widget_preview_message_content, this.q);
            a(R.drawable.widget_preview_message_back_no_flap, this.u);
            a(R.drawable.widget_preview_message_back_flag_back, this.o);
            a(R.drawable.widget_preview_message_back, this.t);
            a(R.drawable.widget_preview_message_front, this.s);
            c(z);
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.n
    public void a(int i, TextureElement textureElement) {
        if (i == R.drawable.widget_preview_message_back_inside) {
            this.f = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_message_content) {
            this.d = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_message_back_no_flap) {
            this.c = textureElement;
            return;
        }
        if (i == R.drawable.widget_preview_message_back_flag_back) {
            this.e = textureElement;
        } else if (i == R.drawable.widget_preview_message_back) {
            this.b = textureElement;
        } else if (i == R.drawable.widget_preview_message_front) {
            this.a = textureElement;
        }
    }

    @Override // com.tsf.shell.e.i.c.a.o, com.tsf.shell.e.i.c.a.q
    public void d() {
        if (this.l) {
            this.l = false;
            this.j.deleteTexture(this.f);
            this.p.textures().removeAll();
            this.j.deleteTexture(this.d);
            this.q.textures().removeAll();
            this.j.deleteTexture(this.c);
            this.u.textures().removeAll();
            this.j.deleteTexture(this.e);
            this.o.textures().removeAll();
            this.j.deleteTexture(this.b);
            this.t.textures().removeAll();
            this.j.deleteTexture(this.a);
            this.s.textures().removeAll();
        }
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void b() {
        m();
    }

    @Override // com.tsf.shell.e.i.c.a.q
    public void c() {
        VTween.killTween(this.q);
        VTween.killTween(this.o);
        VTween.killTween(this.r);
        VTween.killTween(this.n);
        VTween.killTween(this.t);
        VTween.killTween(this.m);
        VTween.killTween(this);
        this.q.position().spY(42.0f);
        this.o.rotation().x = 0.0f;
        b(false);
        this.r.visible(true);
        this.n.visible(false);
        this.t.rotation().y = 180.0f;
        this.v.setAngle(0.0f);
        this.w.apply();
        this.t.updatePointsVBO();
        e();
    }
}
