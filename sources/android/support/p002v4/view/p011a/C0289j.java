package android.support.p002v4.view.p011a;

import android.os.Build;
/* renamed from: android.support.v4.view.a.j */
/* loaded from: classes.dex */
public class C0289j {

    /* renamed from: a */
    private static final InterfaceC0292c f743a;

    /* renamed from: b */
    private final Object f744b;

    /* renamed from: android.support.v4.view.a.j$c */
    /* loaded from: classes.dex */
    interface InterfaceC0292c {
        /* renamed from: a */
        void mo12973a(Object obj, int i);

        /* renamed from: a */
        void mo12972a(Object obj, boolean z);

        /* renamed from: b */
        void mo12971b(Object obj, int i);

        /* renamed from: c */
        void mo12970c(Object obj, int i);

        /* renamed from: d */
        void mo12969d(Object obj, int i);

        /* renamed from: e */
        void mo12968e(Object obj, int i);

        /* renamed from: f */
        void mo12967f(Object obj, int i);

        /* renamed from: g */
        void mo12966g(Object obj, int i);
    }

    /* renamed from: android.support.v4.view.a.j$e */
    /* loaded from: classes.dex */
    static class C0294e implements InterfaceC0292c {
        C0294e() {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: a */
        public void mo12973a(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: b */
        public void mo12971b(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: f */
        public void mo12967f(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: g */
        public void mo12966g(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: c */
        public void mo12970c(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: d */
        public void mo12969d(Object obj, int i) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: a */
        public void mo12972a(Object obj, boolean z) {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: e */
        public void mo12968e(Object obj, int i) {
        }
    }

    /* renamed from: android.support.v4.view.a.j$a */
    /* loaded from: classes.dex */
    static class C0290a extends C0294e {
        C0290a() {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: a */
        public void mo12973a(Object obj, int i) {
            C0295k.m12965a(obj, i);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: b */
        public void mo12971b(Object obj, int i) {
            C0295k.m12963b(obj, i);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: c */
        public void mo12970c(Object obj, int i) {
            C0295k.m12962c(obj, i);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: d */
        public void mo12969d(Object obj, int i) {
            C0295k.m12961d(obj, i);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: a */
        public void mo12972a(Object obj, boolean z) {
            C0295k.m12964a(obj, z);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: e */
        public void mo12968e(Object obj, int i) {
            C0295k.m12960e(obj, i);
        }
    }

    /* renamed from: android.support.v4.view.a.j$b */
    /* loaded from: classes.dex */
    static class C0291b extends C0290a {
        C0291b() {
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: f */
        public void mo12967f(Object obj, int i) {
            C0296l.m12959a(obj, i);
        }

        @Override // android.support.p002v4.view.p011a.C0289j.C0294e, android.support.p002v4.view.p011a.C0289j.InterfaceC0292c
        /* renamed from: g */
        public void mo12966g(Object obj, int i) {
            C0296l.m12958b(obj, i);
        }
    }

    /* renamed from: android.support.v4.view.a.j$d */
    /* loaded from: classes.dex */
    static class C0293d extends C0291b {
        C0293d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f743a = new C0293d();
        } else if (Build.VERSION.SDK_INT >= 15) {
            f743a = new C0291b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f743a = new C0290a();
        } else {
            f743a = new C0294e();
        }
    }

    public C0289j(Object obj) {
        this.f744b = obj;
    }

    /* renamed from: a */
    public void m12980a(boolean z) {
        f743a.mo12972a(this.f744b, z);
    }

    /* renamed from: a */
    public void m12981a(int i) {
        f743a.mo12971b(this.f744b, i);
    }

    /* renamed from: b */
    public void m12979b(int i) {
        f743a.mo12973a(this.f744b, i);
    }

    /* renamed from: c */
    public void m12978c(int i) {
        f743a.mo12968e(this.f744b, i);
    }

    /* renamed from: d */
    public void m12977d(int i) {
        f743a.mo12970c(this.f744b, i);
    }

    /* renamed from: e */
    public void m12976e(int i) {
        f743a.mo12969d(this.f744b, i);
    }

    /* renamed from: f */
    public void m12975f(int i) {
        f743a.mo12967f(this.f744b, i);
    }

    /* renamed from: g */
    public void m12974g(int i) {
        f743a.mo12966g(this.f744b, i);
    }

    public int hashCode() {
        if (this.f744b == null) {
            return 0;
        }
        return this.f744b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0289j c0289j = (C0289j) obj;
            return this.f744b == null ? c0289j.f744b == null : this.f744b.equals(c0289j.f744b);
        }
        return false;
    }
}
