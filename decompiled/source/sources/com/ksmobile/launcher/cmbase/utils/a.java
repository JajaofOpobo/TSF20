package com.ksmobile.launcher.cmbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class a {
    private static boolean a;
    private static String b = "";
    private static String c = "";

    public static void a(Context context) {
        com.ksmobile.a.b.d.a("Channel", "setDefaultChannel");
        if (TextUtils.isEmpty(b(context))) {
            a(context, "10000000", (String) null);
        }
    }

    public static String b(Context context) {
        if (!a) {
            synchronized (a.class) {
                if (!a) {
                    d(context);
                }
            }
        }
        return b;
    }

    public static String c(Context context) {
        if (!a) {
            synchronized (a.class) {
                if (!a) {
                    d(context);
                }
            }
        }
        return c;
    }

    public static void a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(b)) {
            synchronized (a.class) {
                if (!a) {
                    d(context);
                }
                if (TextUtils.isEmpty(b)) {
                    a(context.getSharedPreferences("channel", 0), str, str2);
                }
            }
        }
    }

    private static void d(Context context) {
        a = true;
        SharedPreferences e = e(context);
        if (TextUtils.isEmpty(b)) {
            b = a(context, "cn");
            if (!TextUtils.isEmpty(b)) {
                c = a(context, "cn2");
                a(e, b, c);
            }
        }
        com.ksmobile.a.b.d.a("Channel", "initChannel cn %s   cn2 %s", b, c);
    }

    private static void a(SharedPreferences sharedPreferences, String str, String str2) {
        b = str == null ? "" : str;
        c = str2 == null ? "" : str2;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("channel", str);
        edit.putString("channel2", str2);
        edit.commit();
        com.ksmobile.a.b.d.a("Channel", "setChannel to sp cn %s   cn2 %s ", str, str2);
    }

    private static SharedPreferences e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("channel", 0);
        if (TextUtils.isEmpty(b)) {
            b = sharedPreferences.getString("channel", "");
        }
        if (!TextUtils.isEmpty(b)) {
            c = sharedPreferences.getString("channel2", "");
        }
        return sharedPreferences;
    }

    private static String a(Context context, String str) {
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
