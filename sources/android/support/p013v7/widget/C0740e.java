package android.support.p013v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.e */
/* loaded from: classes.dex */
public class C0740e {

    /* renamed from: a */
    private final View f2123a;

    /* renamed from: b */
    private final C0742g f2124b;

    /* renamed from: c */
    private C0773y f2125c;

    /* renamed from: d */
    private C0773y f2126d;

    /* renamed from: e */
    private C0773y f2127e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0740e(View view, C0742g c0742g) {
        this.f2123a = view;
        this.f2124b = c0742g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11228a(AttributeSet attributeSet, int i) {
        ColorStateList m11195b;
        TypedArray obtainStyledAttributes = this.f2123a.getContext().obtainStyledAttributes(attributeSet, C0535a.C0546k.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.ViewBackgroundHelper_android_background) && (m11195b = this.f2124b.m11195b(this.f2123a.getContext(), obtainStyledAttributes.getResourceId(C0535a.C0546k.ViewBackgroundHelper_android_background, -1))) != null) {
                m11226b(m11195b);
            }
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.ViewBackgroundHelper_backgroundTint)) {
                C0309ai.m12925a(this.f2123a, obtainStyledAttributes.getColorStateList(C0535a.C0546k.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.ViewBackgroundHelper_backgroundTintMode)) {
                C0309ai.m12923a(this.f2123a, C0755o.m11125a(obtainStyledAttributes.getInt(C0535a.C0546k.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11232a(int i) {
        m11226b(this.f2124b != null ? this.f2124b.m11195b(this.f2123a.getContext(), i) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11229a(Drawable drawable) {
        m11226b((ColorStateList) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11231a(ColorStateList colorStateList) {
        if (this.f2126d == null) {
            this.f2126d = new C0773y();
        }
        this.f2126d.f2238a = colorStateList;
        this.f2126d.f2241d = true;
        m11224c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList m11233a() {
        if (this.f2126d != null) {
            return this.f2126d.f2238a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11230a(PorterDuff.Mode mode) {
        if (this.f2126d == null) {
            this.f2126d = new C0773y();
        }
        this.f2126d.f2239b = mode;
        this.f2126d.f2240c = true;
        m11224c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode m11227b() {
        if (this.f2126d != null) {
            return this.f2126d.f2239b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11224c() {
        Drawable background = this.f2123a.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT != 21 || !m11225b(background)) {
                if (this.f2126d != null) {
                    C0742g.m11201a(background, this.f2126d, this.f2123a.getDrawableState());
                } else if (this.f2125c != null) {
                    C0742g.m11201a(background, this.f2125c, this.f2123a.getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    void m11226b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2125c == null) {
                this.f2125c = new C0773y();
            }
            this.f2125c.f2238a = colorStateList;
            this.f2125c.f2241d = true;
        } else {
            this.f2125c = null;
        }
        m11224c();
    }

    /* renamed from: b */
    private boolean m11225b(Drawable drawable) {
        if (this.f2127e == null) {
            this.f2127e = new C0773y();
        }
        C0773y c0773y = this.f2127e;
        c0773y.m11061a();
        ColorStateList m12887t = C0309ai.m12887t(this.f2123a);
        if (m12887t != null) {
            c0773y.f2241d = true;
            c0773y.f2238a = m12887t;
        }
        PorterDuff.Mode m12886u = C0309ai.m12886u(this.f2123a);
        if (m12886u != null) {
            c0773y.f2240c = true;
            c0773y.f2239b = m12886u;
        }
        if (c0773y.f2241d || c0773y.f2240c) {
            C0742g.m11201a(drawable, c0773y, this.f2123a.getDrawableState());
            return true;
        }
        return false;
    }
}
