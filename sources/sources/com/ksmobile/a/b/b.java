package com.ksmobile.a.b;

import android.content.Context;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static int a(Context context) {
        if (context == null) {
            return 240;
        }
        try {
            return context.getResources().getDisplayMetrics().densityDpi;
        } catch (Exception e) {
            return 240;
        }
    }
}
