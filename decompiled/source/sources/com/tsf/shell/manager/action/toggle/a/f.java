package com.tsf.shell.manager.action.toggle.a;

import android.content.Intent;
import android.net.wifi.WifiManager;
/* loaded from: classes.dex */
public class f extends com.tsf.shell.manager.action.toggle.b {
    public f(int i) {
        super(i);
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        WifiManager wifiManager = (WifiManager) com.censivn.C3DEngine.a.d().getSystemService("wifi");
        switch (wifiManager.getWifiState()) {
            case 0:
            case 2:
            default:
                return;
            case 1:
                wifiManager.setWifiEnabled(true);
                return;
            case 3:
                wifiManager.setWifiEnabled(false);
                return;
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void a(Intent intent) {
        switch (((WifiManager) com.censivn.C3DEngine.a.d().getSystemService("wifi")).getWifiState()) {
            case 0:
                b(1);
                return;
            case 1:
                b(0);
                return;
            case 2:
                b(1);
                return;
            case 3:
                b(2);
                return;
            case 4:
                b(0);
                return;
            default:
                return;
        }
    }
}
