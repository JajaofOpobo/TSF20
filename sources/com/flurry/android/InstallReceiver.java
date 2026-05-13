package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.flurry.sdk.C1175cy;
import com.flurry.sdk.C1258eo;
import com.flurry.sdk.C1277fe;
/* loaded from: classes.dex */
public final class InstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f3727a = InstallReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C1258eo.m9234a(4, f3727a, "Received an Install nofication of " + intent.getAction());
        String string = intent.getExtras().getString("referrer");
        C1258eo.m9234a(4, f3727a, "Received an Install referrer of " + string);
        if (string == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            C1258eo.m9234a(5, f3727a, "referrer is null");
            return;
        }
        if (!string.contains("=")) {
            C1258eo.m9234a(4, f3727a, "referrer is before decoding: " + string);
            string = C1277fe.m9145c(string);
            C1258eo.m9234a(4, f3727a, "referrer is: " + string);
        }
        new C1175cy(context).m9570a(string);
    }
}
