package com.p060cm.p061a;

import android.content.Context;
import com.tsf.shell.ShellApplication;
import java.io.File;
/* renamed from: com.cm.a.f */
/* loaded from: classes.dex */
public class C1116f {
    /* renamed from: a */
    public static File m9841a(Context context) {
        File file = null;
        if (context == null) {
            context = ShellApplication.m6152a();
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

    /* renamed from: a */
    public static String m9840a(String str) {
        if (str == null || str.length() == 0) {
            return File.separator;
        }
        if (str.charAt(str.length() - 1) != File.separatorChar) {
            return str + File.separatorChar;
        }
        return str;
    }
}
