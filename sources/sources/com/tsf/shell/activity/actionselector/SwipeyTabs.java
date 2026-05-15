package com.tsf.shell.activity.actionselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SwipeyTabs extends ViewGroup implements ViewPager.e {
    protected final String a;
    private b b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private Paint l;
    private int m;

    public SwipeyTabs(Context context) {
        this(context, null);
    }

    public SwipeyTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeyTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "SwipeyTabs";
        this.c = -1;
        this.d = 2;
        this.e = 3;
        this.f = -6903239;
        this.g = -7039852;
        this.m = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.SwipeyTabs, i, 0);
        this.f = typedArrayObtainStyledAttributes.getColor(b.j.SwipeyTabs_bottomBarColor, this.f);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.j.SwipeyTabs_bottomBarHeight, 2);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.j.SwipeyTabs_tabIndicatorHeight, 3);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) ((getResources().getDisplayMetrics().density * 35.0f) + 0.5f));
        setWillNotDraw(false);
        this.l = new Paint();
        this.l.setColor(this.f);
    }

    public void setAdapter(b bVar) {
        if (this.b != null) {
        }
        this.b = bVar;
        this.c = -1;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        removeAllViews();
        if (this.b != null) {
            int iB = this.b.b();
            for (int i = 0; i < iB; i++) {
                addView(this.b.a(i, this));
            }
            this.c = 0;
            this.h = new int[iB];
            this.i = new int[iB];
            this.j = new int[iB];
            this.k = new int[iB];
            this.m = -1;
            requestLayout();
        }
    }

    private void a(boolean z) {
        if (this.b != null) {
            a(this.c, this.h);
            a(this.c + 1, this.i);
            a(this.c - 1, this.j);
            b();
            if (z) {
                int iB = this.b.b();
                for (int i = 0; i < iB; i++) {
                    this.k[i] = this.h[i];
                }
            }
        }
    }

    private void a(int i, int[] iArr) {
        if (this.b != null) {
            int iB = this.b.b();
            if (i >= 0 && i < iB) {
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
                for (int i3 = i + 1; i3 < iB; i3++) {
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

    private void b() {
        if (this.b != null) {
            int iB = this.b.b();
            for (int i = 0; i < iB; i++) {
                TextView textView = (TextView) getChildAt(i);
                if (i < this.c) {
                    textView.setEllipsize(null);
                    textView.setGravity(21);
                } else if (i == this.c) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity(19);
                } else if (i > this.c) {
                    textView.setEllipsize(null);
                    textView.setGravity(19);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        a(i, i2);
        View childAt = getChildAt(0);
        setMeasuredDimension(resolveSize(getPaddingLeft() + size + getPaddingRight(), i), resolveSize((childAt != null ? childAt.getMeasuredHeight() : 0) + this.d + getPaddingTop() + getPaddingBottom(), i2));
        if (this.m != size) {
            this.m = size;
            a(true);
        }
    }

    private void a(int i, int i2) {
        if (this.b != null) {
            int size = (int) (((double) View.MeasureSpec.getSize(i)) * 0.6d);
            int iB = this.b.b();
            for (int i3 = 0; i3 < iB; i3++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
                getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b != null) {
            int iB = this.b.b();
            for (int i5 = 0; i5 < iB; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(this.k[i5], getPaddingTop(), this.k[i5] + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.c != -1) {
            int height = ((getHeight() - getPaddingBottom()) - this.d) - this.e;
            View childAt = getChildAt(this.c);
            int measuredWidth = (this.k[this.c] + childAt.getMeasuredWidth()) - (childAt.getMeasuredWidth() / 2);
            int width = getWidth() / 2;
            float fMin = 1.0f - Math.min(Math.abs((measuredWidth - width) / (width / 3)), 1.0f);
            this.l.setAlpha((int) (255.0f * fMin));
            canvas.drawRect(this.k[this.c], height, childAt.getMeasuredWidth() + this.k[this.c], height + this.e, this.l);
            int iB = this.b.b();
            for (int i = 0; i < iB; i++) {
                TextView textView = (TextView) getChildAt(i);
                if (this.c == i) {
                    textView.setTextColor(a(this.f, this.g, 1.0f - fMin));
                } else {
                    textView.setTextColor(this.g);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int height = (getHeight() - getPaddingBottom()) - this.d;
        this.l.setAlpha(255);
        canvas.drawRect(0.0f, height, getWidth(), height + this.d, this.l);
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.support.v4.view.ViewPager.e
    public void c_(int i) {
    }

    @Override // android.support.v4.view.ViewPager.e
    public void a(int i, float f, int i2) {
        byte b;
        int i3;
        if (this.b != null) {
            int iB = this.b.b();
            if (i2 != 0 && this.c == i) {
                b = -1;
            } else if (i2 == 0 || this.c == i) {
                f = 0.0f;
                b = 0;
            } else {
                b = 1;
                f = 1.0f - f;
            }
            for (int i4 = 0; i4 < iB; i4++) {
                float f2 = this.h[i4];
                if (b < 0) {
                    i3 = this.i[i4];
                } else if (b > 0) {
                    i3 = this.j[i4];
                } else {
                    i3 = this.h[i4];
                }
                this.k[i4] = (int) (((int) (((i3 - f2) * f) + 0.5f)) + f2);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.support.v4.view.ViewPager.e
    public void b_(int i) {
        this.c = i;
        a(false);
    }

    private int a(int i, int i2, float f) {
        float fAlpha = Color.alpha(i) / 255.0f;
        float fRed = Color.red(i) / 255.0f;
        float fGreen = Color.green(i) / 255.0f;
        float fBlue = Color.blue(i) / 255.0f;
        return Color.argb((int) (Math.max(Math.min(fAlpha + (((Color.alpha(i2) / 255.0f) - fAlpha) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(fRed + (((Color.red(i2) / 255.0f) - fRed) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(fGreen + (((Color.green(i2) / 255.0f) - fGreen) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(fBlue + (((Color.blue(i2) / 255.0f) - fBlue) * f), 1.0f), 0.0f) * 255.0f));
    }
}
