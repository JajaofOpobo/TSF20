package android.support.p013v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p002v4.view.C0363bb;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.menu.C0628f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: android.support.v7.widget.ActionBarContextView */
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0723a {

    /* renamed from: g */
    private CharSequence f1616g;

    /* renamed from: h */
    private CharSequence f1617h;

    /* renamed from: i */
    private View f1618i;

    /* renamed from: j */
    private View f1619j;

    /* renamed from: k */
    private LinearLayout f1620k;

    /* renamed from: l */
    private TextView f1621l;

    /* renamed from: m */
    private TextView f1622m;

    /* renamed from: n */
    private int f1623n;

    /* renamed from: o */
    private int f1624o;

    /* renamed from: p */
    private boolean f1625p;

    /* renamed from: q */
    private int f1626q;

    @Override // android.support.p013v7.widget.AbstractC0723a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0363bb mo11307a(int i, long j) {
        return super.mo11307a(i, j);
    }

    @Override // android.support.p013v7.widget.AbstractC0723a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.p013v7.widget.AbstractC0723a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.support.p013v7.widget.AbstractC0723a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.support.p013v7.widget.AbstractC0723a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.p013v7.widget.AbstractC0723a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, C0535a.C0546k.ActionMode, i, 0);
        setBackgroundDrawable(m11295a.m11300a(C0535a.C0546k.ActionMode_background));
        this.f1623n = m11295a.m11284g(C0535a.C0546k.ActionMode_titleTextStyle, 0);
        this.f1624o = m11295a.m11284g(C0535a.C0546k.ActionMode_subtitleTextStyle, 0);
        this.f2065e = m11295a.m11285f(C0535a.C0546k.ActionMode_height, 0);
        this.f1626q = m11295a.m11284g(C0535a.C0546k.ActionMode_closeItemLayout, C0535a.C0543h.abc_action_mode_close_item_material);
        m11295a.m11301a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2064d != null) {
            this.f2064d.m11614e();
            this.f2064d.m11610g();
        }
    }

    @Override // android.support.p013v7.widget.AbstractC0723a
    public void setContentHeight(int i) {
        this.f2065e = i;
    }

    public void setCustomView(View view) {
        if (this.f1619j != null) {
            removeView(this.f1619j);
        }
        this.f1619j = view;
        if (view != null && this.f1620k != null) {
            removeView(this.f1620k);
            this.f1620k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1616g = charSequence;
        m11660e();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1617h = charSequence;
        m11660e();
    }

    public CharSequence getTitle() {
        return this.f1616g;
    }

    public CharSequence getSubtitle() {
        return this.f1617h;
    }

    /* renamed from: e */
    private void m11660e() {
        int i = 8;
        if (this.f1620k == null) {
            LayoutInflater.from(getContext()).inflate(C0535a.C0543h.abc_action_bar_title_item, this);
            this.f1620k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1621l = (TextView) this.f1620k.findViewById(C0535a.C0541f.action_bar_title);
            this.f1622m = (TextView) this.f1620k.findViewById(C0535a.C0541f.action_bar_subtitle);
            if (this.f1623n != 0) {
                this.f1621l.setTextAppearance(getContext(), this.f1623n);
            }
            if (this.f1624o != 0) {
                this.f1622m.setTextAppearance(getContext(), this.f1624o);
            }
        }
        this.f1621l.setText(this.f1616g);
        this.f1622m.setText(this.f1617h);
        boolean z = !TextUtils.isEmpty(this.f1616g);
        boolean z2 = TextUtils.isEmpty(this.f1617h) ? false : true;
        this.f1622m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1620k;
        if (z || z2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f1620k.getParent() == null) {
            addView(this.f1620k);
        }
    }

    /* renamed from: a */
    public void m11664a(final AbstractC0607b abstractC0607b) {
        if (this.f1618i == null) {
            this.f1618i = LayoutInflater.from(getContext()).inflate(this.f1626q, (ViewGroup) this, false);
            addView(this.f1618i);
        } else if (this.f1618i.getParent() == null) {
            addView(this.f1618i);
        }
        this.f1618i.findViewById(C0535a.C0541f.action_mode_close_button).setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                abstractC0607b.mo11857c();
            }
        });
        C0628f c0628f = (C0628f) abstractC0607b.mo11860b();
        if (this.f2064d != null) {
            this.f2064d.m11612f();
        }
        this.f2064d = new ActionMenuPresenter(getContext());
        this.f2064d.m11618c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0628f.m11775a(this.f2064d, this.f2062b);
        this.f2063c = (ActionMenuView) this.f2064d.mo11624a(this);
        this.f2063c.setBackgroundDrawable(null);
        addView(this.f2063c, layoutParams);
    }

    /* renamed from: b */
    public void m11663b() {
        if (this.f1618i == null) {
            m11662c();
        }
    }

    /* renamed from: c */
    public void m11662c() {
        removeAllViews();
        this.f1619j = null;
        this.f2063c = null;
    }

    @Override // android.support.p013v7.widget.AbstractC0723a
    /* renamed from: a */
    public boolean mo11309a() {
        if (this.f2064d != null) {
            return this.f2064d.m11617d();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f2065e > 0 ? this.f2065e : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = size2 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        if (this.f1618i != null) {
            int a = m11305a(this.f1618i, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1618i.getLayoutParams();
            paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
        }
        if (this.f2063c != null && this.f2063c.getParent() == this) {
            paddingLeft = m11305a(this.f2063c, paddingLeft, makeMeasureSpec, 0);
        }
        if (this.f1620k != null && this.f1619j == null) {
            if (this.f1625p) {
                this.f1620k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1620k.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f1620k.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m11305a(this.f1620k, paddingLeft, makeMeasureSpec, 0);
            }
        }
        if (this.f1619j != null) {
            ViewGroup.LayoutParams layoutParams = this.f1619j.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            this.f1619j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i4) : i4, layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824));
        }
        if (this.f2065e <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            while (i3 < childCount) {
                int measuredHeight = getChildAt(i3).getMeasuredHeight() + paddingTop;
                if (measuredHeight <= i6) {
                    measuredHeight = i6;
                }
                i3++;
                i6 = measuredHeight;
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean m11259a = C0730ad.m11259a(this);
        int paddingRight = m11259a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f1618i == null || this.f1618i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1618i.getLayoutParams();
            int i6 = m11259a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = m11259a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = m11308a(paddingRight, i6, m11259a);
            i5 = m11308a(m11304a(this.f1618i, a, paddingTop, paddingTop2, m11259a) + a, i7, m11259a);
        }
        if (this.f1620k != null && this.f1619j == null && this.f1620k.getVisibility() != 8) {
            i5 += m11304a(this.f1620k, i5, paddingTop, paddingTop2, m11259a);
        }
        if (this.f1619j != null) {
            int a2 = m11304a(this.f1619j, i5, paddingTop, paddingTop2, m11259a) + i5;
        }
        int paddingLeft = m11259a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f2063c != null) {
            int a3 = m11304a(this.f2063c, paddingLeft, paddingTop, paddingTop2, !m11259a) + paddingLeft;
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.setSource(this);
                accessibilityEvent.setClassName(getClass().getName());
                accessibilityEvent.setPackageName(getContext().getPackageName());
                accessibilityEvent.setContentDescription(this.f1616g);
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1625p) {
            requestLayout();
        }
        this.f1625p = z;
    }

    /* renamed from: d */
    public boolean m11661d() {
        return this.f1625p;
    }
}
