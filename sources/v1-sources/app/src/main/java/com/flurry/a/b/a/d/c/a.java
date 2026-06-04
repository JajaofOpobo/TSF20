package com.flurry.a.b.a.d.c;

import com.flurry.a.b.a.d.y;
import com.flurry.a.b.a.g;
import com.flurry.a.b.a.j;

/* loaded from: classes.dex */
public final class a extends y {
    protected final Class c;
    protected final String d;

    private a(String str, g gVar, Class cls, String str2) {
        super(str, gVar);
        this.c = cls;
        this.d = str2;
    }

    public static a a(j jVar, Object obj, String str) {
        Class<?> cls;
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        a aVar = new a("Unrecognized field \"" + str + "\" (Class " + cls.getName() + "), not marked as ignorable", jVar.i(), cls, str);
        aVar.a(obj, str);
        return aVar;
    }
}
