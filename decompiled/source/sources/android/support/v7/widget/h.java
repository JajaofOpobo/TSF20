package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class h {
    private final ImageView a;
    private final g b;

    public h(ImageView imageView, g gVar) {
        this.a = imageView;
        this.b = gVar;
    }

    public void a(AttributeSet attributeSet, int i) {
        Drawable a;
        aa a2 = aa.a(this.a.getContext(), attributeSet, a.k.AppCompatImageView, i, 0);
        try {
            Drawable b = a2.b(a.k.AppCompatImageView_android_src);
            if (b != null) {
                this.a.setImageDrawable(b);
            }
            int g = a2.g(a.k.AppCompatImageView_srcCompat, -1);
            if (g != -1 && (a = this.b.a(this.a.getContext(), g)) != null) {
                this.a.setImageDrawable(a);
            }
            Drawable drawable = this.a.getDrawable();
            if (drawable != null) {
                o.b(drawable);
            }
        } finally {
            a2.a();
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable a = this.b != null ? this.b.a(this.a.getContext(), i) : android.support.v4.content.a.a(this.a.getContext(), i);
            if (a != null) {
                o.b(a);
            }
            this.a.setImageDrawable(a);
            return;
        }
        this.a.setImageDrawable(null);
    }
}
