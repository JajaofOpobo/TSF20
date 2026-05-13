package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
/* loaded from: classes.dex */
public class SildingMenuLayout extends LinearLayout {

    /* renamed from: h */
    private static int f12595h = 15;

    /* renamed from: a */
    int f12596a;

    /* renamed from: b */
    boolean f12597b;

    /* renamed from: c */
    float f12598c;

    /* renamed from: d */
    float f12599d;

    /* renamed from: e */
    private View f12600e;

    /* renamed from: f */
    private View f12601f;

    /* renamed from: g */
    private View f12602g;

    /* renamed from: i */
    private int f12603i;

    /* renamed from: j */
    private EnumC3843c f12604j;

    /* renamed from: k */
    private Scroller f12605k;

    /* renamed from: l */
    private Runnable f12606l;

    /* renamed from: m */
    private Handler f12607m;

    /* renamed from: n */
    private int f12608n;

    /* renamed from: o */
    private int f12609o;

    /* renamed from: p */
    private float f12610p;

    /* renamed from: q */
    private float f12611q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.plugin.themepicker.SildingMenuLayout$c */
    /* loaded from: classes.dex */
    public enum EnumC3843c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.SildingMenuLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3844d {
        /* renamed from: h */
        void mo1001h();
    }

    public SildingMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12603i = 0;
        this.f12604j = EnumC3843c.HIDDEN;
        this.f12605k = new Scroller(getContext(), new animationInterpolatorC3841a());
        this.f12606l = new RunnableC3842b();
        this.f12607m = new Handler();
        this.f12597b = false;
        this.f12598c = 0.0f;
        this.f12599d = 0.0f;
        this.f12609o = 0;
    }

    public SildingMenuLayout(Context context) {
        super(context);
        this.f12603i = 0;
        this.f12604j = EnumC3843c.HIDDEN;
        this.f12605k = new Scroller(getContext(), new animationInterpolatorC3841a());
        this.f12606l = new RunnableC3842b();
        this.f12607m = new Handler();
        this.f12597b = false;
        this.f12598c = 0.0f;
        this.f12599d = 0.0f;
        this.f12609o = 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12596a = View.MeasureSpec.getSize(i);
        f12595h = (this.f12596a * 10) / 100;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12600e = getChildAt(0);
        this.f12601f = getChildAt(1);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.shell.plugin.themepicker.SildingMenuLayout.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return SildingMenuLayout.this.m1335a(view, motionEvent);
            }
        });
        this.f12600e.setVisibility(8);
        this.f12602g = getChildAt(2);
        this.f12608n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            i4 -= i2;
            i2 = 0;
        }
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12601f.getLayoutParams();
            layoutParams.height = getHeight();
            layoutParams.width = getWidth();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f12600e.getLayoutParams();
            layoutParams2.height = getHeight();
            layoutParams2.width = getWidth() - f12595h;
        }
        this.f12600e.layout(i, i2, this.f12600e.getRight(), i4);
        this.f12601f.layout(this.f12603i + i, i2, this.f12603i + i3, i4);
        this.f12602g.layout(this.f12601f.getLeft() - 50, i2, this.f12601f.getLeft(), i4);
    }

    /* renamed from: a */
    public void m1337a() {
        if (this.f12604j != EnumC3843c.HIDING && this.f12604j != EnumC3843c.SHOWING) {
            switch (this.f12604j) {
                case HIDDEN:
                    this.f12604j = EnumC3843c.SHOWING;
                    this.f12600e.setVisibility(0);
                    this.f12605k.startScroll(0, 0, this.f12600e.getLayoutParams().width, 0, 500);
                    break;
                case SHOWN:
                    this.f12604j = EnumC3843c.HIDING;
                    this.f12605k.startScroll(this.f12603i, 0, -this.f12603i, 0, 500);
                    break;
            }
            this.f12607m.postDelayed(this.f12606l, 16L);
            invalidate();
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.SildingMenuLayout$b */
    /* loaded from: classes.dex */
    protected class RunnableC3842b implements Runnable {
        protected RunnableC3842b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SildingMenuLayout.this.m1332a(SildingMenuLayout.this.f12605k.computeScrollOffset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1332a(boolean z) {
        int currX = this.f12605k.getCurrX();
        m1336a(currX - this.f12603i);
        this.f12603i = currX;
        invalidate();
        if (z) {
            this.f12607m.postDelayed(this.f12606l, 16L);
        } else {
            m1331b();
        }
    }

    /* renamed from: a */
    private void m1336a(int i) {
        this.f12601f.offsetLeftAndRight(i);
        this.f12600e.layout(this.f12600e.getLeft(), this.f12600e.getTop(), this.f12601f.getLeft(), this.f12600e.getBottom());
        this.f12602g.layout(this.f12601f.getLeft() - 50, this.f12602g.getTop(), this.f12601f.getLeft(), this.f12602g.getBottom());
    }

    /* renamed from: b */
    private void m1331b() {
        switch (this.f12604j) {
            case SHOWING:
                this.f12604j = EnumC3843c.SHOWN;
                return;
            case HIDING:
                this.f12604j = EnumC3843c.HIDDEN;
                this.f12600e.setVisibility(8);
                return;
            default:
                return;
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.SildingMenuLayout$a  reason: invalid class name */
    /* loaded from: classes.dex */
    protected class animationInterpolatorC3841a implements Interpolator {
        protected animationInterpolatorC3841a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) Math.pow(f - 1.0f, 5.0d)) + 1.0f;
        }
    }

    /* renamed from: a */
    public boolean m1335a(View view, MotionEvent motionEvent) {
        if (this.f12604j == EnumC3843c.HIDING || this.f12604j == EnumC3843c.SHOWING) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        switch (motionEvent.getAction()) {
            case 0:
                this.f12598c = rawX;
                return true;
            case 1:
                if (this.f12599d > 0.0f) {
                    this.f12604j = EnumC3843c.SHOWING;
                    this.f12605k.startScroll(this.f12603i, 0, this.f12600e.getLayoutParams().width - this.f12603i, 0, 500);
                } else if (this.f12599d <= 0.0f) {
                    this.f12604j = EnumC3843c.HIDING;
                    this.f12605k.startScroll(this.f12603i, 0, -this.f12603i, 0, 500);
                }
                this.f12607m.postDelayed(this.f12606l, 16L);
                invalidate();
                this.f12597b = false;
                this.f12598c = 0.0f;
                this.f12599d = 0.0f;
                return true;
            case 2:
                if (!this.f12597b) {
                    this.f12597b = true;
                    this.f12600e.setVisibility(0);
                }
                int i = (int) (rawX - this.f12598c);
                if (this.f12603i + i <= 0) {
                    i = -this.f12603i;
                } else if (this.f12603i + i > this.f12596a - f12595h) {
                    i = (this.f12596a - f12595h) - this.f12603i;
                }
                m1336a(i);
                this.f12603i += i;
                invalidate();
                this.f12598c = rawX;
                this.f12599d = i;
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12604j != EnumC3843c.HIDDEN) {
            int action = motionEvent.getAction();
            if (action == 2 && this.f12609o == 2) {
                return false;
            }
            if (action != 2 || this.f12609o == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                switch (action) {
                    case 0:
                        this.f12610p = x;
                        this.f12611q = y;
                        this.f12609o = this.f12605k.isFinished() ? 0 : 1;
                        Rect rect = new Rect();
                        this.f12601f.getHitRect(rect);
                        if (rect.contains((int) x, (int) y)) {
                            this.f12609o = 1;
                            break;
                        }
                        break;
                    case 1:
                    case 3:
                        this.f12609o = 0;
                        break;
                    case 2:
                        int abs = (int) Math.abs(this.f12610p - x);
                        if (((int) Math.abs(this.f12611q - y)) > this.f12608n) {
                            this.f12609o = 2;
                        }
                        if (abs > this.f12608n && this.f12609o != 2) {
                            this.f12609o = 1;
                            break;
                        }
                        break;
                }
                switch (this.f12609o) {
                    case 0:
                    case 2:
                    default:
                        return false;
                    case 1:
                        return true;
                }
            }
            return true;
        }
        return false;
    }
}
