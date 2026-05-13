package android.support.p002v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
/* renamed from: android.support.v4.widget.k */
/* loaded from: classes.dex */
public final class C0501k {

    /* renamed from: b */
    private static final InterfaceC0504c f1056b;

    /* renamed from: a */
    private Object f1057a;

    /* renamed from: android.support.v4.widget.k$c */
    /* loaded from: classes.dex */
    interface InterfaceC0504c {
        /* renamed from: a */
        Object mo12251a(Context context);

        /* renamed from: a */
        void mo12247a(Object obj, int i, int i2);

        /* renamed from: a */
        boolean mo12250a(Object obj);

        /* renamed from: a */
        boolean mo12249a(Object obj, float f);

        /* renamed from: a */
        boolean mo12243a(Object obj, float f, float f2);

        /* renamed from: a */
        boolean mo12248a(Object obj, int i);

        /* renamed from: a */
        boolean mo12246a(Object obj, Canvas canvas);

        /* renamed from: b */
        void mo12245b(Object obj);

        /* renamed from: c */
        boolean mo12244c(Object obj);
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f1056b = new C0505d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f1056b = new C0503b();
        } else {
            f1056b = new C0502a();
        }
    }

    /* renamed from: android.support.v4.widget.k$a */
    /* loaded from: classes.dex */
    static class C0502a implements InterfaceC0504c {
        C0502a() {
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public Object mo12251a(Context context) {
            return null;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public void mo12247a(Object obj, int i, int i2) {
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12250a(Object obj) {
            return true;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: b */
        public void mo12245b(Object obj) {
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12249a(Object obj, float f) {
            return false;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: c */
        public boolean mo12244c(Object obj) {
            return false;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12248a(Object obj, int i) {
            return false;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12246a(Object obj, Canvas canvas) {
            return false;
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12243a(Object obj, float f, float f2) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.k$b */
    /* loaded from: classes.dex */
    static class C0503b implements InterfaceC0504c {
        C0503b() {
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public Object mo12251a(Context context) {
            return C0506l.m12242a(context);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public void mo12247a(Object obj, int i, int i2) {
            C0506l.m12238a(obj, i, i2);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12250a(Object obj) {
            return C0506l.m12241a(obj);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: b */
        public void mo12245b(Object obj) {
            C0506l.m12236b(obj);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12249a(Object obj, float f) {
            return C0506l.m12240a(obj, f);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: c */
        public boolean mo12244c(Object obj) {
            return C0506l.m12235c(obj);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12248a(Object obj, int i) {
            return C0506l.m12239a(obj, i);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12246a(Object obj, Canvas canvas) {
            return C0506l.m12237a(obj, canvas);
        }

        @Override // android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12243a(Object obj, float f, float f2) {
            return C0506l.m12240a(obj, f);
        }
    }

    /* renamed from: android.support.v4.widget.k$d */
    /* loaded from: classes.dex */
    static class C0505d extends C0503b {
        C0505d() {
        }

        @Override // android.support.p002v4.widget.C0501k.C0503b, android.support.p002v4.widget.C0501k.InterfaceC0504c
        /* renamed from: a */
        public boolean mo12243a(Object obj, float f, float f2) {
            return C0507m.m12234a(obj, f, f2);
        }
    }

    public C0501k(Context context) {
        this.f1057a = f1056b.mo12251a(context);
    }

    /* renamed from: a */
    public void m12255a(int i, int i2) {
        f1056b.mo12247a(this.f1057a, i, i2);
    }

    /* renamed from: a */
    public boolean m12259a() {
        return f1056b.mo12250a(this.f1057a);
    }

    /* renamed from: b */
    public void m12253b() {
        f1056b.mo12245b(this.f1057a);
    }

    /* renamed from: a */
    public boolean m12258a(float f) {
        return f1056b.mo12249a(this.f1057a, f);
    }

    /* renamed from: a */
    public boolean m12257a(float f, float f2) {
        return f1056b.mo12243a(this.f1057a, f, f2);
    }

    /* renamed from: c */
    public boolean m12252c() {
        return f1056b.mo12244c(this.f1057a);
    }

    /* renamed from: a */
    public boolean m12256a(int i) {
        return f1056b.mo12248a(this.f1057a, i);
    }

    /* renamed from: a */
    public boolean m12254a(Canvas canvas) {
        return f1056b.mo12246a(this.f1057a, canvas);
    }
}
