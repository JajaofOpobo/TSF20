package android.support.v4.d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public e() {
        this(10);
    }

    public e(int i) {
        this.b = false;
        if (i == 0) {
            this.c = b.b;
            this.d = b.c;
        } else {
            int iB = b.b(i);
            this.c = new long[iB];
            this.d = new Object[iB];
        }
        this.e = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            try {
                eVar.c = (long[]) this.c.clone();
                eVar.d = (Object[]) this.d.clone();
                return eVar;
            } catch (CloneNotSupportedException e) {
                return eVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E a(long j) {
        return a(j, null);
    }

    public E a(long j, E e) {
        int iA = b.a(this.c, this.e, j);
        return (iA < 0 || this.d[iA] == a) ? e : (E) this.d[iA];
    }

    public void b(long j) {
        int iA = b.a(this.c, this.e, j);
        if (iA >= 0 && this.d[iA] != a) {
            this.d[iA] = a;
            this.b = true;
        }
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void b(long j, E e) {
        int iA = b.a(this.c, this.e, j);
        if (iA >= 0) {
            this.d[iA] = e;
            return;
        }
        int iA2 = iA ^ (-1);
        if (iA2 < this.e && this.d[iA2] == a) {
            this.c[iA2] = j;
            this.d[iA2] = e;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            c();
            iA2 = b.a(this.c, this.e, j) ^ (-1);
        }
        if (this.e >= this.c.length) {
            int iB = b.b(this.e + 1);
            long[] jArr = new long[iB];
            Object[] objArr = new Object[iB];
            System.arraycopy(this.c, 0, jArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = jArr;
            this.d = objArr;
        }
        if (this.e - iA2 != 0) {
            System.arraycopy(this.c, iA2, this.c, iA2 + 1, this.e - iA2);
            System.arraycopy(this.d, iA2, this.d, iA2 + 1, this.e - iA2);
        }
        this.c[iA2] = j;
        this.d[iA2] = e;
        this.e++;
    }

    public int b() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public long a(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public E b(int i) {
        if (this.b) {
            c();
        }
        return (E) this.d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E eB = b(i);
            if (eB != this) {
                sb.append(eB);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
