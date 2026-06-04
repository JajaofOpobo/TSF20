package com.tsf.shell.d;

import android.content.Context;
import android.util.Base64;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.b.z;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a {
    private Context a;

    private a(Context context) {
        this.a = context;
    }

    private static byte[] a(Context context) {
        InputStream inputStream;
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            inputStream = context.getResources().openRawResource(R.raw.chelpus);
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e2) {
                    byteArrayOutputStream = null;
                    e = e2;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 1024);
                        if (read <= 0) {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    inputStream.close();
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                throw th;
            }
        } catch (Exception e7) {
            inputStream = null;
            e = e7;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            inputStream.close();
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] b() {
        try {
            return a(a(this.a), a(this.a.getPackageManager().getPackageInfo("com.tsf.shell", 64).signatures[0].toCharsString()));
        } catch (Exception e) {
            return null;
        }
    }

    private static String a(String str) {
        String str2 = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            str2 = stringBuffer.toString().substring(8, 24);
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str2;
        }
    }

    private static byte[] a(byte[] bArr, String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() != 16) {
                return null;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("ASCII"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
            try {
                return cipher.doFinal(Base64.decode(bArr, 0));
            } catch (Exception e) {
                return null;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0201 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VObject3dContainer a() {
        FileOutputStream fileOutputStream;
        String str = String.valueOf(com.censivn.C3DEngine.a.c().getFilesDir().getAbsolutePath()) + "/";
        byte[] bArr = {115, 104, 101, 108, 108, 95, 119, 105, 100, 103, 101, 116, 95, 114, 101, 115, 105, 122, 101, 95, 99, 111, 109, 112, 108, 101, 116, 101, 95, 98, 117, 116, 116, 111, 110, 46, 112, 110, 103};
        String str2 = "com.tsf.shell.plugin.WidgetDemo";
        String str3 = "shell.apk";
        File file = new File(String.valueOf(str) + str3);
        ?? r1 = (file.length() > com.censivn.C3DEngine.a.c().getResources().getAssets().openFd(String.valueOf("theme/shell/") + "shell.png").getLength() ? 1 : (file.length() == com.censivn.C3DEngine.a.c().getResources().getAssets().openFd(String.valueOf("theme/shell/") + "shell.png").getLength() ? 0 : -1));
        if (r1 != 0) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    byte[] b = new a(com.censivn.C3DEngine.a.c()).b();
                    fileOutputStream = new FileOutputStream(String.valueOf(str) + str3);
                    try {
                        fileOutputStream.write(b);
                        z.b = b;
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            r1 = fileOutputStream;
                        } catch (Exception e) {
                            e.printStackTrace();
                            r1 = fileOutputStream;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        r1 = fileOutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                r1 = fileOutputStream;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                r1 = fileOutputStream;
                            }
                        }
                        if (!file.exists()) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = r1;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
        }
        if (!file.exists()) {
            Class loadClass = new DexClassLoader(file.toString(), com.censivn.C3DEngine.a.c().getFilesDir().getAbsolutePath(), null, com.censivn.C3DEngine.a.c().getClassLoader()).loadClass(str2);
            return (VObject3dContainer) loadClass.getMethod("getWidget", Object.class, Integer.class).invoke(loadClass.newInstance(), Home.d(), 0);
        }
        return null;
    }
}
