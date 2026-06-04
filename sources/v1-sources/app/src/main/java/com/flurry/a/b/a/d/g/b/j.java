package com.flurry.a.b.a.d.g.b;

import java.util.List;

/* loaded from: classes.dex */
public final class j extends w implements com.flurry.a.b.a.d.ar {
    protected com.flurry.a.b.a.d.ac a;

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        List list = (List) obj;
        eVar.b();
        if (this.a == null) {
            a(list, eVar, awVar);
        } else {
            b(list, eVar, awVar);
        }
        eVar.c();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        List list = (List) obj;
        azVar.c(list, eVar);
        if (this.a == null) {
            a(list, eVar, awVar);
        } else {
            b(list, eVar, awVar);
        }
        azVar.f(list, eVar);
    }

    public j(com.flurry.a.b.a.d.f fVar) {
        super(List.class, fVar);
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac a = awVar.a(String.class, this.b);
        if (!a(a)) {
            this.a = a;
        }
    }

    private static void a(List list, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        int i = 0;
        try {
            int size = list.size();
            while (i < size) {
                String str = (String) list.get(i);
                if (str == null) {
                    awVar.a(eVar);
                } else {
                    eVar.b(str);
                }
                i++;
            }
        } catch (Exception e) {
            a(awVar, e, list, i);
        }
    }

    private final void b(List list, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        int i = 0;
        try {
            int size = list.size();
            com.flurry.a.b.a.d.ac acVar = this.a;
            while (i < size) {
                String str = (String) list.get(i);
                if (str == null) {
                    awVar.a(eVar);
                } else {
                    acVar.a(str, eVar, awVar);
                }
                i++;
            }
        } catch (Exception e) {
            a(awVar, e, list, i);
        }
    }
}
