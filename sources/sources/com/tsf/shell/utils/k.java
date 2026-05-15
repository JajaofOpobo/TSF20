package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k {
    public static void a(Activity activity, String str) {
        char c = 0;
        switch (c) {
            case 0:
            case 1:
                a(activity, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                break;
            case '\n':
                a(activity, new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + str)));
                break;
        }
    }

    public static void b(Activity activity, String str) {
        a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static String c(Activity activity, String str) {
        char c = 0;
        switch (c) {
            case 0:
            case 1:
                return "http://play.google.com/store/apps/details?id=" + str;
            case '\n':
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
