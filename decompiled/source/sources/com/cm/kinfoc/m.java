package com.cm.kinfoc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
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
            int b = this.g.b();
            this.f.a(b);
            k.a().a(this.g, this.c, this.d, b, this.b);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Thread {
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
        String a2;
        if (str2 != null && "uuid".equalsIgnoreCase(str2) && (str == null || "00000000000000000000000000000000".equals(str))) {
            String a3 = com.cm.kinfoc.a.b.A().a(str2);
            if (a3 == null || a3.length() == 0) {
                return "00000000000000000000000000000000";
            }
            return a3;
        } else if (str == null || str.equals("")) {
            if (str2 == null || (a2 = com.cm.kinfoc.a.b.A().a(str2)) == null || a2.equals("")) {
                return null;
            }
            return a2;
        } else {
            if (str2 != null && !str2.equals("")) {
                com.cm.kinfoc.a.b.A().a(str2, str);
            }
            return str;
        }
    }

    public static String a(Context context) {
        String a2;
        int i2 = 1;
        q = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        sb.append("xaid=");
        String a3 = a(com.cm.kinfoc.a.b.A().r(), "xaid");
        if (a3 == null) {
            a3 = "";
        }
        sb.append(a3);
        sb.append("&mcc=");
        String a4 = o.a(context);
        sb.append((int) (!TextUtils.isEmpty(a4) ? Short.valueOf(a4).shortValue() : (short) 0));
        sb.append("&ver=");
        String b = com.ksmobile.launcher.cmbase.utils.b.b();
        if (b == null) {
            b = "0";
        }
        sb.append(b);
        sb.append("&cn=");
        String p2 = com.cm.kinfoc.a.b.A().p();
        if (TextUtils.isEmpty(p2)) {
            p2 = "10000000";
        }
        sb.append(p2);
        sb.append("&cn2=");
        String o2 = com.cm.kinfoc.a.b.A().o();
        if (o2 == "") {
            o2 = "empty";
        }
        sb.append(o2);
        sb.append("&cl=");
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        if (country == null || country.equals("") || language == null || language.equals("")) {
            a2 = a((String) null, "cl");
        } else {
            a2 = a(country + "_" + language, "cl");
        }
        if (a2 == null) {
            a2 = "NONE";
        }
        sb.append(a2);
        sb.append("&apilevel=" + com.cm.kinfoc.a.b.A().s());
        sb.append("&brand=");
        String a5 = a(o.a(), "brand");
        if (a5 == null) {
            a5 = "";
        }
        sb.append(a5);
        sb.append("&model=");
        String a6 = a(o.b(), "model");
        if (a6 == null) {
            a6 = "";
        }
        sb.append(a6);
        sb.append("&rom=" + (com.cm.kinfoc.a.b.A().v() ? 1 : 0));
        sb.append("&root=" + (com.cm.kinfoc.a.b.A().q() ? 1 : 0));
        int c = o.c(context);
        if (c != 4 && c != 8 && c != 16) {
            i2 = c;
        }
        sb.append("&nettype=" + i2);
        sb.append("&mnc=");
        String a7 = a(o.b(context), "mnc");
        if (a7 == null) {
            a7 = "-1";
        }
        sb.append(Short.valueOf(a7));
        return sb.toString();
    }

    public boolean a(String str, boolean z) {
        boolean booleanValue;
        if (!TextUtils.isEmpty(str) && this.g != null) {
            synchronized (this.n) {
                if (!z) {
                    Boolean bool = this.m.get(str);
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    }
                }
                int b = this.g.b(str);
                if (b == 0) {
                    this.m.put(str, false);
                    booleanValue = false;
                } else if (b < 10000 && ((int) (com.cm.kinfoc.a.b.A().n() * 10000.0d)) > b) {
                    this.m.put(str, false);
                    booleanValue = false;
                } else {
                    this.m.put(str, true);
                    booleanValue = true;
                }
            }
            return booleanValue;
        }
        return false;
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
        int a2;
        boolean z2 = false;
        if (!i || !this.e || this.b == null || this.c == null || this.g == null || this.f == null) {
            return false;
        }
        if ((j || z) && a(str, false) && (a2 = this.g.a(str)) != 0) {
            if (a2 >= 10000 || ((int) (com.cm.kinfoc.a.b.A().n() * 10000.0d)) <= a2) {
                Log.d("KInfoc", "tableName: " + str + " dataString: " + str2 + ",mProductId: " + this.d);
                Log.d("KInfoc", this.c);
                byte[] a3 = a(str, str2, this.c, this.d, this.b);
                if (a3 == null) {
                    if (q.a) {
                        Log.d("KInfoc", "getData return null " + str2);
                    }
                    if (com.cm.kinfoc.a.b.A().m() || new File("/sdcard/__test_infoc__").exists()) {
                        throw new NullPointerException("infoc data format error, see logcat for more details. table name: " + str + ": " + str2);
                    }
                    return false;
                }
                if (z) {
                    this.f.a(a3, str, z, iVar);
                } else {
                    this.f.a(this.c, this.d, com.cm.kinfoc.a.b.A().e().getAbsolutePath(), a3, str, z, 0);
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
