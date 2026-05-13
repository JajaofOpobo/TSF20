package android.support.p013v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0381bg;
import android.support.p002v4.view.InterfaceC0380bf;
import android.support.p002v4.view.InterfaceC0382bh;
import android.support.p013v7.app.ActionBar;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.C0606a;
import android.support.p013v7.view.C0614g;
import android.support.p013v7.view.C0617h;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.widget.ActionBarContainer;
import android.support.p013v7.widget.ActionBarContextView;
import android.support.p013v7.widget.ActionBarOverlayLayout;
import android.support.p013v7.widget.C0763t;
import android.support.p013v7.widget.InterfaceC0754n;
import android.support.p013v7.widget.Toolbar;
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
/* renamed from: android.support.v7.app.n */
/* loaded from: classes.dex */
public class C0598n extends ActionBar implements ActionBarOverlayLayout.InterfaceC0655a {

    /* renamed from: h */
    static final /* synthetic */ boolean f1342h;

    /* renamed from: i */
    private static final Interpolator f1343i;

    /* renamed from: j */
    private static final Interpolator f1344j;

    /* renamed from: k */
    private static final boolean f1345k;

    /* renamed from: A */
    private boolean f1346A;

    /* renamed from: D */
    private boolean f1349D;

    /* renamed from: E */
    private boolean f1350E;

    /* renamed from: F */
    private boolean f1351F;

    /* renamed from: H */
    private C0617h f1353H;

    /* renamed from: I */
    private boolean f1354I;

    /* renamed from: a */
    C0602a f1355a;

    /* renamed from: b */
    AbstractC0607b f1356b;

    /* renamed from: c */
    AbstractC0607b.InterfaceC0608a f1357c;

    /* renamed from: d */
    boolean f1358d;

    /* renamed from: l */
    private Context f1362l;

    /* renamed from: m */
    private Context f1363m;

    /* renamed from: n */
    private Activity f1364n;

    /* renamed from: o */
    private Dialog f1365o;

    /* renamed from: p */
    private ActionBarOverlayLayout f1366p;

    /* renamed from: q */
    private ActionBarContainer f1367q;

    /* renamed from: r */
    private InterfaceC0754n f1368r;

    /* renamed from: s */
    private ActionBarContextView f1369s;

    /* renamed from: t */
    private View f1370t;

    /* renamed from: u */
    private C0763t f1371u;

    /* renamed from: x */
    private boolean f1374x;

    /* renamed from: y */
    private boolean f1375y;

    /* renamed from: v */
    private ArrayList<Object> f1372v = new ArrayList<>();

    /* renamed from: w */
    private int f1373w = -1;

    /* renamed from: z */
    private ArrayList<ActionBar.InterfaceC0547a> f1376z = new ArrayList<>();

    /* renamed from: B */
    private int f1347B = 0;

    /* renamed from: C */
    private boolean f1348C = true;

    /* renamed from: G */
    private boolean f1352G = true;

    /* renamed from: e */
    final InterfaceC0380bf f1359e = new C0381bg() { // from class: android.support.v7.app.n.1
        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: b */
        public void mo11264b(View view) {
            if (C0598n.this.f1348C && C0598n.this.f1370t != null) {
                C0309ai.m12930a(C0598n.this.f1370t, 0.0f);
                C0309ai.m12930a((View) C0598n.this.f1367q, 0.0f);
            }
            C0598n.this.f1367q.setVisibility(8);
            C0598n.this.f1367q.setTransitioning(false);
            C0598n.this.f1353H = null;
            C0598n.this.m11894i();
            if (C0598n.this.f1366p != null) {
                C0309ai.m12891p(C0598n.this.f1366p);
            }
        }
    };

    /* renamed from: f */
    final InterfaceC0380bf f1360f = new C0381bg() { // from class: android.support.v7.app.n.2
        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: b */
        public void mo11264b(View view) {
            C0598n.this.f1353H = null;
            C0598n.this.f1367q.requestLayout();
        }
    };

    /* renamed from: g */
    final InterfaceC0382bh f1361g = new InterfaceC0382bh() { // from class: android.support.v7.app.n.3
        @Override // android.support.p002v4.view.InterfaceC0382bh
        /* renamed from: a */
        public void mo11884a(View view) {
            ((View) C0598n.this.f1367q.getParent()).invalidate();
        }
    };

    static {
        f1342h = !C0598n.class.desiredAssertionStatus();
        f1343i = new AccelerateInterpolator();
        f1344j = new DecelerateInterpolator();
        f1345k = Build.VERSION.SDK_INT >= 14;
    }

    public C0598n(Activity activity, boolean z) {
        this.f1364n = activity;
        View decorView = activity.getWindow().getDecorView();
        m11918a(decorView);
        if (!z) {
            this.f1370t = decorView.findViewById(16908290);
        }
    }

