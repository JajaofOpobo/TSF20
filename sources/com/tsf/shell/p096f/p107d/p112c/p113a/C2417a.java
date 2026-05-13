package com.tsf.shell.p096f.p107d.p112c.p113a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p126f.C2558a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.c.a.a */
/* loaded from: classes.dex */
public class C2417a extends C2426d {

    /* renamed from: a */
    private static final float f7979a = 268.0f * C0892a.f2567c;

    /* renamed from: c */
    private boolean f7980c;

    public C2417a(int i, boolean z, boolean z2) {
        super(i, z2);
        this.f7980c = false;
        this.f7980c = z;
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5587a(C0962a c0962a, Runnable runnable) {
        float f = 120.0f / 3.0f;
        float f2 = 90.0f - (120.0f / 2.0f);
        for (int i = 0; i < 4; i++) {
            C0964b m10456a = c0962a.m10456a(i);
            double d = f2 * 0.017453292519943295d;
            C1017d c1017d = new C1017d();
            c1017d.mo10301f((float) (Math.sin(d) * f8004b));
            c1017d.mo10298h((float) (Math.cos(d) * f8004b));
            if (i == 3) {
                c1017d.m10311a(runnable);
            }
            if (this.f7980c) {
                c1017d.m10309b(i * 100);
            }
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 500, c1017d);
            f2 += f;
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: b */
    public void mo5582b(C0962a c0962a, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            C0964b m10456a = c0962a.m10456a(i);
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(0.0f);
            c1017d.mo10298h(0.0f);
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            if (i == 3) {
                c1017d.m10311a(runnable);
            }
            if (this.f7980c) {
                c1017d.m10309b(i * 80);
            }
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 500, c1017d);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5583a(ArrayList<Integer> arrayList, float f, float f2) {
        int i;
        int acos;
        int acos2;
        ArrayList<C2558a.C2569c> m5284c = C3359a.f11108v.f7772e.m5604d().m5284c();
        int size = arrayList.size();
        boolean z = false;
        if (f >= 0.0f && f2 >= 0.0f) {
            z = true;
            if (f7979a + f2 < C0892a.f2551B) {
                i = 0;
            } else {
                i = (int) (Math.acos((C0892a.f2551B - f2) / f7979a) / 0.017453292519943295d);
            }
            if (f7979a + f < C0892a.f2550A) {
                acos = 270;
            } else {
                acos = ((int) (Math.asin((C0892a.f2550A - f) / f7979a) / 0.017453292519943295d)) + 180;
            }
        } else if (f >= 0.0f && f2 <= 0.0f) {
            z = true;
            if (f2 - f7979a > C0892a.f2552C) {
                acos2 = 180;
            } else {
                acos2 = 180 - ((int) (Math.acos((f2 - C0892a.f2552C) / f7979a) / 0.017453292519943295d));
            }
            if (f7979a + f < C0892a.f2550A) {
                acos = acos2;
                i = -90;
            } else {
                acos = acos2;
                i = -((int) (Math.asin((C0892a.f2550A - f) / f7979a) / 0.017453292519943295d));
            }
        } else if (f <= 0.0f && f2 <= 0.0f) {
            int acos3 = f2 - f7979a > C0892a.f2552C ? -180 : ((int) (Math.acos((f2 - C0892a.f2552C) / f7979a) / 0.017453292519943295d)) - 180;
            if (f - f7979a > C0892a.f2590z) {
                acos = acos3;
                i = 90;
            } else {
                acos = acos3;
                i = 90 - ((int) (Math.acos((f - C0892a.f2590z) / f7979a) / 0.017453292519943295d));
            }
        } else {
            if (f7979a + f2 < C0892a.f2551B) {
                i = 0;
            } else {
                i = -((int) (Math.acos((C0892a.f2551B - f2) / f7979a) / 0.017453292519943295d));
            }
            acos = f - f7979a > C0892a.f2590z ? -270 : ((int) (Math.acos((f - C0892a.f2590z) / f7979a) / 0.017453292519943295d)) - 270;
        }
        float abs = Math.abs(i - acos);
        float f3 = (size - 1) * 25.0f;
        if (f3 < abs) {
            float f4 = (abs - f3) / 2.0f;
            if (i < acos) {
                i = (int) (i + f4);
            } else {
                i = (int) (i - f4);
            }
        }
        int i2 = i + 90;
        for (int i3 = 0; i3 < size; i3++) {
            C2558a.C2569c c2569c = m5284c.get(i3);
            c2569c.f8504d.m10352b(1);
            c2569c.f8504d.m10353b();
            m5601a(c2569c, i3, z, 25.0f, i2, acos, i3 * 50, C0986a.f2950e);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public int mo5590a(int i) {
        if (this.f7980c) {
            return (i * 50) + 500;
        }
        return 500;
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5588a() {
        ArrayList<C2558a.C2569c> m5284c = C3359a.f11108v.f7772e.m5604d().m5284c();
        int numChildren = C3359a.f11108v.f7772e.m5604d().m5281d().numChildren();
        for (int i = 0; i < numChildren; i++) {
            m5602a(m5284c.get(i), i, false);
        }
    }

    /* renamed from: a */
    private void m5601a(final C2558a.C2569c c2569c, int i, boolean z, float f, float f2, float f3, int i2, InterfaceC1011b interfaceC1011b) {
        c2569c.rotation().f2528z = ((f2 > f3 ? 1 : (f2 == f3 ? 0 : -1)) > 0 ? (-i) * f : i * f) + f2;
        if (z) {
            c2569c.f8503c.rotation().f2528z = 180.0f;
            c2569c.f8504d.rotation().f2528z = 180.0f;
            c2569c.f8504d.m10352b(2);
        } else {
            c2569c.f8503c.rotation().f2528z = 0.0f;
            c2569c.f8504d.rotation().f2528z = 0.0f;
            c2569c.f8504d.m10352b(1);
        }
        final float f4 = c2569c.f8504d.position().f2526x;
        final float m10742a = f7979a + C0892a.m10742a(60.0f);
        c2569c.f8504d.position().f2526x = m10742a;
        c2569c.f8504d.scale().f2526x = 1.0f;
        c2569c.f8504d.scale().f2527y = 1.0f;
        c2569c.f8503c.scale().f2526x = 1.0f;
        c2569c.f8503c.scale().f2527y = 1.0f;
        c2569c.calAABB(1.2f, 1.0f, 1.0f);
        c2569c.f8504d.position().f2526x = f4;
        c2569c.f8503c.scale().f2526x = 0.0f;
        c2569c.f8503c.scale().f2527y = 0.0f;
        c2569c.f8504d.scale().f2526x = 0.0f;
        c2569c.f8504d.scale().f2527y = 0.0f;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.c.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f5) {
                Number3d scale = c2569c.f8504d.scale();
                Number3d scale2 = c2569c.f8504d.scale();
                float f6 = c2569c.f8503c.scale().f2526x;
                scale2.f2527y = f6;
                scale.f2526x = f6;
                c2569c.f8504d.position().f2526x = f4 + ((m10742a - f4) * f5);
            }
        };
        c1017d.mo10301f(f7979a);
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        if (this.f7980c && i2 != 0) {
            c1017d.m10309b(i2);
        }
        c1017d.m10313a(interfaceC1011b);
        C1014c.m10326a(c2569c.f8503c);
        C1014c.m10325a(c2569c.f8503c, 500, c1017d);
    }

    /* renamed from: a */
    private void m5602a(final C2558a.C2569c c2569c, int i, boolean z) {
        final float f = c2569c.f8504d.position().f2526x;
        final float m10742a = C0892a.m10742a(60.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.c.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f2) {
                Number3d scale = c2569c.f8504d.scale();
                Number3d scale2 = c2569c.f8504d.scale();
                float f3 = c2569c.f8503c.scale().f2526x;
                scale2.f2527y = f3;
                scale.f2526x = f3;
                c2569c.f8504d.position().f2526x = f + ((m10742a - f) * f2);
            }
        };
        c1017d.mo10298h(0.0f);
        c1017d.mo10301f(0.0f);
        c1017d.m10303e((-c2569c.rotation().f2528z) + 360.0f);
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        if (this.f7980c) {
            c1017d.m10309b(i * 50);
        }
        c1017d.m10313a(C0986a.f2950e);
        C1014c.m10326a(c2569c.f8503c);
        C1014c.m10325a(c2569c.f8503c, 500, c1017d);
    }
}
