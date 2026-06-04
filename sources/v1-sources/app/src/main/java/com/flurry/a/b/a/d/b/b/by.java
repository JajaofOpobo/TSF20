package com.flurry.a.b.a.d.b.b;

import java.util.Collection;

/* loaded from: classes.dex */
public final class by extends h implements com.flurry.a.b.a.d.aq {
    protected final com.flurry.a.b.a.g.a a;
    protected final com.flurry.a.b.a.d.w b;
    protected final boolean c;
    protected final com.flurry.a.b.a.d.b.v d;
    protected com.flurry.a.b.a.d.w e;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        return this.e != null ? (Collection) this.d.a(this.e.a(jVar, pVar)) : a(jVar, pVar, (Collection) this.d.m());
    }

    public by(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.w wVar, com.flurry.a.b.a.d.b.v vVar) {
        super(aVar.p());
        this.a = aVar;
        this.b = wVar;
        this.d = vVar;
        this.c = (wVar == null || wVar.getClass().getAnnotation(com.flurry.a.b.a.d.a.b.class) == null) ? false : true;
    }

    @Override // com.flurry.a.b.a.d.aq
    public final void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar) {
        com.flurry.a.b.a.d.e.i o = this.d.o();
        if (o != null) {
            com.flurry.a.b.a.g.a l = this.d.l();
            this.e = sVar.a(nVar, l, new com.flurry.a.b.a.d.g(null, l, null, o));
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.h
    public final com.flurry.a.b.a.d.w c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    public Collection a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Collection collection) {
        String k;
        if (!jVar.j()) {
            if (!pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                throw pVar.b(this.a.p());
            }
            com.flurry.a.b.a.d.w wVar = this.b;
            if (jVar.e() == com.flurry.a.b.a.o.VALUE_NULL) {
                k = null;
            } else {
                k = wVar == null ? jVar.k() : (String) wVar.a(jVar, pVar);
            }
            collection.add(k);
        } else if (!this.c) {
            com.flurry.a.b.a.d.w wVar2 = this.b;
            while (true) {
                com.flurry.a.b.a.o b = jVar.b();
                if (b == com.flurry.a.b.a.o.END_ARRAY) {
                    break;
                }
                collection.add(b == com.flurry.a.b.a.o.VALUE_NULL ? null : (String) wVar2.a(jVar, pVar));
            }
        } else {
            while (true) {
                com.flurry.a.b.a.o b2 = jVar.b();
                if (b2 == com.flurry.a.b.a.o.END_ARRAY) {
                    break;
                }
                collection.add(b2 == com.flurry.a.b.a.o.VALUE_NULL ? null : jVar.k());
            }
        }
        return collection;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.b(jVar, pVar);
    }
}
