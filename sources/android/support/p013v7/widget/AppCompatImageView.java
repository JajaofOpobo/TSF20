package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: android.support.v7.widget.AppCompatImageView */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC0303af {

    /* renamed from: a */
    private C0740e f1760a;

    /* renamed from: b */
    private C0748h f1761b;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        C0742g m11215a = C0742g.m11215a();
        this.f1760a = new C0740e(this, m11215a);
        this.f1760a.m11228a(attributeSet, i);
        this.f1761b = new C0748h(this, m11215a);
        this.f1761b.m11177a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1761b.m11178a(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1760a != null) {
            this.f1760a.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1760a != null) {
            this.f1760a.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1760a != null) {
            this.f1760a.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1760a != null) {
            return this.f1760a.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1760a != null) {
            this.f1760a.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1760a != null) {
            return this.f1760a.m11227b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1760a != null) {
            this.f1760a.m11224c();
        }
    }
}
