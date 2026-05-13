package com.cm.kinfoc;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* loaded from: classes.dex */
public class q {
    public static boolean a = false;
    private static Object b = new Object();

    public static boolean a(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (com.cm.kinfoc.a.b.A().a()) {
            synchronized (b) {
                File e = com.cm.kinfoc.a.b.A().e();
                if (e != null) {
                    Log.d("filesDir", e.getAbsolutePath());
                    String absolutePath = e.getAbsolutePath();
                    if (absolutePath != null) {
                        boolean a2 = a(context, "kfmt.dat", absolutePath + File.separatorChar + "kfmt.dat");
                        boolean a3 = a(context, "kctrl.dat", absolutePath + File.separatorChar + "kctrl.dat");
                        if (a2 && a3) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
        try {
            return com.cm.kinfoc.a.b.A().k();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:9|(6:11|12|13|15|16|(1:(3:19|20|22)(1:26))(12:27|28|29|30|31|32|33|34|35|(2:36|(1:38)(1:39))|40|(3:42|43|45)(1:49)))(1:85))|29|30|31|32|33|34|35|(3:36|(0)(0)|38)|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a2, code lost:
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: Exception -> 0x0061, all -> 0x0099, LOOP:0: B:28:0x0056->B:30:0x005c, LOOP_END, TRY_LEAVE, TryCatch #11 {Exception -> 0x0061, all -> 0x0099, blocks: (B:23:0x0048, B:24:0x004c, B:27:0x0054, B:28:0x0056, B:30:0x005c, B:39:0x006f), top: B:72:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006f A[EDGE_INSN: B:84:0x006f->B:39:0x006f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 1
            r3 = 0
            r1 = 0
            if (r8 != 0) goto L7
            r0 = r1
        L6:
            return r0
        L7:
            android.content.res.AssetManager r5 = r8.getAssets()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            boolean r2 = r4.exists()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            if (r2 == 0) goto L6d
            boolean r2 = r4.isFile()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            if (r2 == 0) goto L6a
            com.cm.kinfoc.a.b r2 = com.cm.kinfoc.a.b.A()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            java.lang.String r6 = r2.a(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            java.io.InputStream r2 = r5.open(r9)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L8a java.lang.Exception -> L9c
        L28:
            com.cm.kinfoc.a.b r7 = com.cm.kinfoc.a.b.A()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
            java.lang.String r7 = r7.a(r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
            if (r6 == 0) goto L44
            if (r2 == 0) goto L6
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L6
        L3c:
            r1 = move-exception
            r1.printStackTrace()
            goto L6
        L41:
            r2 = move-exception
            r2 = r3
            goto L28
        L44:
            r4.delete()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
            r4 = r2
        L48:
            java.io.InputStream r2 = r5.open(r9)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99 java.io.IOException -> La1
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99 java.io.IOException -> La4
            r5.<init>(r10)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99 java.io.IOException -> La4
            r3 = r5
        L52:
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
        L56:
            int r6 = r2.read(r5)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
            if (r6 <= 0) goto L6f
            r7 = 0
            r3.write(r5, r7, r6)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
            goto L56
        L61:
            r0 = move-exception
            r3 = r4
        L63:
            if (r3 == 0) goto La6
            r3.close()     // Catch: java.io.IOException -> L83
            r0 = r1
            goto L6
        L6a:
            com.cm.kinfoc.f.b(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
        L6d:
            r4 = r3
            goto L48
        L6f:
            r2.close()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
            r3.flush()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
            r3.close()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L99
            if (r4 == 0) goto L6
            r4.close()     // Catch: java.io.IOException -> L7e
            goto L6
        L7e:
            r1 = move-exception
            r1.printStackTrace()
            goto L6
        L83:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L6
        L8a:
            r0 = move-exception
        L8b:
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.io.IOException -> L91
        L90:
            throw r0
        L91:
            r1 = move-exception
            r1.printStackTrace()
            goto L90
        L96:
            r0 = move-exception
            r3 = r2
            goto L8b
        L99:
            r0 = move-exception
            r3 = r4
            goto L8b
        L9c:
            r0 = move-exception
            goto L63
        L9e:
            r0 = move-exception
            r3 = r2
            goto L63
        La1:
            r2 = move-exception
            r2 = r3
            goto L52
        La4:
            r5 = move-exception
            goto L52
        La6:
            r0 = r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.kinfoc.q.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static void a(String str) {
    }

    public static String a(boolean z, boolean z2, int i) {
        if (z2) {
            if (z) {
                return "infoc_force_get";
            }
            return "infoc_get";
        } else if (z) {
            return "infoc_force_" + Integer.toString(i);
        } else {
            return "infoc_" + Integer.toString(i);
        }
    }

    public static File a(Context context, int i) {
        return a(c(context, i));
    }

    public static File b(Context context, int i) {
        return a(d(context, i));
    }

    public static File b(Context context) {
        return a(com.cm.kinfoc.a.b.A().e());
    }

    public static File c(Context context, int i) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return null;
        }
        return new File(filesDir, "infoc_" + Integer.toString(i));
    }

    public static File d(Context context, int i) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return null;
        }
        return new File(filesDir, "infoc_force_" + Integer.toString(i));
    }

    public static File a(File file) {
        if (file == null) {
            return null;
        }
        if (file.isDirectory() && file.exists()) {
            return file;
        }
        return null;
    }

    public static long a(long j) {
        return (long) (((System.currentTimeMillis() - j) / 86400000) + 0.5d);
    }

    public static byte[] a(Context context, String str, int i, String str2) {
        try {
            return a.c(str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            if (com.cm.kinfoc.a.b.A().l()) {
                return null;
            }
            com.cm.kinfoc.a.b.A().c(true);
            a();
            return null;
        }
    }

    public static int b(Context context, String str, int i, String str2) {
        byte[] a2 = a(context, str, i, str2);
        if (a2 != null) {
            return a2.length;
        }
        return 0;
    }

    public static void a() {
        String message;
        String readLine;
        long j = 0;
        String g = com.cm.kinfoc.a.b.A().g();
        String h = com.cm.kinfoc.a.b.A().h();
        File file = new File(g);
        long length = (file.exists() && file.isFile()) ? file.length() : 0L;
        File file2 = new File(h);
        if (file2.exists() && file2.isFile()) {
            j = file2.length();
        }
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            bufferedReader.readLine();
            while (true) {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    readLine = "";
                    break;
                } else if (readLine.contains(com.cm.kinfoc.a.b.A().f())) {
                    break;
                }
            }
            str = readLine;
            message = "";
        } catch (Exception e) {
            message = e.getMessage();
        }
        throw new RuntimeException("" + g + ":" + length + "--" + h + ":" + j + "--mem: " + str + "--exp:" + message);
    }

    public static int e(Context context, int i) {
        File a2 = a(context, i);
        if (a2 != null) {
            return f.d(a2.getAbsolutePath());
        }
        return 0;
    }

    public static File f(Context context, int i) {
        File d = d(context, i);
        if (d == null) {
            return null;
        }
        if (d.exists()) {
            if (d.isFile()) {
                d.delete();
                d.mkdir();
            }
        } else {
            d.mkdir();
        }
        if (!d.exists()) {
            d = null;
        }
        return d;
    }

    public static File g(Context context, int i) {
        File c = c(context, i);
        if (c == null) {
            return null;
        }
        if (c.exists()) {
            if (c.isFile()) {
                c.delete();
                c.mkdir();
            }
        } else {
            c.mkdir();
        }
        if (!c.exists()) {
            c = null;
        }
        return c;
    }

    public static File h(Context context, int i) {
        return a(new File(context.getCacheDir() + File.separator + a(false, false, i)));
    }

    public static File i(Context context, int i) {
        return a(new File(context.getCacheDir() + File.separator + a(true, false, i)));
    }
}
