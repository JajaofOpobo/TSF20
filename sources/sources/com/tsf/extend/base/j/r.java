package com.tsf.extend.base.j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class r {
    protected static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest b;
    protected static MessageDigest c;

    static {
        b = null;
        c = null;
        try {
            c = MessageDigest.getInstance("MD5");
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(r.class.getName() + "failure");
            e.printStackTrace();
        }
    }

    public static String a(String str) {
        return a(str.getBytes());
    }

    public static synchronized String a(byte[] bArr) {
        c.update(bArr);
        return b(c.digest());
    }

    private static String b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            a(bArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    private static void a(byte b2, StringBuilder sb) {
        char c2 = a[(b2 & 240) >> 4];
        char c3 = a[b2 & 15];
        sb.append(c2);
        sb.append(c3);
    }
}
