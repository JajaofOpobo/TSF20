package com.flurry.a.b.a.d.b.b;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class ad extends h {
    protected final com.flurry.a.b.a.g.a a;
    protected final boolean b;
    protected final Class c;
    protected final com.flurry.a.b.a.d.w d;
    protected final com.flurry.a.b.a.d.ay e;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        int i;
        Object[] objArr = null;
        if (jVar.j()) {
            com.flurry.a.b.a.d.i.t g = pVar.g();
            Object[] a = g.a();
            com.flurry.a.b.a.d.ay ayVar = this.e;
            Object[] objArr2 = a;
            int i2 = 0;
            while (true) {
                com.flurry.a.b.a.o b = jVar.b();
                if (b == com.flurry.a.b.a.o.END_ARRAY) {
                    break;
                }
                Object a2 = b == com.flurry.a.b.a.o.VALUE_NULL ? null : ayVar == null ? this.d.a(jVar, pVar) : this.d.a(jVar, pVar, ayVar);
                if (i2 >= objArr2.length) {
                    objArr2 = g.a(objArr2);
                    i = 0;
                } else {
                    i = i2;
                }
                i2 = i + 1;
                objArr2[i] = a2;
            }
            objArr = this.b ? g.a(objArr2, i2) : g.a(objArr2, i2, this.c);
            pVar.a(g);
        } else if (jVar.e() != com.flurry.a.b.a.o.VALUE_STRING || !pVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) || jVar.k().length() != 0) {
            if (pVar.a(com.flurry.a.b.a.d.o.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                Object a3 = jVar.e() == com.flurry.a.b.a.o.VALUE_NULL ? null : this.e == null ? this.d.a(jVar, pVar) : this.d.a(jVar, pVar, this.e);
                objArr = this.b ? new Object[1] : (Object[]) Array.newInstance((Class<?>) this.c, 1);
                objArr[0] = a3;
            } else {
                if (jVar.e() != com.flurry.a.b.a.o.VALUE_STRING || this.c != Byte.class) {
                    throw pVar.b(this.a.p());
                }
                byte[] a4 = jVar.a(pVar.c());
                objArr = new Byte[a4.length];
                int length = a4.length;
                for (int i3 = 0; i3 < length; i3++) {
                    objArr[i3] = Byte.valueOf(a4[i3]);
                }
            }
        }
        return objArr;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return (Object[]) ayVar.b(jVar, pVar);
    }

    public ad(com.flurry.a.b.a.d.h.a aVar, com.flurry.a.b.a.d.w wVar, com.flurry.a.b.a.d.ay ayVar) {
        super(Object[].class);
        this.a = aVar;
        this.c = aVar.g().p();
        this.b = this.c == Object.class;
        this.d = wVar;
        this.e = ayVar;
    }

    @Override // com.flurry.a.b.a.d.b.b.h
    public final com.flurry.a.b.a.d.w c() {
        return this.d;
    }
}
