package com.cm.a;

import android.util.DisplayMetrics;
import com.tsf.shell.ShellApplication;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    private static DisplayMetrics a = ShellApplication.a().getResources().getDisplayMetrics();

    public static int a() {
        return a.widthPixels;
    }

    public static int b() {
        return a.heightPixels;
    }
}
