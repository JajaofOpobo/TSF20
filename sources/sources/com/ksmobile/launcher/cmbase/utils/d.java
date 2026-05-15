package com.ksmobile.launcher.cmbase.utils;

import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    private static d a = null;
    private static final String[] b = {"/system/sbin/", "/system/xbin/", "/system/bin/"};

    public static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public boolean b() {
        return a("su") != null;
    }

    public String a(String str) {
        String str2;
        if (str.indexOf(47) == -1) {
            for (int i = 0; i < b.length; i++) {
                try {
                    str2 = b[i] + str;
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
