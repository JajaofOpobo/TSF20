package com.flurry.a.b.a.d.g.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class m extends v implements com.flurry.a.b.a.d.ar {
    protected final Method a;
    protected com.flurry.a.b.a.d.ac b;
    protected final com.flurry.a.b.a.d.f c;
    protected boolean d;

    public m(Method method, com.flurry.a.b.a.d.ac acVar, com.flurry.a.b.a.d.f fVar) {
        super(Object.class);
        this.a = method;
        this.b = acVar;
        this.c = fVar;
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        try {
            Object invoke = this.a.invoke(obj, new Object[0]);
            if (invoke == null) {
                awVar.a(eVar);
                return;
            }
            com.flurry.a.b.a.d.ac acVar = this.b;
            if (acVar == null) {
                acVar = awVar.b(invoke.getClass(), this.c);
            }
            acVar.a(invoke, eVar, awVar);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw com.flurry.a.b.a.d.y.a(e, obj, this.a.getName() + "()");
        }
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        try {
            Object invoke = this.a.invoke(obj, new Object[0]);
            if (invoke == null) {
                awVar.a(eVar);
                return;
            }
            com.flurry.a.b.a.d.ac acVar = this.b;
            if (acVar != null) {
                if (this.d) {
                    azVar.a(obj, eVar);
                }
                acVar.a(invoke, eVar, awVar, azVar);
                if (this.d) {
                    azVar.d(obj, eVar);
                    return;
                }
                return;
            }
            awVar.b(invoke.getClass(), this.c).a(invoke, eVar, awVar);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw com.flurry.a.b.a.d.y.a(e, obj, this.a.getName() + "()");
        }
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        boolean z;
        if (this.b == null) {
            if (awVar.a(com.flurry.a.b.a.d.at.USE_STATIC_TYPING) || Modifier.isFinal(this.a.getReturnType().getModifiers())) {
                com.flurry.a.b.a.g.a a = awVar.a(this.a.getGenericReturnType());
                this.b = awVar.b(a, this.c);
                com.flurry.a.b.a.d.ac acVar = this.b;
                Class p = a.p();
                if (!a.t() ? p == String.class || p == Integer.class || p == Boolean.class || p == Double.class : p == Integer.TYPE || p == Boolean.TYPE || p == Double.TYPE) {
                    if (acVar.getClass().getAnnotation(com.flurry.a.b.a.d.a.b.class) != null) {
                        z = true;
                        this.d = z;
                    }
                }
                z = false;
                this.d = z;
            }
        }
    }

    public final String toString() {
        return "(@JsonValue serializer for method " + this.a.getDeclaringClass() + "#" + this.a.getName() + ")";
    }
}
