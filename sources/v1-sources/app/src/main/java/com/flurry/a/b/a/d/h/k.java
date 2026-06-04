package com.flurry.a.b.a.d.h;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {
    public static final k a = new k();
    private static final com.flurry.a.b.a.g.a[] f = new com.flurry.a.b.a.g.a[0];
    protected e d;
    protected e e;
    protected final m c = new m(this);
    protected final l[] b = null;

    private k() {
    }

    public static k a() {
        return a;
    }

    public static com.flurry.a.b.a.g.a b() {
        k kVar = a;
        return c();
    }

    public static com.flurry.a.b.a.g.a a(String str) {
        return a.b(str);
    }

    public final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.g.a aVar, Class cls) {
        if (!(aVar instanceof h) || (!cls.isArray() && !Map.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls))) {
            return aVar.f(cls);
        }
        if (!aVar.p().isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Class " + cls.getClass().getName() + " not subtype of " + aVar);
        }
        new j(this, aVar.p());
        com.flurry.a.b.a.g.a b = b(cls);
        Object n = aVar.n();
        if (n != null) {
            b = b.a(n);
        }
        Object o = aVar.o();
        if (o != null) {
            return b.c(o);
        }
        return b;
    }

    public final com.flurry.a.b.a.g.a b(String str) {
        return this.c.a(str);
    }

    public final com.flurry.a.b.a.g.a[] b(com.flurry.a.b.a.g.a aVar, Class cls) {
        Class p = aVar.p();
        if (p == cls) {
            int h = aVar.h();
            if (h == 0) {
                return null;
            }
            com.flurry.a.b.a.g.a[] aVarArr = new com.flurry.a.b.a.g.a[h];
            for (int i = 0; i < h; i++) {
                aVarArr[i] = aVar.b(i);
            }
            return aVarArr;
        }
        return a(p, cls, new j(this, aVar));
    }

    private com.flurry.a.b.a.g.a[] b(Class cls, Class cls2) {
        return a(cls, cls2, new j(this, cls));
    }

    private com.flurry.a.b.a.g.a[] a(Class cls, Class cls2, j jVar) {
        e b = cls2.isInterface() ? b((Type) cls, cls2) : a((Type) cls, cls2);
        if (b == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " is not a subtype of " + cls2.getName());
        }
        while (b.b() != null) {
            e b2 = b.b();
            Class e = b2.e();
            j jVar2 = new j(this, e);
            if (b2.c()) {
                Type[] actualTypeArguments = b2.d().getActualTypeArguments();
                TypeVariable[] typeParameters = e.getTypeParameters();
                int length = actualTypeArguments.length;
                for (int i = 0; i < length; i++) {
                    jVar2.a(typeParameters[i].getName(), a.b(actualTypeArguments[i], jVar));
                }
            }
            jVar = jVar2;
            b = b2;
        }
        if (b.c()) {
            return jVar.b();
        }
        return null;
    }

    public final com.flurry.a.b.a.g.a a(Type type) {
        return b(type, (j) null);
    }

    public final com.flurry.a.b.a.g.a a(Type type, j jVar) {
        return b(type, jVar);
    }

    public final com.flurry.a.b.a.g.a b(Type type, j jVar) {
        com.flurry.a.b.a.g.a b;
        com.flurry.a.b.a.g.a[] aVarArr;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (jVar == null) {
                new j(this, cls);
            }
            b = b(cls);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls2 = (Class) parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                aVarArr = f;
            } else {
                aVarArr = new com.flurry.a.b.a.g.a[length];
                for (int i = 0; i < length; i++) {
                    aVarArr[i] = b(actualTypeArguments[i], jVar);
                }
            }
            if (Map.class.isAssignableFrom(cls2)) {
                com.flurry.a.b.a.g.a[] b2 = b(a(cls2, aVarArr), Map.class);
                if (b2.length != 2) {
                    throw new IllegalArgumentException("Could not find 2 type parameters for Map class " + cls2.getName() + " (found " + b2.length + ")");
                }
                b = g.a(cls2, b2[0], b2[1]);
            } else if (Collection.class.isAssignableFrom(cls2)) {
                com.flurry.a.b.a.g.a[] b3 = b(a(cls2, aVarArr), Collection.class);
                if (b3.length != 1) {
                    throw new IllegalArgumentException("Could not find 1 type parameter for Collection class " + cls2.getName() + " (found " + b3.length + ")");
                }
                b = d.a(cls2, b3[0]);
            } else {
                b = length == 0 ? new h(cls2) : a(cls2, aVarArr);
            }
        } else if (type instanceof GenericArrayType) {
            b = a.a(b(((GenericArrayType) type).getGenericComponentType(), jVar));
        } else if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            if (jVar == null) {
                b = c();
            } else {
                String name = typeVariable.getName();
                b = jVar.a(name);
                if (b == null) {
                    Type[] bounds = typeVariable.getBounds();
                    jVar.b(name);
                    b = b(bounds[0], jVar);
                }
            }
        } else if (type instanceof WildcardType) {
            b = b(((WildcardType) type).getUpperBounds()[0], jVar);
        } else {
            throw new IllegalArgumentException("Unrecognized Type: " + type.toString());
        }
        if (this.b != null && !b.f()) {
            l[] lVarArr = this.b;
            int length2 = lVarArr.length;
            int i2 = 0;
            while (i2 < length2) {
                com.flurry.a.b.a.g.a a2 = lVarArr[i2].a();
                i2++;
                b = a2;
            }
        }
        return b;
    }

    public final d a(Class cls, Class cls2) {
        return d.a(cls, b(cls2, (j) null));
    }

    public final g a(Class cls, Class cls2, Class cls3) {
        return g.a(cls, b(cls2, (j) null), b(cls3, (j) null));
    }

    private static com.flurry.a.b.a.g.a a(Class cls, com.flurry.a.b.a.g.a[] aVarArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters.length != aVarArr.length) {
            throw new IllegalArgumentException("Parameter type mismatch for " + cls.getName() + ": expected " + typeParameters.length + " parameters, was given " + aVarArr.length);
        }
        String[] strArr = new String[typeParameters.length];
        int length = typeParameters.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        return new h(cls, strArr, aVarArr, null, null);
    }

    public static com.flurry.a.b.a.g.a a(Class cls) {
        return new h(cls);
    }

    protected final com.flurry.a.b.a.g.a b(Class cls) {
        if (cls.isArray()) {
            return a.a(b(cls.getComponentType(), (j) null));
        }
        if (cls.isEnum()) {
            return new h(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return c(cls);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return d(cls);
        }
        return new h(cls);
    }

    protected final com.flurry.a.b.a.g.a a(Class cls, List list) {
        if (cls.isArray()) {
            return a.a(b(cls.getComponentType(), (j) null));
        }
        if (cls.isEnum()) {
            return new h(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            if (list.size() > 0) {
                return g.a(cls, (com.flurry.a.b.a.g.a) list.get(0), list.size() >= 2 ? (com.flurry.a.b.a.g.a) list.get(1) : c());
            }
            return c(cls);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (list.size() > 0) {
                return d.a(cls, (com.flurry.a.b.a.g.a) list.get(0));
            }
            return d(cls);
        }
        if (list.size() == 0) {
            return new h(cls);
        }
        return a(cls, (com.flurry.a.b.a.g.a[]) list.toArray(new com.flurry.a.b.a.g.a[list.size()]));
    }

    private com.flurry.a.b.a.g.a c(Class cls) {
        com.flurry.a.b.a.g.a[] b = b(cls, Map.class);
        if (b == null) {
            return g.a(cls, c(), c());
        }
        if (b.length != 2) {
            throw new IllegalArgumentException("Strange Map type " + cls.getName() + ": can not determine type parameters");
        }
        return g.a(cls, b[0], b[1]);
    }

    private com.flurry.a.b.a.g.a d(Class cls) {
        com.flurry.a.b.a.g.a[] b = b(cls, Collection.class);
        if (b == null) {
            return d.a(cls, c());
        }
        if (b.length != 1) {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": can not determine type parameters");
        }
        return d.a(cls, b[0]);
    }

    private static com.flurry.a.b.a.g.a c() {
        return new h(Object.class);
    }

    private e a(Type type, Class cls) {
        e a2;
        e eVar = new e(type);
        Class e = eVar.e();
        if (e != cls) {
            Type genericSuperclass = e.getGenericSuperclass();
            if (genericSuperclass != null && (a2 = a(genericSuperclass, cls)) != null) {
                a2.b(eVar);
                eVar.a(a2);
                return eVar;
            }
            return null;
        }
        return eVar;
    }

    private e b(Type type, Class cls) {
        e eVar = new e(type);
        Class e = eVar.e();
        if (e == cls) {
            return new e(type);
        }
        if (e == HashMap.class && cls == Map.class) {
            return a(eVar);
        }
        if (e == ArrayList.class && cls == List.class) {
            return b(eVar);
        }
        return a(eVar, cls);
    }

    private e a(e eVar, Class cls) {
        e b;
        Class e = eVar.e();
        Type[] genericInterfaces = e.getGenericInterfaces();
        if (genericInterfaces != null) {
            for (Type type : genericInterfaces) {
                e b2 = b(type, cls);
                if (b2 != null) {
                    b2.b(eVar);
                    eVar.a(b2);
                    return eVar;
                }
            }
        }
        Type genericSuperclass = e.getGenericSuperclass();
        if (genericSuperclass != null && (b = b(genericSuperclass, cls)) != null) {
            b.b(eVar);
            eVar.a(b);
            return eVar;
        }
        return null;
    }

    private synchronized e a(e eVar) {
        if (this.d == null) {
            e a2 = eVar.a();
            a(a2, Map.class);
            this.d = a2.b();
        }
        e a3 = this.d.a();
        eVar.a(a3);
        a3.b(eVar);
        return eVar;
    }

    private synchronized e b(e eVar) {
        if (this.e == null) {
            e a2 = eVar.a();
            a(a2, List.class);
            this.e = a2.b();
        }
        e a3 = this.e.a();
        eVar.a(a3);
        a3.b(eVar);
        return eVar;
    }
}
