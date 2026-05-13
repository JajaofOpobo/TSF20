package com.tsf.shell.p096f.p107d.p116e.p117a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p107d.p116e.C2437a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p157b.C3124a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.e.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC2446b implements C2437a.InterfaceC2441a {

    /* renamed from: a */
    private int f8052a;

    /* renamed from: b */
    private boolean f8053b = false;

    /* renamed from: c */
    private boolean f8054c = false;

    /* renamed from: a */
    public abstract void mo5546a(C2932g c2932g, float f, ArrayList<C0975i> arrayList, Runnable runnable);

    public AbstractC2446b(int i) {
        this.f8052a = i;
    }

    /* renamed from: b */
    public boolean mo5543b() {
        return true;
    }

    /* renamed from: a */
    public boolean mo5548a() {
        return false;
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
            boolean r1 = r12.mo5543b()
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
            boolean r0 = r12.mo5543b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p107d.p116e.p117a.AbstractC2446b.mo4363b(com.censivn.C3DEngine.b.f.a.a, java.lang.Runnable):void");
    }

    /* renamed from: a */
    public void mo5545a(C2932g c2932g, ArrayList<C0975i> arrayList, Runnable runnable, boolean z) {
        if (!z) {
            m5544a(arrayList, runnable);
            return;
        }
        C1017d c1017d = null;
        C0975i c0975i = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * arrayList.size())) : null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            C0975i c0975i2 = arrayList.get(i2);
            if (c0975i2 instanceof C3112b) {
                C3112b c3112b = (C3112b) c0975i2;
                C1017d c1017d2 = new C1017d();
                if (mo5543b()) {
                    if (c0975i2 == c0975i) {
                        c1017d2.m10309b(300);
                        c1017d = c1017d2;
                    } else {
                        c1017d2.m10309b((int) (Math.random() * 300.0d));
                    }
                }
                if (c3112b instanceof C3124a) {
                    C3124a c3124a = (C3124a) c3112b;
                    if (C0892a.f2564O) {
                        c1017d2.mo10301f(c3124a.m3456b(c3112b.m3534K().cellX));
                        c1017d2.mo10298h(c3124a.m3452c(c3112b.m3534K().cellY));
                        c1017d2.m10303e(0.0f);
                    } else {
                        c1017d2.mo10301f(c3124a.m3456b(c3112b.m3534K().cellXH));
                        c1017d2.mo10298h(c3124a.m3452c(c3112b.m3534K().cellYH));
                        c1017d2.m10303e(0.0f);
                    }
                } else if (c3112b.m3534K() == null) {
                    Number3d number3d = C2862h.f9292E.get(i2);
                    c1017d2.mo10301f(number3d.f2526x);
                    c1017d2.mo10298h(number3d.f2527y);
                    c1017d2.m10303e(0.0f);
                } else if (C0892a.f2564O) {
                    c1017d2.mo10301f(c3112b.m3534K().cellX);
                    c1017d2.mo10298h(c3112b.m3534K().cellY);
                    c1017d2.m10303e(c3112b.m3534K().rotation);
                } else {
                    c1017d2.mo10301f(c3112b.m3534K().cellXH);
                    c1017d2.mo10298h(c3112b.m3534K().cellYH);
                    c1017d2.m10303e(c3112b.m3534K().rotationH);
                }
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                c1017d2.m10307c(0.0f);
                c1017d2.m10305d(0.0f);
                c1017d2.m10313a(C0986a.f2946a);
                C1014c.m10326a(c0975i2);
                C1014c.m10325a(c0975i2, mo5542d(), c1017d2);
                if (!mo5543b()) {
                    c1017d = c1017d2;
                }
            }
            i = i2 + 1;
        }
        if (c1017d != null) {
            c1017d.m10311a(runnable);
        } else if (runnable != null) {
            C0853a.m10865a().m10584b(runnable, mo5542d());
        }
    }

    /* renamed from: a */
    public void m5544a(ArrayList<C0975i> arrayList, Runnable runnable) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            C0975i c0975i = arrayList.get(i2);
            if (c0975i instanceof C3112b) {
                C3112b c3112b = (C3112b) c0975i;
                if (c3112b instanceof C3124a) {
                    C3124a c3124a = (C3124a) c3112b;
                    if (C0892a.f2564O) {
                        c3112b.position().f2526x = c3124a.m3456b(c3112b.m3534K().cellX);
                        c3112b.position().f2527y = c3124a.m3452c(c3112b.m3534K().cellY);
                        c3112b.rotation().f2528z = 0.0f;
                    } else {
                        c3112b.position().f2526x = c3124a.m3456b(c3112b.m3534K().cellXH);
                        c3112b.position().f2527y = c3124a.m3452c(c3112b.m3534K().cellYH);
                        c3112b.rotation().f2528z = 0.0f;
                    }
                } else if (c3112b.m3534K() == null) {
                    Number3d number3d = C2862h.f9292E.get(i2);
                    c3112b.position().f2526x = number3d.f2526x;
                    c3112b.position().f2527y = number3d.f2527y;
                    c3112b.position().f2528z = 0.0f;
                } else if (C0892a.f2564O) {
                    c3112b.position().f2526x = c3112b.m3534K().cellX;
                    c3112b.position().f2527y = c3112b.m3534K().cellY;
                    c3112b.rotation().f2528z = c3112b.m3534K().rotation;
                } else {
                    c3112b.position().f2526x = c3112b.m3534K().cellXH;
                    c3112b.position().f2527y = c3112b.m3534K().cellYH;
                    c3112b.rotation().f2528z = c3112b.m3534K().rotationH;
                }
                c3112b.scale().f2526x = 1.0f;
                c3112b.scale().f2527y = 1.0f;
                c3112b.rotation().f2526x = 0.0f;
                c3112b.rotation().f2527y = 0.0f;
            }
            i = i2 + 1;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public int mo5542d() {
        return VEasing.Linear.easeNone;
    }

    /* renamed from: e */
    public int m5541e() {
        return 500;
    }

    /* renamed from: a */
    public void mo5547a(C2932g c2932g) {
    }
}
