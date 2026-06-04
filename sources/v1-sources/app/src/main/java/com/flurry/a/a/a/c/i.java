package com.flurry.a.a.a.c;

import java.io.InputStream;

/* loaded from: classes.dex */
abstract class i extends InputStream {
    protected g a;

    protected abstract void a(long j);

    protected abstract void a(byte[] bArr, int i, int i2);

    protected abstract int b(byte[] bArr, int i, int i2);

    protected abstract long b(long j);

    protected i() {
    }

    protected void a(int i, f fVar) {
        fVar.b = new byte[i];
        fVar.d = 0;
        fVar.c = 0;
        fVar.e = 0;
        this.a = new g(fVar, (byte) 0);
    }

    protected final void a() {
        this.a.a();
    }

    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i, bArr, i2, i3);
        this.a.a(i2);
        this.a.b(b(bArr, i2 + i3, bArr.length - i3) + i3);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int c = this.a.c();
        int b = this.a.b();
        byte[] d = this.a.d();
        int i3 = c - b;
        if (i3 >= i2) {
            System.arraycopy(d, b, bArr, i, i2);
            this.a.a(b + i2);
            return i2;
        }
        System.arraycopy(d, b, bArr, i, i3);
        this.a.a(b + i3);
        int b2 = i3 + b(bArr, i + i3, i2 - i3);
        if (b2 == 0) {
            return -1;
        }
        return b2;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int c = this.a.c();
        int b = this.a.b();
        int i = c - b;
        if (i > j) {
            this.a.a((int) (b + j));
            return j;
        }
        this.a.a(c);
        return b(j - i) + i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.c() - this.a.b();
    }
}
