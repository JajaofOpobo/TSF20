package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
public abstract class i extends e {
    protected final j[] d;

    public abstract Object a(Object obj);

    public abstract Object a(Object[] objArr);

    public abstract Type a(int i);

    public abstract Object h();

    protected i(j jVar, j[] jVarArr) {
        super(jVar);
        this.d = jVarArr;
    }

    public final void a(Annotation annotation) {
        this.b.b(annotation);
    }

    public final void a(int i, Annotation annotation) {
        j jVar = this.d[i];
        if (jVar == null) {
            jVar = new j();
            this.d[i] = jVar;
        }
        jVar.b(annotation);
    }

    public final void b(Annotation annotation) {
        this.b.a(annotation);
    }

    protected final h a(int i, j jVar) {
        this.d[i] = jVar;
        return b(i);
    }

    protected final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.h.j jVar, TypeVariable[] typeVariableArr) {
        if (typeVariableArr != null && typeVariableArr.length > 0) {
            jVar = jVar.a();
            for (TypeVariable typeVariable : typeVariableArr) {
                jVar.b(typeVariable.getName());
                Type type = typeVariable.getBounds()[0];
                jVar.a(typeVariable.getName(), type == null ? com.flurry.a.b.a.d.h.k.b() : jVar.a(type));
            }
        }
        return jVar.a(c());
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Annotation a(Class cls) {
        return this.b.a(cls);
    }

    public final h b(int i) {
        return new h(this, a(i), this.d[i], i);
    }
}
