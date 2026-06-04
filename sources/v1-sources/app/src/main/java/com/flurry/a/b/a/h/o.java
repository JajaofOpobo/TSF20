package com.flurry.a.b.a.h;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class o extends com.flurry.a.b.a.b.d {
    protected com.flurry.a.b.a.p d;
    protected p e;
    protected int f;
    protected com.flurry.a.b.a.b.f g;
    protected boolean h;
    protected transient d i;
    protected com.flurry.a.b.a.g j;

    public o(p pVar, com.flurry.a.b.a.p pVar2) {
        super((byte) 0);
        this.j = null;
        this.e = pVar;
        this.f = -1;
        this.d = pVar2;
        this.g = com.flurry.a.b.a.b.f.g();
    }

    public final void a(com.flurry.a.b.a.g gVar) {
        this.j = gVar;
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.p a() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            this.h = true;
        }
    }

    @Override // com.flurry.a.b.a.b.d, com.flurry.a.b.a.j
    public final com.flurry.a.b.a.o b() {
        if (this.h || this.e == null) {
            return null;
        }
        int i = this.f + 1;
        this.f = i;
        if (i >= 16) {
            this.f = 0;
            this.e = this.e.a();
            if (this.e == null) {
                return null;
            }
        }
        this.b = this.e.a(this.f);
        if (this.b == com.flurry.a.b.a.o.FIELD_NAME) {
            Object A = A();
            this.g.a(A instanceof String ? (String) A : A.toString());
        } else if (this.b == com.flurry.a.b.a.o.START_OBJECT) {
            this.g = this.g.b(-1, -1);
        } else if (this.b == com.flurry.a.b.a.o.START_ARRAY) {
            this.g = this.g.a(-1, -1);
        } else if (this.b == com.flurry.a.b.a.o.END_OBJECT || this.b == com.flurry.a.b.a.o.END_ARRAY) {
            this.g = this.g.i();
            if (this.g == null) {
                this.g = com.flurry.a.b.a.b.f.g();
            }
        }
        return this.b;
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.g h() {
        return i();
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.g i() {
        return this.j == null ? com.flurry.a.b.a.g.a : this.j;
    }

    @Override // com.flurry.a.b.a.j
    public final String g() {
        return this.g.h();
    }

    @Override // com.flurry.a.b.a.b.d, com.flurry.a.b.a.j
    public final String k() {
        if (this.b == com.flurry.a.b.a.o.VALUE_STRING || this.b == com.flurry.a.b.a.o.FIELD_NAME) {
            Object A = A();
            if (A instanceof String) {
                return (String) A;
            }
            if (A == null) {
                return null;
            }
            return A.toString();
        }
        if (this.b == null) {
            return null;
        }
        switch (n.a[this.b.ordinal()]) {
            case R.styleable.CellLayout_longAxisCells /* 7 */:
            case ThemeParser.TYPE_FOLDER /* 8 */:
                Object A2 = A();
                if (A2 == null) {
                    return null;
                }
                return A2.toString();
            default:
                return this.b.a();
        }
    }

    @Override // com.flurry.a.b.a.j
    public final char[] l() {
        String k = k();
        if (k == null) {
            return null;
        }
        return k.toCharArray();
    }

    @Override // com.flurry.a.b.a.j
    public final int m() {
        String k = k();
        if (k == null) {
            return 0;
        }
        return k.length();
    }

    @Override // com.flurry.a.b.a.j
    public final int n() {
        return 0;
    }

    @Override // com.flurry.a.b.a.j
    public final boolean o() {
        return false;
    }

    @Override // com.flurry.a.b.a.j
    public final BigInteger v() {
        Number p = p();
        if (p instanceof BigInteger) {
            return (BigInteger) p;
        }
        switch (q()) {
            case BIG_DECIMAL:
                return ((BigDecimal) p).toBigInteger();
            default:
                return BigInteger.valueOf(p.longValue());
        }
    }

    @Override // com.flurry.a.b.a.j
    public final BigDecimal y() {
        Number p = p();
        if (p instanceof BigDecimal) {
            return (BigDecimal) p;
        }
        switch (q()) {
            case INT:
            case LONG:
                return BigDecimal.valueOf(p.longValue());
            case BIG_INTEGER:
                return new BigDecimal((BigInteger) p);
            case BIG_DECIMAL:
            case FLOAT:
            default:
                return BigDecimal.valueOf(p.doubleValue());
        }
    }

    @Override // com.flurry.a.b.a.j
    public final double x() {
        return p().doubleValue();
    }

    @Override // com.flurry.a.b.a.j
    public final float w() {
        return p().floatValue();
    }

    @Override // com.flurry.a.b.a.j
    public final int t() {
        return this.b == com.flurry.a.b.a.o.VALUE_NUMBER_INT ? ((Number) A()).intValue() : p().intValue();
    }

    @Override // com.flurry.a.b.a.j
    public final long u() {
        return p().longValue();
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.l q() {
        Number p = p();
        if (p instanceof Integer) {
            return com.flurry.a.b.a.l.INT;
        }
        if (p instanceof Long) {
            return com.flurry.a.b.a.l.LONG;
        }
        if (p instanceof Double) {
            return com.flurry.a.b.a.l.DOUBLE;
        }
        if (p instanceof BigDecimal) {
            return com.flurry.a.b.a.l.BIG_DECIMAL;
        }
        if (p instanceof Float) {
            return com.flurry.a.b.a.l.FLOAT;
        }
        if (p instanceof BigInteger) {
            return com.flurry.a.b.a.l.BIG_INTEGER;
        }
        return null;
    }

    @Override // com.flurry.a.b.a.j
    public final Number p() {
        if (this.b == null || !this.b.c()) {
            throw a("Current token (" + this.b + ") not numeric, can not use numeric value accessors");
        }
        return (Number) A();
    }

    @Override // com.flurry.a.b.a.j
    public final Object z() {
        if (this.b == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            return A();
        }
        return null;
    }

    @Override // com.flurry.a.b.a.j
    public final byte[] a(com.flurry.a.b.a.a aVar) {
        if (this.b == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            Object A = A();
            if (A instanceof byte[]) {
                return (byte[]) A;
            }
        }
        if (this.b != com.flurry.a.b.a.o.VALUE_STRING) {
            throw a("Current token (" + this.b + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
        }
        String k = k();
        if (k == null) {
            return null;
        }
        d dVar = this.i;
        if (dVar == null) {
            dVar = new d((char) 0);
            this.i = dVar;
        } else {
            this.i.a();
        }
        a(k, dVar, aVar);
        return dVar.b();
    }

    private Object A() {
        return this.e.b(this.f);
    }

    @Override // com.flurry.a.b.a.b.d
    protected final void E() {
        J();
    }
}
