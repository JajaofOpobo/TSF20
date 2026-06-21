package android.support.v4.app;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes.dex */
public class a extends android.support.v4.a.a {
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(activity);
        } else {
            activity.finish();
        }
    }
}
