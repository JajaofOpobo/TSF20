package com.flurry.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* loaded from: classes.dex */
public final class t implements LocationListener {
    private List A;
    private LocationManager B;
    private String C;
    private boolean E;
    private long F;
    private long H;
    private long I;
    private long J;
    private Long P;
    private int Q;
    private Location R;
    private boolean U;
    private int V;
    private int X;
    private Map Y;
    private Map Z;
    private final Handler m;
    private File p;
    private long u;
    private String w;
    private String x;
    private String y;
    private static final String[] c = {"9774d56d682e549c", "dead00beef"};
    private static volatile String d = null;
    private static volatile String e = "http://data.flurry.com/aap.do";
    private static volatile String f = "https://data.flurry.com/aap.do";
    static t a = new t();
    private static long g = 10000;
    private static boolean h = true;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = true;
    private static Criteria l = null;
    private static AtomicInteger n = new AtomicInteger(0);
    private static AtomicInteger o = new AtomicInteger(0);
    private File q = null;
    private File r = null;
    private volatile boolean s = false;
    private volatile boolean t = false;
    private Map v = new WeakHashMap();
    private boolean z = true;
    private Map D = new HashMap();
    private List G = new ArrayList();
    private String K = "";
    private String L = "";
    private byte M = -1;
    private String N = "";
    private byte O = -1;
    private Map S = new HashMap();
    private List T = new ArrayList();
    private List W = new ArrayList();
    s b = s.a();

    static /* synthetic */ void a(t tVar, Context context, boolean z) {
        Location location = null;
        if (z) {
            try {
                location = tVar.e(context);
            } catch (Throwable th) {
                Cdo.b("FlurryAgent", "", th);
                return;
            }
        }
        synchronized (tVar) {
            tVar.R = location;
        }
        byte[] f2 = f(context);
        if (f2 != null) {
            tVar.D.put(5, ByteBuffer.wrap(f2));
        }
        tVar.m();
    }

    static /* synthetic */ void d(t tVar) {
        boolean z;
        try {
            synchronized (tVar) {
                z = !tVar.s && SystemClock.elapsedRealtime() - tVar.u > g && tVar.G.size() > 0;
            }
            if (z) {
                tVar.m();
            }
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
        }
    }

