package com.tsf.shell.p096f.p131f.p141b.p142a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p153i.C3112b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.b.a.e */
/* loaded from: classes.dex */
public class C2888e extends C2885d {

    /* renamed from: b */
    private boolean f9415b;

    /* renamed from: c */
    private boolean f9416c;

    public C2888e(int i, boolean z, boolean z2, boolean z3) {
        super(i, z3);
        this.f9415b = z;
        this.f9416c = z2;
    }

    @Override // com.tsf.shell.p096f.p131f.p141b.p142a.C2885d
    /* renamed from: a */
    public void mo4359a(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
        m4364a(arrayList, z, this.f9415b, runnable);
    }

    @Override // com.tsf.shell.p096f.p131f.p141b.p142a.C2885d
    /* renamed from: b */
    public void mo4358b(ArrayList<C0975i> arrayList, boolean z, Runnable runnable) {
        C1017d c1017d;
        C1017d c1017d2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            C0975i c0975i = arrayList.get(i);
            C1014c.m10326a(c0975i);
            if (c0975i instanceof C3112b) {
                C1017d c1017d3 = new C1017d();
                if (z) {
                    c1017d3.mo10301f(0.0f);
                    c1017d3.mo10298h(C0892a.f2551B);
                    c1017d3.m10314a(0);
                    if (this.f9416c) {
                        c1017d3.m10305d(m4365a(50));
                        c1017d3.m10303e(m4365a(180));
                        c1017d3.m10307c(m4365a(50));
                    }
                    C1014c.m10325a(c0975i, 600, c1017d3);
                    c1017d = c1017d3;
                    i++;
                    c1017d2 = c1017d;
                } else {
                    c0975i.position().f2526x = 0.0f;
                    c0975i.position().f2527y = C0892a.f2551B;
                    c0975i.alpha(0.0f);
                    if (this.f9416c) {
                        c0975i.rotation().f2526x = m4365a(50);
                        c0975i.rotation().f2527y = m4365a(180);
                        c0975i.rotation().f2528z = m4365a(50);
                    }
                }
            }
            c1017d = c1017d2;
            i++;
            c1017d2 = c1017d;
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
        float m10742a = C0892a.m10742a(50.0f);
        for (int i = 0; i < c0962a.m10459a(); i++) {
            C0964b m10456a = c0962a.m10456a(i);
            c1017d = new C1017d();
            c1017d.mo10298h(m10742a);
            c1017d.mo10301f(0.0f);
            if (this.f9416c) {
                c1017d.m10305d(m4365a(50));
                c1017d.m10303e(m4365a(180));
                c1017d.m10307c(m4365a(50));
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
