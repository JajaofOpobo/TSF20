package android.support.p002v4.p009d;
/* renamed from: android.support.v4.d.e */
/* loaded from: classes.dex */
public class C0165e<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f433a = new Object();

    /* renamed from: b */
    private boolean f434b;

    /* renamed from: c */
    private long[] f435c;

    /* renamed from: d */
    private Object[] f436d;

    /* renamed from: e */
    private int f437e;

    public C0165e() {
        this(10);
    }

    public C0165e(int i) {
        this.f434b = false;
        if (i == 0) {
            this.f435c = C0162b.f429b;
            this.f436d = C0162b.f430c;
        } else {
            int m13373b = C0162b.m13373b(i);
            this.f435c = new long[m13373b];
            this.f436d = new Object[m13373b];
        }
        this.f437e = 0;
    }

    /* renamed from: a */
    public C0165e<E> clone() {
        try {
            C0165e<E> c0165e = (C0165e) super.clone();
            try {
                c0165e.f435c = (long[]) this.f435c.clone();
                c0165e.f436d = (Object[]) this.f436d.clone();
                return c0165e;
            } catch (CloneNotSupportedException e) {
                return c0165e;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E m13367a(long j) {
        return m13366a(j, null);
    }

    /* renamed from: a */
    public E m13366a(long j, E e) {
        int m13374a = C0162b.m13374a(this.f435c, this.f437e, j);
        return (m13374a < 0 || this.f436d[m13374a] == f433a) ? e : (E) this.f436d[m13374a];
    }

    /* renamed from: b */
    public void m13363b(long j) {
        int m13374a = C0162b.m13374a(this.f435c, this.f437e, j);
        if (m13374a >= 0 && this.f436d[m13374a] != f433a) {
            this.f436d[m13374a] = f433a;
            this.f434b = true;
        }
    }

    /* renamed from: c */
    private void m13361c() {
        int i = this.f437e;
        long[] jArr = this.f435c;
        Object[] objArr = this.f436d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f433a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f434b = false;
        this.f437e = i2;
    }

    /* renamed from: b */
    public void m13362b(long j, E e) {
        int m13374a = C0162b.m13374a(this.f435c, this.f437e, j);
        if (m13374a >= 0) {
            this.f436d[m13374a] = e;
            return;
        }
        int i = m13374a ^ (-1);
        if (i < this.f437e && this.f436d[i] == f433a) {
            this.f435c[i] = j;
            this.f436d[i] = e;
            return;
        }
        if (this.f434b && this.f437e >= this.f435c.length) {
            m13361c();
            i = C0162b.m13374a(this.f435c, this.f437e, j) ^ (-1);
        }
        if (this.f437e >= this.f435c.length) {
            int m13373b = C0162b.m13373b(this.f437e + 1);
            long[] jArr = new long[m13373b];
            Object[] objArr = new Object[m13373b];
            System.arraycopy(this.f435c, 0, jArr, 0, this.f435c.length);
            System.arraycopy(this.f436d, 0, objArr, 0, this.f436d.length);
            this.f435c = jArr;
            this.f436d = objArr;
        }
        if (this.f437e - i != 0) {
            System.arraycopy(this.f435c, i, this.f435c, i + 1, this.f437e - i);
            System.arraycopy(this.f436d, i, this.f436d, i + 1, this.f437e - i);
        }
        this.f435c[i] = j;
        this.f436d[i] = e;
        this.f437e++;
    }

    /* renamed from: b */
    public int m13365b() {
        if (this.f434b) {
            m13361c();
        }
        return this.f437e;
    }

    /* renamed from: a */
    public long m13368a(int i) {
        if (this.f434b) {
            m13361c();
        }
        return this.f435c[i];
    }

    /* renamed from: b */
    public E m13364b(int i) {
        if (this.f434b) {
            m13361c();
        }
        return (E) this.f436d[i];
    }

    public String toString() {
        if (m13365b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f437e * 28);
        sb.append('{');
        for (int i = 0; i < this.f437e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m13368a(i));
            sb.append('=');
            E m13364b = m13364b(i);
            if (m13364b != this) {
                sb.append(m13364b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
