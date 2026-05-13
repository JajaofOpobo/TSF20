package android.support.p000a.p001a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.p003a.p004a.InterfaceC0049o;
import android.util.AttributeSet;
@TargetApi(21)
/* renamed from: android.support.a.a.e */
/* loaded from: classes.dex */
abstract class AbstractC0010e extends Drawable implements InterfaceC0049o {

    /* renamed from: a */
    Drawable f20a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static TypedArray m13918b(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f20a != null) {
            this.f20a.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.f20a != null) {
            return C0021a.m13851e(this.f20a);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f20a != null ? this.f20a.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f20a != null) {
            this.f20a.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        if (this.f20a != null) {
            C0021a.m13863a(this.f20a, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f20a != null) {
            C0021a.m13861a(this.f20a, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.f20a != null) {
            this.f20a.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (this.f20a != null) {
            C0021a.m13864a(this.f20a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f20a != null) {
            C0021a.m13856a(this.f20a, z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f20a != null) {
            C0021a.m13855b(this.f20a);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f20a != null) {
            C0021a.m13859a(this.f20a, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        if (this.f20a != null) {
            C0021a.m13848h(this.f20a);
            return 0;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.f20a != null) {
            this.f20a.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f20a != null ? this.f20a.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f20a != null ? this.f20a.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f20a != null ? this.f20a.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f20a != null ? this.f20a.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f20a != null ? this.f20a.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f20a != null ? this.f20a.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.f20a != null) {
            this.f20a.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f20a != null ? this.f20a.setState(iArr) : super.setState(iArr);
    }
}
