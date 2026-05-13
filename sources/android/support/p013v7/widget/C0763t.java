package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v7.app.ActionBar;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.C0606a;
import android.support.p013v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
/* renamed from: android.support.v7.widget.t */
/* loaded from: classes.dex */
public class C0763t extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    private static final Interpolator f2185j = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f2186a;

    /* renamed from: b */
    int f2187b;

    /* renamed from: c */
    int f2188c;

    /* renamed from: d */
    private View$OnClickListenerC0766b f2189d;

    /* renamed from: e */
    private LinearLayoutCompat f2190e;

    /* renamed from: f */
    private Spinner f2191f;

    /* renamed from: g */
    private boolean f2192g;

    /* renamed from: h */
    private int f2193h;

    /* renamed from: i */
    private int f2194i;

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = true;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2190e.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f2187b = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f2187b = View.MeasureSpec.getSize(i) / 2;
            }
            this.f2187b = Math.min(this.f2187b, this.f2188c);
        } else {
            this.f2187b = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2193h, 1073741824);
        if (z2 || !this.f2192g) {
            z = false;
        }
        if (z) {
            this.f2190e.measure(0, makeMeasureSpec);
            if (this.f2190e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m11099b();
            } else {
                m11098c();
            }
        } else {
            m11098c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2194i);
        }
    }

    /* renamed from: a */
    private boolean m11104a() {
        return this.f2191f != null && this.f2191f.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.f2192g = z;
    }

    /* renamed from: b */
    private void m11099b() {
        if (!m11104a()) {
            if (this.f2191f == null) {
                this.f2191f = m11097d();
            }
            removeView(this.f2190e);
            addView(this.f2191f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2191f.getAdapter() == null) {
                this.f2191f.setAdapter((SpinnerAdapter) new C0765a());
            }
            if (this.f2186a != null) {
                removeCallbacks(this.f2186a);
                this.f2186a = null;
            }
            this.f2191f.setSelection(this.f2194i);
        }
    }

    /* renamed from: c */
    private boolean m11098c() {
        if (m11104a()) {
            removeView(this.f2191f);
            addView(this.f2190e, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f2191f.getSelectedItemPosition());
        }
        return false;
    }

    public void setTabSelected(int i) {
        this.f2194i = i;
        int childCount = this.f2190e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2190e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m11103a(i);
            }
            i2++;
        }
        if (this.f2191f != null && i >= 0) {
            this.f2191f.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.f2193h = i;
        requestLayout();
    }

    /* renamed from: d */
    private Spinner m11097d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0535a.C0536a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        C0606a m11878a = C0606a.m11878a(getContext());
        setContentHeight(m11878a.m11874e());
        this.f2188c = m11878a.m11872g();
    }

    /* renamed from: a */
    public void m11103a(int i) {
        final View childAt = this.f2190e.getChildAt(i);
        if (this.f2186a != null) {
            removeCallbacks(this.f2186a);
        }
        this.f2186a = new Runnable() { // from class: android.support.v7.widget.t.1
            @Override // java.lang.Runnable
            public void run() {
                C0763t.this.smoothScrollTo(childAt.getLeft() - ((C0763t.this.getWidth() - childAt.getWidth()) / 2), 0);
                C0763t.this.f2186a = null;
            }
        };
        post(this.f2186a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2186a != null) {
            post(this.f2186a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2186a != null) {
            removeCallbacks(this.f2186a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public View$OnLongClickListenerC0767c m11102a(ActionBar.AbstractC0548b abstractC0548b, boolean z) {
        View$OnLongClickListenerC0767c view$OnLongClickListenerC0767c = new View$OnLongClickListenerC0767c(getContext(), abstractC0548b, z);
        if (z) {
            view$OnLongClickListenerC0767c.setBackgroundDrawable(null);
            view$OnLongClickListenerC0767c.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2193h));
        } else {
            view$OnLongClickListenerC0767c.setFocusable(true);
            if (this.f2189d == null) {
                this.f2189d = new View$OnClickListenerC0766b();
            }
            view$OnLongClickListenerC0767c.setOnClickListener(this.f2189d);
        }
        return view$OnLongClickListenerC0767c;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((View$OnLongClickListenerC0767c) view).m11094b().m12117d();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.t$c */
    /* loaded from: classes.dex */
    public class View$OnLongClickListenerC0767c extends LinearLayoutCompat implements View.OnLongClickListener {

        /* renamed from: b */
        private final int[] f2200b;

        /* renamed from: c */
        private ActionBar.AbstractC0548b f2201c;

        /* renamed from: d */
        private TextView f2202d;

        /* renamed from: e */
        private ImageView f2203e;

        /* renamed from: f */
        private View f2204f;

        public View$OnLongClickListenerC0767c(Context context, ActionBar.AbstractC0548b abstractC0548b, boolean z) {
            super(context, null, C0535a.C0536a.actionBarTabStyle);
            this.f2200b = new int[]{16842964};
            this.f2201c = abstractC0548b;
            C0725aa m11295a = C0725aa.m11295a(context, null, this.f2200b, C0535a.C0536a.actionBarTabStyle, 0);
            if (m11295a.m11286f(0)) {
                setBackgroundDrawable(m11295a.m11300a(0));
            }
            m11295a.m11301a();
            if (z) {
                setGravity(8388627);
            }
            m11096a();
        }

        /* renamed from: a */
        public void m11095a(ActionBar.AbstractC0548b abstractC0548b) {
            this.f2201c = abstractC0548b;
            m11096a();
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.AbstractC0548b.class.getName());
        }

        @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(ActionBar.AbstractC0548b.class.getName());
            }
        }

        @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0763t.this.f2187b > 0 && getMeasuredWidth() > C0763t.this.f2187b) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0763t.this.f2187b, 1073741824), i2);
            }
        }

        /* renamed from: a */
        public void m11096a() {
            ActionBar.AbstractC0548b abstractC0548b = this.f2201c;
            View m12118c = abstractC0548b.m12118c();
            if (m12118c != null) {
                ViewParent parent = m12118c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m12118c);
                    }
                    addView(m12118c);
                }
                this.f2204f = m12118c;
                if (this.f2202d != null) {
                    this.f2202d.setVisibility(8);
                }
                if (this.f2203e != null) {
                    this.f2203e.setVisibility(8);
                    this.f2203e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f2204f != null) {
                removeView(this.f2204f);
                this.f2204f = null;
            }
            Drawable m12120a = abstractC0548b.m12120a();
            CharSequence m12119b = abstractC0548b.m12119b();
            if (m12120a != null) {
                if (this.f2203e == null) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams.f1833h = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    this.f2203e = imageView;
                }
                this.f2203e.setImageDrawable(m12120a);
                this.f2203e.setVisibility(0);
            } else if (this.f2203e != null) {
                this.f2203e.setVisibility(8);
                this.f2203e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(m12119b);
            if (z) {
                if (this.f2202d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0535a.C0536a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams2.f1833h = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2202d = appCompatTextView;
                }
                this.f2202d.setText(m12119b);
                this.f2202d.setVisibility(0);
            } else if (this.f2202d != null) {
                this.f2202d.setVisibility(8);
                this.f2202d.setText((CharSequence) null);
            }
            if (this.f2203e != null) {
                this.f2203e.setContentDescription(abstractC0548b.m12116e());
            }
            if (!z && !TextUtils.isEmpty(abstractC0548b.m12116e())) {
                setOnLongClickListener(this);
                return;
            }
            setOnLongClickListener(null);
            setLongClickable(false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.f2201c.m12116e(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        /* renamed from: b */
        public ActionBar.AbstractC0548b m11094b() {
            return this.f2201c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.t$a */
    /* loaded from: classes.dex */
    public class C0765a extends BaseAdapter {
        private C0765a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0763t.this.f2190e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((View$OnLongClickListenerC0767c) C0763t.this.f2190e.getChildAt(i)).m11094b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0763t.this.m11102a((ActionBar.AbstractC0548b) getItem(i), true);
            }
            ((View$OnLongClickListenerC0767c) view).m11095a((ActionBar.AbstractC0548b) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.t$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0766b implements View.OnClickListener {
        private View$OnClickListenerC0766b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((View$OnLongClickListenerC0767c) view).m11094b().m12117d();
            int childCount = C0763t.this.f2190e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0763t.this.f2190e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }
}
