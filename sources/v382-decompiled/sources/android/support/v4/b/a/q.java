package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class q extends p {
    q(Drawable drawable) {
        super(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.b.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.b.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.v4.b.a.n, android.graphics.drawable.Drawable, android.support.v4.b.a.m
    public void setTint(int i) {
        this.b.setTint(i);
    }

    @Override // android.support.v4.b.a.n, android.graphics.drawable.Drawable, android.support.v4.b.a.m
    public void setTintList(ColorStateList colorStateList) {
        this.b.setTintList(colorStateList);
    }

    @Override // android.support.v4.b.a.n, android.graphics.drawable.Drawable, android.support.v4.b.a.m
    public void setTintMode(PorterDuff.Mode mode) {
        this.b.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.b.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.b.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.b.getDirtyBounds();
    }
}
