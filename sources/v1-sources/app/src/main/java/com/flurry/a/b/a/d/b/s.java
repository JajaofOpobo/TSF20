package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ae;
import com.flurry.a.b.a.d.aq;
import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.i.y;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class s extends com.flurry.a.b.a.d.s {
    protected final ConcurrentHashMap a;
    protected final HashMap b;
    protected final y c;
    protected com.flurry.a.b.a.d.q d;

    public s() {
        this(g.h);
    }

    private s(com.flurry.a.b.a.d.q qVar) {
        this.a = new ConcurrentHashMap(64, 0.75f, 2);
        this.b = new HashMap(8);
        this.d = qVar;
        this.c = new y();
    }

    @Override // com.flurry.a.b.a.d.s
    public final com.flurry.a.b.a.c.h c(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        return this.c.a(aVar.p(), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.flurry.a.b.a.d.s
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.w a = a(aVar);
        if (a != 0) {
            if (a instanceof com.flurry.a.b.a.d.k) {
                return ((com.flurry.a.b.a.d.k) a).a();
            }
            return a;
        }
        com.flurry.a.b.a.d.w b = b(nVar, aVar, fVar);
        if (b == 0) {
            if ((aVar.p().getModifiers() & 1536) == 0) {
                throw new com.flurry.a.b.a.d.y("Can not find a Value deserializer for type " + aVar);
            }
            throw new com.flurry.a.b.a.d.y("Can not find a Value deserializer for abstract type " + aVar);
        }
        if (b instanceof com.flurry.a.b.a.d.k) {
            return ((com.flurry.a.b.a.d.k) b).a();
        }
        return b;
    }

    @Override // com.flurry.a.b.a.d.s
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        com.flurry.a.b.a.d.w a = a(nVar, aVar, null);
        ay b = this.d.b(nVar, aVar, null);
        return b != null ? new t(b, a) : a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.flurry.a.b.a.d.s
    public final ae b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        ae b = this.d.b(nVar, aVar);
        boolean z = b instanceof com.flurry.a.b.a.d.l;
        ae aeVar = b;
        if (z) {
            aeVar = ((com.flurry.a.b.a.d.l) b).a();
        }
        if (aeVar == null) {
            throw new com.flurry.a.b.a.d.y("Can not find a (Map) Key deserializer for type " + aVar);
        }
        return aeVar;
    }

    private com.flurry.a.b.a.d.w a(com.flurry.a.b.a.g.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        }
        return (com.flurry.a.b.a.d.w) this.a.get(aVar);
    }

    private com.flurry.a.b.a.d.w b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.w a;
        synchronized (this.b) {
            a = a(aVar);
            if (a == null) {
                int size = this.b.size();
                if (size <= 0 || (a = (com.flurry.a.b.a.d.w) this.b.get(aVar)) == null) {
                    try {
                        a = c(nVar, aVar, fVar);
                    } finally {
                        if (size == 0 && this.b.size() > 0) {
                            this.b.clear();
                        }
                    }
                }
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.flurry.a.b.a.d.w c(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.w a;
        boolean z;
        try {
            if (aVar.r()) {
                a = this.d.a(nVar, aVar);
            } else {
                if (aVar.f()) {
                    if (aVar.b()) {
                        a = this.d.a(nVar, this, (com.flurry.a.b.a.d.h.a) aVar, fVar);
                    } else if (aVar.j()) {
                        com.flurry.a.b.a.d.h.f fVar2 = (com.flurry.a.b.a.d.h.f) aVar;
                        a = fVar2.l() ? this.d.a(nVar, (com.flurry.a.b.a.d.s) this, (com.flurry.a.b.a.d.h.g) fVar2, fVar) : this.d.a(nVar, this, fVar2, fVar);
                    } else if (aVar.i()) {
                        com.flurry.a.b.a.d.h.c cVar = (com.flurry.a.b.a.d.h.c) aVar;
                        a = cVar.f_() ? this.d.a(nVar, this, (com.flurry.a.b.a.d.h.d) cVar, fVar) : this.d.a(nVar, cVar, fVar);
                    }
                }
                a = com.flurry.a.b.a.h.class.isAssignableFrom(aVar.p()) ? this.d.a(aVar) : this.d.a(nVar, aVar, fVar);
            }
            if (a == null) {
                return null;
            }
            boolean z2 = a instanceof aq;
            boolean z3 = a.getClass() == d.class;
            if (!z3 && nVar.a(com.flurry.a.b.a.d.o.USE_ANNOTATIONS)) {
                com.flurry.a.b.a.d.b a2 = nVar.a();
                Boolean a3 = a2.a(com.flurry.a.b.a.d.e.b.a(a.getClass(), a2, (com.flurry.a.b.a.d.j) null));
                if (a3 != null) {
                    z = a3.booleanValue();
                    if (z2) {
                        this.b.put(aVar, a);
                        ((aq) a).a(nVar, this);
                        this.b.remove(aVar);
                    }
                    if (!z) {
                        this.a.put(aVar, a);
                        return a;
                    }
                    return a;
                }
            }
            z = z3;
            if (z2) {
            }
            if (!z) {
            }
        } catch (IllegalArgumentException e) {
            throw new com.flurry.a.b.a.d.y(e.getMessage(), null, e);
        }
    }
}
