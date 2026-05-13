package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.C0802n;
import com.android.volley.C0810t;
import com.android.volley.InterfaceC0781b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
/* renamed from: com.android.volley.l */
/* loaded from: classes.dex */
public abstract class AbstractC0795l<T> implements Comparable<AbstractC0795l<T>> {

    /* renamed from: a */
    private final C0810t.C0811a f2285a;

    /* renamed from: b */
    private final int f2286b;

    /* renamed from: c */
    private final String f2287c;

    /* renamed from: d */
    private final int f2288d;

    /* renamed from: e */
    private final C0802n.InterfaceC0803a f2289e;

    /* renamed from: f */
    private Integer f2290f;

    /* renamed from: g */
    private C0798m f2291g;

    /* renamed from: h */
    private boolean f2292h;

    /* renamed from: i */
    private boolean f2293i;

    /* renamed from: j */
    private boolean f2294j;

    /* renamed from: k */
    private long f2295k;

    /* renamed from: l */
    private InterfaceC0806p f2296l;

    /* renamed from: m */
    private InterfaceC0781b.C0782a f2297m;

    /* renamed from: n */
    private Object f2298n;

    /* renamed from: com.android.volley.l$a */
    /* loaded from: classes.dex */
    public enum EnumC0797a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0802n<T> mo6646a(C0792i c0792i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7365a(T t);

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return m11036a((AbstractC0795l) ((AbstractC0795l) obj));
    }

    public AbstractC0795l(int i, String str, C0802n.InterfaceC0803a interfaceC0803a) {
        this.f2285a = C0810t.C0811a.f2328a ? new C0810t.C0811a() : null;
        this.f2292h = true;
        this.f2293i = false;
        this.f2294j = false;
        this.f2295k = 0L;
        this.f2297m = null;
        this.f2286b = i;
        this.f2287c = str;
        this.f2289e = interfaceC0803a;
        m11034a((InterfaceC0806p) new C0785d());
        this.f2288d = m11026c(str);
    }

    /* renamed from: a */
    public int m11039a() {
        return this.f2286b;
    }

    /* renamed from: b */
    public Object m11031b() {
        return this.f2298n;
    }

    /* renamed from: c */
    public int m11027c() {
        return this.f2288d;
    }

    /* renamed from: c */
    private static int m11026c(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0795l<?> m11034a(InterfaceC0806p interfaceC0806p) {
        this.f2296l = interfaceC0806p;
        return this;
    }

    /* renamed from: a */
    public void mo6644a(String str) {
        if (C0810t.C0811a.f2328a) {
            this.f2285a.m10984a(str, Thread.currentThread().getId());
        } else if (this.f2295k == 0) {
            this.f2295k = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11028b(final String str) {
        if (this.f2291g != null) {
            this.f2291g.m11006b(this);
        }
        if (C0810t.C0811a.f2328a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.volley.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0795l.this.f2285a.m10984a(str, id);
                        AbstractC0795l.this.f2285a.m10985a(toString());
                    }
                });
                return;
            }
            this.f2285a.m10984a(str, id);
            this.f2285a.m10985a(toString());
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2295k;
        if (elapsedRealtime >= 3000) {
            C0810t.m10990b("%d ms: %s", Long.valueOf(elapsedRealtime), toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0795l<?> m11035a(C0798m c0798m) {
        this.f2291g = c0798m;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC0795l<?> m11038a(int i) {
        this.f2290f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public String m11025d() {
        return this.f2287c;
    }

    /* renamed from: e */
    public String m11024e() {
        return m11025d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0795l<?> m11037a(InterfaceC0781b.C0782a c0782a) {
        this.f2297m = c0782a;
        return this;
    }

    /* renamed from: f */
    public InterfaceC0781b.C0782a m11023f() {
        return this.f2297m;
    }

    /* renamed from: g */
    public void m11022g() {
        this.f2293i = true;
    }

    /* renamed from: h */
    public boolean m11021h() {
        return this.f2293i;
    }

    /* renamed from: i */
    public Map<String, String> m11020i() {
        return Collections.emptyMap();
    }

    @Deprecated
    /* renamed from: j */
    protected Map<String, String> m11019j() {
        return mo6190n();
    }

    @Deprecated
    /* renamed from: k */
    protected String m11018k() {
        return m11017o();
    }

    @Deprecated
    /* renamed from: l */
    public String mo10905l() {
        return mo10903p();
    }

    @Deprecated
    /* renamed from: m */
    public byte[] mo10904m() {
        Map<String, String> m11019j = m11019j();
        if (m11019j == null || m11019j.size() <= 0) {
            return null;
        }
        return m11033a(m11019j, m11018k());
    }

    /* renamed from: n */
    protected Map<String, String> mo6190n() {
        return null;
    }

    /* renamed from: o */
    protected String m11017o() {
        return "UTF-8";
    }

    /* renamed from: p */
    public String mo10903p() {
        return "application/x-www-form-urlencoded; charset=" + m11017o();
    }

    /* renamed from: q */
    public byte[] mo10902q() {
        Map<String, String> mo6190n = mo6190n();
        if (mo6190n == null || mo6190n.size() <= 0) {
            return null;
        }
        return m11033a(mo6190n, m11017o());
    }

    /* renamed from: a */
    private byte[] m11033a(Map<String, String> map, String str) {
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
    /* renamed from: a */
    public final AbstractC0795l<?> m11032a(boolean z) {
        this.f2292h = z;
        return this;
    }

    /* renamed from: r */
    public final boolean m11016r() {
        return this.f2292h;
    }

    /* renamed from: s */
    public EnumC0797a mo6643s() {
        return EnumC0797a.NORMAL;
    }

    /* renamed from: t */
    public final int m11015t() {
        return this.f2296l.mo10996a();
    }

    /* renamed from: u */
    public InterfaceC0806p m11014u() {
        return this.f2296l;
    }

    /* renamed from: v */
    public void m11013v() {
        this.f2294j = true;
    }

    /* renamed from: w */
    public boolean m11012w() {
        return this.f2294j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0809s mo6645a(C0809s c0809s) {
        return c0809s;
    }

    /* renamed from: b */
    public void m11029b(C0809s c0809s) {
        if (this.f2289e != null) {
            this.f2289e.mo6194a(c0809s);
        }
    }

    /* renamed from: a */
    public int m11036a(AbstractC0795l<T> abstractC0795l) {
        EnumC0797a mo6643s = mo6643s();
        EnumC0797a mo6643s2 = abstractC0795l.mo6643s();
        return mo6643s == mo6643s2 ? this.f2290f.intValue() - abstractC0795l.f2290f.intValue() : mo6643s2.ordinal() - mo6643s.ordinal();
    }

    public String toString() {
        return (this.f2293i ? "[X] " : "[ ] ") + m11025d() + " " + ("0x" + Integer.toHexString(m11027c())) + " " + mo6643s() + " " + this.f2290f;
    }
}
