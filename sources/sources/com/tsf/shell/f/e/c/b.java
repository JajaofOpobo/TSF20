package com.tsf.shell.f.e.c;

import android.opengl.GLES20;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    private FloatBuffer a;
    float[] b;
    a[] c;
    private FloatBuffer d;
    private ShortBuffer e;
    private ShortBuffer f;
    private ShortBuffer g;
    private short[] m;
    private float[] n;
    private float o;
    private com.tsf.shell.f.e.c.a x;
    private int h = 10;
    private float i = 1.0f / (this.h - 1.0f);
    private int j = 300;
    private int k = this.h - 1;
    private int l = ((this.k * this.k) * 2) * 3;
    private final int p = this.h - 1;
    private final int q = this.h - 2;
    private float r = 1.0f;
    private float s = 1.0f;
    private final int t = 0;
    private final int u = 1;
    private final int v = 2;
    private int w = 0;
    private float y = 0.75f;
    private float z = 0.95f;
    private float A = 0.7222222f;
    private boolean B = false;
    private float C = 0.0f;
    private float D = 0.0f;
    private float E = 0.0f;
    private float F = 0.0f;
    private float G = 0.0f;

    class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;

        public a(float f, float f2, float f3, int i, int i2) {
            this.g = 1.0f;
            this.h = 0;
            this.i = 0;
            this.j = i;
            this.k = i2;
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public a(float f, float f2, float f3) {
            this.g = 1.0f;
            this.h = 0;
            this.i = 0;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.j = 0;
            this.k = 0;
        }

        public void a() {
            this.a += (this.d - this.a) * this.g;
            this.b += (this.e - this.b) * this.g;
            this.c += (this.f - this.c) * this.g;
        }
    }

    public b(com.tsf.shell.f.e.c.a aVar) {
        this.x = aVar;
        this.o = 40.0f * this.x.d;
        c();
        b(1.0f);
        this.d.put(this.n);
        this.d.position(0);
        this.e.put(this.m);
        this.e.position(0);
        e();
    }

    private void a() {
        int[] iArr = new int[4];
        iArr[a(0, 0, 2)] = a(0, 0);
        iArr[a(0, 1, 2)] = a(0, this.p);
        iArr[a(1, 0, 2)] = a(this.p, 0);
        iArr[a(1, 1, 2)] = a(this.p, this.p);
        short[] sArr = new short[6];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (i3 != 0 && i2 != 0) {
                    sArr[i] = (short) iArr[a(i3 - 1, i2 - 1, 2)];
                    int i4 = i + 1;
                    sArr[i4] = (short) iArr[a(i3, i2 - 1, 2)];
                    int i5 = i4 + 1;
                    sArr[i5] = (short) iArr[a(i3 - 1, i2, 2)];
                    int i6 = i5 + 1;
                    sArr[i6] = (short) iArr[a(i3, i2, 2)];
                    int i7 = i6 + 1;
                    sArr[i7] = (short) iArr[a(i3 - 1, i2, 2)];
                    int i8 = i7 + 1;
                    sArr[i8] = (short) iArr[a(i3, i2 - 1, 2)];
                    i = i8 + 1;
                }
            }
        }
        this.f = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f.put(sArr);
        this.f.position(0);
    }

    private void b() {
        int[] iArr = new int[16];
        iArr[a(0, 0, 4)] = a(0, 0);
        iArr[a(0, 1, 4)] = a(0, 1);
        iArr[a(0, 2, 4)] = a(0, this.q);
        iArr[a(0, 3, 4)] = a(0, this.p);
        iArr[a(1, 0, 4)] = a(1, 0);
        iArr[a(1, 1, 4)] = a(1, 1);
        iArr[a(1, 2, 4)] = a(1, this.q);
        iArr[a(1, 3, 4)] = a(1, this.p);
        iArr[a(2, 0, 4)] = a(this.q, 0);
        iArr[a(2, 1, 4)] = a(this.q, 1);
        iArr[a(2, 2, 4)] = a(this.q, this.q);
        iArr[a(2, 3, 4)] = a(this.q, this.p);
        iArr[a(3, 0, 4)] = a(this.p, 0);
        iArr[a(3, 1, 4)] = a(this.p, 1);
        iArr[a(3, 2, 4)] = a(this.p, this.q);
        iArr[a(3, 3, 4)] = a(this.p, this.p);
        short[] sArr = new short[54];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                if (i3 != 0 && i2 != 0) {
                    sArr[i] = (short) iArr[a(i3 - 1, i2 - 1, 4)];
                    int i4 = i + 1;
                    sArr[i4] = (short) iArr[a(i3, i2 - 1, 4)];
                    int i5 = i4 + 1;
                    sArr[i5] = (short) iArr[a(i3 - 1, i2, 4)];
                    int i6 = i5 + 1;
                    sArr[i6] = (short) iArr[a(i3, i2, 4)];
                    int i7 = i6 + 1;
                    sArr[i7] = (short) iArr[a(i3 - 1, i2, 4)];
                    int i8 = i7 + 1;
                    sArr[i8] = (short) iArr[a(i3, i2 - 1, 4)];
                    i = i8 + 1;
                }
            }
        }
        this.g = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.g.put(sArr);
        this.g.position(0);
    }

    private void c() {
        a();
        b();
        this.c = new a[this.h * this.h];
        this.b = new float[this.h * this.h * 3];
        this.m = new short[this.l];
        this.n = new float[this.h * this.h * 2];
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.c.length * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect.asFloatBuffer();
        this.a.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.c.length * 2 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.d = byteBufferAllocateDirect2.asFloatBuffer();
        this.d.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(this.m.length * 2);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        this.e = byteBufferAllocateDirect3.asShortBuffer();
        float f = this.p / 2.0f;
        int i = 0;
        int i2 = 0;
        while (i < this.h) {
            int i3 = i2;
            for (int i4 = 0; i4 < this.h; i4++) {
                this.c[a(i4, i)] = new a(((i4 * this.i) * this.j) - (this.j / 2.0f), ((i * this.i) * this.j) - (this.j / 2.0f), 0.0f, i4, i);
                int iA = a(i4, i);
                this.n[(iA * 2) + 0] = 0.5f;
                this.n[(iA * 2) + 1] = 0.5f;
                if (i4 == 0) {
                    this.n[(iA * 2) + 0] = 0.0f;
                } else if (i4 == this.p) {
                    this.n[(iA * 2) + 0] = 1.0f;
                }
                if (i == 0) {
                    this.n[(iA * 2) + 1] = 1.0f;
                } else if (i == this.p) {
                    this.n[(iA * 2) + 1] = 0.0f;
                }
                if (i != 0 && i4 != 0) {
                    if ((i4 - f) * (i - f) > 0.0f) {
                        this.m[i3] = (short) a(i4 - 1, i - 1);
                        int i5 = i3 + 1;
                        this.m[i5] = (short) a(i4, i - 1);
                        int i6 = i5 + 1;
                        this.m[i6] = (short) a(i4 - 1, i);
                        int i7 = i6 + 1;
                        this.m[i7] = (short) a(i4, i);
                        int i8 = i7 + 1;
                        this.m[i8] = (short) a(i4 - 1, i);
                        int i9 = i8 + 1;
                        this.m[i9] = (short) a(i4, i - 1);
                        i3 = i9 + 1;
                    } else {
                        this.m[i3] = (short) a(i4 - 1, i - 1);
                        int i10 = i3 + 1;
                        this.m[i10] = (short) a(i4, i);
                        int i11 = i10 + 1;
                        this.m[i11] = (short) a(i4 - 1, i);
                        int i12 = i11 + 1;
                        this.m[i12] = (short) a(i4 - 1, i - 1);
                        int i13 = i12 + 1;
                        this.m[i13] = (short) a(i4, i - 1);
                        int i14 = i13 + 1;
                        this.m[i14] = (short) a(i4, i);
                        i3 = i14 + 1;
                    }
                }
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, float f3, float f4, float f5) {
        float f6 = this.o;
        a aVar = this.c[a(0, 0)];
        a aVar2 = this.c[a(1, 0)];
        a aVar3 = this.c[a(0, 1)];
        a aVar4 = this.c[a(1, 1)];
        aVar2.d = aVar.d + f6;
        aVar3.e = aVar.e + f6;
        aVar4.d = aVar.d + f6;
        aVar4.e = aVar.e + f6;
        a aVar5 = this.c[a(0, this.p)];
        a aVar6 = this.c[a(1, this.p)];
        a aVar7 = this.c[a(0, this.q)];
        a aVar8 = this.c[a(1, this.q)];
        aVar6.d = aVar5.d + f6;
        aVar7.e = aVar5.e - f6;
        aVar8.d = aVar5.d + f6;
        aVar8.e = aVar5.e - f6;
        a aVar9 = this.c[a(this.p, this.p)];
        a aVar10 = this.c[a(this.q, this.p)];
        a aVar11 = this.c[a(this.p, this.q)];
        a aVar12 = this.c[a(this.q, this.q)];
        aVar10.d = aVar9.d - f6;
        aVar11.e = aVar9.e - f6;
        aVar12.d = aVar9.d - f6;
        aVar12.e = aVar9.e - f6;
        a aVar13 = this.c[a(this.p, 0)];
        a aVar14 = this.c[a(this.q, 0)];
        a aVar15 = this.c[a(this.p, 1)];
        a aVar16 = this.c[a(this.q, 1)];
        aVar14.d = aVar13.d - f6;
        aVar15.e = aVar13.e + f6;
        aVar16.d = aVar13.d - f6;
        aVar16.e = f6 + aVar13.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2) {
        float f3 = this.o;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        for (int i = 0; i < this.h; i++) {
            for (int i2 = 0; i2 < this.h; i2++) {
                a aVar = this.c[a(i2, i)];
                if (i2 == 1) {
                    aVar.d = (-f4) + f3;
                    aVar.g = 1.0f;
                } else if (i2 == this.q) {
                    aVar.d = f4 - f3;
                    aVar.g = 1.0f;
                }
                if (i == 1) {
                    aVar.e = (-f5) + f3;
                    aVar.g = 1.0f;
                } else if (i == this.q) {
                    aVar.e = f5 - f3;
                    aVar.g = 1.0f;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((f3 / this.h) * f6) / 2.0f;
        float f8 = ((f4 / this.h) * f6) / 2.0f;
        for (int i = 0; i < this.h; i++) {
            for (int i2 = 0; i2 < this.h; i2++) {
                a aVar = this.c[a(i2, i)];
                aVar.g = f5;
                aVar.d = (((i2 * this.i) * f3) + f) - (f3 / 2.0f);
                aVar.e = (((i * this.i) * f4) + f2) - (f4 / 2.0f);
            }
        }
        float f9 = (this.h - 1) / 2.0f;
        for (int i3 = 0; i3 < this.h; i3++) {
            float f10 = (i3 - f9) / f9;
            a aVar2 = this.c[a(i3, this.p)];
            aVar2.e = (float) (((double) aVar2.e) + (((double) f7) * Math.cos((((double) f10) * 3.141592653589793d) / 2.0d)));
            a aVar3 = this.c[a(i3, this.q)];
            aVar3.e = (float) (((double) aVar3.e) + (((double) f7) * Math.cos((((double) f10) * 3.141592653589793d) / 2.0d)));
            a aVar4 = this.c[a(i3, 0)];
            aVar4.e = (float) (((double) aVar4.e) - (((double) f7) * Math.cos((((double) f10) * 3.141592653589793d) / 2.0d)));
            a aVar5 = this.c[a(i3, 1)];
            aVar5.e = (float) (((double) aVar5.e) - (((double) f7) * Math.cos((((double) f10) * 3.141592653589793d) / 2.0d)));
        }
        for (int i4 = 0; i4 < this.h; i4++) {
            float f11 = (i4 - f9) / f9;
            a aVar6 = this.c[a(this.p, i4)];
            aVar6.d = (float) (((double) aVar6.d) + (((double) f8) * Math.cos((((double) f11) * 3.141592653589793d) / 2.0d)));
            a aVar7 = this.c[a(this.q, i4)];
            aVar7.d = (float) (((double) aVar7.d) + (((double) f8) * Math.cos((((double) f11) * 3.141592653589793d) / 2.0d)));
            a aVar8 = this.c[a(0, i4)];
            aVar8.d = (float) (((double) aVar8.d) - (((double) f8) * Math.cos((((double) f11) * 3.141592653589793d) / 2.0d)));
            a aVar9 = this.c[a(1, i4)];
            aVar9.d = (float) (((double) aVar9.d) - (((double) f8) * Math.cos((((double) f11) * 3.141592653589793d) / 2.0d)));
        }
    }

    private void d() {
        final i iVar = this.x.b;
        d dVar = new d() { // from class: com.tsf.shell.f.e.c.b.7
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                iVar.visible(false);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.n(0.0f);
        dVar.a(50);
        c.a(iVar);
        c.a(iVar, (int) (300.0f * this.A), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        this.x.b.scale().x = f;
        this.x.b.scale().y = f;
        this.x.b.scale().z = f;
        this.x.b.alpha(255.0f * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        f();
        this.a.put(this.b);
        this.a.position(0);
    }

    private void f() {
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            this.c[i].a();
            this.b[(i * 3) + 0] = this.c[i].a;
            this.b[(i * 3) + 1] = this.c[i].b;
            this.b[(i * 3) + 2] = this.c[i].c;
        }
    }

    private int a(int i, int i2) {
        return (this.h * i2) + i;
    }

    private int a(int i, int i2, int i3) {
        return (i2 * i3) + i;
    }

    public void a(final float f, final float f2, final float f3, final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.c.b.8
            @Override // java.lang.Runnable
            public void run() {
                b.this.b(0.0f, 0.0f, f3, f3, 1.0f);
                b.this.x.position().x = f;
                b.this.x.position().y = f2;
                b.this.rotation().z = 0.0f;
                b.this.x.a(false);
                b.this.w = 0;
                b.this.e();
                b.this.setAABBPX(-f3, -f3, 0.0f, f3, f3, 0.0f);
                b.this.B = false;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        this.w = 2;
        d();
        float f4 = this.x.position().x;
        float f5 = f4 - f;
        float f6 = this.x.position().y - f2;
        final float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        final float degrees = ((float) Math.toDegrees(Math.atan(f6 / f5))) - 90.0f;
        if (f4 > f) {
            degrees += 180.0f;
        }
        final d dVar = new d() { // from class: com.tsf.shell.f.e.c.b.9
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
                float f8 = b.this.x.d * 1.0f;
                float f9 = b.this.x.d * 1.0f;
                float f10 = f9 + ((f3 - f9) * f7);
                float f11 = f8 + ((f3 - f8) * f7);
                float f12 = fSqrt * f7;
                b.this.b(fSqrt, fSqrt, f10, f11, 1.0f);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                runnable2.run();
            }
        };
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        d dVar2 = new d() { // from class: com.tsf.shell.f.e.c.b.10
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
                float f8 = 300.0f * b.this.x.d;
                float f9 = 299.0f * b.this.x.d;
                float f10 = f8 - (f9 * f7);
                b.this.b(0.0f, 0.0f, f8 - (f9 * f7), f10, 0.1f + (0.9f * f7));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.x.e();
                b.this.rotation().z = degrees;
                c.a(b.this, (int) (200.0f * b.this.A), dVar);
            }
        };
        dVar2.a(0);
        c.a(this);
        c.a(this, (int) (400.0f * this.A), dVar2);
        this.B = false;
    }

    public void b(final float f, final float f2, final float f3, final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.c.b.11
            @Override // java.lang.Runnable
            public void run() {
                b.this.b(0.0f, 0.0f, f3, f3, 1.0f);
                b.this.x.position().x = f;
                b.this.x.position().y = f2;
                b.this.rotation().z = 0.0f;
                b.this.x.a(true);
                b.this.w = 0;
                b.this.e();
                b.this.setAABBPX(-f3, -f3, 0.0f, f3, f3, 0.0f);
                b.this.B = false;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (!this.B) {
            if (this.G < 0.1f) {
                c.a(this);
                b(1.0f);
                runnable2.run();
                return;
            } else {
                final d dVar = new d() { // from class: com.tsf.shell.f.e.c.b.12
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f4) {
                        float f5 = 10.0f * b.this.x.d;
                        float f6 = 40.0f * b.this.x.d;
                        float f7 = f5 + ((f3 - f5) * f4);
                        float f8 = f6 + ((f3 - f6) * f4);
                        b.this.b((1.0f - f4) * b.this.F, 0.0f, f7, f8, 0.5f);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void b(float f4) {
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        runnable2.run();
                    }
                };
                final d dVar2 = new d() { // from class: com.tsf.shell.f.e.c.b.13
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f4) {
                        float f5 = 10.0f * b.this.x.d;
                        float f6 = 40.0f * b.this.x.d;
                        float f7 = f6 + ((f5 - f6) * f4);
                        float f8 = f5 + ((f6 - f5) * f4);
                        b.this.b(b.this.F, 0.0f, f7, f8, 0.5f);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void b(float f4) {
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        c.a(b.this, (int) (200.0f * b.this.A), dVar);
                    }
                };
                d dVar3 = new d() { // from class: com.tsf.shell.f.e.c.b.14
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f4) {
                        float f5 = 10.0f * b.this.x.d;
                        float f6 = b.this.D + (((40.0f * b.this.x.d) - b.this.D) * f4);
                        float f7 = b.this.C + ((f5 - b.this.C) * f4);
                        b.this.b(b.this.F, (1.0f - f4) * b.this.E, f6, f7, 0.5f);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void b(float f4) {
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        c.a(b.this, (int) (100.0f * b.this.A), dVar2);
                    }
                };
                c.a(this);
                c.a(this, (int) (this.A * 200.0f), dVar3);
                return;
            }
        }
        this.w = 2;
        d();
        float f4 = this.x.position().x;
        float f5 = f4 - f;
        float f6 = this.x.position().y - f2;
        final float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        final float degrees = ((float) Math.toDegrees(Math.atan(f6 / f5))) - 90.0f;
        if (f4 > f) {
            degrees += 180.0f;
        }
        final d dVar4 = new d() { // from class: com.tsf.shell.f.e.c.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
                float f8 = 10.0f * b.this.x.d;
                float f9 = 40.0f * b.this.x.d;
                float f10 = f9 + ((f3 - f9) * f7);
                float f11 = f8 + ((f3 - f8) * f7);
                b.this.b(fSqrt, fSqrt * f7, f10, f11, 0.5f);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                runnable2.run();
            }
        };
        dVar4.a(com.censivn.C3DEngine.b.g.a.a);
        final d dVar5 = new d() { // from class: com.tsf.shell.f.e.c.b.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
                float f8 = 20.0f * b.this.x.d;
                float f9 = 40.0f * b.this.x.d;
                b.this.b(fSqrt, 0.0f, (f8 * f7) + f8, (50.0f * b.this.x.d) - (f9 * f7), 0.5f);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.a(b.this, (int) (300.0f * b.this.A), dVar4);
            }
        };
        dVar5.a(com.censivn.C3DEngine.b.g.a.a);
        final d dVar6 = new d() { // from class: com.tsf.shell.f.e.c.b.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
                float f8 = 100.0f * b.this.x.d;
                float f9 = 80.0f * b.this.x.d;
                float f10 = f8 - (f9 * f7);
                float f11 = f8 - ((50.0f * b.this.x.d) * f7);
                b.this.b(fSqrt * f7, 0.0f, f10, f11, 0.5f);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.a(b.this, (int) (200.0f * b.this.A), dVar5);
            }
        };
        d dVar7 = new d() { // from class: com.tsf.shell.f.e.c.b.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f7) {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f7) {
                float f8 = 300.0f * b.this.x.d;
                float f9 = 200.0f * b.this.x.d;
                float f10 = f8 - (f9 * f7);
                b.this.b(0.0f, 0.0f, f8 - (f9 * f7), f10, 0.1f + (0.9f * f7));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.rotation().z = degrees;
                c.a(b.this, (int) (200.0f * b.this.A), dVar6);
            }
        };
        c.a(this);
        c.a(this, (int) (this.A * 200.0f), dVar7);
        this.B = false;
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        setAABBPX((-f3) / 2.0f, (-f4) / 2.0f, 0.0f, f3 / 2.0f, f4 / 2.0f, 0.0f);
        this.x.d();
        this.r = f3;
        this.s = f4;
        this.w = 2;
        this.x.g();
        this.x.h();
        final float f5 = this.x.position().x;
        final float f6 = this.x.position().y;
        float f7 = f - f5;
        float f8 = f2 - f6;
        final float degrees = ((float) Math.toDegrees(Math.atan(f8 / f7))) - 90.0f;
        if (f5 > f) {
            degrees += 180.0f;
        }
        rotation().z = degrees;
        int i = (int) (0.0f * this.y);
        int i2 = (int) (800.0f * this.z);
        int i3 = i + i2;
        float f9 = i / i3;
        float f10 = i2 / i3;
        final float f11 = 0.4f * f10;
        final float f12 = 0.6f * f10;
        final float f13 = 0.0f + (0.2f * f9);
        final float f14 = f13 + (0.4f * f9);
        final float f15 = f14 + (0.2f * f9);
        final float f16 = f15 + (f9 * 0.2f);
        final float f17 = f16 + f11;
        this.G = 0.0f;
        alpha(0.0f);
        d dVar = new d() { // from class: com.tsf.shell.f.e.c.b.5
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f18) {
                b.this.G = f18;
                if (f18 >= f16) {
                    b.this.B = true;
                    b.this.x.position().x = f;
                    b.this.x.position().y = f2;
                    b.this.rotation().z = 0.0f;
                    b.this.x.b.visible(true);
                } else {
                    b.this.B = false;
                    b.this.x.position().x = f5;
                    b.this.x.position().y = f6;
                    b.this.rotation().z = degrees;
                    b.this.x.b.visible(false);
                }
                b.this.alpha(255.0f * f18);
                if (f18 < f13) {
                    return;
                }
                if (f18 < f13 || f18 >= f14) {
                    if (f18 < f14 || f18 >= f15) {
                        if (f18 < f15 || f18 >= f16) {
                            if (f18 >= f16 && f18 < f17) {
                                float f19 = (f18 - f16) / f11;
                                float f20 = 1.768034f * b.this.x.d;
                                b.this.a(0.0f, 0.0f, (((f3 * 1.1f) - f20) * f19) + f20, f20 + (((f4 * 1.1f) - f20) * f19), 1.0f, 1.0f);
                                b.this.a(1.05f * f19);
                                return;
                            }
                            if (f18 >= f17 && f18 < 1.0f) {
                                float f21 = (f18 - f17) / f12;
                                b.this.a(0.0f, 0.0f, f3, f4, 0.8f, (float) Math.cos(((double) f21) * 3.141592653589793d * 1.5d));
                                b.this.a(0.0f, 0.0f, f3, f4, 0.2f);
                                b.this.a((((float) Math.cos(((double) f21) * 3.141592653589793d * 1.5d)) * 0.05f) + 1.0f);
                            }
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.a(f3, f4);
                b.this.w = 1;
            }
        };
        c.a(this);
        c.a(this, i3, dVar);
    }

    public void b(final float f, final float f2, final float f3, final float f4) {
        setAABBPX((-f3) / 2.0f, (-f4) / 2.0f, 0.0f, f3 / 2.0f, f4 / 2.0f, 0.0f);
        this.x.d();
        this.r = f3;
        this.s = f4;
        this.w = 2;
        this.x.g();
        final float f5 = this.x.position().x;
        final float f6 = this.x.position().y;
        float f7 = f - f5;
        float f8 = f2 - f6;
        final float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        final float degrees = ((float) Math.toDegrees(Math.atan(f8 / f7))) - 90.0f;
        if (f5 > f) {
            degrees += 180.0f;
        }
        rotation().z = degrees;
        int i = (int) (500.0f * this.y);
        int i2 = (int) (500.0f * this.z);
        int i3 = i + i2;
        float f9 = i / i3;
        float f10 = i2 / i3;
        final float f11 = 0.2f * f9;
        final float f12 = 0.4f * f9;
        final float f13 = 0.2f * f9;
        final float f14 = 0.2f * f9;
        final float f15 = 0.4f * f10;
        final float f16 = 0.6f * f10;
        final float f17 = 0.0f + f11;
        final float f18 = f17 + f12;
        final float f19 = f18 + f13;
        final float f20 = f19 + f14;
        final float f21 = f20 + f15;
        this.G = 0.0f;
        d dVar = new d() { // from class: com.tsf.shell.f.e.c.b.6
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f22) {
                b.this.G = f22;
                if (f22 >= f20) {
                    b.this.B = true;
                    b.this.x.position().x = f;
                    b.this.x.position().y = f2;
                    b.this.rotation().z = 0.0f;
                    b.this.x.b.visible(true);
                } else {
                    b.this.B = false;
                    b.this.x.position().x = f5;
                    b.this.x.position().y = f6;
                    b.this.rotation().z = degrees;
                    b.this.x.b.visible(false);
                }
                if (f22 < f17) {
                    float f23 = (f22 - 0.0f) / f11;
                    float f24 = 25.0f * b.this.x.d;
                    float f25 = f24 + (f24 * f23);
                    float f26 = f24 + (f23 * f24);
                    b.this.C = f25;
                    b.this.D = f26;
                    b.this.E = 0.0f;
                    b.this.F = 0.0f;
                    b.this.b(0.0f, 0.0f, f26, f25, 0.5f);
                    return;
                }
                if (f22 >= f17 && f22 < f18) {
                    float f27 = (f22 - f17) / f12;
                    float f28 = 50.0f * b.this.x.d;
                    float f29 = f28 + (30.0f * b.this.x.d * f27);
                    float f30 = f28 - ((b.this.x.d * 48.0f) * f27);
                    float f31 = fSqrt * f27;
                    b.this.C = f30;
                    b.this.D = f29;
                    b.this.E = 0.0f;
                    b.this.F = f31;
                    b.this.b(f31, 0.0f, f29, f30, 0.5f);
                    return;
                }
                if (f22 >= f18 && f22 < f19) {
                    float f32 = (f22 - f18) / f13;
                    float f33 = 50.0f * b.this.x.d;
                    float f34 = 10.0f * b.this.x.d;
                    float f35 = (40.0f * b.this.x.d * f32) + f33;
                    float f36 = f34 + (80.0f * b.this.x.d * f32);
                    float f37 = fSqrt * f32;
                    b.this.C = f36;
                    b.this.D = f35;
                    b.this.E = f37;
                    b.this.F = fSqrt;
                    b.this.b(fSqrt, f37, f35, f36, 0.5f);
                    return;
                }
                if (f22 >= f19 && f22 < f20) {
                    float f38 = (f22 - f19) / f14;
                    float f39 = 90.0f * b.this.x.d;
                    float f40 = 110.0f * b.this.x.d;
                    float f41 = (f40 * f38) + f39;
                    float f42 = f39 + (f38 * f40);
                    b.this.C = f42;
                    b.this.D = f41;
                    b.this.E = fSqrt;
                    b.this.F = fSqrt;
                    b.this.b(fSqrt, fSqrt, f41, f42, 1.0f);
                    return;
                }
                if (f22 >= f20 && f22 < f21) {
                    float f43 = (f22 - f20) / f15;
                    float f44 = 353.6068f * b.this.x.d;
                    b.this.a(0.0f, 0.0f, (((f3 * 1.1f) - f44) * f43) + f44, f44 + (((f4 * 1.1f) - f44) * f43), 1.0f, 1.0f);
                    b.this.a(1.05f * f43);
                    return;
                }
                if (f22 >= f21 && f22 < 1.0f) {
                    float f45 = (f22 - f21) / f16;
                    b.this.a(0.0f, 0.0f, f3, f4, 0.8f, (float) Math.cos(((double) f45) * 3.141592653589793d * 1.5d));
                    b.this.a(0.0f, 0.0f, f3, f4, 0.2f);
                    b.this.a((((float) Math.cos(((double) f45) * 3.141592653589793d * 1.5d)) * 0.05f) + 1.0f);
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.a(f3, f4);
                b.this.w = 1;
            }
        };
        c.a(this);
        c.a(this, i3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 / f4;
        a[] aVarArrC = c(f, f2, f3, f4);
        a[] aVarArrD = d(f, f2, f3, f4);
        boolean z = Math.abs(f - f2) > (f3 + f4) / 2.0f;
        for (int i = 0; i < this.h; i++) {
            for (int i2 = 0; i2 < this.h; i2++) {
                a aVar = this.c[a(i2, i)];
                aVar.g = f5;
                aVar.d = 0.0f;
                aVar.e = 0.0f;
                if (i2 == 0) {
                    aVar.d = 0 - f4;
                } else if (i2 == this.p) {
                    aVar.d = 0 + f4;
                }
                if (i == 0) {
                    aVar.e = 0 - f4;
                } else if (i == this.p) {
                    aVar.e = 0 + f4;
                }
                if (i >= this.q) {
                    aVar.e *= f6;
                    aVar.d *= f6;
                    aVar.e += f;
                } else {
                    aVar.e += f2;
                }
                if (i < this.q && i > 1) {
                    float f7 = (i - 2.0f) / (this.p - 2.0f);
                    aVar.e += (f - f2) * f7;
                    if (z) {
                        if (i2 == 0) {
                            a aVarA = a(aVarArrC, f7);
                            aVar.d = aVarA.a;
                            aVar.e = aVarA.b;
                        } else if (i2 == this.p) {
                            a aVarA2 = a(aVarArrD, f7);
                            aVar.d = aVarA2.a;
                            aVar.e = aVarA2.b;
                        }
                    }
                }
            }
        }
    }

    private a[] c(float f, float f2, float f3, float f4) {
        if (f4 < f3) {
            return new a[]{new a(-f4, f2, 0.0f), new a(-f4, f, 0.0f), new a(-f3, f - f3, 0.0f), new a(-f3, f, 0.0f)};
        }
        return new a[]{new a(-f4, f2, 0.0f), new a(-f4, f2 + f4, 0.0f), new a(-f3, f2, 0.0f), new a(-f3, f, 0.0f)};
    }

    private a[] d(float f, float f2, float f3, float f4) {
        if (f4 < f3) {
            return new a[]{new a(f4, f2, 0.0f), new a(f4, f, 0.0f), new a(f3, f - f3, 0.0f), new a(f3, f, 0.0f)};
        }
        return new a[]{new a(f4, f2, 0.0f), new a(f4, f2 + f4, 0.0f), new a(f3, f2, 0.0f), new a(f3, f, 0.0f)};
    }

    private a a(a[] aVarArr, float f) {
        a aVar = new a(0.0f, 0.0f, 0.0f, 0, 0);
        float f2 = (float) (((double) (aVarArr[1].a - aVarArr[0].a)) * 3.0d);
        float f3 = (float) ((((double) (aVarArr[2].a - aVarArr[1].a)) * 3.0d) - ((double) f2));
        float f4 = ((aVarArr[3].a - aVarArr[0].a) - f2) - f3;
        float f5 = (float) (((double) (aVarArr[1].b - aVarArr[0].b)) * 3.0d);
        float f6 = (float) ((((double) (aVarArr[2].b - aVarArr[1].b)) * 3.0d) - ((double) f5));
        float f7 = ((aVarArr[3].b - aVarArr[0].b) - f5) - f6;
        float f8 = f * f;
        float f9 = f8 * f;
        float f10 = f2 * f;
        aVar.a = f10 + (f3 * f8) + (f4 * f9) + aVarArr[0].a;
        aVar.b = (f7 * f9) + (f6 * f8) + (f5 * f) + aVarArr[0].b;
        return aVar;
    }

    private void b(float f) {
        float f2 = this.x.e;
        for (int i = 0; i < this.h; i++) {
            for (int i2 = 0; i2 < this.h; i2++) {
                a aVar = this.c[a(i2, i)];
                aVar.d = 0.0f;
                aVar.e = 0.0f;
                aVar.g = f;
                if (i2 == 0) {
                    aVar.d = 0 - (f2 / 2.0f);
                } else if (i2 == this.p) {
                    aVar.d = 0 + (f2 / 2.0f);
                }
                if (i == 0) {
                    aVar.e = 0 - (f2 / 2.0f);
                } else if (i == this.p) {
                    aVar.e = 0 + (f2 / 2.0f);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void drawElement() {
        if (visible()) {
            if (this.w == 2) {
                e();
            }
            ShaderManager.CURRENT_SHADER.glMVPMatrix();
            ShaderManager.CURRENT_SHADER.glTexCoordPointer(2, 5126, false, 0, this.d);
            ShaderManager.CURRENT_SHADER.glVertexPointer(3, 5126, false, 0, this.a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, textures().get(0).textureElement.id);
            switch (this.w) {
                case 0:
                    GLES20.glDrawElements(4, 6, 5123, this.f);
                    break;
                case 1:
                    GLES20.glDrawElements(4, 54, 5123, this.g);
                    break;
                case 2:
                    GLES20.glDrawElements(4, this.l, 5123, this.e);
                    break;
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
