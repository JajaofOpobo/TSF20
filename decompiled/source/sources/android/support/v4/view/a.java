package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.b;
import android.support.v4.view.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public class a {
    private static final b b;
    private static final Object c;
    final Object a = b.a(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        android.support.v4.view.a.g a(Object obj, View view);

        Object a();

        Object a(a aVar);

        void a(Object obj, View view, int i);

        void a(Object obj, View view, android.support.v4.view.a.b bVar);

        boolean a(Object obj, View view, int i, Bundle bundle);

        boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    /* loaded from: classes.dex */
    static class d implements b {
        d() {
        }

        @Override // android.support.v4.view.a.b
        public Object a() {
            return null;
        }

        @Override // android.support.v4.view.a.b
        public Object a(a aVar) {
            return null;
        }

        @Override // android.support.v4.view.a.b
        public boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        @Override // android.support.v4.view.a.b
        public void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.v4.view.a.b
        public void a(Object obj, View view, android.support.v4.view.a.b bVar) {
        }

        @Override // android.support.v4.view.a.b
        public void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.v4.view.a.b
        public boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        @Override // android.support.v4.view.a.b
        public void a(Object obj, View view, int i) {
        }

        @Override // android.support.v4.view.a.b
        public void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // android.support.v4.view.a.b
        public android.support.v4.view.a.g a(Object obj, View view) {
            return null;
        }

        @Override // android.support.v4.view.a.b
        public boolean a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0006a extends d {
        C0006a() {
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public Object a() {
            return android.support.v4.view.b.a();
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public Object a(final a aVar) {
            return android.support.v4.view.b.a(new b.a() { // from class: android.support.v4.view.a.a.1
                @Override // android.support.v4.view.b.a
                public boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.b(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.b.a
                public void b(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.d(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.b.a
                public void a(View view, Object obj) {
                    aVar.a(view, new android.support.v4.view.a.b(obj));
                }

                @Override // android.support.v4.view.b.a
                public void c(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.c(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.b.a
                public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.support.v4.view.b.a
                public void a(View view, int i) {
                    aVar.a(view, i);
                }

                @Override // android.support.v4.view.b.a
                public void d(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.a(view, accessibilityEvent);
                }
            });
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return android.support.v4.view.b.a(obj, view, accessibilityEvent);
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.b(obj, view, accessibilityEvent);
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public void a(Object obj, View view, android.support.v4.view.a.b bVar) {
            android.support.v4.view.b.a(obj, view, bVar.a());
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.c(obj, view, accessibilityEvent);
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return android.support.v4.view.b.a(obj, viewGroup, view, accessibilityEvent);
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public void a(Object obj, View view, int i) {
            android.support.v4.view.b.a(obj, view, i);
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.d(obj, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    static class c extends C0006a {
        c() {
        }

        @Override // android.support.v4.view.a.C0006a, android.support.v4.view.a.d, android.support.v4.view.a.b
        public Object a(final a aVar) {
            return android.support.v4.view.c.a(new c.a() { // from class: android.support.v4.view.a.c.1
                @Override // android.support.v4.view.c.a
                public boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.b(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.c.a
                public void b(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.d(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.c.a
                public void a(View view, Object obj) {
                    aVar.a(view, new android.support.v4.view.a.b(obj));
                }

                @Override // android.support.v4.view.c.a
                public void c(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.c(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.c.a
                public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return aVar.a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.support.v4.view.c.a
                public void a(View view, int i) {
                    aVar.a(view, i);
                }

                @Override // android.support.v4.view.c.a
                public void d(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.a(view, accessibilityEvent);
                }

                @Override // android.support.v4.view.c.a
                public Object a(View view) {
                    android.support.v4.view.a.g a = aVar.a(view);
                    if (a != null) {
                        return a.a();
                    }
                    return null;
                }

                @Override // android.support.v4.view.c.a
                public boolean a(View view, int i, Bundle bundle) {
                    return aVar.a(view, i, bundle);
                }
            });
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public android.support.v4.view.a.g a(Object obj, View view) {
            Object a = android.support.v4.view.c.a(obj, view);
            if (a != null) {
                return new android.support.v4.view.a.g(a);
            }
            return null;
        }

        @Override // android.support.v4.view.a.d, android.support.v4.view.a.b
        public boolean a(Object obj, View view, int i, Bundle bundle) {
            return android.support.v4.view.c.a(obj, view, i, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            b = new c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            b = new C0006a();
        } else {
            b = new d();
        }
        c = b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object a() {
        return this.a;
    }

    public void a(View view, int i) {
        b.a(c, view, i);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        b.d(c, view, accessibilityEvent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        b.c(c, view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        b.b(c, view, accessibilityEvent);
    }

    public void a(View view, android.support.v4.view.a.b bVar) {
        b.a(c, view, bVar);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, viewGroup, view, accessibilityEvent);
    }

    public android.support.v4.view.a.g a(View view) {
        return b.a(c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return b.a(c, view, i, bundle);
    }
}
