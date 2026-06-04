package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements com.flurry.a.b.a.d.f {
    protected final com.flurry.a.b.a.d.e.e a;
    protected final com.flurry.a.b.a.d.i.a b;
    protected final com.flurry.a.b.a.g.a c;
    protected final Method d;
    protected final Field e;
    protected HashMap f;
    protected final com.flurry.a.b.a.c.h g;
    protected final com.flurry.a.b.a.g.a h;
    protected final com.flurry.a.b.a.d.ac i;
    protected com.flurry.a.b.a.d.g.a.d j;
    protected final boolean k;
    protected final Object l;
    protected Class[] m;
    protected az n;
    protected com.flurry.a.b.a.g.a o;

    public d(com.flurry.a.b.a.d.e.e eVar, com.flurry.a.b.a.d.i.a aVar, String str, com.flurry.a.b.a.g.a aVar2, com.flurry.a.b.a.d.ac acVar, az azVar, com.flurry.a.b.a.g.a aVar3, Method method, Field field, boolean z, Object obj) {
        this(eVar, aVar, new com.flurry.a.b.a.c.h(str), aVar2, acVar, azVar, aVar3, method, field, z, obj);
    }

    private d(com.flurry.a.b.a.d.e.e eVar, com.flurry.a.b.a.d.i.a aVar, com.flurry.a.b.a.c.h hVar, com.flurry.a.b.a.g.a aVar2, com.flurry.a.b.a.d.ac acVar, az azVar, com.flurry.a.b.a.g.a aVar3, Method method, Field field, boolean z, Object obj) {
        this.a = eVar;
        this.b = aVar;
        this.g = hVar;
        this.c = aVar2;
        this.i = acVar;
        this.j = acVar == null ? com.flurry.a.b.a.d.g.a.d.a() : null;
        this.n = azVar;
        this.h = aVar3;
        this.d = method;
        this.e = field;
        this.k = z;
        this.l = obj;
    }

    protected d(d dVar) {
        this(dVar, dVar.i);
    }

    protected d(d dVar, com.flurry.a.b.a.d.ac acVar) {
        this.i = acVar;
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.d = dVar.d;
        this.e = dVar.e;
        if (dVar.f != null) {
            this.f = new HashMap(dVar.f);
        }
        this.g = dVar.g;
        this.h = dVar.h;
        this.j = dVar.j;
        this.k = dVar.k;
        this.l = dVar.l;
        this.m = dVar.m;
        this.n = dVar.n;
        this.o = dVar.o;
    }

    public d a(com.flurry.a.b.a.d.ac acVar) {
        if (getClass() != d.class) {
            throw new IllegalStateException("BeanPropertyWriter sub-class does not override 'withSerializer()'; needs to!");
        }
        return new d(this, acVar);
    }

    public final d c() {
        return new com.flurry.a.b.a.d.g.a.o(this);
    }

    public final void a(Class[] clsArr) {
        this.m = clsArr;
    }

    public final void a(com.flurry.a.b.a.g.a aVar) {
        this.o = aVar;
    }

    public final String d() {
        return this.g.a();
    }

    @Override // com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.g.a a() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.d.f
    public final com.flurry.a.b.a.d.e.e b() {
        return this.a;
    }

    public final boolean e() {
        return this.i != null;
    }

    public final com.flurry.a.b.a.g.a f() {
        return this.h;
    }

    public final Type g() {
        return this.d != null ? this.d.getGenericReturnType() : this.e.getGenericType();
    }

    public final Class[] h() {
        return this.m;
    }

    public void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Class<?> cls;
        com.flurry.a.b.a.d.g.a.d dVar;
        Object a = a(obj);
        if (a == null) {
            if (!this.k) {
                eVar.a(this.g);
                awVar.a(eVar);
                return;
            }
            return;
        }
        if (a == obj) {
            i();
        }
        if (this.l == null || !this.l.equals(a)) {
            com.flurry.a.b.a.d.ac acVar = this.i;
            if (acVar == null && (acVar = (dVar = this.j).a((cls = a.getClass()))) == null) {
                acVar = a(dVar, cls, awVar);
            }
            eVar.a(this.g);
            if (this.n == null) {
                acVar.a(a, eVar, awVar);
            } else {
                acVar.a(a, eVar, awVar, this.n);
            }
        }
    }

    protected com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.d.g.a.d dVar, Class cls, aw awVar) {
        com.flurry.a.b.a.d.g.a.h a;
        if (this.o != null) {
            a = dVar.a(awVar.a(this.o, cls), awVar, this);
        } else {
            a = dVar.a(cls, awVar, this);
        }
        if (dVar != a.b) {
            this.j = a.b;
        }
        return a.a;
    }

    public final Object a(Object obj) {
        return this.d != null ? this.d.invoke(obj, new Object[0]) : this.e.get(obj);
    }

    protected static void i() {
        throw new com.flurry.a.b.a.d.y("Direct self-reference leading to cycle");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '").append(this.g.a()).append("' (");
        if (this.d != null) {
            sb.append("via method ").append(this.d.getDeclaringClass().getName()).append("#").append(this.d.getName());
        } else {
            sb.append("field \"").append(this.e.getDeclaringClass().getName()).append("#").append(this.e.getName());
        }
        if (this.i == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this.i.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }
}
