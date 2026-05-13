package com.tsf.extend.base.p080j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.tsf.extend.base.j.a */
/* loaded from: classes.dex */
public class C1418a {
    /* renamed from: a */
    public static boolean m8710a(InputStream inputStream, String str, String str2, String str3) {
        return m8712a(2, inputStream, str, str2, str3);
    }

    /* renamed from: a */
    private static boolean m8712a(int i, InputStream inputStream, String str, String str2, String str3) {
        Cipher m8711a;
        FileOutputStream fileOutputStream;
        boolean z = true;
        FileOutputStream fileOutputStream2 = null;
        if (i != 1 && i != 2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (0 != 0) {
                try {
                    fileOutputStream2.close();
                    return false;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
            return false;
        }
        try {
            try {
                m8711a = m8711a(i, str2, str3);
                File file = new File(str);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, m8711a);
            byte[] bArr = new byte[2048];
            for (int read = cipherInputStream.read(bArr); read >= 0; read = cipherInputStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                    z = false;
                }
            }
            z = false;
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
        return z;
    }

    /* renamed from: a */
    private static byte[] m8709a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    private static Cipher m8711a(int i, String str, String str2) {
        Cipher cipher;
        Exception e;
        try {
            byte[] m8709a = m8709a(str);
            byte[] m8709a2 = m8709a(str2);
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                cipher.init(i, new SecretKeySpec(m8709a, "AES"), new IvParameterSpec(m8709a2, 0, cipher.getBlockSize()));
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return cipher;
            }
        } catch (Exception e3) {
            cipher = null;
            e = e3;
        }
        return cipher;
    }
}
