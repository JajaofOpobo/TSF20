package com.flurry.a.b.a.d.i;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

/* loaded from: classes.dex */
public final class l {
    public static List a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, false);
        return arrayList;
    }

    private static void a(Class cls, Class cls2, Collection collection, boolean z) {
        while (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (collection.contains(cls)) {
                    return;
                } else {
                    collection.add(cls);
                }
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                a(cls3, cls2, collection, true);
            }
            cls = cls.getSuperclass();
            z = true;
        }
    }

    public static String a(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static String b(Class cls) {
        if (cls.getEnclosingMethod() != null) {
            return "local/anonymous";
        }
        return null;
    }

    public static Class c(Class cls) {
        try {
            if (cls.getEnclosingMethod() == null && !Modifier.isStatic(cls.getModifiers())) {
                return cls.getEnclosingClass();
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        } catch (SecurityException e2) {
            return null;
        }
    }

    public static boolean d(Class cls) {
        if (Proxy.isProxyClass(cls)) {
            return true;
        }
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean a(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (parameterTypes == null || parameterTypes.length == 0) && Void.TYPE != method.getReturnType();
    }

    private static Throwable b(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private static void b(Throwable th, String str) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalArgumentException(str, th);
    }

    public static void a(Throwable th) {
        Throwable b = b(th);
        b(b, b.getMessage());
    }

    public static void a(Throwable th, String str) {
        b(b(th), str);
    }

    public static Object a(Class cls, boolean z) {
        Constructor b = b(cls, z);
        if (b == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return b.newInstance(new Object[0]);
        } catch (Exception e) {
            a(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    private static Constructor b(Class cls, boolean z) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                a(declaredConstructor);
                return declaredConstructor;
            }
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException e) {
            return null;
        } catch (Exception e2) {
            a(e2, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Member member) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                throw new IllegalArgumentException("Can not access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e.getMessage());
            }
        }
    }

    public static Class a(EnumSet enumSet) {
        return !enumSet.isEmpty() ? a((Enum) enumSet.iterator().next()) : m.a.a(enumSet);
    }

    public static Class a(EnumMap enumMap) {
        return !enumMap.isEmpty() ? a((Enum) enumMap.keySet().iterator().next()) : m.a.a(enumMap);
    }

    private static Class a(Enum r3) {
        Class<?> cls = r3.getClass();
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }

    public static Class e(Class cls) {
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }
}
