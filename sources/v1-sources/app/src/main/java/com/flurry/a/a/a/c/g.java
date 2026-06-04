package com.flurry.a.a.a.c;

/* loaded from: classes.dex */
final class g {
    boolean a;
    private final f b;
    private byte[] c;
    private int d;
    private int e;

    /* synthetic */ g(f fVar, byte b) {
        this(fVar);
    }

    private g(f fVar) {
        this.a = false;
        this.b = fVar;
    }

    final void a() {
        byte[] bArr;
        int i;
        int i2;
        bArr = this.b.b;
        this.c = bArr;
        i = this.b.d;
        this.d = i;
        i2 = this.b.e;
        this.e = i2;
        this.a = true;
    }

    final int b() {
        int i;
        if (!this.a) {
            i = this.b.d;
            return i;
        }
        return this.d;
    }

    final int c() {
        int i;
        if (!this.a) {
            i = this.b.e;
            return i;
        }
        return this.e;
    }

    final byte[] d() {
        byte[] bArr;
        if (!this.a) {
            bArr = this.b.b;
            return bArr;
        }
        return this.c;
    }

    final void a(int i) {
        if (!this.a) {
            this.b.d = i;
        } else {
            this.d = i;
        }
    }

    final void b(int i) {
        if (!this.a) {
            this.b.e = i;
        } else {
            this.e = i;
        }
    }

    final void a(byte[] bArr, int i) {
        if (!this.a) {
            this.b.b = bArr;
            this.b.e = i + 0;
            this.b.d = 0;
            this.b.c = 0;
            return;
        }
        this.c = bArr;
        this.e = i + 0;
        this.d = 0;
    }
}
