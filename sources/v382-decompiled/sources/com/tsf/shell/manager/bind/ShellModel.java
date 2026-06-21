package com.tsf.shell.manager.bind;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ShellModel extends BroadcastReceiver {
    public static Handler b;
    private static final Object f = new Object();
    private static final HashMap g = new HashMap();
    private static final HashMap h = new HashMap();
    private static final ArrayList i = new ArrayList();
    private static final ArrayList j = new ArrayList();
    private static final ArrayList k = new ArrayList();
    private static final ArrayList l = new ArrayList();
    private static final ArrayList m = new ArrayList();
    private static final ArrayList n = new ArrayList();
    private static final HandlerThread q = new HandlerThread("launcher-loader");
    public com.tsf.shell.manager.a.a a;
    private e c;
    private Context d;
    private int e;
    private b o;
    private boolean p;

    @SuppressLint({"NewApi"})
    ShellModel(Context context) {
        this.d = context;
        this.p = Build.VERSION.SDK_INT < 9 ? true : Environment.isExternalStorageRemovable();
        this.o = new b();
        this.a = new com.tsf.shell.manager.a.a();
        this.e = this.d.getResources().getInteger(R.integer.config_allAppsBatchLoadDelay);
    }

    public static void a(String str) {
    }

    public void a() {
        q.start();
        b = new Handler(q.getLooper());
    }

    public static void a(HashMap hashMap) {
        synchronized (f) {
            hashMap.putAll(g);
        }
    }

    public void a(Home home) {
        synchronized (f) {
            this.o.a(home);
            this.c = new e(this, home);
            b.post(this.c);
        }
    }

    public static void a(Runnable runnable) {
        if (q.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }

    public com.tsf.shell.manager.a.a b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LauncherFolder3DInfo b(HashMap hashMap, Integer num) {
        LauncherFolder3DInfo launcherFolder3DInfo = (LauncherFolder3DInfo) hashMap.get(num);
        if (launcherFolder3DInfo == null) {
            LauncherFolder3DInfo launcherFolder3DInfo2 = new LauncherFolder3DInfo();
            hashMap.put(num, launcherFolder3DInfo2);
            return launcherFolder3DInfo2;
        }
        return launcherFolder3DInfo;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i2 = 2;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_ADDED".equals(action)) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        if (!booleanExtra) {
                            i2 = 3;
                        }
                        i2 = 0;
                    } else {
                        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                            if (!booleanExtra) {
                                i2 = 1;
                            }
                        }
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    a(new f(this, i2, new String[]{schemeSpecificPart}));
                    return;
                }
                return;
            }
            return;
        }
        if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action)) {
            a(new f(this, 5, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        } else if ("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            a(new f(this, 4, intent.getStringArrayExtra("android.intent.extra.changed_package_list")));
        }
    }

    void a(f fVar) {
        com.tsf.shell.g.a().a(fVar);
    }
}
