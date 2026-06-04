package com.flurry.a.a.a.c;

import java.io.Flushable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class t implements Flushable {
    public abstract void a();

    public abstract void a(double d);

    public abstract void a(float f);

    public abstract void a(int i);

    public abstract void a(long j);

    public abstract void a(com.flurry.a.a.a.e.a aVar);

    public abstract void a(ByteBuffer byteBuffer);

    public abstract void a(boolean z);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void b();

    public abstract void b(int i);

    public abstract void b(long j);

    public abstract void b(byte[] bArr, int i, int i2);

    public abstract void c();

    public abstract void c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public void a(String str) {
        a(new com.flurry.a.a.a.e.a(str));
    }

    public final void a(CharSequence charSequence) {
        if (charSequence instanceof com.flurry.a.a.a.e.a) {
            a((com.flurry.a.a.a.e.a) charSequence);
        } else {
            a(charSequence.toString());
        }
    }

    public final void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public final void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }
}
