package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.d.ah;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends p {
    protected final ah a;
    protected final HashMap b;
    protected final HashMap e;

    private q(ah ahVar, com.flurry.a.b.a.g.a aVar, HashMap hashMap, HashMap hashMap2) {
        super(aVar, ahVar.n());
        this.a = ahVar;
        this.b = hashMap;
        this.e = hashMap2;
    }

    public static q a(ah ahVar, com.flurry.a.b.a.g.a aVar, Collection collection, boolean z, boolean z2) {
        com.flurry.a.b.a.g.a aVar2;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        HashMap hashMap = z ? new HashMap() : null;
        HashMap hashMap2 = z2 ? new HashMap() : null;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                com.flurry.a.b.a.d.f.a aVar3 = (com.flurry.a.b.a.d.f.a) it.next();
                Class a = aVar3.a();
                String b = aVar3.c() ? aVar3.b() : a(a);
                if (z) {
                    hashMap.put(a.getName(), b);
                }
                if (z2 && ((aVar2 = (com.flurry.a.b.a.g.a) hashMap2.get(b)) == null || !a.isAssignableFrom(aVar2.p()))) {
                    hashMap2.put(b, ahVar.e(a));
                }
            }
        }
        return new q(ahVar, aVar, hashMap, hashMap2);
    }

    @Override // com.flurry.a.b.a.d.f.c
    public final String a(Object obj) {
        String str;
        Class<?> cls = obj.getClass();
        String name = cls.getName();
        synchronized (this.b) {
            str = (String) this.b.get(name);
            if (str == null) {
                if (this.a.b()) {
                    str = this.a.a().g(((com.flurry.a.b.a.d.e.k) this.a.f(cls)).c());
                }
                if (str == null) {
                    str = a((Class) cls);
                }
                this.b.put(name, str);
            }
        }
        return str;
    }

    @Override // com.flurry.a.b.a.d.f.c
    public final String a(Object obj, Class cls) {
        return a(obj);
    }

    @Override // com.flurry.a.b.a.d.f.c
    public final com.flurry.a.b.a.g.a a(String str) {
        return (com.flurry.a.b.a.g.a) this.e.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[').append(getClass().getName());
        sb.append("; id-to-type=").append(this.e);
        sb.append(']');
        return sb.toString();
    }

    private static String a(Class cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }
}
