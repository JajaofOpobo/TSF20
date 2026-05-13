package android.support.p002v4.p007c;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* renamed from: android.support.v4.c.c */
/* loaded from: classes.dex */
class C0136c {

    /* renamed from: a */
    private static Method f403a;

    /* renamed from: b */
    private static Method f404b;

    static {
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f403a = cls.getMethod("getScript", String.class);
                f404b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e) {
            f403a = null;
            f404b = null;
            Log.w("ICUCompatIcs", e);
        }
    }

    /* renamed from: a */
    public static String m13419a(Locale locale) {
        String m13418b = m13418b(locale);
        if (m13418b != null) {
            return m13420a(m13418b);
        }
        return null;
    }

    /* renamed from: a */
    private static String m13420a(String str) {
        try {
            if (f403a != null) {
                return (String) f403a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return null;
    }

    /* renamed from: b */
    private static String m13418b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f404b != null) {
                return (String) f404b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return locale2;
    }
}
