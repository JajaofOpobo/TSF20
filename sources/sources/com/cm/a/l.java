package com.cm.a;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
