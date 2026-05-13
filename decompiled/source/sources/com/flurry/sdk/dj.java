package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.flurry.android.impl.analytics.FlurryAnalyticsModule;
import com.flurry.sdk.cx;
import com.flurry.sdk.dm;
import com.flurry.sdk.dq;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class dj implements dm.b, dq.a {
    private Location D;
    private boolean E;
    private String F;
    private byte G;
    private long H;
    private long I;
    private boolean L;
    private int M;
    private int O;
    private int P;
    private Map<String, List<String>> R;
    private dm S;
    private int T;
    private final String k;
    private String l;
    private WeakReference<Context> m;
    private List<dh> o;
    private boolean q;
    private long r;
    private AdvertisingIdClient.Info t;
    private byte[] u;
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;
    private static final String g = dj.class.getSimpleName();
    static int a = 100;
    static int b = 10;
    static int c = 1000;
    static int d = 160000;
    static int e = 50;
    static int f = 20;
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private File n = null;
    private final Map<dr, ByteBuffer> p = new HashMap();
    private List<dh> s = new ArrayList();
    private String A = "";
    private String B = "";
    private byte C = -1;
    private final Map<String, cx.a> J = new HashMap();
    private final List<db> K = new ArrayList();
    private final List<da> N = new ArrayList();
    private final cy Q = new cy();
    private boolean U = false;

    Map<String, List<String>> a() {
        return this.R;
    }

    public void a(ff ffVar) {
        Cdo.a().c(ffVar);
    }

    public void b() {
        this.q = true;
    }

    public dj(String str) {
        eo.a(4, g, "Creating new Flurry session");
        this.k = str;
        this.m = new WeakReference<>(null);
    }

    private void u() {
        dq a2 = dp.a();
        this.G = ((Byte) a2.a("Gender")).byteValue();
        a2.a("Gender", (dq.a) this);
        eo.a(4, g, "initSettings, Gender = " + ((int) this.G));
        this.F = (String) a2.a("UserId");
        a2.a("UserId", (dq.a) this);
        eo.a(4, g, "initSettings, UserId = " + this.F);
        this.E = ((Boolean) a2.a("LogEvents")).booleanValue();
        a2.a("LogEvents", (dq.a) this);
        eo.a(4, g, "initSettings, LogEvents = " + this.E);
        this.H = ((Long) a2.a("Age")).longValue();
        a2.a("Age", (dq.a) this);
        eo.a(4, g, "initSettings, BirthDate = " + this.H);
        this.I = ((Long) a2.a("ContinueSessionMillis")).longValue();
        a2.a("ContinueSessionMillis", (dq.a) this);
        eo.a(4, g, "initSettings, ContinueSessionMillis = " + this.I);
    }

    @Override // com.flurry.sdk.dq.a
    public void a(String str, Object obj) {
        if (str.equals("Gender")) {
            this.G = ((Byte) obj).byteValue();
            eo.a(4, g, "onSettingUpdate, Gender = " + ((int) this.G));
        } else if (str.equals("UserId")) {
            this.F = (String) obj;
            eo.a(4, g, "onSettingUpdate, UserId = " + this.F);
        } else if (str.equals("LogEvents")) {
            this.E = ((Boolean) obj).booleanValue();
            eo.a(4, g, "onSettingUpdate, LogEvents = " + this.E);
        } else if (str.equals("Age")) {
            this.H = ((Long) obj).longValue();
            eo.a(4, g, "onSettingUpdate, Birthdate = " + this.H);
        } else if (str.equals("ContinueSessionMillis")) {
            this.I = ((Long) obj).longValue();
            eo.a(4, g, "onSettingUpdate, ContinueSessionMillis = " + this.I);
        } else {
            eo.a(6, g, "onSettingUpdate internal error!");
        }
    }

    public synchronized void a(Context context) {
        eo.a(4, g, "Initializing new Flurry session with context:" + context);
        this.m = new WeakReference<>(context);
        this.S = new dm(this);
        this.n = context.getFileStreamPath(F());
        this.l = eb.a();
        this.y = -1L;
        this.O = 0;
        this.B = TimeZone.getDefault().getID();
        this.A = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
        this.L = true;
        this.M = 0;
        this.P = 0;
        this.R = d(context);
        u();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w = System.currentTimeMillis();
        this.x = elapsedRealtime;
        a(new ff() { // from class: com.flurry.sdk.dj.1
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.t = dw.a();
            }
        });
        a(new ff() { // from class: com.flurry.sdk.dj.2
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.u = dy.a();
            }
        });
        a(new ff() { // from class: com.flurry.sdk.dj.3
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.v = ea.a();
            }
        });
        a(new ff() { // from class: com.flurry.sdk.dj.4
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.C();
            }
        });
        a(new ff() { // from class: com.flurry.sdk.dj.5
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.v();
            }
        });
        ep.a().a(this, context);
        this.U = true;
    }

    public synchronized void b(Context context) {
        if (this.U) {
            eo.d(g, "Start session with context: " + context + " count:" + g());
            this.m = new WeakReference<>(context);
            if (this.S.b()) {
                this.S.a();
            }
            D();
            dz.a().c();
            this.D = dz.a().f();
            ep.a().b(this, context);
        }
    }

    public synchronized void c(Context context) {
        if (this.U) {
            ep.a().c(this, context);
            this.D = dz.a().f();
            z();
            E();
            eo.d(g, "End session with context: " + context + " count:" + g());
            this.y = SystemClock.elapsedRealtime() - this.x;
            a(this.y);
            w();
            if (g() == 0) {
                this.S.a(this.I);
            }
        }
    }

    public synchronized void c() {
        if (this.U) {
            eo.d(g, "Finalize session");
            if (this.S.b()) {
                this.S.a();
            }
            if (g() != 0) {
                eo.a(6, g, "Session with apiKey = " + j() + " was ended while getSessionCount() is not 0");
            }
            this.T = 0;
            x();
            ep.a().a(this);
            a(new ff() { // from class: com.flurry.sdk.dj.6
                @Override // com.flurry.sdk.ff
                public void a() {
                    dl.a().a(dj.this.j());
                }
            });
            dp.a().b("Gender", (dq.a) this);
            dp.a().b("UserId", (dq.a) this);
            dp.a().b("Age", (dq.a) this);
            dp.a().b("LogEvents", (dq.a) this);
            dp.a().b("ContinueSessionMillis", (dq.a) this);
        }
    }

    private Map<String, List<String>> d(Context context) {
        Bundle extras;
        if (!(context instanceof Activity) || (extras = ((Activity) context).getIntent().getExtras()) == null) {
            return null;
        }
        eo.a(3, g, "Launch Options Bundle is present " + extras.toString());
        HashMap hashMap = new HashMap();
        for (String str : extras.keySet()) {
            if (str != null) {
                Object obj = extras.get(str);
                String obj2 = obj != null ? obj.toString() : "null";
                hashMap.put(str, new ArrayList(Arrays.asList(obj2)));
                eo.a(3, g, "Launch options Key: " + str + ". Its value: " + obj2);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            if (this.v != null) {
                eo.a(3, g, "Fetched phone id");
                a(dr.PhoneId, ByteBuffer.wrap(this.v.getBytes()));
            }
            if (this.u != null) {
                eo.a(3, g, "Fetched hashed IMEI");
                a(dr.Sha1Imei, ByteBuffer.wrap(this.u));
            }
            if (this.t != null) {
                eo.a(3, g, "Fetched advertising id");
                a(dr.AndroidAdvertisingId, ByteBuffer.wrap(this.t.getId().getBytes()));
            }
            A();
        } catch (Throwable th) {
            eo.a(6, g, "", th);
        }
    }

    private synchronized void a(long j) {
        for (db dbVar : this.K) {
            if (dbVar.a() && !dbVar.b()) {
                dbVar.a(j);
            }
        }
    }

    private void w() {
        a(new ff() { // from class: com.flurry.sdk.dj.7
            @Override // com.flurry.sdk.ff
            public void a() {
                dh d2 = dj.this.d();
                dj.this.s.clear();
                dj.this.s.add(d2);
                dj.this.B();
            }
        });
    }

    private void x() {
        a(new ff() { // from class: com.flurry.sdk.dj.8
            @Override // com.flurry.sdk.ff
            public void a() {
                dj.this.y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        boolean z;
        try {
            synchronized (this) {
                z = this.s.size() > 0;
            }
            if (z) {
                A();
            }
        } catch (Throwable th) {
            eo.a(6, g, "", th);
        }
    }

    private void z() {
        a(new ff() { // from class: com.flurry.sdk.dj.9
            @Override // com.flurry.sdk.ff
            public void a() {
                dz.a().d();
            }
        });
    }

    synchronized dh d() {
        dh dhVar;
        di diVar = new di();
        diVar.a(this.l);
        diVar.a(this.w);
        diVar.b(this.y);
        diVar.c(this.z);
        diVar.b(k());
        diVar.c(l());
        diVar.a((int) this.C);
        diVar.d(h());
        diVar.a(this.D);
        diVar.b(f());
        diVar.a(this.G);
        diVar.a(Long.valueOf(this.H));
        diVar.a(t());
        diVar.a(r());
        diVar.a(this.L);
        diVar.b(s());
        diVar.c(this.O);
        try {
            dhVar = new dh(diVar);
        } catch (IOException e2) {
            e2.printStackTrace();
            dhVar = null;
        }
        if (dhVar == null) {
            eo.d(g, "New session report wasn't created");
        }
        return dhVar;
    }

    public synchronized void e() {
        this.P++;
    }

    int f() {
        return this.P;
    }

    public synchronized void a(String str, Map<String, String> map, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.x;
        String a2 = fe.a(str);
        if (a2.length() != 0) {
            cx.a aVar = this.J.get(a2);
            if (aVar == null) {
                if (this.J.size() < a) {
                    cx.a aVar2 = new cx.a();
                    aVar2.a = 1;
                    this.J.put(a2, aVar2);
                    eo.d(g, "Event count started: " + a2);
                } else {
                    eo.d(g, "Too many different events. Event not counted: " + a2);
                }
            } else {
                aVar.a++;
                eo.d(g, "Event count incremented: " + a2);
            }
            if (this.E && this.K.size() < c && this.M < d) {
                Map<String, String> emptyMap = map == null ? Collections.emptyMap() : map;
                if (emptyMap.size() > b) {
                    eo.d(g, "MaxEventParams exceeded: " + emptyMap.size());
                } else {
                    db dbVar = new db(G(), a2, emptyMap, elapsedRealtime, z);
                    if (dbVar.d() + this.M <= d) {
                        this.K.add(dbVar);
                        this.M = dbVar.d() + this.M;
                    } else {
                        this.M = d;
                        this.L = false;
                        eo.d(g, "Event Log size exceeded. No more event details logged.");
                    }
                }
            } else {
                this.L = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r9.size() <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7.M >= com.flurry.sdk.dj.d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        r1 = r7.M - r0.d();
        r4 = new java.util.HashMap(r0.c());
        r0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if ((r0.d() + r1) > com.flurry.sdk.dj.d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0.c().size() <= com.flurry.sdk.dj.b) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        com.flurry.sdk.eo.d(com.flurry.sdk.dj.g, "MaxEventParams exceeded on endEvent: " + r0.c().size());
        r0.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        r0.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r7.M = r1 + r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        r0.b(r4);
        r7.L = false;
        r7.M = com.flurry.sdk.dj.d;
        com.flurry.sdk.eo.d(com.flurry.sdk.dj.g, "Event Log size exceeded. No more event details logged.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = android.os.SystemClock.elapsedRealtime() - r7.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r9 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List<com.flurry.sdk.db> r0 = r7.K     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L86
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L86
            com.flurry.sdk.db r0 = (com.flurry.sdk.db) r0     // Catch: java.lang.Throwable -> L86
            boolean r2 = r0.a(r8)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            long r4 = r7.x     // Catch: java.lang.Throwable -> L86
            long r2 = r2 - r4
            if (r9 == 0) goto L79
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L86
            if (r1 <= 0) goto L79
            int r1 = r7.M     // Catch: java.lang.Throwable -> L86
            int r4 = com.flurry.sdk.dj.d     // Catch: java.lang.Throwable -> L86
            if (r1 >= r4) goto L79
            int r1 = r7.M     // Catch: java.lang.Throwable -> L86
            int r4 = r0.d()     // Catch: java.lang.Throwable -> L86
            int r1 = r1 - r4
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L86
            java.util.Map r5 = r0.c()     // Catch: java.lang.Throwable -> L86
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86
            r0.a(r9)     // Catch: java.lang.Throwable -> L86
            int r5 = r0.d()     // Catch: java.lang.Throwable -> L86
            int r5 = r5 + r1
            int r6 = com.flurry.sdk.dj.d     // Catch: java.lang.Throwable -> L86
            if (r5 > r6) goto L89
            java.util.Map r5 = r0.c()     // Catch: java.lang.Throwable -> L86
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L86
            int r6 = com.flurry.sdk.dj.b     // Catch: java.lang.Throwable -> L86
            if (r5 <= r6) goto L7e
            java.lang.String r1 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r5.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = "MaxEventParams exceeded on endEvent: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L86
            java.util.Map r6 = r0.c()     // Catch: java.lang.Throwable -> L86
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L86
            com.flurry.sdk.eo.d(r1, r5)     // Catch: java.lang.Throwable -> L86
            r0.b(r4)     // Catch: java.lang.Throwable -> L86
        L79:
            r0.a(r2)     // Catch: java.lang.Throwable -> L86
        L7c:
            monitor-exit(r7)
            return
        L7e:
            int r4 = r0.d()     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + r4
            r7.M = r1     // Catch: java.lang.Throwable -> L86
            goto L79
        L86:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L89:
            r0.b(r4)     // Catch: java.lang.Throwable -> L86
            r1 = 0
            r7.L = r1     // Catch: java.lang.Throwable -> L86
            int r1 = com.flurry.sdk.dj.d     // Catch: java.lang.Throwable -> L86
            r7.M = r1     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "Event Log size exceeded. No more event details logged."
            com.flurry.sdk.eo.d(r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.dj.a(java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:16:0x005e, B:18:0x0066, B:20:0x0074, B:22:0x0080, B:28:0x00a6), top: B:30:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
        /*
            r9 = this;
            r0 = 0
            monitor-enter(r9)
            if (r10 == 0) goto L59
            java.lang.String r1 = "uncaught"
            boolean r1 = r1.equals(r10)     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L59
            r1 = 1
        Ld:
            int r2 = r9.O     // Catch: java.lang.Throwable -> L9f
            int r2 = r2 + 1
            r9.O = r2     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r2 = r9.N     // Catch: java.lang.Throwable -> L9f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L9f
            int r3 = com.flurry.sdk.dj.e     // Catch: java.lang.Throwable -> L9f
            if (r2 >= r3) goto L5b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = new com.flurry.sdk.da     // Catch: java.lang.Throwable -> L9f
            int r1 = r9.H()     // Catch: java.lang.Throwable -> L9f
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L9f
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r1 = r9.N     // Catch: java.lang.Throwable -> L9f
            r1.add(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = "Error logged: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.eo.d(r1, r0)     // Catch: java.lang.Throwable -> L9f
        L57:
            monitor-exit(r9)
            return
        L59:
            r1 = r0
            goto Ld
        L5b:
            if (r1 == 0) goto La6
            r8 = r0
        L5e:
            java.util.List<com.flurry.sdk.da> r0 = r9.N     // Catch: java.lang.Throwable -> L9f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9f
            if (r8 >= r0) goto L57
            java.util.List<com.flurry.sdk.da> r0 = r9.N     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = (com.flurry.sdk.da) r0     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto La2
            java.lang.String r1 = "uncaught"
            java.lang.String r0 = r0.c()     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La2
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = new com.flurry.sdk.da     // Catch: java.lang.Throwable -> L9f
            int r1 = r9.H()     // Catch: java.lang.Throwable -> L9f
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L9f
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r1 = r9.N     // Catch: java.lang.Throwable -> L9f
            r1.set(r8, r0)     // Catch: java.lang.Throwable -> L9f
            goto L57
        L9f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        La2:
            int r0 = r8 + 1
            r8 = r0
            goto L5e
        La6:
            java.lang.String r0 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "Max errors logged. No more errors logged."
            com.flurry.sdk.eo.d(r0, r1)     // Catch: java.lang.Throwable -> L9f
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.dj.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    private void A() {
        try {
            eo.a(3, g, "generating agent report");
            dc dcVar = new dc(this.k, this.l, this.q, o(), this.r, this.w, this.s, p(), this.Q.a(false), a(), cx.a().b(), System.currentTimeMillis());
            this.o = new ArrayList(this.s);
            if (dcVar != null && dcVar.a() != null) {
                eo.a(3, g, "generated report of size " + dcVar.a().length + " with " + this.s.size() + " reports.");
                a(dcVar.a());
                this.s.removeAll(this.o);
                this.o = null;
                B();
            } else {
                eo.d(g, "Error generating report");
            }
        } catch (Throwable th) {
            eo.a(6, g, "", th);
        }
    }

    private void a(byte[] bArr) {
        FlurryAnalyticsModule.getInstance().a().b(bArr, this.k, "" + dn.a().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void B() {
        if (!fd.a(this.n)) {
            eo.d(g, "Error persisting report: could not create directory");
        } else {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.n));
                dk dkVar = new dk();
                dkVar.a(this.q);
                dkVar.a(this.r);
                dkVar.a(this.s);
                dkVar.a(dataOutputStream, this.k, i());
            } catch (Exception e2) {
                eo.b(g, "Error saving persistent data", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x008e, TryCatch #7 {, blocks: (B:5:0x0004, B:11:0x0053, B:13:0x005b, B:15:0x006a, B:24:0x0087, B:25:0x008d, B:21:0x007c, B:30:0x0092), top: B:44:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #7 {, blocks: (B:5:0x0004, B:11:0x0053, B:13:0x005b, B:15:0x006a, B:24:0x0087, B:25:0x008d, B:21:0x007c, B:30:0x0092), top: B:44:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void C() {
        /*
            r8 = this;
            r2 = 0
            r4 = 0
            monitor-enter(r8)
            r0 = 4
            java.lang.String r1 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "Loading persistent data: "
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.io.File r5 = r8.n     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.eo.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L8e
            java.io.File r0 = r8.n     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L91
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            java.io.File r0 = r8.n     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            r3.<init>(r0)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La3
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La3
            com.flurry.sdk.dk r0 = new com.flurry.sdk.dk     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            java.lang.String r2 = r8.k     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            boolean r2 = r0.a()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.q = r2     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            long r6 = r0.c()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.r = r6     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            java.util.List r0 = r0.b()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.s = r0     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0 = 1
            com.flurry.sdk.fe.a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.fe.a(r3)     // Catch: java.lang.Throwable -> L8e
        L59:
            if (r0 != 0) goto L68
            r1 = 3
            java.lang.String r2 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "Deleting agent cache file"
            com.flurry.sdk.eo.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L8e
            java.io.File r1 = r8.n     // Catch: java.lang.Throwable -> L8e
            r1.delete()     // Catch: java.lang.Throwable -> L8e
        L68:
            if (r0 != 0) goto L71
            r0 = 0
            r8.q = r0     // Catch: java.lang.Throwable -> L8e
            long r0 = r8.w     // Catch: java.lang.Throwable -> L8e
            r8.r = r0     // Catch: java.lang.Throwable -> L8e
        L71:
            monitor-exit(r8)
            return
        L73:
            r0 = move-exception
            r1 = r2
        L75:
            java.lang.String r3 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "Error loading persistent data"
            com.flurry.sdk.eo.b(r3, r5, r0)     // Catch: java.lang.Throwable -> La0
            com.flurry.sdk.fe.a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.fe.a(r2)     // Catch: java.lang.Throwable -> L8e
            r0 = r4
            goto L59
        L84:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L87:
            com.flurry.sdk.fe.a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.fe.a(r3)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L91:
            r0 = 4
            java.lang.String r1 = com.flurry.sdk.dj.g     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Agent cache file doesn't exist."
            com.flurry.sdk.eo.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L8e
            r0 = r4
            goto L68
        L9b:
            r0 = move-exception
            r1 = r2
            goto L87
        L9e:
            r0 = move-exception
            goto L87
        La0:
            r0 = move-exception
            r3 = r2
            goto L87
        La3:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L75
        La7:
            r0 = move-exception
            r2 = r3
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.dj.C():void");
    }

    private void D() {
        this.T++;
    }

    private void E() {
        if (this.T > 0) {
            this.T--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.T;
    }

    private String F() {
        return ".flurryagent." + Integer.toString(this.k.hashCode(), 16);
    }

    private int G() {
        return this.h.incrementAndGet();
    }

    private int H() {
        return this.i.incrementAndGet();
    }

    String h() {
        return this.F == null ? "" : this.F;
    }

    public String i() {
        return this.v;
    }

    public String j() {
        return this.k;
    }

    public String k() {
        return this.A;
    }

    public String l() {
        return this.B;
    }

    public long m() {
        return this.w;
    }

    public long n() {
        return this.x;
    }

    public boolean o() {
        return this.t == null || !this.t.isLimitAdTrackingEnabled();
    }

    private void a(dr drVar, ByteBuffer byteBuffer) {
        synchronized (this.p) {
            this.p.put(drVar, byteBuffer);
        }
    }

    public Map<dr, ByteBuffer> p() {
        return new HashMap(this.p);
    }

    @Override // com.flurry.sdk.dm.b
    public void q() {
        c();
    }

    List<db> r() {
        return this.K;
    }

    List<da> s() {
        return this.N;
    }

    Map<String, cx.a> t() {
        return this.J;
    }
}
