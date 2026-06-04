package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public class o extends com.flurry.a.b.a.d.g.d {
    public o(com.flurry.a.b.a.d.g.d dVar) {
        super(dVar);
    }

    private o(com.flurry.a.b.a.d.g.d dVar, ac acVar) {
        super(dVar, acVar);
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final com.flurry.a.b.a.d.g.d a(ac acVar) {
        if (getClass() != o.class) {
            throw new IllegalStateException("UnwrappingBeanPropertyWriter sub-class does not override 'withSerializer()'; needs to!");
        }
        if (!acVar.b()) {
            acVar = acVar.a();
        }
        return new o(this, acVar);
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Class<?> cls;
        d dVar;
        Object a = a(obj);
        if (a != null) {
            if (a == obj) {
                i();
            }
            if (this.l == null || !this.l.equals(a)) {
                ac acVar = this.i;
                if (acVar == null && (acVar = (dVar = this.j).a((cls = a.getClass()))) == null) {
                    acVar = a(dVar, cls, awVar);
                }
                if (!acVar.b()) {
                    eVar.a(this.g);
                }
                if (this.n == null) {
                    acVar.a(a, eVar, awVar);
                } else {
                    acVar.a(a, eVar, awVar, this.n);
                }
            }
        }
    }

    @Override // com.flurry.a.b.a.d.g.d
    protected final ac a(d dVar, Class cls, aw awVar) {
        ac a;
        if (this.o != null) {
            a = awVar.a(awVar.a(this.o, cls), this);
        } else {
            a = awVar.a(cls, this);
        }
        if (!a.b()) {
            a = a.a();
        }
        this.j = this.j.a(cls, a);
        return a;
    }
}
