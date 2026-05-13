package com.censivn.C3DEngine.p031b.p037e;

import com.censivn.C3DEngine.p031b.p033b.C0908c;
/* renamed from: com.censivn.C3DEngine.b.e.f */
/* loaded from: classes.dex */
public abstract class AbstractC0951f extends C0908c {

    /* renamed from: a */
    private boolean f2777a = true;

    /* renamed from: c */
    public C0949d f2778c;

    /* renamed from: f */
    public abstract void mo539f();

    /* renamed from: g */
    public abstract void mo538g();

    /* renamed from: a */
    public void m10494a(C0949d c0949d) {
        this.f2778c = c0949d;
    }

    /* renamed from: i */
    public void mo821i() {
        mouseEnabled(false);
    }

    /* renamed from: j */
    public void mo820j() {
        mouseEnabled(true);
    }

    /* renamed from: k */
    public boolean m10493k() {
        return this.f2777a;
    }

    /* renamed from: l */
    public void m10492l() {
        this.f2777a = false;
    }
}
