package android.support.p002v4.content.p008a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* renamed from: android.support.v4.content.a.a */
/* loaded from: classes.dex */
public final class C0145a {
    /* renamed from: a */
    public static Drawable m13401a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C0146b.m13400a(resources, i, theme) : resources.getDrawable(i);
    }
}
