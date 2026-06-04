package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ay;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l extends k {
    protected final com.flurry.a.b.a.d.e.d i;
    protected final Field j;

    @Override // com.flurry.a.b.a.d.b.k
    public final /* synthetic */ k a(com.flurry.a.b.a.d.w wVar) {
        return new l(this, wVar);
    }

    public l(String str, com.flurry.a.b.a.g.a aVar, ay ayVar, com.flurry.a.b.a.d.i.a aVar2, com.flurry.a.b.a.d.e.d dVar) {
        super(str, aVar, ayVar, aVar2);
        this.i = dVar;
        this.j = dVar.e();
    }

    private l(l lVar, com.flurry.a.b.a.d.w wVar) {
        super(lVar, wVar);
        this.i = lVar.i;
        this.j = lVar.j;
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
            this.j.set(obj, obj2);
        } catch (Exception e) {
            a(e, obj2);
        }
    }
}
