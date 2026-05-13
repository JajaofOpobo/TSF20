package com.tsf.shell.manager.action.toggle.p167a;

import android.content.Intent;
import android.net.wifi.WifiManager;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.manager.action.toggle.C3414b;
/* renamed from: com.tsf.shell.manager.action.toggle.a.f */
/* loaded from: classes.dex */
public class C3413f extends C3414b {
    public C3413f(int i) {
        super(i);
        mo2601d();
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: d */
    public void mo2601d() {
        mo2607a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: c */
    public void mo2602c() {
        WifiManager wifiManager = (WifiManager) C0853a.m10856d().getSystemService("wifi");
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

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: a */
    public void mo2607a(Intent intent) {
        switch (((WifiManager) C0853a.m10856d().getSystemService("wifi")).getWifiState()) {
            case 0:
                m2604b(1);
                return;
            case 1:
                m2604b(0);
                return;
            case 2:
                m2604b(1);
                return;
            case 3:
                m2604b(2);
                return;
            case 4:
                m2604b(0);
                return;
            default:
                return;
        }
    }
}
