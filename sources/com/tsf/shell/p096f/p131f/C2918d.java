package com.tsf.shell.p096f.p131f;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.d */
/* loaded from: classes.dex */
public class C2918d extends AbstractC2912c<C2948l> {

    /* renamed from: a */
    public Object f9474a;

    /* renamed from: b */
    private boolean f9475b;

    /* renamed from: c */
    private boolean f9476c;

    public C2918d(ArrayList<C2931f> arrayList) {
        super(arrayList);
        this.f9474a = new Object();
        this.f9475b = false;
        this.f9476c = false;
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public boolean mo4277b() {
        return C3430e.m2407z();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: a */
    public void mo4278a(boolean z, String str) {
        C2939h.m4166d();
        C3430e.m2463g(z);
        C3430e.m2478d(str);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: c */
    public String mo4274c() {
        return C3430e.m2571A();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void m4314a(C2948l c2948l) {
        if (c2948l.mo4143a()) {
            C2942j.m4162a(this.f9474a, 2);
        } else {
            C2942j.m4163a(this.f9474a);
        }
        C3359a.f11108v.f7770c.m5570h();
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: b */
    public void mo4279a(C2948l c2948l) {
    }

    /* renamed from: c */
    public void m4312c(C2948l c2948l) {
        if (this.f9475b) {
            m4316a();
            m4350a((C2931f) c2948l);
            this.f9476c = true;
        } else if (m4350a((C2931f) c2948l)) {
            m4315a(800, 500);
        }
    }

    /* renamed from: a */
    public void m4315a(int i, int i2) {
        this.f9475b = true;
        C0864d.m10805d().m10810c().m3556a(false);
        if (C3359a.f11094h.m4031n().m4181t() != -1) {
            C3359a.f11094h.m4021s().m3935a(i, i2);
        }
    }

    /* renamed from: a */
    public void m4316a() {
        C3359a.f11094h.m4021s().m3915b(500);
    }

    /* renamed from: d */
    public void m4311d() {
        this.f9476c = false;
        if (this.f9475b) {
            m4316a();
            this.f9476c = true;
            return;
        }
        m4315a(800, 500);
    }

    @Override // com.tsf.shell.p096f.p131f.AbstractC2912c
    /* renamed from: f */
    public void mo4273f() {
        super.mo4273f();
        if (this.f9475b) {
            this.f9475b = false;
            C0864d.m10805d().m10810c().m3556a(true);
            if (this.f9476c) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2918d.this.m4311d();
                    }
                });
            }
        }
    }
}
