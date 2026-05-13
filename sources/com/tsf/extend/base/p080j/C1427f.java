package com.tsf.extend.base.p080j;

import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: com.tsf.extend.base.j.f */
/* loaded from: classes.dex */
public class C1427f {
    /* renamed from: a */
    public static boolean m8664a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
