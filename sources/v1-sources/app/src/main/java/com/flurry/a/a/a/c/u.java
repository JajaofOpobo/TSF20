package com.flurry.a.a.a.c;

import java.io.OutputStream;

/* loaded from: classes.dex */
public class u {
    private static final u c = new v((byte) 0);
    protected int a = 2048;
    protected int b = 65536;

    public static u a() {
        return c;
    }

    public u b() {
        this.a = 32;
        return this;
    }

    public final k a(OutputStream outputStream, k kVar) {
        return (kVar == null || !kVar.getClass().equals(l.class)) ? new l(outputStream, this.a) : ((l) kVar).a(outputStream, this.a);
    }

    public static k a(OutputStream outputStream) {
        return new s(outputStream);
    }
}
