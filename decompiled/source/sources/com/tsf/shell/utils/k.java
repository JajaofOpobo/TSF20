package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public class k {
    public static void a(Activity activity, String str) {
        boolean z = false;
        switch (z) {
            case false:
            case true:
                a(activity, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                return;
            case true:
                a(activity, new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + str)));
                return;
            default:
                return;
        }
    }

    public static void b(Activity activity, String str) {
        a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static String c(Activity activity, String str) {
        boolean z = false;
        switch (z) {
            case false:
            case true:
                return "http://play.google.com/store/apps/details?id=" + str;
            case true:
                return "http://www.amazon.com/gp/mas/dl/android?p=" + str;
            default:
                return "";
        }
    }

    public static void a(Activity activity, Intent intent) {
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
        }
    }
}
