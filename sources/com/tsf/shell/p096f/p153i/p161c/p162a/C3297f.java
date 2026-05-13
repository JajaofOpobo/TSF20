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
/* renamed from: com.tsf.shell.f.i.c.a.f */
/* loaded from: classes.dex */
public class C3297f extends AbstractC3322j {

    /* renamed from: a */
    public TextureElement f10881a;

    /* renamed from: b */
    public TextureElement f10882b;

    /* renamed from: c */
    private VRectangle f10883c;

    /* renamed from: d */
    private VRectangle f10884d;

    /* renamed from: e */
    private VTwist f10885e;

    /* renamed from: f */
    private VEffectsStack f10886f;

    /* renamed from: g */
    private VObject3dContainer f10887g;

    /* renamed from: h */
    private VValueTweenTarget f10888h;

    public C3297f(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10888h = new VValueTweenTarget();
        m2899h();
    }

    /* renamed from: h */
    private void m2899h() {
        this.f10887g = new VObject3dContainer();
        this.f10883c = new VRectangle(256.0f, 256.0f, 4, 4);
        this.f10884d = new VRectangle(256.0f, 256.0f, 4, 4, true);
        this.f10884d.position().f2526x = -2.0f;
        this.f10884d.visible(false);
        this.f10887g.addChild(this.f10883c);
        this.f10887g.addChild(this.f10884d);
        this.f10885e = new VTwist(0.0f);
        this.f10885e.setCenter(new Vector3(0.0f, -128.0f, 0.0f));
        this.f10886f = new VEffectsStack(this.f10883c);
        this.f10886f.addModifier(this.f10885e);
        addChild(this.f10887g);
    }

    /* renamed from: i */
    private void m2898i() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setScaleX(1.2f);
        vTweenParam.setScaleY(1.2f);
        vTweenParam.setScaleX(1.2f);
        VTween.m10747to(this.f10887g, 900, vTweenParam);
        this.f10884d.visible(true);
        this.f10883c.rotation().f2527y = 0.0f;
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.1
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.1.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        C3297f.this.m2897j();
                    }
                };
                vTweenParam3.setTimeout(1000);
                VTween.killTween(C3297f.this.f10887g);
                VTween.m10747to(C3297f.this.f10887g, 1, vTweenParam3);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3297f.this.m2903e();
            }
        };
        vTweenParam2.setEase(VEasing.Back.easeOut);
        vTweenParam2.setRotationY(180.0f);
        VTween.m10747to(this.f10883c, 900, vTweenParam2);
        VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.2
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3297f.this.f10885e.setAngle((float) (f * 0.5d));
                C3297f.this.f10886f.apply();
                C3297f.this.f10883c.updatePointsVBO();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3297f.this.m2896k();
            }
        };
        vTweenParam3.setEase(VEasing.Linear.easeNone);
        VTween.m10747to(this.f10888h, VEasing.Back.easeIn, vTweenParam3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m2897j() {
        VTweenParam vTweenParam = new VTweenParam();
        vTweenParam.setScaleX(1.0f);
        vTweenParam.setScaleY(1.0f);
        vTweenParam.setScaleX(1.0f);
        VTween.m10747to(this.f10887g, 1100, vTweenParam);
        VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.3
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3297f.this.f10884d.visible(false);
                C3297f.this.mo2855a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3297f.this.m2903e();
            }
        };
        vTweenParam2.setEase(VEasing.Back.easeOut);
        vTweenParam2.setRotationY(0.0f);
        VTween.m10747to(this.f10883c, 1100, vTweenParam2);
        VTweenParam vTweenParam3 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.4
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3297f.this.f10885e.setAngle((float) (f * 0.5d));
                C3297f.this.f10886f.apply();
                C3297f.this.f10883c.updatePointsVBO();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3297f.this.m2896k();
            }
        };
        vTweenParam3.setEase(VEasing.Linear.easeNone);
        VTween.m10747to(this.f10888h, 300, vTweenParam3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m2896k() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.f.5
            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C3297f.this.f10885e.setAngle((float) ((1.0f - f) * 0.5d));
                C3297f.this.f10886f.apply();
                C3297f.this.f10883c.updatePointsVBO();
            }
        };
        vTweenParam.setEase(VEasing.Linear.easeNone);
        VTween.m10747to(this.f10888h, VEasing.Linear.easeNone, vTweenParam);
    }

    /* renamed from: e */
    public void m2903e() {
        int size = this.f10883c.point().size();
        for (int i = 0; i < size; i++) {
            this.f10884d.point().setSP(i, this.f10883c.point().getAsNumber3dSP(i));
        }
        this.f10884d.rotation().f2527y = this.f10883c.rotation().f2527y + 180.0f;
        this.f10884d.updatePointsVBO();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        m2898i();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        VTween.killTween(this.f10888h);
        VTween.killTween(this.f10883c);
        VTween.killTween(this.f10887g);
        this.f10887g.scale().setAll(1.0f, 1.0f, 1.0f);
        this.f10883c.rotation().f2527y = 0.0f;
        this.f10884d.visible(false);
        this.f10885e.setAngle(0.0f);
        this.f10886f.apply();
        this.f10883c.updatePointsVBO();
        m2903e();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_memo_bg_logo, this.f10883c);
            mo2854a(C1306b.C1310d.widget_preview_memo_bg, this.f10884d);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_memo_bg_logo) {
            this.f10881a = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_memo_bg) {
            this.f10882b = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10881a);
            this.f10961j.deleteTexture(this.f10882b);
            this.f10883c.textures().removeAll();
            this.f10884d.textures().removeAll();
        }
    }
}
