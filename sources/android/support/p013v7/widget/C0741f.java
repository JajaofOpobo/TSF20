package android.support.p013v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.widget.C0484c;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* renamed from: android.support.v7.widget.f */
/* loaded from: classes.dex */
class C0741f {

    /* renamed from: a */
    private final CompoundButton f2128a;

    /* renamed from: b */
    private final C0742g f2129b;

    /* renamed from: c */
    private ColorStateList f2130c = null;

    /* renamed from: d */
    private PorterDuff.Mode f2131d = null;

    /* renamed from: e */
    private boolean f2132e = false;

    /* renamed from: f */
    private boolean f2133f = false;

    /* renamed from: g */
    private boolean f2134g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0741f(CompoundButton compoundButton, C0742g c0742g) {
        this.f2128a = compoundButton;
        this.f2129b = c0742g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11219a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2128a.getContext().obtainStyledAttributes(attributeSet, C0535a.C0546k.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0535a.C0546k.CompoundButton_android_button, 0)) != 0) {
                this.f2128a.setButtonDrawable(this.f2129b.m11211a(this.f2128a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.CompoundButton_buttonTint)) {
                C0484c.m12280a(this.f2128a, obtainStyledAttributes.getColorStateList(C0535a.C0546k.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.CompoundButton_buttonTintMode)) {
                C0484c.m12279a(this.f2128a, C0755o.m11125a(obtainStyledAttributes.getInt(C0535a.C0546k.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11221a(ColorStateList colorStateList) {
        this.f2130c = colorStateList;
        this.f2132e = true;
        m11216d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList m11223a() {
        return this.f2130c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11220a(PorterDuff.Mode mode) {
        this.f2131d = mode;
        this.f2133f = true;
        m11216d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode m11218b() {
        return this.f2131d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m11217c() {
        if (this.f2134g) {
            this.f2134g = false;
            return;
        }
        this.f2134g = true;
        m11216d();
    }

    /* renamed from: d */
    void m11216d() {
        Drawable m12281a = C0484c.m12281a(this.f2128a);
        if (m12281a != null) {
            if (this.f2132e || this.f2133f) {
                Drawable mutate = C0021a.m13850f(m12281a).mutate();
                if (this.f2132e) {
                    C0021a.m13860a(mutate, this.f2130c);
                }
                if (this.f2133f) {
                    C0021a.m13857a(mutate, this.f2131d);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f2128a.getDrawableState());
                }
                this.f2128a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11222a(int i) {
        Drawable m12281a;
        if (Build.VERSION.SDK_INT < 17 && (m12281a = C0484c.m12281a(this.f2128a)) != null) {
            return i + m12281a.getIntrinsicWidth();
        }
        return i;
    }
}
