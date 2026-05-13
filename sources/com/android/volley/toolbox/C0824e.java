package com.android.volley.toolbox;

import com.android.volley.C0792i;
import com.android.volley.InterfaceC0781b;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
/* renamed from: com.android.volley.toolbox.e */
/* loaded from: classes.dex */
public class C0824e {
    /* renamed from: a */
    public static InterfaceC0781b.C0782a m10946a(C0792i c0792i) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c0792i.f2282c;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        String str = map.get("Date");
        if (str != null) {
            j5 = m10945a(str);
        }
        String str2 = map.get("Cache-Control");
        if (str2 == null) {
            z = false;
            z2 = false;
        } else {
            String[] split = str2.split(",");
            z = false;
            long j8 = 0;
            long j9 = 0;
            for (String str3 : split) {
                String trim = str3.trim();
                if (trim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(trim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    try {
                        j8 = Long.parseLong(trim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j6 = j9;
            j7 = j8;
            z2 = true;
        }
        String str4 = map.get("Expires");
        if (str4 == null) {
            j = 0;
        } else {
            j = m10945a(str4);
        }
        String str5 = map.get("Last-Modified");
        if (str5 == null) {
            j2 = 0;
        } else {
            j2 = m10945a(str5);
        }
        String str6 = map.get("ETag");
        if (z2) {
            j4 = currentTimeMillis + (1000 * j6);
            j3 = z ? j4 : (1000 * j7) + j4;
        } else if (j5 <= 0 || j < j5) {
            j3 = 0;
            j4 = 0;
        } else {
            j3 = (j - j5) + currentTimeMillis;
            j4 = j3;
        }
        InterfaceC0781b.C0782a c0782a = new InterfaceC0781b.C0782a();
        c0782a.f2250a = c0792i.f2281b;
        c0782a.f2251b = str6;
        c0782a.f2255f = j4;
        c0782a.f2254e = j3;
        c0782a.f2252c = j5;
        c0782a.f2253d = j2;
        c0782a.f2256g = map;
        return c0782a;
    }

    /* renamed from: a */
    public static long m10945a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0L;
        }
    }

    /* renamed from: a */
    public static String m10943a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
            return str;
        }
        return str;
    }

    /* renamed from: a */
    public static String m10944a(Map<String, String> map) {
        return m10943a(map, "ISO-8859-1");
    }
}
