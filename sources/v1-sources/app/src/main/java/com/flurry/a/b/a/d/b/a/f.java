package com.flurry.a.b.a.d.b.a;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {
    private final h[] a;
    private final HashMap b;
    private final String[] c;
    private final com.flurry.a.b.a.h.m[] d;

    protected f(h[] hVarArr, HashMap hashMap) {
        this.a = hVarArr;
        this.b = hashMap;
        this.c = null;
        this.d = null;
    }

    private f(f fVar) {
        this.a = fVar.a;
        this.b = fVar.b;
        int length = this.a.length;
        this.c = new String[length];
        this.d = new com.flurry.a.b.a.h.m[length];
    }

    public final f a() {
        return new f(this);
    }

    public final boolean a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, String str, Object obj) {
        boolean z;
        boolean z2 = false;
        Integer num = (Integer) this.b.get(str);
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (this.a[intValue].a(str)) {
            this.c[intValue] = jVar.k();
            jVar.d();
            z = (obj == null || this.d[intValue] == null) ? false : true;
        } else {
            com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
            mVar.b(jVar);
            this.d[intValue] = mVar;
            if (obj != null && this.c[intValue] != null) {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            a(jVar, pVar, obj, intValue);
            this.c[intValue] = null;
            this.d[intValue] = null;
        }
        return true;
    }

    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            if (this.c[i] == null) {
                if (this.d[i] != null) {
                    throw pVar.b("Missing external type id property '" + this.a[i].a());
                }
            } else {
                if (this.d[i] == null) {
                    throw pVar.b("Missing property '" + this.a[i].b().c() + "' for external type id '" + this.a[i].a());
                }
                a(jVar, pVar, obj, i);
            }
        }
        return obj;
    }

    private void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj, int i) {
        com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
        mVar.b();
        mVar.b(this.c[i]);
        com.flurry.a.b.a.j a = this.d[i].a(jVar);
        a.b();
        mVar.b(a);
        mVar.c();
        com.flurry.a.b.a.j a2 = mVar.a(jVar);
        a2.b();
        this.a[i].b().a(a2, pVar, obj);
    }
}
