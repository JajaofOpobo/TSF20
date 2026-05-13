package com.ksmobile.launcher.cmbase.utils;

import java.io.File;
/* renamed from: com.ksmobile.launcher.cmbase.utils.d */
/* loaded from: classes.dex */
public class C1303d {

    /* renamed from: a */
    private static C1303d f4110a = null;

    /* renamed from: b */
    private static final String[] f4111b = {"/system/sbin/", "/system/xbin/", "/system/bin/"};

    /* renamed from: a */
    public static C1303d m9047a() {
        if (f4110a == null) {
            f4110a = new C1303d();
        }
        return f4110a;
    }

    /* renamed from: b */
    public boolean m9045b() {
        return m9046a("su") != null;
    }

    /* renamed from: a */
    public String m9046a(String str) {
        String str2;
        if (str.indexOf(47) == -1) {
            for (int i = 0; i < f4111b.length; i++) {
                try {
                    str2 = f4111b[i] + str;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (new File(str2).exists()) {
                    return str2;
                }
            }
            return null;
        }
        return str;
    }
}
