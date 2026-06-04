package com.flurry.a.b.a.d.b;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class m extends k {
    protected final k i;
    protected final Constructor j;

    @Override // com.flurry.a.b.a.d.b.k
    public final /* synthetic */ k a(com.flurry.a.b.a.d.w wVar) {
        return new m(this, wVar);
    }

    public m(k kVar, Constructor constructor) {
        super(kVar);
        this.i = kVar;
        this.j = constructor;
    }

    private m(m mVar, com.flurry.a.b.a.d.w wVar) {
        super(mVar, wVar);
        this.i = mVar.i.a(wVar);
        this.j = mVar.j;
    }

    @Override // com.flurry.a.b.a.d.b.k, com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.i.b();
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        Object obj2 = null;
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_NULL) {
            if (this.f != null) {
                obj2 = this.f.a(pVar);
            }
        } else if (this.e != null) {
            obj2 = this.d.a(jVar, pVar, this.e);
        } else {
            try {
                obj2 = this.j.newInstance(obj);
            } catch (Exception e) {
                com.flurry.a.b.a.d.i.l.a(e, "Failed to instantiate class " + this.j.getDeclaringClass().getName() + ", problem: " + e.getMessage());
            }
            this.d.a(jVar, pVar, obj2);
        }
        a(obj, obj2);
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(Object obj, Object obj2) {
        this.i.a(obj, obj2);
    }
}
