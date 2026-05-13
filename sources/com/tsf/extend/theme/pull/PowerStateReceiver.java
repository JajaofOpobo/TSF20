package com.tsf.extend.theme.pull;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.tsf.extend.C1335b;
/* loaded from: classes.dex */
public class PowerStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            if (m7218a(context)) {
                m7217a("GDPR已经开启： PowerStateReceiver 可以启动 PullStubService");
                PullStubService.m7215a(context);
                return;
            }
            m7217a("GDPR没有开启： PowerStateReceiver 不能启动 PullStubService");
        }
    }

    /* renamed from: a */
    private boolean m7218a(Context context) {
        return context.getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* renamed from: a */
    private void m7217a(String str) {
        if (C1335b.f4221a.booleanValue()) {
            Log.v("TSF", str);
        }
    }
}
