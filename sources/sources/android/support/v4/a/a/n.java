package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.v4.a.a.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class n extends m {
    n(Drawable drawable) {
        super(drawable);
    }

    n(j.a aVar, Resources resources) {
        super(aVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    @Override // android.support.v4.a.a.j, android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.support.v4.a.a.j, android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    @Override // android.support.v4.a.a.j, android.graphics.drawable.Drawable, android.support.v4.a.a.o
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    @Override // android.support.v4.a.a.j, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.support.v4.a.a.j
    protected boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
    }

    @Override // android.support.v4.a.a.m, android.support.v4.a.a.l, android.support.v4.a.a.j
    j.a b() {
        return new a(this.b, null);
    }

    private static class a extends j.a {
        a(j.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.a.a.j.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new n(this, resources);
        }
    }
}
