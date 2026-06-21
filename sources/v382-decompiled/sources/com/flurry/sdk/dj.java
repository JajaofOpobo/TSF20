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
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
    private Map R;
    private dm S;
    private int T;
    private final String k;
    private String l;
    private WeakReference m;
    private List o;
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
    private final Map p = new HashMap();
    private List s = new ArrayList();
    private String A = "";
    private String B = "";
    private byte C = -1;
    private final Map J = new HashMap();
    private final List K = new ArrayList();
    private final List N = new ArrayList();
    private final cy Q = new cy();
    private boolean U = false;

    Map a() {
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
        this.m = new WeakReference(null);
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
            return;
        }
        if (str.equals("UserId")) {
            this.F = (String) obj;
            eo.a(4, g, "onSettingUpdate, UserId = " + this.F);
            return;
        }
        if (str.equals("LogEvents")) {
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
        this.m = new WeakReference(context);
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
            this.m = new WeakReference(context);
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

    private Map d(Context context) {
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

    public synchronized void a(String str, Map map, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.x;
        String a2 = fe.a(str);
        if (a2.length() != 0) {
            cx.a aVar = (cx.a) this.J.get(a2);
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
                Map emptyMap = map == null ? Collections.emptyMap() : map;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r9 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r9.size() <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r7.M >= com.flurry.sdk.dj.d) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r1 = r7.M - r0.d();
        r4 = new java.util.HashMap(r0.c());
        r0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if ((r0.d() + r1) > com.flurry.sdk.dj.d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0.c().size() <= com.flurry.sdk.dj.b) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        com.flurry.sdk.eo.d(com.flurry.sdk.dj.g, "MaxEventParams exceeded on endEvent: " + r0.c().size());
        r0.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r7.M = r1 + r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        r0.b(r4);
        r7.L = false;
        r7.M = com.flurry.sdk.dj.d;
        com.flurry.sdk.eo.d(com.flurry.sdk.dj.g, "Event Log size exceeded. No more event details logged.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r0.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r2 = android.os.SystemClock.elapsedRealtime() - r7.x;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(String str, Map map) {
        Iterator it = this.K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            db dbVar = (db) it.next();
            if (dbVar.a(str)) {
                break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #0 {, blocks: (B:26:0x0004, B:5:0x000d, B:7:0x001d, B:13:0x005e, B:15:0x0066, B:17:0x0074, B:20:0x0080, B:12:0x00a6), top: B:25:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(String str, String str2, String str3, Throwable th) {
        boolean z;
        int i = 0;
        synchronized (this) {
            if (str != null) {
                if ("uncaught".equals(str)) {
                    z = true;
                    this.O++;
                    if (this.N.size() >= e) {
                        da daVar = new da(H(), Long.valueOf(System.currentTimeMillis()).longValue(), str, str2, str3, th);
                        this.N.add(daVar);
                        eo.d(g, "Error logged: " + daVar.c());
                    } else if (z) {
                        while (true) {
                            int i2 = i;
                            if (i2 >= this.N.size()) {
                                break;
                            }
                            da daVar2 = (da) this.N.get(i2);
                            if (daVar2.c() == null || "uncaught".equals(daVar2.c())) {
                                i = i2 + 1;
                            } else {
                                this.N.set(i2, new da(H(), Long.valueOf(System.currentTimeMillis()).longValue(), str, str2, str3, th));
                                break;
                            }
                        }
                    } else {
                        eo.d(g, "Max errors logged. No more errors logged.");
                    }
                }
            }
            z = false;
            this.O++;
            if (this.N.size() >= e) {
            }
        }
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #7 {, blocks: (B:5:0x0004, B:23:0x0053, B:25:0x005b, B:11:0x006a, B:35:0x0087, B:36:0x008d, B:31:0x007c, B:8:0x0092), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x008e, TryCatch #7 {, blocks: (B:5:0x0004, B:23:0x0053, B:25:0x005b, B:11:0x006a, B:35:0x0087, B:36:0x008d, B:31:0x007c, B:8:0x0092), top: B:4:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void C() {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        boolean z;
        FileInputStream fileInputStream2 = null;
        synchronized (this) {
            eo.a(4, g, "Loading persistent data: " + this.n.getAbsolutePath());
            if (this.n.exists()) {
                try {
                    fileInputStream = new FileInputStream(this.n);
                    try {
                        dataInputStream = new DataInputStream(fileInputStream);
                        try {
                            dk dkVar = new dk();
                            dkVar.a(dataInputStream, this.k);
                            this.q = dkVar.a();
                            this.r = dkVar.c();
                            this.s = dkVar.b();
                            z = true;
                            fe.a(dataInputStream);
                            fe.a(fileInputStream);
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = fileInputStream;
                            try {
                                eo.b(g, "Error loading persistent data", e);
                                fe.a(dataInputStream);
                                fe.a(fileInputStream2);
                                z = false;
                                if (!z) {
                                }
                                if (!z) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                fe.a(dataInputStream);
                                fe.a(fileInputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fe.a(dataInputStream);
                            fe.a(fileInputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        dataInputStream = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        dataInputStream = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    dataInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    dataInputStream = null;
                    fileInputStream = null;
                }
                if (!z) {
                    eo.a(3, g, "Deleting agent cache file");
                    this.n.delete();
                }
            } else {
                eo.a(4, g, "Agent cache file doesn't exist.");
                z = false;
            }
            if (!z) {
                this.q = false;
                this.r = this.w;
            }
        }
    }

    private void D() {
        this.T++;
    }

    private void E() {
        if (this.T > 0) {
            this.T--;
        }
    }

    int g() {
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

    public Map p() {
        return new HashMap(this.p);
    }

    @Override // com.flurry.sdk.dm.b
    public void q() {
        c();
    }

    List r() {
        return this.K;
    }

    List s() {
        return this.N;
    }

    Map t() {
        return this.J;
    }
}
