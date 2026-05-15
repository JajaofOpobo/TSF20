package com.tsf.extend.base.widget.pulltorefresh;

import android.R;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends StateListDrawable {
    private Drawable a;
    private Drawable b;
    private int c = -7829368;
    private PorterDuff.Mode d = PorterDuff.Mode.MULTIPLY;
    private int[] e;
    private PorterDuff.Mode[] f;

    public e(Drawable drawable, int[] iArr, PorterDuff.Mode[] modeArr) {
        this.e = iArr;
        this.f = modeArr;
        a(drawable);
    }

    public e(Drawable drawable) {
        a(drawable);
    }

    private void a(Drawable drawable) {
        this.a = drawable;
        this.b = new ColorDrawable();
        addState(new int[]{R.attr.state_pressed}, this.b);
        addState(new int[]{R.attr.state_focused}, this.b);
        addState(new int[]{R.attr.state_enabled}, drawable);
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
        boolean zOnStateChange = super.onStateChange(iArr);
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
        return zOnStateChange;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }
}
