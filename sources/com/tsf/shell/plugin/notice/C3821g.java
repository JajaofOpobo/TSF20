package com.tsf.shell.plugin.notice;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* renamed from: com.tsf.shell.plugin.notice.g */
/* loaded from: classes.dex */
public class C3821g {

    /* renamed from: com.tsf.shell.plugin.notice.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3823a {
        /* renamed from: a */
        void mo1360a(int i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tsf.shell.plugin.notice.g$1] */
    /* renamed from: a */
    public static void m1366a(final Context context, final InterfaceC3823a interfaceC3823a, final boolean z) {
        if (m1362c(context)) {
            new Thread() { // from class: com.tsf.shell.plugin.notice.g.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    C3821g.m1361c(context, interfaceC3823a, z);
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m1361c(Context context, InterfaceC3823a interfaceC3823a, boolean z) {
        Element element = null;
        try {
            element = m1368a(context);
        } catch (Exception e) {
            C3817e.m1369c(e.getMessage());
        }
        if (element != null) {
            m1364b(context);
            String attribute = element.getAttribute("duration");
            if (!attribute.equals("")) {
                int intValue = Integer.valueOf(attribute).intValue();
                C3817e.m1369c("duration:" + intValue);
                m1367a(context, intValue);
            }
            NodeList elementsByTagName = element.getElementsByTagName("update");
            if (elementsByTagName.getLength() > 0) {
                C3814b.m1375a(context, elementsByTagName, interfaceC3823a, z);
            }
            NodeList elementsByTagName2 = element.getElementsByTagName("recommend");
            if (elementsByTagName2.getLength() > 0) {
                C3813a.m1377a(context, elementsByTagName2);
            }
        }
    }

    /* renamed from: a */
    private static Element m1368a(Context context) {
        String str = "http://gcm.tsfui.com/app_update.php?hl=" + Locale.getDefault().getLanguage() + "&tab=" + Locale.getDefault().getCountry() + "&pid=" + context.getSharedPreferences("update_info", 0).getInt("prev_data_id", 0);
        C3817e.m1369c("RequestUpdate:" + str);
        return C3815c.m1374a(str);
    }

    /* renamed from: a */
    public static boolean m1365a(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m1367a(Context context, int i) {
        C3817e.m1369c("saveDurationTime duration:" + i);
        int i2 = i <= 604800000 ? i : 604800000;
        if (i2 < 0) {
            i2 = 0;
        }
        context.getSharedPreferences("update_info", 0).edit().putLong("check_update_duration", i2).commit();
    }

    /* renamed from: b */
    private static void m1364b(Context context) {
        context.getSharedPreferences("update_info", 0).edit().putLong("prev_update_time", System.currentTimeMillis()).commit();
    }

    /* renamed from: c */
    private static boolean m1362c(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = context.getSharedPreferences("update_info", 0).getLong("prev_update_time", 0L);
        long j2 = context.getSharedPreferences("update_info", 0).getLong("check_update_duration", 86400000L);
        C3817e.m1369c("now :" + currentTimeMillis);
        C3817e.m1370b("prev :" + j);
        C3817e.m1371a("dura :" + j2);
        if (j2 == 0) {
            C3817e.m1369c("dura Error true");
            return true;
        } else if (j == 0) {
            C3817e.m1369c("prev Error true");
            return true;
        } else if (currentTimeMillis < j) {
            C3817e.m1369c("now < prev Error true");
            return true;
        } else if (currentTimeMillis - j > j2) {
            C3817e.m1369c("(now - prev) > dura normal true");
            return true;
        } else {
            C3817e.m1369c("No error no need update");
            return false;
        }
    }
}
