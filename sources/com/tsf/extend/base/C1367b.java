package com.tsf.extend.base;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* renamed from: com.tsf.extend.base.b */
/* loaded from: classes.dex */
public class C1367b {

    /* renamed from: a */
    private static String f4293a = "";

    /* renamed from: a */
    public static void m8876a(String str) {
        if (str != null) {
            f4293a = str;
        }
    }

    /* renamed from: a */
    public static String m8879a() {
        return f4293a;
    }

    /* renamed from: a */
    public static boolean m8878a(Context context, String str) {
        int indexOf;
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
        return m8877a(context, (str.startsWith("market://") || (indexOf = str.indexOf("?")) < 0) ? str : "market://details" + str.substring(indexOf), str);
    }

    /* renamed from: a */
    public static boolean m8877a(Context context, String str, String str2) {
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
