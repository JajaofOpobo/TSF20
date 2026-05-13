package com.cm.a;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
/* loaded from: classes.dex */
public class l {
    private static boolean a = false;

    public static void a(SharedPreferences.Editor editor) {
        if (a) {
            Log.d("show", "SDK_INT  = " + Build.VERSION.SDK_INT);
        }
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