    final void a(Throwable th) {
        th.printStackTrace();
        String str = "";
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            StringBuilder sb = new StringBuilder();
            if (th.getMessage() != null) {
                sb.append(" (" + th.getMessage() + ")\n");
            }
            str = sb.toString();
        } else if (th.getMessage() != null) {
            str = th.getMessage();
        }
        if (str == null) {
            Cdo.b("FlurryAgent", "String message passed to onError was null.");
        } else if (th == null) {
            Cdo.b("FlurryAgent", "Throwable passed to onError was null.");
        } else {
            try {
                a.a("uncaught", str, th.getClass().getName(), th);
            } catch (Throwable th2) {
                Cdo.b("FlurryAgent", "", th2);
            }
        }
        this.v.clear();
        a((Context) null, true);
    }

    private t() {
        HandlerThread handlerThread = new HandlerThread("FlurryAgent");
        handlerThread.start();
        this.m = new Handler(handlerThread.getLooper());
    }

    public static int a() {
        return 148;
    }

    public static void b() {
        synchronized (a) {
            if (a.s) {
                Cdo.b("FlurryAgent", "Cannot setCaptureUncaughtExceptions after onStartSession");
            } else {
                k = true;
            }
        }
    }

    public static void a(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Api key not specified");
        }
        try {
            a.b(context, str);
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
        }
    }

    public static void a(Context context) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        try {
            a.a(context, false);
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
        }
    }

    public static void a(String str, Map map) {
        if (str == null) {
            Cdo.b("FlurryAgent", "String eventId passed to logEvent was null.");
            return;
        }
        if (map == null) {
            Cdo.b("FlurryAgent", "String parameters passed to logEvent was null.");
            return;
        }
        try {
            a.b(str, map);
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "Failed to log event: " + str, th);
        }
    }

    public static boolean c() {
        return i;
    }

    protected static boolean d() {
        return k;
    }

    static boolean e() {
        if (a != null && a.b != null) {
            return true;
        }
        try {
            return Class.forName("com.flurry.android.s") != null;
        } catch (Throwable th) {
            String str = "isAppSpotEnabled caught:" + th.toString();
            return false;
        }
    }

    private synchronized void b(Context context, String str) {
        Bundle extras;
        if (this.w != null && !this.w.equals(str)) {
            Cdo.b("FlurryAgent", "onStartSession called with different api keys: " + this.w + " and " + str);
        }
        if (((Context) this.v.put(context, context)) != null) {
            Cdo.e("FlurryAgent", "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context");
        }
        if (!this.s) {
            Cdo.a("FlurryAgent", "Initializing Flurry session");
            this.w = str;
            this.q = context.getFileStreamPath(".flurryagent." + Integer.toString(this.w.hashCode(), 16));
            this.p = context.getFileStreamPath(".flurryb.");
            this.r = context.getFileStreamPath(".flurryinstallreceiver.");
            if (k) {
                Thread.setDefaultUncaughtExceptionHandler(new u());
            }
            Context applicationContext = context.getApplicationContext();
            if (this.y == null) {
                this.y = d(applicationContext);
            }
            String packageName = applicationContext.getPackageName();
            if (this.x != null && !this.x.equals(packageName)) {
                Cdo.b("FlurryAgent", "onStartSession called from different application packages: " + this.x + " and " + packageName);
            }
            this.x = packageName;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.u > g) {
                Cdo.a("FlurryAgent", "New session");
                this.H = System.currentTimeMillis();
                this.I = elapsedRealtime;
                this.J = -1L;
                this.N = "";
                this.Q = 0;
                this.R = null;
                this.L = TimeZone.getDefault().getID();
                this.K = Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
                this.S = new HashMap();
                this.T = new ArrayList();
                this.U = true;
                this.W = new ArrayList();
                this.V = 0;
                this.X = 0;
                n.set(0);
                o.set(0);
                if (e()) {
                    this.b.a(context, this.H, this.I);
                }
                a(new dm(this, applicationContext, this.z));
                if ((context instanceof Activity) && (extras = ((Activity) context).getIntent().getExtras()) != null) {
                    String str2 = "Launch Options Bundle is present " + extras.toString();
                    this.Z = new HashMap();
                    for (String str3 : extras.keySet()) {
                        if (str3 != null) {
                            Object obj = extras.get(str3);
                            String obj2 = obj != null ? obj.toString() : "null";
                            this.Z.put(str3, new ArrayList(Arrays.asList(obj2)));
                            String str4 = "Launch options Key: " + str3 + ". Its value: " + obj2;
                        }
                    }
                }
            } else {
                Cdo.a("FlurryAgent", "Continuing previous session");
                if (!this.G.isEmpty()) {
                    this.G.remove(this.G.size() - 1);
                }
                if (e()) {
                    this.b.b();
                }
            }
            this.s = true;
        }
    }

    private synchronized void a(Context context, boolean z) {
        if (context != null) {
            if (((Context) this.v.remove(context)) == null) {
                Cdo.e("FlurryAgent", "onEndSession called without context from corresponding onStartSession");
            }
        }
        if (this.s && this.v.isEmpty()) {
            Cdo.a("FlurryAgent", "Ending session");
            p();
            Context applicationContext = context == null ? null : context.getApplicationContext();
            if (context != null) {
                String packageName = applicationContext.getPackageName();
                if (!this.x.equals(packageName)) {
                    Cdo.b("FlurryAgent", "onEndSession called from different application package, expected: " + this.x + " actual: " + packageName);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.u = elapsedRealtime;
            this.J = elapsedRealtime - this.I;
            if (q() == null) {
                Cdo.b("FlurryAgent", "Not creating report because of bad Android ID or generated ID is null");
            }
            a(new ak(this, z, applicationContext));
            if (e()) {
                this.b.c();
            }
            this.s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(1);
                dataOutputStream.writeUTF(this.y);
                dataOutputStream.writeLong(this.H);
                dataOutputStream.writeLong(this.J);
                dataOutputStream.writeLong(0L);
                dataOutputStream.writeUTF(this.K);
                dataOutputStream.writeUTF(this.L);
                dataOutputStream.writeByte(this.M);
                dataOutputStream.writeUTF(this.N == null ? "" : this.N);
                if (this.R == null) {
                    dataOutputStream.writeBoolean(false);
                } else {
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeDouble(a(this.R.getLatitude()));
                    dataOutputStream.writeDouble(a(this.R.getLongitude()));
                    dataOutputStream.writeFloat(this.R.getAccuracy());
                }
                dataOutputStream.writeInt(this.X);
                dataOutputStream.writeByte(-1);
                dataOutputStream.writeByte(-1);
                dataOutputStream.writeByte(this.O);
                if (this.P == null) {
                    dataOutputStream.writeBoolean(false);
                } else {
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeLong(this.P.longValue());
                }
                dataOutputStream.writeShort(this.S.size());
                for (Map.Entry entry : this.S.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    dataOutputStream.writeInt(((du) entry.getValue()).a);
                }
                dataOutputStream.writeShort(this.T.size());
                Iterator it = this.T.iterator();
                while (it.hasNext()) {
                    dataOutputStream.write(((ce) it.next()).a());
                }
                dataOutputStream.writeBoolean(this.U);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 >= this.W.size()) {
                        break;
                    }
                    i4 += ((cv) this.W.get(i2)).a().length;
                    if (i4 > 160000) {
                        Cdo.e("FlurryAgent", "Error Log size exceeded. No more event details logged.");
                        break;
                    } else {
                        i3++;
                        i2++;
                    }
                }
                dataOutputStream.writeInt(this.Q);
                dataOutputStream.writeShort(i3);
                for (int i5 = 0; i5 < i3; i5++) {
                    dataOutputStream.write(((cv) this.W.get(i5)).a());
                }
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(0);
                this.G.add(byteArrayOutputStream.toByteArray());
                bp.a(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                dataOutputStream2 = dataOutputStream;
                try {
                    Cdo.b("FlurryAgent", "", e);
                    bp.a(dataOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    bp.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bp.a(dataOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
    }

    private static double a(double d2) {
        return Math.round(d2 * 1000.0d) / 1000.0d;
    }

    private void a(bw bwVar) {
        this.m.post(bwVar);
    }

    private synchronized void b(String str, Map map) {
        if (this.T == null) {
            Cdo.b("FlurryAgent", "onEvent called before onStartSession.  Event: " + str);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.I;
            String a2 = bp.a(str);
            if (a2.length() != 0) {
                du duVar = (du) this.S.get(a2);
                if (duVar == null) {
                    if (this.S.size() < 100) {
                        du duVar2 = new du((byte) 0);
                        duVar2.a = 1;
                        this.S.put(a2, duVar2);
                        Cdo.a("FlurryAgent", "Event count incremented: " + a2);
                    } else {
                        Cdo.e("FlurryAgent", "Too many different events. Event not counted: " + a2);
                    }
                } else {
                    duVar.a++;
                }
                if (h && this.T.size() < 1000 && this.V < 160000) {
                    Map emptyMap = map == null ? Collections.emptyMap() : map;
                    if (emptyMap.size() > 10) {
                        Cdo.e("FlurryAgent", "MaxEventParams exceeded: " + emptyMap.size());
                    } else {
                        ce ceVar = new ce(n.incrementAndGet(), a2, emptyMap, elapsedRealtime);
                        if (ceVar.a().length + this.V <= 160000) {
                            this.T.add(ceVar);
                            this.V = ceVar.a().length + this.V;
                        } else {
                            this.V = 160000;
                            this.U = false;
                            Cdo.e("FlurryAgent", "Event Log size exceeded. No more event details logged.");
                        }
                    }
                } else {
                    this.U = false;
                }
            }
        }
    }

    private synchronized void a(String str, String str2, String str3, Throwable th) {
        if (this.W == null) {
            Cdo.b("FlurryAgent", "onError called before onStartSession.  Error: " + str);
        } else {
            boolean z = str != null && "uncaught".equals(str);
            this.Q++;
            if (this.W.size() < 50) {
                cv cvVar = new cv(o.incrementAndGet(), Long.valueOf(System.currentTimeMillis()).longValue(), str, str2, str3, th);
                this.W.add(cvVar);
                Cdo.a("FlurryAgent", "Error logged: " + cvVar.b());
            } else if (z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.W.size()) {
                        break;
                    }
                    cv cvVar2 = (cv) this.W.get(i2);
                    if (cvVar2.b() == null || "uncaught".equals(cvVar2.b())) {
                        i2++;
                    } else {
                        this.W.set(i2, new cv(o.incrementAndGet(), Long.valueOf(System.currentTimeMillis()).longValue(), str, str2, str3, th));
                        break;
                    }
                }
            } else {
                Cdo.a("FlurryAgent", "Max errors logged. No more errors logged.");
            }
        }
    }

    private synchronized byte[] k() {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        byte[] bArr;
        try {
            o oVar = new o();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, oVar);
            dataOutputStream = new DataOutputStream(digestOutputStream);
            try {
                dataOutputStream.writeShort(26);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeLong(0L);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(3);
                dataOutputStream.writeShort(148);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeUTF(this.w);
                dataOutputStream.writeUTF(this.y);
                dataOutputStream.writeShort(this.D.size() + 1);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeUTF(q());
                if (!this.D.isEmpty()) {
                    for (Map.Entry entry : this.D.entrySet()) {
                        dataOutputStream.writeShort(((Integer) entry.getKey()).intValue());
                        byte[] array = ((ByteBuffer) entry.getValue()).array();
                        dataOutputStream.writeShort(array.length);
                        dataOutputStream.write(array);
                    }
                }
                dataOutputStream.writeByte(0);
                dataOutputStream.writeLong(this.F);
                dataOutputStream.writeLong(this.H);
                dataOutputStream.writeShort(6);
                dataOutputStream.writeUTF("device.model");
                dataOutputStream.writeUTF(Build.MODEL);
                dataOutputStream.writeUTF("build.brand");
                dataOutputStream.writeUTF(Build.BRAND);
                dataOutputStream.writeUTF("build.id");
                dataOutputStream.writeUTF(Build.ID);
                dataOutputStream.writeUTF("version.release");
                dataOutputStream.writeUTF(Build.VERSION.RELEASE);
                dataOutputStream.writeUTF("build.device");
                dataOutputStream.writeUTF(Build.DEVICE);
                dataOutputStream.writeUTF("build.product");
                dataOutputStream.writeUTF(Build.PRODUCT);
                int size = this.Y != null ? this.Y.keySet().size() : 0;
                String str = "refMapSize is:  " + size;
                if (size == 0) {
                    String str2 = "Referrer file Name if it exists:  " + this.r;
                    n();
                }
                dataOutputStream.writeShort(size);
                if (this.Y != null) {
                    for (Map.Entry entry2 : this.Y.entrySet()) {
                        String str3 = "Referrer Entry:  " + ((String) entry2.getKey()) + "=" + entry2.getValue();
                        dataOutputStream.writeUTF((String) entry2.getKey());
                        String str4 = "referrer key is :" + ((String) entry2.getKey());
                        dataOutputStream.writeShort(((List) entry2.getValue()).size());
                        for (String str5 : (List) entry2.getValue()) {
                            dataOutputStream.writeUTF(str5);
                            String str6 = "referrer value is :" + str5;
                        }
                    }
                }
                dataOutputStream.writeBoolean(false);
                int size2 = this.Z != null ? this.Z.keySet().size() : 0;
                String str7 = "optionsMapSize is:  " + size2;
                dataOutputStream.writeShort(size2);
                if (this.Z != null) {
                    for (Map.Entry entry3 : this.Z.entrySet()) {
                        String str8 = "Launch Options Key:  " + ((String) entry3.getKey());
                        dataOutputStream.writeUTF((String) entry3.getKey());
                        dataOutputStream.writeShort(((List) entry3.getValue()).size());
                        for (String str9 : (List) entry3.getValue()) {
                            dataOutputStream.writeUTF(str9);
                            String str10 = "Launch Options value is :" + str9;
                        }
                    }
                }
                int size3 = this.G.size();
                dataOutputStream.writeShort(size3);
                for (int i2 = 0; i2 < size3; i2++) {
                    dataOutputStream.write((byte[]) this.G.get(i2));
                }
                this.A = new ArrayList(this.G);
                digestOutputStream.on(false);
                dataOutputStream.write(oVar.a());
                dataOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                bp.a(dataOutputStream);
            } catch (Throwable th) {
                th = th;
                dataOutputStream2 = dataOutputStream;
                try {
                    Cdo.b("FlurryAgent", "Error when generating report", th);
                    bp.a(dataOutputStream2);
                    bArr = null;
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    bp.a(dataOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
        return bArr;
    }

    private static String l() {
        if (d != null) {
            return d;
        }
        if (j) {
            return e;
        }
        if (i) {
            return f;
        }
        return e;
    }

    private boolean a(byte[] bArr) {
        boolean z;
        String l2 = l();
        if (l2 == null) {
            return false;
        }
        try {
            z = a(bArr, l2);
        } catch (Exception e2) {
            Cdo.a("FlurryAgent", "Sending report exception: " + e2.getMessage());
            z = false;
        }
        if (!z && d == null && i && !j) {
            synchronized (a) {
                j = true;
                String l3 = l();
                if (l3 == null) {
                    return false;
                }
                try {
                    return a(bArr, l3);
                } catch (Exception e3) {
                    return z;
                }
            }
        }
        return z;
    }

    private boolean a(byte[] bArr, String str) {
        boolean z = true;
        if (!"local".equals(str)) {
            Cdo.a("FlurryAgent", "Sending report to: " + str);
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
            byteArrayEntity.setContentType("application/octet-stream");
            HttpPost httpPost = new HttpPost(str);
            httpPost.setEntity(byteArrayEntity);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 15000);
            httpPost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
            int statusCode = da.a(basicHttpParams).execute(httpPost).getStatusLine().getStatusCode();
            synchronized (this) {
                if (statusCode == 200) {
                    Cdo.a("FlurryAgent", "Report successful");
                    this.E = true;
                    this.G.removeAll(this.A);
                } else {
                    Cdo.a("FlurryAgent", "Report failed. HTTP response: " + statusCode);
                    z = false;
                }
                this.A = null;
            }
        }
        return z;
    }

    private void m() {
        try {
            Cdo.a("FlurryAgent", "generating report");
            byte[] k2 = k();
            if (k2 != null) {
                if (a(k2)) {
                    Cdo.a("FlurryAgent", "Done sending " + (this.s ? "initial " : "") + "agent report");
                    o();
                }
            } else {
                Cdo.a("FlurryAgent", "Error generating report");
            }
        } catch (IOException e2) {
            Cdo.a("FlurryAgent", "", e2);
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: all -> 0x00e1, Throwable -> 0x00f3, TryCatch #3 {Throwable -> 0x00f3, blocks: (B:15:0x0043, B:17:0x0047, B:19:0x004f, B:20:0x00ea), top: B:14:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:13:0x0040, B:15:0x0043, B:17:0x0047, B:19:0x004f, B:20:0x00ea, B:22:0x0056, B:24:0x005a, B:26:0x0066, B:27:0x009c, B:29:0x00a5, B:30:0x00b3, B:32:0x00bb, B:34:0x00c3, B:35:0x00c6, B:42:0x00f4, B:46:0x00dc, B:49:0x00e6, B:50:0x00e9, B:55:0x00fd), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:13:0x0040, B:15:0x0043, B:17:0x0047, B:19:0x004f, B:20:0x00ea, B:22:0x0056, B:24:0x005a, B:26:0x0066, B:27:0x009c, B:29:0x00a5, B:30:0x00b3, B:32:0x00bb, B:34:0x00c3, B:35:0x00c6, B:42:0x00f4, B:46:0x00dc, B:49:0x00e6, B:50:0x00e9, B:55:0x00fd), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:13:0x0040, B:15:0x0043, B:17:0x0047, B:19:0x004f, B:20:0x00ea, B:22:0x0056, B:24:0x005a, B:26:0x0066, B:27:0x009c, B:29:0x00a5, B:30:0x00b3, B:32:0x00bb, B:34:0x00c3, B:35:0x00c6, B:42:0x00f4, B:46:0x00dc, B:49:0x00e6, B:50:0x00e9, B:55:0x00fd), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f4 -> B:21:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(Context context) {
        String str;
        DataInputStream dataInputStream;
        String c2 = c(context);
        if (this.q.exists()) {
            ?? r1 = "loading persistent data: " + this.q.getAbsolutePath();
            Cdo.c("FlurryAgent", r1);
            try {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(this.q));
                    try {
                        if (dataInputStream.readUnsignedShort() == 46586) {
                            a(dataInputStream);
                        } else {
                            Cdo.a("FlurryAgent", "Unexpected file type");
                        }
                        bp.a(dataInputStream);
                    } catch (Throwable th) {
                        th = th;
                        Cdo.b("FlurryAgent", "Error when loading persistent file", th);
                        bp.a(dataInputStream);
                        if (!this.t) {
                        }
                        if (!this.t) {
                        }
                        if (c2 != null) {
                        }
                        c(str);
                        if (e()) {
                        }
                        if (!str.startsWith("AND")) {
                            c(context, str);
                        }
                        n();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bp.a((Closeable) r1);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
            }
            try {
                if (!this.t) {
                    if (this.q.delete()) {
                        Cdo.a("FlurryAgent", "Deleted persistence file");
                    } else {
                        Cdo.b("FlurryAgent", "Cannot delete persistence file");
                    }
                }
            } catch (Throwable th4) {
                Cdo.b("FlurryAgent", "", th4);
            }
        } else {
            Cdo.c("FlurryAgent", "Agent cache file doesn't exist.");
        }
        if (!this.t) {
            this.E = false;
            this.F = this.H;
            this.t = true;
        }
        if (c2 != null) {
            str = "ID" + Long.toString(Double.doubleToLongBits(Math.random()) + (37 * (System.nanoTime() + (this.w.hashCode() * 37))), 16);
            Cdo.c("FlurryAgent", "Generated id");
        } else {
            str = c2;
        }
        c(str);
        if (e()) {
            this.b.a(this.C);
            this.b.a(this.D);
        }
        if (!str.startsWith("AND") && !this.p.exists()) {
            c(context, str);
        }
        n();
    }

    private void n() {
        if (this.r.exists()) {
            Cdo.c("FlurryAgent", "Loading referrer info from file:  " + this.r.getAbsolutePath());
            String a2 = a(this.r);
            if (a2 != null) {
                this.Y = a(a2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        StringBuffer stringBuffer;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    stringBuffer = new StringBuffer();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            stringBuffer.append(new String(bArr, 0, read));
                        }
                        bp.a(fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        Cdo.b("FlurryAgent", "Error when loading persistent file", th);
                        bp.a(fileInputStream);
                        if (stringBuffer == null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    stringBuffer = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bp.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
            bp.a(fileInputStream);
            throw th;
        }
        if (stringBuffer == null) {
            return stringBuffer.toString();
        }
        return null;
    }

    private static Map a(String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split("&");
        int length = split.length;
        for (int i2 = 0; i2 < length; i2++) {
            String[] split2 = split[i2].split("=");
            if (split2.length != 2) {
                Cdo.a("FlurryAgent", "Invalid referrer Element: " + split[i2] + " in referrer tag " + str);
            } else {
                String decode = URLDecoder.decode(split2[0]);
                String decode2 = URLDecoder.decode(split2[1]);
                if (hashMap.get(decode) == null) {
                    hashMap.put(decode, new ArrayList());
                }
                ((List) hashMap.get(decode)).add(decode2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (hashMap.get("utm_source") == null) {
            sb.append("Campaign Source is missing.\n");
        }
        if (hashMap.get("utm_medium") == null) {
            sb.append("Campaign Medium is missing.\n");
        }
        if (hashMap.get("utm_campaign") == null) {
            sb.append("Campaign Name is missing.\n");
        }
        if (sb.length() > 0) {
            Log.w("Detected missing referrer keys", sb.toString());
        }
        return hashMap;
    }

    private synchronized void a(DataInputStream dataInputStream) {
        int i2 = 0;
        synchronized (this) {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            if (readUnsignedShort > 2) {
                Cdo.b("FlurryAgent", "Unknown agent file version: " + readUnsignedShort);
                throw new IOException("Unknown agent file version: " + readUnsignedShort);
            }
            if (readUnsignedShort >= 2) {
                String readUTF = dataInputStream.readUTF();
                Cdo.a("FlurryAgent", "Loading API key: " + b(this.w));
                if (readUTF.equals(this.w)) {
                    String readUTF2 = dataInputStream.readUTF();
                    if (q() == null) {
                        Cdo.a("FlurryAgent", "Loading phoneId: " + readUTF2);
                    }
                    c(readUTF2);
                    this.E = dataInputStream.readBoolean();
                    this.F = dataInputStream.readLong();
                    Cdo.a("FlurryAgent", "Loading session reports");
                    while (true) {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        if (readUnsignedShort2 == 0) {
                            break;
                        }
                        byte[] bArr = new byte[readUnsignedShort2];
                        dataInputStream.readFully(bArr);
                        this.G.add(0, bArr);
                        i2++;
                        Cdo.a("FlurryAgent", "Session report added: " + i2);
                    }
                    Cdo.a("FlurryAgent", "Persistent file loaded");
                    this.t = true;
                } else {
                    Cdo.a("FlurryAgent", "Api keys do not match, old: " + b(readUTF) + ", new: " + b(this.w));
                }
            } else {
                Cdo.e("FlurryAgent", "Deleting old file version: " + readUnsignedShort);
            }
        }
    }

    private static String b(String str) {
        if (str != null && str.length() > 4) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length() - 4; i2++) {
                sb.append('*');
            }
            sb.append(str.substring(str.length() - 4));
            return sb.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        DataOutputStream dataOutputStream;
        try {
            if (bo.a(this.q)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.q));
                try {
                    try {
                        dataOutputStream.writeShort(46586);
                        dataOutputStream.writeShort(2);
                        dataOutputStream.writeUTF(this.w);
                        dataOutputStream.writeUTF(q());
                        dataOutputStream.writeBoolean(this.E);
                        dataOutputStream.writeLong(this.F);
                        int size = this.G.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.G.get(size);
                            int length = bArr.length;
                            if (length + 2 + dataOutputStream.size() > 50000) {
                                Cdo.a("FlurryAgent", "discarded sessions: " + size);
                                break;
                            } else {
                                dataOutputStream.writeShort(length);
                                dataOutputStream.write(bArr);
                                size--;
                            }
                        }
                        dataOutputStream.writeShort(0);
                        bp.a(dataOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        Cdo.b("FlurryAgent", "", th);
                        bp.a(dataOutputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bp.a(dataOutputStream);
                    throw th;
                }
            } else {
                bp.a((Closeable) null);
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
        }
    }

    private synchronized void c(Context context, String str) {
        DataOutputStream dataOutputStream;
        this.p = context.getFileStreamPath(".flurryb.");
        if (bo.a(this.p)) {
            try {
                try {
                    dataOutputStream = new DataOutputStream(new FileOutputStream(this.p));
                    try {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF(str);
                        bp.a(dataOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        Cdo.b("FlurryAgent", "Error when saving b file", th);
                        bp.a(dataOutputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bp.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
                bp.a(dataOutputStream);
                throw th;
            }
        }
    }

    private String c(Context context) {
        DataInputStream dataInputStream;
        boolean z = false;
        String q = q();
        if (q == null) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null && string.length() > 0 && !string.equals("null")) {
                String[] strArr = c;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    }
                    if (string.equals(strArr[i2])) {
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                return "AND" + string;
            }
            File fileStreamPath = context.getFileStreamPath(".flurryb.");
            if (fileStreamPath.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        try {
                            dataInputStream.readInt();
                            String readUTF = dataInputStream.readUTF();
                            bp.a(dataInputStream);
                            return readUTF;
                        } catch (Throwable th) {
                            th = th;
                            Cdo.b("FlurryAgent", "Error when loading b file", th);
                            bp.a(dataInputStream);
                            return q;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bp.a(dataInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream = null;
                }
            } else {
                return q;
            }
        } else {
            return q;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        r0 = "Unknown";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String d(Context context) {
        String str;
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
            str = "Unknown";
        }
        if (packageInfo.versionName != null) {
            str = packageInfo.versionName;
        } else {
            if (packageInfo.versionCode != 0) {
                str = Integer.toString(packageInfo.versionCode);
            }
            str = "Unknown";
        }
        return str;
    }

    private Location e(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            synchronized (this) {
                if (this.B == null) {
                    this.B = locationManager;
                } else {
                    locationManager = this.B;
                }
            }
            Criteria criteria = l;
            if (criteria == null) {
                criteria = new Criteria();
            }
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                locationManager.requestLocationUpdates(bestProvider, 0L, 0.0f, this, Looper.getMainLooper());
                return locationManager.getLastKnownLocation(bestProvider);
            }
        }
        return null;
    }

    private static byte[] f(Context context) {
        TelephonyManager telephonyManager;
        String deviceId;
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null && (deviceId = telephonyManager.getDeviceId()) != null && deviceId.trim().length() > 0) {
            try {
                byte[] c2 = bp.c(deviceId);
                if (c2 == null || c2.length != 20) {
                    Cdo.b("FlurryAgent", "sha1 is not 20 bytes long: " + Arrays.toString(c2));
                } else {
                    return c2;
                }
            } catch (Exception e2) {
            }
        }
        return null;
    }

    private synchronized void p() {
        if (this.B != null) {
            this.B.removeUpdates(this);
        }
    }

    static String f() {
        return a.w;
    }

    static String g() {
        return a.K;
    }

    static String h() {
        return a.L;
    }

    private synchronized String q() {
        return this.C;
    }

    private synchronized void c(String str) {
        if (str != null) {
            this.C = str;
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        try {
            this.R = location;
            p();
        } catch (Throwable th) {
            Cdo.b("FlurryAgent", "", th);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
