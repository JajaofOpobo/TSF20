package com.p060cm.p061a;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
/* renamed from: com.cm.a.l */
/* loaded from: classes.dex */
public class C1124l {

    /* renamed from: a */
    private static boolean f3586a = false;

    /* renamed from: a */
    public static void m9800a(SharedPreferences.Editor editor) {
        if (f3586a) {
            Log.d("show", "SDK_INT  = " + Build.VERSION.SDK_INT);
        }
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
