package com.flurry.a.a.a.e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Map {
    private final ReferenceQueue a = new ReferenceQueue();
    private Map b = new HashMap();

    @Override // java.util.Map
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.b.containsKey(new d(this, obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a();
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.b.entrySet()) {
            hashSet.add(new c(this, ((d) entry.getKey()).get(), entry.getValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.Map
    public final Set keySet() {
        a();
        HashSet hashSet = new HashSet();
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(((d) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.b.equals(((b) obj).b);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        a();
        return this.b.get(new d(this, obj));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        return this.b.put(new d(this, obj), obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        a();
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        a();
        return this.b.remove(new d(this, obj));
    }

    @Override // java.util.Map
    public final int size() {
        a();
        return this.b.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        a();
        return this.b.values();
    }

    private synchronized void a() {
        Reference poll = this.a.poll();
        while (poll != null) {
            this.b.remove((d) poll);
            poll = this.a.poll();
        }
    }
}
