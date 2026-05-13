package com.tsf.shell.p096f.p131f.p141b;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0974h;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.censivn.C3DEngine.p052c.C1070a;
import com.censivn.C3DEngine.p052c.p055b.C1079a;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.p096f.p131f.C2948l;
/* renamed from: com.tsf.shell.f.f.b.f */
/* loaded from: classes.dex */
public class C2894f extends C2948l {

    /* renamed from: a */
    private C0980j f9420a;

    /* renamed from: b */
    private C0974h f9421b;

    /* renamed from: c */
    private C1070a f9422c;

    /* renamed from: d */
    private C1079a f9423d;

    /* renamed from: e */
    private int f9424e;

    /* renamed from: f */
    private C1013b f9425f;

    /* renamed from: g */
    private C0981k f9426g;

    /* renamed from: h */
    private boolean f9427h;

    public C2894f(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_effect_cylinder, z);
        this.f9424e = 2;
        this.f9425f = new C1013b();
        this.f9427h = false;
        if (this.f9421b == null) {
            this.f9420a = new C0980j();
            this.f9421b = new C0974h(C0892a.f2555F, C0892a.f2556G, 20, 1, new Color4(0, 0, 0, 0), false, false, false);
            this.f9426g = new C0981k(C0892a.f2555F, C0892a.m10742a(20.0f), 20, 1, false);
            this.f9426g.setDefaultColor(new Color4(255, 0, 0, 255));
            this.f9421b.useVBO(false);
            this.f9421b.doubleSidedEnabled(true);
            this.f9420a.addChild(this.f9421b);
            this.f9422c = new C1070a(this.f9421b);
            this.f9423d = new C1079a(0.0f, 0.0f);
            this.f9423d.m9915a(1);
            this.f9423d.m9913b(0.5f);
            this.f9422c.m9974a(this.f9423d);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public boolean mo4138b() {
        return this.f9427h;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4137b(float f, float f2) {
        boolean m3917b = C3359a.f11094h.m4021s().m3917b();
        final float m9914b = this.f9423d.m9914b();
        if (m3917b) {
            if (this.f9424e != 1) {
                this.f9424e = 1;
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.b.f.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f3) {
                        C2894f.this.f9423d.m9916a(m9914b + ((0.5f - m9914b) * f3));
                        C2894f.this.f9422c.m9976a();
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2894f.this.f9427h = true;
                    }
                };
                C1014c.m10326a(this.f9425f);
                C1014c.m10325a(this.f9425f, VEasing.Linear.easeNone, c1017d);
                this.f9427h = false;
            }
        } else if (this.f9424e != 2) {
            this.f9424e = 2;
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.b.f.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f3) {
                    C2894f.this.f9423d.m9916a(m9914b + ((0.0f - m9914b) * f3));
                    C2894f.this.f9422c.m9976a();
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2894f.this.f9427h = true;
                }
            };
            C1014c.m10326a(this.f9425f);
            C1014c.m10325a(this.f9425f, VEasing.Linear.easeNone, c1017d2);
            this.f9427h = false;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        c2932g.position().f2526x = 0.0f;
        C2942j.C2943a m4191j = c2932g.m4191j();
        this.f9421b.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.f9421b.position().f2528z = (C0892a.f2553D / 5) * 3;
        this.f9420a.position().f2528z = -this.f9421b.position().f2528z;
        this.f9420a.rotation().f2527y = 180.0f * f;
        this.f9421b.textures().clear();
        this.f9421b.textures().addElement(m4191j.f9574b);
        this.f9420a.dispatchDraw();
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        float f2 = 180.0f * f;
        if (f2 < 90.0f && f2 > -90.0f) {
            c2932g.setRendererPriorityLevel(1);
        } else {
            c2932g.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4142a(float f, float f2) {
        if (this.f9421b != null) {
            this.f9421b.m10373a(f);
            this.f9421b.m10371b(f2);
            this.f9422c.m9975a(this.f9421b);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4143a() {
        return true;
    }
}
