package com.flurry.a.b.a.d.e;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class g implements Iterable {
    protected LinkedHashMap a;

    public final void a(f fVar) {
        if (this.a == null) {
            this.a = new LinkedHashMap();
        }
        this.a.put(new r(fVar.e()), fVar);
    }

    public final f a(Method method) {
        if (this.a != null) {
            return (f) this.a.remove(new r(method));
        }
        return null;
    }

    public final boolean a() {
        return this.a == null || this.a.size() == 0;
    }

    public final f a(String str, Class[] clsArr) {
        if (this.a == null) {
            return null;
        }
        return (f) this.a.get(new r(str, clsArr));
    }

    public final f b(Method method) {
        if (this.a == null) {
            return null;
        }
        return (f) this.a.get(new r(method));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.a != null) {
            return this.a.values().iterator();
        }
        return Collections.emptyList().iterator();
    }
}
