package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import com.tsf.b;
/* loaded from: classes.dex */
public class n {
    public static void a(Activity activity) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"service@tsfui.com", ""});
        String a = u.a(activity);
        intent.putExtra("android.intent.extra.SUBJECT", a + " " + activity.getString(b.i.mn_feedback));
        intent.putExtra("android.intent.extra.TITLE", a + " " + activity.getString(b.i.mn_feedback));
        String str = "\n\n\n\n\n=====================\n";
        try {
            str = u.c(activity, u.d(activity, u.b(activity, u.a(activity, u.a(u.b("\n\n\n\n\n=====================\n"))))));
        } catch (Exception e) {
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, x.c(b.i.mn_feedback)));
    }
}
