package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class h implements Set {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        int a = this.a.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a != this.a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int a = this.a.a(entry.getKey());
        if (a >= 0) {
            return b.a(this.a.a(a, 1), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new j(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return f.a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        int a = this.a.a() - 1;
        int i = 0;
        while (a >= 0) {
            Object a2 = this.a.a(a, 0);
            Object a3 = this.a.a(a, 1);
            a--;
            i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
        }
        return i;
    }
}
