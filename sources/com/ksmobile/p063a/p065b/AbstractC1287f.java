package com.ksmobile.p063a.p065b;

import com.ksmobile.launcher.cmbase.utils.C1302c;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ksmobile.a.b.f */
/* loaded from: classes.dex */
public abstract class AbstractC1287f<K, V> {

    /* renamed from: b */
    AbstractC1287f<K, V>.C1289b f4073b;

    /* renamed from: c */
    AbstractC1287f<K, V>.C1290c f4074c;

    /* renamed from: d */
    AbstractC1287f<K, V>.C1292e f4075d;

    /* renamed from: a */
    protected abstract int mo9113a();

    /* renamed from: a */
    protected abstract int mo9109a(Object obj);

    /* renamed from: a */
    protected abstract Object mo9111a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo9110a(int i, V v);

    /* renamed from: a */
    protected abstract void mo9112a(int i);

    /* renamed from: a */
    protected abstract void mo9108a(K k, V v);

    /* renamed from: b */
    protected abstract int mo9102b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo9104b();

    /* renamed from: c */
    protected abstract void mo9100c();

    /* renamed from: com.ksmobile.a.b.f$a */
    /* loaded from: classes.dex */
    final class C1288a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f4076a;

        /* renamed from: b */
        int f4077b;

        /* renamed from: c */
        int f4078c;

        /* renamed from: d */
        boolean f4079d = false;

        C1288a(int i) {
            this.f4076a = i;
            this.f4077b = AbstractC1287f.this.mo9113a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4078c < this.f4077b;
        }

