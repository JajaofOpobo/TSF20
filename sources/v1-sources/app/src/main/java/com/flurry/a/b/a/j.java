package com.flurry.a.b.a;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class j implements Closeable {
    protected int a;
    protected o b;
    protected o c;

    public abstract p a();

    public abstract byte[] a(a aVar);

    public abstract o b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract j d();

    public abstract String g();

    public abstract g h();

    public abstract g i();

    public abstract String k();

    public abstract char[] l();

    public abstract int m();

    public abstract int n();

    public abstract Number p();

    public abstract l q();

    public abstract int t();

    public abstract long u();

    public abstract BigInteger v();

    public abstract float w();

    public abstract double x();

    public abstract BigDecimal y();

    protected j() {
    }

    protected j(byte b) {
        this.a = 0;
    }

    public boolean a(k kVar) {
        return (this.a & kVar.b()) != 0;
    }

    public final o c() {
        o b = b();
        if (b == o.FIELD_NAME) {
            return b();
        }
        return b;
    }

    public o e() {
        return this.b;
    }

    public void f() {
        if (this.b != null) {
            this.c = this.b;
            this.b = null;
        }
    }

    public final boolean j() {
        return e() == o.START_ARRAY;
    }

    public boolean o() {
        return false;
    }

    public byte r() {
        int t = t();
        if (t < -128 || t > 127) {
            throw a("Numeric value (" + k() + ") out of range of Java byte");
        }
        return (byte) t;
    }

    public short s() {
        int t = t();
        if (t < -32768 || t > 32767) {
            throw a("Numeric value (" + k() + ") out of range of Java short");
        }
        return (short) t;
    }

    public Object z() {
        return null;
    }

    protected final i a(String str) {
        return new i(str, i());
    }
}
