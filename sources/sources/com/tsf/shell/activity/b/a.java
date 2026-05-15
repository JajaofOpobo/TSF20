package com.tsf.shell.activity.b;

import android.content.pm.PackageManager;
import android.util.Log;
import com.tsf.shell.manager.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static int a = 100;
    private static int b = 1;

    public static void a() {
        if (!b()) {
            a("主界面启动后，新安装或者升级版本检测，此时不再展示启动页（修改第一次启动的时候先展示启动页）");
            b = a;
            e.i(a);
        }
    }

    private static void a(String str) {
        if (com.tsf.a.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    public static boolean b() {
        try {
            a = com.censivn.C3DEngine.a.d().getPackageManager().getPackageInfo(com.censivn.C3DEngine.a.d().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        b = e.K();
        return b >= a;
    }
}
