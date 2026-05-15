package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v4.view.bb;
import android.support.v4.view.bf;
import android.support.v4.view.bg;
import android.support.v4.view.bh;
import android.support.v7.a.a;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.menu.f;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.t;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class n extends ActionBar implements ActionBarOverlayLayout.a {
    static final /* synthetic */ boolean h;
    private static final Interpolator i;
    private static final Interpolator j;
    private static final boolean k;
    private boolean A;
    private boolean D;
    private boolean E;
    private boolean F;
    private android.support.v7.view.h H;
    private boolean I;
    a a;
    android.support.v7.view.b b;
    b.a c;
    boolean d;
    private Context l;
    private Context m;
    private Activity n;
    private Dialog o;
    private ActionBarOverlayLayout p;
    private ActionBarContainer q;
    private android.support.v7.widget.n r;
    private ActionBarContextView s;
    private View t;
    private t u;
    private boolean x;
    private boolean y;
    private ArrayList<Object> v = new ArrayList<>();
    private int w = -1;
    private ArrayList<ActionBar.a> z = new ArrayList<>();
    private int B = 0;
    private boolean C = true;
    private boolean G = true;
    final bf e = new bg() { // from class: android.support.v7.app.n.1
        @Override // android.support.v4.view.bg, android.support.v4.view.bf
        public void b(View view) {
            if (n.this.C && n.this.t != null) {
                ai.a(n.this.t, 0.0f);
                ai.a((View) n.this.q, 0.0f);
            }
            n.this.q.setVisibility(8);
            n.this.q.setTransitioning(false);
            n.this.H = null;
            n.this.i();
            if (n.this.p != null) {
                ai.p(n.this.p);
            }
        }
    };
    final bf f = new bg() { // from class: android.support.v7.app.n.2
        @Override // android.support.v4.view.bg, android.support.v4.view.bf
        public void b(View view) {
            n.this.H = null;
            n.this.q.requestLayout();
        }
    };
    final bh g = new bh() { // from class: android.support.v7.app.n.3
        @Override // android.support.v4.view.bh
        public void a(View view) {
            ((View) n.this.q.getParent()).invalidate();
        }
    };

    static {
        h = !n.class.desiredAssertionStatus();
        i = new AccelerateInterpolator();
        j = new DecelerateInterpolator();
        k = Build.VERSION.SDK_INT >= 14;
    }

    public n(Activity activity, boolean z) {
        this.n = activity;
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z) {
            this.t = decorView.findViewById(R.id.content);
        }
    }

    public n(Dialog dialog) {
        this.o = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view) {
        this.p = (ActionBarOverlayLayout) view.findViewById(a.f.decor_content_parent);
        if (this.p != null) {
            this.p.setActionBarVisibilityCallback(this);
        }
        this.r = b(view.findViewById(a.f.action_bar));
        this.s = (ActionBarContextView) view.findViewById(a.f.action_context_bar);
        this.q = (ActionBarContainer) view.findViewById(a.f.action_bar_container);
        if (this.r == null || this.s == null || this.q == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.l = this.r.b();
        boolean z = (this.r.o() & 4) != 0;
        if (z) {
            this.x = true;
        }
        android.support.v7.view.a aVarA = android.support.v7.view.a.a(this.l);
        a(aVarA.f() || z);
        k(aVarA.d());
        TypedArray typedArrayObtainStyledAttributes = this.l.obtainStyledAttributes(null, a.k.ActionBar, a.C0012a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(a.k.ActionBar_hideOnContentScroll, false)) {
            b(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.support.v7.widget.n b(View view) {
        if (view instanceof android.support.v7.widget.n) {
            return (android.support.v7.widget.n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    @Override // android.support.v7.app.ActionBar
    public void a(float f) {
        ai.e(this.q, f);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Configuration configuration) {
        k(android.support.v7.view.a.a(this.l).d());
    }

    private void k(boolean z) {
        this.A = z;
        if (!this.A) {
            this.r.a((t) null);
            this.q.setTabContainer(this.u);
        } else {
            this.q.setTabContainer(null);
            this.r.a(this.u);
        }
        boolean z2 = j() == 2;
        if (this.u != null) {
            if (z2) {
                this.u.setVisibility(0);
                if (this.p != null) {
                    ai.p(this.p);
                }
            } else {
                this.u.setVisibility(8);
            }
        }
        this.r.a(!this.A && z2);
        this.p.setHasNonEmbeddedTabs(!this.A && z2);
    }

    void i() {
        if (this.c != null) {
            this.c.a(this.b);
            this.b = null;
            this.c = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void a(int i2) {
        this.B = i2;
    }

    @Override // android.support.v7.app.ActionBar
    public void d(boolean z) {
        this.I = z;
        if (!z && this.H != null) {
            this.H.b();
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void e(boolean z) {
        if (z != this.y) {
            this.y = z;
            int size = this.z.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.z.get(i2).a(z);
            }
        }
    }

    public void f(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(boolean z) {
        this.r.b(z);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(CharSequence charSequence) {
        this.r.a(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean g() {
        ViewGroup viewGroupA = this.r.a();
        if (viewGroupA == null || viewGroupA.hasFocus()) {
            return false;
        }
        viewGroupA.requestFocus();
        return true;
    }

    public void a(int i2, int i3) {
        int iO = this.r.o();
        if ((i3 & 4) != 0) {
            this.x = true;
        }
        this.r.c((iO & (i3 ^ (-1))) | (i2 & i3));
    }

    public int j() {
        return this.r.p();
    }

    @Override // android.support.v7.app.ActionBar
    public int a() {
        return this.r.o();
    }

    @Override // android.support.v7.app.ActionBar
    public android.support.v7.view.b a(b.a aVar) {
        if (this.a != null) {
            this.a.c();
        }
        this.p.setHideOnContentScrollEnabled(false);
        this.s.c();
        a aVar2 = new a(this.s.getContext(), aVar);
        if (!aVar2.e()) {
            return null;
        }
        aVar2.d();
        this.s.a(aVar2);
        j(true);
        this.s.sendAccessibilityEvent(32);
        this.a = aVar2;
        return aVar2;
    }

    public int k() {
        return this.q.getHeight();
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void g(boolean z) {
        this.C = z;
    }

    private void p() {
        if (!this.F) {
            this.F = true;
            if (this.p != null) {
                this.p.setShowingForActionMode(true);
            }
            l(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void l() {
        if (this.E) {
            this.E = false;
            l(true);
        }
    }

    private void q() {
        if (this.F) {
            this.F = false;
            if (this.p != null) {
                this.p.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void m() {
        if (!this.E) {
            this.E = true;
            l(true);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void b(boolean z) {
        if (z && !this.p.a()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.d = z;
        this.p.setHideOnContentScrollEnabled(z);
    }

    @Override // android.support.v7.app.ActionBar
    public int d() {
        return this.p.getActionBarHideOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void l(boolean z) {
        if (b(this.D, this.E, this.F)) {
            if (!this.G) {
                this.G = true;
                h(z);
                return;
            }
            return;
        }
        if (this.G) {
            this.G = false;
            i(z);
        }
    }

    public void h(boolean z) {
        if (this.H != null) {
            this.H.b();
        }
        this.q.setVisibility(0);
        if (this.B == 0 && k && (this.I || z)) {
            ai.a((View) this.q, 0.0f);
            float f = -this.q.getHeight();
            if (z) {
                this.q.getLocationInWindow(new int[]{0, 0});
                f -= r1[1];
            }
            ai.a(this.q, f);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            bb bbVarB = ai.l(this.q).b(0.0f);
            bbVarB.a(this.g);
            hVar.a(bbVarB);
            if (this.C && this.t != null) {
                ai.a(this.t, f);
                hVar.a(ai.l(this.t).b(0.0f));
            }
            hVar.a(j);
            hVar.a(250L);
            hVar.a(this.f);
            this.H = hVar;
            hVar.a();
        } else {
            ai.b((View) this.q, 1.0f);
            ai.a((View) this.q, 0.0f);
            if (this.C && this.t != null) {
                ai.a(this.t, 0.0f);
            }
            this.f.b(null);
        }
        if (this.p != null) {
            ai.p(this.p);
        }
    }

    public void i(boolean z) {
        if (this.H != null) {
            this.H.b();
        }
        if (this.B == 0 && k && (this.I || z)) {
            ai.b((View) this.q, 1.0f);
            this.q.setTransitioning(true);
            android.support.v7.view.h hVar = new android.support.v7.view.h();
            float f = -this.q.getHeight();
            if (z) {
                this.q.getLocationInWindow(new int[]{0, 0});
                f -= r2[1];
            }
            bb bbVarB = ai.l(this.q).b(f);
            bbVarB.a(this.g);
            hVar.a(bbVarB);
            if (this.C && this.t != null) {
                hVar.a(ai.l(this.t).b(f));
            }
            hVar.a(i);
            hVar.a(250L);
            hVar.a(this.e);
            this.H = hVar;
            hVar.a();
            return;
        }
        this.e.b(null);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean b() {
        int iK = k();
        return this.G && (iK == 0 || d() < iK);
    }

    public void j(boolean z) {
        bb bbVarA;
        bb bbVarA2;
        if (z) {
            p();
        } else {
            q();
        }
        if (z) {
            bbVarA2 = this.r.a(4, 100L);
            bbVarA = this.s.a(0, 200L);
        } else {
            bbVarA = this.r.a(0, 200L);
            bbVarA2 = this.s.a(8, 100L);
        }
        android.support.v7.view.h hVar = new android.support.v7.view.h();
        hVar.a(bbVarA2, bbVarA);
        hVar.a();
    }

    @Override // android.support.v7.app.ActionBar
    public Context c() {
        if (this.m == null) {
            TypedValue typedValue = new TypedValue();
            this.l.getTheme().resolveAttribute(a.C0012a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.m = new ContextThemeWrapper(this.l, i2);
            } else {
                this.m = this.l;
            }
        }
        return this.m;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void n() {
        if (this.H != null) {
            this.H.b();
            this.H = null;
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.a
    public void o() {
    }

    @Override // android.support.v7.app.ActionBar
    public boolean f() {
        if (this.r == null || !this.r.c()) {
            return false;
        }
        this.r.d();
        return true;
    }

    public class a extends android.support.v7.view.b implements f.a {
        private final Context b;
        private final android.support.v7.view.menu.f c;
        private b.a d;
        private WeakReference<View> e;

        public a(Context context, b.a aVar) {
            this.b = context;
            this.d = aVar;
            this.c = new android.support.v7.view.menu.f(context).a(1);
            this.c.a(this);
        }

        @Override // android.support.v7.view.b
        public MenuInflater a() {
            return new android.support.v7.view.g(this.b);
        }

        @Override // android.support.v7.view.b
        public Menu b() {
            return this.c;
        }

        @Override // android.support.v7.view.b
        public void c() {
            if (n.this.a == this) {
                if (!n.b(n.this.D, n.this.E, false)) {
                    n.this.b = this;
                    n.this.c = this.d;
                } else {
                    this.d.a(this);
                }
                this.d = null;
                n.this.j(false);
                n.this.s.b();
                n.this.r.a().sendAccessibilityEvent(32);
                n.this.p.setHideOnContentScrollEnabled(n.this.d);
                n.this.a = null;
            }
        }

        @Override // android.support.v7.view.b
        public void d() {
            if (n.this.a == this) {
                this.c.g();
                try {
                    this.d.b(this, this.c);
                } finally {
                    this.c.h();
                }
            }
        }

        public boolean e() {
            this.c.g();
            try {
                return this.d.a(this, this.c);
            } finally {
                this.c.h();
            }
        }

        @Override // android.support.v7.view.b
        public void a(View view) {
            n.this.s.setCustomView(view);
            this.e = new WeakReference<>(view);
        }

        @Override // android.support.v7.view.b
        public void a(CharSequence charSequence) {
            n.this.s.setSubtitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public void b(CharSequence charSequence) {
            n.this.s.setTitle(charSequence);
        }

        @Override // android.support.v7.view.b
        public void a(int i) {
            b(n.this.l.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public void b(int i) {
            a((CharSequence) n.this.l.getResources().getString(i));
        }

        @Override // android.support.v7.view.b
        public CharSequence f() {
            return n.this.s.getTitle();
        }

        @Override // android.support.v7.view.b
        public CharSequence g() {
            return n.this.s.getSubtitle();
        }

        @Override // android.support.v7.view.b
        public void a(boolean z) {
            super.a(z);
            n.this.s.setTitleOptional(z);
        }

        @Override // android.support.v7.view.b
        public boolean h() {
            return n.this.s.d();
        }

        @Override // android.support.v7.view.b
        public View i() {
            if (this.e != null) {
                return this.e.get();
            }
            return null;
        }

        @Override // android.support.v7.view.menu.f.a
        public boolean a(android.support.v7.view.menu.f fVar, MenuItem menuItem) {
            if (this.d != null) {
                return this.d.a(this, menuItem);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.f.a
        public void a(android.support.v7.view.menu.f fVar) {
            if (this.d != null) {
                d();
                n.this.s.a();
            }
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void c(boolean z) {
        if (!this.x) {
            f(z);
        }
    }
}
