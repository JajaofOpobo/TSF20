package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class e {
    private final View a;
    private final g b;
    private y c;
    private y d;
    private y e;

    e(View view, g gVar) {
        this.a = view;
        this.b = gVar;
    }

    void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListB;
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, a.k.ViewBackgroundHelper, i, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_android_background) && (colorStateListB = this.b.b(this.a.getContext(), typedArrayObtainStyledAttributes.getResourceId(a.k.ViewBackgroundHelper_android_background, -1))) != null) {
                b(colorStateListB);
            }
            if (typedArrayObtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_backgroundTint)) {
                ai.a(this.a, typedArrayObtainStyledAttributes.getColorStateList(a.k.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_backgroundTintMode)) {
                ai.a(this.a, o.a(typedArrayObtainStyledAttributes.getInt(a.k.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void a(int i) {
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
    }

    void a(Drawable drawable) {
        b((ColorStateList) null);
    }

    void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new y();
        }
        this.d.a = colorStateList;
        this.d.d = true;
        c();
    }

    ColorStateList a() {
        if (this.d != null) {
            return this.d.a;
        }
        return null;
    }

    void a(PorterDuff.Mode mode) {
        if (this.d == null) {
            this.d = new y();
        }
        this.d.b = mode;
        this.d.c = true;
        c();
    }

    PorterDuff.Mode b() {
        if (this.d != null) {
            return this.d.b;
        }
        return null;
    }

    void c() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT != 21 || !b(background)) {
                if (this.d != null) {
                    g.a(background, this.d, this.a.getDrawableState());
                } else if (this.c != null) {
                    g.a(background, this.c, this.a.getDrawableState());
                }
            }
        }
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new y();
            }
            this.c.a = colorStateList;
            this.c.d = true;
        } else {
            this.c = null;
        }
        c();
    }

    private boolean b(Drawable drawable) {
        if (this.e == null) {
            this.e = new y();
        }
        y yVar = this.e;
        yVar.a();
        ColorStateList colorStateListT = ai.t(this.a);
        if (colorStateListT != null) {
            yVar.d = true;
            yVar.a = colorStateListT;
        }
        PorterDuff.Mode modeU = ai.u(this.a);
        if (modeU != null) {
            yVar.c = true;
            yVar.b = modeU;
        }
        if (!yVar.d && !yVar.c) {
            return false;
        }
        g.a(drawable, yVar, this.a.getDrawableState());
        return true;
    }
}
