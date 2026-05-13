package com.tsf.extend.base.j;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Set;
/* loaded from: classes.dex */
public class m {
    private static String a = "";

    public static void a(String str) {
        if (str != null) {
            a = str;
        }
    }

    public static String a() {
        return a;
    }

    @TargetApi(11)
    public static String a(String str, String str2, String str3) {
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

    public static boolean a(Context context, String str) {
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
        return a(context, (str.startsWith("market://") || (indexOf = str.indexOf("?")) < 0) ? str : "market://details" + str.substring(indexOf), str);
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
