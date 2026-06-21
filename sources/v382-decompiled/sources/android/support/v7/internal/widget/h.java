package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class h extends c {
    private final f a;

    public h(Resources resources, f fVar) {
        super(resources);
        this.a = fVar;
    }

    @Override // android.support.v7.internal.widget.c, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null) {
            this.a.a(i, drawable);
        }
        return drawable;
    }
}
