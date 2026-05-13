package com.p060cm.p061a;
/* renamed from: com.cm.a.i */
/* loaded from: classes.dex */
public class C1119i {

    /* renamed from: a */
    private static C1119i f3579a = new C1119i();

    /* renamed from: b */
    private C1118h f3580b = null;

    /* renamed from: c */
    private boolean f3581c = false;

    /* renamed from: a */
    public static C1119i m9827a() {
        return f3579a;
    }

    /* renamed from: a */
    public void m9826a(String str) {
        boolean z = false;
        if (!this.f3581c || (this.f3580b != null && !this.f3580b.m9834d())) {
            this.f3581c = false;
            this.f3580b = new C1118h(str);
            if (this.f3580b.m9835c()) {
                z = true;
            } else {
                System.loadLibrary(str);
            }
            this.f3581c = true;
            this.f3580b.m9833e();
            if (!z) {
                this.f3580b = null;
            }
        }
    }
}
