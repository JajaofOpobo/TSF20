package com.tsf.shell.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.h;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d {
    public static final String[] a = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    public static final String[] b = {"android.permission.READ_CONTACTS"};
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;

    /* loaded from: classes.dex */
    public enum a {
        AUTHORIZED,
        USER_CLICK_AGREE_AUTH,
        USER_SETTING_AUTH,
        USER_REJECT_AUTH,
        SYSTEM_CANCEL_AUTH
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i, boolean z, a aVar);
    }

    static {
        c = Build.VERSION.SDK_INT >= 28 ? new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG"} : new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG"};
        d = Build.VERSION.SDK_INT >= 28 ? new String[]{"android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"} : c;
        e = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        f = new String[]{"android.permission.RECORD_AUDIO"};
        g = new String[]{"android.permission.CAMERA"};
        h = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        i = new String[]{"android.permission.READ_SMS"};
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean a(Context context, String... strArr) {
        return a() && !c(context, strArr);
    }

    public static List<String> b(Context context, String... strArr) {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (h.a(context, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    public static boolean c(Context context, String... strArr) {
        for (String str : strArr) {
            if (h.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Activity activity, int i2, String... strArr) {
        if (a(activity, strArr)) {
            List<String> b2 = b(activity, strArr);
            if (b2 != null) {
                android.support.v4.app.a.a(activity, (String[]) b2.toArray(new String[b2.size()]), i2);
            }
            return false;
        }
        return true;
    }
}
