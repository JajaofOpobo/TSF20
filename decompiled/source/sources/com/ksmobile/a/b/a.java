package com.ksmobile.a.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class a<K, V> implements Map<K, V> {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] g;
    Object[] h;
    int i;
    f<K, V> j;
    public static final a a = new a(true);
    static final int[] f = new int[0];

    int a(Object obj, int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.g, i2, i);
        if (a2 >= 0 && !obj.equals(this.h[a2 << 1])) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.g[i3] == i) {
                if (obj.equals(this.h[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.g[i4] == i; i4--) {
                if (obj.equals(this.h[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    int a() {
        int i = this.i;
        if (i == 0) {
            return -1;
        }
        int a2 = c.a(this.g, i, 0);
        if (a2 >= 0 && this.h[a2 << 1] != null) {
            int i2 = a2 + 1;
            while (i2 < i && this.g[i2] == 0) {
                if (this.h[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.g[i3] == 0; i3--) {
                if (this.h[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return a2;
    }

    private void e(int i) {
        if (this.g == f) {
            throw new UnsupportedOperationException("ArrayMap is immutable");
        }
        if (i == 8) {
            synchronized (a.class) {
                if (d != null) {
                    Object[] objArr = d;
                    this.h = objArr;
                    d = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                if (b != null) {
                    Object[] objArr2 = b;
                    this.h = objArr2;
                    b = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    c--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.h = new Object[i << 1];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (a.class) {
                if (c < 10) {
                    objArr[0] = b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    b = objArr;
                    c++;
                }
            }
        }
    }

    public a() {
        this.g = c.b;
        this.h = c.d;
        this.i = 0;
    }

    private a(boolean z) {
        this.g = f;
        this.h = c.d;
        this.i = 0;
    }

    @Override // java.util.Map
    public void clear() {
        if (this.i > 0) {
            a(this.g, this.h, this.i);
            this.g = c.b;
            this.h = c.d;
            this.i = 0;
        }
    }

    public void a(int i) {
        if (this.g.length < i) {
            int[] iArr = this.g;
            Object[] objArr = this.h;
            e(i);
            if (this.i > 0) {
                System.arraycopy(iArr, 0, this.g, 0, this.i);
                System.arraycopy(objArr, 0, this.h, 0, this.i << 1);
            }
            a(iArr, objArr, this.i);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return obj == null ? a() >= 0 : a(obj, obj.hashCode()) >= 0;
    }

    int a(Object obj) {
        int i = 1;
        int i2 = this.i * 2;
        Object[] objArr = this.h;
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
        return a(obj) >= 0;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int a2 = obj == null ? a() : a(obj, obj.hashCode());
        if (a2 >= 0) {
            return (V) this.h[(a2 << 1) + 1];
        }
        return null;
    }

    public K b(int i) {
        return (K) this.h[i << 1];
    }

    public V c(int i) {
        return (V) this.h[(i << 1) + 1];
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.h[i2];
        this.h[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.i <= 0;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        int hashCode;
        int a2;
        int i = 8;
        if (k == null) {
            a2 = a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            a2 = a(k, hashCode);
        }
        if (a2 >= 0) {
            int i2 = (a2 << 1) + 1;
            V v2 = (V) this.h[i2];
            this.h[i2] = v;
            return v2;
        }
        int i3 = a2 ^ (-1);
        if (this.i >= this.g.length) {
            if (this.i >= 8) {
                i = this.i + (this.i >> 1);
            } else if (this.i < 4) {
                i = 4;
            }
            int[] iArr = this.g;
            Object[] objArr = this.h;
            e(i);
            if (this.g.length > 0) {
                System.arraycopy(iArr, 0, this.g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.h, 0, objArr.length);
            }
            a(iArr, objArr, this.i);
        }
        if (i3 < this.i) {
            System.arraycopy(this.g, i3, this.g, i3 + 1, this.i - i3);
            System.arraycopy(this.h, i3 << 1, this.h, (i3 + 1) << 1, (this.i - i3) << 1);
        }
        this.g[i3] = hashCode;
        this.h[i3 << 1] = k;
        this.h[(i3 << 1) + 1] = v;
        this.i++;
        return null;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int a2 = obj == null ? a() : a(obj, obj.hashCode());
        if (a2 >= 0) {
            return d(a2);
        }
        return null;
    }

    public V d(int i) {
        V v = (V) this.h[(i << 1) + 1];
        if (this.i <= 1) {
            a(this.g, this.h, this.i);
            this.g = c.b;
            this.h = c.d;
            this.i = 0;
        } else if (this.g.length > 8 && this.i < this.g.length / 3) {
            int i2 = this.i > 8 ? this.i + (this.i >> 1) : 8;
            int[] iArr = this.g;
            Object[] objArr = this.h;
            e(i2);
            this.i--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i);
                System.arraycopy(objArr, 0, this.h, 0, i << 1);
            }
            if (i < this.i) {
                System.arraycopy(iArr, i + 1, this.g, i, this.i - i);
                System.arraycopy(objArr, (i + 1) << 1, this.h, i << 1, (this.i - i) << 1);
            }
        } else {
            this.i--;
            if (i < this.i) {
                System.arraycopy(this.g, i + 1, this.g, i, this.i - i);
                System.arraycopy(this.h, (i + 1) << 1, this.h, i << 1, (this.i - i) << 1);
            }
            this.h[this.i << 1] = null;
            this.h[(this.i << 1) + 1] = null;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.i;
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
            for (int i = 0; i < this.i; i++) {
                try {
                    K b2 = b(i);
                    V c2 = c(i);
                    Object obj2 = map.get(b2);
                    if (c2 == null) {
                        if (obj2 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException e2) {
                    return false;
                } catch (NullPointerException e3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.h;
        int i = this.i;
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
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        for (int i = 0; i < this.i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private f<K, V> b() {
        if (this.j == null) {
            this.j = new f<K, V>() { // from class: com.ksmobile.a.b.a.1
                @Override // com.ksmobile.a.b.f
                protected int a() {
                    return a.this.i;
                }

                @Override // com.ksmobile.a.b.f
                protected Object a(int i, int i2) {
                    return a.this.h[(i << 1) + i2];
                }

                @Override // com.ksmobile.a.b.f
                protected int a(Object obj) {
                    return obj == null ? a.this.a() : a.this.a(obj, obj.hashCode());
                }

                @Override // com.ksmobile.a.b.f
                protected int b(Object obj) {
                    return a.this.a(obj);
                }

                @Override // com.ksmobile.a.b.f
                protected Map<K, V> b() {
                    return a.this;
                }

                @Override // com.ksmobile.a.b.f
                protected void a(K k, V v) {
                    a.this.put(k, v);
                }

                @Override // com.ksmobile.a.b.f
                protected V a(int i, V v) {
                    return (V) a.this.a(i, (int) v);
                }

                @Override // com.ksmobile.a.b.f
                protected void a(int i) {
                    a.this.d(i);
                }

                @Override // com.ksmobile.a.b.f
                protected void c() {
                    a.this.clear();
                }
            };
        }
        return this.j;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.i + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
