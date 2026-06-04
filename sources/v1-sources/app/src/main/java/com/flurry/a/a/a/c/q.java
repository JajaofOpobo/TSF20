package com.flurry.a.a.a.c;

import java.io.InputStream;

/* loaded from: classes.dex */
public class q {
    private static final q b = new r((byte) 0);
    int a = 8192;

    public static q a() {
        return b;
    }

    public final f a(InputStream inputStream) {
        return new f(inputStream, this.a);
    }

    public static f a(byte[] bArr, f fVar) {
        int length = bArr.length;
        return (fVar == null || !fVar.getClass().equals(f.class)) ? new f(bArr, length) : fVar.a(bArr, length);
    }

    public static x a(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2) {
        return new x(cVar, cVar2);
    }
}
