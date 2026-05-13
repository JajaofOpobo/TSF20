package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.p002v4.p003a.C0020a;
import android.util.AttributeSet;
import android.util.TypedValue;
/* renamed from: android.support.v7.widget.v */
/* loaded from: classes.dex */
class C0770v {

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f2233i = new ThreadLocal<>();

    /* renamed from: a */
    static final int[] f2225a = {-16842910};

    /* renamed from: b */
    static final int[] f2226b = {16842908};

    /* renamed from: c */
    static final int[] f2227c = {16843518};

    /* renamed from: d */
    static final int[] f2228d = {16842919};

    /* renamed from: e */
    static final int[] f2229e = {16842912};

    /* renamed from: f */
    static final int[] f2230f = {16842913};

    /* renamed from: g */
    static final int[] f2231g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f2232h = new int[0];

    /* renamed from: j */
    private static final int[] f2234j = new int[1];

    /* renamed from: a */
    public static int m11069a(Context context, int i) {
        f2234j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f2234j);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static ColorStateList m11067b(Context context, int i) {
        f2234j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f2234j);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static int m11066c(Context context, int i) {
        ColorStateList m11067b = m11067b(context, i);
        if (m11067b != null && m11067b.isStateful()) {
            return m11067b.getColorForState(f2225a, m11067b.getDefaultColor());
        }
        TypedValue m11070a = m11070a();
        context.getTheme().resolveAttribute(16842803, m11070a, true);
        return m11068a(context, i, m11070a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m11070a() {
        TypedValue typedValue = f2233i.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f2233i.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m11068a(Context context, int i, float f) {
        int m11069a = m11069a(context, i);
        return C0020a.m13866b(m11069a, Math.round(Color.alpha(m11069a) * f));
    }
}
