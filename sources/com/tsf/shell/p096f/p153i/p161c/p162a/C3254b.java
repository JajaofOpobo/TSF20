package com.tsf.shell.p096f.p153i.p161c.p162a;

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
import com.tsf.C1306b;
import org.acra.ACRAConstants;
/* renamed from: com.tsf.shell.f.i.c.a.b */
/* loaded from: classes.dex */
public class C3254b extends AbstractC3322j {

    /* renamed from: a */
    public TextureElement f10696a;

    /* renamed from: b */
    public TextureElement f10697b;

    /* renamed from: c */
    public TextureElement f10698c;

    /* renamed from: d */
    public TextureElement f10699d;

    /* renamed from: e */
    public TextureElement f10700e;

    /* renamed from: f */
    public TextureElement f10701f;

    /* renamed from: g */
    private final int f10702g;

    /* renamed from: h */
    private VRectangle f10703h;

    /* renamed from: m */
    private VButton f10704m;

    /* renamed from: n */
    private VObject3dContainer f10705n;

    /* renamed from: o */
    private VObject3dContainer f10706o;

    /* renamed from: p */
    private VObject3dContainer f10707p;

    /* renamed from: q */
    private VButton f10708q;

    /* renamed from: r */
    private VRectangle f10709r;

    /* renamed from: s */
    private VRectangle f10710s;

    /* renamed from: t */
    private VRectangle f10711t;

    /* renamed from: u */
    private float f10712u;

    public C3254b(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10702g = 1000;
        this.f10712u = 0.5f;
        scale().f2526x = this.f10712u;
        scale().f2527y = this.f10712u;
        scale().f2528z = this.f10712u;
        m2993e();
    }

    /* renamed from: e */
    private void m2993e() {
        this.f10706o = new VObject3dContainer();
        m2990j();
        m2989k();
        addChild(this.f10706o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m2992h() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.1

            /* renamed from: b */
            private boolean f10714b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                C3254b.this.mo2855a();
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f10714b) {
                    C3254b.this.m2994b(false);
                    this.f10714b = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(0.0f);
        VTween.killTween(this.f10706o);
        VTween.m10747to(this.f10706o, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* renamed from: i */
    private void m2991i() {
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.2

            /* renamed from: b */
            private boolean f10716b = false;

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                VTweenParam vTweenParam2 = new VTweenParam() { // from class: com.tsf.shell.f.i.c.a.b.2.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        C3254b.this.m2992h();
                    }
                };
                vTweenParam2.setTimeout(1000);
                VTween.m10747to(C3254b.this, 1, vTweenParam2);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                if (f > 0.5f && !this.f10716b) {
                    C3254b.this.m2994b(false);
                    this.f10716b = true;
                }
            }
        };
        vTweenParam.setEase(300);
        vTweenParam.setRotationY(180.0f);
        VTween.killTween(this.f10706o);
        VTween.m10747to(this.f10706o, ACRAConstants.DEFAULT_CONNECTION_TIMEOUT, vTweenParam);
    }

    /* renamed from: b */
    public void m2994b(boolean z) {
    }

    /* renamed from: j */
    private void m2990j() {
        this.f10707p = new VObject3dContainer();
        this.f10707p.position().spZ(-10.0f);
        this.f10707p.rotation().f2527y = 180.0f;
        this.f10711t = new VRectangle(416.0f, 416.0f);
        this.f10711t.doubleSidedEnabled(true);
        this.f10707p.addChild(this.f10711t);
        this.f10710s = new VRectangle(316.0f, 316.0f);
        this.f10710s.position().spZ(50.0f);
        this.f10707p.addChild(this.f10710s);
        this.f10709r = new VRectangle(296.66666f, 107.49999f);
        this.f10709r.position().spX(96.0f);
        this.f10709r.position().spZ(100.0f);
        this.f10707p.addChild(this.f10709r);
        this.f10708q = new VButton(7, 1, 127, 525);
        float f = 90.0f;
        for (int i = 0; i < 7; i++) {
            VButtonItem item = this.f10708q.getItem(i);
            item.setTextureAllAndMathSizeSP(0, i * 75, 127, 75);
            item.position().spY((float) (Math.cos(Math.toRadians(f)) * 215.0d));
            item.position().spX(-((float) (Math.sin(Math.toRadians(f)) * 215.0d)));
            item.rotation().f2528z = f;
            item.scale().setAll(0.83f, 0.83f, 0.83f);
            item.updateAll();
            f -= 24.0f;
        }
        this.f10707p.addChild(this.f10708q);
        this.f10706o.addChild(this.f10707p);
    }

