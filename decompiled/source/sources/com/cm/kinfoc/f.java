package com.cm.kinfoc;

import java.io.File;
/* loaded from: classes.dex */
public class f {
    public static boolean a(String str) {
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }

    public static void b(String str) {
        try {
            c(str);
            new File(str.toString()).delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean c(String str) {
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
                        c(str + File.separatorChar + list[i]);
                        b(str + File.separatorChar + list[i]);
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

    public static int d(String str) {
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
