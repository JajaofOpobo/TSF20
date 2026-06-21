package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class o {
    public static void a(Activity activity) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"service@tsfui.com", ""});
        String a = v.a(activity);
        intent.putExtra("android.intent.extra.SUBJECT", String.valueOf(a) + " " + activity.getString(R.string.mn_feedback));
        intent.putExtra("android.intent.extra.TITLE", String.valueOf(a) + " " + activity.getString(R.string.mn_feedback));
        String str = "\n\n\n\n\n=====================\n";
        try {
            str = v.c(activity, v.d(activity, v.b(activity, v.a(activity, v.a(v.b("\n\n\n\n\n=====================\n"))))));
        } catch (Exception e) {
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, x.c(R.string.mn_feedback)));
    }
}
