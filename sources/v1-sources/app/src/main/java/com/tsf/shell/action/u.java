package com.tsf.shell.action;

import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ t a;

    u(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object systemService = Home.d().getSystemService("statusbar");
            if (systemService != null) {
                systemService.getClass().getMethod("expand", new Class[0]).invoke(systemService, new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Object systemService2 = Home.d().getSystemService("statusbar");
                if (systemService2 != null) {
                    systemService2.getClass().getMethod("expandNotificationsPanel", new Class[0]).invoke(systemService2, new Object[0]);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
