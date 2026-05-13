package com.tsf.shell.p096f.p107d.p108a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.Home;
/* renamed from: com.tsf.shell.f.d.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC2374a {

    /* renamed from: a */
    private int f7774a;

    /* renamed from: b */
    private boolean f7775b = false;

    /* renamed from: c */
    private boolean f7776c = false;

    /* renamed from: d */
    private boolean f7777d;

    /* renamed from: a */
    public abstract void mo5652a(C0975i c0975i, Number3d number3d, Number3d number3d2, Runnable runnable);

    /* renamed from: a */
    public abstract void mo5651a(C0981k c0981k, Runnable runnable);

    /* renamed from: e */
    public abstract C0975i mo5650e();

    public AbstractC2374a(int i, boolean z) {
        boolean z2 = false;
        this.f7777d = false;
        this.f7774a = i;
        if (z && Home.m6188a()) {
            z2 = true;
        }
        this.f7777d = z2;
    }

    /* renamed from: a */
    public boolean m5684a() {
        return this.f7777d;
    }

    /* renamed from: b */
    public boolean m5682b() {
        return this.f7775b;
    }

    /* renamed from: a */
    public void m5683a(boolean z) {
        this.f7775b = z;
    }

    /* renamed from: c */
    public int m5680c() {
        return this.f7774a;
    }

    /* renamed from: d */
    public boolean m5679d() {
        return this.f7776c;
    }

    /* renamed from: b */
    public void m5681b(boolean z) {
        this.f7776c = z;
    }
}
