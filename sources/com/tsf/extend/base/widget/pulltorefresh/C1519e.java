package com.tsf.extend.base.widget.pulltorefresh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.e */
/* loaded from: classes.dex */
public class C1519e extends StateListDrawable {

    /* renamed from: a */
    private Drawable f4779a;

    /* renamed from: b */
    private Drawable f4780b;

    /* renamed from: c */
    private int f4781c = -7829368;

    /* renamed from: d */
    private PorterDuff.Mode f4782d = PorterDuff.Mode.MULTIPLY;

    /* renamed from: e */
    private int[] f4783e;

    /* renamed from: f */
    private PorterDuff.Mode[] f4784f;

    public C1519e(Drawable drawable, int[] iArr, PorterDuff.Mode[] modeArr) {
        this.f4783e = iArr;
        this.f4784f = modeArr;
        m8339a(drawable);
    }

    public C1519e(Drawable drawable) {
        m8339a(drawable);
    }

    /* renamed from: a */
    private void m8339a(Drawable drawable) {
        this.f4779a = drawable;
        this.f4780b = new ColorDrawable();
        addState(new int[]{16842919}, this.f4780b);
        addState(new int[]{16842908}, this.f4780b);
        addState(new int[]{16842910}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.f4779a != null) {
            this.f4779a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f4779a != null) {
            if (getCurrent() == this.f4780b) {
                if (this.f4783e != null) {
                    this.f4779a.setColorFilter(this.f4783e[1], this.f4784f[1]);
                } else {
                    this.f4779a.setColorFilter(this.f4781c, this.f4782d);
                }
            } else if (this.f4783e != null) {
                this.f4779a.setColorFilter(this.f4783e[0], this.f4784f[0]);
            } else {
                this.f4779a.clearColorFilter();
            }
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f4779a.draw(canvas);
    }
}
