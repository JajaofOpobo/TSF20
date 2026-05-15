package com.tsf.extend.base;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static String a = "";

    public static void a(String str) {
        if (str != null) {
            a = str;
        }
    }

    public static String a() {
        return a;
    }

    public static boolean a(Context context, String str) {
        int iIndexOf;
        if (context == null || str == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
            }
        }
        return a(context, (str.startsWith("market://") || (iIndexOf = str.indexOf("?")) < 0) ? str : "market://details" + str.substring(iIndexOf), str);
    }

    public static boolean a(Context context, String str, String str2) {
        if (context == null || str == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
            }
        }
        if (str2 != null && !str.equals(str2)) {
            intent.setData(Uri.parse(str2));
            intent.addFlags(268435456);
            if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                try {
                    context.startActivity(intent);
                    return true;
                } catch (ActivityNotFoundException e2) {
                }
            }
        }
        return false;
    }
}
