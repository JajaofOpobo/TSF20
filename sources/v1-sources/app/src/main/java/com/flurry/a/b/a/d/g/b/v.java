package com.flurry.a.b.a.d.g.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class v extends com.flurry.a.b.a.d.ac {
    protected final Class k;

    @Override // com.flurry.a.b.a.d.ac
    public abstract void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar);

    protected v(Class cls) {
        this.k = cls;
    }

    protected v(com.flurry.a.b.a.g.a aVar) {
        this.k = aVar.p();
    }

    protected v(Class cls, byte b) {
        this.k = cls;
    }

    @Override // com.flurry.a.b.a.d.ac
    public final Class c() {
        return this.k;
    }

    protected static boolean a(com.flurry.a.b.a.d.ac acVar) {
        return (acVar == null || acVar.getClass().getAnnotation(com.flurry.a.b.a.d.a.b.class) == null) ? false : true;
    }

    public static void a(com.flurry.a.b.a.d.aw awVar, Throwable th, Object obj, String str) {
        Throwable th2 = th;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        boolean z = awVar == null || awVar.a(com.flurry.a.b.a.d.at.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z || !(th2 instanceof com.flurry.a.b.a.d.y)) {
                throw ((IOException) th2);
            }
        } else if (!z && (th2 instanceof RuntimeException)) {
            throw ((RuntimeException) th2);
        }
        throw com.flurry.a.b.a.d.y.a(th2, obj, str);
    }

    public static void a(com.flurry.a.b.a.d.aw awVar, Throwable th, Object obj, int i) {
        Throwable th2 = th;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        boolean z = awVar == null || awVar.a(com.flurry.a.b.a.d.at.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z || !(th2 instanceof com.flurry.a.b.a.d.y)) {
                throw ((IOException) th2);
            }
        } else if (!z && (th2 instanceof RuntimeException)) {
            throw ((RuntimeException) th2);
        }
        throw com.flurry.a.b.a.d.y.a(th2, obj, i);
    }
}
