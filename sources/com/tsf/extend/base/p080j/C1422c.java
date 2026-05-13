package com.tsf.extend.base.p080j;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.tsf.extend.base.j.c */
/* loaded from: classes.dex */
public class C1422c {

    /* renamed from: a */
    private static boolean f4406a;

    /* renamed from: b */
    private static String f4407b = "";

    /* renamed from: c */
    private static String f4408c = "";

    /* renamed from: a */
    public static String m8697a(Context context) {
        if (!f4406a) {
            synchronized (C1422c.class) {
                if (!f4406a) {
                    m8693c(context);
                }
            }
        }
        return f4407b;
    }

    /* renamed from: a */
    private static void m8695a(SharedPreferences sharedPreferences, String str, String str2) {
        f4407b = str == null ? "" : str;
        f4408c = str2 == null ? "" : str2;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("channel", str);
        edit.putString("channel2", str2);
        edit.apply();
    }

    /* renamed from: b */
    private static SharedPreferences m8694b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("channel", 0);
        f4407b = sharedPreferences.getString("referrer", "");
        if (TextUtils.isEmpty(f4407b)) {
            f4407b = sharedPreferences.getString("channel", "");
        }
        if (!TextUtils.isEmpty(f4407b)) {
            f4408c = sharedPreferences.getString("channel2", "");
        }
        return sharedPreferences;
    }

    /* renamed from: c */
    private static void m8693c(Context context) {
        f4406a = true;
        SharedPreferences m8694b = m8694b(context);
        if (TextUtils.isEmpty(f4407b)) {
            f4407b = m8696a(context, "cn");
            if (!TextUtils.isEmpty(f4407b)) {
                f4408c = m8696a(context, "cn2");
                m8695a(m8694b, f4407b, f4408c);
            }
        }
    }

    /* renamed from: a */
    private static String m8696a(Context context, String str) {
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
