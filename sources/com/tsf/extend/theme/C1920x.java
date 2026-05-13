package com.tsf.extend.theme;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tsf.extend.base.p080j.C1434m;
import com.tsf.extend.base.p080j.C1438q;
/* renamed from: com.tsf.extend.theme.x */
/* loaded from: classes.dex */
public class C1920x {

    /* renamed from: a */
    private static boolean f6165a = false;

    /* renamed from: b */
    private static String f6166b = "";

    /* renamed from: a */
    public static void m7050a(String str) {
        f6165a = true;
        f6166b = str;
    }

    /* renamed from: a */
    private static String m7049a(String str, String str2) {
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

    /* renamed from: b */
    public static boolean m7046b(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public static void m7052a(Context context, String str, String str2) {
        C1438q.m8608a("sdfsww", "launch:channel:" + str2);
        m7047b(context, str, null, str2);
    }

    /* renamed from: b */
    public static void m7048b(Context context, String str, String str2) {
        m7051a(context, str, null, str2);
    }

    /* renamed from: a */
    public static void m7051a(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 11) {
            str = C1434m.m8635a(str, C1434m.m8639a(), str2);
        }
        C1434m.m8638a(context, str + str3);
    }

    /* renamed from: b */
    public static void m7047b(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 11) {
            str = C1434m.m8635a(str, C1434m.m8639a(), str2);
        }
        if (m7046b(str3)) {
            str = m7049a(str, str3);
        }
        C1434m.m8638a(context, str);
    }

    /* renamed from: a */
    public static void m7053a() {
        f6165a = false;
        f6166b = "";
    }
}
