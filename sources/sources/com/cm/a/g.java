package com.cm.a;

import android.util.Log;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {
    private static Object a = new Object();
    private static volatile boolean b = false;

    public static boolean a(boolean z) {
        boolean z2 = true;
        if (!b) {
            synchronized (a) {
                if (!b) {
                    try {
                        i.a().a("kcmutil");
                    } catch (Error e) {
                        Log.d("", "", e);
                        z2 = false;
                    } catch (Exception e2) {
                        z2 = false;
                    }
                    b = z2;
                }
            }
        }
        return z2;
    }
}
