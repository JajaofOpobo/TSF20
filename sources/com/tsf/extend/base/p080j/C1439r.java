package com.tsf.extend.base.p080j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.tsf.extend.base.j.r */
/* loaded from: classes.dex */
public class C1439r {

    /* renamed from: a */
    protected static char[] f4438a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    protected static MessageDigest f4439b;

    /* renamed from: c */
    protected static MessageDigest f4440c;

    static {
        f4439b = null;
        f4440c = null;
        try {
            f4440c = MessageDigest.getInstance("MD5");
            f4439b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(C1439r.class.getName() + "failure");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m8606a(String str) {
        return m8605a(str.getBytes());
    }

    /* renamed from: a */
    public static synchronized String m8605a(byte[] bArr) {
        String m8603b;
        synchronized (C1439r.class) {
            f4440c.update(bArr);
            m8603b = m8603b(f4440c.digest());
        }
        return m8603b;
    }

    /* renamed from: b */
    private static String m8603b(byte[] bArr) {
        return m8604a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static String m8604a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            m8607a(bArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m8607a(byte b, StringBuilder sb) {
        char c = f4438a[(b & 240) >> 4];
        char c2 = f4438a[b & 15];
        sb.append(c);
        sb.append(c2);
    }
}
