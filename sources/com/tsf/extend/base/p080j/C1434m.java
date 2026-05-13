package com.tsf.extend.base.p080j;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Set;
/* renamed from: com.tsf.extend.base.j.m */
/* loaded from: classes.dex */
public class C1434m {

    /* renamed from: a */
    private static String f4428a = "";

    /* renamed from: a */
    public static void m8636a(String str) {
        if (str != null) {
            f4428a = str;
        }
    }

    /* renamed from: a */
    public static String m8639a() {
        return f4428a;
    }

    @TargetApi(11)
    /* renamed from: a */
    public static String m8635a(String str, String str2, String str3) {
        if (str == null || !str.contains("referrer")) {
            return str;
        }
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            Uri parse = Uri.parse(str);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                String queryParameter = parse.getQueryParameter(str4);
                if (str4.equals("referrer")) {
                    if (str3 != null) {
                        queryParameter = queryParameter + str3;
                    }
                    if (str2 != null) {
                        queryParameter = queryParameter + str2;
                    }
                }
                clearQuery.appendQueryParameter(str4, queryParameter);
            }
            return clearQuery.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m8638a(Context context, String str) {
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
        return m8637a(context, (str.startsWith("market://") || (indexOf = str.indexOf("?")) < 0) ? str : "market://details" + str.substring(indexOf), str);
    }

    /* renamed from: a */
    public static boolean m8637a(Context context, String str, String str2) {
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
