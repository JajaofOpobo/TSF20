package com.flurry.a.b.a.d.i;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes.dex */
final class m {
    static final m a = new m();
    private final Field b = a(EnumSet.class, "elementType", Class.class);
    private final Field c = a(EnumMap.class, "elementType", Class.class);

    private m() {
    }

    public final Class a(EnumSet enumSet) {
        if (this.b != null) {
            return (Class) a(enumSet, this.b);
        }
        throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
    }

    public final Class a(EnumMap enumMap) {
        if (this.c != null) {
            return (Class) a(enumMap, this.c);
        }
        throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
    }

    private static Object a(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static Field a(Class cls, String str, Class cls2) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (str.equals(field.getName()) && field.getType() == cls2) {
                break;
            }
            i++;
        }
        if (field == null) {
            int length2 = declaredFields.length;
            int i2 = 0;
            Field field2 = field;
            while (i2 < length2) {
                Field field3 = declaredFields[i2];
                if (field3.getType() != cls2) {
                    field3 = field2;
                } else if (field2 != null) {
                    return null;
                }
                i2++;
                field2 = field3;
            }
            field = field2;
        }
        if (field != null) {
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable th) {
                return field;
            }
        }
        return field;
    }
}
