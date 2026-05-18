package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class h {
    private final ImageView a;
    private final g b;

    public h(ImageView imageView, g gVar) {
        this.a = imageView;
        this.b = gVar;
    }

    public void a(AttributeSet attributeSet, int i) {
        Drawable drawableA;
        aa aaVarA = aa.a(this.a.getContext(), attributeSet, a.k.AppCompatImageView, i, 0);
        try {
            Drawable drawableB = aaVarA.b(a.k.AppCompatImageView_android_src);
            if (drawableB != null) {
                this.a.setImageDrawable(drawableB);
            }
            int iG = aaVarA.g(a.k.AppCompatImageView_srcCompat, -1);
            if (iG != -1 && (drawableA = this.b.a(this.a.getContext(), iG)) != null) {
                this.a.setImageDrawable(drawableA);
            }
            Drawable drawable = this.a.getDrawable();
            if (drawable != null) {
                o.b(drawable);
            }
        } finally {
            aaVarA.a();
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable drawableA = this.b != null ? this.b.a(this.a.getContext(), i) : android.support.v4.content.a.a(this.a.getContext(), i);
            if (drawableA != null) {
                o.b(drawableA);
            }
            this.a.setImageDrawable(drawableA);
            return;
        }
        this.a.setImageDrawable(null);
    }
}
