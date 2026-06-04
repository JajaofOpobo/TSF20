package com.flurry.a.b.a;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class e implements Closeable {
    protected q a;

    public abstract e a();

    public abstract void a(char c);

    public abstract void a(double d);

    public abstract void a(float f);

    public abstract void a(int i);

    public abstract void a(long j);

    public abstract void a(a aVar, byte[] bArr, int i);

    public abstract void a(h hVar);

    public abstract void a(Object obj);

    public abstract void a(String str);

    public abstract void a(BigDecimal bigDecimal);

    public abstract void a(BigInteger bigInteger);

    public abstract void a(boolean z);

    public abstract void a(char[] cArr, int i);

    public abstract void a(char[] cArr, int i, int i2);

    public abstract void b();

    public abstract void b(String str);

    public abstract void c();

    public abstract void c(String str);

    public abstract void d();

    public abstract void d(String str);

    public abstract void e();

    public abstract void e(String str);

    public abstract void f();

    public abstract void g();

    protected e() {
    }

    public final e a(q qVar) {
        this.a = qVar;
        return this;
    }

    public e a(com.flurry.a.b.a.c.a aVar) {
        return this;
    }

    public void a(com.flurry.a.b.a.c.h hVar) {
        a(hVar.a());
    }

    public void a(r rVar) {
        a(rVar.a());
    }

    public void b(r rVar) {
        b(rVar.a());
    }

    public final void a(byte[] bArr) {
        a(b.a(), bArr, bArr.length);
    }

    public void a(String str, String str2) {
        a(str);
        b(str2);
    }

    public final void a(String str, int i) {
        a(str);
        a(i);
    }

    public final void f(String str) {
        a(str);
        b();
    }

    public final void g(String str) {
        a(str);
        d();
    }
}
