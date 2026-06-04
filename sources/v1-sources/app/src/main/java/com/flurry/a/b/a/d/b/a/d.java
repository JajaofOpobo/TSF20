package com.flurry.a.b.a.d.b.a;

import com.flurry.a.b.a.d.b.b.bx;
import com.flurry.a.b.a.d.b.v;
import java.lang.reflect.Member;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d {
    final com.flurry.a.b.a.d.e.k a;
    final boolean b;
    protected com.flurry.a.b.a.d.e.c c;
    protected com.flurry.a.b.a.d.e.i d;
    protected com.flurry.a.b.a.d.e.i e;
    protected com.flurry.a.b.a.d.e.i f;
    protected com.flurry.a.b.a.d.e.i g;
    protected com.flurry.a.b.a.d.e.i h;
    protected com.flurry.a.b.a.d.e.i i;
    protected com.flurry.a.b.a.d.e.i j;
    protected e[] k = null;

    public d(com.flurry.a.b.a.d.e.k kVar, boolean z) {
        this.a = kVar;
        this.b = z;
    }

    public final v a(com.flurry.a.b.a.d.n nVar) {
        com.flurry.a.b.a.g.a a;
        bx bxVar = new bx(nVar, this.a.a());
        if (this.i == null) {
            a = null;
        } else {
            a = this.a.j().a(this.i.a(0));
        }
        bxVar.a(this.c, this.i, a, this.j, this.k);
        bxVar.a(this.d);
        bxVar.b(this.e);
        bxVar.c(this.f);
        bxVar.d(this.g);
        bxVar.e(this.h);
        return bxVar;
    }

    public final void a(com.flurry.a.b.a.d.e.c cVar) {
        this.c = cVar;
    }

    public final void a(com.flurry.a.b.a.d.e.i iVar) {
        this.d = a(iVar, this.d, "String");
    }

    public final void b(com.flurry.a.b.a.d.e.i iVar) {
        this.e = a(iVar, this.e, "int");
    }

    public final void c(com.flurry.a.b.a.d.e.i iVar) {
        this.f = a(iVar, this.f, "long");
    }

    public final void d(com.flurry.a.b.a.d.e.i iVar) {
        this.g = a(iVar, this.g, "double");
    }

    public final void e(com.flurry.a.b.a.d.e.i iVar) {
        this.h = a(iVar, this.h, "boolean");
    }

    public final void f(com.flurry.a.b.a.d.e.i iVar) {
        this.i = a(iVar, this.i, "delegate");
    }

    public final void a(com.flurry.a.b.a.d.e.i iVar, e[] eVarArr) {
        this.j = a(iVar, this.j, "property-based");
        if (eVarArr.length > 1) {
            HashMap hashMap = new HashMap();
            int length = eVarArr.length;
            for (int i = 0; i < length; i++) {
                String c = eVarArr[i].c();
                Integer num = (Integer) hashMap.put(c, Integer.valueOf(i));
                if (num != null) {
                    throw new IllegalArgumentException("Duplicate creator property \"" + c + "\" (index " + num + " vs " + i + ")");
                }
            }
        }
        this.k = eVarArr;
    }

    private com.flurry.a.b.a.d.e.i a(com.flurry.a.b.a.d.e.i iVar, com.flurry.a.b.a.d.e.i iVar2, String str) {
        if (iVar2 != null && iVar2.getClass() == iVar.getClass()) {
            throw new IllegalArgumentException("Conflicting " + str + " creators: already had " + iVar2 + ", encountered " + iVar);
        }
        if (this.b) {
            com.flurry.a.b.a.d.i.l.a((Member) iVar.a());
        }
        return iVar;
    }
}
