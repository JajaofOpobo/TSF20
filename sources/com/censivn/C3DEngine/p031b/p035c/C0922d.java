package com.censivn.C3DEngine.p031b.p035c;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.censivn.C3DEngine.b.c.d */
/* loaded from: classes.dex */
public class C0922d {

    /* renamed from: a */
    private C0924b f2714a;

    /* renamed from: b */
    private ArrayList<C0923a> f2715b = new ArrayList<>();

    /* renamed from: com.censivn.C3DEngine.b.c.d$b */
    /* loaded from: classes.dex */
    public static class C0924b {
        /* renamed from: a */
        public void mo2216a() {
        }
    }

    /* renamed from: com.censivn.C3DEngine.b.c.d$a */
    /* loaded from: classes.dex */
    public static class C0923a {
        /* renamed from: a */
        public void mo2663a() {
        }
    }

    /* renamed from: a */
    public void m10576a() {
        if (this.f2714a != null) {
            this.f2714a.mo2216a();
        }
    }

    /* renamed from: a */
    public void m10574a(C0924b c0924b) {
        this.f2714a = c0924b;
    }

    /* renamed from: b */
    public void m10572b(C0924b c0924b) {
        this.f2714a = null;
        Iterator<C0923a> it = this.f2715b.iterator();
        while (it.hasNext()) {
            it.next().mo2663a();
        }
    }

    /* renamed from: b */
    public boolean m10573b() {
        return this.f2714a != null;
    }

    /* renamed from: a */
    public void m10575a(C0923a c0923a) {
        this.f2715b.add(c0923a);
    }
}
