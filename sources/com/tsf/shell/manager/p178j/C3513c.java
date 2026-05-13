package com.tsf.shell.manager.p178j;

import android.view.KeyEvent;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p100b.C2284a;
/* renamed from: com.tsf.shell.manager.j.c */
/* loaded from: classes.dex */
public class C3513c {

    /* renamed from: a */
    private C3505b f11612a;

    /* renamed from: b */
    private C2284a f11613b;

    /* renamed from: a */
    public void m2162a() {
        if (this.f11612a == null) {
            m2158d();
        }
        m2159c();
        C0980j m2229a = C3359a.f11096j.m2229a(this.f11613b);
        this.f11612a.removeFromParent();
        this.f11612a.m2175a();
        this.f11612a.alpha(255.0f);
        m2229a.addChild(this.f11612a);
        C3359a.f11096j.m2227a(new Runnable() { // from class: com.tsf.shell.manager.j.c.1
            @Override // java.lang.Runnable
            public void run() {
                C3513c.this.f11612a.m2172b();
            }
        });
    }

    /* renamed from: b */
    public void m2160b() {
        this.f11612a.m2170c();
        C1017d c1017d = new C1017d();
        c1017d.m10314a(0);
        C1014c.m10326a(this.f11612a);
        C1014c.m10325a(this.f11612a, 300, c1017d);
        C3359a.f11096j.m2225a(new Runnable() { // from class: com.tsf.shell.manager.j.c.2
            @Override // java.lang.Runnable
            public void run() {
                C3513c.this.f11612a.m2168d();
                C3359a.f11096j.m2224b();
                C3513c.this.f11612a.removeFromParent();
            }
        }, true);
    }

    /* renamed from: d */
    private void m2158d() {
        this.f11612a = new C3505b();
        this.f11613b = new C2284a() { // from class: com.tsf.shell.manager.j.c.3
            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: a */
            public void mo727a(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    C3513c.this.m2160b();
                }
            }

            @Override // com.tsf.shell.p096f.p100b.C2284a, com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
            /* renamed from: b */
            public void mo726b(int i, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.p096f.p100b.C2284a
            /* renamed from: a */
            public void mo2157a(int i, int i2, int i3, int i4) {
                C3513c.this.m2159c();
            }
        };
    }

    /* renamed from: c */
    public void m2159c() {
        this.f11612a.m2167e();
    }
}
