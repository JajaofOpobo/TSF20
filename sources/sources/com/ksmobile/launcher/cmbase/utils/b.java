package com.ksmobile.launcher.cmbase.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
import com.tsf.shell.ShellApplication;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static String a;
    private static String b;
    private static String c;

    public static String a() {
        if (a != null) {
            return a;
        }
        a = Settings.System.getString(ShellApplication.a().getContentResolver(), "android_id");
        return a;
    }

    public static String b() {
        if (b != null) {
            return b;
        }
        d();
        return b;
    }

    private static synchronized void d() {
        if (b == null) {
            Context contextA = ShellApplication.a();
            try {
                PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                b = Integer.toString(packageInfo.versionCode);
                c = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppEnvUtils", "Package is not found: " + contextA.getPackageName());
            }
        }
    }

    public static String c() {
        return "" + e();
    }

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    private static int e() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new a()).length;
        } catch (Exception e) {
            return 1;
        }
    }

    public static String a(Context context) {
        return com.ksmobile.launcher.cmbase.utils.a.b(context);
    }

    public static String b(Context context) {
        return com.ksmobile.launcher.cmbase.utils.a.c(context);
    }

    public static void a(Context context, String str, String str2) {
        com.ksmobile.launcher.cmbase.utils.a.a(context, str, str2);
    }
}
