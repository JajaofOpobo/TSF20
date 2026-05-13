package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.util.AttributeSet;
import android.widget.TextView;
/* renamed from: android.support.v7.widget.AppCompatTextView */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0303af {

    /* renamed from: a */
    private C0742g f1802a;

    /* renamed from: b */
    private C0740e f1803b;

    /* renamed from: c */
    private C0751k f1804c;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1802a = C0742g.m11215a();
        this.f1803b = new C0740e(this, this.f1802a);
        this.f1803b.m11228a(attributeSet, i);
        this.f1804c = C0751k.m11168a(this);
        this.f1804c.mo11165a(attributeSet, i);
        this.f1804c.mo11166a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1803b != null) {
            this.f1803b.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1803b != null) {
            this.f1803b.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1803b != null) {
            this.f1803b.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1803b != null) {
            return this.f1803b.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1803b != null) {
            this.f1803b.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1803b != null) {
            return this.f1803b.m11227b();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1804c != null) {
            this.f1804c.m11171a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1803b != null) {
            this.f1803b.m11224c();
        }
        if (this.f1804c != null) {
            this.f1804c.mo11166a();
        }
    }
}
