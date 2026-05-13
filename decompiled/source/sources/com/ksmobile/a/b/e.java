package com.ksmobile.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public class e {
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
            System.err.println(e.class.getName() + "failure");
            e.printStackTrace();
        }
    }

    public static String a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    b.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return a(b.digest());
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    c.update(bArr, 0, read);
                } else {
                    inputStream.close();
                    return a(c.digest());
                }
            } catch (Exception e) {
                return null;
            }
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char c2 = a[(b2 & 240) >> 4];
        char c3 = a[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}
