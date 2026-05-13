package com.tsf.shell.p096f.p107d.p112c.p113a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.InterfaceC1011b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.p096f.p118e.p126f.C2558a;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.d.c.a.e */
/* loaded from: classes.dex */
public class C2428e extends C2426d {

    /* renamed from: a */
    private static float f8007a = 50.0f * C0892a.f2567c;

    /* renamed from: c */
    private boolean f8008c;

    /* renamed from: d */
    private boolean f8009d;

    public C2428e(int i, boolean z, boolean z2) {
        super(i, z2);
        this.f8009d = false;
        this.f8009d = z;
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5587a(C0962a c0962a, Runnable runnable) {
        float m10742a = C0892a.m10742a(70.0f);
        float m10742a2 = C0892a.m10742a(110.0f);
        float f = m10742a2 / 3.0f;
        float f2 = m10742a2 / 2.0f;
        for (int i = 0; i < 4; i++) {
            C0964b m10456a = c0962a.m10456a(i);
            m10456a.m10407i().f2526x = m10742a;
            m10456a.m10407i().f2527y = f2;
            f2 -= f;
            C1017d c1017d = new C1017d();
            if (i == 3) {
                c1017d.m10311a(runnable);
            }
            if (this.f8009d) {
                c1017d.m10309b(i * 150);
            }
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 500, c1017d);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: b */
    public void mo5582b(C0962a c0962a, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            C0964b m10456a = c0962a.m10456a(i);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            if (i == 3) {
                c1017d.m10311a(runnable);
            }
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 500, c1017d);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5583a(ArrayList<Integer> arrayList, float f, float f2) {
        float f3;
        ArrayList<C2558a.C2569c> m5284c = C3359a.f11108v.f7772e.m5604d().m5284c();
        C0980j m5281d = C3359a.f11108v.f7772e.m5604d().m5281d();
        int size = arrayList.size();
        float f4 = 120.0f * C0892a.f2567c * (size - 1);
        if ((f4 / 2.0f) + f2 + (C3489a.f11521h / 2.0f) + f8007a > C0892a.f2551B) {
            f3 = ((C0892a.f2551B - f8007a) - (C3489a.f11521h / 2.0f)) - f2;
        } else if (((f2 - (f4 / 2.0f)) - (C3489a.f11521h / 2.0f)) - f8007a < C0892a.f2552C) {
            f3 = f4 + (((C0892a.f2552C + f8007a) + (C3489a.f11521h / 2.0f)) - f2);
        } else {
            f3 = f4 / 2.0f;
        }
        this.f8008c = f < 0.0f;
        if (this.f8008c) {
            m5281d.position().f2526x = 190.0f * C0892a.f2567c;
        } else {
            m5281d.position().f2526x = (-190.0f) * C0892a.f2567c;
        }
        m5281d.position().f2527y = f3;
        for (int i = 0; i < size; i++) {
            C2558a.C2569c c2569c = m5284c.get(i);
            if (this.f8008c) {
                c2569c.f8504d.m10352b(1);
            } else {
                c2569c.f8504d.m10352b(2);
            }
            m5585a(c2569c, i, i * 50, C0986a.f2950e);
            c2569c.calAABB(2.0f, 1.2f, 1.0f);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5588a() {
        ArrayList<C2558a.C2569c> m5284c = C3359a.f11108v.f7772e.m5604d().m5284c();
        int numChildren = C3359a.f11108v.f7772e.m5604d().m5281d().numChildren();
        int i = 0;
        while (i < numChildren) {
            m5584a(m5284c.get((numChildren - i) - 1), i, i == numChildren + (-1));
            i++;
        }
    }

    /* renamed from: c */
    private float m5580c(C2558a.C2569c c2569c) {
        return this.f8008c ? (80.0f * C0892a.f2567c) + (C0892a.f2567c * 60.0f) : ((-80.0f) * C0892a.f2567c) - (C0892a.f2567c * 60.0f);
    }

    /* renamed from: d */
    private float m5579d(C2558a.C2569c c2569c) {
        return this.f8008c ? 80.0f * C0892a.f2567c : (-80.0f) * C0892a.f2567c;
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: a */
    public void mo5586a(C2558a.C2569c c2569c) {
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(m5580c(c2569c));
        C1014c.m10326a(c2569c.f8504d);
        C1014c.m10325a(c2569c.f8504d, 250, c1017d);
    }

    @Override // com.tsf.shell.p096f.p107d.p112c.p113a.C2426d
    /* renamed from: b */
    public void mo5581b(C2558a.C2569c c2569c) {
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(m5579d(c2569c));
        C1014c.m10326a(c2569c.f8504d);
        C1014c.m10325a(c2569c.f8504d, 250, c1017d);
    }

    /* renamed from: a */
    private void m5585a(C2558a.C2569c c2569c, int i, int i2, InterfaceC1011b interfaceC1011b) {
        c2569c.scale().f2526x = 0.0f;
        c2569c.scale().f2527y = 0.0f;
        c2569c.position().f2527y = (-120.0f) * C0892a.f2567c * i;
        c2569c.f8504d.position().f2526x = m5579d(c2569c);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.c.a.e.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        if (this.f8009d && i2 != 0) {
            c1017d.m10309b(i2);
        }
        c1017d.m10313a(interfaceC1011b);
        C1014c.m10326a(c2569c);
        C1014c.m10325a(c2569c, 300, c1017d);
    }

    /* renamed from: a */
    private void m5584a(C2558a.C2569c c2569c, int i, boolean z) {
        C1017d c1017d;
        if (z) {
            c1017d = new C1017d();
        } else {
            c1017d = new C1017d();
        }
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        C1014c.m10326a(c2569c);
        C1014c.m10325a(c2569c, 300, c1017d);
    }
}
