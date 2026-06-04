package com.flurry.a.a.a.c;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class k extends t {
    protected abstract void g();

    @Override // com.flurry.a.a.a.c.t
    public final void a() {
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(com.flurry.a.a.a.e.a aVar) {
        a(aVar.a(), 0, aVar.b());
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(String str) {
        if (str.length() == 0) {
            g();
            return;
        }
        byte[] bytes = str.getBytes("UTF-8");
        c(bytes.length);
        b(bytes, 0, bytes.length);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        a(byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            g();
        } else {
            c(i2);
            b(bArr, i, i2);
        }
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(int i) {
        c(i);
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b() {
    }

    @Override // com.flurry.a.a.a.c.t
    public final void a(long j) {
        if (j > 0) {
            b(j);
        }
    }

    @Override // com.flurry.a.a.a.c.t
    public final void c() {
    }

    @Override // com.flurry.a.a.a.c.t
    public final void d() {
        g();
    }

    @Override // com.flurry.a.a.a.c.t
    public final void e() {
    }

    @Override // com.flurry.a.a.a.c.t
    public final void f() {
        g();
    }

    @Override // com.flurry.a.a.a.c.t
    public final void b(int i) {
        c(i);
    }
}
