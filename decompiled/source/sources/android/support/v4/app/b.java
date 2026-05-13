package android.support.v4.app;

import android.app.Activity;
/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    public interface a {
        void a_(int i);
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (activity instanceof a) {
            ((a) activity).a_(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static boolean a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