        @Override // java.util.Iterator
        public T next() {
            T t = (T) AbstractC1287f.this.mo9111a(this.f4078c, this.f4076a);
            this.f4078c++;
            this.f4079d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4079d) {
                throw new IllegalStateException();
            }
            this.f4078c--;
            this.f4077b--;
            this.f4079d = false;
            AbstractC1287f.this.mo9112a(this.f4078c);
        }
    }

    /* renamed from: com.ksmobile.a.b.f$d */
    /* loaded from: classes.dex */
    final class C1291d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f4083a;

        /* renamed from: c */
        boolean f4085c = false;

        /* renamed from: b */
        int f4084b = -1;

        C1291d() {
            this.f4083a = AbstractC1287f.this.mo9113a() - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4084b < this.f4083a;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f4084b++;
            this.f4085c = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4085c) {
                throw new IllegalStateException();
            }
            this.f4084b--;
            this.f4083a--;
            this.f4085c = false;
            AbstractC1287f.this.mo9112a(this.f4084b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (!this.f4085c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractC1287f.this.mo9111a(this.f4084b, 0);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (!this.f4085c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC1287f.this.mo9111a(this.f4084b, 1);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (!this.f4085c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC1287f.this.mo9110a(this.f4084b, (int) v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f4085c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C1302c.m9048a(entry.getKey(), AbstractC1287f.this.mo9111a(this.f4084b, 0)) || !C1302c.m9048a(entry.getValue(), AbstractC1287f.this.mo9111a(this.f4084b, 1))) {
                    z = false;
                }
                return z;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f4085c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo9111a = AbstractC1287f.this.mo9111a(this.f4084b, 0);
            Object mo9111a2 = AbstractC1287f.this.mo9111a(this.f4084b, 1);
            return (mo9111a2 != null ? mo9111a2.hashCode() : 0) ^ (mo9111a == null ? 0 : mo9111a.hashCode());
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: com.ksmobile.a.b.f$b */
    /* loaded from: classes.dex */
    final class C1289b implements Set<Map.Entry<K, V>> {
        C1289b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo9113a = AbstractC1287f.this.mo9113a();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC1287f.this.mo9108a((AbstractC1287f) entry.getKey(), (K) entry.getValue());
            }
            return mo9113a != AbstractC1287f.this.mo9113a();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC1287f.this.mo9100c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo9109a = AbstractC1287f.this.mo9109a(entry.getKey());
                if (mo9109a >= 0) {
                    return C1302c.m9048a(AbstractC1287f.this.mo9111a(mo9109a, 1), entry.getValue());
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
            return AbstractC1287f.this.mo9113a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1291d();
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
            return AbstractC1287f.this.mo9113a();
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
            return AbstractC1287f.m9106a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int mo9113a = AbstractC1287f.this.mo9113a() - 1;
            int i = 0;
            while (mo9113a >= 0) {
                Object mo9111a = AbstractC1287f.this.mo9111a(mo9113a, 0);
                Object mo9111a2 = AbstractC1287f.this.mo9111a(mo9113a, 1);
                mo9113a--;
                i += (mo9111a2 == null ? 0 : mo9111a2.hashCode()) ^ (mo9111a == null ? 0 : mo9111a.hashCode());
            }
            return i;
        }
    }

    /* renamed from: com.ksmobile.a.b.f$c */
    /* loaded from: classes.dex */
    final class C1290c implements Set<K> {
        C1290c() {
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
            AbstractC1287f.this.mo9100c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1287f.this.mo9109a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC1287f.m9107a((Map) AbstractC1287f.this.mo9104b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC1287f.this.mo9113a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C1288a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo9109a = AbstractC1287f.this.mo9109a(obj);
            if (mo9109a >= 0) {
                AbstractC1287f.this.mo9112a(mo9109a);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC1287f.m9101b(AbstractC1287f.this.mo9104b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC1287f.m9099c(AbstractC1287f.this.mo9104b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC1287f.this.mo9113a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC1287f.this.m9103b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC1287f.this.m9105a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC1287f.m9106a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo9113a = AbstractC1287f.this.mo9113a() - 1; mo9113a >= 0; mo9113a--) {
                Object mo9111a = AbstractC1287f.this.mo9111a(mo9113a, 0);
                i += mo9111a == null ? 0 : mo9111a.hashCode();
            }
            return i;
        }
    }

    /* renamed from: com.ksmobile.a.b.f$e */
    /* loaded from: classes.dex */
    final class C1292e implements Collection<V> {
        C1292e() {
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
            AbstractC1287f.this.mo9100c();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1287f.this.mo9102b(obj) >= 0;
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
            return AbstractC1287f.this.mo9113a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C1288a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo9102b = AbstractC1287f.this.mo9102b(obj);
            if (mo9102b >= 0) {
                AbstractC1287f.this.mo9112a(mo9102b);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int mo9113a = AbstractC1287f.this.mo9113a();
            boolean z = false;
            while (i < mo9113a) {
                if (collection.contains(AbstractC1287f.this.mo9111a(i, 1))) {
                    AbstractC1287f.this.mo9112a(i);
                    i--;
                    mo9113a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int mo9113a = AbstractC1287f.this.mo9113a();
            boolean z = false;
            while (i < mo9113a) {
                if (!collection.contains(AbstractC1287f.this.mo9111a(i, 1))) {
                    AbstractC1287f.this.mo9112a(i);
                    i--;
                    mo9113a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC1287f.this.mo9113a();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC1287f.this.m9103b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC1287f.this.m9105a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m9107a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m9101b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m9099c(Map<K, V> map, Collection<?> collection) {
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
    public Object[] m9103b(int i) {
        int mo9113a = mo9113a();
        Object[] objArr = new Object[mo9113a];
        for (int i2 = 0; i2 < mo9113a; i2++) {
            objArr[i2] = mo9111a(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T[] m9105a(T[] tArr, int i) {
        int mo9113a = mo9113a();
        T[] tArr2 = tArr.length < mo9113a ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo9113a)) : tArr;
        for (int i2 = 0; i2 < mo9113a; i2++) {
            tArr2[i2] = mo9111a(i2, i);
        }
        if (tArr2.length > mo9113a) {
            tArr2[mo9113a] = null;
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
    public static <T> boolean m9106a(java.util.Set<T> r4, java.lang.Object r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ksmobile.p063a.p065b.AbstractC1287f.m9106a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: d */
    public Set<Map.Entry<K, V>> m9098d() {
        if (this.f4073b == null) {
            this.f4073b = new C1289b();
        }
        return this.f4073b;
    }

    /* renamed from: e */
    public Set<K> m9097e() {
        if (this.f4074c == null) {
            this.f4074c = new C1290c();
        }
        return this.f4074c;
    }

    /* renamed from: f */
    public Collection<V> m9096f() {
        if (this.f4075d == null) {
            this.f4075d = new C1292e();
        }
        return this.f4075d;
    }
}
