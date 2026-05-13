package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: android.support.v7.widget.ActionBarContainer */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f1606a;

    /* renamed from: b */
    Drawable f1607b;

    /* renamed from: c */
    Drawable f1608c;

    /* renamed from: d */
    boolean f1609d;

    /* renamed from: e */
    boolean f1610e;

    /* renamed from: f */
    private boolean f1611f;

    /* renamed from: g */
    private View f1612g;

    /* renamed from: h */
    private View f1613h;

    /* renamed from: i */
    private View f1614i;

    /* renamed from: j */
    private int f1615j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(Build.VERSION.SDK_INT >= 21 ? new C0732c(this) : new C0731b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ActionBar);
        this.f1606a = obtainStyledAttributes.getDrawable(C0535a.C0546k.ActionBar_background);
        this.f1607b = obtainStyledAttributes.getDrawable(C0535a.C0546k.ActionBar_backgroundStacked);
        this.f1615j = obtainStyledAttributes.getDimensionPixelSize(C0535a.C0546k.ActionBar_height, -1);
        if (getId() == C0535a.C0541f.split_action_bar) {
            this.f1609d = true;
            this.f1608c = obtainStyledAttributes.getDrawable(C0535a.C0546k.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(this.f1609d ? this.f1608c == null : this.f1606a == null && this.f1607b == null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1613h = findViewById(C0535a.C0541f.action_bar);
        this.f1614i = findViewById(C0535a.C0541f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1606a != null) {
            this.f1606a.setCallback(null);
            unscheduleDrawable(this.f1606a);
        }
        this.f1606a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1613h != null) {
                this.f1606a.setBounds(this.f1613h.getLeft(), this.f1613h.getTop(), this.f1613h.getRight(), this.f1613h.getBottom());
            }
        }
        if (this.f1609d) {
            if (this.f1608c != null) {
                z = false;
            }
        } else if (this.f1606a != null || this.f1607b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1607b != null) {
            this.f1607b.setCallback(null);
            unscheduleDrawable(this.f1607b);
        }
        this.f1607b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1610e && this.f1607b != null) {
                this.f1607b.setBounds(this.f1612g.getLeft(), this.f1612g.getTop(), this.f1612g.getRight(), this.f1612g.getBottom());
            }
        }
        if (this.f1609d) {
            if (this.f1608c != null) {
                z = false;
            }
        } else if (this.f1606a != null || this.f1607b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f1608c != null) {
            this.f1608c.setCallback(null);
            unscheduleDrawable(this.f1608c);
        }
        this.f1608c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1609d && this.f1608c != null) {
                this.f1608c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f1609d) {
            if (this.f1608c != null) {
                z = false;
            }
        } else if (this.f1606a != null || this.f1607b != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f1606a != null) {
            this.f1606a.setVisible(z, false);
        }
        if (this.f1607b != null) {
            this.f1607b.setVisible(z, false);
        }
        if (this.f1608c != null) {
            this.f1608c.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1606a && !this.f1609d) || (drawable == this.f1607b && this.f1610e) || ((drawable == this.f1608c && this.f1609d) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1606a != null && this.f1606a.isStateful()) {
            this.f1606a.setState(getDrawableState());
        }
        if (this.f1607b != null && this.f1607b.isStateful()) {
            this.f1607b.setState(getDrawableState());
        }
        if (this.f1608c != null && this.f1608c.isStateful()) {
            this.f1608c.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f1606a != null) {
                this.f1606a.jumpToCurrentState();
            }
            if (this.f1607b != null) {
                this.f1607b.jumpToCurrentState();
            }
            if (this.f1608c != null) {
                this.f1608c.jumpToCurrentState();
            }
        }
    }

    public void setTransitioning(boolean z) {
        this.f1611f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1611f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setTabContainer(C0763t c0763t) {
        if (this.f1612g != null) {
            removeView(this.f1612g);
        }
        this.f1612g = c0763t;
        if (c0763t != null) {
            addView(c0763t);
            ViewGroup.LayoutParams layoutParams = c0763t.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0763t.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f1612g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* renamed from: a */
    private boolean m11666a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m11665b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + view.getMeasuredHeight() + layoutParams.topMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f1613h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f1615j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f1615j, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1613h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.f1612g != null && this.f1612g.getVisibility() != 8 && mode != 1073741824) {
                if (!m11666a(this.f1613h)) {
                    i3 = m11665b(this.f1613h);
                } else if (!m11666a(this.f1614i)) {
                    i3 = m11665b(this.f1614i);
                } else {
                    i3 = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m11665b(this.f1612g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3 = true;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1612g;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1609d) {
            if (this.f1608c != null) {
                this.f1608c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1606a != null) {
                if (this.f1613h.getVisibility() == 0) {
                    this.f1606a.setBounds(this.f1613h.getLeft(), this.f1613h.getTop(), this.f1613h.getRight(), this.f1613h.getBottom());
                } else if (this.f1614i != null && this.f1614i.getVisibility() == 0) {
                    this.f1606a.setBounds(this.f1614i.getLeft(), this.f1614i.getTop(), this.f1614i.getRight(), this.f1614i.getBottom());
                } else {
                    this.f1606a.setBounds(0, 0, 0, 0);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f1610e = z4;
            if (!z4 || this.f1607b == null) {
                z3 = z2;
            } else {
                this.f1607b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }
}
