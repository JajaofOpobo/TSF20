package com.tsf.extend.base.actstru.model;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Task implements Comparable<Task>, Callable<EventData> {
    public static AtomicInteger c = new AtomicInteger(0);
    private int a = c.getAndIncrement();
    private String b = "";
    private String d = "";
    private int e = hashCode();
    private EventTarget f = new EventTarget();

    protected int b() {
        return this.e;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EventData call() {
        EventData dVarA = a();
        a(dVarA);
        return dVarA;
    }

    protected boolean a(EventData dVar) {
        if (this.f == null || dVar == null) {
            return false;
        }
        dVar.a("" + b());
        dVar.a(this.f);
        return true;
    }

    protected EventData a() {
        return null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Task jVar) {
        if (this.a > jVar.a) {
            return 1;
        }
        return this.a == jVar.a ? 0 : -1;
    }

    public String toString() {
        return String.format("(%s (:desc %s) (:weight %d) (:sec %f))", getClass().getSimpleName() + "@" + hashCode() + "/" + this.d, this.b, Integer.valueOf(this.a));
    }
}
