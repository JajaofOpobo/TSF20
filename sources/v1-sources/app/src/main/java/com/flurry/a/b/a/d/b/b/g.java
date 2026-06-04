package com.flurry.a.b.a.d.b.b;

import java.util.Collection;

/* loaded from: classes.dex */
public final class g extends h implements com.flurry.a.b.a.d.aq {
    protected final com.flurry.a.b.a.g.a a;
    protected final com.flurry.a.b.a.d.w b;
    protected final com.flurry.a.b.a.d.ay c;
    protected final com.flurry.a.b.a.d.b.v d;
    protected com.flurry.a.b.a.d.w e;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (this.e != null) {
            return (Collection) this.d.a(this.e.a(jVar, pVar));
        }
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING) {
            String k = jVar.k();
            if (k.length() == 0) {
                return (Collection) this.d.a(k);
            }
        }
        return a(jVar, pVar, (Collection) this.d.m());
    }

    public g(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.w wVar, com.flurry.a.b.a.d.ay ayVar, com.flurry.a.b.a.d.b.v vVar) {
        super(aVar.p());
        this.a = aVar;
        this.b = wVar;
        this.c = ayVar;
        this.d = vVar;
    }

    @Override // com.flurry.a.b.a.d.aq
    public final void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar) {
        if (this.d.i()) {
            com.flurry.a.b.a.g.a l = this.d.l();
            if (l == null) {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.a + ": value instantiator (" + this.d.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
            this.e = sVar.a(nVar, l, new com.flurry.a.b.a.d.g(null, l, null, this.d.o()));
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.h
    public final com.flurry.a.b.a.d.w c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.flurry.a.b.a.d.w
    public Collection a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Collection collection) {
        Object a;
        Object obj = null;
        if (!jVar.j()) {
            if (!pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                throw pVar.b(this.a.p());
            }
            com.flurry.a.b.a.d.w wVar = this.b;
            com.flurry.a.b.a.d.ay ayVar = this.c;
            if (jVar.e() != com.flurry.a.b.a.o.VALUE_NULL) {
                obj = ayVar == null ? wVar.a(jVar, pVar) : wVar.a(jVar, pVar, ayVar);
            }
            collection.add(obj);
        } else {
            com.flurry.a.b.a.d.w wVar2 = this.b;
            com.flurry.a.b.a.d.ay ayVar2 = this.c;
            while (true) {
                com.flurry.a.b.a.o b = jVar.b();
                if (b == com.flurry.a.b.a.o.END_ARRAY) {
                    break;
                }
                if (b == com.flurry.a.b.a.o.VALUE_NULL) {
                    a = null;
                } else if (ayVar2 == null) {
                    a = wVar2.a(jVar, pVar);
                } else {
                    a = wVar2.a(jVar, pVar, ayVar2);
                }
                collection.add(a);
            }
        }
        return collection;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.b(jVar, pVar);
    }
}
