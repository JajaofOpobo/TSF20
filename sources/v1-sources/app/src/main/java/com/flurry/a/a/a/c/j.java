package com.flurry.a.a.a.c;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class j extends i {
    protected boolean b;
    private InputStream c;

    /* synthetic */ j(InputStream inputStream, byte b) {
        this(inputStream);
    }

    private j(InputStream inputStream) {
        this.b = false;
        this.c = inputStream;
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(long j) {
        boolean z = false;
        while (j > 0) {
            long skip = this.c.skip(j);
            if (skip > 0) {
                j -= skip;
            } else if (skip == 0) {
                if (z) {
                    this.b = true;
                    throw new EOFException();
                }
                z = true;
            } else {
                this.b = true;
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0028 -> B:4:0x001e). Please report as a decompilation issue!!! */
    @Override // com.flurry.a.a.a.c.i
    protected final long b(long j) {
        boolean z = false;
        long j2 = j;
        while (true) {
            if (j2 <= 0) {
                break;
            }
            try {
                long skip = this.c.skip(j);
                if (skip <= 0) {
                    if (skip == 0) {
                        if (z) {
                            this.b = true;
                            break;
                        }
                        z = true;
                    } else {
                        this.b = true;
                        break;
                    }
                } else {
                    j2 -= skip;
                }
            } catch (EOFException e) {
                this.b = true;
            }
        }
        return j - j2;
    }

    @Override // com.flurry.a.a.a.c.i
    protected final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.c.read(bArr, i, i2);
            if (read < 0) {
                this.b = true;
                throw new EOFException();
            }
            i2 -= read;
            i += read;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
    
        r3.b = true;
     */
    @Override // com.flurry.a.a.a.c.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final int b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            try {
                int read = this.c.read(bArr, i, i3);
                if (read < 0) {
                    break;
                }
                i3 -= read;
                i += read;
            } catch (EOFException e) {
                this.b = true;
            }
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.c() - this.a.b() == 0) {
            return this.c.read();
        }
        int b = this.a.b();
        int i = this.a.d()[b] & 255;
        this.a.a(b + 1);
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
