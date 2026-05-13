package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.flurry.android.impl.analytics.FlurryAnalyticsModule;
import com.flurry.sdk.C1173cx;
import com.flurry.sdk.C1207dm;
import com.flurry.sdk.C1213dq;
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
/* renamed from: com.flurry.sdk.dj */
/* loaded from: classes.dex */
public class C1195dj implements C1207dm.InterfaceC1209b, C1213dq.InterfaceC1214a {

    /* renamed from: D */
    private Location f3824D;

    /* renamed from: E */
    private boolean f3825E;

    /* renamed from: F */
    private String f3826F;

    /* renamed from: G */
    private byte f3827G;

    /* renamed from: H */
    private long f3828H;

    /* renamed from: I */
    private long f3829I;

    /* renamed from: L */
    private boolean f3832L;

    /* renamed from: M */
    private int f3833M;

    /* renamed from: O */
    private int f3835O;

    /* renamed from: P */
    private int f3836P;

    /* renamed from: R */
    private Map<String, List<String>> f3838R;

    /* renamed from: S */
    private C1207dm f3839S;

    /* renamed from: T */
    private int f3840T;

    /* renamed from: k */
    private final String f3845k;

    /* renamed from: l */
    private String f3846l;

    /* renamed from: m */
    private WeakReference<Context> f3847m;

    /* renamed from: o */
    private List<C1193dh> f3849o;

    /* renamed from: q */
    private boolean f3851q;

    /* renamed from: r */
    private long f3852r;

    /* renamed from: t */
    private AdvertisingIdClient.Info f3854t;

    /* renamed from: u */
    private byte[] f3855u;

    /* renamed from: v */
    private String f3856v;

    /* renamed from: w */
    private long f3857w;

    /* renamed from: x */
    private long f3858x;

    /* renamed from: y */
    private long f3859y;

    /* renamed from: z */
    private long f3860z;

    /* renamed from: g */
    private static final String f3820g = C1195dj.class.getSimpleName();

    /* renamed from: a */
    static int f3814a = 100;

    /* renamed from: b */
    static int f3815b = 10;

    /* renamed from: c */
    static int f3816c = 1000;

    /* renamed from: d */
    static int f3817d = 160000;

    /* renamed from: e */
    static int f3818e = 50;

    /* renamed from: f */
    static int f3819f = 20;

    /* renamed from: h */
    private final AtomicInteger f3842h = new AtomicInteger(0);

    /* renamed from: i */
    private final AtomicInteger f3843i = new AtomicInteger(0);

    /* renamed from: j */
    private final AtomicInteger f3844j = new AtomicInteger(0);

    /* renamed from: n */
    private File f3848n = null;

    /* renamed from: p */
    private final Map<EnumC1215dr, ByteBuffer> f3850p = new HashMap();

    /* renamed from: s */
    private List<C1193dh> f3853s = new ArrayList();

    /* renamed from: A */
    private String f3821A = "";

    /* renamed from: B */
    private String f3822B = "";

    /* renamed from: C */
    private byte f3823C = -1;

    /* renamed from: J */
    private final Map<String, C1173cx.C1174a> f3830J = new HashMap();

    /* renamed from: K */
    private final List<C1178db> f3831K = new ArrayList();

    /* renamed from: N */
    private final List<C1177da> f3834N = new ArrayList();

    /* renamed from: Q */
    private final C1175cy f3837Q = new C1175cy();

    /* renamed from: U */
    private boolean f3841U = false;

    /* renamed from: a */
    Map<String, List<String>> m9468a() {
        return this.f3838R;
    }

    /* renamed from: a */
    public void m9460a(AbstractRunnableC1278ff abstractRunnableC1278ff) {
        C1211do.m9390a().m9382c(abstractRunnableC1278ff);
    }

    /* renamed from: b */
    public void m9455b() {
        this.f3851q = true;
    }

    public C1195dj(String str) {
        C1258eo.m9234a(4, f3820g, "Creating new Flurry session");
        this.f3845k = str;
        this.f3847m = new WeakReference<>(null);
    }