    /* renamed from: k */
    private void m2989k() {
        this.f10705n = new VObject3dContainer();
        this.f10705n.position().spZ(10.0f);
        this.f10703h = new VRectangle(416.0f, 416.0f);
        this.f10705n.addChild(this.f10703h);
        this.f10704m = new VButton(6, 1, 300, 534);
        VButtonItem item = this.f10704m.getItem(0);
        item.setTextureAllAndMathSizeSP(0, 0, 300, 234);
        item.position().spY(180.0f);
        item.position().spZ(100.0f);
        item.scale().setAll(0.8f, 0.8f, 0.8f);
        item.updateAll();
        VButtonItem item2 = this.f10704m.getItem(1);
        item2.setTextureAllAndMathSizeSP(0, 234, 300, 78);
        item2.position().spY(75.0f);
        item2.position().spZ(90.0f);
        item2.scale().setAll(0.8f, 0.8f, 0.8f);
        item2.updateAll();
        VButtonItem item3 = this.f10704m.getItem(2);
        item3.setTextureAllAndMathSizeSP(0, 312, 300, 48);
        item3.position().spY(40.0f);
        item3.position().spZ(60.0f);
        item3.scale().setAll(0.8f, 0.8f, 0.8f);
        item3.updateAll();
        VButtonItem item4 = this.f10704m.getItem(3);
        item4.setTextureAllAndMathSizeSP(0, 360, 300, 40);
        item4.position().spY(5.0f);
        item4.position().spZ(40.0f);
        item4.scale().setAll(0.8f, 0.8f, 0.8f);
        item4.updateAll();
        VButtonItem item5 = this.f10704m.getItem(4);
        item5.setTextureAllAndMathSizeSP(0, VEasing.Linear.easeNone, 300, 89);
        item5.position().spY(-45.0f);
        item5.position().spZ(100.0f);
        item5.scale().setAll(0.9f, 0.9f, 0.9f);
        item5.updateAll();
        VButtonItem item6 = this.f10704m.getItem(5);
        item6.setTextureAllAndMathSizeSP(0, 489, 300, 45);
        item6.position().spY(-100.0f);
        item6.position().spZ(80.0f);
        item6.scale().setAll(0.8f, 0.8f, 0.8f);
        item6.updateAll();
        this.f10705n.addChild(this.f10704m);
        this.f10706o.addChild(this.f10705n);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_alarm_frontbg, this.f10703h);
            mo2854a(C1306b.C1310d.widget_preview_alarm_front_content, this.f10704m);
            mo2854a(C1306b.C1310d.widget_preview_alarm_back_bg, this.f10711t);
            mo2854a(C1306b.C1310d.widget_preview_alarm_small_circle, this.f10710s);
            mo2854a(C1306b.C1310d.widget_preview_alarm_toggle, this.f10709r);
            mo2854a(C1306b.C1310d.widget_preview_alarm_week, this.f10708q);
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_alarm_frontbg) {
            this.f10696a = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_alarm_front_content) {
            this.f10697b = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_alarm_back_bg) {
            this.f10698c = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_alarm_small_circle) {
            this.f10699d = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_alarm_toggle) {
            this.f10700e = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_alarm_week) {
            this.f10701f = textureElement;
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10696a);
            this.f10703h.textures().removeAll();
            this.f10961j.deleteTexture(this.f10697b);
            this.f10704m.textures().removeAll();
            this.f10961j.deleteTexture(this.f10698c);
            this.f10711t.textures().removeAll();
            this.f10961j.deleteTexture(this.f10699d);
            this.f10710s.textures().removeAll();
            this.f10961j.deleteTexture(this.f10700e);
            this.f10709r.textures().removeAll();
            this.f10961j.deleteTexture(this.f10701f);
            this.f10708q.textures().removeAll();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        m2991i();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        VTween.killTween(this.f10706o);
        VTween.killTween(this);
        m2994b(false);
        this.f10706o.rotation().f2527y = 0.0f;
    }
}
