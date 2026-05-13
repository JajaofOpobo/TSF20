package com.tsf.extend.theme;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class x {
    private static boolean a = false;
    private static String b = "";

    public static void a(String str) {
        a = true;
        b = str;
    }

    private static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("referrer=utm_source%3D");
            if (split.length > 1) {
                String str3 = split[1];
                int indexOf = str3.indexOf("&");
                if (indexOf > 0) {
                    str3 = str3.substring(0, indexOf);
                }
                return str.replace("referrer=utm_source%3D" + str3, "referrer=utm_source%3D" + str2);
            }
            return str;
        }
        return str;
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static void a(Context context, String str, String str2) {
        com.tsf.extend.base.j.q.a("sdfsww", "launch:channel:" + str2);
        b(context, str, null, str2);
    }

    public static void b(Context context, String str, String str2) {
        a(context, str, null, str2);
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 11) {
            str = com.tsf.extend.base.j.m.a(str, com.tsf.extend.base.j.m.a(), str2);
        }
        com.tsf.extend.base.j.m.a(context, str + str3);
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 11) {
            str = com.tsf.extend.base.j.m.a(str, com.tsf.extend.base.j.m.a(), str2);
        }
        if (b(str3)) {
            str = a(str, str3);
        }
        com.tsf.extend.base.j.m.a(context, str);
    }

    public static void a() {
        a = false;
        b = "";
    }
}
