package com.flurry.a.b.a.b;

import com.flurry.a.b.a.p;
import com.flurry.a.b.a.q;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class b extends com.flurry.a.b.a.e {
    protected p b;
    protected int c;
    protected boolean f;
    protected g e = g.g();
    protected boolean d = a(com.flurry.a.b.a.f.WRITE_NUMBERS_AS_STRINGS);

    protected abstract void h(String str);

    protected b(int i, p pVar) {
        this.c = i;
        this.b = pVar;
    }

    public final boolean a(com.flurry.a.b.a.f fVar) {
        return (this.c & fVar.b()) != 0;
    }

    @Override // com.flurry.a.b.a.e
    public final com.flurry.a.b.a.e a() {
        return a((q) new com.flurry.a.b.a.h.f());
    }

    public final g h() {
        return this.e;
    }

    @Override // com.flurry.a.b.a.e
    public void b() {
        h("start an array");
        this.e = this.e.h();
        if (this.a != null) {
            this.a.e(this);
        }
    }

    @Override // com.flurry.a.b.a.e
    public void c() {
        if (!this.e.a()) {
            i("Current context not an ARRAY but " + this.e.d());
        }
        if (this.a != null) {
            this.a.b(this, this.e.e());
        }
        this.e = this.e.j();
    }

    @Override // com.flurry.a.b.a.e
    public void d() {
        h("start an object");
        this.e = this.e.i();
        if (this.a != null) {
            this.a.b(this);
        }
    }

    @Override // com.flurry.a.b.a.e
    public void e() {
        if (!this.e.c()) {
            i("Current context not an object but " + this.e.d());
        }
        this.e = this.e.j();
        if (this.a != null) {
            this.a.a(this, this.e.e());
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void d(String str) {
        h("write raw value");
        c(str);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(Object obj) {
        if (obj == null) {
            f();
            return;
        }
        if (this.b != null) {
            this.b.a(this, obj);
            return;
        }
        if (obj == null) {
            f();
            return;
        }
        if (obj instanceof String) {
            b((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                a(number.intValue());
                return;
            }
            if (number instanceof Long) {
                a(number.longValue());
                return;
            }
            if (number instanceof Double) {
                a(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                a(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                a((int) number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                a((int) number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                a((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                a((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                a(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                a(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            a((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            a(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.h hVar) {
        if (hVar == null) {
            f();
        } else {
            if (this.b == null) {
                throw new IllegalStateException("No ObjectCodec defined for the generator, can not serialize JsonNode-based trees");
            }
            this.b.a((com.flurry.a.b.a.e) this, hVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f = true;
    }

    protected static void i(String str) {
        throw new com.flurry.a.b.a.d(str);
    }
}
