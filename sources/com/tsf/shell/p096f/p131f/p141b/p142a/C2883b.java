package com.tsf.shell.p096f.p131f.p141b.p142a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.b.a.b */
/* loaded from: classes.dex */
public class C2883b extends C2885d {

    /* renamed from: b */
    private boolean f9407b;

    /* renamed from: c */
    private boolean f9408c;

    public C2883b(int i, boolean z, boolean z2, boolean z3) {
        super(i, z3);
        this.f9407b = z;
        this.f9408c = z2;
    }

    @Override // com.tsf.shell.p096f.p131f.p141b.p142a.C2885d
    /* renamed from: a */
    public void mo4359a(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
        C0975i c0975i = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * arrayList.size())) : null;
        C1017d c1017d = null;
        for (int i = 0; i < arrayList.size(); i++) {
            C0975i c0975i2 = arrayList.get(i);
            C1014c.m10326a(c0975i2);
            if (c0975i2 instanceof C3112b) {
                Number3d number3d = C2862h.f9292E.get(i);
                if (z) {
                    C1017d c1017d2 = new C1017d();
                    if (c0975i2 == c0975i) {
                        c1017d2.m10309b(60);
                        c1017d = c1017d2;
                    } else {
                        c1017d2.m10309b((int) (Math.random() * 50.0d));
                    }
                    c1017d2.mo10301f(number3d.f2526x);
                    c1017d2.mo10298h(number3d.f2527y);
                    c1017d2.m10303e(0.0f);
                    c1017d2.m10294l(1.0f);
                    c1017d2.m10293m(1.0f);
                    c1017d2.m10307c(0.0f);
                    c1017d2.m10305d(0.0f);
                    c1017d2.m10314a(255);
                    c1017d2.m10313a(C0986a.f2959n);
                    C1014c.m10325a(c0975i2, AbstractC2580c.ANIMATION_TIME, c1017d2);
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
    private C1017d m4366a(C0975i c0975i, float f, float f2, boolean z) {
        C1014c.m10326a(c0975i);
        if (z) {
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(f);
            c1017d.mo10298h(f2);
            if (this.f9408c) {
                c1017d.m10294l(3.0f);
                c1017d.m10293m(3.0f);
            } else {
                c1017d.m10294l(1.5f);
                c1017d.m10293m(1.5f);
            }
            c1017d.m10314a(0);
            if (this.f9407b) {
                if (f > 0.0f) {
                    c1017d.m10305d(50.0f);
                } else {
                    c1017d.m10305d(-50.0f);
                }
                if (f2 > 0.0f) {
                    c1017d.m10307c(-50.0f);
                } else {
                    c1017d.m10307c(50.0f);
                }
            }
            C1014c.m10325a(c0975i, 600, c1017d);
            return c1017d;
        }
        c0975i.position().f2526x = f;
        c0975i.position().f2527y = f2;
        if (this.f9407b) {
            if (f > 0.0f) {
                c0975i.rotation().f2527y = 50.0f;
            } else {
                c0975i.rotation().f2527y = -50.0f;
            }
            if (f2 > 0.0f) {
                c0975i.rotation().f2526x = -50.0f;
            } else {
                c0975i.rotation().f2526x = 50.0f;
            }
        }
        if (this.f9408c) {
            c0975i.scale().f2526x = 3.0f;
            c0975i.scale().f2527y = 3.0f;
        } else {
            c0975i.scale().f2526x = 1.5f;
            c0975i.scale().f2527y = 1.5f;
        }
        return null;
    }

    @Override // com.tsf.shell.p096f.p131f.p141b.p142a.C2885d
    /* renamed from: b */
    public void mo4358b(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
        C1017d c1017d;
        C1017d c1017d2;
        int i;
        int i2;
        C1017d c1017d3;
        float f;
        C1017d c1017d4;
        float f2;
        C1017d c1017d5;
        float f3;
        int i3 = C2862h.f9299p;
        int i4 = C2862h.f9300q;
        int i5 = C0892a.f2555F;
        int i6 = C0892a.f2556G;
        float f4 = C3566b.f11839a.f11750H;
        float f5 = C3566b.f11839a.f11751I;
        float m10742a = this.f9408c ? C0892a.m10742a(100.0f) : 0.0f;
        int size = arrayList.size();
        float f6 = ((-i5) / 2.0f) + (f4 / 2.0f);
        float f7 = (i5 - f4) / (i3 - 1);
        float f8 = f7 < 0.0f ? 0.0f : f7;
        int i7 = 0;
        float f9 = f6;
        C1017d c1017d6 = null;
        while (i7 < i3) {
            if (i7 < size) {
                c1017d5 = m4366a(arrayList.get(i7), f9, (i6 / 2.0f) + f5 + m10742a, z);
                f3 = f9 + f8;
            } else {
                c1017d5 = c1017d6;
                f3 = f9;
            }
            i7++;
            f9 = f3;
            c1017d6 = c1017d5;
        }
        int i8 = (i3 * i4) - i3;
        if (i8 < size) {
            int i9 = i8;
            c1017d = c1017d6;
            while (i9 < size) {
                float f10 = f6 + f8;
                C1017d m4366a = m4366a(arrayList.get(i9), f6, (((-i6) / 2.0f) - f5) - m10742a, z);
                i9++;
                c1017d = m4366a;
                f6 = f10;
            }
        } else {
            c1017d = c1017d6;
        }
        if (size <= i3 || i4 - 2 <= 0) {
            c1017d2 = c1017d;
        } else {
            int i10 = i4 - 1;
            float f11 = i == 1 ? 0.0f : (i6 / 2.0f) - (f5 / 2.0f);
            float f12 = i == 1 ? 0.0f : (i6 - f5) / (i - 1);
            int i11 = i3 - (i3 / 2);
            float f13 = (((-i5) / 2.0f) - ((i3 - i2) * f4)) - m10742a;
            float f14 = (i5 / 2.0f) + f4 + m10742a;
            float f15 = f11;
            c1017d2 = c1017d;
            int i12 = 1;
            while (i12 < i10) {
                int i13 = 0;
                float f16 = f13;
                while (i13 < i11) {
                    int i14 = (i12 * i3) + i13;
                    if (i14 < size) {
                        f2 = f16 + f4;
                        c1017d4 = m4366a(arrayList.get(i14), f16, f15, z);
                    } else {
                        float f17 = f16;
                        c1017d4 = c1017d2;
                        f2 = f17;
                    }
                    i13++;
                    float f18 = f2;
                    c1017d2 = c1017d4;
                    f16 = f18;
                }
                int i15 = i11;
                float f19 = f14;
                while (i15 < i3) {
                    int i16 = (i12 * i3) + i15;
                    if (i16 < size) {
                        f = f19 + f4;
                        c1017d3 = m4366a(arrayList.get(i16), f19, f15, z);
                    } else {
                        float f20 = f19;
                        c1017d3 = c1017d2;
                        f = f20;
                    }
                    i15++;
                    float f21 = f;
                    c1017d2 = c1017d3;
                    f19 = f21;
                }
                i12++;
                f15 -= f12;
            }
        }
        if (c1017d2 != null) {
            c1017d2.m10311a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p141b.p142a.C2885d, com.tsf.shell.p096f.p107d.p116e.C2437a.InterfaceC2441a
    /* renamed from: a */
    public void mo4360a(C0962a c0962a, Runnable runnable) {
        C1017d c1017d = null;
        float f = C0892a.f2567c * 25.0f;
        for (int i = 0; i < c0962a.m10459a(); i++) {
            C0964b m10456a = c0962a.m10456a(i);
            c1017d = new C1017d();
            float abs = Math.abs((float) Math.sqrt((m10456a.f2853m.f2526x * m10456a.f2853m.f2526x) + (m10456a.f2853m.f2527y * m10456a.f2853m.f2527y)));
            float f2 = (m10456a.f2853m.f2526x * (abs + f)) / abs;
            float f3 = (m10456a.f2853m.f2527y * (abs + f)) / abs;
            c1017d.mo10301f(f2);
            c1017d.mo10298h(f3);
            if (this.f9408c) {
                c1017d.m10294l(1.4f);
                c1017d.m10293m(1.4f);
            }
            if (this.f9407b) {
                if (f2 > 0.0f) {
                    c1017d.m10305d(50.0f);
                } else {
                    c1017d.m10305d(-50.0f);
                }
                if (f3 > 0.0f) {
                    c1017d.m10307c(-50.0f);
                } else {
                    c1017d.m10307c(50.0f);
                }
            }
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 700, c1017d);
        }
        if (c1017d != null) {
            c1017d.m10311a(runnable);
            c1017d.m10308b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
