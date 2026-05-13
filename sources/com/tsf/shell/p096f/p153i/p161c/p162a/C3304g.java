package com.tsf.shell.p096f.p153i.p161c.p162a;

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
import com.tsf.C1306b;
/* renamed from: com.tsf.shell.f.i.c.a.g */
/* loaded from: classes.dex */
public class C3304g extends AbstractC3322j {

    /* renamed from: a */
    public TextureElement f10895a;

    /* renamed from: b */
    public TextureElement f10896b;

    /* renamed from: c */
    public TextureElement f10897c;

    /* renamed from: d */
    public TextureElement f10898d;

    /* renamed from: e */
    public TextureElement f10899e;

    /* renamed from: f */
    public TextureElement f10900f;

    /* renamed from: g */
    private final int f10901g;

    /* renamed from: h */
    private float f10902h;

    /* renamed from: m */
    private VValueTweenTarget f10903m;

    /* renamed from: n */
    private VObject3dContainer f10904n;

    /* renamed from: o */
    private VRectangle f10905o;

    /* renamed from: p */
    private VRectangle f10906p;

    /* renamed from: q */
    private VRectangle f10907q;

    /* renamed from: r */
    private VObject3dContainer f10908r;

    /* renamed from: s */
    private VRectangle f10909s;

    /* renamed from: t */
    private VRectangle f10910t;

    /* renamed from: u */
    private VRectangle f10911u;

    /* renamed from: v */
    private VTwist f10912v;

    /* renamed from: w */
    private VEffectsStack f10913w;

    public C3304g(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10901g = 1000;
        this.f10902h = 1.2f;
        this.f10903m = new VValueTweenTarget();
        m2885h();
    }

    /* renamed from: h */
    private void m2885h() {
        m2881j();
        m2883i();
    }

    /* renamed from: i */
    private void m2883i() {
        this.f10904n = new VObject3dContainer();
        this.f10904n.visible(false);
        this.f10906p = new VRectangle(455.0f / this.f10902h, 33.0f / this.f10902h);
        this.f10906p.position().spY(108.0f);
        this.f10907q = new VRectangle(400.0f / this.f10902h, 187.0f / this.f10902h);
        this.f10907q.position().spY(42.0f);
        this.f10911u = new VRectangle(455.0f / this.f10902h, 320.0f / this.f10902h);
        this.f10905o = new VRectangle(455.0f / this.f10902h, 62.0f / this.f10902h);
        this.f10905o.doubleSidedEnabled(true);
        this.f10905o.moveAllPointsSP(0.0f, (((-62.0f) / this.f10902h) / 2.0f) + 2.0f, 0.0f);
        this.f10905o.position().spY(120.0f);
        this.f10904n.addChild(this.f10906p);
        this.f10904n.addChild(this.f10907q);
        this.f10904n.addChild(this.f10911u);
        this.f10904n.addChild(this.f10905o);
        addChild(this.f10904n);
    }

