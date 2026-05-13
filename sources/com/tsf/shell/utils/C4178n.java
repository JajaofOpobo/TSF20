package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import com.tsf.C1306b;
/* renamed from: com.tsf.shell.utils.n */
/* loaded from: classes.dex */
public class C4178n {
    /* renamed from: a */
    public static void m666a(Activity activity) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"service@tsfui.com", ""});
        String m627a = C4185u.m627a(activity);
        intent.putExtra("android.intent.extra.SUBJECT", m627a + " " + activity.getString(C1306b.C1315i.mn_feedback));
        intent.putExtra("android.intent.extra.TITLE", m627a + " " + activity.getString(C1306b.C1315i.mn_feedback));
        String str = "\n\n\n\n\n=====================\n";
        try {
            str = C4185u.m619c(activity, C4185u.m618d(activity, C4185u.m622b(activity, C4185u.m626a(activity, C4185u.m625a(C4185u.m621b("\n\n\n\n\n=====================\n"))))));
        } catch (Exception e) {
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, C4189x.m588c(C1306b.C1315i.mn_feedback)));
    }
}
