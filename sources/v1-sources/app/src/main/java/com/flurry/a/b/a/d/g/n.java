package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.as;
import com.flurry.a.b.a.d.at;
import com.flurry.a.b.a.d.az;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {
    protected final as a;
    protected final com.flurry.a.b.a.d.e.k b;
    protected final com.flurry.a.b.a.d.a.h c;
    protected final com.flurry.a.b.a.d.b d;
    protected Object e;

    public n(as asVar, com.flurry.a.b.a.d.e.k kVar) {
        this.a = asVar;
        this.b = kVar;
        this.c = kVar.a(asVar.g());
        this.d = this.a.a();
    }

    public final com.flurry.a.b.a.d.i.a a() {
        return this.b.i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final d a(String str, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.ac acVar, az azVar, az azVar2, com.flurry.a.b.a.d.e.e eVar, boolean z) {
        Method e;
        Field field;
        com.flurry.a.b.a.g.a aVar2;
        boolean z2;
        com.flurry.a.b.a.g.a aVar3;
        boolean z3;
        d dVar;
        Boolean b;
        boolean z4;
        Object obj;
        Object pVar;
        com.flurry.a.b.a.d.a.i h;
        if (eVar instanceof com.flurry.a.b.a.d.e.d) {
            e = null;
            field = ((com.flurry.a.b.a.d.e.d) eVar).e();
        } else {
            e = ((com.flurry.a.b.a.d.e.f) eVar).e();
            field = null;
        }
        Class<?> e2 = this.d.e(eVar);
        if (e2 != null) {
            Class<?> p = aVar.p();
            if (e2.isAssignableFrom(p)) {
                aVar2 = aVar.h(e2);
            } else {
                if (!p.isAssignableFrom(e2)) {
                    throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + eVar.b() + "': class " + e2.getName() + " not a super-type of (declared) class " + p.getName());
                }
                aVar2 = this.a.a(aVar, e2);
            }
            z = true;
        } else {
            aVar2 = aVar;
        }
        com.flurry.a.b.a.g.a b2 = g.b(this.a, eVar, aVar2);
        if (b2 != aVar2) {
            z2 = true;
        } else {
            b2 = aVar2;
            z2 = z;
        }
        if (!z2 && (h = this.d.h(eVar)) != null) {
            z2 = h == com.flurry.a.b.a.d.a.i.STATIC;
        }
        com.flurry.a.b.a.g.a aVar4 = z2 ? b2 : null;
        if (azVar2 != null) {
            if (aVar4 == null) {
                aVar4 = aVar;
            }
            if (aVar4.g() == null) {
                throw new IllegalStateException("Problem trying to create BeanPropertyWriter for property '" + str + "' (of type " + this.b.a() + "); serialization type " + aVar4 + " has no content");
            }
            aVar3 = aVar4.b(azVar2);
            aVar3.g();
        } else {
            aVar3 = aVar4;
        }
        Object obj2 = null;
        boolean z5 = false;
        com.flurry.a.b.a.d.a.h a = this.d.a(eVar, this.c);
        if (a != null) {
            switch (o.a[a.ordinal()]) {
                case 1:
                    obj2 = a(str, e, field);
                    if (obj2 == null) {
                        z3 = true;
                        break;
                    } else if (obj2.getClass().isArray()) {
                        z4 = false;
                        obj = com.flurry.a.b.a.d.i.n.a(obj2);
                        obj2 = obj;
                        z3 = z4;
                        break;
                    }
                    break;
                case 2:
                    z3 = true;
                    Class p2 = aVar.p();
                    if (p2 == String.class) {
                        pVar = new s();
                    } else {
                        pVar = aVar.b() ? new p() : Collection.class.isAssignableFrom(p2) ? new q() : Map.class.isAssignableFrom(p2) ? new r() : null;
                    }
                    obj2 = pVar;
                    break;
                case 3:
                    z5 = true;
                    if (aVar.f()) {
                        if (!this.a.a(at.WRITE_EMPTY_JSON_ARRAYS)) {
                            if (aVar.b()) {
                                z4 = z5;
                                obj = new p();
                            } else if (Collection.class.isAssignableFrom(aVar.p())) {
                                z4 = z5;
                                obj = new q();
                            }
                            obj2 = obj;
                            z3 = z4;
                            break;
                        }
                        z4 = z5;
                        obj = null;
                        obj2 = obj;
                        z3 = z4;
                    }
                    break;
                case 4:
                    if (aVar.f()) {
                    }
                    break;
            }
            dVar = new d(eVar, this.b.i(), str, aVar, acVar, azVar, aVar3, e, field, z3, obj2);
            b = this.d.b(eVar);
            if (b == null && b.booleanValue()) {
                return dVar.c();
            }
        }
        z3 = z5;
        dVar = new d(eVar, this.b.i(), str, aVar, acVar, azVar, aVar3, e, field, z3, obj2);
        b = this.d.b(eVar);
        return b == null ? dVar : dVar;
    }

    private Object a(String str, Method method, Field field) {
        Object obj;
        if (this.e == null) {
            this.e = this.b.a(this.a.a(at.CAN_OVERRIDE_ACCESS_MODIFIERS));
            if (this.e == null) {
                throw new IllegalArgumentException("Class " + this.b.c().e().getName() + " has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation");
            }
        }
        Object obj2 = this.e;
        try {
            if (method != null) {
                obj = method.invoke(obj2, new Object[0]);
            } else {
                obj = field.get(obj2);
            }
            return obj;
        } catch (Exception e) {
            return a(e, str, obj2);
        }
    }

    private static Object a(Exception exc, String str, Object obj) {
        Throwable th = exc;
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }
}
