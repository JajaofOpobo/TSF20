package com.flurry.a.b.a.d.b;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class n extends k {
    protected final String i;
    protected final boolean j;
    protected final k k;
    protected final k l;

    @Override // com.flurry.a.b.a.d.b.k
    public final /* synthetic */ k a(com.flurry.a.b.a.d.w wVar) {
        return new n(this, wVar);
    }

    public n(String str, k kVar, k kVar2, com.flurry.a.b.a.d.i.a aVar, boolean z) {
        super(kVar.c(), kVar.a(), kVar.e, aVar);
        this.i = str;
        this.k = kVar;
        this.l = kVar2;
        this.j = z;
    }

    private n(n nVar, com.flurry.a.b.a.d.w wVar) {
        super(nVar, wVar);
        this.i = nVar.i;
        this.j = nVar.j;
        this.k = nVar.k;
        this.l = nVar.l;
    }

    @Override // com.flurry.a.b.a.d.b.k, com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.k.b();
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        a(obj, this.k.a(jVar, pVar));
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(Object obj, Object obj2) {
        this.k.a(obj, obj2);
        if (obj2 != null) {
            if (this.j) {
                if (obj2 instanceof Object[]) {
                    for (Object obj3 : (Object[]) obj2) {
                        if (obj3 != null) {
                            this.l.a(obj3, obj);
                        }
                    }
                    return;
                }
                if (obj2 instanceof Collection) {
                    for (Object obj4 : (Collection) obj2) {
                        if (obj4 != null) {
                            this.l.a(obj4, obj);
                        }
                    }
                    return;
                }
                if (obj2 instanceof Map) {
                    for (Object obj5 : ((Map) obj2).values()) {
                        if (obj5 != null) {
                            this.l.a(obj5, obj);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this.i + "'");
            }
            this.l.a(obj2, obj);
        }
    }
}
