package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
final class k implements Collection {
    final /* synthetic */ f a;

    k(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.a.c();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.a.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new g(this.a, 1);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        int b = this.a.b(obj);
        if (b < 0) {
            return false;
        }
        this.a.a(b);
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = 0;
        int a = this.a.a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = 0;
        int a = this.a.a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public int size() {
        return this.a.a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.a.b(1);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
