package com.tsf.extend.base.j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    public static boolean a(InputStream inputStream, String str, String str2, String str3) {
        return a(2, inputStream, str, str2, str3);
    }

    private static boolean a(int i, InputStream inputStream, String str, String str2, String str3) throws Throwable {
        Cipher cipherA;
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
            if (0 == 0) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        try {
            try {
                cipherA = a(i, str2, str3);
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
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipherA);
            byte[] bArr = new byte[2048];
            for (int i2 = cipherInputStream.read(bArr); i2 >= 0; i2 = cipherInputStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, i2);
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
                    z = false;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    z = false;
                }
            } else {
                z = false;
            }
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

    private static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private static Cipher a(int i, String str, String str2) {
        Cipher cipher;
        Exception e;
        try {
            byte[] bArrA = a(str);
            byte[] bArrA2 = a(str2);
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                cipher.init(i, new SecretKeySpec(bArrA, "AES"), new IvParameterSpec(bArrA2, 0, cipher.getBlockSize()));
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            cipher = null;
            e = e3;
        }
        return cipher;
    }
}
