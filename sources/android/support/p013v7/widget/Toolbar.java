package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0391e;
import android.support.p002v4.view.C0414o;
import android.support.p002v4.view.C0419q;
import android.support.p002v4.view.C0427t;
import android.support.p013v7.app.ActionBar;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.C0614g;
import android.support.p013v7.view.InterfaceC0609c;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.C0632h;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.SubMenuC0649p;
import android.support.p013v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: android.support.v7.widget.Toolbar */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private boolean f2007A;

    /* renamed from: B */
    private final ArrayList<View> f2008B;

    /* renamed from: C */
    private final ArrayList<View> f2009C;

    /* renamed from: D */
    private final int[] f2010D;

    /* renamed from: E */
    private InterfaceC0721b f2011E;

    /* renamed from: F */
    private final ActionMenuView.InterfaceC0669d f2012F;

    /* renamed from: G */
    private C0726ab f2013G;

    /* renamed from: H */
    private ActionMenuPresenter f2014H;

    /* renamed from: I */
    private C0720a f2015I;

    /* renamed from: J */
    private InterfaceC0643l.InterfaceC0644a f2016J;

    /* renamed from: K */
    private C0628f.InterfaceC0629a f2017K;

    /* renamed from: L */
    private boolean f2018L;

    /* renamed from: M */
    private final Runnable f2019M;

    /* renamed from: N */
    private final C0742g f2020N;

    /* renamed from: a */
    View f2021a;

    /* renamed from: b */
    private ActionMenuView f2022b;

    /* renamed from: c */
    private TextView f2023c;

    /* renamed from: d */
    private TextView f2024d;

    /* renamed from: e */
    private ImageButton f2025e;

    /* renamed from: f */
    private ImageView f2026f;

    /* renamed from: g */
    private Drawable f2027g;

    /* renamed from: h */
    private CharSequence f2028h;

    /* renamed from: i */
    private ImageButton f2029i;

    /* renamed from: j */
    private Context f2030j;

    /* renamed from: k */
    private int f2031k;

    /* renamed from: l */
    private int f2032l;

    /* renamed from: m */
    private int f2033m;

    /* renamed from: n */
    private int f2034n;

    /* renamed from: o */
    private int f2035o;

    /* renamed from: p */
    private int f2036p;

    /* renamed from: q */
    private int f2037q;

    /* renamed from: r */
    private int f2038r;

    /* renamed from: s */
    private int f2039s;

    /* renamed from: t */
    private final C0762s f2040t;

    /* renamed from: u */
    private int f2041u;

    /* renamed from: v */
    private CharSequence f2042v;

    /* renamed from: w */
    private CharSequence f2043w;

    /* renamed from: x */
    private int f2044x;

    /* renamed from: y */
    private int f2045y;

    /* renamed from: z */
    private boolean f2046z;

    /* renamed from: android.support.v7.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0721b {
        /* renamed from: a */
        boolean m11312a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2040t = new C0762s();
        this.f2041u = 8388627;
        this.f2008B = new ArrayList<>();
        this.f2009C = new ArrayList<>();
        this.f2010D = new int[2];
        this.f2012F = new ActionMenuView.InterfaceC0669d() { // from class: android.support.v7.widget.Toolbar.1
            @Override // android.support.p013v7.widget.ActionMenuView.InterfaceC0669d
            /* renamed from: a */
            public boolean mo11323a(MenuItem menuItem) {
                if (Toolbar.this.f2011E != null) {
                    return Toolbar.this.f2011E.m11312a(menuItem);
                }
                return false;
            }
        };
        this.f2019M = new Runnable() { // from class: android.support.v7.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.m11340d();
            }
        };
        C0725aa m11295a = C0725aa.m11295a(getContext(), attributeSet, C0535a.C0546k.Toolbar, i, 0);
        this.f2032l = m11295a.m11284g(C0535a.C0546k.Toolbar_titleTextAppearance, 0);
        this.f2033m = m11295a.m11284g(C0535a.C0546k.Toolbar_subtitleTextAppearance, 0);
        this.f2041u = m11295a.m11291c(C0535a.C0546k.Toolbar_android_gravity, this.f2041u);
        this.f2034n = 48;
        int m11289d = m11295a.m11289d(C0535a.C0546k.Toolbar_titleMargins, 0);
        this.f2039s = m11289d;
        this.f2038r = m11289d;
        this.f2037q = m11289d;
        this.f2036p = m11289d;
        int m11289d2 = m11295a.m11289d(C0535a.C0546k.Toolbar_titleMarginStart, -1);
        if (m11289d2 >= 0) {
            this.f2036p = m11289d2;
        }
        int m11289d3 = m11295a.m11289d(C0535a.C0546k.Toolbar_titleMarginEnd, -1);
        if (m11289d3 >= 0) {
            this.f2037q = m11289d3;
        }
        int m11289d4 = m11295a.m11289d(C0535a.C0546k.Toolbar_titleMarginTop, -1);
        if (m11289d4 >= 0) {
            this.f2038r = m11289d4;
        }
        int m11289d5 = m11295a.m11289d(C0535a.C0546k.Toolbar_titleMarginBottom, -1);
        if (m11289d5 >= 0) {
            this.f2039s = m11289d5;
        }
        this.f2035o = m11295a.m11287e(C0535a.C0546k.Toolbar_maxButtonHeight, -1);
        int m11289d6 = m11295a.m11289d(C0535a.C0546k.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m11289d7 = m11295a.m11289d(C0535a.C0546k.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        this.f2040t.m11107b(m11295a.m11287e(C0535a.C0546k.Toolbar_contentInsetLeft, 0), m11295a.m11287e(C0535a.C0546k.Toolbar_contentInsetRight, 0));
        if (m11289d6 != Integer.MIN_VALUE || m11289d7 != Integer.MIN_VALUE) {
            this.f2040t.m11110a(m11289d6, m11289d7);
        }
        this.f2027g = m11295a.m11300a(C0535a.C0546k.Toolbar_collapseIcon);
        this.f2028h = m11295a.m11292c(C0535a.C0546k.Toolbar_collapseContentDescription);
        CharSequence m11292c = m11295a.m11292c(C0535a.C0546k.Toolbar_title);
        if (!TextUtils.isEmpty(m11292c)) {
            setTitle(m11292c);
        }
        CharSequence m11292c2 = m11295a.m11292c(C0535a.C0546k.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m11292c2)) {
            setSubtitle(m11292c2);
        }
        this.f2030j = getContext();
        setPopupTheme(m11295a.m11284g(C0535a.C0546k.Toolbar_popupTheme, 0));
        Drawable m11300a = m11295a.m11300a(C0535a.C0546k.Toolbar_navigationIcon);
        if (m11300a != null) {
            setNavigationIcon(m11300a);
        }
        CharSequence m11292c3 = m11295a.m11292c(C0535a.C0546k.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m11292c3)) {
            setNavigationContentDescription(m11292c3);
        }
        Drawable m11300a2 = m11295a.m11300a(C0535a.C0546k.Toolbar_logo);
        if (m11300a2 != null) {
            setLogo(m11300a2);
        }
        CharSequence m11292c4 = m11295a.m11292c(C0535a.C0546k.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m11292c4)) {
            setLogoDescription(m11292c4);
        }
        if (m11295a.m11286f(C0535a.C0546k.Toolbar_titleTextColor)) {
            setTitleTextColor(m11295a.m11293b(C0535a.C0546k.Toolbar_titleTextColor, -1));
        }
        if (m11295a.m11286f(C0535a.C0546k.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m11295a.m11293b(C0535a.C0546k.Toolbar_subtitleTextColor, -1));
        }
        m11295a.m11301a();
        this.f2020N = C0742g.m11215a();
    }

    public void setPopupTheme(int i) {
        if (this.f2031k != i) {
            this.f2031k = i;
            if (i == 0) {
                this.f2030j = getContext();
            } else {
                this.f2030j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2031k;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        this.f2040t.m11109a(i == 1);
    }

    public void setLogo(int i) {
        setLogo(this.f2020N.m11211a(getContext(), i));
    }

    /* renamed from: a */
    public boolean m11366a() {
        return getVisibility() == 0 && this.f2022b != null && this.f2022b.m11601a();
    }

    /* renamed from: b */
    public boolean m11349b() {
        return this.f2022b != null && this.f2022b.m11585g();
    }

    /* renamed from: c */
    public boolean m11343c() {
        return this.f2022b != null && this.f2022b.m11584h();
    }

    /* renamed from: d */
    public boolean m11340d() {
        return this.f2022b != null && this.f2022b.m11587e();
    }

    /* renamed from: e */
    public boolean m11337e() {
        return this.f2022b != null && this.f2022b.m11586f();
    }

    /* renamed from: a */
    public void m11362a(C0628f c0628f, ActionMenuPresenter actionMenuPresenter) {
        if (c0628f != null || this.f2022b != null) {
            m11328n();
            C0628f m11588d = this.f2022b.m11588d();
            if (m11588d != c0628f) {
                if (m11588d != null) {
                    m11588d.m11762b(this.f2014H);
                    m11588d.m11762b(this.f2015I);
                }
                if (this.f2015I == null) {
                    this.f2015I = new C0720a();
                }
                actionMenuPresenter.m11615d(true);
                if (c0628f != null) {
                    c0628f.m11775a(actionMenuPresenter, this.f2030j);
                    c0628f.m11775a(this.f2015I, this.f2030j);
                } else {
                    actionMenuPresenter.mo11319a(this.f2030j, (C0628f) null);
                    this.f2015I.mo11319a(this.f2030j, (C0628f) null);
                    actionMenuPresenter.mo11313b(true);
                    this.f2015I.mo11313b(true);
                }
                this.f2022b.setPopupTheme(this.f2031k);
                this.f2022b.setPresenter(actionMenuPresenter);
                this.f2014H = actionMenuPresenter;
            }
        }
    }

    /* renamed from: f */
    public void m11336f() {
        if (this.f2022b != null) {
            this.f2022b.m11583i();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m11330l();
            if (!m11338d(this.f2026f)) {
                m11353a((View) this.f2026f, true);
            }
        } else if (this.f2026f != null && m11338d(this.f2026f)) {
            removeView(this.f2026f);
            this.f2009C.remove(this.f2026f);
        }
        if (this.f2026f != null) {
            this.f2026f.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.f2026f != null) {
            return this.f2026f.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11330l();
        }
        if (this.f2026f != null) {
            this.f2026f.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.f2026f != null) {
            return this.f2026f.getContentDescription();
        }
        return null;
    }

    /* renamed from: l */
    private void m11330l() {
        if (this.f2026f == null) {
            this.f2026f = new ImageView(getContext());
        }
    }

    /* renamed from: g */
    public boolean m11335g() {
        return (this.f2015I == null || this.f2015I.f2054b == null) ? false : true;
    }

    /* renamed from: h */
    public void m11334h() {
        C0632h c0632h = this.f2015I == null ? null : this.f2015I.f2054b;
        if (c0632h != null) {
            c0632h.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f2042v;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2023c == null) {
                Context context = getContext();
                this.f2023c = new TextView(context);
                this.f2023c.setSingleLine();
                this.f2023c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f2032l != 0) {
                    this.f2023c.setTextAppearance(context, this.f2032l);
                }
                if (this.f2044x != 0) {
                    this.f2023c.setTextColor(this.f2044x);
                }
            }
            if (!m11338d(this.f2023c)) {
                m11353a((View) this.f2023c, true);
            }
        } else if (this.f2023c != null && m11338d(this.f2023c)) {
            removeView(this.f2023c);
            this.f2009C.remove(this.f2023c);
        }
        if (this.f2023c != null) {
            this.f2023c.setText(charSequence);
        }
        this.f2042v = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f2043w;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2024d == null) {
                Context context = getContext();
                this.f2024d = new TextView(context);
                this.f2024d.setSingleLine();
                this.f2024d.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f2033m != 0) {
                    this.f2024d.setTextAppearance(context, this.f2033m);
                }
                if (this.f2045y != 0) {
                    this.f2024d.setTextColor(this.f2045y);
                }
            }
            if (!m11338d(this.f2024d)) {
                m11353a((View) this.f2024d, true);
            }
        } else if (this.f2024d != null && m11338d(this.f2024d)) {
            removeView(this.f2024d);
            this.f2009C.remove(this.f2024d);
        }
        if (this.f2024d != null) {
            this.f2024d.setText(charSequence);
        }
        this.f2043w = charSequence;
    }

    /* renamed from: a */
    public void m11363a(Context context, int i) {
        this.f2032l = i;
        if (this.f2023c != null) {
            this.f2023c.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public void m11347b(Context context, int i) {
        this.f2033m = i;
        if (this.f2024d != null) {
            this.f2024d.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.f2044x = i;
        if (this.f2023c != null) {
            this.f2023c.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.f2045y = i;
        if (this.f2024d != null) {
            this.f2024d.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f2025e != null) {
            return this.f2025e.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11327o();
        }
        if (this.f2025e != null) {
            this.f2025e.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(this.f2020N.m11211a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m11327o();
            if (!m11338d(this.f2025e)) {
                m11353a((View) this.f2025e, true);
            }
        } else if (this.f2025e != null && m11338d(this.f2025e)) {
            removeView(this.f2025e);
            this.f2009C.remove(this.f2025e);
        }
        if (this.f2025e != null) {
            this.f2025e.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.f2025e != null) {
            return this.f2025e.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m11327o();
        this.f2025e.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m11329m();
        return this.f2022b.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m11329m();
        this.f2022b.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m11329m();
        return this.f2022b.getOverflowIcon();
    }

    /* renamed from: m */
    private void m11329m() {
        m11328n();
        if (this.f2022b.m11588d() == null) {
            C0628f c0628f = (C0628f) this.f2022b.getMenu();
            if (this.f2015I == null) {
                this.f2015I = new C0720a();
            }
            this.f2022b.setExpandedActionViewsExclusive(true);
            c0628f.m11775a(this.f2015I, this.f2030j);
        }
    }

    /* renamed from: n */
    private void m11328n() {
        if (this.f2022b == null) {
            this.f2022b = new ActionMenuView(getContext());
            this.f2022b.setPopupTheme(this.f2031k);
            this.f2022b.setOnMenuItemClickListener(this.f2012F);
            this.f2022b.m11597a(this.f2016J, this.f2017K);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1112a = 8388613 | (this.f2034n & 112);
            this.f2022b.setLayoutParams(generateDefaultLayoutParams);
            m11353a((View) this.f2022b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0614g(getContext());
    }

    public void setOnMenuItemClickListener(InterfaceC0721b interfaceC0721b) {
        this.f2011E = interfaceC0721b;
    }

    /* renamed from: a */
    public void m11364a(int i, int i2) {
        this.f2040t.m11110a(i, i2);
    }

    public int getContentInsetStart() {
        return this.f2040t.m11106c();
    }

    public int getContentInsetEnd() {
        return this.f2040t.m11105d();
    }

    public int getContentInsetLeft() {
        return this.f2040t.m11111a();
    }

    public int getContentInsetRight() {
        return this.f2040t.m11108b();
    }

    /* renamed from: o */
    private void m11327o() {
        if (this.f2025e == null) {
            this.f2025e = new ImageButton(getContext(), null, C0535a.C0536a.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1112a = 8388611 | (this.f2034n & 112);
            this.f2025e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m11326p() {
        if (this.f2029i == null) {
            this.f2029i = new ImageButton(getContext(), null, C0535a.C0536a.toolbarNavigationButtonStyle);
            this.f2029i.setImageDrawable(this.f2027g);
            this.f2029i.setContentDescription(this.f2028h);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1112a = 8388611 | (this.f2034n & 112);
            generateDefaultLayoutParams.f2050b = 2;
            this.f2029i.setLayoutParams(generateDefaultLayoutParams);
            this.f2029i.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.m11334h();
                }
            });
        }
    }

    /* renamed from: a */
    private void m11353a(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f2050b = 1;
        if (z && this.f2021a != null) {
            view.setLayoutParams(layoutParams);
            this.f2009C.add(view);
            return;
        }
        addView(view, layoutParams);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f2015I != null && this.f2015I.f2054b != null) {
            savedState.f2051a = this.f2015I.f2054b.getItemId();
        }
        savedState.f2052b = m11349b();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        C0628f m11588d = this.f2022b != null ? this.f2022b.m11588d() : null;
        if (savedState.f2051a != 0 && this.f2015I != null && m11588d != null && (findItem = m11588d.findItem(savedState.f2051a)) != null) {
            C0419q.m12614b(findItem);
        }
        if (savedState.f2052b) {
            m11325q();
        }
    }

    /* renamed from: q */
    private void m11325q() {
        removeCallbacks(this.f2019M);
        post(this.f2019M);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2019M);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int m12599a = C0427t.m12599a(motionEvent);
        if (m12599a == 0) {
            this.f2046z = false;
        }
        if (!this.f2046z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (m12599a == 0 && !onTouchEvent) {
                this.f2046z = true;
            }
        }
        if (m12599a == 1 || m12599a == 3) {
            this.f2046z = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int m12599a = C0427t.m12599a(motionEvent);
        if (m12599a == 9) {
            this.f2007A = false;
        }
        if (!this.f2007A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (m12599a == 9 && !onHoverEvent) {
                this.f2007A = true;
            }
        }
        if (m12599a == 10 || m12599a == 3) {
            this.f2007A = false;
        }
        return true;
    }

    /* renamed from: a */
    private void m11356a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m11355a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: r */
    private boolean m11324r() {
        if (this.f2018L) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (m11358a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.f2010D;
        if (C0730ad.m11259a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int i7 = 0;
        if (m11358a(this.f2025e)) {
            m11356a(this.f2025e, i, 0, i2, 0, this.f2035o);
            i7 = this.f2025e.getMeasuredWidth() + m11345b(this.f2025e);
            int max = Math.max(0, this.f2025e.getMeasuredHeight() + m11341c(this.f2025e));
            i6 = C0730ad.m11260a(0, C0309ai.m12898i(this.f2025e));
            i5 = max;
        }
        if (m11358a(this.f2029i)) {
            m11356a(this.f2029i, i, 0, i2, 0, this.f2035o);
            i7 = this.f2029i.getMeasuredWidth() + m11345b(this.f2029i);
            i5 = Math.max(i5, this.f2029i.getMeasuredHeight() + m11341c(this.f2029i));
            i6 = C0730ad.m11260a(i6, C0309ai.m12898i(this.f2029i));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = 0 + Math.max(contentInsetStart, i7);
        iArr[c2] = Math.max(0, contentInsetStart - i7);
        int i8 = 0;
        if (m11358a(this.f2022b)) {
            m11356a(this.f2022b, i, max2, i2, 0, this.f2035o);
            i8 = this.f2022b.getMeasuredWidth() + m11345b(this.f2022b);
            i5 = Math.max(i5, this.f2022b.getMeasuredHeight() + m11341c(this.f2022b));
            i6 = C0730ad.m11260a(i6, C0309ai.m12898i(this.f2022b));
        }
        int contentInsetEnd = getContentInsetEnd();
        int max3 = max2 + Math.max(contentInsetEnd, i8);
        iArr[c] = Math.max(0, contentInsetEnd - i8);
        if (m11358a(this.f2021a)) {
            max3 += m11355a(this.f2021a, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f2021a.getMeasuredHeight() + m11341c(this.f2021a));
            i6 = C0730ad.m11260a(i6, C0309ai.m12898i(this.f2021a));
        }
        if (m11358a(this.f2026f)) {
            max3 += m11355a(this.f2026f, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f2026f.getMeasuredHeight() + m11341c(this.f2026f));
            i6 = C0730ad.m11260a(i6, C0309ai.m12898i(this.f2026f));
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = i5;
        int i11 = i6;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (((LayoutParams) childAt.getLayoutParams()).f2050b != 0) {
                i3 = i11;
                i4 = i10;
            } else if (m11358a(childAt)) {
                max3 += m11355a(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i10, childAt.getMeasuredHeight() + m11341c(childAt));
                i3 = C0730ad.m11260a(i11, C0309ai.m12898i(childAt));
                i4 = max4;
            } else {
                i3 = i11;
                i4 = i10;
            }
            i9++;
            i11 = i3;
            i10 = i4;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = this.f2038r + this.f2039s;
        int i15 = this.f2036p + this.f2037q;
        if (m11358a(this.f2023c)) {
            m11355a(this.f2023c, i, max3 + i15, i2, i14, iArr);
            i12 = m11345b(this.f2023c) + this.f2023c.getMeasuredWidth();
            i13 = this.f2023c.getMeasuredHeight() + m11341c(this.f2023c);
            i11 = C0730ad.m11260a(i11, C0309ai.m12898i(this.f2023c));
        }
        if (m11358a(this.f2024d)) {
            i12 = Math.max(i12, m11355a(this.f2024d, i, max3 + i15, i2, i14 + i13, iArr));
            i13 += this.f2024d.getMeasuredHeight() + m11341c(this.f2024d);
            i11 = C0730ad.m11260a(i11, C0309ai.m12898i(this.f2024d));
        }
        int max5 = Math.max(i10, i13);
        int paddingLeft = i12 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int m12932a = C0309ai.m12932a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i11);
        int m12932a2 = C0309ai.m12932a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i11 << 16);
        if (m11324r()) {
            m12932a2 = 0;
        }
        setMeasuredDimension(m12932a, m12932a2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int max;
        boolean z2 = C0309ai.m12904e(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.f2010D;
        iArr[1] = 0;
        iArr[0] = 0;
        int m12896k = C0309ai.m12896k(this);
        if (!m11358a(this.f2025e)) {
            i5 = paddingLeft;
        } else if (z2) {
            i15 = m11344b(this.f2025e, i15, iArr, m12896k);
            i5 = paddingLeft;
        } else {
            i5 = m11354a(this.f2025e, paddingLeft, iArr, m12896k);
        }
        if (m11358a(this.f2029i)) {
            if (z2) {
                i15 = m11344b(this.f2029i, i15, iArr, m12896k);
            } else {
                i5 = m11354a(this.f2029i, i5, iArr, m12896k);
            }
        }
        if (m11358a(this.f2022b)) {
            if (z2) {
                i5 = m11354a(this.f2022b, i5, iArr, m12896k);
            } else {
                i15 = m11344b(this.f2022b, i15, iArr, m12896k);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i5);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i15));
        int max2 = Math.max(i5, getContentInsetLeft());
        int min = Math.min(i15, (width - paddingRight) - getContentInsetRight());
        if (m11358a(this.f2021a)) {
            if (z2) {
                min = m11344b(this.f2021a, min, iArr, m12896k);
            } else {
                max2 = m11354a(this.f2021a, max2, iArr, m12896k);
            }
        }
        if (!m11358a(this.f2026f)) {
            i6 = min;
            i7 = max2;
        } else if (z2) {
            i6 = m11344b(this.f2026f, min, iArr, m12896k);
            i7 = max2;
        } else {
            i6 = min;
            i7 = m11354a(this.f2026f, max2, iArr, m12896k);
        }
        boolean m11358a = m11358a(this.f2023c);
        boolean m11358a2 = m11358a(this.f2024d);
        int i16 = 0;
        if (m11358a) {
            LayoutParams layoutParams = (LayoutParams) this.f2023c.getLayoutParams();
            i16 = 0 + layoutParams.bottomMargin + layoutParams.topMargin + this.f2023c.getMeasuredHeight();
        }
        if (m11358a2) {
            LayoutParams layoutParams2 = (LayoutParams) this.f2024d.getLayoutParams();
            i8 = layoutParams2.bottomMargin + layoutParams2.topMargin + this.f2024d.getMeasuredHeight() + i16;
        } else {
            i8 = i16;
        }
        if (m11358a || m11358a2) {
            TextView textView = m11358a ? this.f2023c : this.f2024d;
            TextView textView2 = m11358a2 ? this.f2024d : this.f2023c;
            LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
            LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
            boolean z3 = (m11358a && this.f2023c.getMeasuredWidth() > 0) || (m11358a2 && this.f2024d.getMeasuredWidth() > 0);
            switch (this.f2041u & 112) {
                case 48:
                    i9 = layoutParams3.topMargin + getPaddingTop() + this.f2038r;
                    break;
                case 80:
                    i9 = (((height - paddingBottom) - layoutParams4.bottomMargin) - this.f2039s) - i8;
                    break;
                default:
                    int i17 = (((height - paddingTop) - paddingBottom) - i8) / 2;
                    if (i17 < layoutParams3.topMargin + this.f2038r) {
                        max = layoutParams3.topMargin + this.f2038r;
                    } else {
                        int i18 = (((height - paddingBottom) - i8) - i17) - paddingTop;
                        max = i18 < layoutParams3.bottomMargin + this.f2039s ? Math.max(0, i17 - ((layoutParams4.bottomMargin + this.f2039s) - i18)) : i17;
                    }
                    i9 = paddingTop + max;
                    break;
            }
            if (z2) {
                int i19 = (z3 ? this.f2036p : 0) - iArr[1];
                int max3 = i6 - Math.max(0, i19);
                iArr[1] = Math.max(0, -i19);
                if (m11358a) {
                    int measuredWidth = max3 - this.f2023c.getMeasuredWidth();
                    int measuredHeight = this.f2023c.getMeasuredHeight() + i9;
                    this.f2023c.layout(measuredWidth, i9, max3, measuredHeight);
                    int i20 = measuredWidth - this.f2037q;
                    i9 = measuredHeight + ((LayoutParams) this.f2023c.getLayoutParams()).bottomMargin;
                    i13 = i20;
                } else {
                    i13 = max3;
                }
                if (m11358a2) {
                    LayoutParams layoutParams5 = (LayoutParams) this.f2024d.getLayoutParams();
                    int i21 = layoutParams5.topMargin + i9;
                    int measuredHeight2 = this.f2024d.getMeasuredHeight() + i21;
                    this.f2024d.layout(max3 - this.f2024d.getMeasuredWidth(), i21, max3, measuredHeight2);
                    int i22 = layoutParams5.bottomMargin + measuredHeight2;
                    i14 = max3 - this.f2037q;
                } else {
                    i14 = max3;
                }
                i6 = z3 ? Math.min(i13, i14) : max3;
            } else {
                int i23 = (z3 ? this.f2036p : 0) - iArr[0];
                i7 += Math.max(0, i23);
                iArr[0] = Math.max(0, -i23);
                if (m11358a) {
                    int measuredWidth2 = this.f2023c.getMeasuredWidth() + i7;
                    int measuredHeight3 = this.f2023c.getMeasuredHeight() + i9;
                    this.f2023c.layout(i7, i9, measuredWidth2, measuredHeight3);
                    int i24 = ((LayoutParams) this.f2023c.getLayoutParams()).bottomMargin + measuredHeight3;
                    i10 = measuredWidth2 + this.f2037q;
                    i11 = i24;
                } else {
                    i10 = i7;
                    i11 = i9;
                }
                if (m11358a2) {
                    LayoutParams layoutParams6 = (LayoutParams) this.f2024d.getLayoutParams();
                    int i25 = i11 + layoutParams6.topMargin;
                    int measuredWidth3 = this.f2024d.getMeasuredWidth() + i7;
                    int measuredHeight4 = this.f2024d.getMeasuredHeight() + i25;
                    this.f2024d.layout(i7, i25, measuredWidth3, measuredHeight4);
                    int i26 = layoutParams6.bottomMargin + measuredHeight4;
                    i12 = this.f2037q + measuredWidth3;
                } else {
                    i12 = i7;
                }
                if (z3) {
                    i7 = Math.max(i10, i12);
                }
            }
        }
        m11351a(this.f2008B, 3);
        int size = this.f2008B.size();
        int i27 = i7;
        for (int i28 = 0; i28 < size; i28++) {
            i27 = m11354a(this.f2008B.get(i28), i27, iArr, m12896k);
        }
        m11351a(this.f2008B, 5);
        int size2 = this.f2008B.size();
        for (int i29 = 0; i29 < size2; i29++) {
            i6 = m11344b(this.f2008B.get(i29), i6, iArr, m12896k);
        }
        m11351a(this.f2008B, 1);
        int m11350a = m11350a(this.f2008B, iArr);
        int i30 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (m11350a / 2);
        int i31 = m11350a + i30;
        if (i30 < i27) {
            i30 = i27;
        } else if (i31 > i6) {
            i30 -= i31 - i6;
        }
        int size3 = this.f2008B.size();
        int i32 = i30;
        for (int i33 = 0; i33 < size3; i33++) {
            i32 = m11354a(this.f2008B.get(i33), i32, iArr, m12896k);
        }
        this.f2008B.clear();
    }

    /* renamed from: a */
    private int m11350a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i7 = layoutParams.leftMargin - i6;
            int i8 = layoutParams.rightMargin - i5;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            i6 = Math.max(0, -i7);
            i5 = Math.max(0, -i8);
            i3++;
            i4 += view.getMeasuredWidth() + max + max2;
        }
        return i4;
    }

    /* renamed from: a */
    private int m11354a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m11357a = m11357a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m11357a, max + measuredWidth, view.getMeasuredHeight() + m11357a);
        return layoutParams.rightMargin + measuredWidth + max;
    }

    /* renamed from: b */
    private int m11344b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m11357a = m11357a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m11357a, max, view.getMeasuredHeight() + m11357a);
        return max - (layoutParams.leftMargin + measuredWidth);
    }

    /* renamed from: a */
    private int m11357a(View view, int i) {
        int max;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m11365a(layoutParams.f1112a)) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i3 < layoutParams.topMargin) {
                    max = layoutParams.topMargin;
                } else {
                    int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    max = i4 < layoutParams.bottomMargin ? Math.max(0, i3 - (layoutParams.bottomMargin - i4)) : i3;
                }
                return max + paddingTop;
        }
    }

    /* renamed from: a */
    private int m11365a(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.f2041u & 112;
        }
    }

    /* renamed from: a */
    private void m11351a(List<View> list, int i) {
        boolean z = C0309ai.m12904e(this) == 1;
        int childCount = getChildCount();
        int m12648a = C0391e.m12648a(i, C0309ai.m12904e(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2050b == 0 && m11358a(childAt) && m11348b(layoutParams.f1112a) == m12648a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f2050b == 0 && m11358a(childAt2) && m11348b(layoutParams2.f1112a) == m12648a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m11348b(int i) {
        int m12904e = C0309ai.m12904e(this);
        int m12648a = C0391e.m12648a(i, m12904e) & 7;
        switch (m12648a) {
            case 1:
            case 3:
            case 5:
                return m12648a;
            case 2:
            case 4:
            default:
                return m12904e == 1 ? 5 : 3;
        }
    }

    /* renamed from: a */
    private boolean m11358a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int m11345b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0414o.m12623b(marginLayoutParams) + C0414o.m12624a(marginLayoutParams);
    }

    /* renamed from: c */
    private int m11341c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public InterfaceC0754n getWrapper() {
        if (this.f2013G == null) {
            this.f2013G = new C0726ab(this, true);
        }
        return this.f2013G;
    }

    /* renamed from: j */
    void m11332j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f2050b != 2 && childAt != this.f2022b) {
                removeViewAt(childCount);
                this.f2009C.add(childAt);
            }
        }
    }

    /* renamed from: k */
    void m11331k() {
        for (int size = this.f2009C.size() - 1; size >= 0; size--) {
            addView(this.f2009C.get(size));
        }
        this.f2009C.clear();
    }

    /* renamed from: d */
    private boolean m11338d(View view) {
        return view.getParent() == this || this.f2009C.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.f2018L = z;
        requestLayout();
    }

    /* renamed from: a */
    public void m11361a(InterfaceC0643l.InterfaceC0644a interfaceC0644a, C0628f.InterfaceC0629a interfaceC0629a) {
        this.f2016J = interfaceC0644a;
        this.f2017K = interfaceC0629a;
        if (this.f2022b != null) {
            this.f2022b.m11597a(interfaceC0644a, interfaceC0629a);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f2050b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2050b = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2050b = 0;
            this.f1112a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f2050b = 0;
            this.f2050b = layoutParams.f2050b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2050b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2050b = 0;
            m11322a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2050b = 0;
        }

        /* renamed from: a */
        void m11322a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f2051a;

        /* renamed from: b */
        boolean f2052b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2051a = parcel.readInt();
            this.f2052b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2051a);
            parcel.writeInt(this.f2052b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C0720a implements InterfaceC0643l {

        /* renamed from: a */
        C0628f f2053a;

        /* renamed from: b */
        C0632h f2054b;

        private C0720a() {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: a */
        public void mo11319a(Context context, C0628f c0628f) {
            if (this.f2053a != null && this.f2054b != null) {
                this.f2053a.mo11670d(this.f2054b);
            }
            this.f2053a = c0628f;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: b */
        public void mo11313b(boolean z) {
            boolean z2 = false;
            if (this.f2054b != null) {
                if (this.f2053a != null) {
                    int size = this.f2053a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2053a.getItem(i) != this.f2054b) {
                            i++;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    mo11314b(this.f2053a, this.f2054b);
                }
            }
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: a */
        public boolean mo11316a(SubMenuC0649p subMenuC0649p) {
            return false;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: a */
        public void mo11317a(C0628f c0628f, boolean z) {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: b */
        public boolean mo11315b() {
            return false;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: a */
        public boolean mo11318a(C0628f c0628f, C0632h c0632h) {
            Toolbar.this.m11326p();
            if (Toolbar.this.f2029i.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.f2029i);
            }
            Toolbar.this.f2021a = c0632h.getActionView();
            this.f2054b = c0632h;
            if (Toolbar.this.f2021a.getParent() != Toolbar.this) {
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f1112a = 8388611 | (Toolbar.this.f2034n & 112);
                generateDefaultLayoutParams.f2050b = 2;
                Toolbar.this.f2021a.setLayoutParams(generateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.f2021a);
            }
            Toolbar.this.m11332j();
            Toolbar.this.requestLayout();
            c0632h.m11721e(true);
            if (Toolbar.this.f2021a instanceof InterfaceC0609c) {
                ((InterfaceC0609c) Toolbar.this.f2021a).mo11453a();
            }
            return true;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l
        /* renamed from: b */
        public boolean mo11314b(C0628f c0628f, C0632h c0632h) {
            if (Toolbar.this.f2021a instanceof InterfaceC0609c) {
                ((InterfaceC0609c) Toolbar.this.f2021a).mo11433b();
            }
            Toolbar.this.removeView(Toolbar.this.f2021a);
            Toolbar.this.removeView(Toolbar.this.f2029i);
            Toolbar.this.f2021a = null;
            Toolbar.this.m11331k();
            this.f2054b = null;
            Toolbar.this.requestLayout();
            c0632h.m11721e(false);
            return true;
        }
    }
}
