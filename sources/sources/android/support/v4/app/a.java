package android.support.v4.app;

import android.app.Activity;

public class a {
    public static void a(Activity activity, String[] permissions, int requestCode) {
        androidx.core.app.ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }
}