package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.flurry.sdk.ds */
/* loaded from: classes.dex */
public class C1216ds<K, V> {

    /* renamed from: a */
    private final Map<K, List<V>> f3914a = new HashMap();

    /* renamed from: b */
    private int f3915b;

    /* renamed from: a */
    public void m9372a() {
        this.f3914a.clear();
    }

    /* renamed from: a */
    public List<V> m9370a(K k) {
        if (k == null) {
            return Collections.emptyList();
        }
        List<V> m9368a = m9368a((C1216ds<K, V>) k, false);
        if (m9368a == null) {
            return Collections.emptyList();
        }
        return m9368a;
    }

    /* renamed from: a */
    public void m9369a(K k, V v) {
        if (k != null) {
            m9368a((C1216ds<K, V>) k, true).add(v);
        }
    }

    /* renamed from: a */
    public void m9371a(C1216ds<K, V> c1216ds) {
        if (c1216ds != null) {
            for (Map.Entry<K, List<V>> entry : c1216ds.f3914a.entrySet()) {
                this.f3914a.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public boolean m9365b(K k, V v) {
        List<V> m9368a;
        boolean z = false;
        if (k != null && (m9368a = m9368a((C1216ds<K, V>) k, false)) != null) {
            z = m9368a.remove(v);
            if (m9368a.size() == 0) {
                this.f3914a.remove(k);
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m9366b(K k) {
        if (k == null) {
            return false;
        }
        return this.f3914a.remove(k) != null;
    }

    /* renamed from: b */
    public Collection<Map.Entry<K, V>> m9367b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, List<V>> entry : this.f3914a.entrySet()) {
            for (V v : entry.getValue()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), v));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public Set<K> m9364c() {
        return this.f3914a.keySet();
    }

    /* renamed from: a */
    private List<V> m9368a(K k, boolean z) {
        List<V> list = this.f3914a.get(k);
        if (z && list == null) {
            if (this.f3915b > 0) {
                list = new ArrayList<>(this.f3915b);
            } else {
                list = new ArrayList<>();
            }
            this.f3914a.put(k, list);
        }
        return list;
    }
}
