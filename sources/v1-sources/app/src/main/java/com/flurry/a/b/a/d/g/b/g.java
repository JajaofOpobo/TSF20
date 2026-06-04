package com.flurry.a.b.a.d.g.b;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends e implements com.flurry.a.b.a.d.ar {
    protected final boolean a;
    protected final com.flurry.a.b.a.d.i.q b;
    protected final com.flurry.a.b.a.g.a c;
    protected final com.flurry.a.b.a.d.f d;
    protected com.flurry.a.b.a.d.ac e;
    protected final com.flurry.a.b.a.d.az f;

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        EnumMap enumMap = (EnumMap) obj;
        eVar.d();
        if (!enumMap.isEmpty()) {
            a(enumMap, eVar, awVar);
        }
        eVar.e();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        EnumMap enumMap = (EnumMap) obj;
        azVar.b(enumMap, eVar);
        if (!enumMap.isEmpty()) {
            a(enumMap, eVar, awVar);
        }
        azVar.e(enumMap, eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.i.q qVar, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar) {
        super(EnumMap.class, (byte) 0);
        boolean z2 = false;
        if (z || (aVar != null && aVar.u())) {
            z2 = true;
        }
        this.a = z2;
        this.c = aVar;
        this.b = qVar;
        this.f = azVar;
        this.d = fVar;
        this.e = acVar;
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new g(this.c, this.a, this.b, azVar, this.d, this.e);
    }

    private void a(EnumMap enumMap, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac acVar;
        if (this.e != null) {
            com.flurry.a.b.a.d.ac acVar2 = this.e;
            com.flurry.a.b.a.d.i.q qVar = this.b;
            com.flurry.a.b.a.d.i.q qVar2 = qVar;
            for (Map.Entry entry : enumMap.entrySet()) {
                Enum r1 = (Enum) entry.getKey();
                if (qVar2 == null) {
                    qVar2 = ((h) ((v) awVar.a(r1.getDeclaringClass(), this.d))).d();
                }
                eVar.a(qVar2.a(r1));
                Object value = entry.getValue();
                if (value == null) {
                    awVar.a(eVar);
                } else {
                    try {
                        acVar2.a(value, eVar, awVar);
                    } catch (Exception e) {
                        a(awVar, e, enumMap, ((Enum) entry.getKey()).name());
                    }
                }
            }
            return;
        }
        com.flurry.a.b.a.d.i.q qVar3 = this.b;
        com.flurry.a.b.a.d.i.q qVar4 = qVar3;
        Class<?> cls = null;
        com.flurry.a.b.a.d.ac acVar3 = null;
        for (Map.Entry entry2 : enumMap.entrySet()) {
            Enum r12 = (Enum) entry2.getKey();
            if (qVar4 == null) {
                qVar4 = ((h) ((v) awVar.a(r12.getDeclaringClass(), this.d))).d();
            }
            eVar.a(qVar4.a(r12));
            Object value2 = entry2.getValue();
            if (value2 == null) {
                awVar.a(eVar);
            } else {
                Class<?> cls2 = value2.getClass();
                if (cls2 == cls) {
                    cls2 = cls;
                    acVar = acVar3;
                } else {
                    acVar3 = awVar.a(cls2, this.d);
                    acVar = acVar3;
                }
                try {
                    acVar3.a(value2, eVar, awVar);
                    acVar3 = acVar;
                    cls = cls2;
                } catch (Exception e2) {
                    a(awVar, e2, enumMap, ((Enum) entry2.getKey()).name());
                    acVar3 = acVar;
                    cls = cls2;
                }
            }
        }
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        if (this.a && this.e == null) {
            this.e = awVar.a(this.c, this.d);
        }
    }
}
