package com.tsf.extend.base.j;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    public static boolean a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
