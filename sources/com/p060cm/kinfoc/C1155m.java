package com.p060cm.kinfoc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ksmobile.launcher.cmbase.utils.C1300b;
import com.ksmobile.p063a.p065b.C1281a;
import com.p060cm.kinfoc.p062a.AbstractC1130b;
import com.p060cm.kinfoc.p062a.C1131c;
import java.io.File;
import java.util.Locale;
import java.util.Map;
/* renamed from: com.cm.kinfoc.m */
/* loaded from: classes.dex */
public class C1155m {

    /* renamed from: h */
    private static C1155m f3658h = null;

    /* renamed from: i */
    private static boolean f3659i = false;

    /* renamed from: j */
    private static boolean f3660j = true;

    /* renamed from: o */
    private static String f3661o = null;

    /* renamed from: p */
    private static String f3662p = null;

    /* renamed from: q */
    private static long f3663q = 0;

    /* renamed from: r */
    private static int f3664r = 0;

    /* renamed from: s */
    private static Object f3665s = new Object();

    /* renamed from: a */
    private Context f3666a;

    /* renamed from: b */
    private String f3667b = null;

    /* renamed from: c */
    private String f3668c = null;

    /* renamed from: d */
    private int f3669d = 98;

    /* renamed from: e */
    private boolean f3670e = true;

    /* renamed from: f */
    private C1164p f3671f = null;

    /* renamed from: g */
    private C1149j f3672g = null;

    /* renamed from: k */
    private int f3673k = 0;

    /* renamed from: l */
    private Object f3674l = new Object();

    /* renamed from: m */
    private Map<String, Boolean> f3675m = new C1281a();

    /* renamed from: n */
    private Object f3676n = new Object();

    private C1155m(Context context) {
        this.f3666a = null;
        this.f3666a = context;
        if (this.f3666a != null) {
            m9660f();
        }
    }

    /* renamed from: f */
    private synchronized void m9660f() {
        try {
            this.f3667b = AbstractC1130b.m9785A().mo9768e().getAbsolutePath();
            this.f3668c = m9677a(this.f3666a);
            this.f3672g = new C1149j(this.f3666a);
            this.f3671f = new C1164p(this.f3666a, this.f3672g);
            this.f3669d = this.f3672g.m9714a();
            int m9710b = this.f3672g.m9710b();
            this.f3671f.m9642a(m9710b);
            C1150k.m9707a().m9704a(this.f3672g, this.f3668c, this.f3669d, m9710b, this.f3667b);
            if (this.f3668c == null) {
                m9668b(false);
            }
        } catch (Exception e) {
            this.f3667b = null;
            C1150k.m9707a().m9704a(null, null, -1, 0, null);
            this.f3668c = null;
            this.f3672g = null;
            this.f3671f = null;
            this.f3669d = 0;
            m9668b(false);
        }
    }

    /* renamed from: a */
    public static C1155m m9678a() {
        C1155m c1155m;
        synchronized (f3665s) {
            if (f3658h == null) {
                f3658h = new C1155m(AbstractC1130b.m9785A().mo9773b());
            }
            if (f3658h.f3668c != null && (f3661o == null || f3662p == null)) {
                C1155m c1155m2 = f3658h;
                long j = f3664r * 5 * 1000;
                C1155m c1155m3 = f3658h;
                if (j + f3663q < System.currentTimeMillis()) {
                    C1155m c1155m4 = f3658h;
                    if (f3664r < 6) {
                        f3664r++;
                        f3658h.f3668c = m9677a(f3658h.f3666a);
                        C1131c.m9746a().m9745a(" read imei in getinstance, again ");
                    }
                }
            }
            c1155m = f3658h;
        }
        return c1155m;
    }

