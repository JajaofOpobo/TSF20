package com.tsf.shell.activity.p090b;

import android.content.pm.PackageManager;
import android.util.Log;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1305a;
import com.tsf.shell.manager.p168b.C3430e;
/* renamed from: com.tsf.shell.activity.b.a */
/* loaded from: classes.dex */
public class C2221a {

    /* renamed from: a */
    private static int f7294a = 100;

    /* renamed from: b */
    private static int f7295b = 1;

    /* renamed from: a */
    public static void m6059a() {
        if (!m6057b()) {
            m6058a("主界面启动后，新安装或者升级版本检测，此时不再展示启动页（修改第一次启动的时候先展示启动页）");
            f7295b = f7294a;
            C3430e.m2457i(f7294a);
        }
    }

    /* renamed from: a */
    private static void m6058a(String str) {
        if (C1305a.f4114a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    /* renamed from: b */
    public static boolean m6057b() {
        try {
            f7294a = C0853a.m10856d().getPackageManager().getPackageInfo(C0853a.m10856d().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        f7295b = C3430e.m2561K();
        return f7295b >= f7294a;
    }
}
