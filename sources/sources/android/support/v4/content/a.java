package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            d.a(context, intentArr, bundle);
            return true;
        }
        if (i >= 11) {
            c.a(context, intentArr);
            return true;
        }
        return false;
    }

    public static final Drawable a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 21 ? b.a(context, i) : context.getResources().getDrawable(i);
    }
}
