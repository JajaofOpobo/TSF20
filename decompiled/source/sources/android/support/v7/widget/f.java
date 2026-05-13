package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
class f {
    private final CompoundButton a;
    private final g b;
    private ColorStateList c = null;
    private PorterDuff.Mode d = null;
    private boolean e = false;
    private boolean f = false;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(CompoundButton compoundButton, g gVar) {
        this.a = compoundButton;
        this.b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, a.k.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(a.k.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(a.k.CompoundButton_android_button, 0)) != 0) {
                this.a.setButtonDrawable(this.b.a(this.a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(a.k.CompoundButton_buttonTint)) {
                android.support.v4.widget.c.a(this.a, obtainStyledAttributes.getColorStateList(a.k.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(a.k.CompoundButton_buttonTintMode)) {
                android.support.v4.widget.c.a(this.a, o.a(obtainStyledAttributes.getInt(a.k.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        this.d = mode;
        this.f = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.g) {
            this.g = false;
            return;
        }
        this.g = true;
        d();
    }

    void d() {
        Drawable a = android.support.v4.widget.c.a(this.a);
        if (a != null) {
            if (this.e || this.f) {
                Drawable mutate = android.support.v4.a.a.a.f(a).mutate();
                if (this.e) {
                    android.support.v4.a.a.a.a(mutate, this.c);
                }
                if (this.f) {
                    android.support.v4.a.a.a.a(mutate, this.d);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        Drawable a;
        if (Build.VERSION.SDK_INT < 17 && (a = android.support.v4.widget.c.a(this.a)) != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
