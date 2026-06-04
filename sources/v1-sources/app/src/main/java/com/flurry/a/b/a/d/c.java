package com.flurry.a.b.a.d;

/* loaded from: classes.dex */
public final class c {
    private final d a;
    private final String b;

    public c(d dVar, String str) {
        this.a = dVar;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a == d.MANAGED_REFERENCE;
    }

    public final boolean c() {
        return this.a == d.BACK_REFERENCE;
    }
}
