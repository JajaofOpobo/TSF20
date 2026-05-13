package com.flurry.sdk;

import android.content.Intent;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.flurry.sdk.fe */
/* loaded from: classes.dex */
public final class C1277fe {

    /* renamed from: a */
    private static final String f4049a = C1277fe.class.getSimpleName();

    /* renamed from: a */
    public static String m9150a(String str) {
        return m9149a(str, 255);
    }

    /* renamed from: a */
    public static String m9149a(String str, int i) {
        if (str == null) {
            return "";
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    /* renamed from: b */
    public static String m9146b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1258eo.m9234a(5, f4049a, "Cannot encode '" + str + "'");
            return "";
        }
    }

    /* renamed from: c */
    public static String m9145c(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C1258eo.m9234a(5, f4049a, "Cannot decode '" + str + "'");
            return "";
        }
    }

    /* renamed from: a */
    public static void m9152a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: d */
    public static byte[] m9144d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(), 0, str.length());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            C1258eo.m9234a(6, f4049a, "Unsupported SHA1: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m9148a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (byte b : bArr) {
            sb.append(cArr[(byte) ((b & 240) >> 4)]);
            sb.append(cArr[(byte) (b & 15)]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m9154a(long j) {
        if (j != 0 && System.currentTimeMillis() > j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m9153a(Intent intent) {
        return C1211do.m9390a().m9383c().queryIntentActivities(intent, 65536).size() > 0;
    }

    /* renamed from: b */
    public static boolean m9147b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return C1211do.m9390a().m9386b().getPackageName().equals(intent.resolveActivity(C1211do.m9390a().m9383c()).getPackageName());
    }

    /* renamed from: e */
    public static String m9143e(String str) {
        return str.replace("'", "\\'").replace("\\n", "").replace("\\r", "").replace("\\t", "");
    }

    /* renamed from: f */
    public static Map<String, String> m9142f(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (!split[0].equals("event")) {
                    hashMap.put(m9145c(split[0]), m9145c(split[1]));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    public static long m9141g(String str) {
        if (str == null) {
            return 0L;
        }
        long j = 1125899906842597L;
        int i = 0;
        while (i < str.length()) {
            i++;
            j = str.charAt(i) + (j * 31);
        }
        return j;
    }

    /* renamed from: a */
    public static long m9151a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }
}
