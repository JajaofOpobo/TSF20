package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.widget.InterfaceC0477ab;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* renamed from: android.support.v7.widget.AppCompatRadioButton */
/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements InterfaceC0477ab {

    /* renamed from: a */
    private C0742g f1771a;

    /* renamed from: b */
    private C0741f f1772b;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1771a = C0742g.m11215a();
        this.f1772b = new C0741f(this, this.f1771a);
        this.f1772b.m11219a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f1772b != null) {
            this.f1772b.m11217c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(this.f1771a != null ? this.f1771a.m11211a(getContext(), i) : C0144a.m13403a(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f1772b != null ? this.f1772b.m11222a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // android.support.p002v4.widget.InterfaceC0477ab
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f1772b != null) {
            this.f1772b.m11221a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f1772b != null) {
            return this.f1772b.m11223a();
        }
        return null;
    }

    @Override // android.support.p002v4.widget.InterfaceC0477ab
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f1772b != null) {
            this.f1772b.m11220a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f1772b != null) {
            return this.f1772b.m11218b();
        }
        return null;
    }
}
