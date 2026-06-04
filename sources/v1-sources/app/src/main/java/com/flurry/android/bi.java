package com.flurry.android;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.SparseArray;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
final class bi {
    private static final String a = bi.class.getSimpleName();
    private static final SparseArray b;

    bi() {
    }

    static {
        SparseArray sparseArray = new SparseArray();
        int a2 = a();
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(-1, a2);
        sparseIntArray.put(2, a2);
        sparseIntArray.put(3, a2);
        sparseIntArray.put(4, a2);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(5, 5);
        sparseIntArray.put(7, 7);
        sparseIntArray.put(9, 9);
        sparseIntArray.put(10, 7);
        sparseArray.put(1, sparseIntArray);
        int i = dx.a >= 9 ? 6 : 0;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(-1, i);
        sparseIntArray2.put(2, i);
        sparseIntArray2.put(3, i);
        sparseIntArray2.put(4, i);
        sparseIntArray2.put(0, 0);
        sparseIntArray2.put(5, 5);
        sparseIntArray2.put(6, 6);
        sparseIntArray2.put(8, 8);
        sparseIntArray2.put(10, 6);
        sparseArray.put(2, sparseIntArray2);
        b = sparseArray;
    }

    public static void a(Activity activity, int i) {
        if (activity != null) {
            activity.setRequestedOrientation(i);
        }
    }

    public static int a() {
        if (dx.a < 9) {
            return 1;
        }
        return 7;
    }

    public static boolean b(Activity activity, int i) {
        int i2;
        int i3;
        if (activity == null) {
            return false;
        }
        ActivityInfo a2 = a(activity);
        if (a2 == null) {
            i2 = 0;
        } else {
            i2 = a2.configChanges;
            if (a2.applicationInfo.targetSdkVersion < 13) {
                i2 |= 3072;
            }
        }
        if (!((i2 & 128) == 0 ? false : (i2 & 1024) != 0)) {
            if (activity == null) {
                i3 = -1;
            } else {
                SparseIntArray sparseIntArray = (SparseIntArray) b.get(activity.getResources().getConfiguration().orientation);
                i3 = sparseIntArray != null ? sparseIntArray.get(i, -1) : -1;
            }
            if (-1 == i3) {
                String str = "cannot set requested orientation without restarting activity, requestedOrientation = " + i;
                Cdo.b(a, "cannot set requested orientation without restarting activity. It is recommended to add keyboardHidden|orientation|screenSize for android:configChanges attribute for activity: " + activity.getComponentName().getClassName());
                return false;
            }
            i = i3;
        }
        activity.setRequestedOrientation(i);
        return true;
    }

    private static ActivityInfo a(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            String str = "cannot find info for activity: " + activity.getComponentName();
            return null;
        }
    }
}
