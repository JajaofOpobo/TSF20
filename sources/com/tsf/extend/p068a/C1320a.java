package com.tsf.extend.p068a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
/* renamed from: com.tsf.extend.a.a */
/* loaded from: classes.dex */
public class C1320a {

    /* renamed from: e */
    private static final double[] f4148e = new double[ItemInfo.APP_INTENT];

    /* renamed from: a */
    public int f4149a;

    /* renamed from: b */
    private char f4150b;

    /* renamed from: c */
    private CharSequence f4151c;

    /* renamed from: d */
    private int f4152d;

    public C1320a(CharSequence charSequence, int i) {
        this.f4151c = charSequence;
        this.f4149a = i;
        this.f4152d = charSequence.length();
        this.f4150b = charSequence.charAt(i);
    }

    /* renamed from: f */
    private char m9016f() {
        if (this.f4149a < this.f4152d) {
            this.f4149a++;
        }
        if (this.f4149a == this.f4152d) {
            return (char) 0;
        }
        return this.f4151c.charAt(this.f4149a);
    }

    /* renamed from: a */
    public void m9024a() {
        while (this.f4149a < this.f4152d && Character.isWhitespace(this.f4151c.charAt(this.f4149a))) {
            m9019c();
        }
    }

    /* renamed from: b */
    public void m9020b() {
        while (this.f4149a < this.f4152d) {
            switch (this.f4151c.charAt(this.f4149a)) {
                case '\t':
                case '\n':
                case ' ':
                case ',':
                    m9019c();
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    public void m9019c() {
        this.f4150b = m9016f();
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float m9018d() {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.p068a.C1320a.m9018d():float");
    }

    /* renamed from: a */
    private void m9023a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    /* renamed from: a */
    public static float m9021a(int i, int i2) {
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
            return (float) (i2 > 0 ? i * f4148e[i2] : i / f4148e[-i2]);
        }
    }

    static {
        for (int i = 0; i < f4148e.length; i++) {
            f4148e[i] = Math.pow(10.0d, i);
        }
    }

    /* renamed from: e */
    public float m9017e() {
        m9024a();
        float m9018d = m9018d();
        m9020b();
        return m9018d;
    }
}
