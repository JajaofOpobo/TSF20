package com.flurry.a.b.a.e;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    protected l() {
    }

    public static e a(boolean z) {
        return z ? e.s() : e.t();
    }

    public static n a() {
        return n.s();
    }

    public static o a(int i) {
        return k.a(i);
    }

    public static o a(long j) {
        return m.a(j);
    }

    public static o a(BigInteger bigInteger) {
        return c.a(bigInteger);
    }

    public static o a(double d) {
        return j.a(d);
    }

    public static o a(BigDecimal bigDecimal) {
        return i.a(bigDecimal);
    }

    public static r a(String str) {
        return r.b(str);
    }

    public static d a(byte[] bArr) {
        return d.a(bArr);
    }

    public final a b() {
        return new a(this);
    }

    public final p c() {
        return new p(this);
    }

    public static q a(Object obj) {
        return new q(obj);
    }
}
