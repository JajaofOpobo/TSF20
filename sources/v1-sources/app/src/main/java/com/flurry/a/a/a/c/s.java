package com.flurry.a.a.a.c;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class s extends k {
    private OutputStream a;
    private final byte[] b = new byte[12];

    s(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException("OutputStream cannot be null!");
        }
        this.a = outputStream;
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(boolean z) {
        this.a.write(z ? 1 : 0);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void c(int i) {
        int i2 = (i << 1) ^ (i >> 31);
        if ((i2 & (-128)) == 0) {
            this.a.write(i2);
        } else if ((i2 & (-16384)) == 0) {
            this.a.write(i2 | 128);
            this.a.write(i2 >>> 7);
        } else {
            this.a.write(this.b, 0, a.a(i, this.b, 0));
        }
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b(long j) {
        long j2 = (j << 1) ^ (j >> 63);
        if (((-2147483648L) & j2) == 0) {
            int i = (int) j2;
            while ((i & (-128)) != 0) {
                this.a.write((byte) ((i | 128) & 255));
                i >>>= 7;
            }
            this.a.write((byte) i);
            return;
        }
        this.a.write(this.b, 0, a.a(j, this.b, 0));
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(float f) {
        a.a(f, this.b, 0);
        this.a.write(this.b, 0, 4);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(double d) {
        byte[] bArr = new byte[8];
        a.a(d, bArr, 0);
        this.a.write(bArr, 0, 8);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // com.flurry.a.a.a.c.k
    protected final void g() {
        this.a.write(0);
    }
}
