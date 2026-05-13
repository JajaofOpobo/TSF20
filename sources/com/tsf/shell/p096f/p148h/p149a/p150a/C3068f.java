package com.tsf.shell.p096f.p148h.p149a.p150a;

import com.tsf.C1306b;
import com.tsf.shell.manager.p168b.C3430e;
/* renamed from: com.tsf.shell.f.h.a.a.f */
/* loaded from: classes.dex */
public class C3068f extends AbstractC3062c {

    /* renamed from: a */
    public boolean f9955a;

    public C3068f() {
        super(C1306b.C1315i.text_recents);
        this.f9955a = false;
        m3693a(10);
        this.f9955a = C3430e.m2502aw();
        if (!this.f9955a) {
            visible(false);
        }
    }

    /* renamed from: a */
    public void m3684a(boolean z) {
        this.f9955a = z;
        C3430e.m2410x(z);
        mo3683b(numChildren());
        if (!this.f9955a) {
            m3692b();
        }
    }

    @Override // com.tsf.shell.p096f.p148h.p149a.p150a.AbstractC3062c
    /* renamed from: b */
    public void mo3683b(int i) {
        if (i == 0 || !this.f9955a) {
            visible(false);
        } else {
            visible(true);
        }
    }

    /* renamed from: c */
    public boolean m3682c() {
        return this.f9955a;
    }
}