    /* renamed from: u */
    private void m9430u() {
        C1213dq m9380a = C1212dp.m9380a();
        this.f3827G = ((Byte) m9380a.m9377a("Gender")).byteValue();
        m9380a.m9376a("Gender", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3820g, "initSettings, Gender = " + ((int) this.f3827G));
        this.f3826F = (String) m9380a.m9377a("UserId");
        m9380a.m9376a("UserId", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3820g, "initSettings, UserId = " + this.f3826F);
        this.f3825E = ((Boolean) m9380a.m9377a("LogEvents")).booleanValue();
        m9380a.m9376a("LogEvents", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3820g, "initSettings, LogEvents = " + this.f3825E);
        this.f3828H = ((Long) m9380a.m9377a("Age")).longValue();
        m9380a.m9376a("Age", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3820g, "initSettings, BirthDate = " + this.f3828H);
        this.f3829I = ((Long) m9380a.m9377a("ContinueSessionMillis")).longValue();
        m9380a.m9376a("ContinueSessionMillis", (C1213dq.InterfaceC1214a) this);
        C1258eo.m9234a(4, f3820g, "initSettings, ContinueSessionMillis = " + this.f3829I);
    }

    @Override // com.flurry.sdk.C1213dq.InterfaceC1214a
    /* renamed from: a */
    public void mo9338a(String str, Object obj) {
        if (str.equals("Gender")) {
            this.f3827G = ((Byte) obj).byteValue();
            C1258eo.m9234a(4, f3820g, "onSettingUpdate, Gender = " + ((int) this.f3827G));
        } else if (str.equals("UserId")) {
            this.f3826F = (String) obj;
            C1258eo.m9234a(4, f3820g, "onSettingUpdate, UserId = " + this.f3826F);
        } else if (str.equals("LogEvents")) {
            this.f3825E = ((Boolean) obj).booleanValue();
            C1258eo.m9234a(4, f3820g, "onSettingUpdate, LogEvents = " + this.f3825E);
        } else if (str.equals("Age")) {
            this.f3828H = ((Long) obj).longValue();
            C1258eo.m9234a(4, f3820g, "onSettingUpdate, Birthdate = " + this.f3828H);
        } else if (str.equals("ContinueSessionMillis")) {
            this.f3829I = ((Long) obj).longValue();
            C1258eo.m9234a(4, f3820g, "onSettingUpdate, ContinueSessionMillis = " + this.f3829I);
        } else {
            C1258eo.m9234a(6, f3820g, "onSettingUpdate internal error!");
        }
    }

