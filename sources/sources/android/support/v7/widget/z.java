package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class z extends r {
    private final WeakReference<Context> a;

    public z(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.r, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.a.get();
        if (drawable != null && context != null) {
            g.a();
            g.a(context, i, drawable);
        }
        return drawable;
    }
}
