package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.y;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q extends k {
    protected final com.flurry.a.b.a.d.e.f i;
    protected final Method j;

    @Override // com.flurry.a.b.a.d.b.k
    public final /* synthetic */ k a(com.flurry.a.b.a.d.w wVar) {
        return new q(this, wVar);
    }

    public q(String str, com.flurry.a.b.a.g.a aVar, ay ayVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.f fVar) {
        super(str, aVar, ayVar, aVar2);
        this.i = fVar;
        this.j = fVar.e();
    }

    private q(q qVar, com.flurry.a.b.a.d.w wVar) {
        super(qVar, wVar);
        this.i = qVar.i;
        this.j = qVar.j;
    }

    @Override // com.flurry.a.b.a.d.b.k, com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.i;
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        if (jVar.e() != com.flurry.a.b.a.o.VALUE_NULL) {
            try {
                Object invoke = this.j.invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new y("Problem deserializing 'setterless' property '" + c() + "': get method returned null");
                }
                this.d.a(jVar, pVar, invoke);
            } catch (Exception e) {
                a(e);
            }
        }
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call 'set' on setterless property");
    }
}
