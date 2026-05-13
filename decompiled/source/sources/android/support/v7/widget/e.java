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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    private final View a;
    private final g b;
    private y c;
    private y d;
    private y e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view, g gVar) {
        this.a = view;
        this.b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList b;
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, a.k.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_android_background) && (b = this.b.b(this.a.getContext(), obtainStyledAttributes.getResourceId(a.k.ViewBackgroundHelper_android_background, -1))) != null) {
                b(b);
            }
            if (obtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_backgroundTint)) {
                ai.a(this.a, obtainStyledAttributes.getColorStateList(a.k.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(a.k.ViewBackgroundHelper_backgroundTintMode)) {
                ai.a(this.a, o.a(obtainStyledAttributes.getInt(a.k.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        b((ColorStateList) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new y();
        }
        this.d.a = colorStateList;
        this.d.d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        if (this.d != null) {
            return this.d.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.d == null) {
            this.d = new y();
        }
        this.d.b = mode;
        this.d.c = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode b() {
        if (this.d != null) {
            return this.d.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
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
        ColorStateList t = ai.t(this.a);
        if (t != null) {
            yVar.d = true;
            yVar.a = t;
        }
        PorterDuff.Mode u = ai.u(this.a);
        if (u != null) {
            yVar.c = true;
            yVar.b = u;
        }
        if (yVar.d || yVar.c) {
            g.a(drawable, yVar, this.a.getDrawableState());
            return true;
        }
        return false;
    }
}
