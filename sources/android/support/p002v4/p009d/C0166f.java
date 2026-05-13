package android.support.p002v4.p009d;

import java.util.LinkedHashMap;
/* renamed from: android.support.v4.d.f */
/* loaded from: classes.dex */
public class C0166f<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f438a;

    /* renamed from: b */
    private int f439b;

    /* renamed from: c */
    private int f440c;

    /* renamed from: d */
    private int f441d;

    /* renamed from: e */
    private int f442e;

    /* renamed from: f */
    private int f443f;

    /* renamed from: g */
    private int f444g;

    /* renamed from: h */
    private int f445h;

    public C0166f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f440c = i;
        this.f438a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public final V m13358a(K k) {
        V put;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f438a.get(k);
            if (v != null) {
                this.f444g++;
                return v;
            }
            this.f445h++;
            V m13356b = m13356b(k);
            if (m13356b == null) {
                return null;
            }
            synchronized (this) {
                this.f442e++;
                put = this.f438a.put(k, m13356b);
                if (put != null) {
                    this.f438a.put(k, put);
                } else {
                    this.f439b += m13355c(k, m13356b);
                }
            }
            if (put != null) {
                mo1062a(false, k, m13356b, put);
                return put;
            }
            m13359a(this.f440c);
            return m13356b;
        }
    }

    /* renamed from: a */
    public final V m13357a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f441d++;
            this.f439b += m13355c(k, v);
            put = this.f438a.put(k, v);
            if (put != null) {
                this.f439b -= m13355c(k, put);
            }
        }
        if (put != null) {
            mo1062a(false, k, put, v);
        }
        m13359a(this.f440c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13359a(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f439b     // Catch: java.lang.Throwable -> L32
            if (r0 < 0) goto L11
            java.util.LinkedHashMap<K, V> r0 = r4.f438a     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L35
            int r0 = r4.f439b     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L35
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            int r0 = r4.f439b     // Catch: java.lang.Throwable -> L32
            if (r0 <= r5) goto L41
            java.util.LinkedHashMap<K, V> r0 = r4.f438a     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L43
        L41:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            return
        L43:
            java.util.LinkedHashMap<K, V> r0 = r4.f438a     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashMap<K, V> r2 = r4.f438a     // Catch: java.lang.Throwable -> L32
            r2.remove(r1)     // Catch: java.lang.Throwable -> L32
            int r2 = r4.f439b     // Catch: java.lang.Throwable -> L32
            int r3 = r4.m13355c(r1, r0)     // Catch: java.lang.Throwable -> L32
            int r2 = r2 - r3
            r4.f439b = r2     // Catch: java.lang.Throwable -> L32
            int r2 = r4.f443f     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + 1
            r4.f443f = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            r2 = 1
            r3 = 0
            r4.mo1062a(r2, r1, r0, r3)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.p009d.C0166f.m13359a(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1062a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected V m13356b(K k) {
        return null;
    }

    /* renamed from: c */
    private int m13355c(K k, V v) {
        int mo1060b = mo1060b(k, v);
        if (mo1060b < 0) {
            throw new IllegalStateException("Negative size: " + k + "=" + v);
        }
        return mo1060b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1060b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final void m13360a() {
        m13359a(-1);
    }

    public final synchronized String toString() {
        String format;
        synchronized (this) {
            int i = this.f444g + this.f445h;
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f440c), Integer.valueOf(this.f444g), Integer.valueOf(this.f445h), Integer.valueOf(i != 0 ? (this.f444g * 100) / i : 0));
        }
        return format;
    }
}