    /* renamed from: a */
    public static void m9671a(boolean z) {
        if (!f3659i) {
            new C1156a(z).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        m9678a();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean m9670b() {
        /*
            r2 = 0
            java.lang.Class<com.cm.kinfoc.m> r4 = com.p060cm.kinfoc.C1155m.class
            monitor-enter(r4)
            boolean r0 = m9667c()     // Catch: java.lang.Throwable -> L20
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
            boolean r0 = m9667c()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L23
            m9678a()     // Catch: java.lang.Throwable -> L20
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
        throw new UnsupportedOperationException("Method not decompiled: com.p060cm.kinfoc.C1155m.m9670b():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.cm.kinfoc.m$a */
    /* loaded from: classes.dex */
    public static class C1156a extends Thread {

        /* renamed from: b */
        private static Object f3677b = new Object();

        /* renamed from: a */
        private boolean f3678a;

        public C1156a(boolean z) {
            this.f3678a = false;
            this.f3678a = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (f3677b) {
                if (!C1155m.m9667c()) {
                    boolean unused = C1155m.f3660j = true;
                    if (!AbstractC1130b.m9785A().mo9764i()) {
                        boolean unused2 = C1155m.f3660j = false;
                    }
                    if (!C1171q.m9609a(AbstractC1130b.m9785A().mo9773b())) {
                        C1155m.m9661e(false);
                        return;
                    }
                    if (AbstractC1130b.m9785A().mo9772b(this.f3678a)) {
                        C1155m.m9661e(true);
                    } else {
                        C1155m.m9661e(false);
                    }
                    if (C1155m.m9667c() && AbstractC1130b.m9785A().mo9784a()) {
                        C1155m.m9678a().m9664d();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m9667c() {
        return f3659i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m9661e(boolean z) {
        f3659i = z;
    }

    /* renamed from: b */
    public void m9668b(boolean z) {
        this.f3670e = z;
        if (this.f3671f != null) {
            this.f3671f.m9635a(z);
        }
    }

    /* renamed from: a */
    public static String m9676a(String str, String str2) {
        String mo9777a;
        if (str2 != null && "uuid".equalsIgnoreCase(str2) && (str == null || "00000000000000000000000000000000".equals(str))) {
            String mo9777a2 = AbstractC1130b.m9785A().mo9777a(str2);
            if (mo9777a2 == null || mo9777a2.length() == 0) {
                return "00000000000000000000000000000000";
            }
            return mo9777a2;
        } else if (str == null || str.equals("")) {
            if (str2 == null || (mo9777a = AbstractC1130b.m9785A().mo9777a(str2)) == null || mo9777a.equals("")) {
                return null;
            }
            return mo9777a;
        } else {
            if (str2 != null && !str2.equals("")) {
                AbstractC1130b.m9785A().mo9775a(str2, str);
            }
            return str;
        }
    }

    /* renamed from: a */
    public static String m9677a(Context context) {
        String m9676a;
        int i = 1;
        f3663q = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        sb.append("xaid=");
        String m9676a2 = m9676a(AbstractC1130b.m9785A().mo9755r(), "xaid");
        if (m9676a2 == null) {
            m9676a2 = "";
        }
        sb.append(m9676a2);
        sb.append("&mcc=");
        String m9650a = C1163o.m9650a(context);
        sb.append((int) (!TextUtils.isEmpty(m9650a) ? Short.valueOf(m9650a).shortValue() : (short) 0));
        sb.append("&ver=");
        String m9053b = C1300b.m9053b();
        if (m9053b == null) {
            m9053b = "0";
        }
        sb.append(m9053b);
        sb.append("&cn=");
        String mo9757p = AbstractC1130b.m9785A().mo9757p();
        if (TextUtils.isEmpty(mo9757p)) {
            mo9757p = "10000000";
        }
        sb.append(mo9757p);
        sb.append("&cn2=");
        String mo9758o = AbstractC1130b.m9785A().mo9758o();
        if (mo9758o == "") {
            mo9758o = "empty";
        }
        sb.append(mo9758o);
        sb.append("&cl=");
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        if (country == null || country.equals("") || language == null || language.equals("")) {
            m9676a = m9676a((String) null, "cl");
        } else {
            m9676a = m9676a(country + "_" + language, "cl");
        }
        if (m9676a == null) {
            m9676a = "NONE";
        }
        sb.append(m9676a);
        sb.append("&apilevel=" + AbstractC1130b.m9785A().mo9754s());
        sb.append("&brand=");
        String m9676a3 = m9676a(C1163o.m9651a(), "brand");
        if (m9676a3 == null) {
            m9676a3 = "";
        }
        sb.append(m9676a3);
        sb.append("&model=");
        String m9676a4 = m9676a(C1163o.m9649b(), "model");
        if (m9676a4 == null) {
            m9676a4 = "";
        }
        sb.append(m9676a4);
        sb.append("&rom=" + (AbstractC1130b.m9785A().mo9751v() ? 1 : 0));
        sb.append("&root=" + (AbstractC1130b.m9785A().mo9756q() ? 1 : 0));
        int m9646c = C1163o.m9646c(context);
        if (m9646c != 4 && m9646c != 8 && m9646c != 16) {
            i = m9646c;
        }
        sb.append("&nettype=" + i);
        sb.append("&mnc=");
        String m9676a5 = m9676a(C1163o.m9648b(context), "mnc");
        if (m9676a5 == null) {
            m9676a5 = "-1";
        }
        sb.append(Short.valueOf(m9676a5));
        return sb.toString();
    }

    /* renamed from: a */
    public boolean m9672a(String str, boolean z) {
        boolean booleanValue;
        if (!TextUtils.isEmpty(str) && this.f3672g != null) {
            synchronized (this.f3676n) {
                if (!z) {
                    Boolean bool = this.f3675m.get(str);
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    }
                }
                int m9709b = this.f3672g.m9709b(str);
                if (m9709b == 0) {
                    this.f3675m.put(str, false);
                    booleanValue = false;
                } else if (m9709b < 10000 && ((int) (AbstractC1130b.m9785A().mo9759n() * 10000.0d)) > m9709b) {
                    this.f3675m.put(str, false);
                    booleanValue = false;
                } else {
                    this.f3675m.put(str, true);
                    booleanValue = true;
                }
            }
            return booleanValue;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m9669b(String str, String str2) {
        if (this.f3666a == null || str2 == null) {
            return false;
        }
        return m9674a(str, str2, false);
    }

    /* renamed from: c */
    public boolean m9666c(String str, String str2) {
        if (this.f3666a == null || str2 == null) {
            return false;
        }
        return m9674a(str, str2, true);
    }

    /* renamed from: a */
    private boolean m9674a(String str, String str2, boolean z) {
        return m9673a(str, str2, z, null);
    }

    /* renamed from: a */
    private boolean m9673a(String str, String str2, boolean z, C1148i c1148i) {
        int m9712a;
        boolean z2 = false;
        if (!f3659i || !this.f3670e || this.f3667b == null || this.f3668c == null || this.f3672g == null || this.f3671f == null) {
            return false;
        }
        if ((f3660j || z) && m9672a(str, false) && (m9712a = this.f3672g.m9712a(str)) != 0) {
            if (m9712a >= 10000 || ((int) (AbstractC1130b.m9785A().mo9759n() * 10000.0d)) <= m9712a) {
                Log.d("KInfoc", "tableName: " + str + " dataString: " + str2 + ",mProductId: " + this.f3669d);
                Log.d("KInfoc", this.f3668c);
                byte[] m9675a = m9675a(str, str2, this.f3668c, this.f3669d, this.f3667b);
                if (m9675a == null) {
                    if (C1171q.f3721a) {
                        Log.d("KInfoc", "getData return null " + str2);
                    }
                    if (AbstractC1130b.m9785A().mo9760m() || new File("/sdcard/__test_infoc__").exists()) {
                        throw new NullPointerException("infoc data format error, see logcat for more details. table name: " + str + ": " + str2);
                    }
                    return false;
                }
                if (z) {
                    this.f3671f.m9630a(m9675a, str, z, c1148i);
                } else {
                    this.f3671f.m9637a(this.f3668c, this.f3669d, AbstractC1130b.m9785A().mo9768e().getAbsolutePath(), m9675a, str, z, 0);
                    synchronized (this.f3674l) {
                        int i = this.f3673k + 1;
                        this.f3673k = i;
                        if (i >= C1150k.f3636d) {
                            this.f3673k = 0;
                            z2 = true;
                        }
                    }
                    if (z2) {
                        m9662e();
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: d */
    public void m9664d() {
        if (this.f3671f != null) {
            this.f3671f.m9624c();
        }
    }

    /* renamed from: e */
    public void m9662e() {
        if (f3659i && this.f3670e && f3660j) {
            if (AbstractC1130b.m9785A().mo9784a()) {
                C1150k.m9707a().m9700b();
                return;
            }
            try {
                AbstractC1130b.m9785A().mo9763j();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private byte[] m9675a(String str, String str2, String str3, int i, String str4) {
        try {
            return C1125a.m9799a(str, str2, str3, i, str4);
        } catch (Exception e) {
            return null;
        }
    }
}
