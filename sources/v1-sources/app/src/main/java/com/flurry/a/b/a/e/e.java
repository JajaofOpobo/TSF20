package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class e extends s {
    public static final e c = new e();
    public static final e d = new e();

    private e() {
    }

    public static e s() {
        return c;
    }

    public static e t() {
        return d;
    }

    @Override // com.flurry.a.b.a.h
    public final boolean f() {
        return true;
    }

    @Override // com.flurry.a.b.a.h
    public final boolean i() {
        return this == c;
    }

    @Override // com.flurry.a.b.a.h
    public final String m() {
        return this == c ? "true" : "false";
    }

    @Override // com.flurry.a.b.a.h
    public final double n() {
        return this == c ? 1.0d : 0.0d;
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.a(this == c);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        return obj == this;
    }
}
