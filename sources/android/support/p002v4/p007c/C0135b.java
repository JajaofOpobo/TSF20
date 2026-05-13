package android.support.p002v4.p007c;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* renamed from: android.support.v4.c.b */
/* loaded from: classes.dex */
class C0135b {

    /* renamed from: a */
    private static Method f402a;

    static {
        try {
            f402a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static String m13421a(Locale locale) {
        try {
            return ((Locale) f402a.invoke(null, locale)).getScript();
        } catch (IllegalAccessException e) {
            Log.w("ICUCompatIcs", e);
            return locale.getScript();
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompatIcs", e2);
            return locale.getScript();
        }
    }
}
