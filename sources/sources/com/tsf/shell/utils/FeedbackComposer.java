package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FeedbackComposer {
    public static void a(Activity activity) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"service@tsfui.com", ""});
        String strA = DeviceInfoCollector.a(activity);
        intent.putExtra("android.intent.extra.SUBJECT", strA + " " + activity.getString(b.i.mn_feedback));
        intent.putExtra("android.intent.extra.TITLE", strA + " " + activity.getString(b.i.mn_feedback));
        String strC = "\n\n\n\n\n=====================\n";
        try {
            strC = DeviceInfoCollector.c(activity, DeviceInfoCollector.d(activity, DeviceInfoCollector.b(activity, DeviceInfoCollector.a(activity, DeviceInfoCollector.a(DeviceInfoCollector.b("\n\n\n\n\n=====================\n"))))));
        } catch (Exception e) {
        }
        intent.putExtra("android.intent.extra.TEXT", strC);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, GraphicsEngineBridge.c(b.i.mn_feedback)));
    }
}
