package android.support.p002v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p002v4.content.C0144a;
/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public class C0062a extends C0144a {

    /* renamed from: android.support.v4.app.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0064a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: a */
    public static void m13699a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0075d.m13682a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m13700a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0075d.m13683a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m13697a(final Activity activity, final String[] strArr, final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0072b.m13686a(activity, strArr, i);
        } else if (activity instanceof InterfaceC0064a) {
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
                    ((InterfaceC0064a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m13698a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0072b.m13687a(activity, str);
        }
        return false;
    }
}
