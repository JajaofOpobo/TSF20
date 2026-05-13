package com.ksmobile.p063a.p065b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.ksmobile.a.b.e */
/* loaded from: classes.dex */
public class C1286e {

    /* renamed from: a */
    protected static char[] f4070a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    protected static MessageDigest f4071b;

    /* renamed from: c */
    protected static MessageDigest f4072c;

    static {
        f4071b = null;
        f4072c = null;
        try {
            f4072c = MessageDigest.getInstance("MD5");
            f4071b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(C1286e.class.getName() + "failure");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m9117a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    f4071b.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return m9115a(f4071b.digest());
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m9116a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    f4072c.update(bArr, 0, read);
                } else {
                    inputStream.close();
                    return m9115a(f4072c.digest());
                }
            } catch (Exception e) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static String m9115a(byte[] bArr) {
        return m9114a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static String m9114a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            m9118a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static void m9118a(byte b, StringBuffer stringBuffer) {
        char c = f4070a[(b & 240) >> 4];
        char c2 = f4070a[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }
}
