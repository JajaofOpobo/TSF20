package com.ksmobile.p063a.p065b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: com.ksmobile.a.b.a */
/* loaded from: classes.dex */
public final class C1281a<K, V> implements Map<K, V> {

    /* renamed from: b */
    static Object[] f4055b;

    /* renamed from: c */
    static int f4056c;

    /* renamed from: d */
    static Object[] f4057d;

    /* renamed from: e */
    static int f4058e;

    /* renamed from: g */
    int[] f4060g;

    /* renamed from: h */
    Object[] f4061h;

    /* renamed from: i */
    int f4062i;

    /* renamed from: j */
    AbstractC1287f<K, V> f4063j;

    /* renamed from: a */
    public static final C1281a f4054a = new C1281a(true);

    /* renamed from: f */
    static final int[] f4059f = new int[0];

    /* renamed from: a */
    int m9129a(Object obj, int i) {
        int i2 = this.f4062i;
        if (i2 == 0) {
            return -1;
        }
        int m9121a = C1284c.m9121a(this.f4060g, i2, i);
        if (m9121a >= 0 && !obj.equals(this.f4061h[m9121a << 1])) {
            int i3 = m9121a + 1;
            while (i3 < i2 && this.f4060g[i3] == i) {
                if (obj.equals(this.f4061h[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m9121a - 1; i4 >= 0 && this.f4060g[i4] == i; i4--) {
                if (obj.equals(this.f4061h[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m9121a;
    }

    /* renamed from: a */
    int m9133a() {
        int i = this.f4062i;
        if (i == 0) {
            return -1;
        }
        int m9121a = C1284c.m9121a(this.f4060g, i, 0);
        if (m9121a >= 0 && this.f4061h[m9121a << 1] != null) {
            int i2 = m9121a + 1;
            while (i2 < i && this.f4060g[i2] == 0) {
                if (this.f4061h[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m9121a - 1; i3 >= 0 && this.f4060g[i3] == 0; i3--) {
                if (this.f4061h[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m9121a;
    }

    /* renamed from: e */
    private void m9123e(int i) {
        if (this.f4060g == f4059f) {
            throw new UnsupportedOperationException("ArrayMap is immutable");
        }
        if (i == 8) {
            synchronized (C1281a.class) {
                if (f4057d != null) {
                    Object[] objArr = f4057d;
                    this.f4061h = objArr;
                    f4057d = (Object[]) objArr[0];
                    this.f4060g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4058e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1281a.class) {
                if (f4055b != null) {
                    Object[] objArr2 = f4055b;
                    this.f4061h = objArr2;
                    f4055b = (Object[]) objArr2[0];
                    this.f4060g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4056c--;
                    return;
                }
            }
        }
        this.f4060g = new int[i];
        this.f4061h = new Object[i << 1];
    }

    /* renamed from: a */
    private static void m9128a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1281a.class) {
                if (f4058e < 10) {
                    objArr[0] = f4057d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4057d = objArr;
                    f4058e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1281a.class) {
                if (f4056c < 10) {
                    objArr[0] = f4055b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4055b = objArr;
                    f4056c++;
                }
            }
        }
    }

    public C1281a() {
        this.f4060g = C1284c.f4066b;
        this.f4061h = C1284c.f4068d;
        this.f4062i = 0;
    }

    private C1281a(boolean z) {
        this.f4060g = f4059f;
        this.f4061h = C1284c.f4068d;
        this.f4062i = 0;
    }

    @Override // java.util.Map
    public void clear() {
        if (this.f4062i > 0) {
            m9128a(this.f4060g, this.f4061h, this.f4062i);
            this.f4060g = C1284c.f4066b;
            this.f4061h = C1284c.f4068d;
            this.f4062i = 0;
        }
    }

    /* renamed from: a */
    public void m9132a(int i) {
        if (this.f4060g.length < i) {
            int[] iArr = this.f4060g;
            Object[] objArr = this.f4061h;
            m9123e(i);
            if (this.f4062i > 0) {
                System.arraycopy(iArr, 0, this.f4060g, 0, this.f4062i);
                System.arraycopy(objArr, 0, this.f4061h, 0, this.f4062i << 1);
            }
            m9128a(iArr, objArr, this.f4062i);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return obj == null ? m9133a() >= 0 : m9129a(obj, obj.hashCode()) >= 0;
    }

    /* renamed from: a */
    int m9130a(Object obj) {
        int i = 1;
        int i2 = this.f4062i * 2;
        Object[] objArr = this.f4061h;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] != null) {
                    i += 2;
                } else {
                    return i >> 1;
                }
            }
        } else {
            while (i < i2) {
                if (!obj.equals(objArr[i])) {
                    i += 2;
                } else {
                    return i >> 1;
                }
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m9130a(obj) >= 0;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int m9133a = obj == null ? m9133a() : m9129a(obj, obj.hashCode());
        if (m9133a >= 0) {
            return (V) this.f4061h[(m9133a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public K m9126b(int i) {
        return (K) this.f4061h[i << 1];
    }

    /* renamed from: c */
    public V m9125c(int i) {
        return (V) this.f4061h[(i << 1) + 1];
    }

    /* renamed from: a */
    public V m9131a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.f4061h[i2];
        this.f4061h[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f4062i <= 0;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        int hashCode;
        int m9129a;
        int i = 8;
        if (k == null) {
            m9129a = m9133a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            m9129a = m9129a(k, hashCode);
        }
        if (m9129a >= 0) {
            int i2 = (m9129a << 1) + 1;
            V v2 = (V) this.f4061h[i2];
            this.f4061h[i2] = v;
            return v2;
        }
        int i3 = m9129a ^ (-1);
        if (this.f4062i >= this.f4060g.length) {
            if (this.f4062i >= 8) {
                i = this.f4062i + (this.f4062i >> 1);
            } else if (this.f4062i < 4) {
                i = 4;
            }
            int[] iArr = this.f4060g;
            Object[] objArr = this.f4061h;
            m9123e(i);
            if (this.f4060g.length > 0) {
                System.arraycopy(iArr, 0, this.f4060g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4061h, 0, objArr.length);
            }
            m9128a(iArr, objArr, this.f4062i);
        }
        if (i3 < this.f4062i) {
            System.arraycopy(this.f4060g, i3, this.f4060g, i3 + 1, this.f4062i - i3);
            System.arraycopy(this.f4061h, i3 << 1, this.f4061h, (i3 + 1) << 1, (this.f4062i - i3) << 1);
        }
        this.f4060g[i3] = hashCode;
        this.f4061h[i3 << 1] = k;
        this.f4061h[(i3 << 1) + 1] = v;
        this.f4062i++;
        return null;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int m9133a = obj == null ? m9133a() : m9129a(obj, obj.hashCode());
        if (m9133a >= 0) {
            return m9124d(m9133a);
        }
        return null;
    }

    /* renamed from: d */
    public V m9124d(int i) {
        V v = (V) this.f4061h[(i << 1) + 1];
        if (this.f4062i <= 1) {
            m9128a(this.f4060g, this.f4061h, this.f4062i);
            this.f4060g = C1284c.f4066b;
            this.f4061h = C1284c.f4068d;
            this.f4062i = 0;
        } else if (this.f4060g.length > 8 && this.f4062i < this.f4060g.length / 3) {
            int i2 = this.f4062i > 8 ? this.f4062i + (this.f4062i >> 1) : 8;
            int[] iArr = this.f4060g;
            Object[] objArr = this.f4061h;
            m9123e(i2);
            this.f4062i--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4060g, 0, i);
                System.arraycopy(objArr, 0, this.f4061h, 0, i << 1);
            }
            if (i < this.f4062i) {
                System.arraycopy(iArr, i + 1, this.f4060g, i, this.f4062i - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f4061h, i << 1, (this.f4062i - i) << 1);
            }
        } else {
            this.f4062i--;
            if (i < this.f4062i) {
                System.arraycopy(this.f4060g, i + 1, this.f4060g, i, this.f4062i - i);
                System.arraycopy(this.f4061h, (i + 1) << 1, this.f4061h, i << 1, (this.f4062i - i) << 1);
            }
            this.f4061h[this.f4062i << 1] = null;
            this.f4061h[(this.f4062i << 1) + 1] = null;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.f4062i;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.f4062i; i++) {
                try {
                    K m9126b = m9126b(i);
                    V m9125c = m9125c(i);
                    Object obj2 = map.get(m9126b);
                    if (m9125c == null) {
                        if (obj2 != null || !map.containsKey(m9126b)) {
                            return false;
                        }
                    } else if (!m9125c.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException e) {
                    return false;
                } catch (NullPointerException e2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        int[] iArr = this.f4060g;
        Object[] objArr = this.f4061h;
        int i = this.f4062i;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4062i * 28);
        sb.append('{');
        for (int i = 0; i < this.f4062i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m9126b = m9126b(i);
            if (m9126b != this) {
                sb.append(m9126b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m9125c = m9125c(i);
            if (m9125c != this) {
                sb.append(m9125c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private AbstractC1287f<K, V> m9127b() {
        if (this.f4063j == null) {
            this.f4063j = new AbstractC1287f<K, V>() { // from class: com.ksmobile.a.b.a.1
                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected int mo9113a() {
                    return C1281a.this.f4062i;
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected Object mo9111a(int i, int i2) {
                    return C1281a.this.f4061h[(i << 1) + i2];
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected int mo9109a(Object obj) {
                    return obj == null ? C1281a.this.m9133a() : C1281a.this.m9129a(obj, obj.hashCode());
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: b */
                protected int mo9102b(Object obj) {
                    return C1281a.this.m9130a(obj);
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: b */
                protected Map<K, V> mo9104b() {
                    return C1281a.this;
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected void mo9108a(K k, V v) {
                    C1281a.this.put(k, v);
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected V mo9110a(int i, V v) {
                    return (V) C1281a.this.m9131a(i, (int) v);
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: a */
                protected void mo9112a(int i) {
                    C1281a.this.m9124d(i);
                }

                @Override // com.ksmobile.p063a.p065b.AbstractC1287f
                /* renamed from: c */
                protected void mo9100c() {
                    C1281a.this.clear();
                }
            };
        }
        return this.f4063j;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m9132a(this.f4062i + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m9127b().m9098d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m9127b().m9097e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m9127b().m9096f();
    }
}
