package com.flurry.a.b.a.d.b.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n extends bw {
    protected abstract Object a(String str);

    protected n(Class cls) {
        super(cls);
    }

    public static Iterable c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w());
        arrayList.add(new v());
        arrayList.add(new u());
        arrayList.add(new p());
        arrayList.add(new s());
        arrayList.add(new r());
        arrayList.add(new q());
        arrayList.add(new t());
        arrayList.add(new o());
        return arrayList;
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            if (trim.length() == 0) {
                return null;
            }
            try {
                Object a = a(trim);
                if (a != null) {
                    return a;
                }
            } catch (IllegalArgumentException e) {
            }
            throw pVar.b(this.q, "not a valid textual representation");
        }
        if (jVar.e() == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            Object z = jVar.z();
            if (z != null) {
                return this.q.isAssignableFrom(z.getClass()) ? z : a(z, pVar);
            }
            return null;
        }
        throw pVar.b(this.q);
    }

    protected Object a(Object obj, com.flurry.a.b.a.d.p pVar) {
        throw pVar.b("Don't know how to convert embedded Object of type " + obj.getClass().getName() + " into " + this.q.getName());
    }
}
