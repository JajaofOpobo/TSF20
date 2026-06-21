package android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
class d {
    private static final ThreadLocal a = new ThreadLocal();
    private static final int[] b = {-16842910};
    private static final int[] c = new int[0];
    private static final int[] d = new int[1];

    static int a(Context context, int i) {
        d[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, d);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static ColorStateList b(Context context, int i) {
        d[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, d);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static int c(Context context, int i) {
        ColorStateList b2 = b(context, i);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(b, b2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, a2, true);
        return a(context, i, a2.getFloat());
    }

    private static TypedValue a() {
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    static int a(Context context, int i, float f) {
        return android.support.v4.b.a.a(a(context, i), Math.round(Color.alpha(r0) * f));
    }
}
