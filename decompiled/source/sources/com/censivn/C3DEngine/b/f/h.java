package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.Color4;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class h extends j {
    protected float a;
    protected float b;
    protected boolean c;
    private int d;
    private int e;

    public h(float f, float f2, boolean z) {
        this(f, f2, 1, 1, new Color4(0, 0, 0, 0), false, z, false);
    }

    public h(float f, float f2, boolean z, boolean z2) {
        this(f, f2, 1, 1, new Color4(0, 0, 0, 0), false, z, z2);
    }

    public h(float f, float f2, int i, int i2, boolean z) {
        this(f, f2, i, i2, new Color4(0, 0, 0, 0), false, z, false);
    }

    public h(float f, float f2, int i, int i2, Color4 color4, boolean z, boolean z2, boolean z3) {
        super(i * 4 * i2, i * 2 * i2, true, true, Boolean.valueOf(z3));
        this.c = false;
        this.d = i;
        this.e = i2;
        if (z2) {
            f = ((int) f) * com.censivn.C3DEngine.b.b.a.a;
            f2 = ((int) f2) * com.censivn.C3DEngine.b.b.a.a;
        }
        this.a = f;
        this.b = f2;
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
                        vertices().addVertex((i6 * f3) - f5, (i4 * f4) - f6, 0.0f, i6 / i, i4 / i2, 0.0f, 0.0f, -1.0f, color4.r, color4.g, color4.b, color4.a);
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
                        vertices().addVertex(0.0f - ((i10 * f3) - f5), (i8 * f4) - f6, 0.0f, 1.0f - (i10 / i), i8 / i2, 0.0f, 0.0f, -1.0f, color4.r, color4.g, color4.b, color4.a);
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
                    x.a(this, i16 - 1, i16, i15, i15 - 1);
                }
                i12 = i13 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void draw() {
        if (this.c) {
            this.c = false;
            updatePointsVBO();
        }
        super.draw();
    }

    public void a() {
        if (this.c) {
            this.c = false;
            updatePointsVBO();
        }
    }

    public void a(float f) {
        if (this.a != f) {
            this.a = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.d;
                for (int i = 0; i <= this.e; i++) {
                    for (int i2 = 0; i2 <= this.d; i2++) {
                        points().pxX(((this.d + 1) * i) + i2, f2 - (i2 * f3));
                    }
                }
            } else {
                points().pxX(0, f2);
                points().pxX(1, -f2);
                points().pxX(2, f2);
                points().pxX(3, -f2);
            }
            if (useVBO()) {
                this.c = true;
            }
        }
    }

    public float b() {
        return this.b;
    }

    public void b(float f) {
        if (this.b != f) {
            this.b = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.e;
                for (int i = 0; i <= this.e; i++) {
                    for (int i2 = 0; i2 <= this.d; i2++) {
                        points().pxY(((this.d + 1) * i) + i2, (-f2) + (i * f3));
                    }
                }
            } else {
                points().pxY(0, -f2);
                points().pxY(1, -f2);
                points().pxY(2, f2);
                points().pxY(3, f2);
            }
            if (useVBO()) {
                this.c = true;
            }
        }
    }
}
