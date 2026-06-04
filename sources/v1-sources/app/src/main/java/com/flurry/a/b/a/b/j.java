package com.flurry.a.b.a.b;

import com.flurry.a.b.a.p;
import com.flurry.a.b.a.r;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class j extends b {
    protected static final char[] g = com.flurry.a.b.a.h.e.d();
    protected static final int[] h = com.flurry.a.b.a.h.e.c();
    protected final com.flurry.a.b.a.c.b i;
    protected final Writer j;
    protected int[] k;
    protected int l;
    protected com.flurry.a.b.a.c.a m;
    protected r n;
    protected char[] o;
    protected int p;
    protected int q;
    protected int r;
    protected char[] s;

    public j(com.flurry.a.b.a.c.b bVar, int i, p pVar, Writer writer) {
        super(i, pVar);
        this.k = h;
        this.p = 0;
        this.q = 0;
        this.i = bVar;
        this.j = writer;
        this.o = bVar.e();
        this.r = this.o.length;
        if (a(com.flurry.a.b.a.f.ESCAPE_NON_ASCII)) {
            this.l = 127;
        }
    }

    @Override // com.flurry.a.b.a.e
    public final com.flurry.a.b.a.e a(com.flurry.a.b.a.c.a aVar) {
        this.m = aVar;
        if (aVar == null) {
            this.k = h;
        } else {
            this.k = aVar.a();
        }
        return this;
    }

    @Override // com.flurry.a.b.a.e
    public final void a(String str) {
        int a = this.e.a(str);
        if (a == 4) {
            i("Can not write a field name, expecting a value");
        }
        boolean z = a == 1;
        if (this.a != null) {
            if (z) {
                this.a.c(this);
            } else {
                this.a.h(this);
            }
            if (a(com.flurry.a.b.a.f.QUOTE_FIELD_NAMES)) {
                if (this.q >= this.r) {
                    k();
                }
                char[] cArr = this.o;
                int i = this.q;
                this.q = i + 1;
                cArr[i] = '\"';
                j(str);
                if (this.q >= this.r) {
                    k();
                }
                char[] cArr2 = this.o;
                int i2 = this.q;
                this.q = i2 + 1;
                cArr2[i2] = '\"';
                return;
            }
            j(str);
            return;
        }
        if (this.q + 1 >= this.r) {
            k();
        }
        if (z) {
            char[] cArr3 = this.o;
            int i3 = this.q;
            this.q = i3 + 1;
            cArr3[i3] = ',';
        }
        if (!a(com.flurry.a.b.a.f.QUOTE_FIELD_NAMES)) {
            j(str);
            return;
        }
        char[] cArr4 = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        cArr4[i4] = '\"';
        j(str);
        if (this.q >= this.r) {
            k();
        }
        char[] cArr5 = this.o;
        int i5 = this.q;
        this.q = i5 + 1;
        cArr5[i5] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void a(String str, String str2) {
        a(str);
        b(str2);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.c.h hVar) {
        int a = this.e.a(hVar.a());
        if (a == 4) {
            i("Can not write a field name, expecting a value");
        }
        a(hVar, a == 1);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(r rVar) {
        int a = this.e.a(rVar.a());
        if (a == 4) {
            i("Can not write a field name, expecting a value");
        }
        a(rVar, a == 1);
    }

    @Override // com.flurry.a.b.a.b.b, com.flurry.a.b.a.e
    public final void b() {
        h("start an array");
        this.e = this.e.h();
        if (this.a != null) {
            this.a.e(this);
            return;
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '[';
    }

    @Override // com.flurry.a.b.a.b.b, com.flurry.a.b.a.e
    public final void c() {
        if (!this.e.a()) {
            i("Current context not an ARRAY but " + this.e.d());
        }
        if (this.a != null) {
            this.a.b(this, this.e.e());
        } else {
            if (this.q >= this.r) {
                k();
            }
            char[] cArr = this.o;
            int i = this.q;
            this.q = i + 1;
            cArr[i] = ']';
        }
        this.e = this.e.j();
    }

    @Override // com.flurry.a.b.a.b.b, com.flurry.a.b.a.e
    public final void d() {
        h("start an object");
        this.e = this.e.i();
        if (this.a != null) {
            this.a.b(this);
            return;
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '{';
    }

    @Override // com.flurry.a.b.a.b.b, com.flurry.a.b.a.e
    public final void e() {
        if (!this.e.c()) {
            i("Current context not an object but " + this.e.d());
        }
        this.e = this.e.j();
        if (this.a != null) {
            this.a.a(this, this.e.e());
            return;
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '}';
    }

    private void a(r rVar, boolean z) {
        if (this.a != null) {
            if (z) {
                this.a.c(this);
            } else {
                this.a.h(this);
            }
            char[] b = rVar.b();
            if (a(com.flurry.a.b.a.f.QUOTE_FIELD_NAMES)) {
                if (this.q >= this.r) {
                    k();
                }
                char[] cArr = this.o;
                int i = this.q;
                this.q = i + 1;
                cArr[i] = '\"';
                a(b, b.length);
                if (this.q >= this.r) {
                    k();
                }
                char[] cArr2 = this.o;
                int i2 = this.q;
                this.q = i2 + 1;
                cArr2[i2] = '\"';
                return;
            }
            a(b, b.length);
            return;
        }
        if (this.q + 1 >= this.r) {
            k();
        }
        if (z) {
            char[] cArr3 = this.o;
            int i3 = this.q;
            this.q = i3 + 1;
            cArr3[i3] = ',';
        }
        char[] b2 = rVar.b();
        if (!a(com.flurry.a.b.a.f.QUOTE_FIELD_NAMES)) {
            a(b2, b2.length);
            return;
        }
        char[] cArr4 = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        cArr4[i4] = '\"';
        int length = b2.length;
        if (this.q + length + 1 >= this.r) {
            a(b2, length);
            if (this.q >= this.r) {
                k();
            }
            char[] cArr5 = this.o;
            int i5 = this.q;
            this.q = i5 + 1;
            cArr5[i5] = '\"';
            return;
        }
        System.arraycopy(b2, 0, this.o, this.q, length);
        this.q += length;
        char[] cArr6 = this.o;
        int i6 = this.q;
        this.q = i6 + 1;
        cArr6[i6] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void b(String str) {
        h("write text value");
        if (str == null) {
            i();
            return;
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '\"';
        j(str);
        if (this.q >= this.r) {
            k();
        }
        char[] cArr2 = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[EDGE_INSN: B:18:0x003f->B:19:0x003f BREAK  A[LOOP:1: B:12:0x0037->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:1: B:12:0x0037->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2 A[EDGE_INSN: B:58:0x00a2->B:59:0x00a2 BREAK  A[LOOP:3: B:52:0x009a->B:70:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:3: B:52:0x009a->B:70:?, LOOP_END, SYNTHETIC] */
    @Override // com.flurry.a.b.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(char[] cArr, int i, int i2) {
        char c;
        char c2;
        h("write text value");
        if (this.q >= this.r) {
            k();
        }
        char[] cArr2 = this.o;
        int i3 = this.q;
        this.q = i3 + 1;
        cArr2[i3] = '\"';
        if (this.m == null) {
            if (this.l == 0) {
                int i4 = i2 + i;
                int[] iArr = this.k;
                int length = iArr.length;
                int i5 = i;
                while (i5 < i4) {
                    int i6 = i5;
                    do {
                        char c3 = cArr[i6];
                        if (c3 < length && iArr[c3] != 0) {
                            break;
                        } else {
                            i6++;
                        }
                    } while (i6 < i4);
                    int i7 = i6 - i5;
                    if (i7 < 32) {
                        if (this.q + i7 > this.r) {
                            k();
                        }
                        if (i7 > 0) {
                            System.arraycopy(cArr, i5, this.o, this.q, i7);
                            this.q += i7;
                        }
                    } else {
                        k();
                        this.j.write(cArr, i5, i7);
                    }
                    if (i6 >= i4) {
                        break;
                    }
                    i5 = i6 + 1;
                    char c4 = cArr[i6];
                    b(c4, iArr[c4]);
                }
            } else {
                int i8 = this.l;
                int i9 = i2 + i;
                int[] iArr2 = this.k;
                int min = Math.min(iArr2.length, i8 + 1);
                int i10 = 0;
                int i11 = i;
                while (i11 < i9) {
                    int i12 = i11;
                    while (true) {
                        c = cArr[i12];
                        if (c < min) {
                            i10 = iArr2[c];
                            if (i10 != 0) {
                                break;
                            }
                            i12++;
                            if (i12 < i9) {
                                break;
                            }
                        } else {
                            if (c > i8) {
                                i10 = -1;
                                break;
                            }
                            i12++;
                            if (i12 < i9) {
                            }
                        }
                    }
                    int i13 = i12 - i11;
                    if (i13 < 32) {
                        if (this.q + i13 > this.r) {
                            k();
                        }
                        if (i13 > 0) {
                            System.arraycopy(cArr, i11, this.o, this.q, i13);
                            this.q += i13;
                        }
                    } else {
                        k();
                        this.j.write(cArr, i11, i13);
                    }
                    if (i12 >= i9) {
                        break;
                    }
                    i11 = i12 + 1;
                    b(c, i10);
                }
            }
        } else {
            int i14 = i2 + i;
            int[] iArr3 = this.k;
            int i15 = this.l <= 0 ? ThemeParser.PARSER_CONFIG_ALL : this.l;
            int min2 = Math.min(iArr3.length, i15 + 1);
            com.flurry.a.b.a.c.a aVar = this.m;
            int i16 = 0;
            int i17 = i;
            while (i17 < i14) {
                int i18 = i17;
                while (true) {
                    c2 = cArr[i18];
                    if (c2 < min2) {
                        i16 = iArr3[c2];
                        if (i16 != 0) {
                            break;
                        }
                        i18++;
                        if (i18 < i14) {
                            break;
                        }
                    } else {
                        if (c2 > i15) {
                            i16 = -1;
                            break;
                        }
                        r b = aVar.b();
                        this.n = b;
                        if (b != null) {
                            i16 = -2;
                            break;
                        }
                        i18++;
                        if (i18 < i14) {
                        }
                    }
                }
                int i19 = i18 - i17;
                if (i19 < 32) {
                    if (this.q + i19 > this.r) {
                        k();
                    }
                    if (i19 > 0) {
                        System.arraycopy(cArr, i17, this.o, this.q, i19);
                        this.q += i19;
                    }
                } else {
                    k();
                    this.j.write(cArr, i17, i19);
                }
                if (i18 >= i14) {
                    break;
                }
                i17 = i18 + 1;
                b(c2, i16);
            }
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr3 = this.o;
        int i20 = this.q;
        this.q = i20 + 1;
        cArr3[i20] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void b(r rVar) {
        h("write text value");
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '\"';
        char[] b = rVar.b();
        int length = b.length;
        if (length < 32) {
            if (length > this.r - this.q) {
                k();
            }
            System.arraycopy(b, 0, this.o, this.q, length);
            this.q += length;
        } else {
            k();
            this.j.write(b, 0, length);
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr2 = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr2[i2] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void c(String str) {
        int length = str.length();
        int i = this.r - this.q;
        if (i == 0) {
            k();
            i = this.r - this.q;
        }
        if (i >= length) {
            str.getChars(0, length, this.o, this.q);
            this.q += length;
            return;
        }
        int i2 = this.r - this.q;
        str.getChars(0, i2, this.o, this.q);
        this.q += i2;
        k();
        int length2 = str.length() - i2;
        while (length2 > this.r) {
            int i3 = this.r;
            str.getChars(i2, i2 + i3, this.o, 0);
            this.p = 0;
            this.q = i3;
            k();
            i2 += i3;
            length2 -= i3;
        }
        str.getChars(i2, i2 + length2, this.o, 0);
        this.p = 0;
        this.q = length2;
    }

    @Override // com.flurry.a.b.a.e
    public final void a(char[] cArr, int i) {
        if (i < 32) {
            if (i > this.r - this.q) {
                k();
            }
            System.arraycopy(cArr, 0, this.o, this.q, i);
            this.q += i;
            return;
        }
        k();
        this.j.write(cArr, 0, i);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(char c) {
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = c;
    }

    @Override // com.flurry.a.b.a.e
    public final void a(com.flurry.a.b.a.a aVar, byte[] bArr, int i) {
        h("write binary value");
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr[i2] = '\"';
        int i3 = 0;
        int i4 = i + 0;
        int i5 = i4 - 3;
        int i6 = this.r - 6;
        int c = aVar.c() >> 2;
        while (i3 <= i5) {
            if (this.q > i6) {
                k();
            }
            int i7 = i3 + 1;
            int i8 = i7 + 1;
            int i9 = ((bArr[i3] << 8) | (bArr[i7] & 255)) << 8;
            i3 = i8 + 1;
            this.q = aVar.a(i9 | (bArr[i8] & 255), this.o, this.q);
            c--;
            if (c <= 0) {
                char[] cArr2 = this.o;
                int i10 = this.q;
                this.q = i10 + 1;
                cArr2[i10] = '\\';
                char[] cArr3 = this.o;
                int i11 = this.q;
                this.q = i11 + 1;
                cArr3[i11] = 'n';
                c = aVar.c() >> 2;
            }
        }
        int i12 = i4 - i3;
        if (i12 > 0) {
            if (this.q > i6) {
                k();
            }
            int i13 = i3 + 1;
            int i14 = bArr[i3] << 16;
            if (i12 == 2) {
                i14 |= (bArr[i13] & 255) << 8;
            }
            this.q = aVar.a(i14, i12, this.o, this.q);
        }
        if (this.q >= this.r) {
            k();
        }
        char[] cArr4 = this.o;
        int i15 = this.q;
        this.q = i15 + 1;
        cArr4[i15] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void a(int i) {
        h("write number");
        if (this.d) {
            if (this.q + 13 >= this.r) {
                k();
            }
            char[] cArr = this.o;
            int i2 = this.q;
            this.q = i2 + 1;
            cArr[i2] = '\"';
            this.q = com.flurry.a.b.a.c.f.a(i, this.o, this.q);
            char[] cArr2 = this.o;
            int i3 = this.q;
            this.q = i3 + 1;
            cArr2[i3] = '\"';
            return;
        }
        if (this.q + 11 >= this.r) {
            k();
        }
        this.q = com.flurry.a.b.a.c.f.a(i, this.o, this.q);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(long j) {
        h("write number");
        if (this.d) {
            if (this.q + 23 >= this.r) {
                k();
            }
            char[] cArr = this.o;
            int i = this.q;
            this.q = i + 1;
            cArr[i] = '\"';
            this.q = com.flurry.a.b.a.c.f.a(j, this.o, this.q);
            char[] cArr2 = this.o;
            int i2 = this.q;
            this.q = i2 + 1;
            cArr2[i2] = '\"';
            return;
        }
        if (this.q + 21 >= this.r) {
            k();
        }
        this.q = com.flurry.a.b.a.c.f.a(j, this.o, this.q);
    }

    @Override // com.flurry.a.b.a.e
    public final void a(BigInteger bigInteger) {
        h("write number");
        if (bigInteger == null) {
            i();
        } else if (this.d) {
            b(bigInteger);
        } else {
            c(bigInteger.toString());
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(double d) {
        if (this.d || ((Double.isNaN(d) || Double.isInfinite(d)) && a(com.flurry.a.b.a.f.QUOTE_NON_NUMERIC_NUMBERS))) {
            b(String.valueOf(d));
        } else {
            h("write number");
            c(String.valueOf(d));
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(float f) {
        if (this.d || ((Float.isNaN(f) || Float.isInfinite(f)) && a(com.flurry.a.b.a.f.QUOTE_NON_NUMERIC_NUMBERS))) {
            b(String.valueOf(f));
        } else {
            h("write number");
            c(String.valueOf(f));
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void a(BigDecimal bigDecimal) {
        h("write number");
        if (bigDecimal == null) {
            i();
        } else if (this.d) {
            b(bigDecimal);
        } else {
            c(bigDecimal.toString());
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void e(String str) {
        h("write number");
        if (this.d) {
            b((Object) str);
        } else {
            c(str);
        }
    }

    private final void b(Object obj) {
        if (this.q >= this.r) {
            k();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '\"';
        c(obj.toString());
        if (this.q >= this.r) {
            k();
        }
        char[] cArr2 = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr2[i2] = '\"';
    }

    @Override // com.flurry.a.b.a.e
    public final void a(boolean z) {
        int i;
        h("write boolean value");
        if (this.q + 5 >= this.r) {
            k();
        }
        int i2 = this.q;
        char[] cArr = this.o;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.q = i + 1;
    }

    @Override // com.flurry.a.b.a.e
    public final void f() {
        h("write null value");
        i();
    }

    @Override // com.flurry.a.b.a.b.b
    protected final void h(String str) {
        char c;
        int k = this.e.k();
        if (k == 5) {
            i("Can not " + str + ", expecting field name");
        }
        if (this.a == null) {
            switch (k) {
                case 1:
                    c = ',';
                    break;
                case 2:
                    c = ':';
                    break;
                case 3:
                    c = ' ';
                    break;
                default:
                    return;
            }
            if (this.q >= this.r) {
                k();
            }
            this.o[this.q] = c;
            this.q++;
            return;
        }
        switch (k) {
            case 0:
                if (this.e.a()) {
                    this.a.g(this);
                    return;
                } else {
                    if (this.e.c()) {
                        this.a.h(this);
                        return;
                    }
                    return;
                }
            case 1:
                this.a.f(this);
                return;
            case 2:
                this.a.d(this);
                return;
            case 3:
                this.a.a(this);
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    @Override // com.flurry.a.b.a.e
    public final void g() {
        k();
        if (this.j != null && a(com.flurry.a.b.a.f.FLUSH_PASSED_TO_STREAM)) {
            this.j.flush();
        }
    }

    @Override // com.flurry.a.b.a.b.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.o != null && a(com.flurry.a.b.a.f.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                g h2 = h();
                if (h2.a()) {
                    c();
                } else if (!h2.c()) {
                    break;
                } else {
                    e();
                }
            }
        }
        k();
        if (this.j != null) {
            if (this.i.b() || a(com.flurry.a.b.a.f.AUTO_CLOSE_TARGET)) {
                this.j.close();
            } else if (a(com.flurry.a.b.a.f.FLUSH_PASSED_TO_STREAM)) {
                this.j.flush();
            }
        }
        char[] cArr = this.o;
        if (cArr != null) {
            this.o = null;
            this.i.b(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:2: B:14:0x0041->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[LOOP:4: B:52:0x0096->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void j(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        char c2;
        int i8;
        char c3;
        int i9;
        int length = str.length();
        if (length > this.r) {
            k();
            int length2 = str.length();
            int i10 = 0;
            do {
                int i11 = i10;
                int i12 = this.r;
                if (i11 + i12 > length2) {
                    i12 = length2 - i11;
                }
                str.getChars(i11, i11 + i12, this.o, 0);
                if (this.m != null) {
                    int[] iArr = this.k;
                    char c4 = this.l <= 0 ? (char) 65535 : this.l;
                    int min = Math.min(iArr.length, this.l + 1);
                    com.flurry.a.b.a.c.a aVar = this.m;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < i12) {
                        while (true) {
                            c3 = this.o[i13];
                            if (c3 < min) {
                                i9 = iArr[c3];
                                if (i9 != 0) {
                                    break;
                                }
                                i15 = i9;
                                i13++;
                                if (i13 < i12) {
                                    i9 = i15;
                                    break;
                                }
                            } else {
                                if (c3 > c4) {
                                    i9 = -1;
                                    break;
                                }
                                r b = aVar.b();
                                this.n = b;
                                if (b != null) {
                                    i9 = -2;
                                    break;
                                }
                                i13++;
                                if (i13 < i12) {
                                }
                            }
                        }
                        int i16 = i13 - i14;
                        if (i16 > 0) {
                            this.j.write(this.o, i14, i16);
                            if (i13 >= i12) {
                                break;
                            }
                        }
                        int i17 = i13 + 1;
                        i13 = i17;
                        i14 = a(this.o, i17, i12, c3, i9);
                        i15 = i9;
                    }
                } else if (this.l != 0) {
                    int i18 = this.l;
                    int[] iArr2 = this.k;
                    int min2 = Math.min(iArr2.length, this.l + 1);
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < i12) {
                        while (true) {
                            c2 = this.o[i19];
                            if (c2 < min2) {
                                i8 = iArr2[c2];
                                if (i8 != 0) {
                                    break;
                                }
                                i21 = i8;
                                i19++;
                                if (i19 < i12) {
                                    i8 = i21;
                                    break;
                                }
                            } else {
                                if (c2 > i18) {
                                    i8 = -1;
                                    break;
                                }
                                i19++;
                                if (i19 < i12) {
                                }
                            }
                        }
                        int i22 = i19 - i20;
                        if (i22 > 0) {
                            this.j.write(this.o, i20, i22);
                            if (i19 >= i12) {
                                break;
                            }
                        }
                        int i23 = i19 + 1;
                        i19 = i23;
                        i20 = a(this.o, i23, i12, c2, i8);
                        i21 = i8;
                    }
                } else {
                    int[] iArr3 = this.k;
                    int length3 = iArr3.length;
                    int i24 = 0;
                    int i25 = 0;
                    while (i25 < i12) {
                        do {
                            c = this.o[i25];
                            if (c < length3 && iArr3[c] != 0) {
                                break;
                            } else {
                                i25++;
                            }
                        } while (i25 < i12);
                        int i26 = i25 - i24;
                        if (i26 > 0) {
                            this.j.write(this.o, i24, i26);
                            if (i25 >= i12) {
                                break;
                            }
                        }
                        int i27 = i25 + 1;
                        i24 = a(this.o, i27, i12, c, iArr3[c]);
                        i25 = i27;
                    }
                }
                i10 = i11 + i12;
            } while (i10 < length2);
            return;
        }
        if (this.q + length > this.r) {
            k();
        }
        str.getChars(0, length, this.o, this.q);
        if (this.m != null) {
            int i28 = this.q + length;
            int[] iArr4 = this.k;
            int i29 = this.l <= 0 ? ThemeParser.PARSER_CONFIG_ALL : this.l;
            int min3 = Math.min(iArr4.length, i29 + 1);
            com.flurry.a.b.a.c.a aVar2 = this.m;
            while (this.q < i28) {
                do {
                    char c5 = this.o[this.q];
                    if (c5 < min3) {
                        i5 = iArr4[c5];
                        if (i5 != 0) {
                            i6 = this.q - this.p;
                            if (i6 <= 0) {
                                this.j.write(this.o, this.p, i6);
                            }
                            this.q++;
                            a(c5, i5);
                        }
                        i7 = this.q + 1;
                        this.q = i7;
                    } else {
                        if (c5 > i29) {
                            i5 = -1;
                        } else {
                            r b2 = aVar2.b();
                            this.n = b2;
                            if (b2 != null) {
                                i5 = -2;
                            }
                            i7 = this.q + 1;
                            this.q = i7;
                        }
                        i6 = this.q - this.p;
                        if (i6 <= 0) {
                        }
                        this.q++;
                        a(c5, i5);
                    }
                } while (i7 < i28);
                return;
            }
            return;
        }
        if (this.l != 0) {
            int i30 = this.l;
            int i31 = this.q + length;
            int[] iArr5 = this.k;
            int min4 = Math.min(iArr5.length, this.l + 1);
            while (this.q < i31) {
                do {
                    char c6 = this.o[this.q];
                    if (c6 < min4) {
                        i2 = iArr5[c6];
                        if (i2 != 0) {
                            i3 = this.q - this.p;
                            if (i3 <= 0) {
                                this.j.write(this.o, this.p, i3);
                            }
                            this.q++;
                            a(c6, i2);
                        }
                        i4 = this.q + 1;
                        this.q = i4;
                    } else {
                        if (c6 > i30) {
                            i2 = -1;
                            i3 = this.q - this.p;
                            if (i3 <= 0) {
                            }
                            this.q++;
                            a(c6, i2);
                        }
                        i4 = this.q + 1;
                        this.q = i4;
                    }
                } while (i4 < i31);
                return;
            }
            return;
        }
        int i32 = length + this.q;
        int[] iArr6 = this.k;
        int length4 = iArr6.length;
        while (this.q < i32) {
            do {
                char c7 = this.o[this.q];
                if (c7 >= length4 || iArr6[c7] == 0) {
                    i = this.q + 1;
                    this.q = i;
                } else {
                    int i33 = this.q - this.p;
                    if (i33 > 0) {
                        this.j.write(this.o, this.p, i33);
                    }
                    char[] cArr = this.o;
                    int i34 = this.q;
                    this.q = i34 + 1;
                    char c8 = cArr[i34];
                    a(c8, iArr6[c8]);
                }
            } while (i < i32);
            return;
        }
    }

    private final void i() {
        if (this.q + 4 >= this.r) {
            k();
        }
        int i = this.q;
        char[] cArr = this.o;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.q = i4 + 1;
    }

    private final void a(char c, int i) {
        String a;
        int i2;
        if (i >= 0) {
            if (this.q >= 2) {
                int i3 = this.q - 2;
                this.p = i3;
                this.o[i3] = '\\';
                this.o[i3 + 1] = (char) i;
                return;
            }
            char[] cArr = this.s;
            if (cArr == null) {
                cArr = j();
            }
            this.p = this.q;
            cArr[1] = (char) i;
            this.j.write(cArr, 0, 2);
            return;
        }
        if (i != -2) {
            if (this.q >= 6) {
                char[] cArr2 = this.o;
                int i4 = this.q - 6;
                this.p = i4;
                cArr2[i4] = '\\';
                int i5 = i4 + 1;
                cArr2[i5] = 'u';
                if (c > 255) {
                    int i6 = (c >> '\b') & 255;
                    int i7 = i5 + 1;
                    cArr2[i7] = g[i6 >> 4];
                    i2 = i7 + 1;
                    cArr2[i2] = g[i6 & 15];
                    c = (char) (c & 255);
                } else {
                    int i8 = i5 + 1;
                    cArr2[i8] = '0';
                    i2 = i8 + 1;
                    cArr2[i2] = '0';
                }
                int i9 = i2 + 1;
                cArr2[i9] = g[c >> 4];
                cArr2[i9 + 1] = g[c & 15];
                return;
            }
            char[] cArr3 = this.s;
            if (cArr3 == null) {
                cArr3 = j();
            }
            this.p = this.q;
            if (c > 255) {
                int i10 = (c >> '\b') & 255;
                int i11 = c & 255;
                cArr3[10] = g[i10 >> 4];
                cArr3[11] = g[i10 & 15];
                cArr3[12] = g[i11 >> 4];
                cArr3[13] = g[i11 & 15];
                this.j.write(cArr3, 8, 6);
                return;
            }
            cArr3[6] = g[c >> 4];
            cArr3[7] = g[c & 15];
            this.j.write(cArr3, 2, 6);
            return;
        }
        if (this.n == null) {
            a = this.m.b().a();
        } else {
            a = this.n.a();
            this.n = null;
        }
        int length = a.length();
        if (this.q >= length) {
            int i12 = this.q - length;
            this.p = i12;
            a.getChars(0, length, this.o, i12);
        } else {
            this.p = this.q;
            this.j.write(a);
        }
    }

    private final int a(char[] cArr, int i, int i2, char c, int i3) {
        String a;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i3;
                return i5;
            }
            char[] cArr2 = this.s;
            if (cArr2 == null) {
                cArr2 = j();
            }
            cArr2[1] = (char) i3;
            this.j.write(cArr2, 0, 2);
            return i;
        }
        if (i3 != -2) {
            if (i > 5 && i < i2) {
                int i6 = i - 6;
                int i7 = i6 + 1;
                cArr[i6] = '\\';
                int i8 = i7 + 1;
                cArr[i7] = 'u';
                if (c > 255) {
                    int i9 = (c >> '\b') & 255;
                    int i10 = i8 + 1;
                    cArr[i8] = g[i9 >> 4];
                    i4 = i10 + 1;
                    cArr[i10] = g[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr[i8] = '0';
                    i4 = i11 + 1;
                    cArr[i11] = '0';
                }
                int i12 = i4 + 1;
                cArr[i4] = g[c >> 4];
                cArr[i12] = g[c & 15];
                return i12 - 5;
            }
            char[] cArr3 = this.s;
            if (cArr3 == null) {
                cArr3 = j();
            }
            this.p = this.q;
            if (c > 255) {
                int i13 = (c >> '\b') & 255;
                int i14 = c & 255;
                cArr3[10] = g[i13 >> 4];
                cArr3[11] = g[i13 & 15];
                cArr3[12] = g[i14 >> 4];
                cArr3[13] = g[i14 & 15];
                this.j.write(cArr3, 8, 6);
                return i;
            }
            cArr3[6] = g[c >> 4];
            cArr3[7] = g[c & 15];
            this.j.write(cArr3, 2, 6);
            return i;
        }
        if (this.n == null) {
            a = this.m.b().a();
        } else {
            a = this.n.a();
            this.n = null;
        }
        int length = a.length();
        if (i >= length && i < i2) {
            int i15 = i - length;
            a.getChars(0, length, cArr, i15);
            return i15;
        }
        this.j.write(a);
        return i;
    }

    private final void b(char c, int i) {
        String a;
        int i2;
        if (i >= 0) {
            if (this.q + 2 > this.r) {
                k();
            }
            char[] cArr = this.o;
            int i3 = this.q;
            this.q = i3 + 1;
            cArr[i3] = '\\';
            char[] cArr2 = this.o;
            int i4 = this.q;
            this.q = i4 + 1;
            cArr2[i4] = (char) i;
            return;
        }
        if (i != -2) {
            if (this.q + 2 > this.r) {
                k();
            }
            int i5 = this.q;
            char[] cArr3 = this.o;
            int i6 = i5 + 1;
            cArr3[i5] = '\\';
            int i7 = i6 + 1;
            cArr3[i6] = 'u';
            if (c > 255) {
                int i8 = (c >> '\b') & 255;
                int i9 = i7 + 1;
                cArr3[i7] = g[i8 >> 4];
                i2 = i9 + 1;
                cArr3[i9] = g[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i7 + 1;
                cArr3[i7] = '0';
                i2 = i10 + 1;
                cArr3[i10] = '0';
            }
            int i11 = i2 + 1;
            cArr3[i2] = g[c >> 4];
            cArr3[i11] = g[c & 15];
            this.q = i11;
            return;
        }
        if (this.n == null) {
            a = this.m.b().a();
        } else {
            a = this.n.a();
            this.n = null;
        }
        int length = a.length();
        if (this.q + length > this.r) {
            k();
            if (length > this.r) {
                this.j.write(a);
                return;
            }
        }
        a.getChars(0, length, this.o, this.q);
        this.q += length;
    }

    private char[] j() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.s = cArr;
        return cArr;
    }

    private void k() {
        int i = this.q - this.p;
        if (i > 0) {
            int i2 = this.p;
            this.p = 0;
            this.q = 0;
            this.j.write(this.o, i2, i);
        }
    }
}
