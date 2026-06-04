package com.flurry.a.b.a.d.g.b;

import java.util.List;

/* loaded from: classes.dex */
public final class aj extends a {
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0026 -> B:11:0x001c). Please report as a decompilation issue!!! */
    @Override // com.flurry.a.b.a.d.g.b.a
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        int i = 0;
        List list = (List) obj;
        if (this.d != null) {
            com.flurry.a.b.a.d.ac acVar = this.d;
            int size = list.size();
            if (size != 0) {
                com.flurry.a.b.a.d.az azVar = this.c;
                while (i < size) {
                    Object obj2 = list.get(i);
                    if (obj2 == null) {
                        try {
                            awVar.a(eVar);
                        } catch (Exception e) {
                            a(awVar, e, list, i);
                        }
                    } else if (azVar == null) {
                        acVar.a(obj2, eVar, awVar);
                    } else {
                        acVar.a(obj2, eVar, awVar, azVar);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (this.c == null) {
            int size2 = list.size();
            if (size2 != 0) {
                try {
                    com.flurry.a.b.a.d.g.a.d dVar = this.f;
                    while (i < size2) {
                        Object obj3 = list.get(i);
                        if (obj3 == null) {
                            awVar.a(eVar);
                        } else {
                            Class<?> cls = obj3.getClass();
                            com.flurry.a.b.a.d.ac a = dVar.a(cls);
                            if (a == null) {
                                com.flurry.a.b.a.d.ac a2 = this.b.e() ? a(dVar, awVar.a(this.b, cls), awVar) : a(dVar, cls, awVar);
                                dVar = this.f;
                                a = a2;
                            }
                            a.a(obj3, eVar, awVar);
                        }
                        i++;
                    }
                    return;
                } catch (Exception e2) {
                    a(awVar, e2, list, i);
                    return;
                }
            }
            return;
        }
        int size3 = list.size();
        if (size3 != 0) {
            try {
                com.flurry.a.b.a.d.az azVar2 = this.c;
                com.flurry.a.b.a.d.g.a.d dVar2 = this.f;
                while (i < size3) {
                    Object obj4 = list.get(i);
                    if (obj4 == null) {
                        awVar.a(eVar);
                    } else {
                        Class<?> cls2 = obj4.getClass();
                        com.flurry.a.b.a.d.ac a3 = dVar2.a(cls2);
                        if (a3 == null) {
                            com.flurry.a.b.a.d.ac a4 = this.b.e() ? a(dVar2, awVar.a(this.b, cls2), awVar) : a(dVar2, cls2, awVar);
                            dVar2 = this.f;
                            a3 = a4;
                        }
                        a3.a(obj4, eVar, awVar, azVar2);
                    }
                    i++;
                }
            } catch (Exception e3) {
                a(awVar, e3, list, i);
            }
        }
    }

    public aj(com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar) {
        super(List.class, aVar, z, azVar, fVar, acVar);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new aj(this.b, this.a, azVar, this.e, this.d);
    }
}
