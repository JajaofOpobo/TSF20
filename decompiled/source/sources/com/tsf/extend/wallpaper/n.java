package com.tsf.extend.wallpaper;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* loaded from: classes.dex */
public class n extends StateListDrawable {
    private Drawable a;
    private Drawable b;
    private int c;
    private PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    private int[] e;
    private PorterDuff.Mode[] f;

    public n(Drawable drawable, int i) {
        this.c = -7829368;
        this.c = i;
        a(drawable);
    }

    private void a(Drawable drawable) {
        this.a = drawable;
        this.b = new ColorDrawable();
        addState(new int[]{16842913}, this.b);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.a != null) {
            this.a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a != null) {
            if (getCurrent() == this.b) {
                if (this.e != null) {
                    this.a.setColorFilter(this.e[1], this.f[1]);
                } else {
                    this.a.setColorFilter(this.c, this.d);
                }
            } else if (this.e != null) {
                this.a.setColorFilter(this.e[0], this.f[0]);
            } else {
                this.a.clearColorFilter();
            }
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }
}
