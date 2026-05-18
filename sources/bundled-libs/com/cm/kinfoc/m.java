package com.cm.kinfoc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class m {
    private static m h = null;
    private static boolean i = false;
    private static boolean j = true;
    private static String o = null;
    private static String p = null;
    private static long q = 0;
    private static int r = 0;
    private static Object s = new Object();
    private Context a;
    private String b = null;
    private String c = null;
    private int d = 98;
    private boolean e = true;
    private p f = null;
    private j g = null;
    private int k = 0;
    private Object l = new Object();
    private Map<String, Boolean> m = new com.ksmobile.a.b.a();
    private Object n = new Object();

    private m(Context context) {
        this.a = null;
        this.a = context;
        if (this.a != null) {
            f();
        }
    }

    private synchronized void f() {
        try {
            this.b = com.cm.kinfoc.a.b.A().e().getAbsolutePath();
            this.c = a(this.a);
            this.g = new j(this.a);
            this.f = new p(this.a, this.g);
            this.d = this.g.a();
            int iB = this.g.b();
            this.f.a(iB);
            k.a().a(this.g, this.c, this.d, iB, this.b);
            if (this.c == null) {
                b(false);
            }
        } catch (Exception e) {
            this.b = null;
            k.a().a(null, null, -1, 0, null);
            this.c = null;
            this.g = null;
            this.f = null;
            this.d = 0;
            b(false);
        }
    }

    public static m a() {
        m mVar;
        synchronized (s) {
            if (h == null) {
                h = new m(com.cm.kinfoc.a.b.A().b());
            }
            if (h.c != null && (o == null || p == null)) {
                m mVar2 = h;
                long j2 = r * 5 * 1000;
                m mVar3 = h;
                if (j2 + q < System.currentTimeMillis()) {
                    m mVar4 = h;
                    if (r < 6) {
                        r++;
                        h.c = a(h.a);
                        com.cm.kinfoc.a.c.a().a(" read imei in getinstance, again ");
                    }
                }
            }
            mVar = h;
        }
        return mVar;
    }

    public static void a(boolean z) {
        if (!i) {
            new a(z).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean b() {
        /*
            r2 = 0
            java.lang.Class<com.cm.kinfoc.m> r4 = com.cm.kinfoc.m.class
            monitor-enter(r4)
            boolean r0 = c()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lc
        La:
            monitor-exit(r4)
            return r0
        Lc:
            com.cm.kinfoc.m$a r0 = new com.cm.kinfoc.m$a     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r0.run()     // Catch: java.lang.Throwable -> L20
            r1 = 5
        L16:
            boolean r0 = c()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L23
            a()     // Catch: java.lang.Throwable -> L20
            goto La
        L20:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L23:
            r6 = 100
            java.lang.Thread.sleep(r6)     // Catch: java.lang.Throwable -> L20 java.lang.InterruptedException -> L2e
        L28:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto La
            r1 = r3
            goto L16
        L2e:
            r1 = move-exception
            r1 = r2
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.kinfoc.m.b():boolean");
    }

    private static class a extends Thread {
        private static Object b = new Object();
        private boolean a;

        public a(boolean z) {
            this.a = false;
            this.a = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (b) {
                if (!m.c()) {
                    boolean unused = m.j = true;
                    if (!com.cm.kinfoc.a.b.A().i()) {
                        boolean unused2 = m.j = false;
                    }
                    if (!q.a(com.cm.kinfoc.a.b.A().b())) {
                        m.e(false);
                        return;
                    }
                    if (com.cm.kinfoc.a.b.A().b(this.a)) {
                        m.e(true);
                    } else {
                        m.e(false);
                    }
                    if (m.c() && com.cm.kinfoc.a.b.A().a()) {
                        m.a().d();
                    }
                }
            }
        }
    }

    public static boolean c() {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(boolean z) {
        i = z;
    }

    public void b(boolean z) {
        this.e = z;
        if (this.f != null) {
            this.f.a(z);
        }
    }

    public static String a(String str, String str2) {
        String strA;
        if (str2 != null && "uuid".equalsIgnoreCase(str2) && (str == null || "00000000000000000000000000000000".equals(str))) {
            String strA2 = com.cm.kinfoc.a.b.A().a(str2);
            if (strA2 == null || strA2.length() == 0) {
                return "00000000000000000000000000000000";
            }
            return strA2;
        }
        if (str == null || str.equals("")) {
            if (str2 == null || (strA = com.cm.kinfoc.a.b.A().a(str2)) == null || strA.equals("")) {
                return null;
            }
            return strA;
        }
        if (str2 != null && !str2.equals("")) {
            com.cm.kinfoc.a.b.A().a(str2, str);
        }
        return str;
    }

    public static String a(Context context) {
        String strA;
        int i2 = 1;
        q = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        sb.append("xaid=");
        String strA2 = a(com.cm.kinfoc.a.b.A().r(), "xaid");
        if (strA2 == null) {
            strA2 = "";
        }
        sb.append(strA2);
        sb.append("&mcc=");
        String strA3 = o.a(context);
        sb.append((int) (!TextUtils.isEmpty(strA3) ? Short.valueOf(strA3).shortValue() : (short) 0));
        sb.append("&ver=");
        String strB = com.ksmobile.launcher.cmbase.utils.b.b();
        if (strB == null) {
            strB = "0";
        }
        sb.append(strB);
        sb.append("&cn=");
        String strP = com.cm.kinfoc.a.b.A().p();
        if (TextUtils.isEmpty(strP)) {
            strP = "10000000";
        }
        sb.append(strP);
        sb.append("&cn2=");
        String strO = com.cm.kinfoc.a.b.A().o();
        if (strO == "") {
            strO = "empty";
        }
        sb.append(strO);
        sb.append("&cl=");
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        if (country == null || country.equals("") || language == null || language.equals("")) {
            strA = a((String) null, "cl");
        } else {
            strA = a(country + "_" + language, "cl");
        }
        if (strA == null) {
            strA = "NONE";
        }
        sb.append(strA);
        sb.append("&apilevel=" + com.cm.kinfoc.a.b.A().s());
        sb.append("&brand=");
        String strA4 = a(o.a(), "brand");
        if (strA4 == null) {
            strA4 = "";
        }
        sb.append(strA4);
        sb.append("&model=");
        String strA5 = a(o.b(), "model");
        if (strA5 == null) {
            strA5 = "";
        }
        sb.append(strA5);
        sb.append("&rom=" + (com.cm.kinfoc.a.b.A().v() ? 1 : 0));
        sb.append("&root=" + (com.cm.kinfoc.a.b.A().q() ? 1 : 0));
        int iC = o.c(context);
        if (iC != 4 && iC != 8 && iC != 16) {
            i2 = iC;
        }
        sb.append("&nettype=" + i2);
        sb.append("&mnc=");
        String strA6 = a(o.b(context), "mnc");
        if (strA6 == null) {
            strA6 = "-1";
        }
        sb.append(Short.valueOf(strA6));
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:12:0x0015, B:14:0x001f, B:15:0x0023, B:20:0x0028, B:22:0x0030, B:23:0x003a, B:27:0x0041, B:29:0x0052, B:30:0x005c, B:32:0x005f, B:33:0x0069), top: B:36:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            r2 = 1
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto La
            r0 = r1
        L9:
            return r0
        La:
            com.cm.kinfoc.j r0 = r8.g
            if (r0 != 0) goto L10
            r0 = r1
            goto L9
        L10:
            java.lang.Object r3 = r8.n
            monitor-enter(r3)
            if (r10 != 0) goto L28
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r8.m     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L25
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L28
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            goto L9
        L25:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r0
        L28:
            com.cm.kinfoc.j r0 = r8.g     // Catch: java.lang.Throwable -> L25
            int r0 = r0.b(r9)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L3d
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r8.m     // Catch: java.lang.Throwable -> L25
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L25
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            r0 = r1
            goto L9
        L3d:
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r0 >= r4) goto L5f
            com.cm.kinfoc.a.b r4 = com.cm.kinfoc.a.b.A()     // Catch: java.lang.Throwable -> L25
            double r4 = r4.n()     // Catch: java.lang.Throwable -> L25
            r6 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r4 = r4 * r6
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L25
            if (r4 <= r0) goto L5f
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r8.m     // Catch: java.lang.Throwable -> L25
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L25
            r0.put(r9, r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            r0 = r1
            goto L9
        L5f:
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r8.m     // Catch: java.lang.Throwable -> L25
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L25
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            r0 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cm.kinfoc.m.a(java.lang.String, boolean):boolean");
    }

    public boolean b(String str, String str2) {
        if (this.a == null || str2 == null) {
            return false;
        }
        return a(str, str2, false);
    }

    public boolean c(String str, String str2) {
        if (this.a == null || str2 == null) {
            return false;
        }
        return a(str, str2, true);
    }

    private boolean a(String str, String str2, boolean z) {
        return a(str, str2, z, null);
    }

    private boolean a(String str, String str2, boolean z, i iVar) {
        int iA;
        boolean z2 = false;
        if (!i || !this.e || this.b == null || this.c == null || this.g == null || this.f == null) {
            return false;
        }
        if ((j || z) && a(str, false) && (iA = this.g.a(str)) != 0) {
            if (iA < 10000 && ((int) (com.cm.kinfoc.a.b.A().n() * 10000.0d)) > iA) {
                return true;
            }
            Log.d("KInfoc", "tableName: " + str + " dataString: " + str2 + ",mProductId: " + this.d);
            Log.d("KInfoc", this.c);
            byte[] bArrA = a(str, str2, this.c, this.d, this.b);
            if (bArrA == null) {
                if (q.a) {
                    Log.d("KInfoc", "getData return null " + str2);
                }
                if (com.cm.kinfoc.a.b.A().m() || new File("/sdcard/__test_infoc__").exists()) {
                    throw new NullPointerException("infoc data format error, see logcat for more details. table name: " + str + ": " + str2);
                }
                return false;
            }
            if (z) {
                this.f.a(bArrA, str, z, iVar);
            } else {
                this.f.a(this.c, this.d, com.cm.kinfoc.a.b.A().e().getAbsolutePath(), bArrA, str, z, 0);
                synchronized (this.l) {
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 >= k.d) {
                        this.k = 0;
                        z2 = true;
                    }
                }
                if (z2) {
                    e();
                }
            }
            return true;
        }
        return true;
    }

    public void d() {
        if (this.f != null) {
            this.f.c();
        }
    }

    public void e() {
        if (i && this.e && j) {
            if (com.cm.kinfoc.a.b.A().a()) {
                k.a().b();
                return;
            }
            try {
                com.cm.kinfoc.a.b.A().j();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private byte[] a(String str, String str2, String str3, int i2, String str4) {
        try {
            return com.cm.kinfoc.a.a(str, str2, str3, i2, str4);
        } catch (Exception e) {
            return null;
        }
    }
}
