package com.tsf.extend.base.actstru.model;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class j implements Comparable<j>, Callable<d> {
    public static AtomicInteger c = new AtomicInteger(0);
    private int a = c.getAndIncrement();
    private String b = "";
    private String d = "";
    private int e = hashCode();
    private i f = new i();

    protected int b() {
        return this.e;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: c */
    public final d call() {
        d a = a();
        a(a);
        return a;
    }

    protected boolean a(d dVar) {
        if (this.f == null || dVar == null) {
            return false;
        }
        dVar.a("" + b());
        dVar.a(this.f);
        return true;
    }

    protected d a() {
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(j jVar) {
        if (this.a > jVar.a) {
            return 1;
        }
        return this.a == jVar.a ? 0 : -1;
    }

    public String toString() {
        return String.format("(%s (:desc %s) (:weight %d) (:sec %f))", getClass().getSimpleName() + "@" + hashCode() + "/" + this.d, this.b, Integer.valueOf(this.a));
    }
}
