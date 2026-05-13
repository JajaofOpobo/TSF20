package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.InterfaceC0303af;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
/* renamed from: android.support.v7.widget.AppCompatAutoCompleteTextView */
/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements InterfaceC0303af {

    /* renamed from: a */
    private static final int[] f1743a = {16843126};

    /* renamed from: b */
    private C0742g f1744b;

    /* renamed from: c */
    private C0740e f1745c;

    /* renamed from: d */
    private C0751k f1746d;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1744b = C0742g.m11215a();
        C0725aa m11295a = C0725aa.m11295a(getContext(), attributeSet, f1743a, i, 0);
        if (m11295a.m11286f(0)) {
            setDropDownBackgroundDrawable(m11295a.m11300a(0));
        }
        m11295a.m11301a();
        this.f1745c = new C0740e(this, this.f1744b);
        this.f1745c.m11228a(attributeSet, i);
        this.f1746d = C0751k.m11168a(this);
        this.f1746d.mo11165a(attributeSet, i);
        this.f1746d.mo11166a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        if (this.f1744b != null) {
            setDropDownBackgroundDrawable(this.f1744b.m11211a(getContext(), i));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1745c != null) {
            this.f1745c.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1745c != null) {
            this.f1745c.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1745c != null) {
            this.f1745c.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1745c != null) {
            return this.f1745c.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1745c != null) {
            this.f1745c.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1745c != null) {
            return this.f1745c.m11227b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1745c != null) {
            this.f1745c.m11224c();
        }
        if (this.f1746d != null) {
            this.f1746d.mo11166a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1746d != null) {
            this.f1746d.m11171a(context, i);
        }
    }
}
