package android.support.p002v4.p003a.p004a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* renamed from: android.support.v4.a.a.j */
/* loaded from: classes.dex */
class C0038j extends Drawable implements Drawable.Callback, InterfaceC0037i, InterfaceC0049o {

    /* renamed from: a */
    static final PorterDuff.Mode f95a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    AbstractC0039a f96b;

    /* renamed from: c */
    Drawable f97c;

    /* renamed from: d */
    private int f98d;

    /* renamed from: e */
    private PorterDuff.Mode f99e;

    /* renamed from: f */
    private boolean f100f;

    /* renamed from: g */
    private boolean f101g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0038j(AbstractC0039a abstractC0039a, Resources resources) {
        this.f96b = abstractC0039a;
        m13804a(resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0038j(Drawable drawable) {
        this.f96b = mo13799b();
        mo13803a(drawable);
    }

    /* renamed from: a */
    private void m13804a(Resources resources) {
        if (this.f96b != null && this.f96b.f103b != null) {
            mo13803a(mo13800a(this.f96b.f103b, resources));
        }
    }

    /* renamed from: a */
    protected Drawable mo13800a(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f97c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f97c != null) {
            this.f97c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f97c.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return (this.f96b != null ? this.f96b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.f97c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f97c.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f97c.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f97c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f97c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = (!mo13798c() || this.f96b == null) ? null : this.f96b.f104c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f97c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m13802a(iArr) || this.f97c.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f97c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f97c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f97c.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f97c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f97c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f97c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f97c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f97c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f97c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f97c.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f96b == null || !this.f96b.m13801a()) {
            return null;
        }
        this.f96b.f102a = getChangingConfigurations();
        return this.f96b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f101g && super.mutate() == this) {
            this.f96b = mo13799b();
            if (this.f97c != null) {
                this.f97c.mutate();
            }
            if (this.f96b != null) {
                this.f96b.f103b = this.f97c != null ? this.f97c.getConstantState() : null;
            }
            this.f101g = true;
        }
        return this;
    }

    /* renamed from: b */
    AbstractC0039a mo13799b() {
        return new C0040b(this.f96b, null);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f97c.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintList(ColorStateList colorStateList) {
        this.f96b.f104c = colorStateList;
        m13802a(getState());
    }

    @Override // android.graphics.drawable.Drawable, android.support.p002v4.p003a.p004a.InterfaceC0049o
    public void setTintMode(PorterDuff.Mode mode) {
        this.f96b.f105d = mode;
        m13802a(getState());
    }

    /* renamed from: a */
    private boolean m13802a(int[] iArr) {
        if (mo13798c()) {
            ColorStateList colorStateList = this.f96b.f104c;
            PorterDuff.Mode mode = this.f96b.f105d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (this.f100f && colorForState == this.f98d && mode == this.f99e) {
                    return false;
                }
                setColorFilter(colorForState, mode);
                this.f98d = colorForState;
                this.f99e = mode;
                this.f100f = true;
                return true;
            }
            this.f100f = false;
            clearColorFilter();
            return false;
        }
        return false;
    }

    @Override // android.support.p002v4.p003a.p004a.InterfaceC0037i
    /* renamed from: a */
    public final Drawable mo13805a() {
        return this.f97c;
    }

    @Override // android.support.p002v4.p003a.p004a.InterfaceC0037i
    /* renamed from: a */
    public final void mo13803a(Drawable drawable) {
        if (this.f97c != null) {
            this.f97c.setCallback(null);
        }
        this.f97c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (this.f96b != null) {
                this.f96b.f103b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    protected boolean mo13798c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v4.a.a.j$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0039a extends Drawable.ConstantState {

        /* renamed from: a */
        int f102a;

        /* renamed from: b */
        Drawable.ConstantState f103b;

        /* renamed from: c */
        ColorStateList f104c;

        /* renamed from: d */
        PorterDuff.Mode f105d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0039a(AbstractC0039a abstractC0039a, Resources resources) {
            this.f104c = null;
            this.f105d = C0038j.f95a;
            if (abstractC0039a != null) {
                this.f102a = abstractC0039a.f102a;
                this.f103b = abstractC0039a.f103b;
                this.f104c = abstractC0039a.f104c;
                this.f105d = abstractC0039a.f105d;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return (this.f103b != null ? this.f103b.getChangingConfigurations() : 0) | this.f102a;
        }

        /* renamed from: a */
        boolean m13801a() {
            return this.f103b != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.a.a.j$b */
    /* loaded from: classes.dex */
    public static class C0040b extends AbstractC0039a {
        C0040b(AbstractC0039a abstractC0039a, Resources resources) {
            super(abstractC0039a, resources);
        }

        @Override // android.support.p002v4.p003a.p004a.C0038j.AbstractC0039a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0038j(this, resources);
        }
    }
}
