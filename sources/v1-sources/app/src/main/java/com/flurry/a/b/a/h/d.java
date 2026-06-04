package com.flurry.a.b.a.h;

import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class d extends OutputStream {
    private static final byte[] a = new byte[0];
    private final a b;
    private final LinkedList c;
    private int d;
    private byte[] e;
    private int f;

    public d() {
        this((byte) 0);
    }

    private d(byte b) {
        this(ThemeShellDescription.PAGE_PREVIEW_SELECT);
    }

    public d(char c) {
        this(100);
    }

    private d(int i) {
        this.c = new LinkedList();
        this.b = null;
        this.e = new byte[i];
    }

    public final void a() {
        this.d = 0;
        this.f = 0;
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public final void a(int i) {
        if (this.f >= this.e.length) {
            c();
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void b(int i) {
        if (this.f + 1 < this.e.length) {
            byte[] bArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            byte[] bArr2 = this.e;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) i;
            return;
        }
        a(i >> 8);
        a(i);
    }

    public final void c(int i) {
        if (this.f + 2 < this.e.length) {
            byte[] bArr = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            byte[] bArr2 = this.e;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) (i >> 8);
            byte[] bArr3 = this.e;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr3[i4] = (byte) i;
            return;
        }
        a(i >> 16);
        a(i >> 8);
        a(i);
    }

    public final byte[] b() {
        int i = this.d + this.f;
        if (i == 0) {
            return a;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.e, 0, bArr, i2, this.f);
        int i3 = this.f + i2;
        if (i3 != i) {
            throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this.c.isEmpty()) {
            a();
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.e.length - this.f, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.e, this.f, min);
                i += min;
                this.f += min;
                i2 -= min;
            }
            if (i2 > 0) {
                c();
            } else {
                return;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        a(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    private void c() {
        this.d += this.e.length;
        int max = Math.max(this.d >> 1, ThemeShellDescription.PICKER_MENU);
        int i = max <= 262144 ? max : 262144;
        this.c.add(this.e);
        this.e = new byte[i];
        this.f = 0;
    }
}
