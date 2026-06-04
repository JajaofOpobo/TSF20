package com.flurry.a.b.a.d.e;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends a {
    private static final j[] l = new j[0];
    protected final Class a;
    protected final List b;
    protected final com.flurry.a.b.a.d.b c;
    protected final com.flurry.a.b.a.d.j d;
    protected final Class e;
    protected j f;
    protected c g;
    protected List h;
    protected List i;
    protected g j;
    protected List k;

    @Override // com.flurry.a.b.a.d.e.a
    public final /* bridge */ /* synthetic */ AnnotatedElement a() {
        return this.a;
    }

    private b(Class cls, List list, com.flurry.a.b.a.d.b bVar, com.flurry.a.b.a.d.j jVar) {
        this.a = cls;
        this.b = list;
        this.c = bVar;
        this.d = jVar;
        this.e = this.d == null ? null : this.d.a(this.a);
        this.f = null;
    }

    public static b a(Class cls, com.flurry.a.b.a.d.b bVar, com.flurry.a.b.a.d.j jVar) {
        b bVar2 = new b(cls, com.flurry.a.b.a.d.i.l.a(cls, (Class) null), bVar, jVar);
        bVar2.o();
        return bVar2;
    }

    public static b b(Class cls, com.flurry.a.b.a.d.b bVar, com.flurry.a.b.a.d.j jVar) {
        b bVar2 = new b(cls, Collections.emptyList(), bVar, jVar);
        bVar2.o();
        return bVar2;
    }

    public final Class e() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final String b() {
        return this.a.getName();
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Annotation a(Class cls) {
        if (this.f == null) {
            return null;
        }
        return this.f.a(cls);
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Type c() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.e.a
    public final Class d() {
        return this.a;
    }

    public final com.flurry.a.b.a.d.i.a f() {
        return this.f;
    }

    public final boolean g() {
        return this.f.a() > 0;
    }

    public final c h() {
        return this.g;
    }

    public final List i() {
        return this.h == null ? Collections.emptyList() : this.h;
    }

    public final List j() {
        return this.i == null ? Collections.emptyList() : this.i;
    }

    public final Iterable k() {
        return this.j;
    }

    public final f a(String str, Class[] clsArr) {
        return this.j.a(str, clsArr);
    }

    public final Iterable l() {
        return this.k == null ? Collections.emptyList() : this.k;
    }

    private void o() {
        this.f = new j();
        if (this.c != null) {
            if (this.e != null) {
                a(this.f, this.a, this.e);
            }
            for (Annotation annotation : this.a.getDeclaredAnnotations()) {
                if (this.c.a(annotation)) {
                    this.f.a(annotation);
                }
            }
            for (Class cls : this.b) {
                a(this.f, cls);
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                for (Annotation annotation2 : declaredAnnotations) {
                    if (this.c.a(annotation2)) {
                        this.f.a(annotation2);
                    }
                }
            }
            a(this.f, Object.class);
        }
    }

    public final void m() {
        this.h = null;
        Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterTypes().length == 0) {
                this.g = a((Constructor) constructor, true);
            } else {
                if (this.h == null) {
                    this.h = new ArrayList(Math.max(10, declaredConstructors.length));
                }
                this.h.add(a((Constructor) constructor, false));
            }
        }
        if (this.e != null && (this.g != null || this.h != null)) {
            c(this.e);
        }
        if (this.c != null) {
            if (this.g != null && this.c.a(this.g)) {
                this.g = null;
            }
            if (this.h != null) {
                int size = this.h.size();
                while (true) {
                    int i = size - 1;
                    if (i < 0) {
                        break;
                    }
                    if (this.c.a((c) this.h.get(i))) {
                        this.h.remove(i);
                        size = i;
                    } else {
                        size = i;
                    }
                }
            }
        }
        this.i = null;
        for (Method method : this.a.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length > 0) {
                if (this.i == null) {
                    this.i = new ArrayList(8);
                }
                this.i.add(this.c == null ? new f(method, new j(), a(method.getParameterTypes().length)) : new f(method, a(method.getDeclaredAnnotations()), a(method.getParameterAnnotations())));
            }
        }
        if (this.e != null && this.i != null) {
            d(this.e);
        }
        if (this.c != null && this.i != null) {
            int size2 = this.i.size();
            while (true) {
                int i2 = size2 - 1;
                if (i2 >= 0) {
                    if (this.c.a((f) this.i.get(i2))) {
                        this.i.remove(i2);
                        size2 = i2;
                    } else {
                        size2 = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void a(s sVar) {
        Class a;
        this.j = new g();
        g gVar = new g();
        a(this.a, sVar, this.j, this.e, gVar);
        for (Class cls : this.b) {
            a(cls, sVar, this.j, this.d == null ? null : this.d.a(cls), gVar);
        }
        if (this.d != null && (a = this.d.a(Object.class)) != null) {
            a(sVar, this.j, a, gVar);
        }
        if (this.c != null && !gVar.a()) {
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    Method declaredMethod = Object.class.getDeclaredMethod(fVar.b(), fVar.m());
                    if (declaredMethod != null) {
                        f a2 = a(declaredMethod);
                        a(fVar.e(), a2, false);
                        this.j.a(a2);
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    public final void n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap, this.a);
        if (linkedHashMap.isEmpty()) {
            this.k = Collections.emptyList();
        } else {
            this.k = new ArrayList(linkedHashMap.size());
            this.k.addAll(linkedHashMap.values());
        }
    }

    private void a(j jVar, Class cls) {
        if (this.d != null) {
            a(jVar, cls, this.d.a(cls));
        }
    }

    private void a(j jVar, Class cls, Class cls2) {
        if (cls2 != null) {
            for (Annotation annotation : cls2.getDeclaredAnnotations()) {
                if (this.c.a(annotation)) {
                    jVar.a(annotation);
                }
            }
            Iterator it = com.flurry.a.b.a.d.i.l.a(cls2, cls).iterator();
            while (it.hasNext()) {
                for (Annotation annotation2 : ((Class) it.next()).getDeclaredAnnotations()) {
                    if (this.c.a(annotation2)) {
                        jVar.a(annotation2);
                    }
                }
            }
        }
    }

    private void c(Class cls) {
        r[] rVarArr;
        int size = this.h == null ? 0 : this.h.size();
        r[] rVarArr2 = null;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == 0) {
                if (this.g != null) {
                    a((Constructor) constructor, this.g, false);
                }
            } else {
                if (rVarArr2 == null) {
                    rVarArr = new r[size];
                    for (int i = 0; i < size; i++) {
                        rVarArr[i] = new r(((c) this.h.get(i)).e());
                    }
                } else {
                    rVarArr = rVarArr2;
                }
                r rVar = new r(constructor);
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (!rVar.equals(rVarArr[i2])) {
                            i2++;
                        } else {
                            a((Constructor) constructor, (c) this.h.get(i2), true);
                            rVarArr2 = rVarArr;
                            break;
                        }
                    } else {
                        rVarArr2 = rVarArr;
                        break;
                    }
                }
            }
        }
    }

    private void d(Class cls) {
        r[] rVarArr;
        r[] rVarArr2 = null;
        int size = this.i.size();
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length != 0) {
                if (rVarArr2 == null) {
                    rVarArr = new r[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        rVarArr[i2] = new r(((f) this.i.get(i2)).e());
                    }
                } else {
                    rVarArr = rVarArr2;
                }
                r rVar = new r(method);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (!rVar.equals(rVarArr[i3])) {
                        i3++;
                    } else {
                        a(method, (f) this.i.get(i3), true);
                        break;
                    }
                }
            } else {
                rVarArr = rVarArr2;
            }
            i++;
            rVarArr2 = rVarArr;
        }
    }

    private void a(Class cls, s sVar, g gVar, Class cls2, g gVar2) {
        if (cls2 != null) {
            a(sVar, gVar, cls2, gVar2);
        }
        if (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (a(method, sVar)) {
                    f b = gVar.b(method);
                    if (b == null) {
                        f a = a(method);
                        gVar.a(a);
                        f a2 = gVar2.a(method);
                        if (a2 != null) {
                            a(a2.e(), a, false);
                        }
                    } else {
                        a(method, b);
                        if (b.i().isInterface() && !method.getDeclaringClass().isInterface()) {
                            gVar.a(b.a(method));
                        }
                    }
                }
            }
        }
    }

    private void a(s sVar, g gVar, Class cls, g gVar2) {
        for (Method method : cls.getDeclaredMethods()) {
            if (a(method, sVar)) {
                f b = gVar.b(method);
                if (b != null) {
                    a(method, b);
                } else {
                    gVar2.a(a(method));
                }
            }
        }
    }

    private void a(Map map, Class cls) {
        Class a;
        d dVar;
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            a(map, superclass);
            for (Field field : cls.getDeclaredFields()) {
                if (a(field)) {
                    map.put(field.getName(), this.c == null ? new d(field, new j()) : new d(field, a(field.getDeclaredAnnotations())));
                }
            }
            if (this.d != null && (a = this.d.a(cls)) != null) {
                for (Field field2 : a.getDeclaredFields()) {
                    if (a(field2) && (dVar = (d) map.get(field2.getName())) != null) {
                        Annotation[] declaredAnnotations = field2.getDeclaredAnnotations();
                        for (Annotation annotation : declaredAnnotations) {
                            if (this.c.a(annotation)) {
                                dVar.a(annotation);
                            }
                        }
                    }
                }
            }
        }
    }

    private f a(Method method) {
        return this.c == null ? new f(method, new j(), null) : new f(method, a(method.getDeclaredAnnotations()), null);
    }

    private c a(Constructor constructor, boolean z) {
        j[] a;
        Annotation[][] annotationArr;
        if (this.c == null) {
            return new c(constructor, new j(), a(constructor.getParameterTypes().length));
        }
        if (z) {
            return new c(constructor, a(constructor.getDeclaredAnnotations()), null);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        int length = constructor.getParameterTypes().length;
        if (length != parameterAnnotations.length) {
            Class declaringClass = constructor.getDeclaringClass();
            if (declaringClass.isEnum() && length == parameterAnnotations.length + 2) {
                annotationArr = new Annotation[parameterAnnotations.length + 2][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 2, parameterAnnotations.length);
                a = a(annotationArr);
            } else if (declaringClass.isMemberClass() && length == parameterAnnotations.length + 1) {
                annotationArr = new Annotation[parameterAnnotations.length + 1][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 1, parameterAnnotations.length);
                a = a(annotationArr);
            } else {
                annotationArr = parameterAnnotations;
                a = null;
            }
            if (a == null) {
                throw new IllegalStateException("Internal error: constructor for " + constructor.getDeclaringClass().getName() + " has mismatch: " + length + " parameters; " + annotationArr.length + " sets of annotations");
            }
        } else {
            a = a(parameterAnnotations);
        }
        return new c(constructor, a(constructor.getDeclaredAnnotations()), a);
    }

    private j[] a(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        j[] jVarArr = new j[length];
        for (int i = 0; i < length; i++) {
            jVarArr[i] = a(annotationArr[i]);
        }
        return jVarArr;
    }

    private j a(Annotation[] annotationArr) {
        j jVar = new j();
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (this.c.a(annotation)) {
                    jVar.b(annotation);
                }
            }
        }
        return jVar;
    }

    private static j[] a(int i) {
        if (i == 0) {
            return l;
        }
        j[] jVarArr = new j[i];
        for (int i2 = 0; i2 < i; i2++) {
            jVarArr[i2] = new j();
        }
        return jVarArr;
    }

    private static boolean a(Method method, s sVar) {
        return ((sVar != null && !sVar.a(method)) || method.isSynthetic() || method.isBridge()) ? false : true;
    }

    private static boolean a(Field field) {
        if (field.isSynthetic()) {
            return false;
        }
        int modifiers = field.getModifiers();
        return (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers)) ? false : true;
    }

    private void a(Constructor constructor, c cVar, boolean z) {
        for (Annotation annotation : constructor.getDeclaredAnnotations()) {
            if (this.c.a(annotation)) {
                cVar.a(annotation);
            }
        }
        if (z) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation annotation2 : parameterAnnotations[i]) {
                    cVar.a(i, annotation2);
                }
            }
        }
    }

    private void a(Method method, f fVar, boolean z) {
        for (Annotation annotation : method.getDeclaredAnnotations()) {
            if (this.c.a(annotation)) {
                fVar.a(annotation);
            }
        }
        if (z) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation annotation2 : parameterAnnotations[i]) {
                    fVar.a(i, annotation2);
                }
            }
        }
    }

    private void a(Method method, f fVar) {
        for (Annotation annotation : method.getDeclaredAnnotations()) {
            if (this.c.a(annotation)) {
                fVar.b(annotation);
            }
        }
    }

    public final String toString() {
        return "[AnnotedClass " + this.a.getName() + "]";
    }
}
