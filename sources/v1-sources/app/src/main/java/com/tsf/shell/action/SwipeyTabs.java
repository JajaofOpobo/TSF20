package com.tsf.shell.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.view.bb;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class SwipeyTabs extends ViewGroup implements bb {
    protected final String a;
    private p b;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.c, i, 0);
        this.f = obtainStyledAttributes.getColor(0, this.f);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 2);
        this.e = obtainStyledAttributes.getDimensionPixelSize(2, 3);
        obtainStyledAttributes.recycle();
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) ((getResources().getDisplayMetrics().density * 35.0f) + 0.5f));
        setWillNotDraw(false);
        this.l = new Paint();
        this.l.setColor(this.f);
    }

    public final void a(p pVar) {
        this.b = pVar;
        this.c = -1;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        removeAllViews();
        if (this.b != null) {
            int c = this.b.c();
            for (int i = 0; i < c; i++) {
                addView(this.b.a(i, this));
            }
            this.c = 0;
            this.h = new int[c];
            this.i = new int[c];
            this.j = new int[c];
            this.k = new int[c];
            this.m = -1;
            requestLayout();
        }
    }

    private void a(boolean z) {
        if (this.b != null) {
            a(this.c, this.h);
            a(this.c + 1, this.i);
            a(this.c - 1, this.j);
            if (this.b != null) {
                int c = this.b.c();
                for (int i = 0; i < c; i++) {
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
            if (z) {
                int c2 = this.b.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    this.k[i2] = this.h[i2];
                }
            }
        }
    }

    private void a(int i, int[] iArr) {
        if (this.b != null) {
            int c = this.b.c();
            if (i >= 0 && i < c) {
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
                for (int i3 = i + 1; i3 < c; i3++) {
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

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.b != null) {
            int size2 = (int) (View.MeasureSpec.getSize(i) * 0.6d);
            int c = this.b.c();
            for (int i3 = 0; i3 < c; i3++) {
                getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getChildAt(i3).getLayoutParams().height, 1073741824));
            }
        }
        View childAt = getChildAt(0);
        setMeasuredDimension(resolveSize(getPaddingLeft() + size + getPaddingRight(), i), resolveSize((childAt != null ? childAt.getMeasuredHeight() : 0) + this.d + getPaddingTop() + getPaddingBottom(), i2));
        if (this.m != size) {
            this.m = size;
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b != null) {
            int c = this.b.c();
            for (int i5 = 0; i5 < c; i5++) {
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
            float min = 1.0f - Math.min(Math.abs((measuredWidth - width) / (width / 3)), 1.0f);
            this.l.setAlpha((int) (255.0f * min));
            canvas.drawRect(this.k[this.c], height, childAt.getMeasuredWidth() + this.k[this.c], height + this.e, this.l);
            int c = this.b.c();
            for (int i = 0; i < c; i++) {
                TextView textView = (TextView) getChildAt(i);
                if (this.c == i) {
                    int i2 = this.f;
                    int i3 = this.g;
                    float f = 1.0f - min;
                    float alpha = Color.alpha(i2) / 255.0f;
                    float red = Color.red(i2) / 255.0f;
                    float green = Color.green(i2) / 255.0f;
                    float blue = Color.blue(i2) / 255.0f;
                    textView.setTextColor(Color.argb((int) (Math.max(Math.min(alpha + (((Color.alpha(i3) / 255.0f) - alpha) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(red + (((Color.red(i3) / 255.0f) - red) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(green + (((Color.green(i3) / 255.0f) - green) * f), 1.0f), 0.0f) * 255.0f), (int) (Math.max(Math.min(blue + (((Color.blue(i3) / 255.0f) - blue) * f), 1.0f), 0.0f) * 255.0f)));
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

    @Override // android.support.v4.view.bb
    public final void b(int i) {
    }

    @Override // android.support.v4.view.bb
    public final void a(int i, float f, int i2) {
        char c;
        int i3;
        if (this.b != null) {
            int c2 = this.b.c();
            if (i2 != 0 && this.c == i) {
                c = 65535;
            } else if (i2 == 0 || this.c == i) {
                f = 0.0f;
                c = 0;
            } else {
                c = 1;
                f = 1.0f - f;
            }
            for (int i4 = 0; i4 < c2; i4++) {
                float f2 = this.h[i4];
                if (c < 0) {
                    i3 = this.i[i4];
                } else if (c > 0) {
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

    @Override // android.support.v4.view.bb
    public final void a_(int i) {
        this.c = i;
        a(false);
    }
}
