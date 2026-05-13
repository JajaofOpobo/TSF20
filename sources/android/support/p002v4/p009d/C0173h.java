package android.support.p002v4.p009d;

import java.util.Map;
/* renamed from: android.support.v4.d.h */
/* loaded from: classes.dex */
public class C0173h<K, V> {

    /* renamed from: b */
    static Object[] f461b;

    /* renamed from: c */
    static int f462c;

    /* renamed from: d */
    static Object[] f463d;

    /* renamed from: e */
    static int f464e;

    /* renamed from: f */
    int[] f465f;

    /* renamed from: g */
    Object[] f466g;

    /* renamed from: h */
    int f467h;

    /* renamed from: a */
    int m13330a(Object obj, int i) {
        int i2 = this.f467h;
        if (i2 == 0) {
            return -1;
        }
        int m13375a = C0162b.m13375a(this.f465f, i2, i);
        if (m13375a >= 0 && !obj.equals(this.f466g[m13375a << 1])) {
            int i3 = m13375a + 1;
            while (i3 < i2 && this.f465f[i3] == i) {
                if (obj.equals(this.f466g[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m13375a - 1; i4 >= 0 && this.f465f[i4] == i; i4--) {
                if (obj.equals(this.f466g[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return m13375a;
    }

    /* renamed from: a */
    int m13334a() {
        int i = this.f467h;
        if (i == 0) {
            return -1;
        }
        int m13375a = C0162b.m13375a(this.f465f, i, 0);
        if (m13375a >= 0 && this.f466g[m13375a << 1] != null) {
            int i2 = m13375a + 1;
            while (i2 < i && this.f465f[i2] == 0) {
                if (this.f466g[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m13375a - 1; i3 >= 0 && this.f465f[i3] == 0; i3--) {
                if (this.f466g[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return m13375a;
    }

    /* renamed from: e */
    private void m13324e(int i) {
        if (i == 8) {
            synchronized (C0160a.class) {
                if (f463d != null) {
                    Object[] objArr = f463d;
                    this.f466g = objArr;
                    f463d = (Object[]) objArr[0];
                    this.f465f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f464e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0160a.class) {
                if (f461b != null) {
                    Object[] objArr2 = f461b;
                    this.f466g = objArr2;
                    f461b = (Object[]) objArr2[0];
                    this.f465f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f462c--;
                    return;
                }
            }
        }
        this.f465f = new int[i];
        this.f466g = new Object[i << 1];
    }

    /* renamed from: a */
    private static void m13329a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0160a.class) {
                if (f464e < 10) {
                    objArr[0] = f463d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f463d = objArr;
                    f464e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0160a.class) {
                if (f462c < 10) {
                    objArr[0] = f461b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f461b = objArr;
                    f462c++;
                }
            }
        }
    }

    public C0173h() {
        this.f465f = C0162b.f428a;
        this.f466g = C0162b.f430c;
        this.f467h = 0;
    }

    public C0173h(int i) {
        if (i == 0) {
            this.f465f = C0162b.f428a;
            this.f466g = C0162b.f430c;
        } else {
            m13324e(i);
        }
        this.f467h = 0;
    }

    public void clear() {
        if (this.f467h != 0) {
            m13329a(this.f465f, this.f466g, this.f467h);
            this.f465f = C0162b.f428a;
            this.f466g = C0162b.f430c;
            this.f467h = 0;
        }
    }

    /* renamed from: a */
    public void m13333a(int i) {
        if (this.f465f.length < i) {
            int[] iArr = this.f465f;
            Object[] objArr = this.f466g;
            m13324e(i);
            if (this.f467h > 0) {
                System.arraycopy(iArr, 0, this.f465f, 0, this.f467h);
                System.arraycopy(objArr, 0, this.f466g, 0, this.f467h << 1);
            }
            m13329a(iArr, objArr, this.f467h);
        }
    }

    public boolean containsKey(Object obj) {
        return m13331a(obj) >= 0;
    }

    /* renamed from: a */
    public int m13331a(Object obj) {
        return obj == null ? m13334a() : m13330a(obj, obj.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m13327b(Object obj) {
        int i = 1;
        int i2 = this.f467h * 2;
        Object[] objArr = this.f466g;
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

    public boolean containsValue(Object obj) {
        return m13327b(obj) >= 0;
    }

    public V get(Object obj) {
        int m13331a = m13331a(obj);
        if (m13331a >= 0) {
            return (V) this.f466g[(m13331a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public K m13328b(int i) {
        return (K) this.f466g[i << 1];
    }

    /* renamed from: c */
    public V m13326c(int i) {
        return (V) this.f466g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V m13332a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = (V) this.f466g[i2];
        this.f466g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f467h <= 0;
    }

    public V put(K k, V v) {
        int hashCode;
        int m13330a;
        int i = 8;
        if (k == null) {
            m13330a = m13334a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            m13330a = m13330a(k, hashCode);
        }
        if (m13330a >= 0) {
            int i2 = (m13330a << 1) + 1;
            V v2 = (V) this.f466g[i2];
            this.f466g[i2] = v;
            return v2;
        }
        int i3 = m13330a ^ (-1);
        if (this.f467h >= this.f465f.length) {
            if (this.f467h >= 8) {
                i = this.f467h + (this.f467h >> 1);
            } else if (this.f467h < 4) {
                i = 4;
            }
            int[] iArr = this.f465f;
            Object[] objArr = this.f466g;
            m13324e(i);
            if (this.f465f.length > 0) {
                System.arraycopy(iArr, 0, this.f465f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f466g, 0, objArr.length);
            }
            m13329a(iArr, objArr, this.f467h);
        }
        if (i3 < this.f467h) {
            System.arraycopy(this.f465f, i3, this.f465f, i3 + 1, this.f467h - i3);
            System.arraycopy(this.f466g, i3 << 1, this.f466g, (i3 + 1) << 1, (this.f467h - i3) << 1);
        }
        this.f465f[i3] = hashCode;
        this.f466g[i3 << 1] = k;
        this.f466g[(i3 << 1) + 1] = v;
        this.f467h++;
        return null;
    }

    public V remove(Object obj) {
        int m13331a = m13331a(obj);
        if (m13331a >= 0) {
            return m13325d(m13331a);
        }
        return null;
    }

    /* renamed from: d */
    public V m13325d(int i) {
        V v = (V) this.f466g[(i << 1) + 1];
        if (this.f467h <= 1) {
            m13329a(this.f465f, this.f466g, this.f467h);
            this.f465f = C0162b.f428a;
            this.f466g = C0162b.f430c;
            this.f467h = 0;
        } else if (this.f465f.length > 8 && this.f467h < this.f465f.length / 3) {
            int i2 = this.f467h > 8 ? this.f467h + (this.f467h >> 1) : 8;
            int[] iArr = this.f465f;
            Object[] objArr = this.f466g;
            m13324e(i2);
            this.f467h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f465f, 0, i);
                System.arraycopy(objArr, 0, this.f466g, 0, i << 1);
            }
            if (i < this.f467h) {
                System.arraycopy(iArr, i + 1, this.f465f, i, this.f467h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f466g, i << 1, (this.f467h - i) << 1);
            }
        } else {
            this.f467h--;
            if (i < this.f467h) {
                System.arraycopy(this.f465f, i + 1, this.f465f, i, this.f467h - i);
                System.arraycopy(this.f466g, (i + 1) << 1, this.f466g, i << 1, (this.f467h - i) << 1);
            }
            this.f466g[this.f467h << 1] = null;
            this.f466g[(this.f467h << 1) + 1] = null;
        }
        return v;
    }

    public int size() {
        return this.f467h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.f467h; i++) {
                try {
                    K m13328b = m13328b(i);
                    V m13326c = m13326c(i);
                    Object obj2 = map.get(m13328b);
                    if (m13326c == null) {
                        if (obj2 != null || !map.containsKey(m13328b)) {
                            return false;
                        }
                    } else if (!m13326c.equals(obj2)) {
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

    public int hashCode() {
        int[] iArr = this.f465f;
        Object[] objArr = this.f466g;
        int i = this.f467h;
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
        StringBuilder sb = new StringBuilder(this.f467h * 28);
        sb.append('{');
        for (int i = 0; i < this.f467h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m13328b = m13328b(i);
            if (m13328b != this) {
                sb.append(m13328b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m13326c = m13326c(i);
            if (m13326c != this) {
                sb.append(m13326c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
