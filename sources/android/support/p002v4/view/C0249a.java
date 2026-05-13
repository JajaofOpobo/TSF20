package android.support.p002v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.p002v4.view.C0357b;
import android.support.p002v4.view.C0385c;
import android.support.p002v4.view.p011a.C0261b;
import android.support.p002v4.view.p011a.C0276g;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: android.support.v4.view.a */
/* loaded from: classes.dex */
public class C0249a {

    /* renamed from: b */
    private static final InterfaceC0252b f702b;

    /* renamed from: c */
    private static final Object f703c;

    /* renamed from: a */
    final Object f704a = f702b.mo13048a(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0252b {
        /* renamed from: a */
        C0276g mo13044a(Object obj, View view);

        /* renamed from: a */
        Object mo13049a();

        /* renamed from: a */
        Object mo13048a(C0249a c0249a);

        /* renamed from: a */
        void mo13042a(Object obj, View view, int i);

        /* renamed from: a */
        void mo13040a(Object obj, View view, C0261b c0261b);

        /* renamed from: a */
        boolean mo13041a(Object obj, View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo13039a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo13038a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo13032b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo13026c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo13021d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.view.a$d */
    /* loaded from: classes.dex */
    static class C0255d implements InterfaceC0252b {
        C0255d() {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public Object mo13049a() {
            return null;
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public Object mo13048a(C0249a c0249a) {
            return null;
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13039a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: b */
        public void mo13032b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public void mo13040a(Object obj, View view, C0261b c0261b) {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: c */
        public void mo13026c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13038a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public void mo13042a(Object obj, View view, int i) {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: d */
        public void mo13021d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public C0276g mo13044a(Object obj, View view) {
            return null;
        }

        @Override // android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13041a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a$a */
    /* loaded from: classes.dex */
    static class C0250a extends C0255d {
        C0250a() {
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public Object mo13049a() {
            return C0357b.m12734a();
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public Object mo13048a(final C0249a c0249a) {
            return C0357b.m12733a(new C0357b.InterfaceC0359a() { // from class: android.support.v4.view.a.a.1
                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: a */
                public boolean mo12724a(View view, AccessibilityEvent accessibilityEvent) {
                    return c0249a.mo12511b(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: b */
                public void mo12721b(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.mo12429d(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: a */
                public void mo12723a(View view, Object obj) {
                    c0249a.mo12432a(view, new C0261b(obj));
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: c */
                public void mo12720c(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.m13144c(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: a */
                public boolean mo12722a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0249a.mo12431a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: a */
                public void mo12725a(View view, int i) {
                    c0249a.m13146a(view, i);
                }

                @Override // android.support.p002v4.view.C0357b.InterfaceC0359a
                /* renamed from: d */
                public void mo12719d(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.m13145a(view, accessibilityEvent);
                }
            });
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13039a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return C0357b.m12731a(obj, view, accessibilityEvent);
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: b */
        public void mo13032b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0357b.m12728b(obj, view, accessibilityEvent);
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public void mo13040a(Object obj, View view, C0261b c0261b) {
            C0357b.m12730a(obj, view, c0261b.a());
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: c */
        public void mo13026c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0357b.m12727c(obj, view, accessibilityEvent);
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13038a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0357b.m12729a(obj, viewGroup, view, accessibilityEvent);
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public void mo13042a(Object obj, View view, int i) {
            C0357b.m12732a(obj, view, i);
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: d */
        public void mo13021d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0357b.m12726d(obj, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.a$c */
    /* loaded from: classes.dex */
    static class C0253c extends C0250a {
        C0253c() {
        }

        @Override // android.support.p002v4.view.C0249a.C0250a, android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public Object mo13048a(final C0249a c0249a) {
            return C0385c.m12663a(new C0385c.InterfaceC0387a() { // from class: android.support.v4.view.a.c.1
                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public boolean mo12657a(View view, AccessibilityEvent accessibilityEvent) {
                    return c0249a.mo12511b(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: b */
                public void mo12654b(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.mo12429d(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public void mo12656a(View view, Object obj) {
                    c0249a.mo12432a(view, new C0261b(obj));
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: c */
                public void mo12653c(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.m13144c(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public boolean mo12655a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0249a.mo12431a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public void mo12659a(View view, int i) {
                    c0249a.m13146a(view, i);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: d */
                public void mo12652d(View view, AccessibilityEvent accessibilityEvent) {
                    c0249a.m13145a(view, accessibilityEvent);
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public Object mo12660a(View view) {
                    C0276g m13147a = c0249a.m13147a(view);
                    if (m13147a != null) {
                        return m13147a.m12996a();
                    }
                    return null;
                }

                @Override // android.support.p002v4.view.C0385c.InterfaceC0387a
                /* renamed from: a */
                public boolean mo12658a(View view, int i, Bundle bundle) {
                    return c0249a.mo12465a(view, i, bundle);
                }
            });
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public C0276g mo13044a(Object obj, View view) {
            Object m12662a = C0385c.m12662a(obj, view);
            if (m12662a != null) {
                return new C0276g(m12662a);
            }
            return null;
        }

        @Override // android.support.p002v4.view.C0249a.C0255d, android.support.p002v4.view.C0249a.InterfaceC0252b
        /* renamed from: a */
        public boolean mo13041a(Object obj, View view, int i, Bundle bundle) {
            return C0385c.m12661a(obj, view, i, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f702b = new C0253c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f702b = new C0250a();
        } else {
            f702b = new C0255d();
        }
        f703c = f702b.mo13049a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Object m13148a() {
        return this.f704a;
    }

    /* renamed from: a */
    public void m13146a(View view, int i) {
        f702b.mo13042a(f703c, view, i);
    }

    /* renamed from: a */
    public void m13145a(View view, AccessibilityEvent accessibilityEvent) {
        f702b.mo13021d(f703c, view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean mo12511b(View view, AccessibilityEvent accessibilityEvent) {
        return f702b.mo13039a(f703c, view, accessibilityEvent);
    }

    /* renamed from: c */
    public void m13144c(View view, AccessibilityEvent accessibilityEvent) {
        f702b.mo13026c(f703c, view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo12429d(View view, AccessibilityEvent accessibilityEvent) {
        f702b.mo13032b(f703c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo12432a(View view, C0261b c0261b) {
        f702b.mo13040a(f703c, view, c0261b);
    }

    /* renamed from: a */
    public boolean mo12431a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f702b.mo13038a(f703c, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0276g m13147a(View view) {
        return f702b.mo13044a(f703c, view);
    }

    /* renamed from: a */
    public boolean mo12465a(View view, int i, Bundle bundle) {
        return f702b.mo13041a(f703c, view, i, bundle);
    }
}
