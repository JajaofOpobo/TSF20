package com.flurry.a.b.a.d;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class p {
    protected final n a;
    protected final int b;

    public abstract y a(com.flurry.a.b.a.g.a aVar, String str);

    public abstract y a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.o oVar, String str);

    public abstract y a(Class cls, com.flurry.a.b.a.o oVar);

    public abstract y a(Class cls, String str);

    public abstract y a(Class cls, String str, String str2);

    public abstract y a(Class cls, Throwable th);

    public abstract y a(Object obj, String str);

    public abstract Object a(Object obj);

    public abstract Calendar a(Date date);

    public abstract Date a(String str);

    public abstract void a(com.flurry.a.b.a.d.i.t tVar);

    public abstract boolean a(com.flurry.a.b.a.j jVar);

    public abstract y b(Class cls);

    public abstract y b(Class cls, String str);

    public abstract y c(Class cls, String str);

    public abstract com.flurry.a.b.a.j d();

    public abstract com.flurry.a.b.a.d.i.t g();

    public abstract com.flurry.a.b.a.d.i.b h();

    protected p(n nVar) {
        this.a = nVar;
        this.b = nVar.i;
    }

    public final n a() {
        return this.a;
    }

    public s b() {
        return null;
    }

    public final boolean a(o oVar) {
        return (this.b & oVar.b()) != 0;
    }

    public final com.flurry.a.b.a.a c() {
        n nVar = this.a;
        return n.g();
    }

    public final com.flurry.a.b.a.e.l e() {
        return this.a.h();
    }

    public final com.flurry.a.b.a.g.a a(Class cls) {
        return this.a.e(cls);
    }

    public final com.flurry.a.b.a.d.h.k f() {
        return this.a.n();
    }

    public final y b(String str) {
        return y.a(d(), str);
    }
}
