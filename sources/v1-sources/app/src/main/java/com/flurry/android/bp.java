package com.flurry.android;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* loaded from: classes.dex */
final class bp {
    static String a(String str) {
        return str == null ? "" : str.length() > 255 ? str.substring(0, 255) : str;
    }

    static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Cdo.e("FlurryAgent", "Cannot encode '" + str + "'");
            return "";
        }
    }

    private static String f(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Cdo.e("FlurryAgent", "Cannot decode '" + str + "'");
            return "";
        }
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    static byte[] c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(), 0, str.length());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            Cdo.b("FlurryAgent", "Unsupported SHA1: " + e.getMessage());
            return null;
        }
    }

    static boolean a(long j) {
        if (System.currentTimeMillis() > j) {
            return false;
        }
        return true;
    }

    static boolean a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    static HttpResponse a(String str, boolean z) {
        try {
            HttpGet httpGet = new HttpGet(str);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 15000);
            basicHttpParams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(z));
            return da.a(basicHttpParams).execute(httpGet);
        } catch (UnknownHostException e) {
            Cdo.a("FlurryAgent", "Unknown host: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            Cdo.a("FlurryAgent", "Failed to hit URL: " + str, e2);
            return null;
        }
    }

    static int a(Context context, int i) {
        return Math.round(i / context.getResources().getDisplayMetrics().density);
    }

    static int b(Context context, int i) {
        return Math.round(context.getResources().getDisplayMetrics().density * i);
    }

    static int a(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    static int b(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    static int c(Context context) {
        return a(context, a(context));
    }

    static int d(Context context) {
        return a(context, b(context));
    }

    static String d(String str) {
        return str.replace("'", "\\'").replace("\\n", "").replace("\\r", "").replace("\\t", "");
    }

    static Map e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (!split[0].equals("event")) {
                    hashMap.put(f(split[0]), f(split[1]));
                }
            }
        }
        return hashMap;
    }
}