    /* renamed from: j */
    private void m2881j() {
        this.f10908r = new VObject3dContainer();
        this.f10910t = new VRectangle(455.0f / this.f10902h, 320.0f / this.f10902h, 4, 4);
        this.f10908r.addChild(this.f10910t);
        this.f10910t.rotation().f2527y = 180.0f;
        this.f10909s = new VRectangle(455.0f / this.f10902h, 320.0f / this.f10902h, 4, 4);
        this.f10908r.addChild(this.f10909s);
        addChild(this.f10908r);
        this.f10912v = new VTwist(0.0f);
        this.f10912v.setCenter(new Vector3(0.0f, -227.0f, 0.0f));
        this.f10913w = new VEffectsStack(this.f10910t);
        this.f10913w.addModifier(this.f10912v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m2879k() {
        final VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.1

            /* renamed from: a */
            boolean f10914a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f10914a) {
                    C3304g.this.m2892b(false);
                }
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3304g.this.f10908r.visible(true);
                C3304g.this.f10904n.visible(false);
                C3304g.this.m2877l();
            }
        };
        vTweenParam.setRotationX(0.0f);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTween.m10747to(C3304g.this.f10905o, 500, vTweenParam);
            }
        };
        vTweenParam2.setSPY(42.0f);
        VTween.m10747to(this.f10907q, 500, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m2877l() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3304g.this.m2889e();
                C3304g.this.mo2855a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3304g.this.m2889e();
            }
        };
        vTweenParam.setEase(VEasing.Back.easeOut);
        vTweenParam.setRotationY(180.0f);
        VTween.m10747to(this.f10910t, 800, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3304g.this.f10912v.setAngle((float) (f * 0.5d));
                C3304g.this.f10913w.apply();
                C3304g.this.f10910t.updatePointsVBO();
                C3304g.this.m2889e();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3304g.this.m2874o();
            }
        };
        vTweenParam2.setEase(VEasing.Linear.easeNone);
        VTween.killTween(this.f10903m);
        VTween.m10747to(this.f10903m, VEasing.Back.easeIn, vTweenParam2);
    }

    /* renamed from: m */
    private void m2876m() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.5
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3304g.this.f10908r.visible(false);
                C3304g.this.f10904n.visible(true);
                C3304g.this.m2889e();
                C3304g.this.m2875n();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3304g.this.m2889e();
            }
        };
        vTweenParam.setEase(VEasing.Back.easeOut);
        vTweenParam.setRotationY(0.0f);
        VTween.m10747to(this.f10910t, 800, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.6
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3304g.this.f10912v.setAngle((float) (f * 0.5d));
                C3304g.this.f10913w.apply();
                C3304g.this.f10910t.updatePointsVBO();
                C3304g.this.m2889e();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3304g.this.m2874o();
            }
        };
        vTweenParam2.setEase(VEasing.Linear.easeNone);
        VTween.m10747to(this.f10903m, VEasing.Back.easeIn, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m2875n() {
        final VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.7
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.7.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        C3304g.this.m2879k();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.m10747to(C3304g.this, 1, vTweenParam2);
            }
        };
        vTweenParam.setSPY(130.0f);
        vTweenParam.setEase(300);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.8

            /* renamed from: a */
            boolean f10924a = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f10924a) {
                    C3304g.this.m2892b(true);
                }
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTween.m10747to(C3304g.this.f10907q, 1500, vTweenParam);
            }
        };
        vTweenParam2.setRotationX(-180.0f);
        VTween.m10747to(this.f10905o, 300, vTweenParam2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m2892b(boolean z) {
        if (z) {
            this.f10906p.setZOrderOnTop();
            this.f10905o.setZOrderOnTop();
            this.f10907q.setZOrderOnTop();
            this.f10911u.setZOrderOnTop();
            return;
        }
        this.f10906p.setZOrderOnTop();
        this.f10907q.setZOrderOnTop();
        this.f10911u.setZOrderOnTop();
        this.f10905o.setZOrderOnTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m2874o() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.g.9
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3304g.this.f10912v.setAngle((1.0f - f) * 0.5f);
                C3304g.this.f10913w.apply();
                C3304g.this.f10910t.updatePointsVBO();
                C3304g.this.m2889e();
            }
        };
        vTweenParam.setEase(VEasing.Linear.easeNone);
        VTween.killTween(this.f10903m);
        VTween.m10747to(this.f10903m, 300, vTweenParam);
    }

    /* renamed from: e */
    public void m2889e() {
        int size = this.f10910t.point().size();
        for (int i = 0; i < size; i++) {
            this.f10909s.point().setSP(i, this.f10910t.point().getAsNumber3dSP(i));
        }
        this.f10909s.rotation().f2527y = this.f10910t.rotation().f2527y + 180.0f;
        this.f10909s.updatePointsVBO();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_message_back_inside, this.f10906p);
            mo2854a(C1306b.C1310d.widget_preview_message_content, this.f10907q);
            mo2854a(C1306b.C1310d.widget_preview_message_back_no_flap, this.f10911u);
            mo2854a(C1306b.C1310d.widget_preview_message_back_flag_back, this.f10905o);
            mo2854a(C1306b.C1310d.widget_preview_message_back, this.f10910t);
            mo2854a(C1306b.C1310d.widget_preview_message_front, this.f10909s);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_message_back_inside) {
            this.f10900f = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_message_content) {
            this.f10898d = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_message_back_no_flap) {
            this.f10897c = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_message_back_flag_back) {
            this.f10899e = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_message_back) {
            this.f10896b = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_message_front) {
            this.f10895a = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10900f);
            this.f10906p.textures().removeAll();
            this.f10961j.deleteTexture(this.f10898d);
            this.f10907q.textures().removeAll();
            this.f10961j.deleteTexture(this.f10897c);
            this.f10911u.textures().removeAll();
            this.f10961j.deleteTexture(this.f10899e);
            this.f10905o.textures().removeAll();
            this.f10961j.deleteTexture(this.f10896b);
            this.f10910t.textures().removeAll();
            this.f10961j.deleteTexture(this.f10895a);
            this.f10909s.textures().removeAll();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        m2876m();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        VTween.killTween(this.f10907q);
        VTween.killTween(this.f10905o);
        VTween.killTween(this.f10908r);
        VTween.killTween(this.f10904n);
        VTween.killTween(this.f10910t);
        VTween.killTween(this.f10903m);
        VTween.killTween(this);
        this.f10907q.position().spY(42.0f);
        this.f10905o.rotation().f2526x = 0.0f;
        m2892b(false);
        this.f10908r.visible(true);
        this.f10904n.visible(false);
        this.f10910t.rotation().f2527y = 180.0f;
        this.f10912v.setAngle(0.0f);
        this.f10913w.apply();
        this.f10910t.updatePointsVBO();
        m2889e();
    }
}
