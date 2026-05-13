package com.tsf.extend.base.actstru.model;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.tsf.extend.base.actstru.model.j */
/* loaded from: classes.dex */
public class CallableC1362j implements Comparable<CallableC1362j>, Callable<C1355d> {

    /* renamed from: c */
    public static AtomicInteger f4278c = new AtomicInteger(0);

    /* renamed from: a */
    private int f4279a = f4278c.getAndIncrement();

    /* renamed from: b */
    private String f4280b = "";

    /* renamed from: d */
    private String f4281d = "";

    /* renamed from: e */
    private int f4282e = hashCode();

    /* renamed from: f */
    private C1361i f4283f = new C1361i();

    /* renamed from: b */
    protected int m8888b() {
        return this.f4282e;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: c */
    public final C1355d call() {
        C1355d mo8891a = mo8891a();
        m8890a(mo8891a);
        return mo8891a;
    }

    /* renamed from: a */
    protected boolean m8890a(C1355d c1355d) {
        if (this.f4283f == null || c1355d == null) {
            return false;
        }
        c1355d.m8911a("" + m8888b());
        c1355d.m8912a(this.f4283f);
        return true;
    }

    /* renamed from: a */
    protected C1355d mo8891a() {
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(CallableC1362j callableC1362j) {
        if (this.f4279a > callableC1362j.f4279a) {
            return 1;
        }
        return this.f4279a == callableC1362j.f4279a ? 0 : -1;
    }

    public String toString() {
        return String.format("(%s (:desc %s) (:weight %d) (:sec %f))", getClass().getSimpleName() + "@" + hashCode() + "/" + this.f4281d, this.f4280b, Integer.valueOf(this.f4279a));
    }
}
