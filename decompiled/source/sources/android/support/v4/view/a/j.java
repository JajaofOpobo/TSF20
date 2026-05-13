package android.support.v4.view.a;

import android.os.Build;
/* loaded from: classes.dex */
public class j {
    private static final c a;
    private final Object b;

    /* loaded from: classes.dex */
    interface c {
        void a(Object obj, int i);

        void a(Object obj, boolean z);

        void b(Object obj, int i);

        void c(Object obj, int i);

        void d(Object obj, int i);

        void e(Object obj, int i);

        void f(Object obj, int i);

        void g(Object obj, int i);
    }

    /* loaded from: classes.dex */
    static class e implements c {
        e() {
        }

        @Override // android.support.v4.view.a.j.c
        public void a(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void b(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void f(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void g(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void c(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void d(Object obj, int i) {
        }

        @Override // android.support.v4.view.a.j.c
        public void a(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.a.j.c
        public void e(Object obj, int i) {
        }
    }

    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void a(Object obj, int i) {
            k.a(obj, i);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void b(Object obj, int i) {
            k.b(obj, i);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void c(Object obj, int i) {
            k.c(obj, i);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void d(Object obj, int i) {
            k.d(obj, i);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void a(Object obj, boolean z) {
            k.a(obj, z);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void e(Object obj, int i) {
            k.e(obj, i);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void f(Object obj, int i) {
            l.a(obj, i);
        }

        @Override // android.support.v4.view.a.j.e, android.support.v4.view.a.j.c
        public void g(Object obj, int i) {
            l.b(obj, i);
        }
    }

    /* loaded from: classes.dex */
    static class d extends b {
        d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 15) {
            a = new b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new a();
        } else {
            a = new e();
        }
    }

    public j(Object obj) {
        this.b = obj;
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public void a(int i) {
        a.b(this.b, i);
    }

    public void b(int i) {
        a.a(this.b, i);
    }

    public void c(int i) {
        a.e(this.b, i);
    }

    public void d(int i) {
        a.c(this.b, i);
    }

    public void e(int i) {
        a.d(this.b, i);
    }

    public void f(int i) {
        a.f(this.b, i);
    }

    public void g(int i) {
        a.g(this.b, i);
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            return this.b == null ? jVar.b == null : this.b.equals(jVar.b);
        }
        return false;
    }
}
