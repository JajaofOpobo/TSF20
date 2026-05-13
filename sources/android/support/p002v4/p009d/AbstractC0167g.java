package android.support.p002v4.p009d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.d.g */
/* loaded from: classes.dex */
public abstract class AbstractC0167g<K, V> {

    /* renamed from: b */
    AbstractC0167g<K, V>.C0169b f446b;

    /* renamed from: c */
    AbstractC0167g<K, V>.C0170c f447c;

    /* renamed from: d */
    AbstractC0167g<K, V>.C0172e f448d;

    /* renamed from: a */
    protected abstract int mo13354a();

    /* renamed from: a */
    protected abstract int mo13350a(Object obj);

    /* renamed from: a */
    protected abstract Object mo13352a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo13351a(int i, V v);

    /* renamed from: a */
    protected abstract void mo13353a(int i);

    /* renamed from: a */
    protected abstract void mo13349a(K k, V v);

    /* renamed from: b */
    protected abstract int mo13343b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo13345b();

    /* renamed from: c */
    protected abstract void mo13341c();

    /* renamed from: android.support.v4.d.g$a */
    /* loaded from: classes.dex */
    final class C0168a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f449a;

        /* renamed from: b */
        int f450b;

        /* renamed from: c */
        int f451c;

        /* renamed from: d */
        boolean f452d = false;

