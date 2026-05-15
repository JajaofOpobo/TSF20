package com.cm.kinfoc;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
                File fileE = com.cm.kinfoc.a.b.A().e();
                if (fileE != null) {
                    Log.d("filesDir", fileE.getAbsolutePath());
                    String absolutePath = fileE.getAbsolutePath();
                    if (absolutePath != null) {
                        boolean zA = a(context, "kfmt.dat", absolutePath + File.separatorChar + "kfmt.dat");
                        boolean zA2 = a(context, "kctrl.dat", absolutePath + File.separatorChar + "kctrl.dat");
                        if (zA && zA2) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
        try {
            return com.cm.kinfoc.a.b.A().k();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:80|6)|(2:8|(7:10|74|11|81|12|(1:(3:78|15|92)(1:85))(12:21|22|72|23|70|24|25|26|27|(2:28|(1:30)(1:84))|39|(3:76|41|93)(1:88))|(4:68|35|36|87)(2:65|91))(1:37))|38|72|23|70|24|25|26|27|(3:28|(0)(0)|30)|39|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:80|6|(2:8|(7:10|74|11|81|12|(1:(3:78|15|92)(1:85))(12:21|22|72|23|70|24|25|26|27|(2:28|(1:30)(1:84))|39|(3:76|41|93)(1:88))|(4:68|35|36|87)(2:65|91))(1:37))|38|72|23|70|24|25|26|27|(3:28|(0)(0)|30)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a2, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: Exception -> 0x0061, all -> 0x0099, LOOP:0: B:28:0x0056->B:30:0x005c, LOOP_END, TRY_LEAVE, TryCatch #11 {Exception -> 0x0061, all -> 0x0099, blocks: (B:23:0x0048, B:24:0x004c, B:27:0x0054, B:28:0x0056, B:30:0x005c, B:39:0x006f), top: B:72:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006f A[EDGE_INSN: B:84:0x006f->B:39:0x006f BREAK  A[LOOP:0: B:28:0x0056->B:30:0x005c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10) throws java.lang.Throwable {
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
        }
        if (z) {
            return "infoc_force_" + Integer.toString(i);
        }
        return "infoc_" + Integer.toString(i);
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
        byte[] bArrA = a(context, str, i, str2);
        if (bArrA != null) {
            return bArrA.length;
        }
        return 0;
    }

    public static void a() {
        String message;
        String line;
        long length = 0;
        String strG = com.cm.kinfoc.a.b.A().g();
        String strH = com.cm.kinfoc.a.b.A().h();
        File file = new File(strG);
        long length2 = (file.exists() && file.isFile()) ? file.length() : 0L;
        File file2 = new File(strH);
        if (file2.exists() && file2.isFile()) {
            length = file2.length();
        }
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            bufferedReader.readLine();
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    line = "";
                    break;
                } else if (line.contains(com.cm.kinfoc.a.b.A().f())) {
                    break;
                }
            }
            str = line;
            message = "";
        } catch (Exception e) {
            message = e.getMessage();
        }
        throw new RuntimeException("" + strG + ":" + length2 + "--" + strH + ":" + length + "--mem: " + str + "--exp:" + message);
    }

    public static int e(Context context, int i) {
        File fileA = a(context, i);
        if (fileA != null) {
            return f.d(fileA.getAbsolutePath());
        }
        return 0;
    }

    public static File f(Context context, int i) {
        File fileD = d(context, i);
        if (fileD == null) {
            return null;
        }
        if (fileD.exists()) {
            if (fileD.isFile()) {
                fileD.delete();
                fileD.mkdir();
            }
        } else {
            fileD.mkdir();
        }
        if (!fileD.exists()) {
            fileD = null;
        }
        return fileD;
    }

    public static File g(Context context, int i) {
        File fileC = c(context, i);
        if (fileC == null) {
            return null;
        }
        if (fileC.exists()) {
            if (fileC.isFile()) {
                fileC.delete();
                fileC.mkdir();
            }
        } else {
            fileC.mkdir();
        }
        if (!fileC.exists()) {
            fileC = null;
        }
        return fileC;
    }

    public static File h(Context context, int i) {
        return a(new File(context.getCacheDir() + File.separator + a(false, false, i)));
    }

    public static File i(Context context, int i) {
        return a(new File(context.getCacheDir() + File.separator + a(true, false, i)));
    }
}
