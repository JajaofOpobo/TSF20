package android.support.p002v4.view;

import android.os.Build;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
/* renamed from: android.support.v4.view.q */
/* loaded from: classes.dex */
public final class C0419q {

    /* renamed from: a */
    static final InterfaceC0423d f796a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.q$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0423d {
        /* renamed from: a */
        MenuItem mo12609a(MenuItem menuItem, View view);

        /* renamed from: a */
        View mo12611a(MenuItem menuItem);

        /* renamed from: a */
        void mo12610a(MenuItem menuItem, int i);

        /* renamed from: b */
        MenuItem mo12607b(MenuItem menuItem, int i);

        /* renamed from: b */
        boolean mo12608b(MenuItem menuItem);

        /* renamed from: c */
        boolean mo12606c(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.q$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0424e {
        /* renamed from: a */
        boolean mo11704a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo11703b(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.q$a */
    /* loaded from: classes.dex */
    static class C0420a implements InterfaceC0423d {
        C0420a() {
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public void mo12610a(MenuItem menuItem, int i) {
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public MenuItem mo12609a(MenuItem menuItem, View view) {
            return menuItem;
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: b */
        public MenuItem mo12607b(MenuItem menuItem, int i) {
            return menuItem;
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public View mo12611a(MenuItem menuItem) {
            return null;
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: b */
        public boolean mo12608b(MenuItem menuItem) {
            return false;
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: c */
        public boolean mo12606c(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.q$b */
    /* loaded from: classes.dex */
    static class C0421b implements InterfaceC0423d {
        C0421b() {
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public void mo12610a(MenuItem menuItem, int i) {
            C0425r.m12604a(menuItem, i);
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public MenuItem mo12609a(MenuItem menuItem, View view) {
            return C0425r.m12603a(menuItem, view);
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: b */
        public MenuItem mo12607b(MenuItem menuItem, int i) {
            return C0425r.m12602b(menuItem, i);
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: a */
        public View mo12611a(MenuItem menuItem) {
            return C0425r.m12605a(menuItem);
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: b */
        public boolean mo12608b(MenuItem menuItem) {
            return false;
        }

        @Override // android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: c */
        public boolean mo12606c(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.q$c */
    /* loaded from: classes.dex */
    static class C0422c extends C0421b {
        C0422c() {
        }

        @Override // android.support.p002v4.view.C0419q.C0421b, android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: b */
        public boolean mo12608b(MenuItem menuItem) {
            return C0426s.m12601a(menuItem);
        }

        @Override // android.support.p002v4.view.C0419q.C0421b, android.support.p002v4.view.C0419q.InterfaceC0423d
        /* renamed from: c */
        public boolean mo12606c(MenuItem menuItem) {
            return C0426s.m12600b(menuItem);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            f796a = new C0422c();
        } else if (i >= 11) {
            f796a = new C0421b();
        } else {
            f796a = new C0420a();
        }
    }

    /* renamed from: a */
    public static void m12617a(MenuItem menuItem, int i) {
        if (menuItem instanceof InterfaceMenuItemC0128b) {
            ((InterfaceMenuItemC0128b) menuItem).setShowAsAction(i);
        } else {
            f796a.mo12610a(menuItem, i);
        }
    }

    /* renamed from: a */
    public static MenuItem m12615a(MenuItem menuItem, View view) {
        return menuItem instanceof InterfaceMenuItemC0128b ? ((InterfaceMenuItemC0128b) menuItem).setActionView(view) : f796a.mo12609a(menuItem, view);
    }

    /* renamed from: b */
    public static MenuItem m12613b(MenuItem menuItem, int i) {
        return menuItem instanceof InterfaceMenuItemC0128b ? ((InterfaceMenuItemC0128b) menuItem).setActionView(i) : f796a.mo12607b(menuItem, i);
    }

    /* renamed from: a */
    public static View m12618a(MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC0128b ? ((InterfaceMenuItemC0128b) menuItem).getActionView() : f796a.mo12611a(menuItem);
    }

    /* renamed from: a */
    public static MenuItem m12616a(MenuItem menuItem, AbstractC0388d abstractC0388d) {
        if (menuItem instanceof InterfaceMenuItemC0128b) {
            return ((InterfaceMenuItemC0128b) menuItem).mo11737a(abstractC0388d);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static boolean m12614b(MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC0128b ? ((InterfaceMenuItemC0128b) menuItem).expandActionView() : f796a.mo12608b(menuItem);
    }

    /* renamed from: c */
    public static boolean m12612c(MenuItem menuItem) {
        return menuItem instanceof InterfaceMenuItemC0128b ? ((InterfaceMenuItemC0128b) menuItem).isActionViewExpanded() : f796a.mo12606c(menuItem);
    }
}
