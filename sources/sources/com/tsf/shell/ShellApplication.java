package com.tsf.shell;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellApplication extends Application {
    private static Context a;
    private A b;

    class A extends BroadcastReceiver {
        A() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            if ("com.tsf.shell.StartHome".equals(intent.getAction())) {
                String strB = ShellApplication.b();
                com.tsf.shell.manager.b.ConfigManager.k(true);
                if (strB == null || strB.equals(ShellApplication.this.getPackageName())) {
                    ShellApplication.this.c();
                }
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() throws Throwable {
        super.onCreate();
        a = this;
        com.tsf.shell.manager.bind.ShellBindContext.a(this);
        com.tsf.shell.manager.bind.ShellBindContext.a();
        com.tsf.extend.AppContextHolder.a(this);
        String strB = b();
        if (com.tsf.shell.manager.b.ConfigManager.L()) {
            if (strB == null || strB.equals(getPackageName())) {
                c();
                return;
            }
            return;
        }
        this.b = new ShellCoreInterface();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.StartHome");
        registerReceiver(this.b, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.tsf.extend.AppContextHolder.a(new com.ksmobile.a.a.a());
        com.ksmobile.launcher.cmbase.utils.SelectionDotRenderer.a();
        com.ksmobile.launcher.a.a.a.a();
    }

    public static Context a() {
        return a;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        com.tsf.shell.manager.bind.ShellBindContext.a().d();
    }

    public static String b() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        String strTrim = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/self/cmdline"));
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
            int i = fileInputStream.read(bArr);
            if (i > 0) {
                strTrim = new String(bArr, 0, i).trim();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                }
            } else if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                }
            }
        } catch (Throwable th3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                }
            }
        }
        return strTrim;
    }
}
