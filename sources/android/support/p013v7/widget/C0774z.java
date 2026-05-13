package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.widget.z */
/* loaded from: classes.dex */
class C0774z extends C0761r {

    /* renamed from: a */
    private final WeakReference<Context> f2242a;

    public C0774z(Context context, Resources resources) {
        super(resources);
        this.f2242a = new WeakReference<>(context);
    }

    @Override // android.support.p013v7.widget.C0761r, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f2242a.get();
        if (drawable != null && context != null) {
            C0742g.m11215a();
            C0742g.m11209a(context, i, drawable);
        }
        return drawable;
    }
}
