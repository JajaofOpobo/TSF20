package com.flurry.a.a.a.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends p {
    private i a = null;
    private byte[] b = null;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private final com.flurry.a.a.a.e.a f = new com.flurry.a.a.a.e.a();

    final g a() {
        return new g(this, (byte) 0);
    }

    protected f() {
    }

    f(InputStream inputStream, int i) {
        a(i, new j(inputStream, (byte) 0));
    }

    f(byte[] bArr, int i) {
        a(bArr, i);
    }

    final f a(byte[] bArr, int i) {
        a(8192, new h(bArr, i));
        return this;
    }

    private void a(int i, i iVar) {
        if (this.a != null) {
            this.a.a();
        }
        iVar.a(i, this);
        this.a = iVar;
    }

    @Override // com.flurry.a.a.a.c.p
    public final void b() {
    }

    @Override // com.flurry.a.a.a.c.p
    public final boolean c() {
        if (this.e == this.d) {
            this.e = this.a.b(this.b, 0, this.b.length);
            this.d = 0;
            if (this.e == 0) {
                throw new EOFException();
            }
        }
        byte[] bArr = this.b;
        int i = this.d;
        this.d = i + 1;
        return (bArr[i] & 255) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // com.flurry.a.a.a.c.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d() {
        int i = 5;
        b(5);
        int i2 = 1;
        int i3 = this.b[this.d] & 255;
        int i4 = i3 & 127;
        if (i3 > 127) {
            i2 = 2;
            int i5 = this.b[this.d + 1] & 255;
            i4 ^= (i5 & 127) << 7;
            if (i5 > 127) {
                i2 = 3;
                int i6 = this.b[this.d + 2] & 255;
                i4 ^= (i6 & 127) << 14;
                if (i6 > 127) {
                    i2 = 4;
                    int i7 = this.b[this.d + 3] & 255;
                    i4 ^= (i7 & 127) << 21;
                    if (i7 > 127) {
                        int i8 = this.b[this.d + 4] & 255;
                        i4 ^= (i8 & 127) << 28;
                        if (i8 > 127) {
                            throw new IOException("Invalid int encoding");
                        }
                        this.d = i + this.d;
                        if (this.d <= this.e) {
                            throw new EOFException();
                        }
                        return (-(i4 & 1)) ^ (i4 >>> 1);
                    }
                }
            }
        }
        i = i2;
        this.d = i + this.d;
        if (this.d <= this.e) {
        }
    }

    @Override // com.flurry.a.a.a.c.p
    public final long e() {
        long j;
        int i;
        b(10);
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        int i3 = bArr[i2] & 255;
        int i4 = i3 & 127;
        if (i3 > 127) {
            byte[] bArr2 = this.b;
            int i5 = this.d;
            this.d = i5 + 1;
            int i6 = bArr2[i5] & 255;
            int i7 = i4 ^ ((i6 & 127) << 7);
            if (i6 > 127) {
                byte[] bArr3 = this.b;
                int i8 = this.d;
                this.d = i8 + 1;
                int i9 = bArr3[i8] & 255;
                int i10 = i7 ^ ((i9 & 127) << 14);
                if (i9 > 127) {
                    byte[] bArr4 = this.b;
                    int i11 = this.d;
                    this.d = i11 + 1;
                    int i12 = bArr4[i11] & 255;
                    int i13 = i10 ^ ((i12 & 127) << 21);
                    if (i12 > 127) {
                        int i14 = this.b[this.d] & 255;
                        j = i13 ^ ((i14 & 127) << 28);
                        if (i14 > 127) {
                            i = 2;
                            int i15 = this.b[this.d + 1] & 255;
                            j ^= (i15 & 127) << 35;
                            if (i15 > 127) {
                                i = 3;
                                int i16 = this.b[this.d + 2] & 255;
                                j ^= (i16 & 127) << 42;
                                if (i16 > 127) {
                                    i = 4;
                                    int i17 = this.b[this.d + 3] & 255;
                                    j ^= (i17 & 127) << 49;
                                    if (i17 > 127) {
                                        i = 5;
                                        int i18 = this.b[this.d + 4] & 255;
                                        j ^= (i18 & 127) << 56;
                                        if (i18 > 127) {
                                            i = 6;
                                            int i19 = this.b[this.d + 5] & 255;
                                            j ^= (i19 & 127) << 63;
                                            if (i19 > 127) {
                                                throw new IOException("Invalid long encoding");
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i = 1;
                        }
                        this.d = i + this.d;
                    } else {
                        j = i13;
                    }
                } else {
                    j = i10;
                }
            } else {
                j = i7;
            }
        } else {
            j = i4;
        }
        if (this.d > this.e) {
            throw new EOFException();
        }
        return (-(j & 1)) ^ (j >>> 1);
    }

    @Override // com.flurry.a.a.a.c.p
    public final float f() {
        b(4);
        int i = (this.b[this.d] & 255) | ((this.b[this.d + 1] & 255) << 8) | ((this.b[this.d + 2] & 255) << 16) | ((this.b[this.d + 3] & 255) << 24);
        if (this.d + 4 > this.e) {
            throw new EOFException();
        }
        this.d += 4;
        return Float.intBitsToFloat(i);
    }

    @Override // com.flurry.a.a.a.c.p
    public final double g() {
        b(8);
        int i = (this.b[this.d] & 255) | ((this.b[this.d + 1] & 255) << 8) | ((this.b[this.d + 2] & 255) << 16) | ((this.b[this.d + 3] & 255) << 24);
        int i2 = (this.b[this.d + 4] & 255) | ((this.b[this.d + 5] & 255) << 8) | ((this.b[this.d + 6] & 255) << 16) | ((this.b[this.d + 7] & 255) << 24);
        if (this.d + 8 > this.e) {
            throw new EOFException();
        }
        this.d += 8;
        return Double.longBitsToDouble((i2 << 32) | (i & 4294967295L));
    }

    @Override // com.flurry.a.a.a.c.p
    public final com.flurry.a.a.a.e.a a(com.flurry.a.a.a.e.a aVar) {
        int d = d();
        if (aVar == null) {
            aVar = new com.flurry.a.a.a.e.a();
        }
        aVar.a(d);
        if (d != 0) {
            b(aVar.a(), 0, d);
        }
        return aVar;
    }

    @Override // com.flurry.a.a.a.c.p
    public final String h() {
        return a(this.f).toString();
    }

    @Override // com.flurry.a.a.a.c.p
    public final void i() {
        a(d());
    }

    @Override // com.flurry.a.a.a.c.p
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        int d = d();
        if (byteBuffer != null && d <= byteBuffer.capacity()) {
            byteBuffer.clear();
        } else {
            byteBuffer = ByteBuffer.allocate(d);
        }
        b(byteBuffer.array(), byteBuffer.position(), d);
        byteBuffer.limit(d);
        return byteBuffer;
    }

    @Override // com.flurry.a.a.a.c.p
    public final void j() {
        a(d());
    }

    @Override // com.flurry.a.a.a.c.p
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    @Override // com.flurry.a.a.a.c.p
    public final void a(int i) {
        a(i);
    }

    @Override // com.flurry.a.a.a.c.p
    public final int k() {
        return d();
    }

    private void a(long j) {
        int i = this.e - this.d;
        if (j <= i) {
            this.d = (int) (this.d + j);
            return;
        }
        this.d = 0;
        this.e = 0;
        this.a.a(j - i);
    }

    private void b(byte[] bArr, int i, int i2) {
        int i3 = this.e - this.d;
        if (i2 <= i3) {
            System.arraycopy(this.b, this.d, bArr, i, i2);
            this.d += i2;
        } else {
            System.arraycopy(this.b, this.d, bArr, i, i3);
            this.d = this.e;
            this.a.a(bArr, i + i3, i2 - i3);
        }
    }

    private long s() {
        long e = e();
        if (e < 0) {
            e();
            return -e;
        }
        return e;
    }

    private long t() {
        int d = d();
        while (true) {
            long j = d;
            if (j < 0) {
                a(e());
                d = d();
            } else {
                return j;
            }
        }
    }

    @Override // com.flurry.a.a.a.c.p
    public final long l() {
        return s();
    }

    @Override // com.flurry.a.a.a.c.p
    public final long m() {
        return s();
    }

    @Override // com.flurry.a.a.a.c.p
    public final long n() {
        return t();
    }

    @Override // com.flurry.a.a.a.c.p
    public final long o() {
        return s();
    }

    @Override // com.flurry.a.a.a.c.p
    public final long p() {
        return s();
    }

    @Override // com.flurry.a.a.a.c.p
    public final long q() {
        return t();
    }

    @Override // com.flurry.a.a.a.c.p
    public final int r() {
        return d();
    }

    private void b(int i) {
        int i2 = this.e - this.d;
        if (i2 < i) {
            this.a.a(this.b, this.d, this.c, i2);
        }
    }
}
