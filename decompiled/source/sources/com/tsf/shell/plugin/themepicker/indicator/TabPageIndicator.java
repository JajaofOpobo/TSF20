package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
/* loaded from: classes.dex */
public class TabPageIndicator extends HorizontalScrollView implements c {
    private static final CharSequence a = "";
    private Runnable b;
    private final View.OnClickListener c;
    private final com.tsf.shell.plugin.themepicker.indicator.b d;
    private ViewPager e;
    private ViewPager.e f;
    private int g;
    private int h;
    private a i;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new View.OnClickListener() { // from class: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int currentItem = TabPageIndicator.this.e.getCurrentItem();
                int a2 = ((b) view).a();
                TabPageIndicator.this.e.setCurrentItem(a2);
                if (currentItem == a2 && TabPageIndicator.this.i != null) {
                    TabPageIndicator.this.i.a(a2);
                }
            }
        };
        setHorizontalScrollBarEnabled(false);
        this.d = new com.tsf.shell.plugin.themepicker.indicator.b(context, f.a.vpiTabPageIndicatorStyle);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setOnTabReselectedListener(a aVar) {
        this.i = aVar;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i) / 2;
            }
        } else {
            this.g = -1;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setCurrentItem(this.h);
        }
    }

    private void c(int i) {
        final View childAt = this.d.getChildAt(i);
        if (this.b != null) {
            removeCallbacks(this.b);
        }
        this.b = new Runnable() { // from class: com.tsf.shell.plugin.themepicker.indicator.TabPageIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                TabPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((TabPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                TabPageIndicator.this.b = null;
            }
        };
        post(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            post(this.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            removeCallbacks(this.b);
        }
    }

    private void a(int i, CharSequence charSequence, int i2) {
        b bVar = new b(getContext());
        bVar.b = i;
        bVar.setFocusable(true);
        bVar.setOnClickListener(this.c);
        bVar.setText(charSequence);
        if (i2 != 0) {
            bVar.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.d.addView(bVar, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    @Override // android.support.v4.view.ViewPager.e
    public void c_(int i) {
        if (this.f != null) {
            this.f.c_(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.e
    public void a(int i, float f, int i2) {
        if (this.f != null) {
            this.f.a(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.e
    public void b_(int i) {
        setCurrentItem(i);
        if (this.f != null) {
            this.f.b_(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.e != viewPager) {
            if (this.e != null) {
                this.e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.e = viewPager;
            viewPager.setOnPageChangeListener(this);
            a();
        }
    }

    public void a() {
        this.d.removeAllViews();
        ac adapter = this.e.getAdapter();
        com.tsf.shell.plugin.themepicker.indicator.a aVar = null;
        if (adapter instanceof com.tsf.shell.plugin.themepicker.indicator.a) {
            aVar = (com.tsf.shell.plugin.themepicker.indicator.a) adapter;
        }
        int b2 = adapter.b();
        for (int i = 0; i < b2; i++) {
            CharSequence c = adapter.c(i);
            a(i, c == null ? a : c, aVar != null ? aVar.a(i) : 0);
        }
        if (this.h > b2) {
            this.h = b2 - 1;
        }
        setCurrentItem(this.h);
        requestLayout();
    }

    public void setCurrentItem(int i) {
        if (this.e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.h = i;
        this.e.setCurrentItem(i);
        int childCount = this.d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                c(i);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(ViewPager.e eVar) {
        this.f = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends TextView {
        private int b;

        public b(Context context) {
            super(context, null, f.a.vpiTabPageIndicatorStyle);
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.g > 0 && getMeasuredWidth() > TabPageIndicator.this.g) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.g, 1073741824), i2);
            }
        }

        public int a() {
            return this.b;
        }
    }
}
