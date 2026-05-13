package android.support.p002v4.p009d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: android.support.v4.d.a */
/* loaded from: classes.dex */
public class C0160a<K, V> extends C0173h<K, V> implements Map<K, V> {

    /* renamed from: a */
    AbstractC0167g<K, V> f426a;

    public C0160a() {
    }

    public C0160a(int i) {
        super(i);
    }

    /* renamed from: b */
    private AbstractC0167g<K, V> m13378b() {
        if (this.f426a == null) {
            this.f426a = new AbstractC0167g<K, V>() { // from class: android.support.v4.d.a.1
                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected int mo13354a() {
                    return C0160a.this.f467h;
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected Object mo13352a(int i, int i2) {
                    return C0160a.this.f466g[(i << 1) + i2];
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected int mo13350a(Object obj) {
                    return C0160a.this.m13331a(obj);
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: b */
                protected int mo13343b(Object obj) {
                    return C0160a.this.m13327b(obj);
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: b */
                protected Map<K, V> mo13345b() {
                    return C0160a.this;
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected void mo13349a(K k, V v) {
                    C0160a.this.put(k, v);
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected V mo13351a(int i, V v) {
                    return C0160a.this.m13332a(i, (int) v);
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: a */
                protected void mo13353a(int i) {
                    C0160a.this.m13325d(i);
                }

                @Override // android.support.p002v4.p009d.AbstractC0167g
                /* renamed from: c */
                protected void mo13341c() {
                    C0160a.this.clear();
                }
            };
        }
        return this.f426a;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m13333a(this.f467h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public boolean m13379a(Collection<?> collection) {
        return AbstractC0167g.m13340c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m13378b().m13339d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m13378b().m13338e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m13378b().m13337f();
    }
}
