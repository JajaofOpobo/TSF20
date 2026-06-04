package com.flurry.a.a.a.b;

import com.flurry.a.a.a.ad;
import java.util.AbstractList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends AbstractList implements a, Comparable {
    private static final Object[] a = new Object[0];
    private final com.flurry.a.a.a.c b;
    private int c;
    private Object[] d;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c.a().a(this, (a) obj, this.b);
    }

    public e(int i, com.flurry.a.a.a.c cVar) {
        this.d = a;
        if (cVar == null || !ad.ARRAY.equals(cVar.a())) {
            throw new com.flurry.a.a.a.a("Not an array schema: " + cVar);
        }
        this.b = cVar;
        if (i != 0) {
            this.d = new Object[i];
        }
    }

    @Override // com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c = 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= this.c) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (this.c == this.d.length) {
            Object[] objArr = new Object[((this.c * 3) / 2) + 1];
            System.arraycopy(this.d, 0, objArr, 0, this.c);
            this.d = objArr;
        }
        Object[] objArr2 = this.d;
        int i = this.c;
        this.c = i + 1;
        objArr2[i] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        if (i > this.c || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        if (this.c == this.d.length) {
            Object[] objArr = new Object[((this.c * 3) / 2) + 1];
            System.arraycopy(this.d, 0, objArr, 0, this.c);
            this.d = objArr;
        }
        System.arraycopy(this.d, i, this.d, i + 1, this.c - i);
        this.d[i] = obj;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        if (i >= this.c) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        Object obj2 = this.d[i];
        this.d[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        if (i >= this.c) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        Object obj = this.d[i];
        this.c--;
        System.arraycopy(this.d, i + 1, this.d, i, this.c - i);
        this.d[this.c] = null;
        return obj;
    }

    @Override // com.flurry.a.a.a.b.a
    public final Object b() {
        if (this.c < this.d.length) {
            return this.d[this.c];
        }
        return null;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i = 0;
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            stringBuffer.append(next == null ? "null" : next.toString());
            i++;
            if (i < size()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
