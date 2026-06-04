package com.tsf.shell.setting;

import android.net.wifi.WifiManager;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class p extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(l lVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = lVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        WifiManager wifiManager = (WifiManager) com.censivn.C3DEngine.a.c().getSystemService("wifi");
        switch (wifiManager.getWifiState()) {
            case 1:
                wifiManager.setWifiEnabled(true);
                break;
            case 3:
                wifiManager.setWifiEnabled(false);
                break;
        }
    }
}
