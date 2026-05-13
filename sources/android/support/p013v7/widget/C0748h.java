package android.support.p013v7.widget;

import android.graphics.drawable.Drawable;
import android.support.p002v4.content.C0144a;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: android.support.v7.widget.h */
/* loaded from: classes.dex */
public class C0748h {

    /* renamed from: a */
    private final ImageView f2150a;

    /* renamed from: b */
    private final C0742g f2151b;

    public C0748h(ImageView imageView, C0742g c0742g) {
        this.f2150a = imageView;
        this.f2151b = c0742g;
    }

    /* renamed from: a */
    public void m11177a(AttributeSet attributeSet, int i) {
        Drawable m11211a;
        C0725aa m11295a = C0725aa.m11295a(this.f2150a.getContext(), attributeSet, C0535a.C0546k.AppCompatImageView, i, 0);
        try {
            Drawable m11294b = m11295a.m11294b(C0535a.C0546k.AppCompatImageView_android_src);
            if (m11294b != null) {
                this.f2150a.setImageDrawable(m11294b);
            }
            int m11284g = m11295a.m11284g(C0535a.C0546k.AppCompatImageView_srcCompat, -1);
            if (m11284g != -1 && (m11211a = this.f2151b.m11211a(this.f2150a.getContext(), m11284g)) != null) {
                this.f2150a.setImageDrawable(m11211a);
            }
            Drawable drawable = this.f2150a.getDrawable();
            if (drawable != null) {
                C0755o.m11123b(drawable);
            }
        } finally {
            m11295a.m11301a();
        }
    }

    /* renamed from: a */
    public void m11178a(int i) {
        if (i != 0) {
            Drawable m11211a = this.f2151b != null ? this.f2151b.m11211a(this.f2150a.getContext(), i) : C0144a.m13403a(this.f2150a.getContext(), i);
            if (m11211a != null) {
                C0755o.m11123b(m11211a);
            }
            this.f2150a.setImageDrawable(m11211a);
            return;
        }
        this.f2150a.setImageDrawable(null);
    }
}
