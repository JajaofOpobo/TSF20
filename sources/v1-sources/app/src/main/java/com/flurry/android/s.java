package com.flurry.android;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* loaded from: classes.dex */
public class s implements by {
    private static s R;
    static String a = "FlurryAgent";
    private static List e;
    private static com.flurry.a.a.a.c.q f;
    private static ar g;
    private String A;
    private Handler B;
    private aa C;
    private final dw D;
    private final cc E;
    private p F;
    private int G;
    private Map M;
    private j N;
    private br O;
    private final Map P;
    private final Set Q;
    private boolean S;
    private x T;
    au b;
    dp c;
    private eh h;
    private String m;
    private String n;
    private volatile float r;
    private volatile float s;
    private volatile Map t;
    private dl u;
    private j v;
    private long w;
    private long x;
    private long y;
    private Map z;
    private boolean i = false;
    private boolean j = false;
    private File k = null;
    private File l = null;
    private boolean o = true;
    private volatile String p = null;
    private volatile String q = null;
    w d = w.a();
    private volatile List H = new CopyOnWriteArrayList();
    private volatile Map I = new HashMap();
    private volatile List J = new ArrayList();
    private volatile List K = new ArrayList();
    private volatile boolean L = false;

    s() {
        HashMap hashMap = new HashMap();
        hashMap.put("open", "directOpen");
        hashMap.put("expand", "doExpand");
        hashMap.put("collapse", "doCollapse");
        this.P = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList("closeAd", "processRedirect", "nextFrame", "nextAdUnit", "notifyUser"));
        this.Q = Collections.unmodifiableSet(hashSet);
        HandlerThread handlerThread = new HandlerThread("FlurryAdThread");
        handlerThread.start();
        this.B = new Handler(handlerThread.getLooper());
        this.b = new au();
        e = Arrays.asList(0, 1, 2, 3, 4, 5);
        f = new com.flurry.a.a.a.c.q();
        g = new ar(this);
        this.h = new eh(this);
        this.c = new dp();
        this.m = Build.VERSION.RELEASE;
        this.n = Build.DEVICE;
        this.t = new HashMap();
        this.D = new dv();
        this.E = new dt();
    }

    static s a() {
        if (R == null) {
            R = new s();
        }
        return R;
    }

    private synchronized void c(Context context) {
        if (!this.S) {
            this.k = context.getFileStreamPath(".flurryadlog." + Integer.toString(t.f().hashCode(), 16));
            this.l = context.getFileStreamPath(".flurryfreqcap." + Integer.toString(t.f().hashCode(), 16));
            this.o = a(context, "market://details?id=" + context.getPackageName(), "android.intent.action.VIEW");
            this.b.a = context;
            r();
            Cdo.a(a, "Attempting to load FreqCap data");
            s();
            this.S = true;
        }
    }

    final void a(Context context, long j, long j2) {
        this.T = new x(context);
        this.w = j;
        this.x = j2;
        this.y = 0L;
    }

    final void b() {
        this.d.c();
    }

    final void c() {
        o();
    }

    final void a(boolean z) {
        this.G++;
        if (1 == this.G && this.F != null) {
            p pVar = this.F;
        }
        if (z && this.F != null) {
            p pVar2 = this.F;
        }
    }

    final void d() {
        this.G--;
        if (this.G == 0 && this.F != null) {
            p pVar = this.F;
        }
    }

    final long e() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && (activeNetworkInfo.isConnected() || activeNetworkInfo.isRoaming());
        if (!z) {
            Cdo.e(a, "No connectivity found.");
            return z;
        }
        return z;
    }

    static String f() {
        return t.f();
    }

    final synchronized long g() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.x;
        if (elapsedRealtime <= this.y) {
            elapsedRealtime = this.y + 1;
            this.y = elapsedRealtime;
        }
        this.y = elapsedRealtime;
        return this.y;
    }

    final void a(String str) {
        this.A = str;
    }

    final void a(Map map) {
        this.z = map;
    }

    final void a(List list) {
        this.J = list;
    }

    final String h() {
        return this.A;
    }

    private Map n() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.M.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    final synchronized void a(dl dlVar) {
        if (this.H.size() < 32767) {
            this.H.add(dlVar);
            this.I.put(dlVar.b(), dlVar);
        }
    }

    final boolean a(Context context, String str, q qVar, ViewGroup viewGroup) {
        if (!d(str)) {
            if (e(context) && !d(context)) {
                ci ciVar = new ci(this, context, str, qVar, viewGroup, 1 == 0, 1 == 0);
                ciVar.execute(new Void[0]);
                if (1 > 0) {
                    try {
                        ciVar.get(1L, TimeUnit.MILLISECONDS);
                        if (d(str)) {
                            return a(context, str, viewGroup);
                        }
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        return false;
                    } catch (ExecutionException e3) {
                        e3.printStackTrace();
                        return false;
                    } catch (TimeoutException e4) {
                        return false;
                    }
                }
            } else if (!e(context) && this.F != null) {
                p pVar = this.F;
                str.toString();
            }
            return false;
        }
        if (!d(context)) {
            return a(context, str, viewGroup);
        }
        return false;
    }

    final void a(Context context, String str) {
        j c = c(str);
        if (c == null) {
            if (this.F != null) {
                p pVar = this.F;
                str.toString();
                return;
            }
            return;
        }
        this.O = null;
        this.c.a(str, a(context, c));
        if (this.F != null) {
            p pVar2 = this.F;
            str.toString();
        }
    }

    final boolean a(Context context, String str, ViewGroup viewGroup) {
        a(context, str);
        if (e(str) == null) {
            return false;
        }
        if (context == null) {
            Cdo.b(a, "Context passed to displayAd was null.");
        } else if (str == null) {
            Cdo.b(a, "Ad space name passed to displayAd was null.");
        } else if (str.length() == 0) {
            Cdo.b(a, "Ad space name passed to displayAd was empty.");
        } else if (viewGroup == null) {
            Cdo.b(a, "ViewGroup  passed to displayAd was null.");
        } else {
            a().c(context);
            try {
                s sVar = R;
                br e2 = sVar.e(str);
                if (e2 != null) {
                    if (sVar.F != null) {
                        if (e2 instanceof be) {
                            p pVar = sVar.F;
                            str.toString();
                            r rVar = r.WEB_BANNER;
                        } else {
                            p pVar2 = sVar.F;
                            str.toString();
                            r rVar2 = r.WEB_TAKEOVER;
                        }
                    }
                    e2.a(context, viewGroup);
                }
            } catch (Throwable th) {
                Cdo.b(a, "", th);
            }
        }
        return true;
    }

    final void b(Context context, String str) {
        String str2 = "_removeAd(context = " + context + ", adSpaceName = " + str + ")";
        an a2 = this.c.a(str);
        if (a2 == null) {
            f(str);
            return;
        }
        a2.b();
        ViewGroup a3 = a2.a();
        if (a3 != null) {
            a2.removeAllViews();
            a3.removeView(a2);
        }
        f(str);
        this.c.b(str);
    }

    static boolean a(Context context, String str, String str2) {
        Intent intent = new Intent(str2);
        intent.setData(Uri.parse(str));
        return bp.a(context, intent);
    }

    static boolean a(Context context, Intent intent, String str) {
        boolean z;
        Intent intent2;
        if (context != null && intent != null && str != null && bp.a(context, intent)) {
            if (context == null || intent == null) {
                z = false;
            } else {
                z = context.getPackageName().equals(intent.resolveActivity(context.getPackageManager()).getPackageName());
            }
            if (z) {
                intent2 = new Intent(intent);
            } else {
                intent2 = new Intent(context, (Class<?>) FlurryFullscreenTakeoverActivity.class);
                intent2.putExtra("targetIntent", intent);
            }
            intent2.putExtra("adSpaceName", str);
            try {
                context.startActivity(intent2);
                return true;
            } catch (ActivityNotFoundException e2) {
                Cdo.b(a, "Cannot launch Activity", e2);
            }
        }
        return false;
    }

    static boolean b(Context context, String str, String str2) {
        return a(context, new Intent("android.intent.action.VIEW").setData(Uri.parse(str)), str2);
    }

    final Map i() {
        Map map = this.t;
        if (this.T != null) {
            x xVar = this.T;
            String string = xVar.a == null ? "" : xVar.a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getString("flurry_last_user_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("appCloudUserId", string);
            }
        }
        return map;
    }

    final void a(Context context, String str, j jVar) {
        if (str.startsWith("market://details?id=")) {
            String obj = jVar.b().toString();
            if (this.o) {
                if (!b(context, str, obj)) {
                    Cdo.b(a, "Cannot launch Google Play url " + str);
                    return;
                }
                return;
            } else {
                b(context, "https://market.android.com/details?id=" + str.substring(20), obj);
                return;
            }
        }
        Cdo.e(a, "Unexpected Google Play url scheme: " + str);
    }

    private void a(Context context, String str, boolean z, j jVar) {
        this.B.post(new dg(this, str, jVar, context, z));
    }

    static boolean c(Context context, String str) {
        for (int i = 0; i < 5; i++) {
            if (e(context) && !d(context)) {
                HttpResponse a2 = bp.a(str, true);
                if (a2 != null && a2.getStatusLine().getStatusCode() == 200) {
                    String str2 = "URL hit succeeded for: " + str;
                    return true;
                }
            } else {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    e2.getMessage();
                }
            }
        }
        return false;
    }

    private String a(dl dlVar, j jVar, String str) {
        Pattern compile = Pattern.compile(".*?(%\\{\\w+\\}).*?");
        Matcher matcher = compile.matcher(str);
        while (matcher.matches()) {
            str = this.h.a(dlVar, jVar, str, matcher.group(1));
            matcher = compile.matcher(str);
        }
        return str;
    }

    private synchronized void a(ah ahVar) {
        if (ahVar.b().toString().equals("success")) {
            this.H.removeAll(this.J);
        }
    }

    private j c(String str) {
        return this.b.a(str);
    }

    private synchronized void o() {
        this.B.post(new dd(this));
    }

    final void b(String str) {
        byte[] p = p();
        if (p != null) {
            a(p, str);
        }
    }

    private byte[] p() {
        List q = q();
        synchronized (this.H) {
            List a2 = g.a(this.H);
            if (a2.size() == 0) {
                return null;
            }
            af b = af.b().a(t.f()).a(q).b(a2).a().a(System.currentTimeMillis()).b();
            String str = "Got ad log request:" + b.toString();
            com.flurry.a.a.a.d.f fVar = new com.flurry.a.a.a.d.f(af.class);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            com.flurry.a.a.a.c.u.a();
            com.flurry.a.a.a.c.k a3 = com.flurry.a.a.a.c.u.a(byteArrayOutputStream);
            try {
                fVar.a(b, a3);
                a3.flush();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                String str2 = "Error generating adlog request" + e2.getMessage();
                return null;
            }
        }
    }

    private List q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.b().a(ByteBuffer.wrap(this.A.getBytes())).a(0).a());
        for (Map.Entry entry : this.z.entrySet()) {
            arrayList.add(d.b().a((ByteBuffer) entry.getValue()).a(((Integer) entry.getKey()).intValue()).a());
        }
        return arrayList;
    }

    private byte[] a(String str, int i, int i2, int i3, int i4, q qVar) {
        List q = q();
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.d.b()) {
            arrayList.add(y.b().a(vVar.b()).b(vVar.h()).b(vVar.e()).c(vVar.f()).d(vVar.g()).a(vVar.i()).a(vVar.c()).a());
        }
        f c = f.b().a(t.f()).c("").b(e).a(q).a(ab.b().a(this.r).b(this.s).a()).a(this.L).b(Integer.toString(t.a())).a(this.w).a(k.b().d(i4).c(i3).b(i2).a(i).a()).d(t.g()).e(t.h()).f(this.m).g(this.n).b().a().c(arrayList).c();
        c.a(str);
        if (qVar != null) {
            c.a(ai.b().a(qVar.a()).a());
        }
        if (this.M != null) {
            c.a(n());
        }
        String str2 = "Got ad request: " + c;
        com.flurry.a.a.a.d.f fVar = new com.flurry.a.a.a.d.f(f.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.flurry.a.a.a.c.u.a();
        com.flurry.a.a.a.c.k a2 = com.flurry.a.a.a.c.u.a(byteArrayOutputStream);
        try {
            fVar.a(c, a2);
            a2.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e2.getMessage();
            return new byte[0];
        }
    }

    private boolean a(byte[] bArr, String str) {
        String str2;
        String str3;
        if (str == null) {
            return false;
        }
        if (str.equals("/v5/getAds.do")) {
            StringBuilder sb = new StringBuilder();
            if (this.p != null) {
                str3 = this.p;
            } else {
                str3 = t.c() ? "https://ads.flurry.com" : "http://ads.flurry.com";
            }
            str2 = sb.append(str3).append(str).toString();
        } else {
            str2 = (this.q != null ? this.q : t.c() ? "https://adlog.flurry.com" : "http://adlog.flurry.com") + str;
        }
        byte[] b = b(bArr, str2);
        if (b != null) {
            try {
                if (str.equals("/postAdLog.do")) {
                    b(b);
                }
            } catch (IOException e2) {
                Cdo.b(a, "IOException: " + e2.toString());
            }
        }
        return true;
    }

    private static byte[] b(byte[] bArr, String str) {
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
        byteArrayEntity.setContentType("avro/binary");
        HttpPost httpPost = new HttpPost(str);
        httpPost.setEntity(byteArrayEntity);
        httpPost.setHeader("accept", "avro/binary");
        httpPost.setHeader("FM-Checksum", Integer.toString(a(bArr)));
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 15000);
        httpPost.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        try {
            HttpResponse execute = da.a(basicHttpParams).execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 200 && execute.getEntity() != null && execute.getEntity().getContentLength() != 0) {
                Cdo.c(a, "Request successful");
                byte[] a2 = a(execute.getEntity().getContent());
                byteArrayEntity.consumeContent();
                String num = Integer.toString(a(a2));
                if (!execute.containsHeader("FM-Checksum") || execute.getFirstHeader("FM-Checksum").getValue().equals(num)) {
                    return a2;
                }
            } else {
                Cdo.b(a, "Request to url = " + str + " failed with HTTP = " + statusCode);
            }
        } catch (IOException e2) {
            Cdo.b(a, "Request to url = " + str + " failed with IOException = " + e2.toString(), e2);
        }
        return null;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[128];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static com.flurry.a.a.a.d.h a(byte[] bArr, Class cls) {
        try {
            return (com.flurry.a.a.a.d.h) new com.flurry.a.a.a.d.e(cls).a(f.a(new ByteArrayInputStream(bArr)));
        } catch (IOException e2) {
            String str = "IOException in parseAvroBinary:" + e2.getMessage();
            String str2 = "IOException in parseAvroBinary: bytes = " + bArr + " type = " + cls.getSimpleName();
            return null;
        } catch (ClassCastException e3) {
            String str3 = "ClassCastException in parseAvroBinary:" + e3.getMessage();
            String str4 = "ClassCastException in parseAvroBinary: bytes = " + bArr + " type = " + cls.getSimpleName();
            return null;
        }
    }

    private static int a(byte[] bArr) {
        o oVar = new o();
        oVar.update(bArr);
        return oVar.b();
    }

    private void b(byte[] bArr) {
        ah ahVar = (ah) a(bArr, ah.class);
        if (ahVar != null) {
            String str = "Got ad log response: " + ahVar;
            if (ahVar.b().toString().equals("success")) {
                a(ahVar);
                return;
            }
            Iterator it = ahVar.c().iterator();
            while (it.hasNext()) {
                Cdo.b(a, ((CharSequence) it.next()).toString());
            }
        }
    }

    final synchronized void j() {
        DataOutputStream dataOutputStream;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (bo.a(this.k)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.k));
                try {
                    dataOutputStream.writeShort(46586);
                    synchronized (this.H) {
                        a(this.H, dataOutputStream);
                    }
                    dataOutputStream.writeShort(0);
                    bp.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    Cdo.b(a, "", th);
                    bp.a(dataOutputStream);
                }
            } else {
                bp.a((Closeable) null);
            }
        } catch (Throwable th3) {
            th = th3;
            bp.a((Closeable) null);
            throw th;
        }
    }

    private synchronized void r() {
        new cz(this).execute(new Void[0]);
    }

    final synchronized void a(DataInputStream dataInputStream) {
        while (dataInputStream.readUnsignedShort() != 0) {
            synchronized (this.H) {
                this.H.add(new dl(dataInputStream));
            }
        }
        this.i = true;
    }

    private synchronized void a(List list, DataOutputStream dataOutputStream) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((dl) list.get(i)).a(dataOutputStream);
            } catch (IOException e2) {
                Cdo.a(a, "unable to convert adLog to byte[]: " + ((dl) list.get(i)).b());
            }
        }
    }

    final synchronized void k() {
        DataOutputStream dataOutputStream;
        try {
            this.d.c();
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (bo.a(this.l)) {
                dataOutputStream = new DataOutputStream(new FileOutputStream(this.l));
                try {
                    synchronized (this.d) {
                        a(this.d, dataOutputStream);
                    }
                    dataOutputStream.writeShort(0);
                    bp.a(dataOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    Cdo.b(a, "", th);
                    bp.a(dataOutputStream);
                }
            } else {
                bp.a((Closeable) null);
            }
        } catch (Throwable th3) {
            th = th3;
            bp.a((Closeable) null);
            throw th;
        }
    }

    private synchronized void s() {
        new db(this).execute(new Void[0]);
    }

    final synchronized void b(DataInputStream dataInputStream) {
        while (dataInputStream.readShort() != 0) {
            synchronized (this.d) {
                this.d.a(new v(dataInputStream));
            }
        }
        this.j = true;
    }

    private synchronized void a(w wVar, DataOutputStream dataOutputStream) {
        for (v vVar : wVar.b()) {
            try {
                dataOutputStream.writeShort(1);
                vVar.a(dataOutputStream);
            } catch (IOException e2) {
                Cdo.a(a, "unable to convert freqCap to byte[]: " + vVar.b());
            }
        }
    }

    final synchronized dl a(dl dlVar, String str, boolean z, Map map) {
        String str2 = "changeAdState(" + dlVar + ", " + str + ", " + z + ", " + map + ")";
        synchronized (dlVar) {
            if (!this.H.contains(dlVar)) {
                this.H.add(dlVar);
                String str3 = "changeAdState added adLog = " + dlVar;
            }
            dlVar.a(a(str, z, map));
        }
        return dlVar;
    }

    private synchronized cg a(String str, boolean z, Map map) {
        return new cg(str, z, g(), map);
    }

    final void b(dl dlVar) {
        this.u = dlVar;
    }

    final dl l() {
        return this.u;
    }

    final void a(j jVar) {
        this.v = jVar;
    }

    final j m() {
        return this.v;
    }

    private static List a(b bVar, di diVar) {
        ArrayList arrayList = new ArrayList();
        List<n> f2 = bVar.f();
        String str = diVar.a;
        for (n nVar : f2) {
            if (nVar.b().toString().equals(str)) {
                for (CharSequence charSequence : nVar.c()) {
                    HashMap hashMap = new HashMap();
                    String obj = charSequence.toString();
                    int indexOf = obj.indexOf(63);
                    if (indexOf != -1) {
                        String substring = obj.substring(0, indexOf);
                        String substring2 = obj.substring(indexOf + 1);
                        if (substring2.contains("%{eventParams}")) {
                            substring2 = substring2.replace("%{eventParams}", "");
                            hashMap.putAll(diVar.b);
                        }
                        hashMap.putAll(bp.e(substring2));
                        obj = substring;
                    }
                    arrayList.add(new aq(obj, hashMap, diVar));
                }
            }
        }
        return arrayList;
    }

    public final void a(di diVar, by byVar, int i) {
        aq aqVar;
        boolean z;
        String str = "onEvent:event=" + diVar.a + ",params=" + diVar.b;
        List<aq> a2 = a((b) diVar.d.d().get(diVar.f), diVar);
        if (a2.isEmpty()) {
            for (Map.Entry entry : this.P.entrySet()) {
                if (((String) entry.getKey()).equals(diVar.a)) {
                    a2.add(new aq((String) entry.getValue(), diVar.b, diVar));
                }
            }
        }
        if (diVar.a.equals("adWillClose")) {
            Iterator it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (this.Q.contains(((aq) it.next()).a)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                a2.add(new aq("closeAd", Collections.emptyMap(), diVar));
            }
        }
        if (diVar.a.equals("renderFailed") && this.F != null) {
            p pVar = this.F;
            diVar.d.b().toString();
        }
        if (diVar.a.equals("clicked") && this.F != null) {
            p pVar2 = this.F;
            diVar.d.b().toString();
        }
        if (diVar.a.equals("videoCompleted") && this.F != null) {
            p pVar3 = this.F;
            diVar.d.b().toString();
        }
        aq aqVar2 = null;
        for (aq aqVar3 : a2) {
            if (aqVar3.a.equals("logEvent")) {
                aqVar3.b.put("__sendToServer", "true");
                aqVar = aqVar3;
            } else {
                aqVar = aqVar2;
            }
            if (aqVar3.a.equals("loadAdComponents")) {
                for (Map.Entry entry2 : aqVar3.c.b.entrySet()) {
                    aqVar3.b.put(((String) entry2.getKey()).toString(), ((String) entry2.getValue()).toString());
                }
            }
            Cdo.d(a, aqVar3.toString());
            byVar.a(aqVar3, this, i + 1);
            aqVar2 = aqVar;
        }
        if (aqVar2 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("__sendToServer", "false");
            aq aqVar4 = new aq("logEvent", hashMap, diVar);
            byVar.a(aqVar4, this, i + 1);
            Cdo.d(a, aqVar4.toString());
        }
    }

    @Override // com.flurry.android.by
    public final void a(aq aqVar, s sVar, int i) {
        long j;
        String str;
        int i2;
        boolean z = false;
        String str2 = "performAction:action=" + aqVar.a + ",params=" + aqVar.b + ",triggering event=" + aqVar.c.a;
        String str3 = aqVar.a;
        Context context = aqVar.c.c;
        dl dlVar = aqVar.c.e;
        j jVar = aqVar.c.d;
        String obj = jVar.b().toString();
        if (i > 10) {
            String str4 = "Maximum depth for event/action loop exceeded when performing action:" + str3 + "," + aqVar.b + ",triggered by:" + aqVar.c.a;
            return;
        }
        if (str3.equals("directOpen")) {
            if (aqVar.b.containsKey("url")) {
                String str5 = (String) aqVar.b.get("url");
                if (str5.startsWith("market://")) {
                    a(context, str5, jVar);
                    return;
                }
                if ("true".equals(aqVar.b.get("native"))) {
                    b(context, a(dlVar, jVar, str5), obj);
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) FlurryFullscreenTakeoverActivity.class);
                intent.putExtra("url", str5);
                if (bp.a(context, intent)) {
                    a(context, intent, obj);
                    return;
                } else {
                    Cdo.e(a, "Can't start FlurryFullscreenTakeoverActivity, was it declared in the manifest? Falling back to default browser");
                    b(context, str5, obj);
                    return;
                }
            }
            Cdo.b(a, "failed to perform directOpen action: no url in " + aqVar.c.a);
            return;
        }
        if (str3.equals("delete")) {
            if (aqVar.b.containsKey("count")) {
                String str6 = (String) aqVar.b.get("count");
                try {
                    i2 = Integer.parseInt(str6);
                } catch (NumberFormatException e2) {
                    String str7 = "caught NumberFormatException with count parameter in deleteAds:" + str6;
                    i2 = -1;
                }
                this.b.a(obj, i2);
                return;
            }
            if (aqVar.b.containsKey("groupId")) {
                this.b.a(obj, (String) aqVar.b.get("groupId"));
                return;
            }
            return;
        }
        if (str3.equals("processRedirect")) {
            if (aqVar.b.containsKey("url")) {
                String str8 = (String) aqVar.b.get("url");
                if ("true".equals(aqVar.b.get("native"))) {
                    b(context, a(dlVar, jVar, str8), obj);
                    return;
                }
                if (str8.startsWith("http")) {
                    String a2 = a(dlVar, jVar, str8);
                    try {
                        str = (String) new am(context, a2).execute(new Void[0]).get();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                        str = "";
                    } catch (ExecutionException e4) {
                        e4.printStackTrace();
                        str = "";
                    }
                    if (str != null) {
                        a(context, str, true, jVar);
                        return;
                    } else {
                        Cdo.e(a, "Redirect URL could not be found for: " + a2);
                        return;
                    }
                }
                a(context, str8, false, jVar);
                return;
            }
            return;
        }
        if (str3.equals("verifyUrl")) {
            if (aqVar.b.containsKey("url")) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage((String) aqVar.b.get("url"));
                sVar.a(new di(launchIntentForPackage != null && bp.a(context, launchIntentForPackage) ? "urlVerified" : "urlNotVerified", Collections.emptyMap(), aqVar.c.c, jVar, dlVar, aqVar.c.f), this, i + 1);
                return;
            }
            return;
        }
        if (str3.equals("launchPackage")) {
            if (aqVar.b.containsKey("package")) {
                String str9 = (String) aqVar.b.get("package");
                Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(str9);
                if (launchIntentForPackage2 == null || !bp.a(context, launchIntentForPackage2)) {
                    a(context, "https://play.google.com/store/apps/details?id=" + str9, false, jVar);
                    return;
                } else {
                    a(context, launchIntentForPackage2, jVar.b().toString());
                    return;
                }
            }
            return;
        }
        if (str3.equals("sendUrlAsync")) {
            if (aqVar.b.containsKey("url")) {
                String a3 = a(dlVar, jVar, (String) aqVar.b.get("url"));
                String str10 = "url after is: " + a3;
                this.B.post(new df(context, a3));
                return;
            }
            return;
        }
        if (str3.equals("sendAdLogs")) {
            o();
            return;
        }
        if (str3.equals("logEvent")) {
            boolean z2 = aqVar.b.containsKey("__sendToServer") && ((String) aqVar.b.get("__sendToServer")).equals("true");
            aqVar.b.remove("__sendToServer");
            a(aqVar.c.e, aqVar.c.a, z2, aqVar.b);
            return;
        }
        if (!str3.equals("nextFrame")) {
            if (str3.equals("nextAdUnit")) {
                an a4 = this.c.a(obj);
                if (a4 != null && aqVar.b.containsKey("delay")) {
                    int i3 = aqVar.c.f;
                    if (jVar != null && jVar.d().size() > 0) {
                        z = ((b) jVar.d().get(i3)).e().e().toString().equals("banner");
                    }
                    if (z) {
                        try {
                            j = Long.parseLong((String) aqVar.b.get("delay"));
                        } catch (NumberFormatException e5) {
                            String str11 = "caught NumberFormatException with delay parameter in nextAdUnit:" + ((String) aqVar.b.get("delay"));
                            j = 30;
                        }
                        a4.a(j * 1000);
                        return;
                    }
                }
                if (a4 != null) {
                    a4.post(new dc(this, context, obj, a4));
                    return;
                } else if (aqVar.c.a.equals("renderFailed")) {
                    a(context, obj);
                    return;
                } else {
                    this.N = c(obj);
                    a(context, this.N);
                    return;
                }
            }
            if (str3.equals("checkCap")) {
                if (aqVar.b.containsKey("idHash")) {
                    String str12 = (String) aqVar.b.get("idHash");
                    v a5 = this.d.a(str12);
                    String str13 = "capNotExhausted";
                    if (a5 != null && w.a(a5.h())) {
                        Cdo.d(a, "Discarding expired frequency cap info for idHash=" + str12);
                        this.d.b(str12);
                        a5 = null;
                    }
                    if (a5 != null && a5.c() >= a5.e()) {
                        Cdo.d(a, "Frequency cap exhausted for idHash=" + str12);
                        str13 = "capExhausted";
                    }
                    sVar.a(new di(str13, Collections.emptyMap(), aqVar.c.c, jVar, dlVar, aqVar.c.f), this, i + 1);
                    return;
                }
                return;
            }
            if (str3.equals("updateViewCount")) {
                if (aqVar.b.containsKey("idHash")) {
                    v a6 = this.d.a((String) aqVar.b.get("idHash"));
                    if (a6 != null) {
                        a6.d();
                        Cdo.d(a, "updateViewCount:idHash=" + a6.b() + ",newCap=" + a6.e() + ",prevCap=" + a6.f() + ",views=" + a6.c());
                        if (a6.c() > a6.e()) {
                            String str14 = "FlurryAdAction: !! rendering a capped object: " + a6.b();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String str15 = "Unknown action:" + str3 + ",triggered by:" + aqVar.c.a;
        }
    }

    private br a(Context context, j jVar) {
        c a2;
        this.N = jVar;
        if (jVar == null) {
            return null;
        }
        List d = jVar.d();
        if (d.size() <= 0) {
            return null;
        }
        b bVar = (b) d.get(0);
        int intValue = bVar.b().intValue();
        bVar.d().toString();
        String obj = bVar.e().e().toString();
        String obj2 = bVar.g().toString();
        dl dlVar = (dl) this.I.get(obj2);
        if (dlVar == null) {
            dlVar = dj.a(this, obj2);
        }
        dl a3 = a(dlVar, "requested", true, (Map) null);
        a(new di("filled", Collections.emptyMap(), context, jVar, a3, 0), this, 1);
        dj.a(bVar.e());
        if (this.N != null && this.N == jVar) {
            this.O = null;
            aa aaVar = this.C;
            if (intValue == 4 && aaVar != null && (a2 = aaVar.a()) != null) {
                a2.a = this;
                a2.b = a3;
                a2.d = 0;
                a2.c = jVar;
                this.O = new be(a2, jVar);
            } else if (obj.equals("takeover")) {
                this.u = a3;
                this.v = jVar;
                az a4 = this.E.a(context, this, a3, jVar);
                if (a4 != null) {
                    this.O = new co(a4, jVar);
                }
            } else {
                eb b = this.D.b(context, this, a3, jVar);
                if (b != null) {
                    this.O = new be(b, jVar);
                }
            }
        }
        return this.O;
    }

    final List a(Context context, String str, ViewGroup viewGroup, q qVar) {
        Pair create;
        String str2;
        this.d.c();
        int c = bp.c(context);
        int d = bp.d(context);
        switch (context.getResources().getConfiguration().orientation) {
            case 2:
                create = Pair.create(Integer.valueOf(d), Integer.valueOf(c));
                break;
            default:
                create = Pair.create(Integer.valueOf(c), Integer.valueOf(d));
                break;
        }
        int intValue = ((Integer) create.first).intValue();
        int intValue2 = ((Integer) create.second).intValue();
        Pair create2 = Pair.create(Integer.valueOf(bp.c(context)), Integer.valueOf(bp.d(context)));
        int intValue3 = ((Integer) create2.first).intValue();
        int intValue4 = ((Integer) create2.second).intValue();
        if (qVar.equals(q.BANNER_BOTTOM) || qVar.equals(q.BANNER_TOP)) {
            if (viewGroup != null && viewGroup.getHeight() > 0) {
                intValue4 = bp.a(context, viewGroup.getHeight());
            }
            if (viewGroup != null && viewGroup.getWidth() > 0) {
                intValue3 = bp.a(context, viewGroup.getWidth());
            }
        }
        byte[] a2 = a(str, intValue3, intValue4, intValue, intValue2, qVar);
        if (a2 == null || a2.length <= 0) {
            return Collections.emptyList();
        }
        if (this.p != null) {
            str2 = this.p + "/v5/getAds.do";
        } else {
            str2 = t.c() ? "https://ads.flurry.com/v5/getAds.do" : "http://ads.flurry.com/v5/getAds.do";
        }
        byte[] b = b(a2, str2);
        if (b == null || b.length <= 0) {
            return Collections.emptyList();
        }
        h hVar = (h) a(b, h.class);
        if (hVar == null) {
            return Collections.emptyList();
        }
        String str3 = "Got ad response: " + hVar;
        if (hVar.c().size() > 0) {
            Cdo.b(a, "Ad server responded with the following error(s):");
            Iterator it = hVar.c().iterator();
            while (it.hasNext()) {
                Cdo.b(a, ((CharSequence) it.next()).toString());
            }
            return Collections.emptyList();
        }
        if (!TextUtils.isEmpty(str) && (hVar.b() == null || hVar.b().size() == 0)) {
            Cdo.b(a, "Ad server responded but sent no ad units.");
            return Collections.emptyList();
        }
        return hVar.b();
    }

    private boolean d(String str) {
        return this.b.b(str);
    }

    private br e(String str) {
        return this.c.c(str);
    }

    private void f(String str) {
        this.c.d(str);
    }
}
