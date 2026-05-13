package com.ksmobile.launcher.cmbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.ksmobile.p063a.p065b.C1285d;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.ksmobile.launcher.cmbase.utils.a */
/* loaded from: classes.dex */
public class C1299a {

    /* renamed from: a */
    private static boolean f4104a;

    /* renamed from: b */
    private static String f4105b = "";

    /* renamed from: c */
    private static String f4106c = "";

    /* renamed from: a */
    public static void m9064a(Context context) {
        C1285d.m9120a("Channel", "setDefaultChannel");
        if (TextUtils.isEmpty(m9060b(context))) {
            m9062a(context, "10000000", (String) null);
        }
    }

    /* renamed from: b */
    public static String m9060b(Context context) {
        if (!f4104a) {
            synchronized (C1299a.class) {
                if (!f4104a) {
                    m9058d(context);
                }
            }
        }
        return f4105b;
    }

    /* renamed from: c */
    public static String m9059c(Context context) {
        if (!f4104a) {
            synchronized (C1299a.class) {
                if (!f4104a) {
                    m9058d(context);
                }
            }
        }
        return f4106c;
    }

    /* renamed from: a */
    public static void m9062a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(f4105b)) {
            synchronized (C1299a.class) {
                if (!f4104a) {
                    m9058d(context);
                }
                if (TextUtils.isEmpty(f4105b)) {
                    m9061a(context.getSharedPreferences("channel", 0), str, str2);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m9058d(Context context) {
        f4104a = true;
        SharedPreferences m9057e = m9057e(context);
        if (TextUtils.isEmpty(f4105b)) {
            f4105b = m9063a(context, "cn");
            if (!TextUtils.isEmpty(f4105b)) {
                f4106c = m9063a(context, "cn2");
                m9061a(m9057e, f4105b, f4106c);
            }
        }
        C1285d.m9119a("Channel", "initChannel cn %s   cn2 %s", f4105b, f4106c);
    }

    /* renamed from: a */
    private static void m9061a(SharedPreferences sharedPreferences, String str, String str2) {
        f4105b = str == null ? "" : str;
        f4106c = str2 == null ? "" : str2;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("channel", str);
        edit.putString("channel2", str2);
        edit.commit();
        C1285d.m9119a("Channel", "setChannel to sp cn %s   cn2 %s ", str, str2);
    }

    /* renamed from: e */
    private static SharedPreferences m9057e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("channel", 0);
        if (TextUtils.isEmpty(f4105b)) {
            f4105b = sharedPreferences.getString("channel", "");
        }
        if (!TextUtils.isEmpty(f4105b)) {
            f4106c = sharedPreferences.getString("channel2", "");
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    private static String m9063a(Context context, String str) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
                int i = 0;
                do {
                    int read = inputStream.read(bArr, i, bArr.length - i);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                } while (i != bArr.length);
                String trim = new String(bArr, 0, i).trim();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return trim;
                    } catch (IOException e) {
                        return trim;
                    }
                }
                return trim;
            } catch (IOException e2) {
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
    }
}
