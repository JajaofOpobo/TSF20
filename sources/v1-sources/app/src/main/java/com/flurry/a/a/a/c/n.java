package com.flurry.a.a.a.c;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class n extends m {
    private final OutputStream a;

    /* synthetic */ n(OutputStream outputStream, byte b) {
        this(outputStream);
    }

    private n(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // com.flurry.a.a.a.c.m
    protected final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // com.flurry.a.a.a.c.m
    protected final void a() {
        this.a.flush();
    }
}
