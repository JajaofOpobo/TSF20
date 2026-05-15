package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends android.support.v4.content.a {

    /* JADX INFO: renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0003a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            d.a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            d.a(activity);
        } else {
            activity.finish();
        }
    }

    public static void a(final Activity activity, final String[] strArr, final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.a(activity, strArr, i);
        } else if (activity instanceof InterfaceC0003a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.support.v4.app.a.1
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                    }
                    ((InterfaceC0003a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(activity, str);
        }
        return false;
    }
}
