package android.support.p002v4.p009d;
/* renamed from: android.support.v4.d.i */
/* loaded from: classes.dex */
public class C0174i<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f468a = new Object();

    /* renamed from: b */
    private boolean f469b;

    /* renamed from: c */
    private int[] f470c;

    /* renamed from: d */
    private Object[] f471d;

    /* renamed from: e */
    private int f472e;

    public C0174i() {
        this(10);
    }

    public C0174i(int i) {
        this.f469b = false;
        if (i == 0) {
            this.f470c = C0162b.f428a;
            this.f471d = C0162b.f430c;
        } else {
            int m13377a = C0162b.m13377a(i);
            this.f470c = new int[m13377a];
            this.f471d = new Object[m13377a];
        }
        this.f472e = 0;
    }

    /* renamed from: a */
    public C0174i<E> clone() {
        try {
            C0174i<E> c0174i = (C0174i) super.clone();
            try {
                c0174i.f470c = (int[]) this.f470c.clone();
                c0174i.f471d = (Object[]) this.f471d.clone();
                return c0174i;
            } catch (CloneNotSupportedException e) {
                return c0174i;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E m13322a(int i) {
        return m13321a(i, null);
    }

    /* renamed from: a */
    public E m13321a(int i, E e) {
        int m13375a = C0162b.m13375a(this.f470c, this.f472e, i);
        return (m13375a < 0 || this.f471d[m13375a] == f468a) ? e : (E) this.f471d[m13375a];
    }

    /* renamed from: b */
    public void m13319b(int i) {
        int m13375a = C0162b.m13375a(this.f470c, this.f472e, i);
        if (m13375a >= 0 && this.f471d[m13375a] != f468a) {
            this.f471d[m13375a] = f468a;
            this.f469b = true;
        }
    }

    /* renamed from: c */
    public void m13316c(int i) {
        m13319b(i);
    }

    /* renamed from: d */
    private void m13315d() {
        int i = this.f472e;
        int[] iArr = this.f470c;
        Object[] objArr = this.f471d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f468a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f469b = false;
        this.f472e = i2;
    }

    /* renamed from: b */
    public void m13318b(int i, E e) {
        int m13375a = C0162b.m13375a(this.f470c, this.f472e, i);
        if (m13375a >= 0) {
            this.f471d[m13375a] = e;
            return;
        }
        int i2 = m13375a ^ (-1);
        if (i2 < this.f472e && this.f471d[i2] == f468a) {
            this.f470c[i2] = i;
            this.f471d[i2] = e;
            return;
        }
        if (this.f469b && this.f472e >= this.f470c.length) {
            m13315d();
            i2 = C0162b.m13375a(this.f470c, this.f472e, i) ^ (-1);
        }
        if (this.f472e >= this.f470c.length) {
            int m13377a = C0162b.m13377a(this.f472e + 1);
            int[] iArr = new int[m13377a];
            Object[] objArr = new Object[m13377a];
            System.arraycopy(this.f470c, 0, iArr, 0, this.f470c.length);
            System.arraycopy(this.f471d, 0, objArr, 0, this.f471d.length);
            this.f470c = iArr;
            this.f471d = objArr;
        }
        if (this.f472e - i2 != 0) {
            System.arraycopy(this.f470c, i2, this.f470c, i2 + 1, this.f472e - i2);
            System.arraycopy(this.f471d, i2, this.f471d, i2 + 1, this.f472e - i2);
        }
        this.f470c[i2] = i;
        this.f471d[i2] = e;
        this.f472e++;
    }

    /* renamed from: b */
    public int m13320b() {
        if (this.f469b) {
            m13315d();
        }
        return this.f472e;
    }

    /* renamed from: d */
    public int m13314d(int i) {
        if (this.f469b) {
            m13315d();
        }
        return this.f470c[i];
    }

    /* renamed from: e */
    public E m13313e(int i) {
        if (this.f469b) {
            m13315d();
        }
        return (E) this.f471d[i];
    }

    /* renamed from: f */
    public int m13312f(int i) {
        if (this.f469b) {
            m13315d();
        }
        return C0162b.m13375a(this.f470c, this.f472e, i);
    }

    /* renamed from: c */
    public void m13317c() {
        int i = this.f472e;
        Object[] objArr = this.f471d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f472e = 0;
        this.f469b = false;
    }

    public String toString() {
        if (m13320b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f472e * 28);
        sb.append('{');
        for (int i = 0; i < this.f472e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m13314d(i));
            sb.append('=');
            E m13313e = m13313e(i);
            if (m13313e != this) {
                sb.append(m13313e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
