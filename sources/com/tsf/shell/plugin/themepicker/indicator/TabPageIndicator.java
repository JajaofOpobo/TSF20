package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.support.p002v4.view.AbstractC0299ac;
import android.support.p002v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.C3852f;
/* loaded from: classes.dex */
public class TabPageIndicator extends HorizontalScrollView implements InterfaceC3895c {

    /* renamed from: a */
    private static final CharSequence f12729a = "";

    /* renamed from: b */
    private Runnable f12730b;

    /* renamed from: c */
    private final View.OnClickListener f12731c;

    /* renamed from: d */
    private final C3894b f12732d;

    /* renamed from: e */
    private ViewPager f12733e;

    /* renamed from: f */
    private ViewPager.InterfaceC0245e f12734f;

    /* renamed from: g */
    private int f12735g;

    /* renamed from: h */
    private int f12736h;

    /* renamed from: i */
    private InterfaceC3886a f12737i;

    /* renamed from: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3886a {
        /* renamed from: a */
        void m1257a(int i);
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12731c = new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int currentItem = TabPageIndicator.this.f12733e.getCurrentItem();
                int m1256a = ((C3887b) view).m1256a();
                TabPageIndicator.this.f12733e.setCurrentItem(m1256a);
                if (currentItem == m1256a && TabPageIndicator.this.f12737i != null) {
                    TabPageIndicator.this.f12737i.m1257a(m1256a);
                }
            }
        };
        setHorizontalScrollBarEnabled(false);
        this.f12732d = new C3894b(context, C3852f.C3853a.vpiTabPageIndicatorStyle);
        addView(this.f12732d, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setOnTabReselectedListener(InterfaceC3886a interfaceC3886a) {
        this.f12737i = interfaceC3886a;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f12732d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f12735g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f12735g = View.MeasureSpec.getSize(i) / 2;
            }
        } else {
            this.f12735g = -1;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setCurrentItem(this.f12736h);
        }
    }

    /* renamed from: c */
    private void m1259c(int i) {
        final View childAt = this.f12732d.getChildAt(i);
        if (this.f12730b != null) {
            removeCallbacks(this.f12730b);
        }
        this.f12730b = new Runnable() { // from class: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                TabPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((TabPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                TabPageIndicator.this.f12730b = null;
            }
        };
        post(this.f12730b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12730b != null) {
            post(this.f12730b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12730b != null) {
            removeCallbacks(this.f12730b);
        }
    }

    /* renamed from: a */
    private void m1263a(int i, CharSequence charSequence, int i2) {
        C3887b c3887b = new C3887b(getContext());
        c3887b.f12742b = i;
        c3887b.setFocusable(true);
        c3887b.setOnClickListener(this.f12731c);
        c3887b.setText(charSequence);
        if (i2 != 0) {
            c3887b.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.f12732d.addView(c3887b, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: c_ */
    public void mo936c_(int i) {
        if (this.f12734f != null) {
            this.f12734f.mo936c_(i);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: a */
    public void mo940a(int i, float f, int i2) {
        if (this.f12734f != null) {
            this.f12734f.mo940a(i, f, i2);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: b_ */
    public void mo937b_(int i) {
        setCurrentItem(i);
        if (this.f12734f != null) {
            this.f12734f.mo937b_(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f12733e != viewPager) {
            if (this.f12733e != null) {
                this.f12733e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f12733e = viewPager;
            viewPager.setOnPageChangeListener(this);
            m1264a();
        }
    }

    /* renamed from: a */
    public void m1264a() {
        this.f12732d.removeAllViews();
        AbstractC0299ac adapter = this.f12733e.getAdapter();
        InterfaceC3893a interfaceC3893a = null;
        if (adapter instanceof InterfaceC3893a) {
            interfaceC3893a = (InterfaceC3893a) adapter;
        }
        int mo938b = adapter.mo938b();
        for (int i = 0; i < mo938b; i++) {
            CharSequence mo989c = adapter.mo989c(i);
            m1263a(i, mo989c == null ? f12729a : mo989c, interfaceC3893a != null ? interfaceC3893a.m1244a(i) : 0);
        }
        if (this.f12736h > mo938b) {
            this.f12736h = mo938b - 1;
        }
        setCurrentItem(this.f12736h);
        requestLayout();
    }

    public void setCurrentItem(int i) {
        if (this.f12733e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f12736h = i;
        this.f12733e.setCurrentItem(i);
        int childCount = this.f12732d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f12732d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1259c(i);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0245e interfaceC0245e) {
        this.f12734f = interfaceC0245e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator$b */
    /* loaded from: classes.dex */
    public class C3887b extends TextView {

        /* renamed from: b */
        private int f12742b;

        public C3887b(Context context) {
            super(context, null, C3852f.C3853a.vpiTabPageIndicatorStyle);
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.f12735g > 0 && getMeasuredWidth() > TabPageIndicator.this.f12735g) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.f12735g, 1073741824), i2);
            }
        }

        /* renamed from: a */
        public int m1256a() {
            return this.f12742b;
        }
    }
}
