package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.e */
/* loaded from: classes.dex */
public class C2929e extends AbstractC2912c<C2948l> {

    /* renamed from: a */
    private boolean f9502a;

    /* renamed from: b */
    private boolean f9503b;

    /* renamed from: c */
    private boolean f9504c;

    public C2929e(ArrayList<C2931f> arrayList) {
        super(arrayList);
        this.f9502a = false;
        this.f9503b = false;
        this.f9504c = false;
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public boolean mo4277b() {
        return C3430e.m2567E();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a */
    public void mo4278a(boolean z, String str) {
        C2939h.m4166d();
        C3430e.m2455i(z);
        C3430e.m2464g(str);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: c */
    public String mo4274c() {
        return C3430e.m2566F();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo4279a(C2948l c2948l) {
    }

    /* renamed from: b */
    public void m4276b(C2948l c2948l) {
        if (this.f9502a) {
            m4350a((C2931f) c2948l);
            this.f9503b = true;
        } else if (m4350a((C2931f) c2948l)) {
            m4275b(true);
        }
    }

    /* renamed from: b */
    public void m4275b(boolean z) {
        this.f9504c = z;
        this.f9502a = true;
        C0864d.m10805d().m10810c().m3556a(false);
        C3359a.f11094h.m4021s().m3898d(600);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: f */
    public void mo4273f() {
        super.mo4273f();
        if (this.f9502a) {
            if (this.f9504c) {
                m4275b(false);
                return;
            }
            this.f9502a = false;
            C0864d.m10805d().m10810c().m3556a(true);
            if (this.f9503b) {
                this.f9503b = false;
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2929e.this.m4275b(true);
                    }
                });
            }
        }
    }
}