    /* renamed from: a */
    public synchronized void m9466a(Context context) {
        C1258eo.m9234a(4, f3820g, "Initializing new Flurry session with context:" + context);
        this.f3847m = new WeakReference<>(context);
        this.f3839S = new C1207dm(this);
        this.f3848n = context.getFileStreamPath(m9471F());
        this.f3846l = C1229eb.m9307a();
        this.f3859y = -1L;
        this.f3835O = 0;
        this.f3822B = TimeZone.getDefault().getID();
        this.f3821A = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
        this.f3832L = true;
        this.f3833M = 0;
        this.f3836P = 0;
        this.f3838R = m9448d(context);
        m9430u();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f3857w = System.currentTimeMillis();
        this.f3858x = elapsedRealtime;
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.1
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.f3854t = C1222dw.m9352a();
            }
        });
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.2
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.f3855u = C1224dy.m9345a();
            }
        });
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.3
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.f3856v = C1227ea.m9323a();
            }
        });
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.4
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.m9474C();
            }
        });
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.5
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.m9429v();
            }
        });
        C1259ep.m9217a().mo9211a(this, context);
        this.f3841U = true;
    }

    /* renamed from: b */
    public synchronized void m9454b(Context context) {
        if (this.f3841U) {
            C1258eo.m9218d(f3820g, "Start session with context: " + context + " count:" + m9443g());
            this.f3847m = new WeakReference<>(context);
            if (this.f3839S.m9404b()) {
                this.f3839S.m9406a();
            }
            m9473D();
            C1225dz.m9343a().m9334c();
            this.f3824D = C1225dz.m9343a().m9331f();
            C1259ep.m9217a().mo9210b(this, context);
        }
    }

    /* renamed from: c */
    public synchronized void m9451c(Context context) {
        if (this.f3841U) {
            C1259ep.m9217a().mo9209c(this, context);
            this.f3824D = C1225dz.m9343a().m9331f();
            m9425z();
            m9472E();
            C1258eo.m9218d(f3820g, "End session with context: " + context + " count:" + m9443g());
            this.f3859y = SystemClock.elapsedRealtime() - this.f3858x;
            m9467a(this.f3859y);
            m9428w();
            if (m9443g() == 0) {
                this.f3839S.m9405a(this.f3829I);
            }
        }
    }

    /* renamed from: c */
    public synchronized void m9452c() {
        if (this.f3841U) {
            C1258eo.m9218d(f3820g, "Finalize session");
            if (this.f3839S.m9404b()) {
                this.f3839S.m9406a();
            }
            if (m9443g() != 0) {
                C1258eo.m9234a(6, f3820g, "Session with apiKey = " + m9440j() + " was ended while getSessionCount() is not 0");
            }
            this.f3840T = 0;
            m9427x();
            C1259ep.m9217a().mo9212a(this);
            m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.6
                @Override // com.flurry.sdk.AbstractRunnableC1278ff
                /* renamed from: a */
                public void mo9140a() {
                    C1206dl.m9414a().m9410a(C1195dj.this.m9440j());
                }
            });
            C1212dp.m9380a().m9374b("Gender", (C1213dq.InterfaceC1214a) this);
            C1212dp.m9380a().m9374b("UserId", (C1213dq.InterfaceC1214a) this);
            C1212dp.m9380a().m9374b("Age", (C1213dq.InterfaceC1214a) this);
            C1212dp.m9380a().m9374b("LogEvents", (C1213dq.InterfaceC1214a) this);
            C1212dp.m9380a().m9374b("ContinueSessionMillis", (C1213dq.InterfaceC1214a) this);
        }
    }

    /* renamed from: d */
    private Map<String, List<String>> m9448d(Context context) {
        Bundle extras;
        if (!(context instanceof Activity) || (extras = ((Activity) context).getIntent().getExtras()) == null) {
            return null;
        }
        C1258eo.m9234a(3, f3820g, "Launch Options Bundle is present " + extras.toString());
        HashMap hashMap = new HashMap();
        for (String str : extras.keySet()) {
            if (str != null) {
                Object obj = extras.get(str);
                String obj2 = obj != null ? obj.toString() : "null";
                hashMap.put(str, new ArrayList(Arrays.asList(obj2)));
                C1258eo.m9234a(3, f3820g, "Launch options Key: " + str + ". Its value: " + obj2);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m9429v() {
        try {
            if (this.f3856v != null) {
                C1258eo.m9234a(3, f3820g, "Fetched phone id");
                m9461a(EnumC1215dr.PhoneId, ByteBuffer.wrap(this.f3856v.getBytes()));
            }
            if (this.f3855u != null) {
                C1258eo.m9234a(3, f3820g, "Fetched hashed IMEI");
                m9461a(EnumC1215dr.Sha1Imei, ByteBuffer.wrap(this.f3855u));
            }
            if (this.f3854t != null) {
                C1258eo.m9234a(3, f3820g, "Fetched advertising id");
                m9461a(EnumC1215dr.AndroidAdvertisingId, ByteBuffer.wrap(this.f3854t.getId().getBytes()));
            }
            m9476A();
        } catch (Throwable th) {
            C1258eo.m9233a(6, f3820g, "", th);
        }
    }

    /* renamed from: a */
    private synchronized void m9467a(long j) {
        for (C1178db c1178db : this.f3831K) {
            if (c1178db.m9561a() && !c1178db.m9557b()) {
                c1178db.m9560a(j);
            }
        }
    }

    /* renamed from: w */
    private void m9428w() {
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.7
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1193dh m9449d = C1195dj.this.m9449d();
                C1195dj.this.f3853s.clear();
                C1195dj.this.f3853s.add(m9449d);
                C1195dj.this.m9475B();
            }
        });
    }

    /* renamed from: x */
    private void m9427x() {
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.8
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1195dj.this.m9426y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m9426y() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f3853s.size() > 0;
            }
            if (z) {
                m9476A();
            }
        } catch (Throwable th) {
            C1258eo.m9233a(6, f3820g, "", th);
        }
    }

    /* renamed from: z */
    private void m9425z() {
        m9460a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.dj.9
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                C1225dz.m9343a().m9333d();
            }
        });
    }

    /* renamed from: d */
    synchronized C1193dh m9449d() {
        C1193dh c1193dh;
        C1194di c1194di = new C1194di();
        c1194di.m9505a(this.f3846l);
        c1194di.m9508a(this.f3857w);
        c1194di.m9499b(this.f3859y);
        c1194di.m9494c(this.f3860z);
        c1194di.m9498b(m9439k());
        c1194di.m9493c(m9438l());
        c1194di.m9509a((int) this.f3823C);
        c1194di.m9491d(m9442h());
        c1194di.m9507a(this.f3824D);
        c1194di.m9500b(m9444f());
        c1194di.m9510a(this.f3827G);
        c1194di.m9506a(Long.valueOf(this.f3828H));
        c1194di.m9503a(m9431t());
        c1194di.m9504a(m9433r());
        c1194di.m9502a(this.f3832L);
        c1194di.m9497b(m9432s());
        c1194di.m9495c(this.f3835O);
        try {
            c1193dh = new C1193dh(c1194di);
        } catch (IOException e) {
            e.printStackTrace();
            c1193dh = null;
        }
        if (c1193dh == null) {
            C1258eo.m9218d(f3820g, "New session report wasn't created");
        }
        return c1193dh;
    }

    /* renamed from: e */
    public synchronized void m9446e() {
        this.f3836P++;
    }

    /* renamed from: f */
    int m9444f() {
        return this.f3836P;
    }

    /* renamed from: a */
    public synchronized void m9457a(String str, Map<String, String> map, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3858x;
        String m9150a = C1277fe.m9150a(str);
        if (m9150a.length() != 0) {
            C1173cx.C1174a c1174a = this.f3830J.get(m9150a);
            if (c1174a == null) {
                if (this.f3830J.size() < f3814a) {
                    C1173cx.C1174a c1174a2 = new C1173cx.C1174a();
                    c1174a2.f3734a = 1;
                    this.f3830J.put(m9150a, c1174a2);
                    C1258eo.m9218d(f3820g, "Event count started: " + m9150a);
                } else {
                    C1258eo.m9218d(f3820g, "Too many different events. Event not counted: " + m9150a);
                }
            } else {
                c1174a.f3734a++;
                C1258eo.m9218d(f3820g, "Event count incremented: " + m9150a);
            }
            if (this.f3825E && this.f3831K.size() < f3816c && this.f3833M < f3817d) {
                Map<String, String> emptyMap = map == null ? Collections.emptyMap() : map;
                if (emptyMap.size() > f3815b) {
                    C1258eo.m9218d(f3820g, "MaxEventParams exceeded: " + emptyMap.size());
                } else {
                    C1178db c1178db = new C1178db(m9470G(), m9150a, emptyMap, elapsedRealtime, z);
                    if (c1178db.m9554d() + this.f3833M <= f3817d) {
                        this.f3831K.add(c1178db);
                        this.f3833M = c1178db.m9554d() + this.f3833M;
                    } else {
                        this.f3833M = f3817d;
                        this.f3832L = false;
                        C1258eo.m9218d(f3820g, "Event Log size exceeded. No more event details logged.");
                    }
                }
            } else {
                this.f3832L = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r9.size() <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7.f3833M >= com.flurry.sdk.C1195dj.f3817d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        r1 = r7.f3833M - r0.m9554d();
        r4 = new java.util.HashMap(r0.m9555c());
        r0.m9558a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if ((r0.m9554d() + r1) > com.flurry.sdk.C1195dj.f3817d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0.m9555c().size() <= com.flurry.sdk.C1195dj.f3815b) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        com.flurry.sdk.C1258eo.m9218d(com.flurry.sdk.C1195dj.f3820g, "MaxEventParams exceeded on endEvent: " + r0.m9555c().size());
        r0.m9556b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        r0.m9560a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r7.f3833M = r1 + r0.m9554d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        r0.m9556b(r4);
        r7.f3832L = false;
        r7.f3833M = com.flurry.sdk.C1195dj.f3817d;
        com.flurry.sdk.C1258eo.m9218d(com.flurry.sdk.C1195dj.f3820g, "Event Log size exceeded. No more event details logged.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = android.os.SystemClock.elapsedRealtime() - r7.f3858x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r9 == null) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m9458a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List<com.flurry.sdk.db> r0 = r7.f3831K     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L86
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L86
            com.flurry.sdk.db r0 = (com.flurry.sdk.C1178db) r0     // Catch: java.lang.Throwable -> L86
            boolean r2 = r0.m9559a(r8)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            long r4 = r7.f3858x     // Catch: java.lang.Throwable -> L86
            long r2 = r2 - r4
            if (r9 == 0) goto L79
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L86
            if (r1 <= 0) goto L79
            int r1 = r7.f3833M     // Catch: java.lang.Throwable -> L86
            int r4 = com.flurry.sdk.C1195dj.f3817d     // Catch: java.lang.Throwable -> L86
            if (r1 >= r4) goto L79
            int r1 = r7.f3833M     // Catch: java.lang.Throwable -> L86
            int r4 = r0.m9554d()     // Catch: java.lang.Throwable -> L86
            int r1 = r1 - r4
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L86
            java.util.Map r5 = r0.m9555c()     // Catch: java.lang.Throwable -> L86
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86
            r0.m9558a(r9)     // Catch: java.lang.Throwable -> L86
            int r5 = r0.m9554d()     // Catch: java.lang.Throwable -> L86
            int r5 = r5 + r1
            int r6 = com.flurry.sdk.C1195dj.f3817d     // Catch: java.lang.Throwable -> L86
            if (r5 > r6) goto L89
            java.util.Map r5 = r0.m9555c()     // Catch: java.lang.Throwable -> L86
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L86
            int r6 = com.flurry.sdk.C1195dj.f3815b     // Catch: java.lang.Throwable -> L86
            if (r5 <= r6) goto L7e
            java.lang.String r1 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r5.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = "MaxEventParams exceeded on endEvent: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L86
            java.util.Map r6 = r0.m9555c()     // Catch: java.lang.Throwable -> L86
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L86
            com.flurry.sdk.C1258eo.m9218d(r1, r5)     // Catch: java.lang.Throwable -> L86
            r0.m9556b(r4)     // Catch: java.lang.Throwable -> L86
        L79:
            r0.m9560a(r2)     // Catch: java.lang.Throwable -> L86
        L7c:
            monitor-exit(r7)
            return
        L7e:
            int r4 = r0.m9554d()     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + r4
            r7.f3833M = r1     // Catch: java.lang.Throwable -> L86
            goto L79
        L86:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L89:
            r0.m9556b(r4)     // Catch: java.lang.Throwable -> L86
            r1 = 0
            r7.f3832L = r1     // Catch: java.lang.Throwable -> L86
            int r1 = com.flurry.sdk.C1195dj.f3817d     // Catch: java.lang.Throwable -> L86
            r7.f3833M = r1     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "Event Log size exceeded. No more event details logged."
            com.flurry.sdk.C1258eo.m9218d(r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C1195dj.m9458a(java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:16:0x005e, B:18:0x0066, B:20:0x0074, B:22:0x0080, B:28:0x00a6), top: B:30:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m9459a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
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
            int r2 = r9.f3835O     // Catch: java.lang.Throwable -> L9f
            int r2 = r2 + 1
            r9.f3835O = r2     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r2 = r9.f3834N     // Catch: java.lang.Throwable -> L9f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L9f
            int r3 = com.flurry.sdk.C1195dj.f3818e     // Catch: java.lang.Throwable -> L9f
            if (r2 >= r3) goto L5b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = new com.flurry.sdk.da     // Catch: java.lang.Throwable -> L9f
            int r1 = r9.m9469H()     // Catch: java.lang.Throwable -> L9f
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L9f
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r1 = r9.f3834N     // Catch: java.lang.Throwable -> L9f
            r1.add(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = "Error logged: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.m9562c()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.C1258eo.m9218d(r1, r0)     // Catch: java.lang.Throwable -> L9f
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
            java.util.List<com.flurry.sdk.da> r0 = r9.f3834N     // Catch: java.lang.Throwable -> L9f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9f
            if (r8 >= r0) goto L57
            java.util.List<com.flurry.sdk.da> r0 = r9.f3834N     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = (com.flurry.sdk.C1177da) r0     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r0.m9562c()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto La2
            java.lang.String r1 = "uncaught"
            java.lang.String r0 = r0.m9562c()     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La2
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9f
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L9f
            com.flurry.sdk.da r0 = new com.flurry.sdk.da     // Catch: java.lang.Throwable -> L9f
            int r1 = r9.m9469H()     // Catch: java.lang.Throwable -> L9f
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L9f
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.flurry.sdk.da> r1 = r9.f3834N     // Catch: java.lang.Throwable -> L9f
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
            java.lang.String r0 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "Max errors logged. No more errors logged."
            com.flurry.sdk.C1258eo.m9218d(r0, r1)     // Catch: java.lang.Throwable -> L9f
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C1195dj.m9459a(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* renamed from: A */
    private void m9476A() {
        try {
            C1258eo.m9234a(3, f3820g, "generating agent report");
            C1179dc c1179dc = new C1179dc(this.f3845k, this.f3846l, this.f3851q, m9435o(), this.f3852r, this.f3857w, this.f3853s, m9434p(), this.f3837Q.m9569a(false), m9468a(), C1173cx.m9587a().m9578b(), System.currentTimeMillis());
            this.f3849o = new ArrayList(this.f3853s);
            if (c1179dc != null && c1179dc.m9552a() != null) {
                C1258eo.m9234a(3, f3820g, "generated report of size " + c1179dc.m9552a().length + " with " + this.f3853s.size() + " reports.");
                m9456a(c1179dc.m9552a());
                this.f3853s.removeAll(this.f3849o);
                this.f3849o = null;
                m9475B();
            } else {
                C1258eo.m9218d(f3820g, "Error generating report");
            }
        } catch (Throwable th) {
            C1258eo.m9233a(6, f3820g, "", th);
        }
    }

    /* renamed from: a */
    private void m9456a(byte[] bArr) {
        FlurryAnalyticsModule.getInstance().m9588a().m9538b(bArr, this.f3845k, "" + C1210dn.m9402a().m9401b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public synchronized void m9475B() {
        if (!C1276fd.m9160a(this.f3848n)) {
            C1258eo.m9218d(f3820g, "Error persisting report: could not create directory");
        } else {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f3848n));
                C1205dk c1205dk = new C1205dk();
                c1205dk.m9417a(this.f3851q);
                c1205dk.m9423a(this.f3852r);
                c1205dk.m9418a(this.f3853s);
                c1205dk.m9421a(dataOutputStream, this.f3845k, m9441i());
            } catch (Exception e) {
                C1258eo.m9225b(f3820g, "Error saving persistent data", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x008e, TryCatch #7 {, blocks: (B:5:0x0004, B:11:0x0053, B:13:0x005b, B:15:0x006a, B:24:0x0087, B:25:0x008d, B:21:0x007c, B:30:0x0092), top: B:44:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #7 {, blocks: (B:5:0x0004, B:11:0x0053, B:13:0x005b, B:15:0x006a, B:24:0x0087, B:25:0x008d, B:21:0x007c, B:30:0x0092), top: B:44:0x0004 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m9474C() {
        /*
            r8 = this;
            r2 = 0
            r4 = 0
            monitor-enter(r8)
            r0 = 4
            java.lang.String r1 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "Loading persistent data: "
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.io.File r5 = r8.f3848n     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.C1258eo.m9234a(r0, r1, r3)     // Catch: java.lang.Throwable -> L8e
            java.io.File r0 = r8.f3848n     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L91
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            java.io.File r0 = r8.f3848n     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            r3.<init>(r0)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L84
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La3
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La3
            com.flurry.sdk.dk r0 = new com.flurry.sdk.dk     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            java.lang.String r2 = r8.f3845k     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0.m9422a(r1, r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            boolean r2 = r0.m9424a()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.f3851q = r2     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            long r6 = r0.m9415c()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.f3852r = r6     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            java.util.List r0 = r0.m9416b()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r8.f3853s = r0     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La7
            r0 = 1
            com.flurry.sdk.C1277fe.m9152a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.C1277fe.m9152a(r3)     // Catch: java.lang.Throwable -> L8e
        L59:
            if (r0 != 0) goto L68
            r1 = 3
            java.lang.String r2 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "Deleting agent cache file"
            com.flurry.sdk.C1258eo.m9234a(r1, r2, r3)     // Catch: java.lang.Throwable -> L8e
            java.io.File r1 = r8.f3848n     // Catch: java.lang.Throwable -> L8e
            r1.delete()     // Catch: java.lang.Throwable -> L8e
        L68:
            if (r0 != 0) goto L71
            r0 = 0
            r8.f3851q = r0     // Catch: java.lang.Throwable -> L8e
            long r0 = r8.f3857w     // Catch: java.lang.Throwable -> L8e
            r8.f3852r = r0     // Catch: java.lang.Throwable -> L8e
        L71:
            monitor-exit(r8)
            return
        L73:
            r0 = move-exception
            r1 = r2
        L75:
            java.lang.String r3 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "Error loading persistent data"
            com.flurry.sdk.C1258eo.m9225b(r3, r5, r0)     // Catch: java.lang.Throwable -> La0
            com.flurry.sdk.C1277fe.m9152a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.C1277fe.m9152a(r2)     // Catch: java.lang.Throwable -> L8e
            r0 = r4
            goto L59
        L84:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L87:
            com.flurry.sdk.C1277fe.m9152a(r1)     // Catch: java.lang.Throwable -> L8e
            com.flurry.sdk.C1277fe.m9152a(r3)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L91:
            r0 = 4
            java.lang.String r1 = com.flurry.sdk.C1195dj.f3820g     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Agent cache file doesn't exist."
            com.flurry.sdk.C1258eo.m9234a(r0, r1, r2)     // Catch: java.lang.Throwable -> L8e
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
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C1195dj.m9474C():void");
    }

    /* renamed from: D */
    private void m9473D() {
        this.f3840T++;
    }

    /* renamed from: E */
    private void m9472E() {
        if (this.f3840T > 0) {
            this.f3840T--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m9443g() {
        return this.f3840T;
    }

    /* renamed from: F */
    private String m9471F() {
        return ".flurryagent." + Integer.toString(this.f3845k.hashCode(), 16);
    }

    /* renamed from: G */
    private int m9470G() {
        return this.f3842h.incrementAndGet();
    }

    /* renamed from: H */
    private int m9469H() {
        return this.f3843i.incrementAndGet();
    }

    /* renamed from: h */
    String m9442h() {
        return this.f3826F == null ? "" : this.f3826F;
    }

    /* renamed from: i */
    public String m9441i() {
        return this.f3856v;
    }

    /* renamed from: j */
    public String m9440j() {
        return this.f3845k;
    }

    /* renamed from: k */
    public String m9439k() {
        return this.f3821A;
    }

    /* renamed from: l */
    public String m9438l() {
        return this.f3822B;
    }

    /* renamed from: m */
    public long m9437m() {
        return this.f3857w;
    }

    /* renamed from: n */
    public long m9436n() {
        return this.f3858x;
    }

    /* renamed from: o */
    public boolean m9435o() {
        return this.f3854t == null || !this.f3854t.isLimitAdTrackingEnabled();
    }

    /* renamed from: a */
    private void m9461a(EnumC1215dr enumC1215dr, ByteBuffer byteBuffer) {
        synchronized (this.f3850p) {
            this.f3850p.put(enumC1215dr, byteBuffer);
        }
    }

    /* renamed from: p */
    public Map<EnumC1215dr, ByteBuffer> m9434p() {
        return new HashMap(this.f3850p);
    }

    @Override // com.flurry.sdk.C1207dm.InterfaceC1209b
    /* renamed from: q */
    public void mo9403q() {
        m9452c();
    }

    /* renamed from: r */
    List<C1178db> m9433r() {
        return this.f3831K;
    }

    /* renamed from: s */
    List<C1177da> m9432s() {
        return this.f3834N;
    }

    /* renamed from: t */
    Map<String, C1173cx.C1174a> m9431t() {
        return this.f3830J;
    }
}
