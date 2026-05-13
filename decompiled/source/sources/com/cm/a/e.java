package com.cm.a;

import android.util.DisplayMetrics;
import com.tsf.shell.ShellApplication;
/* loaded from: classes.dex */
public class e {
    private static DisplayMetrics a = ShellApplication.a().getResources().getDisplayMetrics();

    public static int a() {
        return a.widthPixels;
    }

    public static int b() {
        return a.heightPixels;
    }
}
