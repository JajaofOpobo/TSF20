package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class SildingMenuLayout extends LinearLayout {
    private static int h = 15;
    private static /* synthetic */ int[] r;
    int a;
    boolean b;
    float c;
    float d;
    private View e;
    private View f;
    private View g;
    private int i;
    private v j;
    private Scroller k;
    private Runnable l;
    private Handler m;
    private int n;
    private int o;
    private float p;
    private float q;

    static /* synthetic */ int[] b() {
        int[] iArr = r;
        if (iArr == null) {
            iArr = new int[v.valuesCustom().length];
            try {
                iArr[v.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[v.HIDING.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[v.SHOWING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[v.SHOWN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            r = iArr;
        }
        return iArr;
    }

    public SildingMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.j = v.HIDDEN;
        this.k = new Scroller(getContext(), new t(this));
        this.l = new u(this);
        this.m = new Handler();
        this.b = false;
        this.c = 0.0f;
        this.d = 0.0f;
        this.o = 0;
    }

    public SildingMenuLayout(Context context) {
        super(context);
        this.i = 0;
        this.j = v.HIDDEN;
        this.k = new Scroller(getContext(), new t(this));
        this.l = new u(this);
        this.m = new Handler();
        this.b = false;
        this.c = 0.0f;
        this.d = 0.0f;
        this.o = 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = View.MeasureSpec.getSize(i);
        h = (this.a * 10) / 100;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = getChildAt(0);
        this.f = getChildAt(1);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.shell.plugin.themepicker.SildingMenuLayout.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return SildingMenuLayout.this.a(view, motionEvent);
            }
        });
        this.e.setVisibility(8);
        this.g = getChildAt(2);
        this.n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            i4 -= i2;
            i2 = 0;
        }
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.height = getHeight();
            layoutParams.width = getWidth();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams2.height = getHeight();
            layoutParams2.width = getWidth() - h;
        }
        this.e.layout(i, i2, this.e.getRight(), i4);
        this.f.layout(this.i + i, i2, this.i + i3, i4);
        this.g.layout(this.f.getLeft() - 50, i2, this.f.getLeft(), i4);
    }

    public void a() {
        if (this.j != v.HIDING && this.j != v.SHOWING) {
            switch (b()[this.j.ordinal()]) {
                case 2:
                    this.j = v.SHOWING;
                    this.e.setVisibility(0);
                    this.k.startScroll(0, 0, this.e.getLayoutParams().width, 0, 500);
                    break;
                case 4:
                    this.j = v.HIDING;
                    this.k.startScroll(this.i, 0, -this.i, 0, 500);
                    break;
            }
            this.m.postDelayed(this.l, 16L);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int currX = this.k.getCurrX();
        a(currX - this.i);
        this.i = currX;
        invalidate();
        if (z) {
            this.m.postDelayed(this.l, 16L);
        } else {
            c();
        }
    }

    private void a(int i) {
        this.f.offsetLeftAndRight(i);
        this.e.layout(this.e.getLeft(), this.e.getTop(), this.f.getLeft(), this.e.getBottom());
        this.g.layout(this.f.getLeft() - 50, this.g.getTop(), this.f.getLeft(), this.g.getBottom());
    }

    private void c() {
        switch (b()[this.j.ordinal()]) {
            case 1:
                this.j = v.HIDDEN;
                this.e.setVisibility(8);
                break;
            case 3:
                this.j = v.SHOWN;
                break;
        }
    }

    public boolean a(View view, MotionEvent motionEvent) {
        if (this.j == v.HIDING || this.j == v.SHOWING) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        switch (motionEvent.getAction()) {
            case 0:
                this.c = rawX;
                break;
            case 1:
                if (this.d > 0.0f) {
                    this.j = v.SHOWING;
                    this.k.startScroll(this.i, 0, this.e.getLayoutParams().width - this.i, 0, 500);
                } else if (this.d <= 0.0f) {
                    this.j = v.HIDING;
                    this.k.startScroll(this.i, 0, -this.i, 0, 500);
                }
                this.m.postDelayed(this.l, 16L);
                invalidate();
                this.b = false;
                this.c = 0.0f;
                this.d = 0.0f;
                break;
            case 2:
                if (!this.b) {
                    this.b = true;
                    this.e.setVisibility(0);
                }
                int i = (int) (rawX - this.c);
                if (this.i + i <= 0) {
                    i = -this.i;
                } else if (this.i + i > this.a - h) {
                    i = (this.a - h) - this.i;
                }
                a(i);
                this.i += i;
                invalidate();
                this.c = rawX;
                this.d = i;
                break;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j == v.HIDDEN) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.o == 2) {
            return false;
        }
        if (action == 2 && this.o != 0) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.p = x;
                this.q = y;
                this.o = this.k.isFinished() ? 0 : 1;
                Rect rect = new Rect();
                this.f.getHitRect(rect);
                if (rect.contains((int) x, (int) y)) {
                    this.o = 1;
                    break;
                }
                break;
            case 1:
            case 3:
                this.o = 0;
                break;
            case 2:
                int abs = (int) Math.abs(this.p - x);
                if (((int) Math.abs(this.q - y)) > this.n) {
                    this.o = 2;
                }
                if (abs > this.n && this.o != 2) {
                    this.o = 1;
                    break;
                }
                break;
        }
        switch (this.o) {
        }
        return false;
    }
}
