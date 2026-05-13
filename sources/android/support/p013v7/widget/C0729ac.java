package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v7.app.AbstractC0579d;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.widget.ac */
/* loaded from: classes.dex */
public class C0729ac extends Resources {

    /* renamed from: a */
    private final WeakReference<Context> f2097a;

    /* renamed from: a */
    public static boolean m11262a() {
        return AbstractC0579d.m11978j() && Build.VERSION.SDK_INT <= 20;
    }

    public C0729ac(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2097a = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f2097a.get();
        return context != null ? C0742g.m11215a().m11204a(context, this, i) : super.getDrawable(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m11261a(int i) {
        return super.getDrawable(i);
    }
}
