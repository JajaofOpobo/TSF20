package com.flurry.a.b.a.d;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class am extends com.flurry.a.b.a.p {
    protected final com.flurry.a.b.a.c d;
    protected com.flurry.a.b.a.d.f.b e;
    protected com.flurry.a.b.a.d.h.k f;
    protected v g;
    protected as h;
    protected aw i;
    protected au j;
    protected n k;
    protected s l;
    protected final ConcurrentHashMap m;
    private static final com.flurry.a.b.a.g.a n = com.flurry.a.b.a.d.h.h.d(com.flurry.a.b.a.h.class);
    protected static final i a = com.flurry.a.b.a.d.e.l.i;
    protected static final b b = new com.flurry.a.b.a.d.e.q();
    protected static final com.flurry.a.b.a.d.e.x c = com.flurry.a.b.a.d.e.y.a();

    public am() {
        this((com.flurry.a.b.a.c) null, (byte) 0);
    }

    public am(com.flurry.a.b.a.c cVar) {
        this(cVar, (byte) 0);
    }

    private am(com.flurry.a.b.a.c cVar, byte b2) {
        this(cVar, (char) 0);
    }

    private am(com.flurry.a.b.a.c cVar, char c2) {
        this.m = new ConcurrentHashMap(64, 0.6f, 2);
        if (cVar == null) {
            this.d = new al(this);
        } else {
            this.d = cVar;
            if (cVar.a() == null) {
                this.d.a((com.flurry.a.b.a.p) this);
            }
        }
        this.f = com.flurry.a.b.a.d.h.k.a();
        this.h = new as(a, b, c, this.f);
        this.k = new n(a, b, c, this.f);
        this.i = new com.flurry.a.b.a.d.g.u();
        this.l = new com.flurry.a.b.a.d.b.s();
        this.j = com.flurry.a.b.a.d.g.g.e;
    }

    private as a() {
        return this.h.a(this.e);
    }

    public final com.flurry.a.b.a.h a(com.flurry.a.b.a.j jVar) {
        Object obj;
        n a2 = this.k.a(this.e).a(this.h.i);
        if (jVar.e() == null && jVar.b() == null) {
            return null;
        }
        com.flurry.a.b.a.g.a aVar = n;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == null && (e = jVar.b()) == null) {
            throw new EOFException("No content to map to Object due to end of input");
        }
        if (e == com.flurry.a.b.a.o.VALUE_NULL) {
            obj = a(a2, aVar).b();
        } else if (e == com.flurry.a.b.a.o.END_ARRAY || e == com.flurry.a.b.a.o.END_OBJECT) {
            obj = null;
        } else {
            com.flurry.a.b.a.d.b.r rVar = new com.flurry.a.b.a.d.b.r(a2, jVar, this.l, this.g);
            w a3 = a(a2, aVar);
            if (a2.a(o.UNWRAP_ROOT_VALUE)) {
                com.flurry.a.b.a.c.h c2 = this.l.c(rVar.a(), aVar);
                if (jVar.e() != com.flurry.a.b.a.o.START_OBJECT) {
                    throw y.a(jVar, "Current token not START_OBJECT (needed to unwrap root name '" + c2 + "'), but " + jVar.e());
                }
                if (jVar.b() != com.flurry.a.b.a.o.FIELD_NAME) {
                    throw y.a(jVar, "Current token not FIELD_NAME (to contain expected root name '" + c2 + "'), but " + jVar.e());
                }
                String g = jVar.g();
                if (!c2.a().equals(g)) {
                    throw y.a(jVar, "Root name '" + g + "' does not match expected ('" + c2 + "') for type " + aVar);
                }
                jVar.b();
                obj = a3.a(jVar, rVar);
                if (jVar.b() != com.flurry.a.b.a.o.END_OBJECT) {
                    throw y.a(jVar, "Current token not END_OBJECT (to match wrapper object with root name '" + c2 + "'), but " + jVar.e());
                }
            } else {
                obj = a3.a(jVar, rVar);
            }
        }
        jVar.f();
        com.flurry.a.b.a.h hVar = (com.flurry.a.b.a.h) obj;
        if (hVar != null) {
            return hVar;
        }
        this.k.h();
        return com.flurry.a.b.a.e.l.a();
    }

    @Override // com.flurry.a.b.a.p
    public final void a(com.flurry.a.b.a.e eVar, Object obj) {
        Closeable closeable;
        Throwable th;
        as a2 = a();
        if (a2.a(at.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            Closeable closeable2 = (Closeable) obj;
            try {
                this.i.a(a2, eVar, obj, this.j);
                if (a2.a(at.FLUSH_AFTER_WRITE_VALUE)) {
                    eVar.g();
                }
                closeable = null;
                try {
                    closeable2.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException e) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                closeable = closeable2;
                th = th3;
            }
        } else {
            this.i.a(a2, eVar, obj, this.j);
            if (a2.a(at.FLUSH_AFTER_WRITE_VALUE)) {
                eVar.g();
            }
        }
    }

    @Override // com.flurry.a.b.a.p
    public final void a(com.flurry.a.b.a.e eVar, com.flurry.a.b.a.h hVar) {
        as a2 = a();
        this.i.a(a2, eVar, hVar, this.j);
        if (a2.a(at.FLUSH_AFTER_WRITE_VALUE)) {
            eVar.g();
        }
    }

    private w a(n nVar, com.flurry.a.b.a.g.a aVar) {
        w wVar = (w) this.m.get(aVar);
        if (wVar == null) {
            wVar = this.l.a(nVar, aVar);
            if (wVar == null) {
                throw new y("Can not find a deserializer for type " + aVar);
            }
            this.m.put(aVar, wVar);
        }
        return wVar;
    }
}
