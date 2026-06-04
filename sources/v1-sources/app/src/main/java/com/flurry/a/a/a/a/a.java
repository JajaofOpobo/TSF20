package com.flurry.a.a.a.a;

import com.flurry.a.a.a.ad;
import com.flurry.a.a.a.c;
import com.flurry.a.a.a.c.f;
import com.flurry.a.a.a.c.k;
import com.flurry.a.a.a.c.q;
import com.flurry.a.a.a.c.u;
import com.flurry.a.a.a.m;
import com.flurry.a.b.a.h;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public abstract class a {
    private static final ConcurrentMap a = new ConcurrentHashMap();
    private static final m[] b = new m[0];
    private final c c;
    private final m[] d;
    private final boolean[] e;
    private final com.flurry.a.a.a.b.c f;
    private k g = null;
    private f h = null;

    protected final m[] d() {
        return this.d;
    }

    protected final boolean[] e() {
        return this.e;
    }

    protected a(c cVar, com.flurry.a.a.a.b.c cVar2) {
        this.c = cVar;
        this.f = cVar2;
        this.d = (m[]) cVar.b().toArray(b);
        this.e = new boolean[this.d.length];
    }

    protected static void a(m mVar, Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            c c = mVar.c();
            ad a2 = c.a();
            if (a2 == ad.NULL) {
                z = true;
            } else {
                if (a2 == ad.UNION) {
                    Iterator it = c.k().iterator();
                    while (it.hasNext()) {
                        if (((c) it.next()).a() == ad.NULL) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
        }
        if (z || mVar.e() != null) {
        } else {
            throw new com.flurry.a.a.a.a("Field " + mVar + " does not accept null values");
        }
    }

    protected final Object a(m mVar) {
        h e = mVar.e();
        if (e == null) {
            throw new com.flurry.a.a.a.a("Field " + mVar + " not set and has no default value");
        }
        if (e.g() && (mVar.c().a() == ad.NULL || (mVar.c().a() == ad.UNION && ((c) mVar.c().k().get(0)).a() == ad.NULL))) {
            return null;
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) a.get(this.c.g());
        if (concurrentMap == null) {
            a.putIfAbsent(this.c.g(), new ConcurrentHashMap(this.d.length));
            concurrentMap = (ConcurrentMap) a.get(this.c.g());
        }
        Object obj = concurrentMap.get(Integer.valueOf(mVar.b()));
        if (obj == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.g = u.a().a(byteArrayOutputStream, this.g);
            com.flurry.a.a.a.c.a.c.a(this.g, mVar.c(), e);
            this.g.flush();
            q.a();
            this.h = q.a(byteArrayOutputStream.toByteArray(), this.h);
            obj = this.f.a(mVar.c()).a(this.h);
            concurrentMap.putIfAbsent(Integer.valueOf(mVar.b()), obj);
        }
        return this.f.b(mVar.c(), obj);
    }

    public int hashCode() {
        return (this.c == null ? 0 : this.c.hashCode()) + ((Arrays.hashCode(this.e) + 31) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (Arrays.equals(this.e, aVar.e)) {
                return this.c == null ? aVar.c == null : this.c.equals(aVar.c);
            }
            return false;
        }
        return false;
    }
}
