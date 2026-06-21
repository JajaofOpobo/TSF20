package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class b extends android.support.v7.b.a.a {
    private boolean a;

    public b(Drawable drawable) {
        super(drawable);
        this.a = true;
    }

    void a(boolean z) {
        this.a = z;
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (this.a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a) {
            super.draw(canvas);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.a) {
            super.setHotspot(f, f2);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.support.v7.b.a.a, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