        C0168a(int i) {
            this.f449a = i;
            this.f450b = AbstractC0167g.this.mo13354a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f451c < this.f450b;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = (T) AbstractC0167g.this.mo13352a(this.f451c, this.f449a);
            this.f451c++;
            this.f452d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f452d) {
                throw new IllegalStateException();
            }
            this.f451c--;
            this.f450b--;
            this.f452d = false;
            AbstractC0167g.this.mo13353a(this.f451c);
        }
    }

    /* renamed from: android.support.v4.d.g$d */
    /* loaded from: classes.dex */
    final class C0171d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f456a;

        /* renamed from: c */
        boolean f458c = false;

        /* renamed from: b */
        int f457b = -1;

        C0171d() {
            this.f456a = AbstractC0167g.this.mo13354a() - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f457b < this.f456a;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f457b++;
            this.f458c = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f458c) {
                throw new IllegalStateException();
            }
            AbstractC0167g.this.mo13353a(this.f457b);
            this.f457b--;
            this.f456a--;
            this.f458c = false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.f458c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractC0167g.this.mo13352a(this.f457b, 0);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.f458c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC0167g.this.mo13352a(this.f457b, 1);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.f458c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC0167g.this.mo13351a(this.f457b, (int) v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f458c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0162b.m13376a(entry.getKey(), AbstractC0167g.this.mo13352a(this.f457b, 0)) || !C0162b.m13376a(entry.getValue(), AbstractC0167g.this.mo13352a(this.f457b, 1))) {
                    z = false;
                }
                return z;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f458c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo13352a = AbstractC0167g.this.mo13352a(this.f457b, 0);
            Object mo13352a2 = AbstractC0167g.this.mo13352a(this.f457b, 1);
            return (mo13352a2 != null ? mo13352a2.hashCode() : 0) ^ (mo13352a == null ? 0 : mo13352a.hashCode());
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.d.g$b */
    /* loaded from: classes.dex */
    final class C0169b implements Set<Map.Entry<K, V>> {
        C0169b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo13354a = AbstractC0167g.this.mo13354a();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0167g.this.mo13349a((AbstractC0167g) entry.getKey(), (K) entry.getValue());
            }
            return mo13354a != AbstractC0167g.this.mo13354a();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0167g.this.mo13341c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo13350a = AbstractC0167g.this.mo13350a(entry.getKey());
                if (mo13350a >= 0) {
                    return C0162b.m13376a(AbstractC0167g.this.mo13352a(mo13350a, 1), entry.getValue());
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0167g.this.mo13354a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0171d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0167g.this.mo13354a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0167g.m13347a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int mo13354a = AbstractC0167g.this.mo13354a() - 1;
            int i = 0;
            while (mo13354a >= 0) {
                Object mo13352a = AbstractC0167g.this.mo13352a(mo13354a, 0);
                Object mo13352a2 = AbstractC0167g.this.mo13352a(mo13354a, 1);
                mo13354a--;
                i += (mo13352a2 == null ? 0 : mo13352a2.hashCode()) ^ (mo13352a == null ? 0 : mo13352a.hashCode());
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.d.g$c */
    /* loaded from: classes.dex */
    final class C0170c implements Set<K> {
        C0170c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0167g.this.mo13341c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0167g.this.mo13350a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0167g.m13348a((Map) AbstractC0167g.this.mo13345b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0167g.this.mo13354a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0168a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo13350a = AbstractC0167g.this.mo13350a(obj);
            if (mo13350a >= 0) {
                AbstractC0167g.this.mo13353a(mo13350a);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0167g.m13342b(AbstractC0167g.this.mo13345b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0167g.m13340c(AbstractC0167g.this.mo13345b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0167g.this.mo13354a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0167g.this.m13344b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0167g.this.m13346a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0167g.m13347a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo13354a = AbstractC0167g.this.mo13354a() - 1; mo13354a >= 0; mo13354a--) {
                Object mo13352a = AbstractC0167g.this.mo13352a(mo13354a, 0);
                i += mo13352a == null ? 0 : mo13352a.hashCode();
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.d.g$e */
    /* loaded from: classes.dex */
    final class C0172e implements Collection<V> {
        C0172e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0167g.this.mo13341c();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0167g.this.mo13343b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0167g.this.mo13354a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0168a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo13343b = AbstractC0167g.this.mo13343b(obj);
            if (mo13343b >= 0) {
                AbstractC0167g.this.mo13353a(mo13343b);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int mo13354a = AbstractC0167g.this.mo13354a();
            boolean z = false;
            while (i < mo13354a) {
                if (collection.contains(AbstractC0167g.this.mo13352a(i, 1))) {
                    AbstractC0167g.this.mo13353a(i);
                    i--;
                    mo13354a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int mo13354a = AbstractC0167g.this.mo13354a();
            boolean z = false;
            while (i < mo13354a) {
                if (!collection.contains(AbstractC0167g.this.mo13352a(i, 1))) {
                    AbstractC0167g.this.mo13353a(i);
                    i--;
                    mo13354a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0167g.this.mo13354a();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0167g.this.m13344b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0167g.this.m13346a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m13348a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m13342b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m13340c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public Object[] m13344b(int i) {
        int mo13354a = mo13354a();
        Object[] objArr = new Object[mo13354a];
        for (int i2 = 0; i2 < mo13354a; i2++) {
            objArr[i2] = mo13352a(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T[] m13346a(T[] tArr, int i) {
        int mo13354a = mo13354a();
        T[] tArr2 = tArr.length < mo13354a ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo13354a)) : tArr;
        for (int i2 = 0; i2 < mo13354a; i2++) {
            tArr2[i2] = mo13352a(i2, i);
        }
        if (tArr2.length > mo13354a) {
            tArr2[mo13354a] = null;
        }
        return tArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4.containsAll(r5) != false) goto L14;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean m13347a(java.util.Set<T> r4, java.lang.Object r5) {
        /*
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L6
            r1 = r0
        L5:
            return r1
        L6:
            boolean r2 = r5 instanceof java.util.Set
            if (r2 == 0) goto L5
            java.util.Set r5 = (java.util.Set) r5
            int r2 = r4.size()     // Catch: java.lang.ClassCastException -> L20 java.lang.NullPointerException -> L22
            int r3 = r5.size()     // Catch: java.lang.ClassCastException -> L20 java.lang.NullPointerException -> L22
            if (r2 != r3) goto L1e
            boolean r2 = r4.containsAll(r5)     // Catch: java.lang.ClassCastException -> L20 java.lang.NullPointerException -> L22
            if (r2 == 0) goto L1e
        L1c:
            r1 = r0
            goto L5
        L1e:
            r0 = r1
            goto L1c
        L20:
            r0 = move-exception
            goto L5
        L22:
            r0 = move-exception
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.p009d.AbstractC0167g.m13347a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: d */
    public Set<Map.Entry<K, V>> m13339d() {
        if (this.f446b == null) {
            this.f446b = new C0169b();
        }
        return this.f446b;
    }

    /* renamed from: e */
    public Set<K> m13338e() {
        if (this.f447c == null) {
            this.f447c = new C0170c();
        }
        return this.f447c;
    }

    /* renamed from: f */
    public Collection<V> m13337f() {
        if (this.f448d == null) {
            this.f448d = new C0172e();
        }
        return this.f448d;
    }
}
