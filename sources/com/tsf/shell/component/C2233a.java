package com.tsf.shell.component;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* renamed from: com.tsf.shell.component.a */
/* loaded from: classes.dex */
public class C2233a {
    /* renamed from: a */
    public static void m6034a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 26) {
            context.startService(intent);
            return;
        }
        try {
            context.startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof IllegalStateException) {
                Intent intent2 = new Intent(context, ForegroundService.class);
                intent2.putExtra("cml_intent", intent);
                try {
                    context.startForegroundService(intent2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
