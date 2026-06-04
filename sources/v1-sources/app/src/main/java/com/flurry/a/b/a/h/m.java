package com.flurry.a.b.a.h;

import com.flurry.a.b.a.r;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class m extends com.flurry.a.b.a.e {
    protected static final int b = com.flurry.a.b.a.k.a();
    protected com.flurry.a.b.a.p c;
    protected boolean e;
    protected p f;
    protected p g;
    protected int h;
    protected int d = b;
    protected com.flurry.a.b.a.b.g i = com.flurry.a.b.a.b.g.g();

    public m(com.flurry.a.b.a.p pVar) {
        this.c = pVar;
        p pVar2 = new p();
        this.g = pVar2;
        this.f = pVar2;
        this.h = 0;
    }

    public final com.flurry.a.b.a.j h() {
        return new o(this.f, this.c);
    }

    public final com.flurry.a.b.a.j a(com.flurry.a.b.a.j jVar) {
        o oVar = new o(this.f, jVar.a());
        oVar.a(jVar.h());
        return oVar;
    }

    public final void a(com.flurry.a.b.a.e eVar) {
        p pVar = this.f;
        int i = -1;
        while (true) {
            int i2 = i;
            p pVar2 = pVar;
            int i3 = i2 + 1;
            if (i3 >= 16) {
                p a = pVar2.a();
                if (a == null) {
                    return;
                }
                i = 0;
                pVar = a;
            } else {
                pVar = pVar2;
                i = i3;
            }
            com.flurry.a.b.a.o a2 = pVar.a(i);
            if (a2 != null) {
                switch (n.a[a2.ordinal()]) {
                    case 1:
                        eVar.d();
                        break;
                    case 2:
                        eVar.e();
                        break;
                    case 3:
                        eVar.b();
                        break;
                    case 4:
                        eVar.c();
                        break;
                    case 5:
                        Object b2 = pVar.b(i);
                        if (b2 instanceof r) {
                            eVar.a((r) b2);
                            break;
                        } else {
                            eVar.a((String) b2);
                            break;
                        }
                    case 6:
                        Object b3 = pVar.b(i);
                        if (b3 instanceof r) {
                            eVar.b((r) b3);
                            break;
                        } else {
                            eVar.b((String) b3);
                            break;
                        }
                    case R.styleable.CellLayout_longAxisCells /* 7 */:
                        Number number = (Number) pVar.b(i);
                        if (number instanceof BigInteger) {
                            eVar.a((BigInteger) number);
                            break;
                        } else if (number instanceof Long) {
                            eVar.a(number.longValue());
                            break;
                        } else {
                            eVar.a(number.intValue());
                            break;
                        }
                    case ThemeParser.TYPE_FOLDER /* 8 */:
                        Object b4 = pVar.b(i);
                        if (b4 instanceof BigDecimal) {
                            eVar.a((BigDecimal) b4);
                            break;
                        } else if (b4 instanceof Float) {
                            eVar.a(((Float) b4).floatValue());
                            break;
                        } else if (b4 instanceof Double) {
                            eVar.a(((Double) b4).doubleValue());
                            break;
                        } else if (b4 == null) {
                            eVar.f();
                            break;
                        } else if (b4 instanceof String) {
                            eVar.e((String) b4);
                            break;
                        } else {
                            throw new com.flurry.a.b.a.d("Unrecognized value type for VALUE_NUMBER_FLOAT: " + b4.getClass().getName() + ", can not serialize");
                        }
                    case 9:
                        eVar.a(true);
                        break;
                    case 10:
                        eVar.a(false);
                        break;
                    case 11:
                        eVar.f();
                        break;
                    case 12:
                        eVar.a(pVar.b(i));
                        break;
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        com.flurry.a.b.a.j h = h();
        int i = 0;
        while (true) {
            try {
                com.flurry.a.b.a.o b2 = h.b();
                if (b2 == null) {
                    break;
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(b2.toString());
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ").append(i - 100).append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // com.flurry.a.b.a.e
    public final com.flurry.a.b.a.e a() {
        return this;
    }

    @Override // com.flurry.a.b.a.e
    public final void g() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e = true;
    }

    @Override // com.flurry.a.b.a.e
    public final void b() {
        a(com.flurry.a.b.a.o.START_ARRAY);
        this.i = this.i.h();
    }

    @Override // com.flurry.a.b.a.e
    public final void c() {
        a(com.flurry.a.b.a.o.END_ARRAY);
        com.flurry.a.b.a.b.g j = this.i.j();
        if (j != null) {
            this.i = j;
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void d() {
        a(com.flurry.a.b.a.o.START_OBJECT);
        this.i = this.i.i();
    }

    @Override // com.flurry.a.b.a.e
    public final void e() {
        a(com.flurry.a.b.a.o.END_OBJECT);
        com.flurry.a.b.a.b.g j = this.i.j();
        if (j != null) {
            this.i = j;
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(String str) {
        a(com.flurry.a.b.a.o.FIELD_NAME, str);
        this.i.a(str);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(r rVar) {
        a(com.flurry.a.b.a.o.FIELD_NAME, rVar);
        this.i.a(rVar.a());
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.c.h hVar) {
        a(com.flurry.a.b.a.o.FIELD_NAME, hVar);
        this.i.a(hVar.a());
    }

    @Override // com.flurry.a.b.a.e
    public final void b(String str) {
        if (str == null) {
            a(com.flurry.a.b.a.o.VALUE_NULL);
        } else {
            a(com.flurry.a.b.a.o.VALUE_STRING, str);
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(char[] cArr, int i, int i2) {
        b(new String(cArr, i, i2));
    }

    @Override // com.flurry.a.b.a.e
    public final void b(r rVar) {
        if (rVar == null) {
            a(com.flurry.a.b.a.o.VALUE_NULL);
        } else {
            a(com.flurry.a.b.a.o.VALUE_STRING, rVar);
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void c(String str) {
        i();
    }

    @Override // com.flurry.a.b.a.e
    public final void a(char[] cArr, int i) {
        i();
    }

    @Override // com.flurry.a.b.a.e
    public final void a(char c) {
        i();
    }

    @Override // com.flurry.a.b.a.e
    public final void d(String str) {
        i();
    }

    @Override // com.flurry.a.b.a.e
    public final void a(int i) {
        a(com.flurry.a.b.a.o.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // com.flurry.a.b.a.e
    public final void a(long j) {
        a(com.flurry.a.b.a.o.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.flurry.a.b.a.e
    public final void a(double d) {
        a(com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // com.flurry.a.b.a.e
    public final void a(float f) {
        a(com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.flurry.a.b.a.e
    public final void a(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            a(com.flurry.a.b.a.o.VALUE_NULL);
        } else {
            a(com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(BigInteger bigInteger) {
        if (bigInteger == null) {
            a(com.flurry.a.b.a.o.VALUE_NULL);
        } else {
            a(com.flurry.a.b.a.o.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void e(String str) {
        a(com.flurry.a.b.a.o.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(boolean z) {
        a(z ? com.flurry.a.b.a.o.VALUE_TRUE : com.flurry.a.b.a.o.VALUE_FALSE);
    }

    @Override // com.flurry.a.b.a.e
    public final void f() {
        a(com.flurry.a.b.a.o.VALUE_NULL);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(Object obj) {
        a(com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.h hVar) {
        a(com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT, hVar);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.a aVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        a((Object) bArr2);
    }

    public final void b(com.flurry.a.b.a.j jVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.FIELD_NAME) {
            a(jVar.g());
            e = jVar.b();
        }
        switch (n.a[e.ordinal()]) {
            case 1:
                d();
                while (jVar.b() != com.flurry.a.b.a.o.END_OBJECT) {
                    b(jVar);
                }
                e();
                return;
            case 2:
            default:
                switch (n.a[jVar.e().ordinal()]) {
                    case 1:
                        d();
                        return;
                    case 2:
                        e();
                        return;
                    case 3:
                        b();
                        return;
                    case 4:
                        c();
                        return;
                    case 5:
                        a(jVar.g());
                        return;
                    case 6:
                        if (jVar.o()) {
                            a(jVar.l(), jVar.n(), jVar.m());
                            return;
                        } else {
                            b(jVar.k());
                            return;
                        }
                    case R.styleable.CellLayout_longAxisCells /* 7 */:
                        switch (n.b[jVar.q().ordinal()]) {
                            case 1:
                                a(jVar.t());
                                return;
                            case 2:
                                a(jVar.v());
                                return;
                            default:
                                a(jVar.u());
                                return;
                        }
                    case ThemeParser.TYPE_FOLDER /* 8 */:
                        switch (n.b[jVar.q().ordinal()]) {
                            case 3:
                                a(jVar.y());
                                return;
                            case 4:
                                a(jVar.w());
                                return;
                            default:
                                a(jVar.x());
                                return;
                        }
                    case 9:
                        a(true);
                        return;
                    case 10:
                        a(false);
                        return;
                    case 11:
                        a(com.flurry.a.b.a.o.VALUE_NULL);
                        return;
                    case 12:
                        a(jVar.z());
                        return;
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            case 3:
                b();
                while (jVar.b() != com.flurry.a.b.a.o.END_ARRAY) {
                    b(jVar);
                }
                c();
                return;
        }
    }

    private void a(com.flurry.a.b.a.o oVar) {
        p a = this.g.a(this.h, oVar);
        if (a == null) {
            this.h++;
        } else {
            this.g = a;
            this.h = 1;
        }
    }

    private void a(com.flurry.a.b.a.o oVar, Object obj) {
        p a = this.g.a(this.h, oVar, obj);
        if (a == null) {
            this.h++;
        } else {
            this.g = a;
            this.h = 1;
        }
    }

    private static void i() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }
}