    public C0598n(Dialog dialog) {
        this.f1365o = dialog;
        m11918a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m11918a(View view) {
        this.f1366p = (ActionBarOverlayLayout) view.findViewById(C0535a.C0541f.decor_content_parent);
        if (this.f1366p != null) {
            this.f1366p.setActionBarVisibilityCallback(this);
        }
        this.f1368r = m11912b(view.findViewById(C0535a.C0541f.action_bar));
        this.f1369s = (ActionBarContextView) view.findViewById(C0535a.C0541f.action_context_bar);
        this.f1367q = (ActionBarContainer) view.findViewById(C0535a.C0541f.action_bar_container);
        if (this.f1368r == null || this.f1369s == null || this.f1367q == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1362l = this.f1368r.mo11145b();
        boolean z = (this.f1368r.mo11129o() & 4) != 0;
        if (z) {
            this.f1374x = true;
        }
        C0606a m11878a = C0606a.m11878a(this.f1362l);
        mo11916a(m11878a.m11873f() || z);
        m11888k(m11878a.m11875d());
        TypedArray obtainStyledAttributes = this.f1362l.obtainStyledAttributes(null, C0535a.C0546k.ActionBar, C0535a.C0536a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0535a.C0546k.ActionBar_hideOnContentScroll, false)) {
            mo11911b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0535a.C0546k.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo11924a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private InterfaceC0754n m11912b(View view) {
        if (view instanceof InterfaceC0754n) {
            return (InterfaceC0754n) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11924a(float f) {
        C0309ai.m12903e(this.f1367q, f);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11922a(Configuration configuration) {
        m11888k(C0606a.m11878a(this.f1362l).m11875d());
    }

    /* renamed from: k */
    private void m11888k(boolean z) {
        boolean z2 = true;
        this.f1346A = z;
        if (!this.f1346A) {
            this.f1368r.mo11150a((C0763t) null);
            this.f1367q.setTabContainer(this.f1371u);
        } else {
            this.f1367q.setTabContainer(null);
            this.f1368r.mo11150a(this.f1371u);
        }
        boolean z3 = m11891j() == 2;
        if (this.f1371u != null) {
            if (z3) {
                this.f1371u.setVisibility(0);
                if (this.f1366p != null) {
                    C0309ai.m12891p(this.f1366p);
                }
            } else {
                this.f1371u.setVisibility(8);
            }
        }
        this.f1368r.mo11146a(!this.f1346A && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1366p;
        if (this.f1346A || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: i */
    void m11894i() {
        if (this.f1357c != null) {
            this.f1357c.mo11851a(this.f1356b);
            this.f1356b = null;
            this.f1357c = null;
        }
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: a */
    public void mo11641a(int i) {
        this.f1347B = i;
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: d */
    public void mo11904d(boolean z) {
        this.f1354I = z;
        if (!z && this.f1353H != null) {
            this.f1353H.m11819b();
        }
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: e */
    public void mo11902e(boolean z) {
        if (z != this.f1375y) {
            this.f1375y = z;
            int size = this.f1376z.size();
            for (int i = 0; i < size; i++) {
                this.f1376z.get(i).m12121a(z);
            }
        }
    }

    /* renamed from: f */
    public void m11899f(boolean z) {
        m11923a(z ? 4 : 0, 4);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11916a(boolean z) {
        this.f1368r.mo11143b(z);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11917a(CharSequence charSequence) {
        this.f1368r.mo11147a(charSequence);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: g */
    public boolean mo11898g() {
        ViewGroup mo11155a = this.f1368r.mo11155a();
        if (mo11155a == null || mo11155a.hasFocus()) {
            return false;
        }
        mo11155a.requestFocus();
        return true;
    }

    /* renamed from: a */
    public void m11923a(int i, int i2) {
        int mo11129o = this.f1368r.mo11129o();
        if ((i2 & 4) != 0) {
            this.f1374x = true;
        }
        this.f1368r.mo11141c((mo11129o & (i2 ^ (-1))) | (i & i2));
    }

    /* renamed from: j */
    public int m11891j() {
        return this.f1368r.mo11128p();
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public int mo11925a() {
        return this.f1368r.mo11129o();
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public AbstractC0607b mo11919a(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
        if (this.f1355a != null) {
            this.f1355a.mo11857c();
        }
        this.f1366p.setHideOnContentScrollEnabled(false);
        this.f1369s.m11662c();
        C0602a c0602a = new C0602a(this.f1369s.getContext(), interfaceC0608a);
        if (c0602a.m11883e()) {
            c0602a.mo11856d();
            this.f1369s.m11664a(c0602a);
            m11890j(true);
            this.f1369s.sendAccessibilityEvent(32);
            this.f1355a = c0602a;
            return c0602a;
        }
        return null;
    }

    /* renamed from: k */
    public int m11889k() {
        return this.f1367q.getHeight();
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: g */
    public void mo11640g(boolean z) {
        this.f1348C = z;
    }

    /* renamed from: p */
    private void m11886p() {
        if (!this.f1351F) {
            this.f1351F = true;
            if (this.f1366p != null) {
                this.f1366p.setShowingForActionMode(true);
            }
            m11887l(false);
        }
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: l */
    public void mo11639l() {
        if (this.f1350E) {
            this.f1350E = false;
            m11887l(true);
        }
    }

    /* renamed from: q */
    private void m11885q() {
        if (this.f1351F) {
            this.f1351F = false;
            if (this.f1366p != null) {
                this.f1366p.setShowingForActionMode(false);
            }
            m11887l(false);
        }
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: m */
    public void mo11638m() {
        if (!this.f1350E) {
            this.f1350E = true;
            m11887l(true);
        }
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: b */
    public void mo11911b(boolean z) {
        if (z && !this.f1366p.m11659a()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1358d = z;
        this.f1366p.setHideOnContentScrollEnabled(z);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: d */
    public int mo11906d() {
        return this.f1366p.getActionBarHideOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11910b(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: l */
    private void m11887l(boolean z) {
        if (m11910b(this.f1349D, this.f1350E, this.f1351F)) {
            if (!this.f1352G) {
                this.f1352G = true;
                m11895h(z);
            }
        } else if (this.f1352G) {
            this.f1352G = false;
            m11892i(z);
        }
    }

    /* renamed from: h */
    public void m11895h(boolean z) {
        int[] iArr;
        if (this.f1353H != null) {
            this.f1353H.m11819b();
        }
        this.f1367q.setVisibility(0);
        if (this.f1347B == 0 && f1345k && (this.f1354I || z)) {
            C0309ai.m12930a((View) this.f1367q, 0.0f);
            float f = -this.f1367q.getHeight();
            if (z) {
                this.f1367q.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C0309ai.m12930a(this.f1367q, f);
            C0617h c0617h = new C0617h();
            C0363bb m12701b = C0309ai.m12895l(this.f1367q).m12701b(0.0f);
            m12701b.m12704a(this.f1361g);
            c0617h.m11824a(m12701b);
            if (this.f1348C && this.f1370t != null) {
                C0309ai.m12930a(this.f1370t, f);
                c0617h.m11824a(C0309ai.m12895l(this.f1370t).m12701b(0.0f));
            }
            c0617h.m11820a(f1344j);
            c0617h.m11825a(250L);
            c0617h.m11822a(this.f1360f);
            this.f1353H = c0617h;
            c0617h.m11826a();
        } else {
            C0309ai.m12914b((View) this.f1367q, 1.0f);
            C0309ai.m12930a((View) this.f1367q, 0.0f);
            if (this.f1348C && this.f1370t != null) {
                C0309ai.m12930a(this.f1370t, 0.0f);
            }
            this.f1360f.mo11264b(null);
        }
        if (this.f1366p != null) {
            C0309ai.m12891p(this.f1366p);
        }
    }

    /* renamed from: i */
    public void m11892i(boolean z) {
        int[] iArr;
        if (this.f1353H != null) {
            this.f1353H.m11819b();
        }
        if (this.f1347B == 0 && f1345k && (this.f1354I || z)) {
            C0309ai.m12914b((View) this.f1367q, 1.0f);
            this.f1367q.setTransitioning(true);
            C0617h c0617h = new C0617h();
            float f = -this.f1367q.getHeight();
            if (z) {
                this.f1367q.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C0363bb m12701b = C0309ai.m12895l(this.f1367q).m12701b(f);
            m12701b.m12704a(this.f1361g);
            c0617h.m11824a(m12701b);
            if (this.f1348C && this.f1370t != null) {
                c0617h.m11824a(C0309ai.m12895l(this.f1370t).m12701b(f));
            }
            c0617h.m11820a(f1343i);
            c0617h.m11825a(250L);
            c0617h.m11822a(this.f1359e);
            this.f1353H = c0617h;
            c0617h.m11826a();
            return;
        }
        this.f1359e.mo11264b(null);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: b */
    public boolean mo11914b() {
        int m11889k = m11889k();
        return this.f1352G && (m11889k == 0 || mo11906d() < m11889k);
    }

    /* renamed from: j */
    public void m11890j(boolean z) {
        C0363bb mo11153a;
        C0363bb mo11307a;
        if (z) {
            m11886p();
        } else {
            m11885q();
        }
        if (z) {
            mo11307a = this.f1368r.mo11153a(4, 100L);
            mo11153a = this.f1369s.mo11307a(0, 200L);
        } else {
            mo11153a = this.f1368r.mo11153a(0, 200L);
            mo11307a = this.f1369s.mo11307a(8, 100L);
        }
        C0617h c0617h = new C0617h();
        c0617h.m11823a(mo11307a, mo11153a);
        c0617h.m11826a();
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: c */
    public Context mo11909c() {
        if (this.f1363m == null) {
            TypedValue typedValue = new TypedValue();
            this.f1362l.getTheme().resolveAttribute(C0535a.C0536a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1363m = new ContextThemeWrapper(this.f1362l, i);
            } else {
                this.f1363m = this.f1362l;
            }
        }
        return this.f1363m;
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: n */
    public void mo11637n() {
        if (this.f1353H != null) {
            this.f1353H.m11819b();
            this.f1353H = null;
        }
    }

    @Override // android.support.p013v7.widget.ActionBarOverlayLayout.InterfaceC0655a
    /* renamed from: o */
    public void mo11636o() {
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: f */
    public boolean mo11901f() {
        if (this.f1368r == null || !this.f1368r.mo11142c()) {
            return false;
        }
        this.f1368r.mo11140d();
        return true;
    }

    /* renamed from: android.support.v7.app.n$a */
    /* loaded from: classes.dex */
    public class C0602a extends AbstractC0607b implements C0628f.InterfaceC0629a {

        /* renamed from: b */
        private final Context f1381b;

        /* renamed from: c */
        private final C0628f f1382c;

        /* renamed from: d */
        private AbstractC0607b.InterfaceC0608a f1383d;

        /* renamed from: e */
        private WeakReference<View> f1384e;

        public C0602a(Context context, AbstractC0607b.InterfaceC0608a interfaceC0608a) {
            this.f1381b = context;
            this.f1383d = interfaceC0608a;
            this.f1382c = new C0628f(context).m11786a(1);
            this.f1382c.mo11675a(this);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: a */
        public MenuInflater mo11865a() {
            return new C0614g(this.f1381b);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: b */
        public Menu mo11860b() {
            return this.f1382c;
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: c */
        public void mo11857c() {
            if (C0598n.this.f1355a == this) {
                if (!C0598n.m11910b(C0598n.this.f1349D, C0598n.this.f1350E, false)) {
                    C0598n.this.f1356b = this;
                    C0598n.this.f1357c = this.f1383d;
                } else {
                    this.f1383d.mo11851a(this);
                }
                this.f1383d = null;
                C0598n.this.m11890j(false);
                C0598n.this.f1369s.m11663b();
                C0598n.this.f1368r.mo11155a().sendAccessibilityEvent(32);
                C0598n.this.f1366p.setHideOnContentScrollEnabled(C0598n.this.f1358d);
                C0598n.this.f1355a = null;
            }
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: d */
        public void mo11856d() {
            if (C0598n.this.f1355a == this) {
                this.f1382c.m11752g();
                try {
                    this.f1383d.mo11846b(this, this.f1382c);
                } finally {
                    this.f1382c.m11751h();
                }
            }
        }

        /* renamed from: e */
        public boolean m11883e() {
            this.f1382c.m11752g();
            try {
                return this.f1383d.mo11850a(this, this.f1382c);
            } finally {
                this.f1382c.m11751h();
            }
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: a */
        public void mo11863a(View view) {
            C0598n.this.f1369s.setCustomView(view);
            this.f1384e = new WeakReference<>(view);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: a */
        public void mo11862a(CharSequence charSequence) {
            C0598n.this.f1369s.setSubtitle(charSequence);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: b */
        public void mo11858b(CharSequence charSequence) {
            C0598n.this.f1369s.setTitle(charSequence);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: a */
        public void mo11864a(int i) {
            mo11858b(C0598n.this.f1362l.getResources().getString(i));
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: b */
        public void mo11859b(int i) {
            mo11862a((CharSequence) C0598n.this.f1362l.getResources().getString(i));
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: f */
        public CharSequence mo11855f() {
            return C0598n.this.f1369s.getTitle();
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: g */
        public CharSequence mo11854g() {
            return C0598n.this.f1369s.getSubtitle();
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: a */
        public void mo11861a(boolean z) {
            super.mo11861a(z);
            C0598n.this.f1369s.setTitleOptional(z);
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: h */
        public boolean mo11853h() {
            return C0598n.this.f1369s.m11661d();
        }

        @Override // android.support.p013v7.view.AbstractC0607b
        /* renamed from: i */
        public View mo11852i() {
            if (this.f1384e != null) {
                return this.f1384e.get();
            }
            return null;
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
            if (this.f1383d != null) {
                return this.f1383d.mo11849a(this, menuItem);
            }
            return false;
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public void mo11118a(C0628f c0628f) {
            if (this.f1383d != null) {
                mo11856d();
                C0598n.this.f1369s.mo11309a();
            }
        }
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: c */
    public void mo11907c(boolean z) {
        if (!this.f1374x) {
            m11899f(z);
        }
    }
}
