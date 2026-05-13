package android.support.p002v4.p003a.p004a;

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
import android.support.p002v4.p003a.p004a.C0038j;
/* renamed from: android.support.v4.a.a.n */
/* loaded from: classes.dex */
class C0047n extends C0045m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0047n(Drawable drawable) {
        super(drawable);
    }

    C0047n(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
        super(abstractC0039a, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f97c.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f97c.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f97c.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f97c.getDirtyBounds();
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j, android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintList(ColorStateList colorStateList) {
        if (mo13798c()) {
            super.setTintList(colorStateList);
        } else {
            this.f97c.setTintList(colorStateList);
        }
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j, android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTint(int i) {
        if (mo13798c()) {
            super.setTint(i);
        } else {
            this.f97c.setTint(i);
        }
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j, android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo13798c()) {
            super.setTintMode(mode);
        } else {
            this.f97c.setTintMode(mode);
        }
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: c */
    protected boolean mo13798c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f97c;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
        }
        return false;
    }

    @Override // android.support.p002v4.p003a.p004a.C0045m, android.support.p002v4.p003a.p004a.C0043l, android.support.p002v4.p003a.p004a.C0038j
    /* renamed from: b */
    C0038j.AbstractC0039a mo13799b() {
        return new C0048a(this.f96b, null);
    }

    /* renamed from: android.support.v4.a.a.n$a */
    /* loaded from: classes.dex */
    private static class C0048a extends C0038j.AbstractC0039a {
        C0048a(C0038j.AbstractC0039a abstractC0039a, Resources resources) {
            super(abstractC0039a, resources);
        }

        @Override // android.support.p002v4.p003a.p004a.C0038j.AbstractC0039a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0047n(this, resources);
        }
    }
}
