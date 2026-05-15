package com.tsf.shell.plugin.notice;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {

    public interface a {
        void a(int i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tsf.shell.plugin.notice.g$1] */
    public static void a(final Context context, final a aVar, final boolean z) {
        if (c(context)) {
            new Thread() { // from class: com.tsf.shell.plugin.notice.g.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    g.c(context, aVar, z);
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, a aVar, boolean z) {
        Element elementA = null;
        try {
            elementA = a(context);
        } catch (Exception e) {
            e.c(e.getMessage());
        }
        if (elementA != null) {
            b(context);
            String attribute = elementA.getAttribute("duration");
            if (!attribute.equals("")) {
                int iIntValue = Integer.valueOf(attribute).intValue();
                e.c("duration:" + iIntValue);
                a(context, iIntValue);
            }
            NodeList elementsByTagName = elementA.getElementsByTagName("update");
            if (elementsByTagName.getLength() > 0) {
                b.a(context, elementsByTagName, aVar, z);
            }
            NodeList elementsByTagName2 = elementA.getElementsByTagName("recommend");
            if (elementsByTagName2.getLength() > 0) {
                com.tsf.shell.plugin.notice.a.a(context, elementsByTagName2);
            }
        }
    }

    private static Element a(Context context) {
        String str = "http://gcm.tsfui.com/app_update.php?hl=" + Locale.getDefault().getLanguage() + "&tab=" + Locale.getDefault().getCountry() + "&pid=" + context.getSharedPreferences("update_info", 0).getInt("prev_data_id", 0);
        e.c("RequestUpdate:" + str);
        return c.a(str);
    }

    public static boolean a(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private static void a(Context context, int i) {
        e.c("saveDurationTime duration:" + i);
        int i2 = i <= 604800000 ? i : 604800000;
        if (i2 < 0) {
            i2 = 0;
        }
        context.getSharedPreferences("update_info", 0).edit().putLong("check_update_duration", i2).commit();
    }

    private static void b(Context context) {
        context.getSharedPreferences("update_info", 0).edit().putLong("prev_update_time", System.currentTimeMillis()).commit();
    }

    private static boolean c(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = context.getSharedPreferences("update_info", 0).getLong("prev_update_time", 0L);
        long j2 = context.getSharedPreferences("update_info", 0).getLong("check_update_duration", 86400000L);
        e.c("now :" + jCurrentTimeMillis);
        e.b("prev :" + j);
        e.a("dura :" + j2);
        if (j2 == 0) {
            e.c("dura Error true");
            return true;
        }
        if (j == 0) {
            e.c("prev Error true");
            return true;
        }
        if (jCurrentTimeMillis < j) {
            e.c("now < prev Error true");
            return true;
        }
        if (jCurrentTimeMillis - j > j2) {
            e.c("(now - prev) > dura normal true");
            return true;
        }
        e.c("No error no need update");
        return false;
    }
}
