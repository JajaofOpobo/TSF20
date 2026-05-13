package com.ksmobile.a.b;

import android.content.Context;
/* loaded from: classes.dex */
public class b {
    public static int a(Context context) {
        if (context != null) {
            try {
                return context.getResources().getDisplayMetrics().densityDpi;
            } catch (Exception e) {
                return 240;
            }
        }
        return 240;
    }
}
