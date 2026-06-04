package com.flurry.a.b.a.b;

import com.flurry.a.b.a.h.l;
import com.flurry.a.b.a.o;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class c extends d {
    static final BigDecimal u = new BigDecimal(Long.MIN_VALUE);
    static final BigDecimal v = new BigDecimal(Long.MAX_VALUE);
    static final BigDecimal w = new BigDecimal(Long.MIN_VALUE);
    static final BigDecimal x = new BigDecimal(Long.MAX_VALUE);
    protected long A;
    protected double B;
    protected BigInteger C;
    protected BigDecimal D;
    protected boolean E;
    protected int F;
    protected int G;
    protected int H;
    protected final com.flurry.a.b.a.c.b d;
    protected boolean e;
    protected f n;
    protected o o;
    protected final l p;
    protected byte[] t;
    protected int z;
    protected int f = 0;
    protected int g = 0;
    protected long h = 0;
    protected int i = 1;
    protected int j = 0;
    protected long k = 0;
    protected int l = 1;
    protected int m = 0;
    protected char[] q = null;
    protected boolean r = false;
    protected com.flurry.a.b.a.h.d s = null;
    protected int y = 0;

    protected abstract boolean B();

    protected abstract void C();

    protected c(com.flurry.a.b.a.c.b bVar, int i) {
        this.a = i;
        this.d = bVar;
        this.p = bVar.c();
        this.n = new f(null, 0, 1, 0);
    }

    @Override // com.flurry.a.b.a.j
    public final String g() {
        return (this.b == o.START_OBJECT || this.b == o.START_ARRAY) ? this.n.i().h() : this.n.h();
    }

    @Override // com.flurry.a.b.a.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.e) {
            this.e = true;
            try {
                C();
            } finally {
                D();
            }
        }
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.g h() {
        Object a = this.d.a();
        long j = this.k;
        int i = this.l;
        int i2 = this.m;
        if (i2 >= 0) {
            i2++;
        }
        return new com.flurry.a.b.a.g(a, j, i, i2);
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.g i() {
        return new com.flurry.a.b.a.g(this.d.a(), (this.h + this.f) - 1, this.i, (this.f - this.j) + 1);
    }

    @Override // com.flurry.a.b.a.j
    public final boolean o() {
        if (this.b == o.VALUE_STRING) {
            return true;
        }
        if (this.b == o.FIELD_NAME) {
            return this.r;
        }
        return false;
    }

    protected final void A() {
        if (!B()) {
            H();
        }
    }

    protected void D() {
        this.p.a();
        char[] cArr = this.q;
        if (cArr != null) {
            this.q = null;
            this.d.c(cArr);
        }
    }

    @Override // com.flurry.a.b.a.b.d
    protected final void E() {
        if (!this.n.b()) {
            c(": expected close marker for " + this.n.d() + " (from " + this.n.a(this.d.a()) + ")");
        }
    }

    protected final void a(int i, char c) {
        d("Unexpected close marker '" + ((char) i) + "': expected '" + c + "' (for " + this.n.d() + " starting at " + new StringBuilder().append(this.n.a(this.d.a())).toString() + ")");
    }

    public final com.flurry.a.b.a.h.d F() {
        if (this.s == null) {
            this.s = new com.flurry.a.b.a.h.d();
        } else {
            this.s.a();
        }
        return this.s;
    }

    protected final o a(boolean z, int i, int i2, int i3) {
        if (i2 > 0 || i3 > 0) {
            this.E = z;
            this.F = i;
            this.G = i2;
            this.H = i3;
            this.y = 0;
            return o.VALUE_NUMBER_FLOAT;
        }
        this.E = z;
        this.F = i;
        this.G = 0;
        this.H = 0;
        this.y = 0;
        return o.VALUE_NUMBER_INT;
    }

    protected final o a(String str, double d) {
        this.p.a(str);
        this.B = d;
        this.y = 8;
        return o.VALUE_NUMBER_FLOAT;
    }

    @Override // com.flurry.a.b.a.j
    public final Number p() {
        if (this.y == 0) {
            c(0);
        }
        if (this.b == o.VALUE_NUMBER_INT) {
            if ((this.y & 1) != 0) {
                return Integer.valueOf(this.z);
            }
            if ((this.y & 2) != 0) {
                return Long.valueOf(this.A);
            }
            if ((this.y & 4) != 0) {
                return this.C;
            }
            return this.D;
        }
        if ((this.y & 16) != 0) {
            return this.D;
        }
        if ((this.y & 8) == 0) {
            J();
        }
        return Double.valueOf(this.B);
    }

    @Override // com.flurry.a.b.a.j
    public final com.flurry.a.b.a.l q() {
        if (this.y == 0) {
            c(0);
        }
        if (this.b == o.VALUE_NUMBER_INT) {
            if ((this.y & 1) != 0) {
                return com.flurry.a.b.a.l.INT;
            }
            if ((this.y & 2) != 0) {
                return com.flurry.a.b.a.l.LONG;
            }
            return com.flurry.a.b.a.l.BIG_INTEGER;
        }
        if ((this.y & 16) != 0) {
            return com.flurry.a.b.a.l.BIG_DECIMAL;
        }
        return com.flurry.a.b.a.l.DOUBLE;
    }

    @Override // com.flurry.a.b.a.j
    public final int t() {
        if ((this.y & 1) == 0) {
            if (this.y == 0) {
                c(1);
            }
            if ((this.y & 1) == 0) {
                if ((this.y & 2) != 0) {
                    int i = (int) this.A;
                    if (i != this.A) {
                        d("Numeric value (" + k() + ") out of range of int");
                    }
                    this.z = i;
                } else if ((this.y & 4) != 0) {
                    this.z = this.C.intValue();
                } else if ((this.y & 8) != 0) {
                    if (this.B < -2.147483648E9d || this.B > 2.147483647E9d) {
                        K();
                    }
                    this.z = (int) this.B;
                } else if ((this.y & 16) != 0) {
                    if (w.compareTo(this.D) > 0 || x.compareTo(this.D) < 0) {
                        K();
                    }
                    this.z = this.D.intValue();
                } else {
                    J();
                }
                this.y |= 1;
            }
        }
        return this.z;
    }

    @Override // com.flurry.a.b.a.j
    public final long u() {
        if ((this.y & 2) == 0) {
            if (this.y == 0) {
                c(2);
            }
            if ((this.y & 2) == 0) {
                if ((this.y & 1) != 0) {
                    this.A = this.z;
                } else if ((this.y & 4) != 0) {
                    this.A = this.C.longValue();
                } else if ((this.y & 8) != 0) {
                    if (this.B < -9.223372036854776E18d || this.B > 9.223372036854776E18d) {
                        L();
                    }
                    this.A = (long) this.B;
                } else if ((this.y & 16) != 0) {
                    if (u.compareTo(this.D) > 0 || v.compareTo(this.D) < 0) {
                        L();
                    }
                    this.A = this.D.longValue();
                } else {
                    J();
                }
                this.y |= 2;
            }
        }
        return this.A;
    }

    @Override // com.flurry.a.b.a.j
    public final BigInteger v() {
        if ((this.y & 4) == 0) {
            if (this.y == 0) {
                c(4);
            }
            if ((this.y & 4) == 0) {
                if ((this.y & 16) != 0) {
                    this.C = this.D.toBigInteger();
                } else if ((this.y & 2) != 0) {
                    this.C = BigInteger.valueOf(this.A);
                } else if ((this.y & 1) != 0) {
                    this.C = BigInteger.valueOf(this.z);
                } else if ((this.y & 8) != 0) {
                    this.C = BigDecimal.valueOf(this.B).toBigInteger();
                } else {
                    J();
                }
                this.y |= 4;
            }
        }
        return this.C;
    }

    @Override // com.flurry.a.b.a.j
    public final float w() {
        return (float) x();
    }

    @Override // com.flurry.a.b.a.j
    public final double x() {
        if ((this.y & 8) == 0) {
            if (this.y == 0) {
                c(8);
            }
            if ((this.y & 8) == 0) {
                if ((this.y & 16) != 0) {
                    this.B = this.D.doubleValue();
                } else if ((this.y & 4) != 0) {
                    this.B = this.C.doubleValue();
                } else if ((this.y & 2) != 0) {
                    this.B = this.A;
                } else if ((this.y & 1) != 0) {
                    this.B = this.z;
                } else {
                    J();
                }
                this.y |= 8;
            }
        }
        return this.B;
    }

    @Override // com.flurry.a.b.a.j
    public final BigDecimal y() {
        if ((this.y & 16) == 0) {
            if (this.y == 0) {
                c(16);
            }
            if ((this.y & 16) == 0) {
                if ((this.y & 8) != 0) {
                    this.D = new BigDecimal(k());
                } else if ((this.y & 4) != 0) {
                    this.D = new BigDecimal(this.C);
                } else if ((this.y & 2) != 0) {
                    this.D = BigDecimal.valueOf(this.A);
                } else if ((this.y & 1) != 0) {
                    this.D = BigDecimal.valueOf(this.z);
                } else {
                    J();
                }
                this.y |= 16;
            }
        }
        return this.D;
    }

    private void c(int i) {
        if (this.b == o.VALUE_NUMBER_INT) {
            char[] d = this.p.d();
            int c = this.p.c();
            int i2 = this.F;
            if (this.E) {
                c++;
            }
            if (i2 <= 9) {
                int a = com.flurry.a.b.a.c.e.a(d, c, i2);
                if (this.E) {
                    a = -a;
                }
                this.z = a;
                this.y = 1;
                return;
            }
            if (i2 <= 18) {
                long b = com.flurry.a.b.a.c.e.b(d, c, i2);
                if (this.E) {
                    b = -b;
                }
                if (i2 == 10) {
                    if (this.E) {
                        if (b >= -2147483648L) {
                            this.z = (int) b;
                            this.y = 1;
                            return;
                        }
                    } else if (b <= 2147483647L) {
                        this.z = (int) b;
                        this.y = 1;
                        return;
                    }
                }
                this.A = b;
                this.y = 2;
                return;
            }
            String e = this.p.e();
            try {
                if (com.flurry.a.b.a.c.e.a(d, c, i2, this.E)) {
                    this.A = Long.parseLong(e);
                    this.y = 2;
                } else {
                    this.C = new BigInteger(e);
                    this.y = 4;
                }
                return;
            } catch (NumberFormatException e2) {
                a("Malformed numeric value '" + e + "'", e2);
                return;
            }
        }
        if (this.b == o.VALUE_NUMBER_FLOAT) {
            try {
                if (i == 16) {
                    this.D = this.p.g();
                    this.y = 16;
                } else {
                    this.B = this.p.h();
                    this.y = 8;
                }
                return;
            } catch (NumberFormatException e3) {
                a("Malformed numeric value '" + this.p.e() + "'", e3);
                return;
            }
        }
        d("Current token (" + this.b + ") not numeric, can not use numeric value accessors");
    }

    protected final void a(int i, String str) {
        String str2 = "Unexpected character (" + b(i) + ") in numeric value";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        d(str2);
    }

    protected final void b(String str) {
        d("Invalid numeric value: " + str);
    }

    private void K() {
        d("Numeric value (" + k() + ") out of range of int (-2147483648 - 2147483647)");
    }

    private void L() {
        d("Numeric value (" + k() + ") out of range of long (-9223372036854775808 - 9223372036854775807)");
    }

    protected char G() {
        throw new UnsupportedOperationException();
    }

    protected final int a(com.flurry.a.b.a.a aVar, char c, int i) {
        if (c != '\\') {
            throw a(aVar, (int) c, i, (String) null);
        }
        char G = G();
        if (G <= ' ' && i == 0) {
            return -1;
        }
        int b = aVar.b(G);
        if (b < 0) {
            throw a(aVar, (int) G, i, (String) null);
        }
        return b;
    }

    protected static IllegalArgumentException a(com.flurry.a.b.a.a aVar, int i, int i2, String str) {
        String str2;
        if (i <= 32) {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(i) + ") as character #" + (i2 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (aVar.a(i)) {
            str2 = "Unexpected padding character ('" + aVar.b() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }
}
