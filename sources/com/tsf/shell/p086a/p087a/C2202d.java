package com.tsf.shell.p086a.p087a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.p002v4.app.C0062a;
import android.support.p002v4.content.C0159h;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tsf.shell.a.a.d */
/* loaded from: classes.dex */
public class C2202d {

    /* renamed from: a */
    public static final String[] f7234a = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* renamed from: b */
    public static final String[] f7235b = {"android.permission.READ_CONTACTS"};

    /* renamed from: c */
    public static final String[] f7236c;

    /* renamed from: d */
    public static final String[] f7237d;

    /* renamed from: e */
    public static final String[] f7238e;

    /* renamed from: f */
    public static final String[] f7239f;

    /* renamed from: g */
    public static final String[] f7240g;

    /* renamed from: h */
    public static final String[] f7241h;

    /* renamed from: i */
    public static final String[] f7242i;

    /* renamed from: com.tsf.shell.a.a.d$a */
    /* loaded from: classes.dex */
    public enum EnumC2203a {
        AUTHORIZED,
        USER_CLICK_AGREE_AUTH,
        USER_SETTING_AUTH,
        USER_REJECT_AUTH,
        SYSTEM_CANCEL_AUTH
    }

    /* renamed from: com.tsf.shell.a.a.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2204b {
        /* renamed from: a */
        void mo152a(int i, boolean z, EnumC2203a enumC2203a);
    }

    static {
        f7236c = Build.VERSION.SDK_INT >= 28 ? new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG"} : new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CALL_LOG"};
        f7237d = Build.VERSION.SDK_INT >= 28 ? new String[]{"android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"} : f7236c;
        f7238e = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        f7239f = new String[]{"android.permission.RECORD_AUDIO"};
        f7240g = new String[]{"android.permission.CAMERA"};
        f7241h = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        f7242i = new String[]{"android.permission.READ_SMS"};
    }

    /* renamed from: a */
    public static boolean m6092a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: a */
    public static boolean m6090a(Context context, String... strArr) {
        return m6092a() && !m6088c(context, strArr);
    }

    /* renamed from: b */
    public static List<String> m6089b(Context context, String... strArr) {
        if (m6092a()) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (C0159h.m13381a(context, str) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m6088c(Context context, String... strArr) {
        for (String str : strArr) {
            if (C0159h.m13381a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m6091a(Activity activity, int i, String... strArr) {
        if (m6090a(activity, strArr)) {
            List<String> m6089b = m6089b(activity, strArr);
            if (m6089b != null) {
                C0062a.m13697a(activity, (String[]) m6089b.toArray(new String[m6089b.size()]), i);
            }
            return false;
        }
        return true;
    }
}
