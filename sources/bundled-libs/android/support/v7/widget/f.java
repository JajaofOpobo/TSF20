package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class f {
    private final CompoundButton a;
    private final g b;
    private ColorStateList c = null;
    private PorterDuff.Mode d = null;
    private boolean e = false;
    private boolean f = false;
    private boolean g;

    f(CompoundButton compoundButton, g gVar) {
        this.a = compoundButton;
        this.b = gVar;
    }

    void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, a.k.CompoundButton, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(a.k.CompoundButton_android_button) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(a.k.CompoundButton_android_button, 0)) != 0) {
                this.a.setButtonDrawable(this.b.a(this.a.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(a.k.CompoundButton_buttonTint)) {
                android.support.v4.widget.c.a(this.a, typedArrayObtainStyledAttributes.getColorStateList(a.k.CompoundButton_buttonTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(a.k.CompoundButton_buttonTintMode)) {
                android.support.v4.widget.c.a(this.a, o.a(typedArrayObtainStyledAttributes.getInt(a.k.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        d();
    }

    ColorStateList a() {
        return this.c;
    }

    void a(PorterDuff.Mode mode) {
        this.d = mode;
        this.f = true;
        d();
    }

    PorterDuff.Mode b() {
        return this.d;
    }

    void c() {
        if (this.g) {
            this.g = false;
        } else {
            this.g = true;
            d();
        }
    }

    void d() {
        Drawable drawableA = android.support.v4.widget.c.a(this.a);
        if (drawableA != null) {
            if (this.e || this.f) {
                Drawable drawableMutate = android.support.v4.a.a.a.f(drawableA).mutate();
                if (this.e) {
                    android.support.v4.a.a.a.a(drawableMutate, this.c);
                }
                if (this.f) {
                    android.support.v4.a.a.a.a(drawableMutate, this.d);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int a(int i) {
        Drawable drawableA;
        if (Build.VERSION.SDK_INT < 17 && (drawableA = android.support.v4.widget.c.a(this.a)) != null) {
            return i + drawableA.getIntrinsicWidth();
        }
        return i;
    }
}
