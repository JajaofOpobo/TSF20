package com.p060cm.kinfoc;

import android.content.Context;
import android.util.Log;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* renamed from: com.cm.kinfoc.q */
/* loaded from: classes.dex */
public class C1171q {

    /* renamed from: a */
    public static boolean f3721a = false;

    /* renamed from: b */
    private static Object f3722b = new Object();

    /* renamed from: a */
    public static boolean m9609a(Context context) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (AbstractC1130b.m9785A().mo9784a()) {
            synchronized (f3722b) {
                File mo9768e = AbstractC1130b.m9785A().mo9768e();
                if (mo9768e != null) {
                    Log.d("filesDir", mo9768e.getAbsolutePath());
                    String absolutePath = mo9768e.getAbsolutePath();
                    if (absolutePath != null) {
                        boolean m9606a = m9606a(context, "kfmt.dat", absolutePath + File.separatorChar + "kfmt.dat");
                        boolean m9606a2 = m9606a(context, "kctrl.dat", absolutePath + File.separatorChar + "kctrl.dat");
                        if (m9606a && m9606a2) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
        try {
            return AbstractC1130b.m9785A().mo9762k();
        } catch (Exception e) {
            e.printStackTrace();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m9606a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
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
            com.cm.kinfoc.a.b r2 = com.p060cm.kinfoc.p062a.AbstractC1130b.m9785A()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            java.lang.String r6 = r2.mo9779a(r4)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
            java.io.InputStream r2 = r5.open(r9)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L8a java.lang.Exception -> L9c
        L28:
            com.cm.kinfoc.a.b r7 = com.p060cm.kinfoc.p062a.AbstractC1130b.m9785A()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
            java.lang.String r7 = r7.mo9778a(r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9e
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
            com.p060cm.kinfoc.C1143f.m9736b(r10)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L9c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p060cm.kinfoc.C1171q.m9606a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static void m9604a(String str) {
    }

    /* renamed from: a */
    public static String m9603a(boolean z, boolean z2, int i) {
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

    /* renamed from: a */
    public static File m9608a(Context context, int i) {
        return m9605a(m9599c(context, i));
    }

    /* renamed from: b */
    public static File m9601b(Context context, int i) {
        return m9605a(m9598d(context, i));
    }

    /* renamed from: b */
    public static File m9602b(Context context) {
        return m9605a(AbstractC1130b.m9785A().mo9768e());
    }

    /* renamed from: c */
    public static File m9599c(Context context, int i) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return null;
        }
        return new File(filesDir, "infoc_" + Integer.toString(i));
    }

    /* renamed from: d */
    public static File m9598d(Context context, int i) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return null;
        }
        return new File(filesDir, "infoc_force_" + Integer.toString(i));
    }

    /* renamed from: a */
    public static File m9605a(File file) {
        if (file == null) {
            return null;
        }
        if (file.isDirectory() && file.exists()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    public static long m9610a(long j) {
        return (long) (((System.currentTimeMillis() - j) / 86400000) + 0.5d);
    }

    /* renamed from: a */
    public static byte[] m9607a(Context context, String str, int i, String str2) {
        try {
            return C1125a.m9798c(str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            if (AbstractC1130b.m9785A().mo9761l()) {
                return null;
            }
            AbstractC1130b.m9785A().mo9770c(true);
            m9611a();
            return null;
        }
    }

    /* renamed from: b */
    public static int m9600b(Context context, String str, int i, String str2) {
        byte[] m9607a = m9607a(context, str, i, str2);
        if (m9607a != null) {
            return m9607a.length;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m9611a() {
        String message;
        String readLine;
        long j = 0;
        String mo9766g = AbstractC1130b.m9785A().mo9766g();
        String mo9765h = AbstractC1130b.m9785A().mo9765h();
        File file = new File(mo9766g);
        long length = (file.exists() && file.isFile()) ? file.length() : 0L;
        File file2 = new File(mo9765h);
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
                } else if (readLine.contains(AbstractC1130b.m9785A().mo9767f())) {
                    break;
                }
            }
            str = readLine;
            message = "";
        } catch (Exception e) {
            message = e.getMessage();
        }
        throw new RuntimeException("" + mo9766g + ":" + length + "--" + mo9765h + ":" + j + "--mem: " + str + "--exp:" + message);
    }

    /* renamed from: e */
    public static int m9597e(Context context, int i) {
        File m9608a = m9608a(context, i);
        if (m9608a != null) {
            return C1143f.m9734d(m9608a.getAbsolutePath());
        }
        return 0;
    }

    /* renamed from: f */
    public static File m9596f(Context context, int i) {
        File m9598d = m9598d(context, i);
        if (m9598d == null) {
            return null;
        }
        if (m9598d.exists()) {
            if (m9598d.isFile()) {
                m9598d.delete();
                m9598d.mkdir();
            }
        } else {
            m9598d.mkdir();
        }
        if (!m9598d.exists()) {
            m9598d = null;
        }
        return m9598d;
    }

    /* renamed from: g */
    public static File m9595g(Context context, int i) {
        File m9599c = m9599c(context, i);
        if (m9599c == null) {
            return null;
        }
        if (m9599c.exists()) {
            if (m9599c.isFile()) {
                m9599c.delete();
                m9599c.mkdir();
            }
        } else {
            m9599c.mkdir();
        }
        if (!m9599c.exists()) {
            m9599c = null;
        }
        return m9599c;
    }

    /* renamed from: h */
    public static File m9594h(Context context, int i) {
        return m9605a(new File(context.getCacheDir() + File.separator + m9603a(false, false, i)));
    }

    /* renamed from: i */
    public static File m9593i(Context context, int i) {
        return m9605a(new File(context.getCacheDir() + File.separator + m9603a(true, false, i)));
    }
}
