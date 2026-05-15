package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.b;
import com.android.volley.n;
import com.android.volley.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class l<T> implements Comparable<l<T>> {
    private final t.a a;
    private final int b;
    private final String c;
    private final int d;
    private final n.a e;
    private Integer f;
    private m g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private p l;
    private b.a m;
    private Object n;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    protected abstract n<T> a(i iVar);

    protected abstract void a(T t);

    public l(int i, String str, n.a aVar) {
        this.a = t.a.a ? new t.a() : null;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = 0L;
        this.m = null;
        this.b = i;
        this.c = str;
        this.e = aVar;
        a((p) new d());
        this.d = c(str);
    }

    public int a() {
        return this.b;
    }

    public Object b() {
        return this.n;
    }

    public int c() {
        return this.d;
    }

    private static int c(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(p pVar) {
        this.l = pVar;
        return this;
    }

    public void a(String str) {
        if (t.a.a) {
            this.a.a(str, Thread.currentThread().getId());
        } else if (this.k == 0) {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    void b(final String str) {
        if (this.g != null) {
            this.g.b(this);
        }
        if (t.a.a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.volley.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        l.this.a.a(str, id);
                        l.this.a.a(toString());
                    }
                });
                return;
            } else {
                this.a.a(str, id);
                this.a.a(toString());
                return;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        if (jElapsedRealtime >= 3000) {
            t.b("%d ms: %s", Long.valueOf(jElapsedRealtime), toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(m mVar) {
        this.g = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l<?> a(b.a aVar) {
        this.m = aVar;
        return this;
    }

    public b.a f() {
        return this.m;
    }

    public void g() {
        this.i = true;
    }

    public boolean h() {
        return this.i;
    }

    public Map<String, String> i() {
        return Collections.emptyMap();
    }

    @Deprecated
    protected Map<String, String> j() {
        return n();
    }

    @Deprecated
    protected String k() {
        return o();
    }

    @Deprecated
    public String l() {
        return p();
    }

    @Deprecated
    public byte[] m() {
        Map<String, String> mapJ = j();
        if (mapJ == null || mapJ.size() <= 0) {
            return null;
        }
        return a(mapJ, k());
    }

    protected Map<String, String> n() {
        return null;
    }

    protected String o() {
        return "UTF-8";
    }

    public String p() {
        return "application/x-www-form-urlencoded; charset=" + o();
    }

    public byte[] q() {
        Map<String, String> mapN = n();
        if (mapN == null || mapN.size() <= 0) {
            return null;
        }
        return a(mapN, o());
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> a(boolean z) {
        this.h = z;
        return this;
    }

    public final boolean r() {
        return this.h;
    }

    public a s() {
        return a.NORMAL;
    }

    public final int t() {
        return this.l.a();
    }

    public p u() {
        return this.l;
    }

    public void v() {
        this.j = true;
    }

    public boolean w() {
        return this.j;
    }

    protected s a(s sVar) {
        return sVar;
    }

    public void b(s sVar) {
        if (this.e != null) {
            this.e.a(sVar);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l<T> lVar) {
        a aVarS = s();
        a aVarS2 = lVar.s();
        return aVarS == aVarS2 ? this.f.intValue() - lVar.f.intValue() : aVarS2.ordinal() - aVarS.ordinal();
    }

    public String toString() {
        return (this.i ? "[X] " : "[ ] ") + d() + " " + ("0x" + Integer.toHexString(c())) + " " + s() + " " + this.f;
    }
}
