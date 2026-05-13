package android.support.p013v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.app.C0121x;
import android.support.p002v4.p010os.C0224d;
import android.support.p002v4.p010os.InterfaceC0226e;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0335au;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0381bg;
import android.support.p002v4.view.C0383bi;
import android.support.p002v4.view.C0403j;
import android.support.p002v4.view.InterfaceC0298ab;
import android.support.p002v4.view.InterfaceC0380bf;
import android.support.p002v4.view.InterfaceC0413n;
import android.support.p002v4.widget.C0517s;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.C0610d;
import android.support.p013v7.view.C0611e;
import android.support.p013v7.view.menu.C0626e;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.widget.ActionBarContextView;
import android.support.p013v7.widget.C0729ac;
import android.support.p013v7.widget.C0730ad;
import android.support.p013v7.widget.C0742g;
import android.support.p013v7.widget.ContentFrameLayout;
import android.support.p013v7.widget.InterfaceC0753m;
import android.support.p013v7.widget.InterfaceC0756p;
import android.support.p013v7.widget.ViewStubCompat;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatDelegateImplV7 */
/* loaded from: classes.dex */
public class AppCompatDelegateImplV7 extends AbstractC0580e implements InterfaceC0413n, C0628f.InterfaceC0629a {

    /* renamed from: A */
    private boolean f1117A;

    /* renamed from: B */
    private PanelFeatureState[] f1118B;

    /* renamed from: C */
    private PanelFeatureState f1119C;

    /* renamed from: D */
    private boolean f1120D;

    /* renamed from: E */
    private boolean f1121E;

    /* renamed from: F */
    private int f1122F;

    /* renamed from: G */
    private final Runnable f1123G;

    /* renamed from: H */
    private boolean f1124H;

    /* renamed from: I */
    private Rect f1125I;

    /* renamed from: J */
    private Rect f1126J;

    /* renamed from: K */
    private C0588j f1127K;

    /* renamed from: m */
    AbstractC0607b f1128m;

    /* renamed from: n */
    ActionBarContextView f1129n;

    /* renamed from: o */
    PopupWindow f1130o;

    /* renamed from: p */
    Runnable f1131p;

    /* renamed from: q */
    C0363bb f1132q;

    /* renamed from: r */
    private InterfaceC0753m f1133r;

    /* renamed from: s */
    private C0557a f1134s;

    /* renamed from: t */
    private C0561d f1135t;

    /* renamed from: u */
    private boolean f1136u;

    /* renamed from: v */
    private ViewGroup f1137v;

    /* renamed from: w */
    private TextView f1138w;

    /* renamed from: x */
    private View f1139x;

    /* renamed from: y */
    private boolean f1140y;

