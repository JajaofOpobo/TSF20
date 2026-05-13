package com.cm.a;

import android.content.Context;
import com.tsf.shell.ShellApplication;
import java.io.File;
/* loaded from: classes.dex */
public class f {
    public static File a(Context context) {
        File file = null;
        if (context == null) {
            context = ShellApplication.a();
        }
        if (context != null) {
            for (int i = 0; i < 3 && (file = context.getFilesDir()) == null; i++) {
                try {
                    Thread.sleep(166L);
                } catch (InterruptedException e) {
                }
            }
        }
        return file;
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
