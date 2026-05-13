package com.tsf.extend.wallpaper;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* renamed from: com.tsf.extend.wallpaper.n */
/* loaded from: classes.dex */
public class C2096n extends StateListDrawable {

    /* renamed from: a */
    private Drawable f6863a;

    /* renamed from: b */
    private Drawable f6864b;

    /* renamed from: c */
    private int f6865c;

    /* renamed from: d */
    private PorterDuff.Mode f6866d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    private int[] f6867e;

    /* renamed from: f */
    private PorterDuff.Mode[] f6868f;

    public C2096n(Drawable drawable, int i) {
        this.f6865c = -7829368;
        this.f6865c = i;
        m6421a(drawable);
    }

    /* renamed from: a */
    private void m6421a(Drawable drawable) {
        this.f6863a = drawable;
        this.f6864b = new ColorDrawable();
        addState(new int[]{16842913}, this.f6864b);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.f6863a != null) {
            this.f6863a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f6863a != null) {
            if (getCurrent() == this.f6864b) {
                if (this.f6867e != null) {
                    this.f6863a.setColorFilter(this.f6867e[1], this.f6868f[1]);
                } else {
                    this.f6863a.setColorFilter(this.f6865c, this.f6866d);
                }
            } else if (this.f6867e != null) {
                this.f6863a.setColorFilter(this.f6867e[0], this.f6868f[0]);
            } else {
                this.f6863a.clearColorFilter();
            }
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6863a.draw(canvas);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6863a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6863a.getIntrinsicWidth();
    }
}
