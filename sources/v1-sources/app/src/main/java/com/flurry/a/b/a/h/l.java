package com.flurry.a.b.a.h;

import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.math.BigDecimal;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {
    static final char[] a = new char[0];
    private final a b;
    private char[] c;
    private int d;
    private int e;
    private ArrayList f;
    private boolean g = false;
    private int h;
    private char[] i;
    private int j;
    private String k;
    private char[] l;

    public l(a aVar) {
        this.b = aVar;
    }

    public final void a() {
        if (this.b == null) {
            m();
        } else if (this.i != null) {
            m();
            char[] cArr = this.i;
            this.i = null;
            this.b.a(c.TEXT_BUFFER, cArr);
        }
    }

    private void m() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            n();
        }
    }

    public final void a(char[] cArr, int i, int i2) {
        this.k = null;
        this.l = null;
        this.c = cArr;
        this.d = i;
        this.e = i2;
        if (this.g) {
            n();
        }
    }

    public final void b(char[] cArr, int i, int i2) {
        this.c = null;
        this.d = -1;
        this.e = 0;
        this.k = null;
        this.l = null;
        if (this.g) {
            n();
        } else if (this.i == null) {
            this.i = b(i2);
        }
        this.h = 0;
        this.j = 0;
        if (this.d >= 0) {
            c(i2);
        }
        this.k = null;
        this.l = null;
        char[] cArr2 = this.i;
        int length = cArr2.length - this.j;
        if (length < i2) {
            if (length > 0) {
                System.arraycopy(cArr, i, cArr2, this.j, length);
                i += length;
                i2 -= length;
            }
            d(i2);
            System.arraycopy(cArr, i, this.i, 0, i2);
            this.j = i2;
            return;
        }
        System.arraycopy(cArr, i, cArr2, this.j, i2);
        this.j += i2;
    }

    public final void a(String str) {
        this.c = null;
        this.d = -1;
        this.e = 0;
        this.k = str;
        this.l = null;
        if (this.g) {
            n();
        }
        this.j = 0;
    }

    private final char[] b(int i) {
        return this.b != null ? this.b.a(c.TEXT_BUFFER, i) : new char[Math.max(i, ThemeShellDescription.PICKER_MENU)];
    }

    private final void n() {
        this.g = false;
        this.f.clear();
        this.h = 0;
        this.j = 0;
    }

    public final int b() {
        if (this.d >= 0) {
            return this.e;
        }
        if (this.l != null) {
            return this.l.length;
        }
        if (this.k != null) {
            return this.k.length();
        }
        return this.h + this.j;
    }

    public final int c() {
        if (this.d >= 0) {
            return this.d;
        }
        return 0;
    }

    public final char[] d() {
        if (this.d >= 0) {
            return this.c;
        }
        if (this.l != null) {
            return this.l;
        }
        if (this.k != null) {
            char[] charArray = this.k.toCharArray();
            this.l = charArray;
            return charArray;
        }
        if (!this.g) {
            return this.i;
        }
        return f();
    }

    public final String e() {
        if (this.k == null) {
            if (this.l != null) {
                this.k = new String(this.l);
            } else if (this.d >= 0) {
                if (this.e <= 0) {
                    this.k = "";
                    return "";
                }
                this.k = new String(this.c, this.d, this.e);
            } else {
                int i = this.h;
                int i2 = this.j;
                if (i == 0) {
                    this.k = i2 == 0 ? "" : new String(this.i, 0, i2);
                } else {
                    StringBuilder sb = new StringBuilder(i + i2);
                    if (this.f != null) {
                        int size = this.f.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            char[] cArr = (char[]) this.f.get(i3);
                            sb.append(cArr, 0, cArr.length);
                        }
                    }
                    sb.append(this.i, 0, this.j);
                    this.k = sb.toString();
                }
            }
        }
        return this.k;
    }

    public final char[] f() {
        int i;
        char[] cArr = this.l;
        if (cArr == null) {
            if (this.k != null) {
                cArr = this.k.toCharArray();
            } else if (this.d < 0) {
                int b = b();
                if (b <= 0) {
                    cArr = a;
                } else {
                    char[] cArr2 = new char[b];
                    if (this.f != null) {
                        int size = this.f.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            char[] cArr3 = (char[]) this.f.get(i3);
                            int length = cArr3.length;
                            System.arraycopy(cArr3, 0, cArr2, i2, length);
                            i2 += length;
                        }
                        i = i2;
                    } else {
                        i = 0;
                    }
                    System.arraycopy(this.i, 0, cArr2, i, this.j);
                    cArr = cArr2;
                }
            } else if (this.e <= 0) {
                cArr = a;
            } else {
                cArr = new char[this.e];
                System.arraycopy(this.c, this.d, cArr, 0, this.e);
            }
            this.l = cArr;
        }
        return cArr;
    }

    public final BigDecimal g() {
        if (this.l != null) {
            return new BigDecimal(this.l);
        }
        if (this.d >= 0) {
            return new BigDecimal(this.c, this.d, this.e);
        }
        if (this.h == 0) {
            return new BigDecimal(this.i, 0, this.j);
        }
        return new BigDecimal(f());
    }

    public final double h() {
        return com.flurry.a.b.a.c.e.e(e());
    }

    public final char[] i() {
        if (this.d >= 0) {
            c(1);
        } else {
            char[] cArr = this.i;
            if (cArr == null) {
                this.i = b(0);
            } else if (this.j >= cArr.length) {
                d(1);
            }
        }
        return this.i;
    }

    public final char[] j() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            n();
        }
        char[] cArr = this.i;
        if (cArr == null) {
            char[] b = b(0);
            this.i = b;
            return b;
        }
        return cArr;
    }

    public final int k() {
        return this.j;
    }

    public final void a(int i) {
        this.j = i;
    }

    public final char[] l() {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.g = true;
        this.f.add(this.i);
        int length = this.i.length;
        this.h += length;
        char[] cArr = new char[Math.min(length + (length >> 1), 262144)];
        this.j = 0;
        this.i = cArr;
        return cArr;
    }

    public final String toString() {
        return e();
    }

    private void c(int i) {
        int i2 = this.e;
        this.e = 0;
        char[] cArr = this.c;
        this.c = null;
        int i3 = this.d;
        this.d = -1;
        int i4 = i2 + i;
        if (this.i == null || i4 > this.i.length) {
            this.i = b(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.i, 0, i2);
        }
        this.h = 0;
        this.j = i2;
    }

    private void d(int i) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        char[] cArr = this.i;
        this.g = true;
        this.f.add(cArr);
        this.h += cArr.length;
        int length = cArr.length;
        int i2 = length >> 1;
        if (i2 >= i) {
            i = i2;
        }
        char[] cArr2 = new char[Math.min(262144, length + i)];
        this.j = 0;
        this.i = cArr2;
    }
}
