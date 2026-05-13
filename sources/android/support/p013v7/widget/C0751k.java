package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.p017c.C0604a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.k */
/* loaded from: classes.dex */
public class C0751k {

    /* renamed from: b */
    private static final int[] f2158b = {16842804, 16843119, 16843117, 16843120, 16843118};

    /* renamed from: c */
    private static final int[] f2159c = {C0535a.C0536a.textAllCaps};

    /* renamed from: a */
    final TextView f2160a;

    /* renamed from: d */
    private C0773y f2161d;

    /* renamed from: e */
    private C0773y f2162e;

    /* renamed from: f */
    private C0773y f2163f;

    /* renamed from: g */
    private C0773y f2164g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0751k m11168a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new C0752l(textView) : new C0751k(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0751k(TextView textView) {
        this.f2160a = textView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11165a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        Context context = this.f2160a.getContext();
        C0742g m11215a = C0742g.m11215a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2158b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2161d = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.f2162e = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2163f = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f2164g = m11170a(context, m11215a, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        if (!(this.f2160a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C0535a.C0546k.TextAppearance);
                if (obtainStyledAttributes2.hasValue(C0535a.C0546k.TextAppearance_textAllCaps)) {
                    z2 = obtainStyledAttributes2.getBoolean(C0535a.C0546k.TextAppearance_textAllCaps, false);
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
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2159c, i, 0);
            if (obtainStyledAttributes3.hasValue(0)) {
                z2 = obtainStyledAttributes3.getBoolean(0, false);
            } else {
                z3 = z;
            }
            obtainStyledAttributes3.recycle();
            if (z3) {
                m11167a(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11171a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f2159c);
        if (obtainStyledAttributes.hasValue(0)) {
            m11167a(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11167a(boolean z) {
        this.f2160a.setTransformationMethod(z ? new C0604a(this.f2160a.getContext()) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11166a() {
        if (this.f2161d != null || this.f2162e != null || this.f2163f != null || this.f2164g != null) {
            Drawable[] compoundDrawables = this.f2160a.getCompoundDrawables();
            m11169a(compoundDrawables[0], this.f2161d);
            m11169a(compoundDrawables[1], this.f2162e);
            m11169a(compoundDrawables[2], this.f2163f);
            m11169a(compoundDrawables[3], this.f2164g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m11169a(Drawable drawable, C0773y c0773y) {
        if (drawable != null && c0773y != null) {
            C0742g.m11201a(drawable, c0773y, this.f2160a.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C0773y m11170a(Context context, C0742g c0742g, int i) {
        ColorStateList m11195b = c0742g.m11195b(context, i);
        if (m11195b != null) {
            C0773y c0773y = new C0773y();
            c0773y.f2241d = true;
            c0773y.f2238a = m11195b;
            return c0773y;
        }
        return null;
    }
}
