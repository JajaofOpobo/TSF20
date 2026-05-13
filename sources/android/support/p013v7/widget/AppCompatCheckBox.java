package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.widget.InterfaceC0477ab;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* renamed from: android.support.v7.widget.AppCompatCheckBox */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC0477ab {

    /* renamed from: a */
    private C0742g f1750a;

    /* renamed from: b */
    private C0741f f1751b;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0772x.m11063a(context), attributeSet, i);
        this.f1750a = C0742g.m11215a();
        this.f1751b = new C0741f(this, this.f1750a);
        this.f1751b.m11219a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f1751b != null) {
            this.f1751b.m11217c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(this.f1750a != null ? this.f1750a.m11211a(getContext(), i) : C0144a.m13403a(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f1751b != null ? this.f1751b.m11222a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // android.support.p002v4.widget.InterfaceC0477ab
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f1751b != null) {
            this.f1751b.m11221a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f1751b != null) {
            return this.f1751b.m11223a();
        }
        return null;
    }

    @Override // android.support.p002v4.widget.InterfaceC0477ab
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f1751b != null) {
            this.f1751b.m11220a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f1751b != null) {
            return this.f1751b.m11218b();
        }
        return null;
    }
}
