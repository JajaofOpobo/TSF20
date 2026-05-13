package com.tsf.extend.theme.pull;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
/* loaded from: classes.dex */
public class PowerStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            if (a(context)) {
                a("GDPR已经开启： PowerStateReceiver 可以启动 PullStubService");
                PullStubService.a(context);
                return;
            }
            a("GDPR没有开启： PowerStateReceiver 不能启动 PullStubService");
        }
    }

    private boolean a(Context context) {
        return context.getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    private void a(String str) {
        if (com.tsf.extend.b.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }
}
