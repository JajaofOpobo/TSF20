package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.x;
import android.support.v4.view.ab;
import android.support.v4.view.ai;
import android.support.v4.view.au;
import android.support.v4.view.bb;
import android.support.v4.view.bf;
import android.support.v4.view.bg;
import android.support.v4.view.bi;
import android.support.v4.widget.s;
import android.support.v7.a.a;
import android.support.v7.view.b;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ac;
import android.support.v7.widget.ad;
import android.support.v7.widget.p;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class AppCompatDelegateImplV7 extends e implements android.support.v4.view.n, f.a {
    private boolean A;
    private PanelFeatureState[] B;
    private PanelFeatureState C;
    private boolean D;
    private boolean E;
    private int F;
    private final Runnable G;
    private boolean H;
    private Rect I;
    private Rect J;
    private j K;
    android.support.v7.view.b m;
    ActionBarContextView n;
    PopupWindow o;
    Runnable p;
    bb q;
    private android.support.v7.widget.m r;
    private a s;
    private d t;
    private boolean u;
    private ViewGroup v;
    private TextView w;
    private View x;
    private boolean y;
    private boolean z;

    AppCompatDelegateImplV7(Context context, Window window, android.support.v7.app.c cVar) {
        super(context, window, cVar);
        this.q = null;
        this.G = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.1
            @Override // java.lang.Runnable
            public void run() {
                if ((AppCompatDelegateImplV7.this.F & 1) != 0) {
                    AppCompatDelegateImplV7.this.f(0);
                }
                if ((AppCompatDelegateImplV7.this.F & 4096) != 0) {
                    AppCompatDelegateImplV7.this.f(108);
                }
                AppCompatDelegateImplV7.this.E = false;
                AppCompatDelegateImplV7.this.F = 0;
            }
        };
    }

    @Override // android.support.v7.app.d
    public void a(Bundle bundle) {
        if ((this.c instanceof Activity) && x.b((Activity) this.c) != null) {
            ActionBar actionBarL = l();
            if (actionBarL == null) {
                this.H = true;
            } else {
                actionBarL.c(true);
            }
        }
    }

    @Override // android.support.v7.app.d
    public void b(Bundle bundle) {
        s();
    }

    @Override // android.support.v7.app.e
    public void k() {
        s();
        if (this.h && this.f == null) {
            if (this.c instanceof Activity) {
                this.f = new n((Activity) this.c, this.i);
            } else if (this.c instanceof Dialog) {
                this.f = new n((Dialog) this.c);
            }
            if (this.f != null) {
                this.f.c(this.H);
            }
        }
    }

    @Override // android.support.v7.app.d
    public View a(int i) {
        s();
        return this.b.findViewById(i);
    }

    @Override // android.support.v7.app.d
    public void a(Configuration configuration) {
        ActionBar actionBarA;
        if (this.h && this.u && (actionBarA = a()) != null) {
            actionBarA.a(configuration);
        }
        h();
    }

    @Override // android.support.v7.app.d
    public void c() {
        ActionBar actionBarA = a();
        if (actionBarA != null) {
            actionBarA.d(false);
        }
    }

    @Override // android.support.v7.app.d
    public void d() {
        ActionBar actionBarA = a();
        if (actionBarA != null) {
            actionBarA.d(true);
        }
    }

    @Override // android.support.v7.app.d
    public void a(View view) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void b(int i) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.d
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void f() {
        super.f();
        if (this.f != null) {
            this.f.h();
        }
    }

    private void s() {
        if (!this.u) {
            this.v = t();
            CharSequence charSequenceQ = q();
            if (!TextUtils.isEmpty(charSequenceQ)) {
                b(charSequenceQ);
            }
            u();
            a(this.v);
            this.u = true;
            PanelFeatureState panelFeatureStateA = a(0, false);
            if (o()) {
                return;
            }
            if (panelFeatureStateA == null || panelFeatureStateA.j == null) {
                e(108);
            }
        }
    }

    private ViewGroup t() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context dVar;
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(a.k.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(a.k.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.k.AppCompatTheme_windowNoTitle, false)) {
            c(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(a.k.AppCompatTheme_windowActionBar, false)) {
            c(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.k.AppCompatTheme_windowActionBarOverlay, false)) {
            c(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.k.AppCompatTheme_windowActionModeOverlay, false)) {
            c(10);
        }
        this.k = typedArrayObtainStyledAttributes.getBoolean(a.k.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        this.b.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.a);
        if (!this.l) {
            if (this.k) {
                ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(a.h.abc_dialog_title_material, (ViewGroup) null);
                this.i = false;
                this.h = false;
                viewGroup2 = viewGroup3;
            } else if (this.h) {
                TypedValue typedValue = new TypedValue();
                this.a.getTheme().resolveAttribute(a.C0012a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    dVar = new android.support.v7.view.d(this.a, typedValue.resourceId);
                } else {
                    dVar = this.a;
                }
                ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(dVar).inflate(a.h.abc_screen_toolbar, (ViewGroup) null);
                this.r = (android.support.v7.widget.m) viewGroup4.findViewById(a.f.decor_content_parent);
                this.r.setWindowCallback(p());
                if (this.i) {
                    this.r.a(109);
                }
                if (this.y) {
                    this.r.a(2);
                }
                if (this.z) {
                    this.r.a(5);
                }
                viewGroup2 = viewGroup4;
            } else {
                viewGroup2 = null;
            }
        } else {
            if (this.j) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.h.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.h.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ai.a(viewGroup, new ab() { // from class: android.support.v7.app.AppCompatDelegateImplV7.2
                    @Override // android.support.v4.view.ab
                    public bi a(View view, bi biVar) {
                        int iB = biVar.b();
                        int iG = AppCompatDelegateImplV7.this.g(iB);
                        if (iB != iG) {
                            biVar = biVar.a(biVar.a(), iG, biVar.c(), biVar.d());
                        }
                        return ai.a(view, biVar);
                    }
                });
                viewGroup2 = viewGroup;
            } else {
                ((p) viewGroup).setOnFitSystemWindowsListener(new p.a() { // from class: android.support.v7.app.AppCompatDelegateImplV7.3
                    @Override // android.support.v7.widget.p.a
                    public void a(Rect rect) {
                        rect.top = AppCompatDelegateImplV7.this.g(rect.top);
                    }
                });
                viewGroup2 = viewGroup;
            }
        }
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.h + ", windowActionBarOverlay: " + this.i + ", android:windowIsFloating: " + this.k + ", windowActionModeOverlay: " + this.j + ", windowNoTitle: " + this.l + " }");
        }
        if (this.r == null) {
            this.w = (TextView) viewGroup2.findViewById(a.f.title);
        }
        ad.b(viewGroup2);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup2.findViewById(a.f.action_bar_activity_content);
        ViewGroup viewGroup5 = (ViewGroup) this.b.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.b.setContentView(viewGroup2);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.a() { // from class: android.support.v7.app.AppCompatDelegateImplV7.4
            @Override // android.support.v7.widget.ContentFrameLayout.a
            public void a() {
            }

            @Override // android.support.v7.widget.ContentFrameLayout.a
            public void b() {
                AppCompatDelegateImplV7.this.x();
            }
        });
        return viewGroup2;
    }

    void a(ViewGroup viewGroup) {
    }

    private void u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.b.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(a.k.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(a.k.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.k.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.k.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(a.k.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(a.k.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // android.support.v7.app.d
    public boolean c(int i) {
        int iH = h(i);
        if (this.l && iH == 108) {
            return false;
        }
        if (this.h && iH == 1) {
            this.h = false;
        }
        switch (iH) {
            case 1:
                w();
                this.l = true;
                return true;
            case 2:
                w();
                this.y = true;
                return true;
            case 5:
                w();
                this.z = true;
                return true;
            case 10:
                w();
                this.j = true;
                return true;
            case 108:
                w();
                this.h = true;
                return true;
            case 109:
                w();
                this.i = true;
                return true;
            default:
                return this.b.requestFeature(iH);
        }
    }

    @Override // android.support.v7.app.e
    void b(CharSequence charSequence) {
        if (this.r != null) {
            this.r.setWindowTitle(charSequence);
        } else if (l() != null) {
            l().a(charSequence);
        } else if (this.w != null) {
            this.w.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.e
    void a(int i, Menu menu) {
        if (i == 108) {
            ActionBar actionBarA = a();
            if (actionBarA != null) {
                actionBarA.e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState panelFeatureStateA = a(i, true);
            if (panelFeatureStateA.o) {
                a(panelFeatureStateA, false);
            }
        }
    }

    @Override // android.support.v7.app.e
    boolean b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        ActionBar actionBarA = a();
        if (actionBarA == null) {
            return true;
        }
        actionBarA.e(true);
        return true;
    }

    @Override // android.support.v7.view.menu.f.a
    public boolean a(android.support.v7.view.menu.f fVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateA;
        Window.Callback callbackP = p();
        if (callbackP == null || o() || (panelFeatureStateA = a((Menu) fVar.p())) == null) {
            return false;
        }
        return callbackP.onMenuItemSelected(panelFeatureStateA.a, menuItem);
    }

    @Override // android.support.v7.view.menu.f.a
    public void a(android.support.v7.view.menu.f fVar) {
        a(fVar, true);
    }

    public android.support.v7.view.b b(b.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.m != null) {
            this.m.c();
        }
        b bVar = new b(aVar);
        ActionBar actionBarA = a();
        if (actionBarA != null) {
            this.m = actionBarA.a(bVar);
            if (this.m != null && this.e != null) {
                this.e.a(this.m);
            }
        }
        if (this.m == null) {
            this.m = a(bVar);
        }
        return this.m;
    }

    @Override // android.support.v7.app.d
    public void e() {
        ActionBar actionBarA = a();
        if (actionBarA == null || !actionBarA.e()) {
            e(0);
        }
    }

    @Override // android.support.v7.app.e
    android.support.v7.view.b a(b.a aVar) {
        android.support.v7.view.b bVarA;
        Context dVar;
        v();
        if (this.m != null) {
            this.m.c();
        }
        b bVar = new b(aVar);
        if (this.e == null || o()) {
            bVarA = null;
        } else {
            try {
                bVarA = this.e.a(bVar);
            } catch (AbstractMethodError e) {
                bVarA = null;
            }
        }
        if (bVarA != null) {
            this.m = bVarA;
        } else {
            if (this.n == null) {
                if (this.k) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.a.getTheme();
                    theme.resolveAttribute(a.C0012a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.a.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new android.support.v7.view.d(this.a, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.a;
                    }
                    this.n = new ActionBarContextView(dVar);
                    this.o = new PopupWindow(dVar, (AttributeSet) null, a.C0012a.actionModePopupWindowStyle);
                    s.a(this.o, 2);
                    this.o.setContentView(this.n);
                    this.o.setWidth(-1);
                    dVar.getTheme().resolveAttribute(a.C0012a.actionBarSize, typedValue, true);
                    this.n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.o.setHeight(-2);
                    this.p = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatDelegateImplV7.this.o.showAtLocation(AppCompatDelegateImplV7.this.n, 55, 0, 0);
                            AppCompatDelegateImplV7.this.v();
                            ai.b((View) AppCompatDelegateImplV7.this.n, 0.0f);
                            AppCompatDelegateImplV7.this.q = ai.l(AppCompatDelegateImplV7.this.n).a(1.0f);
                            AppCompatDelegateImplV7.this.q.a(new bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5.1
                                @Override // android.support.v4.view.bg, android.support.v4.view.bf
                                public void b(View view) {
                                    ai.b((View) AppCompatDelegateImplV7.this.n, 1.0f);
                                    AppCompatDelegateImplV7.this.q.a((bf) null);
                                    AppCompatDelegateImplV7.this.q = null;
                                }

                                @Override // android.support.v4.view.bg, android.support.v4.view.bf
                                public void a(View view) {
                                    AppCompatDelegateImplV7.this.n.setVisibility(0);
                                }
                            });
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.v.findViewById(a.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m()));
                        this.n = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.n != null) {
                v();
                this.n.c();
                android.support.v7.view.e eVar = new android.support.v7.view.e(this.n.getContext(), this.n, bVar, this.o == null);
                if (aVar.a(eVar, eVar.b())) {
                    eVar.d();
                    this.n.a(eVar);
                    this.m = eVar;
                    ai.b((View) this.n, 0.0f);
                    this.q = ai.l(this.n).a(1.0f);
                    this.q.a(new bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.6
                        @Override // android.support.v4.view.bg, android.support.v4.view.bf
                        public void b(View view) {
                            ai.b((View) AppCompatDelegateImplV7.this.n, 1.0f);
                            AppCompatDelegateImplV7.this.q.a((bf) null);
                            AppCompatDelegateImplV7.this.q = null;
                        }

                        @Override // android.support.v4.view.bg, android.support.v4.view.bf
                        public void a(View view) {
                            AppCompatDelegateImplV7.this.n.setVisibility(0);
                            AppCompatDelegateImplV7.this.n.sendAccessibilityEvent(32);
                            if (AppCompatDelegateImplV7.this.n.getParent() != null) {
                                ai.p((View) AppCompatDelegateImplV7.this.n.getParent());
                            }
                        }
                    });
                    if (this.o != null) {
                        this.b.getDecorView().post(this.p);
                    }
                } else {
                    this.m = null;
                }
            }
        }
        if (this.m != null && this.e != null) {
            this.e.a(this.m);
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.q != null) {
            this.q.b();
        }
    }

    boolean r() {
        if (this.m != null) {
            this.m.c();
            return true;
        }
        ActionBar actionBarA = a();
        return actionBarA != null && actionBarA.f();
    }

    @Override // android.support.v7.app.e
    boolean a(int i, KeyEvent keyEvent) {
        ActionBar actionBarA = a();
        if (actionBarA != null && actionBarA.a(i, keyEvent)) {
            return true;
        }
        if (this.C != null && a(this.C, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.C == null) {
                return true;
            }
            this.C.n = true;
            return true;
        }
        if (this.C == null) {
            PanelFeatureState panelFeatureStateA = a(0, true);
            b(panelFeatureStateA, keyEvent);
            boolean zA = a(panelFeatureStateA, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateA.m = false;
            if (zA) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.app.e
    boolean a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? c(keyCode, keyEvent) : b(keyCode, keyEvent);
    }

    boolean b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                boolean z = this.D;
                this.D = false;
                PanelFeatureState panelFeatureStateA = a(0, false);
                if (panelFeatureStateA != null && panelFeatureStateA.o) {
                    if (z) {
                        return true;
                    }
                    a(panelFeatureStateA, true);
                    return true;
                }
                if (r()) {
                    return true;
                }
                break;
            case 82:
                e(0, keyEvent);
                return true;
        }
        return false;
    }

    boolean c(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                this.D = (keyEvent.getFlags() & ItemInfo.APP_INTENT) != 0;
                break;
            case 82:
                d(0, keyEvent);
                return true;
        }
        if (Build.VERSION.SDK_INT < 11) {
            a(i, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z = Build.VERSION.SDK_INT < 21;
        if (this.K == null) {
            this.K = new j();
        }
        return this.K.a(view, str, context, attributeSet, z && a((ViewParent) view), z, true, ac.a());
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.b.getDecorView();
        for (ViewParent parent = viewParent; parent != null; parent = parent.getParent()) {
            if (parent == decorView || !(parent instanceof View) || ai.y((View) parent)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.v7.app.d
    public void g() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.a);
        if (layoutInflaterFrom.getFactory() == null) {
            android.support.v4.view.j.a(layoutInflaterFrom, this);
        } else if (!(android.support.v4.view.j.a(layoutInflaterFrom) instanceof AppCompatDelegateImplV7)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.v4.view.n
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        View viewB = b(view, str, context, attributeSet);
        return viewB != null ? viewB : c(view, str, context, attributeSet);
    }

    View b(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView;
        if (!(this.c instanceof LayoutInflater.Factory) || (viewOnCreateView = ((LayoutInflater.Factory) this.c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return viewOnCreateView;
    }

    private void a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (!panelFeatureState.o && !o()) {
            if (panelFeatureState.a == 0) {
                Context context = this.a;
                boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
                if (z && z2) {
                    return;
                }
            }
            Window.Callback callbackP = p();
            if (callbackP != null && !callbackP.onMenuOpened(panelFeatureState.a, panelFeatureState.j)) {
                a(panelFeatureState, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
            if (windowManager != null && b(panelFeatureState, keyEvent)) {
                if (panelFeatureState.g == null || panelFeatureState.q) {
                    if (panelFeatureState.g == null) {
                        if (!a(panelFeatureState) || panelFeatureState.g == null) {
                            return;
                        }
                    } else if (panelFeatureState.q && panelFeatureState.g.getChildCount() > 0) {
                        panelFeatureState.g.removeAllViews();
                    }
                    if (c(panelFeatureState) && panelFeatureState.a()) {
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.h.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
                        panelFeatureState.g.setBackgroundResource(panelFeatureState.b);
                        ViewParent parent = panelFeatureState.h.getParent();
                        if (parent != null && (parent instanceof ViewGroup)) {
                            ((ViewGroup) parent).removeView(panelFeatureState.h);
                        }
                        panelFeatureState.g.addView(panelFeatureState.h, layoutParams3);
                        if (!panelFeatureState.h.hasFocus()) {
                            panelFeatureState.h.requestFocus();
                        }
                        i = -2;
                    } else {
                        return;
                    }
                } else if (panelFeatureState.i == null || (layoutParams = panelFeatureState.i.getLayoutParams()) == null || layoutParams.width != -1) {
                    i = -2;
                }
                panelFeatureState.n = false;
                WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
                layoutParams4.gravity = panelFeatureState.c;
                layoutParams4.windowAnimations = panelFeatureState.f;
                windowManager.addView(panelFeatureState.g, layoutParams4);
                panelFeatureState.o = true;
            }
        }
    }

    private boolean a(PanelFeatureState panelFeatureState) {
        panelFeatureState.a(m());
        panelFeatureState.g = new c(panelFeatureState.l);
        panelFeatureState.c = 81;
        return true;
    }

    private void a(android.support.v7.view.menu.f fVar, boolean z) {
        if (this.r != null && this.r.d() && (!au.b(ViewConfiguration.get(this.a)) || this.r.f())) {
            Window.Callback callbackP = p();
            if (!this.r.e() || !z) {
                if (callbackP != null && !o()) {
                    if (this.E && (this.F & 1) != 0) {
                        this.b.getDecorView().removeCallbacks(this.G);
                        this.G.run();
                    }
                    PanelFeatureState panelFeatureStateA = a(0, true);
                    if (panelFeatureStateA.j != null && !panelFeatureStateA.r && callbackP.onPreparePanel(0, panelFeatureStateA.i, panelFeatureStateA.j)) {
                        callbackP.onMenuOpened(108, panelFeatureStateA.j);
                        this.r.g();
                        return;
                    }
                    return;
                }
                return;
            }
            this.r.h();
            if (!o()) {
                callbackP.onPanelClosed(108, a(0, true).j);
                return;
            }
            return;
        }
        PanelFeatureState panelFeatureStateA2 = a(0, true);
        panelFeatureStateA2.q = true;
        a(panelFeatureStateA2, false);
        a(panelFeatureStateA2, (KeyEvent) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState r7) {
        /*
            r6 = this;
            r5 = 1
            android.content.Context r1 = r6.a
            int r0 = r7.a
            if (r0 == 0) goto Ld
            int r0 = r7.a
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 != r2) goto L71
        Ld:
            android.support.v7.widget.m r0 = r6.r
            if (r0 == 0) goto L71
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r1.getTheme()
            int r0 = android.support.v7.a.a.C0012a.actionBarTheme
            r3.resolveAttribute(r0, r2, r5)
            r0 = 0
            int r4 = r2.resourceId
            if (r4 == 0) goto L6b
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r0.setTo(r3)
            int r4 = r2.resourceId
            r0.applyStyle(r4, r5)
            int r4 = android.support.v7.a.a.C0012a.actionBarWidgetTheme
            r0.resolveAttribute(r4, r2, r5)
        L39:
            int r4 = r2.resourceId
            if (r4 == 0) goto L4f
            if (r0 != 0) goto L4a
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r0.setTo(r3)
        L4a:
            int r2 = r2.resourceId
            r0.applyStyle(r2, r5)
        L4f:
            r2 = r0
            if (r2 == 0) goto L71
            android.support.v7.view.d r0 = new android.support.v7.view.d
            r3 = 0
            r0.<init>(r1, r3)
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r1.setTo(r2)
        L5f:
            android.support.v7.view.menu.f r1 = new android.support.v7.view.menu.f
            r1.<init>(r0)
            r1.a(r6)
            r7.a(r1)
            return r5
        L6b:
            int r4 = android.support.v7.a.a.C0012a.actionBarWidgetTheme
            r3.resolveAttribute(r4, r2, r5)
            goto L39
        L71:
            r0 = r1
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.b(android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState):boolean");
    }

    private boolean c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.i != null) {
            panelFeatureState.h = panelFeatureState.i;
            return true;
        }
        if (panelFeatureState.j == null) {
            return false;
        }
        if (this.t == null) {
            this.t = new d();
        }
        panelFeatureState.h = (View) panelFeatureState.a(this.t);
        return panelFeatureState.h != null;
    }

    private boolean b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (o()) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        if (this.C != null && this.C != panelFeatureState) {
            a(this.C, false);
        }
        Window.Callback callbackP = p();
        if (callbackP != null) {
            panelFeatureState.i = callbackP.onCreatePanelView(panelFeatureState.a);
        }
        boolean z = panelFeatureState.a == 0 || panelFeatureState.a == 108;
        if (z && this.r != null) {
            this.r.i();
        }
        if (panelFeatureState.i == null && (!z || !(l() instanceof k))) {
            if (panelFeatureState.j == null || panelFeatureState.r) {
                if (panelFeatureState.j == null && (!b(panelFeatureState) || panelFeatureState.j == null)) {
                    return false;
                }
                if (z && this.r != null) {
                    if (this.s == null) {
                        this.s = new a();
                    }
                    this.r.a(panelFeatureState.j, this.s);
                }
                panelFeatureState.j.g();
                if (!callbackP.onCreatePanelMenu(panelFeatureState.a, panelFeatureState.j)) {
                    panelFeatureState.a((android.support.v7.view.menu.f) null);
                    if (!z || this.r == null) {
                        return false;
                    }
                    this.r.a(null, this.s);
                    return false;
                }
                panelFeatureState.r = false;
            }
            panelFeatureState.j.g();
            if (panelFeatureState.s != null) {
                panelFeatureState.j.b(panelFeatureState.s);
                panelFeatureState.s = null;
            }
            if (!callbackP.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && this.r != null) {
                    this.r.a(null, this.s);
                }
                panelFeatureState.j.h();
                return false;
            }
            panelFeatureState.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.j.setQwertyMode(panelFeatureState.p);
            panelFeatureState.j.h();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.C = panelFeatureState;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(android.support.v7.view.menu.f fVar) {
        if (!this.A) {
            this.A = true;
            this.r.j();
            Window.Callback callbackP = p();
            if (callbackP != null && !o()) {
                callbackP.onPanelClosed(108, fVar);
            }
            this.A = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        a(a(i, true), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.a == 0 && this.r != null && this.r.e()) {
            b(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (windowManager != null && panelFeatureState.o && panelFeatureState.g != null) {
            windowManager.removeView(panelFeatureState.g);
            if (z) {
                a(panelFeatureState.a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.C == panelFeatureState) {
            this.C = null;
        }
    }

    private boolean d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelFeatureStateA = a(i, true);
            if (!panelFeatureStateA.o) {
                return b(panelFeatureStateA, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r2 = 1
            r1 = 0
            android.support.v7.view.b r0 = r4.m
            if (r0 == 0) goto L8
            r0 = r1
        L7:
            return r0
        L8:
            android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState r3 = r4.a(r5, r2)
            if (r5 != 0) goto L5a
            android.support.v7.widget.m r0 = r4.r
            if (r0 == 0) goto L5a
            android.support.v7.widget.m r0 = r4.r
            boolean r0 = r0.d()
            if (r0 == 0) goto L5a
            android.content.Context r0 = r4.a
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = android.support.v4.view.au.b(r0)
            if (r0 != 0) goto L5a
            android.support.v7.widget.m r0 = r4.r
            boolean r0 = r0.e()
            if (r0 != 0) goto L53
            boolean r0 = r4.o()
            if (r0 != 0) goto L85
            boolean r0 = r4.b(r3, r6)
            if (r0 == 0) goto L85
            android.support.v7.widget.m r0 = r4.r
            boolean r2 = r0.g()
        L40:
            if (r2 == 0) goto L51
            android.content.Context r0 = r4.a
            java.lang.String r3 = "audio"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L7d
            r0.playSoundEffect(r1)
        L51:
            r0 = r2
            goto L7
        L53:
            android.support.v7.widget.m r0 = r4.r
            boolean r2 = r0.h()
            goto L40
        L5a:
            boolean r0 = r3.o
            if (r0 != 0) goto L62
            boolean r0 = r3.n
            if (r0 == 0) goto L69
        L62:
            boolean r0 = r3.o
            r4.a(r3, r2)
            r2 = r0
            goto L40
        L69:
            boolean r0 = r3.m
            if (r0 == 0) goto L85
            boolean r0 = r3.r
            if (r0 == 0) goto L87
            r3.m = r1
            boolean r0 = r4.b(r3, r6)
        L77:
            if (r0 == 0) goto L85
            r4.a(r3, r6)
            goto L40
        L7d:
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "Couldn't get audio manager"
            android.util.Log.w(r0, r1)
            goto L51
        L85:
            r2 = r1
            goto L40
        L87:
            r0 = r2
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.e(int, android.view.KeyEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.B.length) {
                panelFeatureState = this.B[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !o()) {
            this.c.onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PanelFeatureState a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.B;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    private PanelFeatureState a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.B;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.B = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean zPerformShortcut = false;
        if (!keyEvent.isSystem()) {
            if ((panelFeatureState.m || b(panelFeatureState, keyEvent)) && panelFeatureState.j != null) {
                zPerformShortcut = panelFeatureState.j.performShortcut(i, keyEvent, i2);
            }
            if (zPerformShortcut && (i2 & 1) == 0 && this.r == null) {
                a(panelFeatureState, true);
            }
        }
        return zPerformShortcut;
    }

    private void e(int i) {
        this.F |= 1 << i;
        if (!this.E) {
            ai.a(this.b.getDecorView(), this.G);
            this.E = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        PanelFeatureState panelFeatureStateA;
        PanelFeatureState panelFeatureStateA2 = a(i, true);
        if (panelFeatureStateA2.j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateA2.j.a(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateA2.s = bundle;
            }
            panelFeatureStateA2.j.g();
            panelFeatureStateA2.j.clear();
        }
        panelFeatureStateA2.r = true;
        panelFeatureStateA2.q = true;
        if ((i == 108 || i == 0) && this.r != null && (panelFeatureStateA = a(0, false)) != null) {
            panelFeatureStateA.m = false;
            b(panelFeatureStateA, (KeyEvent) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.n == null || !(this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            if (this.n.isShown()) {
                if (this.I == null) {
                    this.I = new Rect();
                    this.J = new Rect();
                }
                Rect rect = this.I;
                Rect rect2 = this.J;
                rect.set(0, i, 0, 0);
                ad.a(this.v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.x == null) {
                        this.x = new View(this.a);
                        this.x.setBackgroundColor(this.a.getResources().getColor(a.c.abc_input_method_navigation_guard));
                        this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.x.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                z = this.x != null;
                if (!this.j && z) {
                    i = 0;
                }
                boolean z4 = z3;
                z2 = z;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                this.n.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.x != null) {
            this.x.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void w() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.r != null) {
            this.r.j();
        }
        if (this.o != null) {
            this.b.getDecorView().removeCallbacks(this.p);
            if (this.o.isShowing()) {
                try {
                    this.o.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.o = null;
        }
        v();
        PanelFeatureState panelFeatureStateA = a(0, false);
        if (panelFeatureStateA != null && panelFeatureStateA.j != null) {
            panelFeatureStateA.j.close();
        }
    }

    class b implements b.a {
        private b.a b;

        public b(b.a aVar) {
            this.b = aVar;
        }

        @Override // android.support.v7.view.b.a
        public boolean a(android.support.v7.view.b bVar, Menu menu) {
            return this.b.a(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public boolean b(android.support.v7.view.b bVar, Menu menu) {
            return this.b.b(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public boolean a(android.support.v7.view.b bVar, MenuItem menuItem) {
            return this.b.a(bVar, menuItem);
        }

        @Override // android.support.v7.view.b.a
        public void a(android.support.v7.view.b bVar) {
            this.b.a(bVar);
            if (AppCompatDelegateImplV7.this.o != null) {
                AppCompatDelegateImplV7.this.b.getDecorView().removeCallbacks(AppCompatDelegateImplV7.this.p);
            }
            if (AppCompatDelegateImplV7.this.n != null) {
                AppCompatDelegateImplV7.this.v();
                AppCompatDelegateImplV7.this.q = ai.l(AppCompatDelegateImplV7.this.n).a(0.0f);
                AppCompatDelegateImplV7.this.q.a(new bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.b.1
                    @Override // android.support.v4.view.bg, android.support.v4.view.bf
                    public void b(View view) {
                        AppCompatDelegateImplV7.this.n.setVisibility(8);
                        if (AppCompatDelegateImplV7.this.o != null) {
                            AppCompatDelegateImplV7.this.o.dismiss();
                        } else if (AppCompatDelegateImplV7.this.n.getParent() instanceof View) {
                            ai.p((View) AppCompatDelegateImplV7.this.n.getParent());
                        }
                        AppCompatDelegateImplV7.this.n.removeAllViews();
                        AppCompatDelegateImplV7.this.q.a((bf) null);
                        AppCompatDelegateImplV7.this.q = null;
                    }
                });
            }
            if (AppCompatDelegateImplV7.this.e != null) {
                AppCompatDelegateImplV7.this.e.b(AppCompatDelegateImplV7.this.m);
            }
            AppCompatDelegateImplV7.this.m = null;
        }
    }

    private final class d implements l.a {
        private d() {
        }

        @Override // android.support.v7.view.menu.l.a
        public void a(android.support.v7.view.menu.f fVar, boolean z) {
            android.support.v7.view.menu.f fVarP = fVar.p();
            boolean z2 = fVarP != fVar;
            AppCompatDelegateImplV7 appCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
            if (z2) {
                fVar = fVarP;
            }
            PanelFeatureState panelFeatureStateA = appCompatDelegateImplV7.a((Menu) fVar);
            if (panelFeatureStateA != null) {
                if (z2) {
                    AppCompatDelegateImplV7.this.a(panelFeatureStateA.a, panelFeatureStateA, fVarP);
                    AppCompatDelegateImplV7.this.a(panelFeatureStateA, true);
                } else {
                    AppCompatDelegateImplV7.this.a(panelFeatureStateA, z);
                }
            }
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean a_(android.support.v7.view.menu.f fVar) {
            Window.Callback callbackP;
            if (fVar == null && AppCompatDelegateImplV7.this.h && (callbackP = AppCompatDelegateImplV7.this.p()) != null && !AppCompatDelegateImplV7.this.o()) {
                callbackP.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    private final class a implements l.a {
        private a() {
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean a_(android.support.v7.view.menu.f fVar) {
            Window.Callback callbackP = AppCompatDelegateImplV7.this.p();
            if (callbackP != null) {
                callbackP.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }

        @Override // android.support.v7.view.menu.l.a
        public void a(android.support.v7.view.menu.f fVar, boolean z) {
            AppCompatDelegateImplV7.this.b(fVar);
        }
    }

    private static final class PanelFeatureState {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        android.support.v7.view.menu.f j;
        android.support.v7.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        PanelFeatureState(int i) {
            this.a = i;
        }

        public boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(a.C0012a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            themeNewTheme.resolveAttribute(a.C0012a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            } else {
                themeNewTheme.applyStyle(a.j.Theme_AppCompat_CompactMenu, true);
            }
            android.support.v7.view.d dVar = new android.support.v7.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(a.k.AppCompatTheme);
            this.b = typedArrayObtainStyledAttributes.getResourceId(a.k.AppCompatTheme_panelBackground, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(a.k.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(android.support.v7.view.menu.f fVar) {
            if (fVar != this.j) {
                if (this.j != null) {
                    this.j.b(this.k);
                }
                this.j = fVar;
                if (fVar == null || this.k == null) {
                    return;
                }
                fVar.a(this.k);
            }
        }

        android.support.v7.view.menu.m a(l.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new android.support.v7.view.menu.e(this.l, a.h.abc_list_menu_item_layout);
                this.k.a(aVar);
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.d.a(new android.support.v4.os.e<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState.SavedState.1
                @Override // android.support.v4.os.e
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState a(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.b(parcel, classLoader);
                }

                @Override // android.support.v4.os.e
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState[] a(int i) {
                    return new SavedState[i];
                }
            });
            int a;
            boolean b;
            Bundle c;

            private SavedState() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b ? 1 : 0);
                if (this.b) {
                    parcel.writeBundle(this.c);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static SavedState b(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt() == 1;
                if (savedState.b) {
                    savedState.c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    private class c extends ContentFrameLayout {
        public c(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV7.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImplV7.this.d(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(android.support.v7.widget.g.a().a(getContext(), i));
        }

        private boolean a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }
}
