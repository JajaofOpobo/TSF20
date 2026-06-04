package com.tsf.shell.f;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[EDGE_INSN: B:30:0x007e->B:31:0x007e BREAK  A[LOOP:0: B:25:0x0078->B:29:0x0091], EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, String str) {
        Exception e;
        File file;
        byte[] bArr;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int read;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream3 = null;
        InputStream inputStream2 = null;
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return "";
        }
        String str2 = String.valueOf((Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null).toString()) + "/TSFSHELL";
        File file2 = new File(str2);
        String str3 = String.valueOf(str2) + "/tef_shell_social.png";
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = new File(str3);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                bArr = new byte[1024];
                inputStream = context.getAssets().open(str);
                try {
                    fileOutputStream2 = new FileOutputStream(file, false);
                    while (true) {
                        try {
                            read = inputStream.read(bArr);
                            if (read > 0) {
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Exception e3) {
                            e = e3;
                            inputStream2 = inputStream;
                            fileOutputStream = fileOutputStream2;
                            try {
                                e.printStackTrace();
                                try {
                                    inputStream2.close();
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Exception e4) {
                                }
                                return str3;
                            } catch (Throwable th) {
                                th = th;
                                InputStream inputStream3 = inputStream2;
                                fileOutputStream3 = fileOutputStream;
                                inputStream = inputStream3;
                                try {
                                    inputStream.close();
                                    fileOutputStream3.flush();
                                    fileOutputStream3.close();
                                } catch (Exception e5) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream3 = fileOutputStream2;
                            inputStream.close();
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            throw th;
                        }
                    }
                    inputStream.close();
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception e6) {
                    e = e6;
                    fileOutputStream = null;
                    inputStream2 = inputStream;
                } catch (Throwable th3) {
                    th = th3;
                }
                return str3;
            }
        } catch (Exception e7) {
            e = e7;
            file = null;
        }
        bArr = new byte[1024];
        try {
            inputStream = context.getAssets().open(str);
            fileOutputStream2 = new FileOutputStream(file, false);
            while (true) {
                read = inputStream.read(bArr);
                if (read > 0) {
                    try {
                        break;
                    } catch (Exception e8) {
                    }
                } else {
                    fileOutputStream2.write(bArr, 0, read);
                }
            }
            inputStream.close();
            fileOutputStream2.flush();
            fileOutputStream2.close();
        } catch (Exception e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
        return str3;
    }
}
