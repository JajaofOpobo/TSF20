package com.tsf.shell.g;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class d {
    public static void a(Activity activity, String str) {
        a(activity, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
    }

    private static void a(Activity activity, Intent intent) {
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
        }
    }

    public static void b(Activity activity, String str) {
        a(activity, new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=" + str)));
    }
}
