package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.EditText;
/* renamed from: android.support.v7.widget.AppCompatEditText */
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0303af {

    /* renamed from: a */
    private C0742g f1755a;

    /* renamed from: b */
    private C0740e f1756b;

    /* renamed from: c */
    private C0751k f1757c;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1755a = C0742g.m11215a();
        this.f1756b = new C0740e(this, this.f1755a);
        this.f1756b.m11228a(attributeSet, i);
        this.f1757c = C0751k.m11168a(this);
        this.f1757c.mo11165a(attributeSet, i);
        this.f1757c.mo11166a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1756b != null) {
            this.f1756b.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1756b != null) {
            this.f1756b.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1756b != null) {
            this.f1756b.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1756b != null) {
            return this.f1756b.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1756b != null) {
            this.f1756b.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1756b != null) {
            return this.f1756b.m11227b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1756b != null) {
            this.f1756b.m11224c();
        }
        if (this.f1757c != null) {
            this.f1757c.mo11166a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1757c != null) {
            this.f1757c.m11171a(context, i);
        }
    }
}
