package com.tsf.shell.p096f.p153i.p161c;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.p096f.p153i.p155b.p156a.C3117a;
/* renamed from: com.tsf.shell.f.i.c.a */
/* loaded from: classes.dex */
public class C3232a extends C3343g {

    /* renamed from: k */
    private C0980j f10560k;

    /* renamed from: l */
    private C3117a f10561l;

    public C3232a() {
        m2796b(true);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
        if (this.f10561l != null) {
            this.f10561l.m3475g();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: a */
    public C0975i mo2798a(boolean z) {
        if (this.f10560k == null) {
            this.f10560k = m3049p();
        } else {
            this.f10561l.m3476f();
        }
        return this.f10560k;
    }

    /* renamed from: p */
    private C0980j m3049p() {
        C0980j c0980j = new C0980j() { // from class: com.tsf.shell.f.i.c.a.1

            /* renamed from: a */
            int f10562a = 0;

            /* renamed from: b */
            double f10563b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                rotation().f2527y = (-19.0f) + (((float) Math.sin(this.f10563b * this.f10562a)) * 19.0f);
                this.f10562a += 2;
            }
        };
        this.f10561l = new C3117a(false);
        this.f10561l.scale().setAll(0.54f, 0.54f, 0.54f);
        this.f10561l.setAnimationObjectState(true);
        c0980j.addChild(this.f10561l);
        return c0980j;
    }
}
