package com.tsf.shell.workspace3D.k;

import android.content.Context;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import dalvik.system.PathClassLoader;

/* loaded from: classes.dex */
public final class t extends com.censivn.a.b {
    public static String a = "EVENT_LOAD_COMPLETE";
    public static String b = "EVENT_LOAD_ERROR";
    private static ClassLoader c;

    public static void a(ClassLoader classLoader) {
        c = classLoader;
    }

    public final void a(s sVar, LauncherItem3DInfo launcherItem3DInfo, boolean z, y yVar) {
        if (launcherItem3DInfo.internal) {
            try {
                Class<?> loadClass = c.loadClass(launcherItem3DInfo.classname);
                com.censivn.C3DEngine.a.a().c(new x(this, loadClass.getMethod("getWidget", Context.class), loadClass.newInstance(), launcherItem3DInfo, z, yVar, sVar));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                a(b);
                return;
            }
        }
        u uVar = new u(this, sVar, launcherItem3DInfo, z, yVar);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(uVar);
    }

    static /* synthetic */ void a(t tVar, s sVar, LauncherItem3DInfo launcherItem3DInfo, boolean z, y yVar) {
        String str = launcherItem3DInfo.packagename;
        try {
            Class loadClass = new PathClassLoader(com.censivn.C3DEngine.a.c().getPackageManager().getApplicationInfo(str, 0).sourceDir, c).loadClass(launcherItem3DInfo.classname);
            Object newInstance = loadClass.newInstance();
            Context c2 = com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.c();
            com.censivn.C3DEngine.a.a().c(new v(tVar, loadClass.getMethod("getWidget", Context.class, Integer.class), newInstance, c2.createPackageContext(str, 3), launcherItem3DInfo, str, z, yVar, sVar));
        } catch (Exception e) {
            String str2 = "load widget error:" + e.getLocalizedMessage();
            tVar.a(b);
        }
    }
}
