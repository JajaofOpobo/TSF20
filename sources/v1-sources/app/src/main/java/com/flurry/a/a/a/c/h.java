package com.flurry.a.a.a.c;

import java.io.EOFException;

/* loaded from: classes.dex */
final class h extends i {
    private byte[] b;
    private int c;
    private int d;
    private boolean e;

    /* synthetic */ h(byte[] bArr, int i) {
        this(bArr, 0, i);
    }

    private h(byte[] bArr, int i, int i2) {
        this.e = false;
        if (bArr.length < 16 || i2 < 16) {
            this.b = new byte[16];
            System.arraycopy(bArr, 0, this.b, 0, i2);
            this.c = 0;
            this.d = i2;
            return;
        }
        this.b = bArr;
        this.c = 0;
        this.d = i2 + 0;
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(int i, f fVar) {
        fVar.b = this.b;
        fVar.d = this.c;
        fVar.c = this.c;
        fVar.e = this.d;
        this.a = new g(fVar, (byte) 0);
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(long j) {
        if (b(j) < j) {
            throw new EOFException();
        }
    }

    @Override // com.flurry.a.a.a.c.i
    protected final long b(long j) {
        this.d = this.a.c();
        this.c = this.a.b();
        long j2 = this.d - this.c;
        if (j2 >= j) {
            this.c = (int) (this.c + j);
            this.a.a(this.c);
            return j;
        }
        this.c = (int) (this.c + j2);
        this.a.a(this.c);
        return j2;
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(byte[] bArr, int i, int i2) {
        if (b(bArr, i, i2) < i2) {
            throw new EOFException();
        }
    }

    @Override // com.flurry.a.a.a.c.i
    protected final int b(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(byte[] bArr, int i, int i2, int i3) {
        if (!this.e) {
            byte[] bArr2 = new byte[i3 + 16];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            this.a.a(bArr2, i3);
            this.e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        this.d = this.a.c();
        this.c = this.a.b();
        if (this.c >= this.d) {
            return -1;
        }
        byte[] d = this.a.d();
        int i = this.c;
        this.c = i + 1;
        int i2 = d[i] & 255;
        this.a.a(this.c);
        return i2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a(this.a.c());
    }
}
