package android.support.p002v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v4.view.PagerTitleStrip */
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup implements ViewPager.InterfaceC0241a {

    /* renamed from: n */
    private static final int[] f603n = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: o */
    private static final int[] f604o = {16843660};

    /* renamed from: q */
    private static final InterfaceC0233b f605q;

    /* renamed from: a */
    ViewPager f606a;

    /* renamed from: b */
    TextView f607b;

    /* renamed from: c */
    TextView f608c;

    /* renamed from: d */
    TextView f609d;

    /* renamed from: e */
    int f610e;

    /* renamed from: f */
    private int f611f;

    /* renamed from: g */
    private float f612g;

    /* renamed from: h */
    private int f613h;

    /* renamed from: i */
    private int f614i;

    /* renamed from: j */
    private boolean f615j;

    /* renamed from: k */
    private boolean f616k;

    /* renamed from: l */
    private final C0232a f617l;

    /* renamed from: m */
    private WeakReference<AbstractC0299ac> f618m;

    /* renamed from: p */
    private int f619p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.view.PagerTitleStrip$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0233b {
        /* renamed from: a */
        void mo13204a(TextView textView);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f605q = new C0235d();
        } else {
            f605q = new C0234c();
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$c */
    /* loaded from: classes.dex */
    static class C0234c implements InterfaceC0233b {
        C0234c() {
        }

        @Override // android.support.p002v4.view.PagerTitleStrip.InterfaceC0233b
        /* renamed from: a */
        public void mo13204a(TextView textView) {
            textView.setSingleLine();
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$d */
    /* loaded from: classes.dex */
    static class C0235d implements InterfaceC0233b {
        C0235d() {
        }

        @Override // android.support.p002v4.view.PagerTitleStrip.InterfaceC0233b
        /* renamed from: a */
        public void mo13204a(TextView textView) {
            C0300ad.m12939a(textView);
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f605q.mo13204a(textView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f611f = -1;
        this.f612g = -1.0f;
        this.f617l = new C0232a();
        TextView textView = new TextView(context);
        this.f607b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f608c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f609d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f603n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f607b.setTextAppearance(context, resourceId);
            this.f608c.setTextAppearance(context, resourceId);
            this.f609d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m13209a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f607b.setTextColor(color);
            this.f608c.setTextColor(color);
            this.f609d.setTextColor(color);
        }
        this.f614i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f610e = this.f608c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f607b.setEllipsize(TextUtils.TruncateAt.END);
        this.f608c.setEllipsize(TextUtils.TruncateAt.END);
        this.f609d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f604o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f607b);
            setSingleLineAllCaps(this.f608c);
            setSingleLineAllCaps(this.f609d);
        } else {
            this.f607b.setSingleLine();
            this.f608c.setSingleLine();
            this.f609d.setSingleLine();
        }
        this.f613h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.f613h = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f613h;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f619p = ((int) (255.0f * f)) & 255;
        int i = (this.f619p << 24) | (this.f610e & ThemeElementType.PARSER_CONFIG_ALL);
        this.f607b.setTextColor(i);
        this.f609d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f610e = i;
        this.f608c.setTextColor(i);
        int i2 = (this.f619p << 24) | (this.f610e & ThemeElementType.PARSER_CONFIG_ALL);
        this.f607b.setTextColor(i2);
        this.f609d.setTextColor(i2);
    }

    /* renamed from: a */
    public void m13209a(int i, float f) {
        this.f607b.setTextSize(i, f);
        this.f608c.setTextSize(i, f);
        this.f609d.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.f614i = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC0299ac adapter = viewPager.getAdapter();
        viewPager.m13188a(this.f617l);
        viewPager.setOnAdapterChangeListener(this.f617l);
        this.f606a = viewPager;
        m13205a(this.f618m != null ? this.f618m.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f606a != null) {
            m13205a(this.f606a.getAdapter(), (AbstractC0299ac) null);
            this.f606a.m13188a((ViewPager.InterfaceC0245e) null);
            this.f606a.setOnAdapterChangeListener(null);
            this.f606a = null;
        }
    }

    /* renamed from: a */
    void m13207a(int i, AbstractC0299ac abstractC0299ac) {
        CharSequence charSequence = null;
        int mo938b = abstractC0299ac != null ? abstractC0299ac.mo938b() : 0;
        this.f615j = true;
        this.f607b.setText((i < 1 || abstractC0299ac == null) ? null : abstractC0299ac.mo989c(i - 1));
        this.f608c.setText((abstractC0299ac == null || i >= mo938b) ? null : abstractC0299ac.mo989c(i));
        if (i + 1 < mo938b && abstractC0299ac != null) {
            charSequence = abstractC0299ac.mo989c(i + 1);
        }
        this.f609d.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f607b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f608c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f609d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f611f = i;
        if (!this.f616k) {
            mo13208a(i, this.f612g, false);
        }
        this.f615j = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f615j) {
            super.requestLayout();
        }
    }

    /* renamed from: a */
    void m13205a(AbstractC0299ac abstractC0299ac, AbstractC0299ac abstractC0299ac2) {
        if (abstractC0299ac != null) {
            abstractC0299ac.m12946b(this.f617l);
            this.f618m = null;
        }
        if (abstractC0299ac2 != null) {
            abstractC0299ac2.m12953a((DataSetObserver) this.f617l);
            this.f618m = new WeakReference<>(abstractC0299ac2);
        }
        if (this.f606a != null) {
            this.f611f = -1;
            this.f612g = -1.0f;
            m13207a(this.f606a.getCurrentItem(), abstractC0299ac2);
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13208a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f611f) {
            m13207a(i, this.f606a.getAdapter());
        } else if (!z && f == this.f612g) {
            return;
        }
        this.f616k = true;
        int measuredWidth = this.f607b.getMeasuredWidth();
        int measuredWidth2 = this.f608c.getMeasuredWidth();
        int measuredWidth3 = this.f609d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (f2 * i7))) - (measuredWidth2 / 2);
        int i9 = i8 + measuredWidth2;
        int baseline = this.f607b.getBaseline();
        int baseline2 = this.f608c.getBaseline();
        int baseline3 = this.f609d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = max - baseline;
        int i11 = max - baseline2;
        int i12 = max - baseline3;
        int max2 = Math.max(Math.max(this.f607b.getMeasuredHeight() + i10, this.f608c.getMeasuredHeight() + i11), this.f609d.getMeasuredHeight() + i12);
        switch (this.f614i & 112) {
            case 16:
                int i13 = (((height - paddingTop) - paddingBottom) - max2) / 2;
                i2 = i13 + i10;
                i3 = i11 + i13;
                i4 = i13 + i12;
                break;
            case 80:
                int i14 = (height - paddingBottom) - max2;
                i2 = i14 + i10;
                i3 = i11 + i14;
                i4 = i14 + i12;
                break;
            default:
                i2 = paddingTop + i10;
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                break;
        }
        this.f608c.layout(i8, i3, i9, this.f608c.getMeasuredHeight() + i3);
        int min = Math.min(paddingLeft, (i8 - this.f613h) - measuredWidth);
        this.f607b.layout(min, i2, measuredWidth + min, this.f607b.getMeasuredHeight() + i2);
        int max3 = Math.max((width - paddingRight) - measuredWidth3, this.f613h + i9);
        this.f609d.layout(max3, i4, max3 + measuredWidth3, this.f609d.getMeasuredHeight() + i4);
        this.f612g = f;
        this.f616k = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f607b.measure(childMeasureSpec2, childMeasureSpec);
        this.f608c.measure(childMeasureSpec2, childMeasureSpec);
        this.f609d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), paddingTop + this.f608c.getMeasuredHeight());
        }
        setMeasuredDimension(size, C0309ai.m12932a(max, i2, C0309ai.m12898i(this.f608c) << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f606a != null) {
            mo13208a(this.f611f, this.f612g >= 0.0f ? this.f612g : 0.0f, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background == null) {
            return 0;
        }
        return background.getIntrinsicHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.view.PagerTitleStrip$a */
    /* loaded from: classes.dex */
    public class C0232a extends DataSetObserver implements ViewPager.InterfaceC0244d, ViewPager.InterfaceC0245e {

        /* renamed from: b */
        private int f621b;

        private C0232a() {
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: a */
        public void mo940a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo13208a(i, f, false);
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: b_ */
        public void mo937b_(int i) {
            if (this.f621b == 0) {
                PagerTitleStrip.this.m13207a(PagerTitleStrip.this.f606a.getCurrentItem(), PagerTitleStrip.this.f606a.getAdapter());
                PagerTitleStrip.this.mo13208a(PagerTitleStrip.this.f606a.getCurrentItem(), PagerTitleStrip.this.f612g >= 0.0f ? PagerTitleStrip.this.f612g : 0.0f, true);
            }
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
        /* renamed from: c_ */
        public void mo936c_(int i) {
            this.f621b = i;
        }

        @Override // android.support.p002v4.view.ViewPager.InterfaceC0244d
        /* renamed from: a */
        public void mo13151a(AbstractC0299ac abstractC0299ac, AbstractC0299ac abstractC0299ac2) {
            PagerTitleStrip.this.m13205a(abstractC0299ac, abstractC0299ac2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip.this.m13207a(PagerTitleStrip.this.f606a.getCurrentItem(), PagerTitleStrip.this.f606a.getAdapter());
            PagerTitleStrip.this.mo13208a(PagerTitleStrip.this.f606a.getCurrentItem(), PagerTitleStrip.this.f612g >= 0.0f ? PagerTitleStrip.this.f612g : 0.0f, true);
        }
    }
}
