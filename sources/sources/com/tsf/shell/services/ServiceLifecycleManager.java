package com.tsf.shell.services;

import android.content.Context;
import com.tsf.shell.Home;
import com.tsf.shell.manager.ForegroundServiceManager.ConfigManager;
import com.tsf.shell.services.ToggleServiceConnector;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ServiceLifecycleManager {
    public static boolean a = true;
    private ForegroundServiceManager ForegroundServiceManager;
    private ToggleServiceConnector c;

    public Object c() {
        ToggleServiceConnector();
    }

    private void ToggleServiceConnector() {
        Context applicationContext = Home.ForegroundServiceManager().getApplicationContext();
        if (a()) {
            this.ForegroundServiceManager = new ForegroundServiceManager(applicationContext);
            this.ForegroundServiceManager.c();
            this.ForegroundServiceManager.a();
        }
        this.c = new ToggleServiceConnector(applicationContext);
        this.c.ForegroundServiceManager();
        this.c.c();
        this.c.a(new ToggleServiceConnector.a() { // from class: com.tsf.shell.services.ServiceLifecycleManager.1
            @Override // com.tsf.shell.services.ToggleServiceConnector.a
            public void a(com.c.a.a.a.a aVar) {
                if (aVar.D().equals("false")) {
                    c.a = false;
                }
            }
        });
    }

    public boolean a() {
        return e.aA();
    }

    public void ForegroundServiceManager() {
        if (this.ForegroundServiceManager != null) {
            try {
                this.ForegroundServiceManager.ForegroundServiceManager();
                this.ForegroundServiceManager.ToggleServiceConnector();
            } catch (Exception e) {
            }
        }
        if (this.c != null) {
            try {
                this.c.ToggleServiceConnector();
            } catch (Exception e2) {
            }
        }
    }

    public ToggleServiceConnector c() {
        return this.c;
    }
}
