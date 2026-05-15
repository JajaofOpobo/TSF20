package com.ksmobile.launcher.cmbase.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        SharedPreferences sharedPreferencesE = e(context);
        if (TextUtils.isEmpty(b)) {
            b = a(context, "cn");
            if (!TextUtils.isEmpty(b)) {
                c = a(context, "cn2");
                a(sharedPreferencesE, b, c);
            }
        }
        com.ksmobile.a.b.d.a("Channel", "initChannel cn %s   cn2 %s", b, c);
    }

    private static void a(SharedPreferences sharedPreferences, String str, String str2) {
        b = str == null ? "" : str;
        c = str2 == null ? "" : str2;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("channel", str);
        editorEdit.putString("channel2", str2);
        editorEdit.commit();
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

    private static String a(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[ItemInfo.APP_VERSION_CODE];
                int i = 0;
                do {
                    int i2 = inputStreamOpen.read(bArr, i, bArr.length - i);
                    if (i2 == -1) {
                        break;
                    }
                    i += i2;
                } while (i != bArr.length);
                String strTrim = new String(bArr, 0, i).trim();
                if (inputStreamOpen == null) {
                    return strTrim;
                }
                try {
                    inputStreamOpen.close();
                    return strTrim;
                } catch (IOException e) {
                    return strTrim;
                }
            } catch (IOException e2) {
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
        } catch (Throwable th3) {
            inputStreamOpen = null;
            th = th3;
        }
    }
}
