package com.flurry.a.b.a.d.h;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {
    protected final k b;
    protected final com.flurry.a.b.a.g.a c;
    protected final Class d;
    protected Map e;
    protected HashSet f;
    private final j h;
    private static final com.flurry.a.b.a.g.a[] g = new com.flurry.a.b.a.g.a[0];
    public static final com.flurry.a.b.a.g.a a = new h(Object.class);

    public j(k kVar, Class cls) {
        this(kVar, null, cls, null);
    }

    public j(k kVar, com.flurry.a.b.a.g.a aVar) {
        this(kVar, null, aVar.p(), aVar);
    }

    public final j a() {
        return new j(this.b, this, this.d, this.c);
    }

    private j(k kVar, j jVar, Class cls, com.flurry.a.b.a.g.a aVar) {
        this.b = kVar;
        this.h = jVar;
        this.d = cls;
        this.c = aVar;
    }

    public final com.flurry.a.b.a.g.a a(Type type) {
        return this.b.b(type, this);
    }

    public final com.flurry.a.b.a.g.a a(String str) {
        String str2;
        while (true) {
            if (this.e == null) {
                this.c();
            }
            com.flurry.a.b.a.g.a aVar = (com.flurry.a.b.a.g.a) this.e.get(str);
            if (aVar == null) {
                if (this.f != null && this.f.contains(str)) {
                    return a;
                }
                if (this.h != null) {
                    this = this.h;
                } else {
                    if (this.d != null && this.d.getEnclosingClass() != null && !Modifier.isStatic(this.d.getModifiers())) {
                        return a;
                    }
                    if (this.d != null) {
                        str2 = this.d.getName();
                    } else if (this.c != null) {
                        str2 = this.c.toString();
                    } else {
                        str2 = "UNKNOWN";
                    }
                    throw new IllegalArgumentException("Type variable '" + str + "' can not be resolved (with context of class " + str2 + ")");
                }
            } else {
                return aVar;
            }
        }
    }

    public final void a(String str, com.flurry.a.b.a.g.a aVar) {
        if (this.e == null || this.e.size() == 0) {
            this.e = new LinkedHashMap();
        }
        this.e.put(str, aVar);
    }

    public final com.flurry.a.b.a.g.a[] b() {
        if (this.e == null) {
            c();
        }
        return this.e.size() == 0 ? g : (com.flurry.a.b.a.g.a[]) this.e.values().toArray(new com.flurry.a.b.a.g.a[this.e.size()]);
    }

    private void c() {
        int h;
        b(this.d);
        if (this.c != null && (h = this.c.h()) > 0) {
            if (this.e == null) {
                this.e = new LinkedHashMap();
            }
            for (int i = 0; i < h; i++) {
                this.e.put(this.c.a(i), this.c.b(i));
            }
        }
        if (this.e == null) {
            this.e = Collections.emptyMap();
        }
    }

    public final void b(String str) {
        if (this.f == null) {
            this.f = new HashSet();
        }
        this.f.add(str);
    }

    private void b(Type type) {
        Class cls;
        if (type != null) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                    Class cls2 = (Class) parameterizedType.getRawType();
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    if (typeParameters.length != actualTypeArguments.length) {
                        throw new IllegalArgumentException("Strange parametrized type (in class " + cls2.getName() + "): number of type arguments != number of type parameters (" + actualTypeArguments.length + " vs " + typeParameters.length + ")");
                    }
                    int length = actualTypeArguments.length;
                    for (int i = 0; i < length; i++) {
                        String name = typeParameters[i].getName();
                        if (this.e == null) {
                            this.e = new LinkedHashMap();
                        } else if (this.e.containsKey(name)) {
                        }
                        b(name);
                        this.e.put(name, this.b.b(actualTypeArguments[i], this));
                    }
                }
                cls = (Class) parameterizedType.getRawType();
            } else if (type instanceof Class) {
                Class cls3 = (Class) type;
                b(cls3.getDeclaringClass());
                TypeVariable[] typeParameters2 = cls3.getTypeParameters();
                if (typeParameters2 != null && typeParameters2.length > 0) {
                    com.flurry.a.b.a.g.a[] aVarArr = null;
                    if (this.c != null && cls3.isAssignableFrom(this.c.p())) {
                        aVarArr = this.b.b(this.c, cls3);
                    }
                    for (int i2 = 0; i2 < typeParameters2.length; i2++) {
                        TypeVariable typeVariable = typeParameters2[i2];
                        String name2 = typeVariable.getName();
                        Type type2 = typeVariable.getBounds()[0];
                        if (type2 != null) {
                            if (this.e == null) {
                                this.e = new LinkedHashMap();
                            } else if (this.e.containsKey(name2)) {
                            }
                            b(name2);
                            if (aVarArr != null) {
                                this.e.put(name2, aVarArr[i2]);
                            } else {
                                this.e.put(name2, this.b.b(type2, this));
                            }
                        }
                    }
                }
                cls = cls3;
            } else {
                return;
            }
            b(cls.getGenericSuperclass());
            for (Type type3 : cls.getGenericInterfaces()) {
                b(type3);
            }
        }
    }

    public final String toString() {
        if (this.e == null) {
            c();
        }
        StringBuilder sb = new StringBuilder("[TypeBindings for ");
        if (this.c != null) {
            sb.append(this.c.toString());
        } else {
            sb.append(this.d.getName());
        }
        sb.append(": ").append(this.e).append("]");
        return sb.toString();
    }
}
