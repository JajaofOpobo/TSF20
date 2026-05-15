package com.censivn.C3DEngine.b.f;

import com.censivn.C3DEngine.api.element.Color4;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k extends j {
    private int a;
    protected float b;
    protected float c;
    private int d;
    private boolean e;

    public k(float f, float f2) {
        this(f, f2, 1, 1, new Color4(255, 50, 0, 100), false, true, false);
    }

    public k(float f, float f2, boolean z) {
        this(f, f2, 1, 1, new Color4(255, 50, 0, 100), false, z, false);
    }

    public k(float f, float f2, int i, int i2) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), false, true, false);
    }

    public k(float f, float f2, int i, int i2, boolean z) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), false, z, false);
    }

    public k(float f, float f2, int i, int i2, boolean z, boolean z2) {
        this(f, f2, i, i2, new Color4(255, 50, 0, 100), z, z2, false);
    }

    public k(float f, float f2, int i, int i2, Color4 color4, boolean z, boolean z2, boolean z3) {
        super(i * 4 * i2, i * 2 * i2, true, true, Boolean.valueOf(z3));
        this.e = false;
        this.a = i;
        this.d = i2;
        if (z2) {
            f = ((int) f) * com.censivn.C3DEngine.b.b.a.a;
            f2 = ((int) f2) * com.censivn.C3DEngine.b.b.a.a;
        }
        this.b = f;
        this.c = f2;
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
                        vertices().addVertex((i6 * f3) - f5, (i4 * f4) - f6, 0.0f, i6 / i, 1.0f - (i4 / i2), 0.0f, 0.0f, -1.0f, color4.r, color4.g, color4.b, color4.a);
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
                        vertices().addVertex(0.0f - ((i10 * f3) - f5), (i8 * f4) - f6, 0.0f, 1.0f - (i10 / i), 1.0f - (i8 / i2), 0.0f, 0.0f, -1.0f, color4.r, color4.g, color4.b, color4.a);
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

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        vertices().uvs().set(0, ((i3 * i) + (i5 * i)) / i2, ((i4 * i) + (i6 * i)) / i2);
        vertices().uvs().set(1, (i3 * i) / i2, ((i4 * i) + (i6 * i)) / i2);
        vertices().uvs().set(2, ((i3 * i) + (i5 * i)) / i2, (i4 * i) / i2);
        vertices().uvs().set(3, (i3 * i) / i2, (i4 * i) / i2);
    }

    public float b() {
        return this.b;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void draw() {
        if (this.e) {
            this.e = false;
            updatePointsVBO();
        }
        super.draw();
    }

    public void a(float f, float f2) {
        a(f);
        b(f2);
    }

    public void a(float f) {
        if (this.b != f) {
            this.b = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.a;
                for (int i = 0; i <= this.d; i++) {
                    for (int i2 = 0; i2 <= this.a; i2++) {
                        points().pxX(((this.a + 1) * i) + i2, f2 - (i2 * f3));
                    }
                }
            } else {
                points().pxX(0, f2);
                points().pxX(1, -f2);
                points().pxX(2, f2);
                points().pxX(3, -f2);
            }
            if (useVBO()) {
                this.e = true;
            }
        }
    }

    public float c() {
        return this.c;
    }

    public void b(float f) {
        if (this.c != f) {
            this.c = f;
            float f2 = f / 2.0f;
            if (points().size() > 4) {
                float f3 = f / this.d;
                for (int i = 0; i <= this.d; i++) {
                    for (int i2 = 0; i2 <= this.a; i2++) {
                        points().pxY(((this.a + 1) * i) + i2, (-f2) + (i * f3));
                    }
                }
            } else {
                points().pxY(0, -f2);
                points().pxY(1, -f2);
                points().pxY(2, f2);
                points().pxY(3, f2);
            }
            if (useVBO()) {
                this.e = true;
            }
        }
    }
}
