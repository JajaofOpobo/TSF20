package com.censivn.C3DEngine.p031b.p038f;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.f.h */
/* loaded from: classes.dex */
public class C0974h extends C0980j {

    /* renamed from: a */
    protected float f2914a;

    /* renamed from: b */
    protected float f2915b;

    /* renamed from: c */
    protected boolean f2916c;

    /* renamed from: d */
    private int f2917d;

    /* renamed from: e */
    private int f2918e;

    public C0974h(float f, float f2, boolean z) {
        this(f, f2, 1, 1, new Color4(0, 0, 0, 0), false, z, false);
    }

    public C0974h(float f, float f2, boolean z, boolean z2) {
        this(f, f2, 1, 1, new Color4(0, 0, 0, 0), false, z, z2);
    }

    public C0974h(float f, float f2, int i, int i2, boolean z) {
        this(f, f2, i, i2, new Color4(0, 0, 0, 0), false, z, false);
    }

    public C0974h(float f, float f2, int i, int i2, Color4 color4, boolean z, boolean z2, boolean z3) {
        super(i * 4 * i2, i * 2 * i2, true, true, Boolean.valueOf(z3));
        this.f2916c = false;
        this.f2917d = i;
        this.f2918e = i2;
        if (z2) {
            f = ((int) f) * C0892a.f2565a;
            f2 = ((int) f2) * C0892a.f2565a;
        }
        this.f2914a = f;
        this.f2915b = f2;
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
                    if (i6 <= i) {
                        vertices().addVertex((i6 * f3) - f5, (i4 * f4) - f6, 0.0f, i6 / i, i4 / i2, 0.0f, 0.0f, -1.0f, color4.f2525r, color4.f2524g, color4.f2523b, color4.f2522a);
                        i5 = i6 + 1;
                    }
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
                    if (i10 <= i) {
                        vertices().addVertex(0.0f - ((i10 * f3) - f5), (i8 * f4) - f6, 0.0f, 1.0f - (i10 / i), i8 / i2, 0.0f, 0.0f, -1.0f, color4.f2525r, color4.f2524g, color4.f2523b, color4.f2522a);
                        i9 = i10 + 1;
                    }
                }
                i7 = i8 + 1;
            }
        }
        int i11 = i + 1;
        int i12 = 1;
        while (true) {
            int i13 = i12;
            if (i13 <= i2) {
                for (int i14 = 1; i14 <= i; i14++) {
                    int i15 = (i13 * i11) + i14;
                    int i16 = i15 - i11;
                    C4189x.m598a(this, i16 - 1, i16, i15, i15 - 1);
                }
                i12 = i13 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void draw() {
        if (this.f2916c) {
            this.f2916c = false;
            updatePointsVBO();
        }
        super.draw();
    }

    /* renamed from: a */
    public void m10374a() {
        if (this.f2916c) {
            this.f2916c = false;
            updatePointsVBO();
        }
    }

    /* renamed from: a */
    public void m10373a(float f) {
        if (this.f2914a != f) {
            this.f2914a = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.f2917d;
                for (int i = 0; i <= this.f2918e; i++) {
                    for (int i2 = 0; i2 <= this.f2917d; i2++) {
                        points().pxX(((this.f2917d + 1) * i) + i2, f2 - (i2 * f3));
                    }
                }
            } else {
                points().pxX(0, f2);
                points().pxX(1, -f2);
                points().pxX(2, f2);
                points().pxX(3, -f2);
            }
            if (useVBO()) {
                this.f2916c = true;
            }
        }
    }

    /* renamed from: b */
    public float m10372b() {
        return this.f2915b;
    }

    /* renamed from: b */
    public void m10371b(float f) {
        if (this.f2915b != f) {
            this.f2915b = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.f2918e;
                for (int i = 0; i <= this.f2918e; i++) {
                    for (int i2 = 0; i2 <= this.f2917d; i2++) {
                        points().pxY(((this.f2917d + 1) * i) + i2, (-f2) + (i * f3));
                    }
                }
            } else {
                points().pxY(0, -f2);
                points().pxY(1, -f2);
                points().pxY(2, f2);
                points().pxY(3, f2);
            }
            if (useVBO()) {
                this.f2916c = true;
            }
        }
    }
}
