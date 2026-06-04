package com.flurry.a.b.a.d.f.a;

import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class j extends p {
    public j(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.h.k kVar) {
        super(aVar, kVar);
    }

    @Override // com.flurry.a.b.a.d.f.c
    public String a(Object obj) {
        return b(obj, obj.getClass());
    }

    @Override // com.flurry.a.b.a.d.f.c
    public final String a(Object obj, Class cls) {
        return b(obj, cls);
    }

    @Override // com.flurry.a.b.a.d.f.c
    public com.flurry.a.b.a.g.a a(String str) {
        if (str.indexOf(60) > 0) {
            return com.flurry.a.b.a.d.h.k.a(str);
        }
        try {
            return this.c.a(this.d, Class.forName(str, true, Thread.currentThread().getContextClassLoader()));
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid type id '" + str + "' (for id type 'Id.class'): no such class found");
        } catch (Exception e2) {
            throw new IllegalArgumentException("Invalid type id '" + str + "' (for id type 'Id.class'): " + e2.getMessage(), e2);
        }
    }

    private String b(Object obj, Class cls) {
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util")) {
            if (obj instanceof EnumSet) {
                return com.flurry.a.b.a.d.h.k.a().a(EnumSet.class, com.flurry.a.b.a.d.i.l.a((EnumSet) obj)).m();
            }
            if (obj instanceof EnumMap) {
                return com.flurry.a.b.a.d.h.k.a().a(EnumMap.class, com.flurry.a.b.a.d.i.l.a((EnumMap) obj), Object.class).m();
            }
            String substring = name.substring(9);
            if ((substring.startsWith(".Arrays$") || substring.startsWith(".Collections$")) && name.indexOf("List") >= 0) {
                return "java.util.ArrayList";
            }
            return name;
        }
        if (name.indexOf(36) >= 0 && com.flurry.a.b.a.d.i.l.c(cls) != null && com.flurry.a.b.a.d.i.l.c(this.d.p()) == null) {
            return this.d.p().getName();
        }
        return name;
    }
}
