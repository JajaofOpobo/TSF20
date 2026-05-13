package com.tsf.extend.base.p080j;

import android.os.Build;
/* renamed from: com.tsf.extend.base.j.v */
/* loaded from: classes.dex */
public class C1450v {
    /* renamed from: a */
    public static boolean m8585a() {
        return Build.MANUFACTURER != null && Build.MANUFACTURER.toLowerCase().contains("samsung");
    }

    /* renamed from: b */
    public static boolean m8584b() {
        String str;
        try {
            str = Build.DISPLAY;
        } catch (NoSuchFieldError e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null || !str.toUpperCase().contains("MIUI")) {
            String str2 = Build.MODEL;
            if (str2 == null || !str2.contains("MI-ONE")) {
                try {
                    String str3 = Build.DEVICE;
                    if (str3 != null) {
                        if (str3.contains("mione")) {
                            return true;
                        }
                    }
                } catch (NoSuchFieldError e2) {
                }
                String str4 = Build.MANUFACTURER;
                if (str4 == null || !str4.equalsIgnoreCase("Xiaomi")) {
                    String str5 = Build.PRODUCT;
                    return str5 != null && str5.contains("mione");
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
