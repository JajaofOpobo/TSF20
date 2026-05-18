package com.android.volley.toolbox;

import com.android.volley.b;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    public static b.a a(com.android.volley.i iVar) {
        boolean z;
        boolean z2;
        long jA;
        long jA2;
        long j;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = iVar.c;
        long jA3 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = map.get("Date");
        if (str != null) {
            jA3 = a(str);
        }
        String str2 = map.get("Cache-Control");
        if (str2 == null) {
            z = false;
            z2 = false;
        } else {
            String[] strArrSplit = str2.split(",");
            z = false;
            long j5 = 0;
            long j6 = 0;
            for (String str3 : strArrSplit) {
                String strTrim = str3.trim();
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j6 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    try {
                        j5 = Long.parseLong(strTrim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j3 = j6;
            j4 = j5;
            z2 = true;
        }
        String str4 = map.get("Expires");
        if (str4 == null) {
            jA = 0;
        } else {
            jA = a(str4);
        }
        String str5 = map.get("Last-Modified");
        if (str5 == null) {
            jA2 = 0;
        } else {
            jA2 = a(str5);
        }
        String str6 = map.get("ETag");
        if (z2) {
            j2 = jCurrentTimeMillis + (1000 * j3);
            j = z ? j2 : (1000 * j4) + j2;
        } else if (jA3 <= 0 || jA < jA3) {
            j = 0;
            j2 = 0;
        } else {
            j = (jA - jA3) + jCurrentTimeMillis;
            j2 = j;
        }
        b.a aVar = new b.a();
        aVar.a = iVar.b;
        aVar.b = str6;
        aVar.f = j2;
        aVar.e = j;
        aVar.c = jA3;
        aVar.d = jA2;
        aVar.g = map;
        return aVar;
    }

    public static long a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0L;
        }
    }

    public static String a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] strArrSplit = str2.split(";");
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
            return str;
        }
        return str;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }
}
