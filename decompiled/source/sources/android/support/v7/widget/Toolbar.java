package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.support.v7.widget.ActionMenuView;
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
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private boolean A;
    private final ArrayList<View> B;
    private final ArrayList<View> C;
    private final int[] D;
    private b E;
    private final ActionMenuView.d F;
    private ab G;
    private ActionMenuPresenter H;
    private a I;
    private l.a J;
    private f.a K;
    private boolean L;
    private final Runnable M;
    private final g N;
    View a;
    private ActionMenuView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    private ImageButton i;
    private Context j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final s t;
    private int u;
    private CharSequence v;
    private CharSequence w;
    private int x;
    private int y;
    private boolean z;

    /* loaded from: classes.dex */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new s();
        this.u = 8388627;
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        this.D = new int[2];
        this.F = new ActionMenuView.d() { // from class: android.support.v7.widget.Toolbar.1
            @Override // android.support.v7.widget.ActionMenuView.d
            public boolean a(MenuItem menuItem) {
                if (Toolbar.this.E != null) {
                    return Toolbar.this.E.a(menuItem);
                }
                return false;
            }
        };
        this.M = new Runnable() { // from class: android.support.v7.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.d();
            }
        };
        aa a2 = aa.a(getContext(), attributeSet, a.k.Toolbar, i, 0);
        this.l = a2.g(a.k.Toolbar_titleTextAppearance, 0);
        this.m = a2.g(a.k.Toolbar_subtitleTextAppearance, 0);
        this.u = a2.c(a.k.Toolbar_android_gravity, this.u);
        this.n = 48;
        int d = a2.d(a.k.Toolbar_titleMargins, 0);
        this.s = d;
        this.r = d;
        this.q = d;
        this.p = d;
        int d2 = a2.d(a.k.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.p = d2;
        }
        int d3 = a2.d(a.k.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.q = d3;
        }
        int d4 = a2.d(a.k.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.r = d4;
        }
        int d5 = a2.d(a.k.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.s = d5;
        }
        this.o = a2.e(a.k.Toolbar_maxButtonHeight, -1);
        int d6 = a2.d(a.k.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a2.d(a.k.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        this.t.b(a2.e(a.k.Toolbar_contentInsetLeft, 0), a2.e(a.k.Toolbar_contentInsetRight, 0));
        if (d6 != Integer.MIN_VALUE || d7 != Integer.MIN_VALUE) {
            this.t.a(d6, d7);
        }
        this.g = a2.a(a.k.Toolbar_collapseIcon);
        this.h = a2.c(a.k.Toolbar_collapseContentDescription);
        CharSequence c = a2.c(a.k.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a2.c(a.k.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.j = getContext();
        setPopupTheme(a2.g(a.k.Toolbar_popupTheme, 0));
        Drawable a3 = a2.a(a.k.Toolbar_navigationIcon);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        CharSequence c3 = a2.c(a.k.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a4 = a2.a(a.k.Toolbar_logo);
        if (a4 != null) {
            setLogo(a4);
        }
        CharSequence c4 = a2.c(a.k.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a2.f(a.k.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.b(a.k.Toolbar_titleTextColor, -1));
        }
        if (a2.f(a.k.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.b(a.k.Toolbar_subtitleTextColor, -1));
        }
        a2.a();
        this.N = g.a();
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.k;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        this.t.a(i == 1);
    }

    public void setLogo(int i) {
        setLogo(this.N.a(getContext(), i));
    }

    public boolean a() {
        return getVisibility() == 0 && this.b != null && this.b.a();
    }

    public boolean b() {
        return this.b != null && this.b.g();
    }

    public boolean c() {
        return this.b != null && this.b.h();
    }

    public boolean d() {
        return this.b != null && this.b.e();
    }

    public boolean e() {
        return this.b != null && this.b.f();
    }

    public void a(android.support.v7.view.menu.f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar != null || this.b != null) {
            n();
            android.support.v7.view.menu.f d = this.b.d();
            if (d != fVar) {
                if (d != null) {
                    d.b(this.H);
                    d.b(this.I);
                }
                if (this.I == null) {
                    this.I = new a();
                }
                actionMenuPresenter.d(true);
                if (fVar != null) {
                    fVar.a(actionMenuPresenter, this.j);
                    fVar.a(this.I, this.j);
                } else {
                    actionMenuPresenter.a(this.j, (android.support.v7.view.menu.f) null);
                    this.I.a(this.j, (android.support.v7.view.menu.f) null);
                    actionMenuPresenter.b(true);
                    this.I.b(true);
                }
                this.b.setPopupTheme(this.k);
                this.b.setPresenter(actionMenuPresenter);
                this.H = actionMenuPresenter;
            }
        }
    }

    public void f() {
        if (this.b != null) {
            this.b.i();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!d(this.f)) {
                a((View) this.f, true);
            }
        } else if (this.f != null && d(this.f)) {
            removeView(this.f);
            this.C.remove(this.f);
        }
        if (this.f != null) {
            this.f.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.f != null) {
            return this.f.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        if (this.f != null) {
            this.f.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.f != null) {
            return this.f.getContentDescription();
        }
        return null;
    }

    private void l() {
        if (this.f == null) {
            this.f = new ImageView(getContext());
        }
    }

    public boolean g() {
        return (this.I == null || this.I.b == null) ? false : true;
    }

    public void h() {
        android.support.v7.view.menu.h hVar = this.I == null ? null : this.I.b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.v;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.l != 0) {
                    this.c.setTextAppearance(context, this.l);
                }
                if (this.x != 0) {
                    this.c.setTextColor(this.x);
                }
            }
            if (!d(this.c)) {
                a((View) this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.C.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.v = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.w;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                this.d = new TextView(context);
                this.d.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                if (this.m != 0) {
                    this.d.setTextAppearance(context, this.m);
                }
                if (this.y != 0) {
                    this.d.setTextColor(this.y);
                }
            }
            if (!d(this.d)) {
                a((View) this.d, true);
            }
        } else if (this.d != null && d(this.d)) {
            removeView(this.d);
            this.C.remove(this.d);
        }
        if (this.d != null) {
            this.d.setText(charSequence);
        }
        this.w = charSequence;
    }

    public void a(Context context, int i) {
        this.l = i;
        if (this.c != null) {
            this.c.setTextAppearance(context, i);
        }
    }

    public void b(Context context, int i) {
        this.m = i;
        if (this.d != null) {
            this.d.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.x = i;
        if (this.c != null) {
            this.c.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.y = i;
        if (this.d != null) {
            this.d.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.e != null) {
            return this.e.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            o();
        }
        if (this.e != null) {
            this.e.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(this.N.a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            o();
            if (!d(this.e)) {
                a((View) this.e, true);
            }
        } else if (this.e != null && d(this.e)) {
            removeView(this.e);
            this.C.remove(this.e);
        }
        if (this.e != null) {
            this.e.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.e != null) {
            return this.e.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        o();
        this.e.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m();
        return this.b.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m();
        this.b.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m();
        return this.b.getOverflowIcon();
    }

    private void m() {
        n();
        if (this.b.d() == null) {
            android.support.v7.view.menu.f fVar = (android.support.v7.view.menu.f) this.b.getMenu();
            if (this.I == null) {
                this.I = new a();
            }
            this.b.setExpandedActionViewsExclusive(true);
            fVar.a(this.I, this.j);
        }
    }

    private void n() {
        if (this.b == null) {
            this.b = new ActionMenuView(getContext());
            this.b.setPopupTheme(this.k);
            this.b.setOnMenuItemClickListener(this.F);
            this.b.a(this.J, this.K);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.n & 112);
            this.b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.view.g(getContext());
    }

    public void setOnMenuItemClickListener(b bVar) {
        this.E = bVar;
    }

    public void a(int i, int i2) {
        this.t.a(i, i2);
    }

    public int getContentInsetStart() {
        return this.t.c();
    }

    public int getContentInsetEnd() {
        return this.t.d();
    }

    public int getContentInsetLeft() {
        return this.t.a();
    }

    public int getContentInsetRight() {
        return this.t.b();
    }

    private void o() {
        if (this.e == null) {
            this.e = new ImageButton(getContext(), null, a.C0012a.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.n & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.i == null) {
            this.i = new ImageButton(getContext(), null, a.C0012a.toolbarNavigationButtonStyle);
            this.i.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.n & 112);
            generateDefaultLayoutParams.b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.h();
                }
            });
        }
    }

    private void a(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.b = 1;
        if (z && this.a != null) {
            view.setLayoutParams(layoutParams);
            this.C.add(view);
            return;
        }
        addView(view, layoutParams);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.I != null && this.I.b != null) {
            savedState.a = this.I.b.getItemId();
        }
        savedState.b = b();
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
        android.support.v7.view.menu.f d = this.b != null ? this.b.d() : null;
        if (savedState.a != 0 && this.I != null && d != null && (findItem = d.findItem(savedState.a)) != null) {
            android.support.v4.view.q.b(findItem);
        }
        if (savedState.b) {
            q();
        }
    }

    private void q() {
        removeCallbacks(this.M);
        post(this.M);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.t.a(motionEvent);
        if (a2 == 0) {
            this.z = false;
        }
        if (!this.z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a2 == 0 && !onTouchEvent) {
                this.z = true;
            }
        }
        if (a2 == 1 || a2 == 3) {
            this.z = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.t.a(motionEvent);
        if (a2 == 9) {
            this.A = false;
        }
        if (!this.A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a2 == 9 && !onHoverEvent) {
                this.A = true;
            }
        }
        if (a2 == 10 || a2 == 3) {
            this.A = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
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

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private boolean r() {
        if (this.L) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
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
        int[] iArr = this.D;
        if (ad.a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int i7 = 0;
        if (a(this.e)) {
            a(this.e, i, 0, i2, 0, this.o);
            i7 = this.e.getMeasuredWidth() + b(this.e);
            int max = Math.max(0, this.e.getMeasuredHeight() + c(this.e));
            i6 = ad.a(0, ai.i(this.e));
            i5 = max;
        }
        if (a(this.i)) {
            a(this.i, i, 0, i2, 0, this.o);
            i7 = this.i.getMeasuredWidth() + b(this.i);
            i5 = Math.max(i5, this.i.getMeasuredHeight() + c(this.i));
            i6 = ad.a(i6, ai.i(this.i));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = 0 + Math.max(contentInsetStart, i7);
        iArr[c2] = Math.max(0, contentInsetStart - i7);
        int i8 = 0;
        if (a(this.b)) {
            a(this.b, i, max2, i2, 0, this.o);
            i8 = this.b.getMeasuredWidth() + b(this.b);
            i5 = Math.max(i5, this.b.getMeasuredHeight() + c(this.b));
            i6 = ad.a(i6, ai.i(this.b));
        }
        int contentInsetEnd = getContentInsetEnd();
        int max3 = max2 + Math.max(contentInsetEnd, i8);
        iArr[c] = Math.max(0, contentInsetEnd - i8);
        if (a(this.a)) {
            max3 += a(this.a, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + c(this.a));
            i6 = ad.a(i6, ai.i(this.a));
        }
        if (a(this.f)) {
            max3 += a(this.f, i, max3, i2, 0, iArr);
            i5 = Math.max(i5, this.f.getMeasuredHeight() + c(this.f));
            i6 = ad.a(i6, ai.i(this.f));
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = i5;
        int i11 = i6;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (((LayoutParams) childAt.getLayoutParams()).b != 0) {
                i3 = i11;
                i4 = i10;
            } else if (a(childAt)) {
                max3 += a(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i10, childAt.getMeasuredHeight() + c(childAt));
                i3 = ad.a(i11, ai.i(childAt));
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
        int i14 = this.r + this.s;
        int i15 = this.p + this.q;
        if (a(this.c)) {
            a(this.c, i, max3 + i15, i2, i14, iArr);
            i12 = b(this.c) + this.c.getMeasuredWidth();
            i13 = this.c.getMeasuredHeight() + c(this.c);
            i11 = ad.a(i11, ai.i(this.c));
        }
        if (a(this.d)) {
            i12 = Math.max(i12, a(this.d, i, max3 + i15, i2, i14 + i13, iArr));
            i13 += this.d.getMeasuredHeight() + c(this.d);
            i11 = ad.a(i11, ai.i(this.d));
        }
        int max5 = Math.max(i10, i13);
        int paddingLeft = i12 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int a2 = ai.a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i11);
        int a3 = ai.a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i11 << 16);
        if (r()) {
            a3 = 0;
        }
        setMeasuredDimension(a2, a3);
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
        boolean z2 = ai.e(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.D;
        iArr[1] = 0;
        iArr[0] = 0;
        int k = ai.k(this);
        if (!a(this.e)) {
            i5 = paddingLeft;
        } else if (z2) {
            i15 = b(this.e, i15, iArr, k);
            i5 = paddingLeft;
        } else {
            i5 = a(this.e, paddingLeft, iArr, k);
        }
        if (a(this.i)) {
            if (z2) {
                i15 = b(this.i, i15, iArr, k);
            } else {
                i5 = a(this.i, i5, iArr, k);
            }
        }
        if (a(this.b)) {
            if (z2) {
                i5 = a(this.b, i5, iArr, k);
            } else {
                i15 = b(this.b, i15, iArr, k);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i5);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i15));
        int max2 = Math.max(i5, getContentInsetLeft());
        int min = Math.min(i15, (width - paddingRight) - getContentInsetRight());
        if (a(this.a)) {
            if (z2) {
                min = b(this.a, min, iArr, k);
            } else {
                max2 = a(this.a, max2, iArr, k);
            }
        }
        if (!a(this.f)) {
            i6 = min;
            i7 = max2;
        } else if (z2) {
            i6 = b(this.f, min, iArr, k);
            i7 = max2;
        } else {
            i6 = min;
            i7 = a(this.f, max2, iArr, k);
        }
        boolean a2 = a(this.c);
        boolean a3 = a(this.d);
        int i16 = 0;
        if (a2) {
            LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
            i16 = 0 + layoutParams.bottomMargin + layoutParams.topMargin + this.c.getMeasuredHeight();
        }
        if (a3) {
            LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
            i8 = layoutParams2.bottomMargin + layoutParams2.topMargin + this.d.getMeasuredHeight() + i16;
        } else {
            i8 = i16;
        }
        if (a2 || a3) {
            TextView textView = a2 ? this.c : this.d;
            TextView textView2 = a3 ? this.d : this.c;
            LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
            LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
            boolean z3 = (a2 && this.c.getMeasuredWidth() > 0) || (a3 && this.d.getMeasuredWidth() > 0);
            switch (this.u & 112) {
                case 48:
                    i9 = layoutParams3.topMargin + getPaddingTop() + this.r;
                    break;
                case 80:
                    i9 = (((height - paddingBottom) - layoutParams4.bottomMargin) - this.s) - i8;
                    break;
                default:
                    int i17 = (((height - paddingTop) - paddingBottom) - i8) / 2;
                    if (i17 < layoutParams3.topMargin + this.r) {
                        max = layoutParams3.topMargin + this.r;
                    } else {
                        int i18 = (((height - paddingBottom) - i8) - i17) - paddingTop;
                        max = i18 < layoutParams3.bottomMargin + this.s ? Math.max(0, i17 - ((layoutParams4.bottomMargin + this.s) - i18)) : i17;
                    }
                    i9 = paddingTop + max;
                    break;
            }
            if (z2) {
                int i19 = (z3 ? this.p : 0) - iArr[1];
                int max3 = i6 - Math.max(0, i19);
                iArr[1] = Math.max(0, -i19);
                if (a2) {
                    int measuredWidth = max3 - this.c.getMeasuredWidth();
                    int measuredHeight = this.c.getMeasuredHeight() + i9;
                    this.c.layout(measuredWidth, i9, max3, measuredHeight);
                    int i20 = measuredWidth - this.q;
                    i9 = measuredHeight + ((LayoutParams) this.c.getLayoutParams()).bottomMargin;
                    i13 = i20;
                } else {
                    i13 = max3;
                }
                if (a3) {
                    LayoutParams layoutParams5 = (LayoutParams) this.d.getLayoutParams();
                    int i21 = layoutParams5.topMargin + i9;
                    int measuredHeight2 = this.d.getMeasuredHeight() + i21;
                    this.d.layout(max3 - this.d.getMeasuredWidth(), i21, max3, measuredHeight2);
                    int i22 = layoutParams5.bottomMargin + measuredHeight2;
                    i14 = max3 - this.q;
                } else {
                    i14 = max3;
                }
                i6 = z3 ? Math.min(i13, i14) : max3;
            } else {
                int i23 = (z3 ? this.p : 0) - iArr[0];
                i7 += Math.max(0, i23);
                iArr[0] = Math.max(0, -i23);
                if (a2) {
                    int measuredWidth2 = this.c.getMeasuredWidth() + i7;
                    int measuredHeight3 = this.c.getMeasuredHeight() + i9;
                    this.c.layout(i7, i9, measuredWidth2, measuredHeight3);
                    int i24 = ((LayoutParams) this.c.getLayoutParams()).bottomMargin + measuredHeight3;
                    i10 = measuredWidth2 + this.q;
                    i11 = i24;
                } else {
                    i10 = i7;
                    i11 = i9;
                }
                if (a3) {
                    LayoutParams layoutParams6 = (LayoutParams) this.d.getLayoutParams();
                    int i25 = i11 + layoutParams6.topMargin;
                    int measuredWidth3 = this.d.getMeasuredWidth() + i7;
                    int measuredHeight4 = this.d.getMeasuredHeight() + i25;
                    this.d.layout(i7, i25, measuredWidth3, measuredHeight4);
                    int i26 = layoutParams6.bottomMargin + measuredHeight4;
                    i12 = this.q + measuredWidth3;
                } else {
                    i12 = i7;
                }
                if (z3) {
                    i7 = Math.max(i10, i12);
                }
            }
        }
        a(this.B, 3);
        int size = this.B.size();
        int i27 = i7;
        for (int i28 = 0; i28 < size; i28++) {
            i27 = a(this.B.get(i28), i27, iArr, k);
        }
        a(this.B, 5);
        int size2 = this.B.size();
        for (int i29 = 0; i29 < size2; i29++) {
            i6 = b(this.B.get(i29), i6, iArr, k);
        }
        a(this.B, 1);
        int a4 = a(this.B, iArr);
        int i30 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (a4 / 2);
        int i31 = a4 + i30;
        if (i30 < i27) {
            i30 = i27;
        } else if (i31 > i6) {
            i30 -= i31 - i6;
        }
        int size3 = this.B.size();
        int i32 = i30;
        for (int i33 = 0; i33 < size3; i33++) {
            i32 = a(this.B.get(i33), i32, iArr, k);
        }
        this.B.clear();
    }

    private int a(List<View> list, int[] iArr) {
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

    private int a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return layoutParams.rightMargin + measuredWidth + max;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (layoutParams.leftMargin + measuredWidth);
    }

    private int a(View view, int i) {
        int max;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (a(layoutParams.a)) {
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

    private int a(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case 48:
            case 80:
                return i2;
            default:
                return this.u & 112;
        }
    }

    private void a(List<View> list, int i) {
        boolean z = ai.e(this) == 1;
        int childCount = getChildCount();
        int a2 = android.support.v4.view.e.a(i, ai.e(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.b == 0 && a(childAt) && b(layoutParams.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.b == 0 && a(childAt2) && b(layoutParams2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i) {
        int e = ai.e(this);
        int a2 = android.support.v4.view.e.a(i, e) & 7;
        switch (a2) {
            case 1:
            case 3:
            case 5:
                return a2;
            case 2:
            case 4:
            default:
                return e == 1 ? 5 : 3;
        }
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return android.support.v4.view.o.b(marginLayoutParams) + android.support.v4.view.o.a(marginLayoutParams);
    }

    private int c(View view) {
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

    public n getWrapper() {
        if (this.G == null) {
            this.G = new ab(this, true);
        }
        return this.G;
    }

    void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).b != 2 && childAt != this.b) {
                removeViewAt(childCount);
                this.C.add(childAt);
            }
        }
    }

    void k() {
        for (int size = this.C.size() - 1; size >= 0; size--) {
            addView(this.C.get(size));
        }
        this.C.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.C.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.L = z;
        requestLayout();
    }

    public void a(l.a aVar, f.a aVar2) {
        this.J = aVar;
        this.K = aVar2;
        if (this.b != null) {
            this.b.a(aVar, aVar2);
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {
        int b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.b = 0;
            this.b = layoutParams.b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

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
        int a;
        boolean b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements android.support.v7.view.menu.l {
        android.support.v7.view.menu.f a;
        android.support.v7.view.menu.h b;

        private a() {
        }

        @Override // android.support.v7.view.menu.l
        public void a(Context context, android.support.v7.view.menu.f fVar) {
            if (this.a != null && this.b != null) {
                this.a.d(this.b);
            }
            this.a = fVar;
        }

        @Override // android.support.v7.view.menu.l
        public void b(boolean z) {
            boolean z2 = false;
            if (this.b != null) {
                if (this.a != null) {
                    int size = this.a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) != this.b) {
                            i++;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    b(this.a, this.b);
                }
            }
        }

        @Override // android.support.v7.view.menu.l
        public boolean a(android.support.v7.view.menu.p pVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.l
        public void a(android.support.v7.view.menu.f fVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.l
        public boolean b() {
            return false;
        }

        @Override // android.support.v7.view.menu.l
        public boolean a(android.support.v7.view.menu.f fVar, android.support.v7.view.menu.h hVar) {
            Toolbar.this.p();
            if (Toolbar.this.i.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.i);
            }
            Toolbar.this.a = hVar.getActionView();
            this.b = hVar;
            if (Toolbar.this.a.getParent() != Toolbar.this) {
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.a = 8388611 | (Toolbar.this.n & 112);
                generateDefaultLayoutParams.b = 2;
                Toolbar.this.a.setLayoutParams(generateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.a);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            hVar.e(true);
            if (Toolbar.this.a instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) Toolbar.this.a).a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.l
        public boolean b(android.support.v7.view.menu.f fVar, android.support.v7.view.menu.h hVar) {
            if (Toolbar.this.a instanceof android.support.v7.view.c) {
                ((android.support.v7.view.c) Toolbar.this.a).b();
            }
            Toolbar.this.removeView(Toolbar.this.a);
            Toolbar.this.removeView(Toolbar.this.i);
            Toolbar.this.a = null;
            Toolbar.this.k();
            this.b = null;
            Toolbar.this.requestLayout();
            hVar.e(false);
            return true;
        }
    }
}
