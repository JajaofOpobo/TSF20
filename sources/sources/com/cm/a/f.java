package com.cm.a;

import android.content.Context;
import com.tsf.shell.ShellApplication;
import java.io.File;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f {
    public static File a(Context context) {
        File filesDir = null;
        if (context == null) {
            context = ShellApplication.a();
        }
        if (context != null) {
            for (int i = 0; i < 3 && (filesDir = context.getFilesDir()) == null; i++) {
                try {
                    Thread.sleep(166L);
                } catch (InterruptedException e) {
                }
            }
        }
        return filesDir;
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return File.separator;
        }
        if (str.charAt(str.length() - 1) != File.separatorChar) {
            return str + File.separatorChar;
        }
        return str;
    }
}
