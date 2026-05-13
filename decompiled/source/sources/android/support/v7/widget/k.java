package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {
    private static final int[] b = {16842804, 16843119, 16843117, 16843120, 16843118};
    private static final int[] c = {a.C0012a.textAllCaps};
    final TextView a;
    private y d;
    private y e;
    private y f;
    private y g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new l(textView) : new k(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(TextView textView) {
        this.a = textView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        Context context = this.a.getContext();
        g a = g.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.d = a(context, a, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.e = a(context, a, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f = a(context, a, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.g = a(context, a, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, a.k.TextAppearance);
                if (obtainStyledAttributes2.hasValue(a.k.TextAppearance_textAllCaps)) {
                    z2 = obtainStyledAttributes2.getBoolean(a.k.TextAppearance_textAllCaps, false);
                    z = true;
                } else {
                    z = false;
                    z2 = false;
                }
                obtainStyledAttributes2.recycle();
            } else {
                z = false;
                z2 = false;
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, c, i, 0);
            if (obtainStyledAttributes3.hasValue(0)) {
                z2 = obtainStyledAttributes3.getBoolean(0, false);
            } else {
                z3 = z;
            }
            obtainStyledAttributes3.recycle();
            if (z3) {
                a(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c);
        if (obtainStyledAttributes.hasValue(0)) {
            a(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.a.setTransformationMethod(z ? new android.support.v7.c.a(this.a.getContext()) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.d != null || this.e != null || this.f != null || this.g != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.d);
            a(compoundDrawables[1], this.e);
            a(compoundDrawables[2], this.f);
            a(compoundDrawables[3], this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable, y yVar) {
        if (drawable != null && yVar != null) {
            g.a(drawable, yVar, this.a.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static y a(Context context, g gVar, int i) {
        ColorStateList b2 = gVar.b(context, i);
        if (b2 != null) {
            y yVar = new y();
            yVar.d = true;
            yVar.a = b2;
            return yVar;
        }
        return null;
    }
}