    /* renamed from: z */
    private boolean f1141z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImplV7(Context context, Window window, InterfaceC0578c interfaceC0578c) {
        super(context, window, interfaceC0578c);
        this.f1132q = null;
        this.f1123G = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.1
            @Override // java.lang.Runnable
            public void run() {
                if ((AppCompatDelegateImplV7.this.f1122F & 1) != 0) {
                    AppCompatDelegateImplV7.this.m12070f(0);
                }
                if ((AppCompatDelegateImplV7.this.f1122F & 4096) != 0) {
                    AppCompatDelegateImplV7.this.m12070f(108);
                }
                AppCompatDelegateImplV7.this.f1121E = false;
                AppCompatDelegateImplV7.this.f1122F = 0;
            }
        };
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public void mo11960a(Bundle bundle) {
        if ((this.f1289c instanceof Activity) && C0121x.m13436b((Activity) this.f1289c) != null) {
            ActionBar l = m11966l();
            if (l == null) {
                this.f1124H = true;
            } else {
                l.mo11907c(true);
            }
        }
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: b */
    public void mo11986b(Bundle bundle) {
        m12066s();
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: k */
    public void mo11967k() {
        m12066s();
        if (this.f1294h && this.f1292f == null) {
            if (this.f1289c instanceof Activity) {
                this.f1292f = new C0598n((Activity) this.f1289c, this.f1295i);
            } else if (this.f1289c instanceof Dialog) {
                this.f1292f = new C0598n((Dialog) this.f1289c);
            }
            if (this.f1292f != null) {
                this.f1292f.mo11907c(this.f1124H);
            }
        }
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public View mo11994a(int i) {
        m12066s();
        return this.f1288b.findViewById(i);
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public void mo11990a(Configuration configuration) {
        ActionBar a;
        if (this.f1294h && this.f1136u && (a = mo11977a()) != null) {
            a.mo11922a(configuration);
        }
        mo11957h();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: c */
    public void mo11984c() {
        ActionBar a = mo11977a();
        if (a != null) {
            a.mo11904d(false);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: d */
    public void mo11982d() {
        ActionBar a = mo11977a();
        if (a != null) {
            a.mo11904d(true);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public void mo11989a(View view) {
        m12066s();
        ViewGroup viewGroup = (ViewGroup) this.f1137v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1289c.onContentChanged();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: b */
    public void mo11987b(int i) {
        m12066s();
        ViewGroup viewGroup = (ViewGroup) this.f1137v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1287a).inflate(i, viewGroup);
        this.f1289c.onContentChanged();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public void mo11988a(View view, ViewGroup.LayoutParams layoutParams) {
        m12066s();
        ViewGroup viewGroup = (ViewGroup) this.f1137v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1289c.onContentChanged();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: b */
    public void mo11985b(View view, ViewGroup.LayoutParams layoutParams) {
        m12066s();
        ((ViewGroup) this.f1137v.findViewById(16908290)).addView(view, layoutParams);
        this.f1289c.onContentChanged();
    }

    @Override // android.support.p013v7.app.AbstractC0580e, android.support.p013v7.app.AbstractC0579d
    /* renamed from: f */
    public void mo11968f() {
        super.mo11968f();
        if (this.f1292f != null) {
            this.f1292f.mo11935h();
        }
    }

    /* renamed from: s */
    private void m12066s() {
        if (!this.f1136u) {
            this.f1137v = m12065t();
            CharSequence q = m11962q();
            if (!TextUtils.isEmpty(q)) {
                mo11969b(q);
            }
            m12064u();
            m12089a(this.f1137v);
            this.f1136u = true;
            PanelFeatureState m12104a = m12104a(0, false);
            if (m11964o()) {
                return;
            }
            if (m12104a == null || m12104a.f1158j == null) {
                m12072e(108);
            }
        }
    }

    /* renamed from: t */
    private ViewGroup m12065t() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context;
        TypedArray obtainStyledAttributes = this.f1287a.obtainStyledAttributes(C0535a.C0546k.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0535a.C0546k.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0535a.C0546k.AppCompatTheme_windowNoTitle, false)) {
            mo11983c(1);
        } else if (obtainStyledAttributes.getBoolean(C0535a.C0546k.AppCompatTheme_windowActionBar, false)) {
            mo11983c(108);
        }
        if (obtainStyledAttributes.getBoolean(C0535a.C0546k.AppCompatTheme_windowActionBarOverlay, false)) {
            mo11983c(109);
        }
        if (obtainStyledAttributes.getBoolean(C0535a.C0546k.AppCompatTheme_windowActionModeOverlay, false)) {
            mo11983c(10);
        }
        this.f1297k = obtainStyledAttributes.getBoolean(C0535a.C0546k.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f1288b.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1287a);
        if (!this.f1298l) {
            if (this.f1297k) {
                this.f1295i = false;
                this.f1294h = false;
                viewGroup2 = (ViewGroup) from.inflate(C0535a.C0543h.abc_dialog_title_material, (ViewGroup) null);
            } else if (this.f1294h) {
                TypedValue typedValue = new TypedValue();
                this.f1287a.getTheme().resolveAttribute(C0535a.C0536a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0610d(this.f1287a, typedValue.resourceId);
                } else {
                    context = this.f1287a;
                }
                ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(context).inflate(C0535a.C0543h.abc_screen_toolbar, (ViewGroup) null);
                this.f1133r = (InterfaceC0753m) viewGroup3.findViewById(C0535a.C0541f.decor_content_parent);
                this.f1133r.setWindowCallback(m11963p());
                if (this.f1295i) {
                    this.f1133r.mo11164a(109);
                }
                if (this.f1140y) {
                    this.f1133r.mo11164a(2);
                }
                if (this.f1141z) {
                    this.f1133r.mo11164a(5);
                }
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
        } else {
            if (this.f1296j) {
                viewGroup = (ViewGroup) from.inflate(C0535a.C0543h.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) from.inflate(C0535a.C0543h.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                C0309ai.m12921a(viewGroup, new InterfaceC0298ab() { // from class: android.support.v7.app.AppCompatDelegateImplV7.2
                    @Override // android.support.p002v4.view.InterfaceC0298ab
                    /* renamed from: a */
                    public C0383bi mo12060a(View view, C0383bi c0383bi) {
                        int mo12668b = c0383bi.mo12668b();
                        int m12069g = AppCompatDelegateImplV7.this.m12069g(mo12668b);
                        if (mo12668b != m12069g) {
                            c0383bi = c0383bi.mo12669a(c0383bi.mo12670a(), m12069g, c0383bi.mo12667c(), c0383bi.mo12666d());
                        }
                        return C0309ai.m12920a(view, c0383bi);
                    }
                });
                viewGroup2 = viewGroup;
            } else {
                ((InterfaceC0756p) viewGroup).setOnFitSystemWindowsListener(new InterfaceC0756p.InterfaceC0757a() { // from class: android.support.v7.app.AppCompatDelegateImplV7.3
                    @Override // android.support.p013v7.widget.InterfaceC0756p.InterfaceC0757a
                    /* renamed from: a */
                    public void mo11120a(Rect rect) {
                        rect.top = AppCompatDelegateImplV7.this.m12069g(rect.top);
                    }
                });
                viewGroup2 = viewGroup;
            }
        }
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1294h + ", windowActionBarOverlay: " + this.f1295i + ", android:windowIsFloating: " + this.f1297k + ", windowActionModeOverlay: " + this.f1296j + ", windowNoTitle: " + this.f1298l + " }");
        }
        if (this.f1133r == null) {
            this.f1138w = (TextView) viewGroup2.findViewById(C0535a.C0541f.title);
        }
        C0730ad.m11257b(viewGroup2);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup2.findViewById(C0535a.C0541f.action_bar_activity_content);
        ViewGroup viewGroup4 = (ViewGroup) this.f1288b.findViewById(16908290);
        if (viewGroup4 != null) {
            while (viewGroup4.getChildCount() > 0) {
                View childAt = viewGroup4.getChildAt(0);
                viewGroup4.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup4.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup4 instanceof FrameLayout) {
                ((FrameLayout) viewGroup4).setForeground(null);
            }
        }
        this.f1288b.setContentView(viewGroup2);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.InterfaceC0683a() { // from class: android.support.v7.app.AppCompatDelegateImplV7.4
            @Override // android.support.p013v7.widget.ContentFrameLayout.InterfaceC0683a
            /* renamed from: a */
            public void mo11535a() {
            }

            @Override // android.support.p013v7.widget.ContentFrameLayout.InterfaceC0683a
            /* renamed from: b */
            public void mo11534b() {
                AppCompatDelegateImplV7.this.m12061x();
            }
        });
        return viewGroup2;
    }

    /* renamed from: a */
    void m12089a(ViewGroup viewGroup) {
    }

    /* renamed from: u */
    private void m12064u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1137v.findViewById(16908290);
        View decorView = this.f1288b.getDecorView();
        contentFrameLayout.m11537a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1287a.obtainStyledAttributes(C0535a.C0546k.AppCompatTheme);
        obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0535a.C0546k.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0535a.C0546k.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0535a.C0546k.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0535a.C0546k.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0535a.C0546k.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: c */
    public boolean mo11983c(int i) {
        int m12068h = m12068h(i);
        if (this.f1298l && m12068h == 108) {
            return false;
        }
        if (this.f1294h && m12068h == 1) {
            this.f1294h = false;
        }
        switch (m12068h) {
            case 1:
                m12062w();
                this.f1298l = true;
                return true;
            case 2:
                m12062w();
                this.f1140y = true;
                return true;
            case 5:
                m12062w();
                this.f1141z = true;
                return true;
            case 10:
                m12062w();
                this.f1296j = true;
                return true;
            case 108:
                m12062w();
                this.f1294h = true;
                return true;
            case 109:
                m12062w();
                this.f1295i = true;
                return true;
            default:
                return this.f1288b.requestFeature(m12068h);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: b */
    void mo11969b(CharSequence charSequence) {
        if (this.f1133r != null) {
            this.f1133r.setWindowTitle(charSequence);
        } else if (m11966l() != null) {
            m11966l().mo11917a(charSequence);
        } else if (this.f1138w != null) {
            this.f1138w.setText(charSequence);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    void mo11975a(int i, Menu menu) {
        if (i == 108) {
            ActionBar a = mo11977a();
            if (a != null) {
                a.mo11902e(false);
            }
        } else if (i == 0) {
            PanelFeatureState m12104a = m12104a(i, true);
            if (m12104a.f1163o) {
                m12100a(m12104a, false);
            }
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: b */
    boolean mo11970b(int i, Menu menu) {
        if (i == 108) {
            ActionBar a = mo11977a();
            if (a != null) {
                a.mo11902e(true);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
        PanelFeatureState m12091a;
        Window.Callback p = m11963p();
        if (p == null || m11964o() || (m12091a = m12091a((Menu) c0628f.mo11669p())) == null) {
            return false;
        }
        return p.onMenuItemSelected(m12091a.f1149a, menuItem);
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public void mo11118a(C0628f c0628f) {
        m12092a(c0628f, true);
    }

    /* renamed from: b */
    public AbstractC0607b m12082b(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
        if (interfaceC0608a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f1128m != null) {
            this.f1128m.mo11857c();
        }
        C0558b c0558b = new C0558b(interfaceC0608a);
        ActionBar a = mo11977a();
        if (a != null) {
            this.f1128m = a.mo11919a(c0558b);
            if (this.f1128m != null && this.f1291e != null) {
                this.f1291e.mo11947a(this.f1128m);
            }
        }
        if (this.f1128m == null) {
            this.f1128m = mo11974a(c0558b);
        }
        return this.f1128m;
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: e */
    public void mo11981e() {
        ActionBar a = mo11977a();
        if (a == null || !a.mo11936e()) {
            m12072e(0);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    AbstractC0607b mo11974a(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
        AbstractC0607b abstractC0607b;
        Context context;
        m12063v();
        if (this.f1128m != null) {
            this.f1128m.mo11857c();
        }
        C0558b c0558b = new C0558b(interfaceC0608a);
        if (this.f1291e == null || m11964o()) {
            abstractC0607b = null;
        } else {
            try {
                abstractC0607b = this.f1291e.mo11948a(c0558b);
            } catch (AbstractMethodError e) {
                abstractC0607b = null;
            }
        }
        if (abstractC0607b != null) {
            this.f1128m = abstractC0607b;
        } else {
            if (this.f1129n == null) {
                if (this.f1297k) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f1287a.getTheme();
                    theme.resolveAttribute(C0535a.C0536a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f1287a.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new C0610d(this.f1287a, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f1287a;
                    }
                    this.f1129n = new ActionBarContextView(context);
                    this.f1130o = new PopupWindow(context, (AttributeSet) null, C0535a.C0536a.actionModePopupWindowStyle);
                    C0517s.m12175a(this.f1130o, 2);
                    this.f1130o.setContentView(this.f1129n);
                    this.f1130o.setWidth(-1);
                    context.getTheme().resolveAttribute(C0535a.C0536a.actionBarSize, typedValue, true);
                    this.f1129n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f1130o.setHeight(-2);
                    this.f1131p = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatDelegateImplV7.this.f1130o.showAtLocation(AppCompatDelegateImplV7.this.f1129n, 55, 0, 0);
                            AppCompatDelegateImplV7.this.m12063v();
                            C0309ai.m12914b((View) AppCompatDelegateImplV7.this.f1129n, 0.0f);
                            AppCompatDelegateImplV7.this.f1132q = C0309ai.m12895l(AppCompatDelegateImplV7.this.f1129n).m12710a(1.0f);
                            AppCompatDelegateImplV7.this.f1132q.m12705a(new C0381bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5.1
                                @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
                                /* renamed from: b */
                                public void mo11264b(View view) {
                                    C0309ai.m12914b((View) AppCompatDelegateImplV7.this.f1129n, 1.0f);
                                    AppCompatDelegateImplV7.this.f1132q.m12705a((InterfaceC0380bf) null);
                                    AppCompatDelegateImplV7.this.f1132q = null;
                                }

                                @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
                                /* renamed from: a */
                                public void mo11265a(View view) {
                                    AppCompatDelegateImplV7.this.f1129n.setVisibility(0);
                                }
                            });
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f1137v.findViewById(C0535a.C0541f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m11965m()));
                        this.f1129n = (ActionBarContextView) viewStubCompat.m11311a();
                    }
                }
            }
            if (this.f1129n != null) {
                m12063v();
                this.f1129n.m11662c();
                C0611e c0611e = new C0611e(this.f1129n.getContext(), this.f1129n, c0558b, this.f1130o == null);
                if (interfaceC0608a.mo11850a(c0611e, c0611e.mo11860b())) {
                    c0611e.mo11856d();
                    this.f1129n.m11664a(c0611e);
                    this.f1128m = c0611e;
                    C0309ai.m12914b((View) this.f1129n, 0.0f);
                    this.f1132q = C0309ai.m12895l(this.f1129n).m12710a(1.0f);
                    this.f1132q.m12705a(new C0381bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.6
                        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
                        /* renamed from: b */
                        public void mo11264b(View view) {
                            C0309ai.m12914b((View) AppCompatDelegateImplV7.this.f1129n, 1.0f);
                            AppCompatDelegateImplV7.this.f1132q.m12705a((InterfaceC0380bf) null);
                            AppCompatDelegateImplV7.this.f1132q = null;
                        }

                        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
                        /* renamed from: a */
                        public void mo11265a(View view) {
                            AppCompatDelegateImplV7.this.f1129n.setVisibility(0);
                            AppCompatDelegateImplV7.this.f1129n.sendAccessibilityEvent(32);
                            if (AppCompatDelegateImplV7.this.f1129n.getParent() != null) {
                                C0309ai.m12891p((View) AppCompatDelegateImplV7.this.f1129n.getParent());
                            }
                        }
                    });
                    if (this.f1130o != null) {
                        this.f1288b.getDecorView().post(this.f1131p);
                    }
                } else {
                    this.f1128m = null;
                }
            }
        }
        if (this.f1128m != null && this.f1291e != null) {
            this.f1291e.mo11947a(this.f1128m);
        }
        return this.f1128m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m12063v() {
        if (this.f1132q != null) {
            this.f1132q.m12702b();
        }
    }

    /* renamed from: r */
    boolean m12067r() {
        if (this.f1128m != null) {
            this.f1128m.mo11857c();
            return true;
        }
        ActionBar a = mo11977a();
        return a != null && a.mo11901f();
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    boolean mo11976a(int i, KeyEvent keyEvent) {
        ActionBar a = mo11977a();
        if (a == null || !a.mo11939a(i, keyEvent)) {
            if (this.f1119C != null && m12102a(this.f1119C, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (this.f1119C != null) {
                    this.f1119C.f1162n = true;
                    return true;
                }
                return true;
            }
            if (this.f1119C == null) {
                PanelFeatureState m12104a = m12104a(0, true);
                m12085b(m12104a, keyEvent);
                boolean m12102a = m12102a(m12104a, keyEvent.getKeyCode(), keyEvent, 1);
                m12104a.f1161m = false;
                if (m12102a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    boolean mo11973a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.f1289c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m12080c(keyCode, keyEvent) : m12087b(keyCode, keyEvent);
    }

    /* renamed from: b */
    boolean m12087b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                m12071e(0, keyEvent);
                return true;
            case 4:
                boolean z = this.f1120D;
                this.f1120D = false;
                PanelFeatureState m12104a = m12104a(0, false);
                if (m12104a != null && m12104a.f1163o) {
                    if (z) {
                        return true;
                    }
                    m12100a(m12104a, true);
                    return true;
                } else if (m12067r()) {
                    return true;
                }
                break;
        }
        return false;
    }

    /* renamed from: c */
    boolean m12080c(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                m12074d(0, keyEvent);
                return true;
            case 4:
                this.f1120D = (keyEvent.getFlags() & ItemInfo.APP_INTENT) != 0;
                break;
        }
        if (Build.VERSION.SDK_INT < 11) {
            mo11976a(i, keyEvent);
        }
        return false;
    }

    /* renamed from: c */
    public View m12076c(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z = Build.VERSION.SDK_INT < 21;
        if (this.f1127K == null) {
            this.f1127K = new C0588j();
        }
        return this.f1127K.m11941a(view, str, context, attributeSet, z && m12088a((ViewParent) view), z, true, C0729ac.m11262a());
    }

    /* renamed from: a */
    private boolean m12088a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1288b.getDecorView();
        for (ViewParent viewParent2 = viewParent; viewParent2 != null; viewParent2 = viewParent2.getParent()) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || C0309ai.m12882y((View) viewParent2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: g */
    public void mo11980g() {
        LayoutInflater from = LayoutInflater.from(this.f1287a);
        if (from.getFactory() == null) {
            C0403j.m12632a(from, this);
        } else if (!(C0403j.m12633a(from) instanceof AppCompatDelegateImplV7)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0413n
    /* renamed from: a */
    public final View mo12090a(View view, String str, Context context, AttributeSet attributeSet) {
        View mo11961b = mo11961b(view, str, context, attributeSet);
        return mo11961b != null ? mo11961b : m12076c(view, str, context, attributeSet);
    }

    /* renamed from: b */
    View mo11961b(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.f1289c instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.f1289c).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    /* renamed from: a */
    private void m12101a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (!panelFeatureState.f1163o && !m11964o()) {
            if (panelFeatureState.f1149a == 0) {
                Context context = this.f1287a;
                boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
                if (z && z2) {
                    return;
                }
            }
            Window.Callback p = m11963p();
            if (p != null && !p.onMenuOpened(panelFeatureState.f1149a, panelFeatureState.f1158j)) {
                m12100a(panelFeatureState, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.f1287a.getSystemService("window");
            if (windowManager != null && m12085b(panelFeatureState, keyEvent)) {
                if (panelFeatureState.f1155g == null || panelFeatureState.f1165q) {
                    if (panelFeatureState.f1155g == null) {
                        if (!m12103a(panelFeatureState) || panelFeatureState.f1155g == null) {
                            return;
                        }
                    } else if (panelFeatureState.f1165q && panelFeatureState.f1155g.getChildCount() > 0) {
                        panelFeatureState.f1155g.removeAllViews();
                    }
                    if (m12079c(panelFeatureState) && panelFeatureState.m12059a()) {
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f1156h.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
                        panelFeatureState.f1155g.setBackgroundResource(panelFeatureState.f1150b);
                        ViewParent parent = panelFeatureState.f1156h.getParent();
                        if (parent != null && (parent instanceof ViewGroup)) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f1156h);
                        }
                        panelFeatureState.f1155g.addView(panelFeatureState.f1156h, layoutParams3);
                        if (!panelFeatureState.f1156h.hasFocus()) {
                            panelFeatureState.f1156h.requestFocus();
                        }
                        i = -2;
                    } else {
                        return;
                    }
                } else if (panelFeatureState.f1157i == null || (layoutParams = panelFeatureState.f1157i.getLayoutParams()) == null || layoutParams.width != -1) {
                    i = -2;
                }
                panelFeatureState.f1162n = false;
                WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f1152d, panelFeatureState.f1153e, 1002, 8519680, -3);
                layoutParams4.gravity = panelFeatureState.f1151c;
                layoutParams4.windowAnimations = panelFeatureState.f1154f;
                windowManager.addView(panelFeatureState.f1155g, layoutParams4);
                panelFeatureState.f1163o = true;
            }
        }
    }

    /* renamed from: a */
    private boolean m12103a(PanelFeatureState panelFeatureState) {
        panelFeatureState.m12058a(m11965m());
        panelFeatureState.f1155g = new C0560c(panelFeatureState.f1160l);
        panelFeatureState.f1151c = 81;
        return true;
    }

    /* renamed from: a */
    private void m12092a(C0628f c0628f, boolean z) {
        if (this.f1133r != null && this.f1133r.mo11162d() && (!C0335au.m12756b(ViewConfiguration.get(this.f1287a)) || this.f1133r.mo11160f())) {
            Window.Callback p = m11963p();
            if (!this.f1133r.mo11161e() || !z) {
                if (p != null && !m11964o()) {
                    if (this.f1121E && (this.f1122F & 1) != 0) {
                        this.f1288b.getDecorView().removeCallbacks(this.f1123G);
                        this.f1123G.run();
                    }
                    PanelFeatureState m12104a = m12104a(0, true);
                    if (m12104a.f1158j != null && !m12104a.f1166r && p.onPreparePanel(0, m12104a.f1157i, m12104a.f1158j)) {
                        p.onMenuOpened(108, m12104a.f1158j);
                        this.f1133r.mo11159g();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f1133r.mo11158h();
            if (!m11964o()) {
                p.onPanelClosed(108, m12104a(0, true).f1158j);
                return;
            }
            return;
        }
        PanelFeatureState m12104a2 = m12104a(0, true);
        m12104a2.f1165q = true;
        m12100a(m12104a2, false);
        m12101a(m12104a2, (KeyEvent) null);
    }

    /* renamed from: b */
    private boolean m12086b(PanelFeatureState panelFeatureState) {
        Context c0610d;
        Context context = this.f1287a;
        if ((panelFeatureState.f1149a == 0 || panelFeatureState.f1149a == 108) && this.f1133r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0535a.C0536a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0535a.C0536a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0535a.C0536a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Resources.Theme theme3 = theme2;
            if (theme3 != null) {
                c0610d = new C0610d(context, 0);
                c0610d.getTheme().setTo(theme3);
                C0628f c0628f = new C0628f(c0610d);
                c0628f.mo11675a(this);
                panelFeatureState.m12057a(c0628f);
                return true;
            }
        }
        c0610d = context;
        C0628f c0628f2 = new C0628f(c0610d);
        c0628f2.mo11675a(this);
        panelFeatureState.m12057a(c0628f2);
        return true;
    }

    /* renamed from: c */
    private boolean m12079c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f1157i != null) {
            panelFeatureState.f1156h = panelFeatureState.f1157i;
            return true;
        } else if (panelFeatureState.f1158j == null) {
            return false;
        } else {
            if (this.f1135t == null) {
                this.f1135t = new C0561d();
            }
            panelFeatureState.f1156h = (View) panelFeatureState.m12056a(this.f1135t);
            return panelFeatureState.f1156h != null;
        }
    }

    /* renamed from: b */
    private boolean m12085b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (m11964o()) {
            return false;
        }
        if (panelFeatureState.f1161m) {
            return true;
        }
        if (this.f1119C != null && this.f1119C != panelFeatureState) {
            m12100a(this.f1119C, false);
        }
        Window.Callback p = m11963p();
        if (p != null) {
            panelFeatureState.f1157i = p.onCreatePanelView(panelFeatureState.f1149a);
        }
        boolean z = panelFeatureState.f1149a == 0 || panelFeatureState.f1149a == 108;
        if (z && this.f1133r != null) {
            this.f1133r.mo11157i();
        }
        if (panelFeatureState.f1157i == null && (!z || !(m11966l() instanceof C0590k))) {
            if (panelFeatureState.f1158j == null || panelFeatureState.f1166r) {
                if (panelFeatureState.f1158j == null && (!m12086b(panelFeatureState) || panelFeatureState.f1158j == null)) {
                    return false;
                }
                if (z && this.f1133r != null) {
                    if (this.f1134s == null) {
                        this.f1134s = new C0557a();
                    }
                    this.f1133r.mo11163a(panelFeatureState.f1158j, this.f1134s);
                }
                panelFeatureState.f1158j.m11752g();
                if (!p.onCreatePanelMenu(panelFeatureState.f1149a, panelFeatureState.f1158j)) {
                    panelFeatureState.m12057a((C0628f) null);
                    if (!z || this.f1133r == null) {
                        return false;
                    }
                    this.f1133r.mo11163a(null, this.f1134s);
                    return false;
                }
                panelFeatureState.f1166r = false;
            }
            panelFeatureState.f1158j.m11752g();
            if (panelFeatureState.f1167s != null) {
                panelFeatureState.f1158j.m11764b(panelFeatureState.f1167s);
                panelFeatureState.f1167s = null;
            }
            if (!p.onPreparePanel(0, panelFeatureState.f1157i, panelFeatureState.f1158j)) {
                if (z && this.f1133r != null) {
                    this.f1133r.mo11163a(null, this.f1134s);
                }
                panelFeatureState.f1158j.m11751h();
                return false;
            }
            panelFeatureState.f1164p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f1158j.setQwertyMode(panelFeatureState.f1164p);
            panelFeatureState.f1158j.m11751h();
        }
        panelFeatureState.f1161m = true;
        panelFeatureState.f1162n = false;
        this.f1119C = panelFeatureState;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12081b(C0628f c0628f) {
        if (!this.f1117A) {
            this.f1117A = true;
            this.f1133r.mo11156j();
            Window.Callback p = m11963p();
            if (p != null && !m11964o()) {
                p.onPanelClosed(108, c0628f);
            }
            this.f1117A = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m12075d(int i) {
        m12100a(m12104a(i, true), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12100a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f1149a == 0 && this.f1133r != null && this.f1133r.mo11161e()) {
            m12081b(panelFeatureState.f1158j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1287a.getSystemService("window");
        if (windowManager != null && panelFeatureState.f1163o && panelFeatureState.f1155g != null) {
            windowManager.removeView(panelFeatureState.f1155g);
            if (z) {
                m12105a(panelFeatureState.f1149a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.f1161m = false;
        panelFeatureState.f1162n = false;
        panelFeatureState.f1163o = false;
        panelFeatureState.f1156h = null;
        panelFeatureState.f1165q = true;
        if (this.f1119C == panelFeatureState) {
            this.f1119C = null;
        }
    }

    /* renamed from: d */
    private boolean m12074d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState m12104a = m12104a(i, true);
            if (!m12104a.f1163o) {
                return m12085b(m12104a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m12071e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2 = true;
        if (this.f1128m != null) {
            return false;
        }
        PanelFeatureState m12104a = m12104a(i, true);
        if (i == 0 && this.f1133r != null && this.f1133r.mo11162d() && !C0335au.m12756b(ViewConfiguration.get(this.f1287a))) {
            if (!this.f1133r.mo11161e()) {
                if (!m11964o() && m12085b(m12104a, keyEvent)) {
                    z2 = this.f1133r.mo11159g();
                }
                z2 = false;
            } else {
                z2 = this.f1133r.mo11158h();
            }
        } else if (m12104a.f1163o || m12104a.f1162n) {
            boolean z3 = m12104a.f1163o;
            m12100a(m12104a, true);
            z2 = z3;
        } else {
            if (m12104a.f1161m) {
                if (m12104a.f1166r) {
                    m12104a.f1161m = false;
                    z = m12085b(m12104a, keyEvent);
                } else {
                    z = true;
                }
                if (z) {
                    m12101a(m12104a, keyEvent);
                }
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f1287a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12105a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f1118B.length) {
                panelFeatureState = this.f1118B[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f1158j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f1163o) && !m11964o()) {
            this.f1289c.onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public PanelFeatureState m12091a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f1118B;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f1158j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: a */
    private PanelFeatureState m12104a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f1118B;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f1118B = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    /* renamed from: a */
    private boolean m12102a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((panelFeatureState.f1161m || m12085b(panelFeatureState, keyEvent)) && panelFeatureState.f1158j != null) {
                z = panelFeatureState.f1158j.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.f1133r == null) {
                m12100a(panelFeatureState, true);
            }
        }
        return z;
    }

    /* renamed from: e */
    private void m12072e(int i) {
        this.f1122F |= 1 << i;
        if (!this.f1121E) {
            C0309ai.m12919a(this.f1288b.getDecorView(), this.f1123G);
            this.f1121E = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m12070f(int i) {
        PanelFeatureState m12104a;
        PanelFeatureState m12104a2 = m12104a(i, true);
        if (m12104a2.f1158j != null) {
            Bundle bundle = new Bundle();
            m12104a2.f1158j.m11778a(bundle);
            if (bundle.size() > 0) {
                m12104a2.f1167s = bundle;
            }
            m12104a2.f1158j.m11752g();
            m12104a2.f1158j.clear();
        }
        m12104a2.f1166r = true;
        m12104a2.f1165q = true;
        if ((i == 108 || i == 0) && this.f1133r != null && (m12104a = m12104a(0, false)) != null) {
            m12104a.f1161m = false;
            m12085b(m12104a, (KeyEvent) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public int m12069g(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f1129n == null || !(this.f1129n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1129n.getLayoutParams();
            if (this.f1129n.isShown()) {
                if (this.f1125I == null) {
                    this.f1125I = new Rect();
                    this.f1126J = new Rect();
                }
                Rect rect = this.f1125I;
                Rect rect2 = this.f1126J;
                rect.set(0, i, 0, 0);
                C0730ad.m11258a(this.f1137v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f1139x == null) {
                        this.f1139x = new View(this.f1287a);
                        this.f1139x.setBackgroundColor(this.f1287a.getResources().getColor(C0535a.C0538c.abc_input_method_navigation_guard));
                        this.f1137v.addView(this.f1139x, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f1139x.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1139x.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                r3 = this.f1139x != null;
                if (!this.f1296j && r3) {
                    i = 0;
                }
                boolean z4 = z3;
                z2 = r3;
                r3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                r3 = false;
                z2 = false;
            }
            if (r3) {
                this.f1129n.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.f1139x != null) {
            this.f1139x.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* renamed from: w */
    private void m12062w() {
        if (this.f1136u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: h */
    private int m12068h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m12061x() {
        if (this.f1133r != null) {
            this.f1133r.mo11156j();
        }
        if (this.f1130o != null) {
            this.f1288b.getDecorView().removeCallbacks(this.f1131p);
            if (this.f1130o.isShowing()) {
                try {
                    this.f1130o.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f1130o = null;
        }
        m12063v();
        PanelFeatureState m12104a = m12104a(0, false);
        if (m12104a != null && m12104a.f1158j != null) {
            m12104a.f1158j.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$b */
    /* loaded from: classes.dex */
    public class C0558b implements AbstractC0607b.InterfaceC0608a {

        /* renamed from: b */
        private AbstractC0607b.InterfaceC0608a f1173b;

        public C0558b(AbstractC0607b.InterfaceC0608a interfaceC0608a) {
            this.f1173b = interfaceC0608a;
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public boolean mo11850a(AbstractC0607b abstractC0607b, Menu menu) {
            return this.f1173b.mo11850a(abstractC0607b, menu);
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: b */
        public boolean mo11846b(AbstractC0607b abstractC0607b, Menu menu) {
            return this.f1173b.mo11846b(abstractC0607b, menu);
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public boolean mo11849a(AbstractC0607b abstractC0607b, MenuItem menuItem) {
            return this.f1173b.mo11849a(abstractC0607b, menuItem);
        }

        @Override // android.support.p013v7.view.AbstractC0607b.InterfaceC0608a
        /* renamed from: a */
        public void mo11851a(AbstractC0607b abstractC0607b) {
            this.f1173b.mo11851a(abstractC0607b);
            if (AppCompatDelegateImplV7.this.f1130o != null) {
                AppCompatDelegateImplV7.this.f1288b.getDecorView().removeCallbacks(AppCompatDelegateImplV7.this.f1131p);
            }
            if (AppCompatDelegateImplV7.this.f1129n != null) {
                AppCompatDelegateImplV7.this.m12063v();
                AppCompatDelegateImplV7.this.f1132q = C0309ai.m12895l(AppCompatDelegateImplV7.this.f1129n).m12710a(0.0f);
                AppCompatDelegateImplV7.this.f1132q.m12705a(new C0381bg() { // from class: android.support.v7.app.AppCompatDelegateImplV7.b.1
                    @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
                    /* renamed from: b */
                    public void mo11264b(View view) {
                        AppCompatDelegateImplV7.this.f1129n.setVisibility(8);
                        if (AppCompatDelegateImplV7.this.f1130o != null) {
                            AppCompatDelegateImplV7.this.f1130o.dismiss();
                        } else if (AppCompatDelegateImplV7.this.f1129n.getParent() instanceof View) {
                            C0309ai.m12891p((View) AppCompatDelegateImplV7.this.f1129n.getParent());
                        }
                        AppCompatDelegateImplV7.this.f1129n.removeAllViews();
                        AppCompatDelegateImplV7.this.f1132q.m12705a((InterfaceC0380bf) null);
                        AppCompatDelegateImplV7.this.f1132q = null;
                    }
                });
            }
            if (AppCompatDelegateImplV7.this.f1291e != null) {
                AppCompatDelegateImplV7.this.f1291e.mo11946b(AppCompatDelegateImplV7.this.f1128m);
            }
            AppCompatDelegateImplV7.this.f1128m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$d */
    /* loaded from: classes.dex */
    public final class C0561d implements InterfaceC0643l.InterfaceC0644a {
        private C0561d() {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a */
        public void mo11116a(C0628f c0628f, boolean z) {
            C0628f mo11669p = c0628f.mo11669p();
            boolean z2 = mo11669p != c0628f;
            AppCompatDelegateImplV7 appCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
            if (z2) {
                c0628f = mo11669p;
            }
            PanelFeatureState m12091a = appCompatDelegateImplV7.m12091a((Menu) c0628f);
            if (m12091a != null) {
                if (z2) {
                    AppCompatDelegateImplV7.this.m12105a(m12091a.f1149a, m12091a, mo11669p);
                    AppCompatDelegateImplV7.this.m12100a(m12091a, true);
                    return;
                }
                AppCompatDelegateImplV7.this.m12100a(m12091a, z);
            }
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a_ */
        public boolean mo11114a_(C0628f c0628f) {
            Window.Callback p;
            if (c0628f == null && AppCompatDelegateImplV7.this.f1294h && (p = AppCompatDelegateImplV7.this.m11963p()) != null && !AppCompatDelegateImplV7.this.m11964o()) {
                p.onMenuOpened(108, c0628f);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$a */
    /* loaded from: classes.dex */
    public final class C0557a implements InterfaceC0643l.InterfaceC0644a {
        private C0557a() {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a_ */
        public boolean mo11114a_(C0628f c0628f) {
            Window.Callback p = AppCompatDelegateImplV7.this.m11963p();
            if (p != null) {
                p.onMenuOpened(108, c0628f);
                return true;
            }
            return true;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a */
        public void mo11116a(C0628f c0628f, boolean z) {
            AppCompatDelegateImplV7.this.m12081b(c0628f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        int f1149a;

        /* renamed from: b */
        int f1150b;

        /* renamed from: c */
        int f1151c;

        /* renamed from: d */
        int f1152d;

        /* renamed from: e */
        int f1153e;

        /* renamed from: f */
        int f1154f;

        /* renamed from: g */
        ViewGroup f1155g;

        /* renamed from: h */
        View f1156h;

        /* renamed from: i */
        View f1157i;

        /* renamed from: j */
        C0628f f1158j;

        /* renamed from: k */
        C0626e f1159k;

        /* renamed from: l */
        Context f1160l;

        /* renamed from: m */
        boolean f1161m;

        /* renamed from: n */
        boolean f1162n;

        /* renamed from: o */
        boolean f1163o;

        /* renamed from: p */
        public boolean f1164p;

        /* renamed from: q */
        boolean f1165q = false;

        /* renamed from: r */
        boolean f1166r;

        /* renamed from: s */
        Bundle f1167s;

        PanelFeatureState(int i) {
            this.f1149a = i;
        }

        /* renamed from: a */
        public boolean m12059a() {
            if (this.f1156h == null) {
                return false;
            }
            return this.f1157i != null || this.f1159k.m11792a().getCount() > 0;
        }

        /* renamed from: a */
        void m12058a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0535a.C0536a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0535a.C0536a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0535a.C0545j.Theme_AppCompat_CompactMenu, true);
            }
            C0610d c0610d = new C0610d(context, 0);
            c0610d.getTheme().setTo(newTheme);
            this.f1160l = c0610d;
            TypedArray obtainStyledAttributes = c0610d.obtainStyledAttributes(C0535a.C0546k.AppCompatTheme);
            this.f1150b = obtainStyledAttributes.getResourceId(C0535a.C0546k.AppCompatTheme_panelBackground, 0);
            this.f1154f = obtainStyledAttributes.getResourceId(C0535a.C0546k.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m12057a(C0628f c0628f) {
            if (c0628f != this.f1158j) {
                if (this.f1158j != null) {
                    this.f1158j.m11762b(this.f1159k);
                }
                this.f1158j = c0628f;
                if (c0628f == null || this.f1159k == null) {
                    return;
                }
                c0628f.m11776a(this.f1159k);
            }
        }

        /* renamed from: a */
        InterfaceC0645m m12056a(InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
            if (this.f1158j == null) {
                return null;
            }
            if (this.f1159k == null) {
                this.f1159k = new C0626e(this.f1160l, C0535a.C0543h.abc_list_menu_item_layout);
                this.f1159k.m11790a(interfaceC0644a);
                this.f1158j.m11776a(this.f1159k);
            }
            return this.f1159k.m11789a(this.f1155g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState$SavedState */
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = C0224d.m13211a(new InterfaceC0226e<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState.SavedState.1
                @Override // android.support.p002v4.p010os.InterfaceC0226e
                /* renamed from: b */
                public SavedState mo12052a(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m12054b(parcel, classLoader);
                }

                @Override // android.support.p002v4.p010os.InterfaceC0226e
                /* renamed from: b */
                public SavedState[] mo12053a(int i) {
                    return new SavedState[i];
                }
            });

            /* renamed from: a */
            int f1168a;

            /* renamed from: b */
            boolean f1169b;

            /* renamed from: c */
            Bundle f1170c;

            private SavedState() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1168a);
                parcel.writeInt(this.f1169b ? 1 : 0);
                if (this.f1169b) {
                    parcel.writeBundle(this.f1170c);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public static SavedState m12054b(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1168a = parcel.readInt();
                savedState.f1169b = parcel.readInt() == 1;
                if (savedState.f1169b) {
                    savedState.f1170c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$c */
    /* loaded from: classes.dex */
    public class C0560c extends ContentFrameLayout {
        public C0560c(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV7.this.mo11973a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m12049a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImplV7.this.m12075d(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0742g.m11215a().m11211a(getContext(), i));
        }

        /* renamed from: a */
        private boolean m12049a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }
}
