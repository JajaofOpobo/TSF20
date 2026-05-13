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
/* renamed from: com.ksmobile.launcher.cmbase.utils.b */
/* loaded from: classes.dex */
public class C1300b {

    /* renamed from: a */
    private static String f4107a;

    /* renamed from: b */
    private static String f4108b;

    /* renamed from: c */
    private static String f4109c;

    /* renamed from: a */
    public static String m9056a() {
        if (f4107a != null) {
            return f4107a;
        }
        f4107a = Settings.System.getString(ShellApplication.m6152a().getContentResolver(), "android_id");
        return f4107a;
    }

    /* renamed from: b */
    public static String m9053b() {
        if (f4108b != null) {
            return f4108b;
        }
        m9050d();
        return f4108b;
    }

    /* renamed from: d */
    private static synchronized void m9050d() {
        synchronized (C1300b.class) {
            if (f4108b == null) {
                Context m6152a = ShellApplication.m6152a();
                try {
                    PackageInfo packageInfo = m6152a.getPackageManager().getPackageInfo(m6152a.getPackageName(), 0);
                    f4108b = Integer.toString(packageInfo.versionCode);
                    f4109c = packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("AppEnvUtils", "Package is not found: " + m6152a.getPackageName());
                }
            }
        }
    }

    /* renamed from: c */
    public static String m9051c() {
        return "" + m9049e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ksmobile.launcher.cmbase.utils.b$a */
    /* loaded from: classes.dex */
    public class C1301a implements FileFilter {
        C1301a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* renamed from: e */
    private static int m9049e() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C1301a()).length;
        } catch (Exception e) {
            return 1;
        }
    }

    /* renamed from: a */
    public static String m9055a(Context context) {
        return C1299a.m9060b(context);
    }

    /* renamed from: b */
    public static String m9052b(Context context) {
        return C1299a.m9059c(context);
    }

    /* renamed from: a */
    public static void m9054a(Context context, String str, String str2) {
        C1299a.m9062a(context, str, str2);
    }
}
