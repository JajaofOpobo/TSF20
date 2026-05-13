package android.support.p002v4.content;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
/* renamed from: android.support.v4.content.a */
/* loaded from: classes.dex */
public class C0144a {
    /* renamed from: a */
    public static boolean m13402a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            C0149d.m13397a(context, intentArr, bundle);
            return true;
        } else if (i >= 11) {
            C0148c.m13398a(context, intentArr);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static final Drawable m13403a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? C0147b.m13399a(context, i) : context.getResources().getDrawable(i);
    }
}
