package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* renamed from: android.support.v7.widget.AppCompatImageButton */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements InterfaceC0303af {

    /* renamed from: a */
    private C0740e f1758a;

    /* renamed from: b */
    private C0748h f1759b;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        C0742g m11215a = C0742g.m11215a();
        this.f1758a = new C0740e(this, m11215a);
        this.f1758a.m11228a(attributeSet, i);
        this.f1759b = new C0748h(this, m11215a);
        this.f1759b.m11177a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1759b.m11178a(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1758a != null) {
            this.f1758a.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1758a != null) {
            this.f1758a.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1758a != null) {
            this.f1758a.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1758a != null) {
            return this.f1758a.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1758a != null) {
            this.f1758a.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1758a != null) {
            return this.f1758a.m11227b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1758a != null) {
            this.f1758a.m11224c();
        }
    }
}
