package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public class ca extends com.flurry.a.b.a.d.b.d {
    public ca(com.flurry.a.b.a.d.b.d dVar) {
        super(dVar);
    }

    private ca(com.flurry.a.b.a.d.b.d dVar, byte b) {
        super(dVar, true);
    }

    @Override // com.flurry.a.b.a.d.b.d, com.flurry.a.b.a.d.w
    public final com.flurry.a.b.a.d.w a() {
        return getClass() != ca.class ? this : new ca(this, (byte) 0);
    }

    @Override // com.flurry.a.b.a.d.b.d
    public final Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Object m;
        int i;
        Object[] objArr;
        Object obj;
        if (this.f != null) {
            return c(jVar, pVar);
        }
        if (this.e != null) {
            return this.d.a(this.e.a(jVar, pVar));
        }
        if (this.b.c()) {
            throw com.flurry.a.b.a.d.y.a(jVar, "Can not instantiate abstract type " + this.b + " (need to add/enable type information?)");
        }
        boolean c = this.d.c();
        boolean h = this.d.h();
        if (!c && !h) {
            throw new com.flurry.a.b.a.d.y("Can not deserialize Throwable of type " + this.b + " without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
        }
        int i2 = 0;
        Object[] objArr2 = null;
        Object obj2 = null;
        while (jVar.e() != com.flurry.a.b.a.o.END_OBJECT) {
            String g = jVar.g();
            com.flurry.a.b.a.d.b.k a = this.h.a(g);
            jVar.b();
            if (a != null) {
                if (obj2 != null) {
                    a.a(jVar, pVar, obj2);
                    i = i2;
                    objArr = objArr2;
                    obj = obj2;
                } else {
                    if (objArr2 == null) {
                        int b = this.h.b();
                        objArr2 = new Object[b + b];
                    }
                    int i3 = i2 + 1;
                    objArr2[i2] = a;
                    i = i3 + 1;
                    objArr2[i3] = a.a(jVar, pVar);
                    objArr = objArr2;
                    obj = obj2;
                }
            } else if ("message".equals(g) && c) {
                obj2 = this.d.a(jVar.k());
                if (objArr2 != null) {
                    for (int i4 = 0; i4 < i2; i4 += 2) {
                        ((com.flurry.a.b.a.d.b.k) objArr2[i4]).a(obj2, objArr2[i4 + 1]);
                    }
                    i = i2;
                    obj = obj2;
                    objArr = null;
                }
                i = i2;
                objArr = objArr2;
                obj = obj2;
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
                i = i2;
                objArr = objArr2;
                obj = obj2;
            } else if (this.j != null) {
                this.j.a(jVar, pVar, obj2, g);
                i = i2;
                objArr = objArr2;
                obj = obj2;
            } else {
                a(jVar, pVar, obj2, g);
                i = i2;
                objArr = objArr2;
                obj = obj2;
            }
            jVar.b();
            obj2 = obj;
            objArr2 = objArr;
            i2 = i;
        }
        if (obj2 == null) {
            if (c) {
                m = this.d.a((String) null);
            } else {
                m = this.d.m();
            }
            if (objArr2 != null) {
                for (int i5 = 0; i5 < i2; i5 += 2) {
                    ((com.flurry.a.b.a.d.b.k) objArr2[i5]).a(m, objArr2[i5 + 1]);
                }
                return m;
            }
            return m;
        }
        return obj2;
    }
}
