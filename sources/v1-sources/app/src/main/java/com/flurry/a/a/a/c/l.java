package com.flurry.a.a.a.c;

import com.tsf.shell.theme.inside.ThemeDockDescription;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class l extends k {
    private byte[] a;
    private int b;
    private m c;
    private int d;

    l(OutputStream outputStream, int i) {
        a(outputStream, i);
    }

    final l a(OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new NullPointerException("OutputStream cannot be null!");
        }
        if (this.c != null && this.b > 0) {
            try {
                h();
            } catch (IOException e) {
                throw new com.flurry.a.a.a.a("Failure flushing old output", e);
            }
        }
        this.c = new n(outputStream, (byte) 0);
        this.b = 0;
        if (this.a == null || this.a.length != i) {
            this.a = new byte[i];
        }
        this.d = this.a.length >>> 1;
        if (this.d > 512) {
            this.d = ThemeDockDescription.DOCK_MENU_ADD_BUTTON_OFF;
        }
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        h();
        this.c.a();
    }

    private void h() {
        if (this.b > 0) {
            this.c.a(this.a, 0, this.b);
            this.b = 0;
        }
    }

    private void d(int i) {
        if (this.a.length - this.b < i) {
            h();
        }
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(boolean z) {
        if (this.a.length == this.b) {
            h();
        }
        this.b += a.a(z, this.a, this.b);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void c(int i) {
        d(5);
        this.b += a.a(i, this.a, this.b);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b(long j) {
        d(10);
        this.b += a.a(j, this.a, this.b);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(float f) {
        d(4);
        this.b += a.a(f, this.a, this.b);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(double d) {
        d(8);
        this.b += a.a(d, this.a, this.b);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b(byte[] bArr, int i, int i2) {
        if (i2 > this.d) {
            h();
            this.c.a(bArr, i, i2);
        } else {
            d(i2);
            System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b += i2;
        }
    }

    @Override // com.flurry.a.a.a.c.k
    protected final void g() {
        if (this.b == this.a.length) {
            h();
        }
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = 0;
    }
}
