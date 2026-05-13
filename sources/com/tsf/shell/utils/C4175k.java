package com.tsf.shell.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
/* renamed from: com.tsf.shell.utils.k */
/* loaded from: classes.dex */
public class C4175k {
    /* renamed from: a */
    public static void m671a(Activity activity, String str) {
        boolean z = false;
        switch (z) {
            case false:
            case true:
                m672a(activity, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                return;
            case true:
                m672a(activity, new Intent("android.intent.action.VIEW", Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + str)));
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static void m670b(Activity activity, String str) {
        m672a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: c */
    public static String m669c(Activity activity, String str) {
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

    /* renamed from: a */
    public static void m672a(Activity activity, Intent intent) {
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
        }
    }
}
