package com.flurry.a.a.a.b;

import com.flurry.a.a.a.c.x;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements com.flurry.a.a.a.c.o {
    private static final ThreadLocal f = new k();
    private final c a;
    private com.flurry.a.a.a.c b;
    private com.flurry.a.a.a.c c;
    private x d;
    private final Thread e;

    public j() {
        this(null, null, c.a());
    }

    protected j(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2, c cVar3) {
        this.d = null;
        this.b = cVar;
        this.c = cVar2;
        this.a = cVar3;
        this.e = Thread.currentThread();
    }

    public final c a() {
        return this.a;
    }

    @Override // com.flurry.a.a.a.c.o
    public final Object a(com.flurry.a.a.a.c.p pVar) {
        Map map;
        x xVar;
        com.flurry.a.a.a.c cVar = this.b;
        com.flurry.a.a.a.c cVar2 = this.c;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.e || this.d == null) {
            Map map2 = (Map) ((Map) f.get()).get(cVar);
            if (map2 == null) {
                map = new com.flurry.a.a.a.e.b();
                ((Map) f.get()).put(cVar, map);
            } else {
                map = map2;
            }
            xVar = (x) map.get(cVar2);
            if (xVar == null) {
                com.flurry.a.a.a.c.q.a();
                xVar = com.flurry.a.a.a.c.q.a(com.flurry.a.a.a.c.a(cVar, cVar2), cVar2);
                map.put(cVar2, xVar);
            }
            if (currentThread == this.e) {
                this.d = xVar;
            }
        } else {
            xVar = this.d;
        }
        xVar.a(pVar);
        Object a = a((Object) null, this.c, xVar);
        xVar.v();
        return a;
    }

    private Object a(Object obj, com.flurry.a.a.a.c cVar, x xVar) {
        Object obj2;
        Object obj3 = obj;
        while (true) {
            switch (l.a[cVar.a().ordinal()]) {
                case 1:
                    Object c = this.a.c(obj3, cVar);
                    c cVar2 = this.a;
                    c.b();
                    for (com.flurry.a.a.a.m mVar : xVar.u()) {
                        int b = mVar.b();
                        mVar.a();
                        if (obj3 != null) {
                            c cVar3 = this.a;
                            obj2 = c.a(c, b);
                        } else {
                            obj2 = null;
                        }
                        c cVar4 = this.a;
                        c.a(c, b, a(obj2, mVar.c(), xVar));
                    }
                    return c;
                case 2:
                    return a((String) cVar.c().get(xVar.k()), cVar);
                case 3:
                    com.flurry.a.a.a.c i = cVar.i();
                    long l = xVar.l();
                    if (l <= 0) {
                        return a(obj3, 0, cVar);
                    }
                    Object a = a(obj3, (int) l, cVar);
                    do {
                        for (long j = 0; j < l; j++) {
                            ((Collection) a).add(a(a instanceof a ? ((a) a).b() : null, i, xVar));
                        }
                        l = xVar.m();
                    } while (l > 0);
                    return a;
                case 4:
                    com.flurry.a.a.a.c j2 = cVar.j();
                    long o = xVar.o();
                    int i2 = (int) o;
                    if (obj3 instanceof Map) {
                        ((Map) obj3).clear();
                    } else {
                        obj3 = new HashMap(i2);
                    }
                    if (o > 0) {
                        do {
                            for (int i3 = 0; i3 < o; i3++) {
                                ((Map) obj3).put(a((Object) null, cVar, (com.flurry.a.a.a.c.p) xVar), a((Object) null, j2, xVar));
                            }
                            o = xVar.p();
                        } while (o > 0);
                        return obj3;
                    }
                    return obj3;
                case 5:
                    cVar = (com.flurry.a.a.a.c) cVar.k().get(xVar.r());
                case 6:
                    p pVar = (p) this.a.b(obj3, cVar);
                    xVar.a(pVar.b(), 0, cVar.l());
                    return pVar;
                case R.styleable.CellLayout_longAxisCells /* 7 */:
                    return a(obj3, cVar, (com.flurry.a.a.a.c.p) xVar);
                case ThemeParser.TYPE_FOLDER /* 8 */:
                    return xVar.a(obj3 instanceof ByteBuffer ? (ByteBuffer) obj3 : null);
                case 9:
                    return Integer.valueOf(xVar.d());
                case 10:
                    return Long.valueOf(xVar.e());
                case 11:
                    return Float.valueOf(xVar.f());
                case 12:
                    return Double.valueOf(xVar.g());
                case 13:
                    return Boolean.valueOf(xVar.c());
                case 14:
                    xVar.b();
                    return null;
                default:
                    throw new com.flurry.a.a.a.a("Unknown type: " + cVar);
            }
        }
    }

    protected Object a(String str, com.flurry.a.a.a.c cVar) {
        return new g(cVar, str);
    }

    private static Object a(Object obj, int i, com.flurry.a.a.a.c cVar) {
        if (!(obj instanceof Collection)) {
            return new e(i, cVar);
        }
        ((Collection) obj).clear();
        return obj;
    }

    private Object a(Object obj, com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c.p pVar) {
        c cVar2 = this.a;
        c cVar3 = this.a;
        if ("String".equals(cVar.a("avro.java.string"))) {
            return pVar.h();
        }
        return pVar.a(obj instanceof com.flurry.a.a.a.e.a ? (com.flurry.a.a.a.e.a) obj : null);
    }
}
