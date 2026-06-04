package com.censivn.C3DEngine.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
public class b extends v {
    protected float A;
    protected float B;
    private int C;
    private int a;

    public b(float f, float f2) {
        this(f, f2, 1, 1, new Color4(255, 50, 0, 100), false, true);
    }

    public b(float f, float f2, byte b) {
        this(f, f2, 1, 1, new Color4(255, 50, 0, 100), false, false);
    }

    public b(float f, float f2, int i, int i2) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), false, true);
    }

    public b(float f, float f2, int i, int i2, boolean z) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), false, z);
    }

    public b(float f, float f2, int i, int i2, boolean z, boolean z2) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), z, z2);
    }

    private b(float f, float f2, int i, int i2, Color4 color4, boolean z, boolean z2) {
        super(i * 4 * i2, i * 2 * i2);
        this.a = i;
        this.C = i2;
        if (z2) {
            f = ((int) f) * com.censivn.C3DEngine.a.a;
            f2 = ((int) f2) * com.censivn.C3DEngine.a.a;
        }
        this.A = f;
        this.B = f2;
        float f3 = f / i;
        float f4 = f2 / i2;
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        if (z) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 > i2) {
                    break;
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 > i) {
                        break;
                    }
                    short s = color4.r;
                    short s2 = color4.g;
                    short s3 = color4.b;
                    short s4 = color4.a;
                    x().a((i6 * f3) - f5, (i4 * f4) - f6, 0.0f, i6 / i, 1.0f - (i4 / i2), 0.0f, 0.0f, -1.0f);
                    i5 = i6 + 1;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 > i2) {
                    break;
                }
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    if (i10 > i) {
                        break;
                    }
                    short s5 = color4.r;
                    short s6 = color4.g;
                    short s7 = color4.b;
                    short s8 = color4.a;
                    x().a(0.0f - ((i10 * f3) - f5), (i8 * f4) - f6, 0.0f, 1.0f - (i10 / i), 1.0f - (i8 / i2), 0.0f, 0.0f, -1.0f);
                    i9 = i10 + 1;
                }
                i7 = i8 + 1;
            }
        }
        int i11 = i + 1;
        for (int i12 = 1; i12 <= i2; i12++) {
            for (int i13 = 1; i13 <= i; i13++) {
                int i14 = (i12 * i11) + i13;
                int i15 = i14 - i11;
                com.censivn.C3DEngine.h.a.a(this, i15 - 1, i15, i14, i14 - 1);
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        x().d().set(0, ((i3 * i) + (i5 * i)) / i2, ((i4 * i) + (i6 * i)) / i2);
        x().d().set(1, (i3 * i) / i2, ((i4 * i) + (i6 * i)) / i2);
        x().d().set(2, ((i3 * i) + (i5 * i)) / i2, (i4 * i) / i2);
        x().d().set(3, (i3 * i) / i2, (i4 * i) / i2);
    }

    public float n_() {
        return this.A;
    }

    public void a_(float f) {
        if (this.A != f) {
            this.A = f;
            float f2 = f / 2.0f;
            if (E().size() > 4) {
                float f3 = f / this.a;
                for (int i = 0; i <= this.C; i++) {
                    for (int i2 = 0; i2 <= this.a; i2++) {
                        E().pxX(((this.a + 1) * i) + i2, f2 - (i2 * f3));
                    }
                }
            } else {
                E().pxX(0, f2);
                E().pxX(1, -f2);
                E().pxX(2, f2);
                E().pxX(3, -f2);
            }
            ag();
        }
    }

    public float o_() {
        return this.B;
    }

    public void h(float f) {
        if (this.B != f) {
            this.B = f;
            float f2 = f / 2.0f;
            if (E().size() > 4) {
                float f3 = f / this.C;
                for (int i = 0; i <= this.C; i++) {
                    for (int i2 = 0; i2 <= this.a; i2++) {
                        E().pxY(((this.a + 1) * i) + i2, (-f2) + (i * f3));
                    }
                }
            } else {
                E().pxY(0, -f2);
                E().pxY(1, -f2);
                E().pxY(2, f2);
                E().pxY(3, f2);
            }
            ag();
        }
    }
}
