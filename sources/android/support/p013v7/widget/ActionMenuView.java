package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v7.view.menu.ActionMenuItemView;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.C0632h;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: android.support.v7.widget.ActionMenuView */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements C0628f.InterfaceC0630b, InterfaceC0645m {

    /* renamed from: a */
    private C0628f f1693a;

    /* renamed from: b */
    private Context f1694b;

    /* renamed from: c */
    private int f1695c;

    /* renamed from: d */
    private boolean f1696d;

    /* renamed from: e */
    private ActionMenuPresenter f1697e;

    /* renamed from: f */
    private InterfaceC0643l.InterfaceC0644a f1698f;

    /* renamed from: g */
    private C0628f.InterfaceC0629a f1699g;

    /* renamed from: h */
    private boolean f1700h;

    /* renamed from: i */
    private int f1701i;

    /* renamed from: j */
    private int f1702j;

    /* renamed from: k */
    private int f1703k;

    /* renamed from: l */
    private InterfaceC0669d f1704l;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0666a {
        /* renamed from: c */
        boolean mo11582c();

        /* renamed from: d */
        boolean mo11581d();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0669d {
        /* renamed from: a */
        boolean mo11323a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1702j = (int) (56.0f * f);
        this.f1703k = (int) (f * 4.0f);
        this.f1694b = context;
        this.f1695c = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f1695c != i) {
            this.f1695c = i;
            if (i == 0) {
                this.f1694b = getContext();
            } else {
                this.f1694b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f1695c;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1697e = actionMenuPresenter;
        this.f1697e.m11626a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.f1697e != null) {
            this.f1697e.mo11313b(false);
            if (this.f1697e.m11608h()) {
                this.f1697e.m11614e();
                this.f1697e.m11617d();
            }
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0669d interfaceC0669d) {
        this.f1704l = interfaceC0669d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = this.f1700h;
        this.f1700h = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1700h) {
            this.f1701i = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1700h && this.f1693a != null && size != this.f1701i) {
            this.f1701i = size;
            this.f1693a.m11761b(true);
        }
        int childCount = getChildCount();
        if (this.f1700h && childCount > 0) {
            m11589c(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m11589c(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v7.widget.ActionMenuView.m11589c(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m11594a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m11813b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!layoutParams.f1705a && z2) {
            z = true;
        }
        layoutParams.f1708d = z;
        layoutParams.f1706b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int width;
        int i10;
        if (!this.f1700h) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = 0;
        int i13 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean m11259a = C0730ad.m11259a(this);
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                z2 = z3;
                i8 = i13;
                i7 = paddingRight;
                i9 = i12;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1705a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m11600a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m11259a) {
                        i10 = layoutParams.leftMargin + getPaddingLeft();
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i15 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i15, width, measuredHeight + i15);
                    i7 = paddingRight - measuredWidth;
                    z2 = true;
                    i8 = i13;
                    i9 = i12;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    int i16 = i12 + measuredWidth2;
                    int i17 = paddingRight - measuredWidth2;
                    if (m11600a(i14)) {
                        i16 += dividerWidth;
                    }
                    boolean z4 = z3;
                    i7 = i17;
                    i8 = i13 + 1;
                    i9 = i16;
                    z2 = z4;
                }
            }
            i14++;
            i12 = i9;
            paddingRight = i7;
            i13 = i8;
            z3 = z2;
        }
        if (childCount == 1 && !z3) {
            View childAt2 = getChildAt(0);
            int measuredWidth3 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = ((i3 - i) / 2) - (measuredWidth3 / 2);
            int i19 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth3 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i13 - (z3 ? 0 : 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (m11259a) {
            int width2 = getWidth() - getPaddingRight();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt3 = getChildAt(i21);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i6 = width2;
                } else if (layoutParams2.f1705a) {
                    i6 = width2;
                } else {
                    int i22 = width2 - layoutParams2.rightMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth4, i23, i22, measuredHeight3 + i23);
                    i6 = i22 - ((layoutParams2.leftMargin + measuredWidth4) + max);
                }
                i21++;
                width2 = i6;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt4 = getChildAt(i24);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() == 8) {
                i5 = paddingLeft;
            } else if (layoutParams3.f1705a) {
                i5 = paddingLeft;
            } else {
                int i25 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth5 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth5, measuredHeight4 + i26);
                i5 = layoutParams3.rightMargin + measuredWidth5 + max + i25;
            }
            i24++;
            paddingLeft = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11583i();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1697e.m11633a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1697e.m11620c();
    }

    /* renamed from: a */
    public boolean m11601a() {
        return this.f1696d;
    }

    public void setOverflowReserved(boolean z) {
        this.f1696d = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat
    /* renamed from: b */
    public LayoutParams mo11513j() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f1833h = 16;
        return layoutParams;
    }

    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
            if (layoutParams2.f1833h <= 0) {
                layoutParams2.f1833h = 16;
                return layoutParams2;
            }
            return layoutParams2;
        }
        return mo11513j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: c */
    public LayoutParams m11590c() {
        LayoutParams mo11513j = mo11513j();
        mo11513j.f1705a = true;
        return mo11513j;
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0630b
    /* renamed from: a */
    public boolean mo11598a(C0632h c0632h) {
        return this.f1693a.m11772a(c0632h, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m
    /* renamed from: a */
    public void mo11599a(C0628f c0628f) {
        this.f1693a = c0628f;
    }

    public Menu getMenu() {
        if (this.f1693a == null) {
            Context context = getContext();
            this.f1693a = new C0628f(context);
            this.f1693a.mo11675a(new C0668c());
            this.f1697e = new ActionMenuPresenter(context);
            this.f1697e.m11618c(true);
            this.f1697e.m11800a(this.f1698f != null ? this.f1698f : new C0667b());
            this.f1693a.m11775a(this.f1697e, this.f1694b);
            this.f1697e.m11626a(this);
        }
        return this.f1693a;
    }

    /* renamed from: a */
    public void m11597a(InterfaceC0643l.InterfaceC0644a interfaceC0644a, C0628f.InterfaceC0629a interfaceC0629a) {
        this.f1698f = interfaceC0644a;
        this.f1699g = interfaceC0629a;
    }

    /* renamed from: d */
    public C0628f m11588d() {
        return this.f1693a;
    }

    /* renamed from: e */
    public boolean m11587e() {
        return this.f1697e != null && this.f1697e.m11617d();
    }

    /* renamed from: f */
    public boolean m11586f() {
        return this.f1697e != null && this.f1697e.m11614e();
    }

    /* renamed from: g */
    public boolean m11585g() {
        return this.f1697e != null && this.f1697e.m11608h();
    }

    /* renamed from: h */
    public boolean m11584h() {
        return this.f1697e != null && this.f1697e.m11606i();
    }

    /* renamed from: i */
    public void m11583i() {
        if (this.f1697e != null) {
            this.f1697e.m11612f();
        }
    }

    /* renamed from: a */
    protected boolean m11600a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0666a)) {
            z = false | ((InterfaceC0666a) childAt).mo11581d();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0666a)) ? z : ((InterfaceC0666a) childAt2).mo11582c() | z;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1697e.m11615d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public class C0668c implements C0628f.InterfaceC0629a {
        private C0668c() {
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
            return ActionMenuView.this.f1704l != null && ActionMenuView.this.f1704l.mo11323a(menuItem);
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public void mo11118a(C0628f c0628f) {
            if (ActionMenuView.this.f1699g != null) {
                ActionMenuView.this.f1699g.mo11118a(c0628f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public class C0667b implements InterfaceC0643l.InterfaceC0644a {
        private C0667b() {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a */
        public void mo11116a(C0628f c0628f, boolean z) {
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a_ */
        public boolean mo11114a_(C0628f c0628f) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1705a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1706b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1707c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1708d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1709e;

        /* renamed from: f */
        boolean f1710f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1705a = layoutParams.f1705a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1705a = false;
        }
    }
}
