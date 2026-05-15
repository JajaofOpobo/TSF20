package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class k {
    private static final int[] b = {R.attr.textAppearance, R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom};
    private static final int[] c = {a.C0012a.textAllCaps};
    final TextView a;
    private y d;
    private y e;
    private y f;
    private y g;

    static k a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new l(textView) : new k(textView);
    }

    k(TextView textView) {
        this.a = textView;
    }

    void a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        Context context = this.a.getContext();
        g gVarA = g.a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.d = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.e = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.g = a(context, gVarA, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, a.k.TextAppearance);
                if (typedArrayObtainStyledAttributes2.hasValue(a.k.TextAppearance_textAllCaps)) {
                    z2 = typedArrayObtainStyledAttributes2.getBoolean(a.k.TextAppearance_textAllCaps, false);
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                typedArrayObtainStyledAttributes2.recycle();
            } else {
                z = false;
                z2 = false;
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, c, i, 0);
            if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                z2 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
            } else {
                z3 = z;
            }
            typedArrayObtainStyledAttributes3.recycle();
            if (z3) {
                a(z2);
            }
        }
    }

    void a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, c);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            a(typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    void a(boolean z) {
        this.a.setTransformationMethod(z ? new android.support.v7.c.a(this.a.getContext()) : null);
    }

    void a() {
        if (this.d != null || this.e != null || this.f != null || this.g != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.d);
            a(compoundDrawables[1], this.e);
            a(compoundDrawables[2], this.f);
            a(compoundDrawables[3], this.g);
        }
    }

    final void a(Drawable drawable, y yVar) {
        if (drawable != null && yVar != null) {
            g.a(drawable, yVar, this.a.getDrawableState());
        }
    }

    protected static y a(Context context, g gVar, int i) {
        ColorStateList colorStateListB = gVar.b(context, i);
        if (colorStateListB == null) {
            return null;
        }
        y yVar = new y();
        yVar.d = true;
        yVar.a = colorStateListB;
        return yVar;
    }
}
