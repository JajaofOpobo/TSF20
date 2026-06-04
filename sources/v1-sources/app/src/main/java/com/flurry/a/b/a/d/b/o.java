package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o extends k {
    protected final com.flurry.a.b.a.d.e.f i;
    protected final Method j;

    @Override // com.flurry.a.b.a.d.b.k
    public final /* synthetic */ k a(com.flurry.a.b.a.d.w wVar) {
        return new o(this, wVar);
    }

    public o(String str, com.flurry.a.b.a.g.a aVar, ay ayVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.f fVar) {
        super(str, aVar, ayVar, aVar2);
        this.i = fVar;
        this.j = fVar.e();
    }

    private o(o oVar, com.flurry.a.b.a.d.w wVar) {
        super(oVar, wVar);
        this.i = oVar.i;
        this.j = oVar.j;
    }

    @Override // com.flurry.a.b.a.d.b.k, com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.i;
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        a(obj, a(jVar, pVar));
    }

    @Override // com.flurry.a.b.a.d.b.k
    public final void a(Object obj, Object obj2) {
        try {
            this.j.invoke(obj, obj2);
        } catch (Exception e) {
            a(e, obj2);
        }
    }
}
