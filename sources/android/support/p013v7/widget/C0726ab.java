package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0381bg;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.C0622a;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* renamed from: android.support.v7.widget.ab */
/* loaded from: classes.dex */
public class C0726ab implements InterfaceC0754n {

    /* renamed from: a */
    private Toolbar f2074a;

    /* renamed from: b */
    private int f2075b;

    /* renamed from: c */
    private View f2076c;

    /* renamed from: d */
    private View f2077d;

    /* renamed from: e */
    private Drawable f2078e;

    /* renamed from: f */
    private Drawable f2079f;

    /* renamed from: g */
    private Drawable f2080g;

    /* renamed from: h */
    private boolean f2081h;

    /* renamed from: i */
    private CharSequence f2082i;

    /* renamed from: j */
    private CharSequence f2083j;

    /* renamed from: k */
    private CharSequence f2084k;

    /* renamed from: l */
    private Window.Callback f2085l;

    /* renamed from: m */
    private boolean f2086m;

    /* renamed from: n */
    private ActionMenuPresenter f2087n;

    /* renamed from: o */
    private int f2088o;

    /* renamed from: p */
    private final C0742g f2089p;

    /* renamed from: q */
    private int f2090q;

    /* renamed from: r */
    private Drawable f2091r;

    public C0726ab(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0535a.C0544i.abc_action_bar_up_description, C0535a.C0540e.abc_ic_ab_back_mtrl_am_alpha);
    }

    public C0726ab(Toolbar toolbar, boolean z, int i, int i2) {
        this.f2088o = 0;
        this.f2090q = 0;
        this.f2074a = toolbar;
        this.f2082i = toolbar.getTitle();
        this.f2083j = toolbar.getSubtitle();
        this.f2081h = this.f2082i != null;
        this.f2080g = toolbar.getNavigationIcon();
        if (z) {
            C0725aa m11295a = C0725aa.m11295a(toolbar.getContext(), null, C0535a.C0546k.ActionBar, C0535a.C0536a.actionBarStyle, 0);
            CharSequence m11292c = m11295a.m11292c(C0535a.C0546k.ActionBar_title);
            if (!TextUtils.isEmpty(m11292c)) {
                m11279b(m11292c);
            }
            CharSequence m11292c2 = m11295a.m11292c(C0535a.C0546k.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m11292c2)) {
                m11276c(m11292c2);
            }
            Drawable m11300a = m11295a.m11300a(C0535a.C0546k.ActionBar_logo);
            if (m11300a != null) {
                m11278c(m11300a);
            }
            Drawable m11300a2 = m11295a.m11300a(C0535a.C0546k.ActionBar_icon);
            if (this.f2080g == null && m11300a2 != null) {
                mo11152a(m11300a2);
            }
            Drawable m11300a3 = m11295a.m11300a(C0535a.C0546k.ActionBar_homeAsUpIndicator);
            if (m11300a3 != null) {
                m11274d(m11300a3);
            }
            mo11141c(m11295a.m11298a(C0535a.C0546k.ActionBar_displayOptions, 0));
            int m11284g = m11295a.m11284g(C0535a.C0546k.ActionBar_customNavigationLayout, 0);
            if (m11284g != 0) {
                m11282a(LayoutInflater.from(this.f2074a.getContext()).inflate(m11284g, (ViewGroup) this.f2074a, false));
                mo11141c(this.f2075b | 16);
            }
            int m11285f = m11295a.m11285f(C0535a.C0546k.ActionBar_height, 0);
            if (m11285f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2074a.getLayoutParams();
                layoutParams.height = m11285f;
                this.f2074a.setLayoutParams(layoutParams);
            }
            int m11289d = m11295a.m11289d(C0535a.C0546k.ActionBar_contentInsetStart, -1);
            int m11289d2 = m11295a.m11289d(C0535a.C0546k.ActionBar_contentInsetEnd, -1);
            if (m11289d >= 0 || m11289d2 >= 0) {
                this.f2074a.m11364a(Math.max(m11289d, 0), Math.max(m11289d2, 0));
            }
            int m11284g2 = m11295a.m11284g(C0535a.C0546k.ActionBar_titleTextStyle, 0);
            if (m11284g2 != 0) {
                this.f2074a.m11363a(this.f2074a.getContext(), m11284g2);
            }
            int m11284g3 = m11295a.m11284g(C0535a.C0546k.ActionBar_subtitleTextStyle, 0);
            if (m11284g3 != 0) {
                this.f2074a.m11347b(this.f2074a.getContext(), m11284g3);
            }
            int m11284g4 = m11295a.m11284g(C0535a.C0546k.ActionBar_popupTheme, 0);
            if (m11284g4 != 0) {
                this.f2074a.setPopupTheme(m11284g4);
            }
            m11295a.m11301a();
        } else {
            this.f2075b = m11269s();
        }
        this.f2089p = C0742g.m11215a();
        m11275d(i);
        this.f2084k = this.f2074a.getNavigationContentDescription();
        m11281b(this.f2089p.m11211a(mo11145b(), i2));
        this.f2074a.setNavigationOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ab.1

            /* renamed from: a */
            final C0622a f2092a;

            {
                this.f2092a = new C0622a(C0726ab.this.f2074a.getContext(), 0, 16908332, 0, 0, C0726ab.this.f2082i);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0726ab.this.f2085l != null && C0726ab.this.f2086m) {
                    C0726ab.this.f2085l.onMenuItemSelected(0, this.f2092a);
                }
            }
        });
    }

    /* renamed from: d */
    public void m11275d(int i) {
        if (i != this.f2090q) {
            this.f2090q = i;
            if (TextUtils.isEmpty(this.f2074a.getNavigationContentDescription())) {
                m11271e(this.f2090q);
            }
        }
    }

    /* renamed from: b */
    public void m11281b(Drawable drawable) {
        if (this.f2091r != drawable) {
            this.f2091r = drawable;
            m11266v();
        }
    }

    /* renamed from: s */
    private int m11269s() {
        if (this.f2074a.getNavigationIcon() == null) {
            return 11;
        }
        return 15;
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public ViewGroup mo11155a() {
        return this.f2074a;
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: b */
    public Context mo11145b() {
        return this.f2074a.getContext();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: c */
    public boolean mo11142c() {
        return this.f2074a.m11335g();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: d */
    public void mo11140d() {
        this.f2074a.m11334h();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11148a(Window.Callback callback) {
        this.f2085l = callback;
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11147a(CharSequence charSequence) {
        if (!this.f2081h) {
            m11270e(charSequence);
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: e */
    public CharSequence mo11139e() {
        return this.f2074a.getTitle();
    }

    /* renamed from: b */
    public void m11279b(CharSequence charSequence) {
        this.f2081h = true;
        m11270e(charSequence);
    }

    /* renamed from: e */
    private void m11270e(CharSequence charSequence) {
        this.f2082i = charSequence;
        if ((this.f2075b & 8) != 0) {
            this.f2074a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void m11276c(CharSequence charSequence) {
        this.f2083j = charSequence;
        if ((this.f2075b & 8) != 0) {
            this.f2074a.setSubtitle(charSequence);
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: f */
    public void mo11138f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: g */
    public void mo11137g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11154a(int i) {
        mo11152a(i != 0 ? this.f2089p.m11211a(mo11145b(), i) : null);
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11152a(Drawable drawable) {
        this.f2078e = drawable;
        m11268t();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: b */
    public void mo11144b(int i) {
        m11278c(i != 0 ? this.f2089p.m11211a(mo11145b(), i) : null);
    }

    /* renamed from: c */
    public void m11278c(Drawable drawable) {
        this.f2079f = drawable;
        m11268t();
    }

    /* renamed from: t */
    private void m11268t() {
        Drawable drawable = null;
        if ((this.f2075b & 2) != 0) {
            if ((this.f2075b & 1) != 0) {
                drawable = this.f2079f != null ? this.f2079f : this.f2078e;
            } else {
                drawable = this.f2078e;
            }
        }
        this.f2074a.setLogo(drawable);
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: h */
    public boolean mo11136h() {
        return this.f2074a.m11366a();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: i */
    public boolean mo11135i() {
        return this.f2074a.m11349b();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: j */
    public boolean mo11134j() {
        return this.f2074a.m11343c();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: k */
    public boolean mo11133k() {
        return this.f2074a.m11340d();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: l */
    public boolean mo11132l() {
        return this.f2074a.m11337e();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: m */
    public void mo11131m() {
        this.f2086m = true;
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11149a(Menu menu, InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
        if (this.f2087n == null) {
            this.f2087n = new ActionMenuPresenter(this.f2074a.getContext());
            this.f2087n.m11801a(C0535a.C0541f.action_menu_presenter);
        }
        this.f2087n.m11800a(interfaceC0644a);
        this.f2074a.m11362a((C0628f) menu, this.f2087n);
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: n */
    public void mo11130n() {
        this.f2074a.m11336f();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: o */
    public int mo11129o() {
        return this.f2075b;
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: c */
    public void mo11141c(int i) {
        int i2 = this.f2075b ^ i;
        this.f2075b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m11266v();
                    m11267u();
                } else {
                    this.f2074a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m11268t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2074a.setTitle(this.f2082i);
                    this.f2074a.setSubtitle(this.f2083j);
                } else {
                    this.f2074a.setTitle((CharSequence) null);
                    this.f2074a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.f2077d != null) {
                if ((i & 16) != 0) {
                    this.f2074a.addView(this.f2077d);
                } else {
                    this.f2074a.removeView(this.f2077d);
                }
            }
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11150a(C0763t c0763t) {
        if (this.f2076c != null && this.f2076c.getParent() == this.f2074a) {
            this.f2074a.removeView(this.f2076c);
        }
        this.f2076c = c0763t;
        if (c0763t != null && this.f2088o == 2) {
            this.f2074a.addView(this.f2076c, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f2076c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f1112a = 8388691;
            c0763t.setAllowCollapse(true);
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11146a(boolean z) {
        this.f2074a.setCollapsible(z);
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: b */
    public void mo11143b(boolean z) {
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: p */
    public int mo11128p() {
        return this.f2088o;
    }

    /* renamed from: a */
    public void m11282a(View view) {
        if (this.f2077d != null && (this.f2075b & 16) != 0) {
            this.f2074a.removeView(this.f2077d);
        }
        this.f2077d = view;
        if (view != null && (this.f2075b & 16) != 0) {
            this.f2074a.addView(this.f2077d);
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public C0363bb mo11153a(final int i, long j) {
        return C0309ai.m12895l(this.f2074a).m12710a(i == 0 ? 1.0f : 0.0f).m12709a(j).m12705a(new C0381bg() { // from class: android.support.v7.widget.ab.2

            /* renamed from: c */
            private boolean f2096c = false;

            @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: a */
            public void mo11265a(View view) {
                C0726ab.this.f2074a.setVisibility(0);
            }

            @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: b */
            public void mo11264b(View view) {
                if (!this.f2096c) {
                    C0726ab.this.f2074a.setVisibility(i);
                }
            }

            @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
            /* renamed from: c */
            public void mo11263c(View view) {
                this.f2096c = true;
            }
        });
    }

    /* renamed from: d */
    public void m11274d(Drawable drawable) {
        this.f2080g = drawable;
        m11266v();
    }

    /* renamed from: d */
    public void m11272d(CharSequence charSequence) {
        this.f2084k = charSequence;
        m11267u();
    }

    /* renamed from: e */
    public void m11271e(int i) {
        m11272d(i == 0 ? null : mo11145b().getString(i));
    }

    /* renamed from: u */
    private void m11267u() {
        if ((this.f2075b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2084k)) {
                this.f2074a.setNavigationContentDescription(this.f2090q);
            } else {
                this.f2074a.setNavigationContentDescription(this.f2084k);
            }
        }
    }

    /* renamed from: v */
    private void m11266v() {
        if ((this.f2075b & 4) != 0) {
            this.f2074a.setNavigationIcon(this.f2080g != null ? this.f2080g : this.f2091r);
        }
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: q */
    public int mo11127q() {
        return this.f2074a.getVisibility();
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: a */
    public void mo11151a(InterfaceC0643l.InterfaceC0644a interfaceC0644a, C0628f.InterfaceC0629a interfaceC0629a) {
        this.f2074a.m11361a(interfaceC0644a, interfaceC0629a);
    }

    @Override // android.support.p013v7.widget.InterfaceC0754n
    /* renamed from: r */
    public Menu mo11126r() {
        return this.f2074a.getMenu();
    }
}
