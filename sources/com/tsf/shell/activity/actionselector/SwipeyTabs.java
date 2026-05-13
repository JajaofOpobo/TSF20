package com.tsf.shell.activity.actionselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.p002v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.C1306b;
/* loaded from: classes.dex */
public class SwipeyTabs extends ViewGroup implements ViewPager.InterfaceC0245e {

    /* renamed from: a */
    protected final String f7275a;

    /* renamed from: b */
    private InterfaceC2220b f7276b;

    /* renamed from: c */
    private int f7277c;

    /* renamed from: d */
    private int f7278d;

    /* renamed from: e */
    private int f7279e;

    /* renamed from: f */
    private int f7280f;

    /* renamed from: g */
    private int f7281g;

    /* renamed from: h */
    private int[] f7282h;

    /* renamed from: i */
    private int[] f7283i;

    /* renamed from: j */
    private int[] f7284j;

    /* renamed from: k */
    private int[] f7285k;

    /* renamed from: l */
    private Paint f7286l;

    /* renamed from: m */
    private int f7287m;

    public SwipeyTabs(Context context) {
        this(context, null);
    }

    public SwipeyTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeyTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7275a = "SwipeyTabs";
        this.f7277c = -1;
        this.f7278d = 2;
        this.f7279e = 3;
        this.f7280f = -6903239;
        this.f7281g = -7039852;
        this.f7287m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1306b.C1316j.SwipeyTabs, i, 0);
        this.f7280f = obtainStyledAttributes.getColor(C1306b.C1316j.SwipeyTabs_bottomBarColor, this.f7280f);
        this.f7278d = obtainStyledAttributes.getDimensionPixelSize(C1306b.C1316j.SwipeyTabs_bottomBarHeight, 2);
        this.f7279e = obtainStyledAttributes.getDimensionPixelSize(C1306b.C1316j.SwipeyTabs_tabIndicatorHeight, 3);
        obtainStyledAttributes.recycle();
        m6070a();
    }

    /* renamed from: a */
    private void m6070a() {
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) ((getResources().getDisplayMetrics().density * 35.0f) + 0.5f));
        setWillNotDraw(false);
        this.f7286l = new Paint();
        this.f7286l.setColor(this.f7280f);
    }

    public void setAdapter(InterfaceC2220b interfaceC2220b) {
        if (this.f7276b != null) {
        }
        this.f7276b = interfaceC2220b;
        this.f7277c = -1;
        this.f7282h = null;
        this.f7283i = null;
        this.f7284j = null;
        this.f7285k = null;
        removeAllViews();
        if (this.f7276b != null) {
            int m6060b = this.f7276b.m6060b();
            for (int i = 0; i < m6060b; i++) {
                addView(this.f7276b.mo6061a(i, this));
            }
            this.f7277c = 0;
            this.f7282h = new int[m6060b];
            this.f7283i = new int[m6060b];
            this.f7284j = new int[m6060b];
            this.f7285k = new int[m6060b];
            this.f7287m = -1;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m6066a(boolean z) {
        if (this.f7276b != null) {
            m6067a(this.f7277c, this.f7282h);
            m6067a(this.f7277c + 1, this.f7283i);
            m6067a(this.f7277c - 1, this.f7284j);
            m6065b();
            if (z) {
                int m6060b = this.f7276b.m6060b();
                for (int i = 0; i < m6060b; i++) {
                    this.f7285k[i] = this.f7282h[i];
                }
            }
        }
    }

    /* renamed from: a */
    private void m6067a(int i, int[] iArr) {
        if (this.f7276b != null) {
            int m6060b = this.f7276b.m6060b();
            if (i >= 0 && i < m6060b) {
                int measuredWidth = getMeasuredWidth();
                iArr[i] = (measuredWidth / 2) - (getChildAt(i).getMeasuredWidth() / 2);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    TextView textView = (TextView) getChildAt(i2);
                    if (i2 == i - 1) {
                        iArr[i2] = 0 - textView.getPaddingLeft();
                    } else {
                        iArr[i2] = (0 - textView.getMeasuredWidth()) - measuredWidth;
                    }
                    iArr[i2] = Math.min(iArr[i2], iArr[i2 + 1] - textView.getMeasuredWidth());
                }
                for (int i3 = i + 1; i3 < m6060b; i3++) {
                    TextView textView2 = (TextView) getChildAt(i3);
                    if (i3 == i + 1) {
                        iArr[i3] = textView2.getPaddingRight() + (measuredWidth - textView2.getMeasuredWidth());
                    } else {
                        iArr[i3] = measuredWidth * 2;
                    }
                    iArr[i3] = Math.max(iArr[i3], ((TextView) getChildAt(i3 - 1)).getMeasuredWidth() + iArr[i3 - 1]);
                }
                return;
            }
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr[i4] = -1;
            }
        }
    }

    /* renamed from: b */
    private void m6065b() {
        if (this.f7276b != null) {
            int m6060b = this.f7276b.m6060b();
            for (int i = 0; i < m6060b; i++) {
                TextView textView = (TextView) getChildAt(i);
                if (i < this.f7277c) {
                    textView.setEllipsize(null);
                    textView.setGravity(21);
                } else if (i == this.f7277c) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity(19);
                } else if (i > this.f7277c) {
                    textView.setEllipsize(null);
                    textView.setGravity(19);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        m6069a(i, i2);
        View childAt = getChildAt(0);
        setMeasuredDimension(resolveSize(getPaddingLeft() + size + getPaddingRight(), i), resolveSize((childAt != null ? childAt.getMeasuredHeight() : 0) + this.f7278d + getPaddingTop() + getPaddingBottom(), i2));
        if (this.f7287m != size) {
            this.f7287m = size;
            m6066a(true);
        }
    }

    /* renamed from: a */
    private void m6069a(int i, int i2) {
        if (this.f7276b != null) {
            int size = (int) (View.MeasureSpec.getSize(i) * 0.6d);
            int m6060b = this.f7276b.m6060b();
            for (int i3 = 0; i3 < m6060b; i3++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
                getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f7276b != null) {
            int m6060b = this.f7276b.m6060b();
            for (int i5 = 0; i5 < m6060b; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(this.f7285k[i5], getPaddingTop(), this.f7285k[i5] + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f7277c != -1) {
            int height = ((getHeight() - getPaddingBottom()) - this.f7278d) - this.f7279e;
            View childAt = getChildAt(this.f7277c);
            int measuredWidth = (this.f7285k[this.f7277c] + childAt.getMeasuredWidth()) - (childAt.getMeasuredWidth() / 2);
            int width = getWidth() / 2;
            float min = 1.0f - Math.min(Math.abs((measuredWidth - width) / (width / 3)), 1.0f);
            this.f7286l.setAlpha((int) (255.0f * min));
            canvas.drawRect(this.f7285k[this.f7277c], height, childAt.getMeasuredWidth() + this.f7285k[this.f7277c], height + this.f7279e, this.f7286l);
            int m6060b = this.f7276b.m6060b();
            for (int i = 0; i < m6060b; i++) {
                TextView textView = (TextView) getChildAt(i);
                if (this.f7277c == i) {
                    textView.setTextColor(m6068a(this.f7280f, this.f7281g, 1.0f - min));
                } else {
                    textView.setTextColor(this.f7281g);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int height = (getHeight() - getPaddingBottom()) - this.f7278d;
        this.f7286l.setAlpha(255);
        canvas.drawRect(0.0f, height, getWidth(), height + this.f7278d, this.f7286l);
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: c_ */
    public void mo936c_(int i) {
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: a */
    public void mo940a(int i, float f, int i2) {
        char c;
        int i3;
        if (this.f7276b != null) {
            int m6060b = this.f7276b.m6060b();
            if (i2 != 0 && this.f7277c == i) {
                c = 65535;
            } else if (i2 == 0 || this.f7277c == i) {
                f = 0.0f;
                c = 0;
            } else {
                c = 1;
                f = 1.0f - f;
            }
            for (int i4 = 0; i4 < m6060b; i4++) {
                float f2 = this.f7282h[i4];
                if (c < 0) {
                    i3 = this.f7283i[i4];
                } else if (c > 0) {
                    i3 = this.f7284j[i4];
                } else {
                    i3 = this.f7282h[i4];
                }
                this.f7285k[i4] = (int) (((int) (((i3 - f2) * f) + 0.5f)) + f2);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: b_ */
    public void mo937b_(int i) {
        this.f7277c = i;
        m6066a(false);
    }

    /* renamed from: a */
    private int m6068a(int i, int i2, float f) {
        float alpha = Color.alpha(i) / 255.0f;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float alpha2 = alpha + (((Color.alpha(i2) / 255.0f) - alpha) * f);
        float red2 = red + (((Color.red(i2) / 255.0f) - red) * f);
        float green2 = green + (((Color.green(i2) / 255.0f) - green) * f);
        return Color.argb((int) (Math.max(Math.min(alpha2, 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(red2, 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(green2, 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(blue + (((Color.blue(i2) / 255.0f) - blue) * f), 1.0f), 0.0f) * 255.0f));
    }
}
