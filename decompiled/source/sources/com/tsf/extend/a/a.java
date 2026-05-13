package com.tsf.extend.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* loaded from: classes.dex */
public class a {
    private static final double[] e = new double[ItemInfo.APP_INTENT];
    public int a;
    private char b;
    private CharSequence c;
    private int d;

    public a(CharSequence charSequence, int i) {
        this.c = charSequence;
        this.a = i;
        this.d = charSequence.length();
        this.b = charSequence.charAt(i);
    }

    private char f() {
        if (this.a < this.d) {
            this.a++;
        }
        if (this.a == this.d) {
            return (char) 0;
        }
        return this.c.charAt(this.a);
    }

    public void a() {
        while (this.a < this.d && Character.isWhitespace(this.c.charAt(this.a))) {
            c();
        }
    }

    public void b() {
        while (this.a < this.d) {
            switch (this.c.charAt(this.a)) {
                case '\t':
                case '\n':
                case ' ':
                case ',':
                    c();
                default:
                    return;
            }
        }
    }

    public void c() {
        this.b = f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8 A[LOOP:2: B:58:0x00d8->B:59:0x00e0, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float d() {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.a.a.d():float");
    }

    private void a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public static float a(int i, int i2) {
        if (i2 < -125 || i == 0) {
            return 0.0f;
        }
        if (i2 >= 128) {
            return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
        } else if (i2 == 0) {
            return i;
        } else {
            if (i >= 67108864) {
                i++;
            }
            return (float) (i2 > 0 ? i * e[i2] : i / e[-i2]);
        }
    }

    static {
        for (int i = 0; i < e.length; i++) {
            e[i] = Math.pow(10.0d, i);
        }
    }

    public float e() {
        a();
        float d = d();
        b();
        return d;
    }
}
