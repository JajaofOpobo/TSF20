package com.p060cm.kinfoc;

import java.io.File;
/* renamed from: com.cm.kinfoc.f */
/* loaded from: classes.dex */
public class C1143f {
    /* renamed from: a */
    public static boolean m9737a(String str) {
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m9736b(String str) {
        try {
            m9735c(str);
            new File(str.toString()).delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m9735c(String str) {
        boolean z;
        File file;
        boolean z2 = false;
        if (str == null || str.length() <= 0) {
            return false;
        }
        File file2 = new File(str);
        if (file2.exists() && file2.isDirectory()) {
            String[] list = file2.list();
            if (list != null) {
                int i = 0;
                while (true) {
                    z = z2;
                    if (i >= list.length) {
                        break;
                    }
                    if (str.endsWith(File.separator)) {
                        file = new File(str + list[i]);
                    } else {
                        file = new File(str + File.separator + list[i]);
                    }
                    if (file.isFile()) {
                        file.delete();
                    }
                    if (file.isDirectory()) {
                        m9735c(str + File.separatorChar + list[i]);
                        m9736b(str + File.separatorChar + list[i]);
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    i++;
                }
            } else {
                z = false;
            }
            return z;
        }
        return false;
    }

    /* renamed from: d */
    public static int m9734d(String str) {
        String[] list;
        if (str == null || str.length() <= 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (list = file.list()) != null) {
            return list.length;
        }
        return 0;
    }
}
