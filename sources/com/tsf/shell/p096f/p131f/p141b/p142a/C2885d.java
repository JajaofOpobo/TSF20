package com.tsf.shell.p096f.p131f.p141b.p142a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p177i.C3498a;
import com.tsf.shell.p096f.p107d.p116e.C2437a;
import com.tsf.shell.p096f.p131f.AbstractC2941i;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.b.a.d */
/* loaded from: classes.dex */
public class C2885d extends AbstractC2941i implements C2437a.InterfaceC2441a {

    /* renamed from: b */
    private C2437a f9411b;

    public C2885d(int i, boolean z) {
        super(i, 0, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public float m4365a(int i) {
        return (float) (i - ((i * 2) * Math.random()));
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4140a(C2932g c2932g, C0967a c0967a) {
        return false;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4139a(C2932g c2932g, boolean z) {
        if (c2932g.m4181t() == -1) {
            final C2862h c2862h = (C2862h) c2932g;
            c2862h.m4482aB();
            if (z) {
                c2862h.m4416c((Runnable) null, false);
                mo4358b(c2862h.m4451ap().children(), false, null);
            }
            c2862h.m4433b((Runnable) null, z);
            mo4359a(c2862h.m4451ap().children(), z, new Runnable() { // from class: com.tsf.shell.f.f.b.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    c2862h.m4469aO();
                }
            });
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4135b(C2932g c2932g, boolean z) {
        if (c2932g.m4181t() == -1) {
            C2862h c2862h = (C2862h) c2932g;
            c2862h.m4416c((Runnable) null, true);
            mo4358b(c2862h.m4451ap().children(), z, null);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        if (c2932g.m4181t() == -1) {
            c2932g.dispatchDraw();
            return;
        }
        C2942j.C2943a m4191j = c2932g.m4191j();
        this.f9568a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.f9568a.position().f2527y = C0892a.m10742a(400.0f) * f;
        this.f9568a.textures().clear();
        this.f9568a.textures().addElement(m4191j.f9574b);
        this.f9568a.dispatchDraw();
    }

    /* renamed from: a */
    public static void m4364a(ArrayList<C0975i> arrayList, boolean z, boolean z2, Runnable runnable) {
        C0975i c0975i = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * arrayList.size())) : null;
        C1017d c1017d = null;
        for (int i = 0; i < arrayList.size(); i++) {
            C0975i c0975i2 = arrayList.get(i);
            C1014c.m10326a(c0975i2);
            if (c0975i2 instanceof C3112b) {
                Number3d number3d = C2862h.f9292E.get(i);
                if (z) {
                    C1017d c1017d2 = new C1017d();
                    if (z2) {
                        if (c0975i2 == c0975i) {
                            c1017d2.m10309b(350);
                            c1017d = c1017d2;
                        } else {
                            c1017d2.m10309b((int) (Math.random() * 300.0d));
                        }
                    }
                    c1017d2.mo10301f(number3d.f2526x);
                    c1017d2.mo10298h(number3d.f2527y);
                    c1017d2.m10303e(0.0f);
                    c1017d2.m10294l(1.0f);
                    c1017d2.m10293m(1.0f);
                    c1017d2.m10307c(0.0f);
                    c1017d2.m10305d(0.0f);
                    c1017d2.m10314a(255);
                    c1017d2.m10313a(C0986a.f2946a);
                    C1014c.m10325a(c0975i2, 450, c1017d2);
                    if (C3359a.f11108v.f7771d.m5539b().mo5543b()) {
                        c1017d2 = c1017d;
                    }
                    c1017d = c1017d2;
                } else {
                    c0975i2.position().f2526x = number3d.f2526x;
                    c0975i2.position().f2527y = number3d.f2527y;
                    c0975i2.rotation().f2526x = 0.0f;
                    c0975i2.rotation().f2527y = 0.0f;
                    c0975i2.rotation().f2528z = 0.0f;
                    c0975i2.scale().f2526x = 1.0f;
                    c0975i2.scale().f2527y = 1.0f;
                    c0975i2.alpha(255.0f);
                }
            }
        }
        if (c1017d != null) {
            c1017d.m10311a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo4359a(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
    }

    /* renamed from: b */
    public void mo4358b(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
    }

    /* renamed from: o */
    public C0975i m4362o() {
        if (this.f9411b == null) {
            this.f9411b = new C2437a(this) { // from class: com.tsf.shell.f.f.b.a.d.2
                @Override // com.tsf.shell.p096f.p146g.p147a.C3020h, com.censivn.C3DEngine.p031b.p038f.C0980j
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    C3498a.m2191a(C2885d.this, C0892a.m10742a(20.0f));
                }
            };
        }
        return this.f9411b;
    }

    /* renamed from: p */
    public boolean m4361p() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[SYNTHETIC] */
    @Override // com.tsf.shell.p096f.p107d.p116e.C2437a.InterfaceC2441a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4363b(com.censivn.C3DEngine.p031b.p038f.p039a.C0962a r13, java.lang.Runnable r14) {
        /*
            r12 = this;
            r11 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r2 = 0
            double r0 = java.lang.Math.random()
            int r3 = r13.m10459a()
            double r4 = (double) r3
            double r0 = r0 * r4
            int r0 = (int) r0
            com.censivn.C3DEngine.b.f.a.b r4 = r13.m10456a(r0)
            r0 = 0
            r3 = r0
            r0 = r2
        L16:
            int r1 = r13.m10459a()
            if (r3 >= r1) goto L7c
            com.censivn.C3DEngine.b.f.a.b r5 = r13.m10456a(r3)
            com.censivn.C3DEngine.b.g.d r2 = new com.censivn.C3DEngine.b.g.d
            r2.<init>()
            boolean r1 = r12.m4361p()
            if (r1 == 0) goto L7a
            if (r5 != r4) goto L6c
            r0 = 300(0x12c, float:4.2E-43)
            r2.m10309b(r0)
            r1 = r2
        L33:
            java.util.ArrayList<com.censivn.C3DEngine.api.element.Number3d> r0 = com.tsf.shell.p096f.p107d.p116e.C2437a.f8032a
            java.lang.Object r0 = r0.get(r3)
            com.censivn.C3DEngine.api.element.Number3d r0 = (com.censivn.C3DEngine.api.element.Number3d) r0
            float r6 = r0.f2526x
            r2.mo10301f(r6)
            float r0 = r0.f2527y
            r2.mo10298h(r0)
            r2.m10294l(r11)
            r2.m10293m(r11)
            r2.m10305d(r10)
            r2.m10303e(r10)
            r2.m10307c(r10)
            com.censivn.C3DEngine.b.g.b r0 = com.censivn.C3DEngine.p031b.p041g.C0986a.f2946a
            r2.m10313a(r0)
            com.censivn.C3DEngine.p031b.p041g.C1014c.m10326a(r5)
            r0 = 500(0x1f4, float:7.0E-43)
            com.censivn.C3DEngine.p031b.p041g.C1014c.m10325a(r5, r0, r2)
            boolean r0 = r12.m4361p()
            if (r0 != 0) goto L8b
        L67:
            int r0 = r3 + 1
            r3 = r0
            r0 = r2
            goto L16
        L6c:
            double r6 = java.lang.Math.random()
            r8 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r6 = r6 * r8
            int r1 = (int) r6
            r2.m10309b(r1)
        L7a:
            r1 = r0
            goto L33
        L7c:
            if (r0 == 0) goto L85
            r0.m10311a(r14)
            r0.m10308b(r14)
        L84:
            return
        L85:
            if (r14 == 0) goto L84
            r14.run()
            goto L84
        L8b:
            r2 = r1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p131f.p141b.p142a.C2885d.mo4363b(com.censivn.C3DEngine.b.f.a.a, java.lang.Runnable):void");
    }

    /* renamed from: a */
    public void mo4360a(C0962a c0962a, Runnable runnable) {
    }
}
