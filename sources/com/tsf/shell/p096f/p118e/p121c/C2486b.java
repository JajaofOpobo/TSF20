package com.tsf.shell.p096f.p118e.p121c;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
/* renamed from: com.tsf.shell.f.e.c.b */
/* loaded from: classes.dex */
public class C2486b extends C0980j {

    /* renamed from: a */
    private FloatBuffer f8219a;

    /* renamed from: b */
    float[] f8220b;

    /* renamed from: c */
    C2501a[] f8221c;

    /* renamed from: d */
    private FloatBuffer f8222d;

    /* renamed from: e */
    private ShortBuffer f8223e;

    /* renamed from: f */
    private ShortBuffer f8224f;

    /* renamed from: g */
    private ShortBuffer f8225g;

    /* renamed from: m */
    private short[] f8231m;

    /* renamed from: n */
    private float[] f8232n;

    /* renamed from: o */
    private float f8233o;

    /* renamed from: x */
    private C2478a f8242x;

    /* renamed from: h */
    private int f8226h = 10;

    /* renamed from: i */
    private float f8227i = 1.0f / (this.f8226h - 1.0f);

    /* renamed from: j */
    private int f8228j = 300;

    /* renamed from: k */
    private int f8229k = this.f8226h - 1;

    /* renamed from: l */
    private int f8230l = ((this.f8229k * this.f8229k) * 2) * 3;

    /* renamed from: p */
    private final int f8234p = this.f8226h - 1;

    /* renamed from: q */
    private final int f8235q = this.f8226h - 2;

    /* renamed from: r */
    private float f8236r = 1.0f;

    /* renamed from: s */
    private float f8237s = 1.0f;

    /* renamed from: t */
    private final int f8238t = 0;

    /* renamed from: u */
    private final int f8239u = 1;

    /* renamed from: v */
    private final int f8240v = 2;

    /* renamed from: w */
    private int f8241w = 0;

    /* renamed from: y */
    private float f8243y = 0.75f;

    /* renamed from: z */
    private float f8244z = 0.95f;

    /* renamed from: A */
    private float f8212A = 0.7222222f;

    /* renamed from: B */
    private boolean f8213B = false;

    /* renamed from: C */
    private float f8214C = 0.0f;

    /* renamed from: D */
    private float f8215D = 0.0f;

    /* renamed from: E */
    private float f8216E = 0.0f;

    /* renamed from: F */
    private float f8217F = 0.0f;

    /* renamed from: G */
    private float f8218G = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.c.b$a */
    /* loaded from: classes.dex */
    public class C2501a {

        /* renamed from: a */
        public float f8319a;

        /* renamed from: b */
        public float f8320b;

        /* renamed from: c */
        public float f8321c;

        /* renamed from: d */
        public float f8322d;

        /* renamed from: e */
        public float f8323e;

        /* renamed from: f */
        public float f8324f;

        /* renamed from: g */
        public float f8325g;

        /* renamed from: h */
        public int f8326h;

        /* renamed from: i */
        public int f8327i;

        /* renamed from: j */
        public int f8328j;

        /* renamed from: k */
        public int f8329k;

        public C2501a(float f, float f2, float f3, int i, int i2) {
            this.f8325g = 1.0f;
            this.f8326h = 0;
            this.f8327i = 0;
            this.f8328j = i;
            this.f8329k = i2;
            this.f8319a = f;
            this.f8320b = f2;
            this.f8321c = f3;
        }

        public C2501a(float f, float f2, float f3) {
            this.f8325g = 1.0f;
            this.f8326h = 0;
            this.f8327i = 0;
            this.f8319a = f;
            this.f8320b = f2;
            this.f8321c = f3;
            this.f8328j = 0;
            this.f8329k = 0;
        }

        /* renamed from: a */
        public void m5385a() {
            this.f8319a += (this.f8322d - this.f8319a) * this.f8325g;
            this.f8320b += (this.f8323e - this.f8320b) * this.f8325g;
            this.f8321c += (this.f8324f - this.f8321c) * this.f8325g;
        }
    }

    public C2486b(C2478a c2478a) {
        this.f8242x = c2478a;
        this.f8233o = 40.0f * this.f8242x.f8162d;
        m5400c();
        m5407b(1.0f);
        this.f8222d.put(this.f8232n);
        this.f8222d.position(0);
        this.f8223e.put(this.f8231m);
        this.f8223e.position(0);
        m5392e();
    }

    /* renamed from: a */
    private void m5425a() {
        int[] iArr = new int[4];
        iArr[m5417a(0, 0, 2)] = m5418a(0, 0);
        iArr[m5417a(0, 1, 2)] = m5418a(0, this.f8234p);
        iArr[m5417a(1, 0, 2)] = m5418a(this.f8234p, 0);
        iArr[m5417a(1, 1, 2)] = m5418a(this.f8234p, this.f8234p);
        short[] sArr = new short[6];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (i3 != 0 && i2 != 0) {
                    sArr[i] = (short) iArr[m5417a(i3 - 1, i2 - 1, 2)];
                    int i4 = i + 1;
                    sArr[i4] = (short) iArr[m5417a(i3, i2 - 1, 2)];
                    int i5 = i4 + 1;
                    sArr[i5] = (short) iArr[m5417a(i3 - 1, i2, 2)];
                    int i6 = i5 + 1;
                    sArr[i6] = (short) iArr[m5417a(i3, i2, 2)];
                    int i7 = i6 + 1;
                    sArr[i7] = (short) iArr[m5417a(i3 - 1, i2, 2)];
                    int i8 = i7 + 1;
                    sArr[i8] = (short) iArr[m5417a(i3, i2 - 1, 2)];
                    i = i8 + 1;
                }
            }
        }
        this.f8224f = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f8224f.put(sArr);
        this.f8224f.position(0);
    }

    /* renamed from: b */
    private void m5408b() {
        int[] iArr = new int[16];
        iArr[m5417a(0, 0, 4)] = m5418a(0, 0);
        iArr[m5417a(0, 1, 4)] = m5418a(0, 1);
        iArr[m5417a(0, 2, 4)] = m5418a(0, this.f8235q);
        iArr[m5417a(0, 3, 4)] = m5418a(0, this.f8234p);
        iArr[m5417a(1, 0, 4)] = m5418a(1, 0);
        iArr[m5417a(1, 1, 4)] = m5418a(1, 1);
        iArr[m5417a(1, 2, 4)] = m5418a(1, this.f8235q);
        iArr[m5417a(1, 3, 4)] = m5418a(1, this.f8234p);
        iArr[m5417a(2, 0, 4)] = m5418a(this.f8235q, 0);
        iArr[m5417a(2, 1, 4)] = m5418a(this.f8235q, 1);
        iArr[m5417a(2, 2, 4)] = m5418a(this.f8235q, this.f8235q);
        iArr[m5417a(2, 3, 4)] = m5418a(this.f8235q, this.f8234p);
        iArr[m5417a(3, 0, 4)] = m5418a(this.f8234p, 0);
        iArr[m5417a(3, 1, 4)] = m5418a(this.f8234p, 1);
        iArr[m5417a(3, 2, 4)] = m5418a(this.f8234p, this.f8235q);
        iArr[m5417a(3, 3, 4)] = m5418a(this.f8234p, this.f8234p);
        short[] sArr = new short[54];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                if (i3 != 0 && i2 != 0) {
                    sArr[i] = (short) iArr[m5417a(i3 - 1, i2 - 1, 4)];
                    int i4 = i + 1;
                    sArr[i4] = (short) iArr[m5417a(i3, i2 - 1, 4)];
                    int i5 = i4 + 1;
                    sArr[i5] = (short) iArr[m5417a(i3 - 1, i2, 4)];
                    int i6 = i5 + 1;
                    sArr[i6] = (short) iArr[m5417a(i3, i2, 4)];
                    int i7 = i6 + 1;
                    sArr[i7] = (short) iArr[m5417a(i3 - 1, i2, 4)];
                    int i8 = i7 + 1;
                    sArr[i8] = (short) iArr[m5417a(i3, i2 - 1, 4)];
                    i = i8 + 1;
                }
            }
        }
        this.f8225g = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f8225g.put(sArr);
        this.f8225g.position(0);
    }

    /* renamed from: c */
    private void m5400c() {
        m5425a();
        m5408b();
        this.f8221c = new C2501a[this.f8226h * this.f8226h];
        this.f8220b = new float[this.f8226h * this.f8226h * 3];
        this.f8231m = new short[this.f8230l];
        this.f8232n = new float[this.f8226h * this.f8226h * 2];
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f8221c.length * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8219a = allocateDirect.asFloatBuffer();
        this.f8219a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f8221c.length * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f8222d = allocateDirect2.asFloatBuffer();
        this.f8222d.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f8231m.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f8223e = allocateDirect3.asShortBuffer();
        float f = this.f8234p / 2.0f;
        int i = 0;
        int i2 = 0;
        while (i < this.f8226h) {
            int i3 = i2;
            for (int i4 = 0; i4 < this.f8226h; i4++) {
                this.f8221c[m5418a(i4, i)] = new C2501a(((i4 * this.f8227i) * this.f8228j) - (this.f8228j / 2.0f), ((i * this.f8227i) * this.f8228j) - (this.f8228j / 2.0f), 0.0f, i4, i);
                int m5418a = m5418a(i4, i);
                this.f8232n[(m5418a * 2) + 0] = 0.5f;
                this.f8232n[(m5418a * 2) + 1] = 0.5f;
                if (i4 == 0) {
                    this.f8232n[(m5418a * 2) + 0] = 0.0f;
                } else if (i4 == this.f8234p) {
                    this.f8232n[(m5418a * 2) + 0] = 1.0f;
                }
                if (i == 0) {
                    this.f8232n[(m5418a * 2) + 1] = 1.0f;
                } else if (i == this.f8234p) {
                    this.f8232n[(m5418a * 2) + 1] = 0.0f;
                }
                if (i != 0 && i4 != 0) {
                    if ((i4 - f) * (i - f) > 0.0f) {
                        this.f8231m[i3] = (short) m5418a(i4 - 1, i - 1);
                        int i5 = i3 + 1;
                        this.f8231m[i5] = (short) m5418a(i4, i - 1);
                        int i6 = i5 + 1;
                        this.f8231m[i6] = (short) m5418a(i4 - 1, i);
                        int i7 = i6 + 1;
                        this.f8231m[i7] = (short) m5418a(i4, i);
                        int i8 = i7 + 1;
                        this.f8231m[i8] = (short) m5418a(i4 - 1, i);
                        int i9 = i8 + 1;
                        this.f8231m[i9] = (short) m5418a(i4, i - 1);
                        i3 = i9 + 1;
                    } else {
                        this.f8231m[i3] = (short) m5418a(i4 - 1, i - 1);
                        int i10 = i3 + 1;
                        this.f8231m[i10] = (short) m5418a(i4, i);
                        int i11 = i10 + 1;
                        this.f8231m[i11] = (short) m5418a(i4 - 1, i);
                        int i12 = i11 + 1;
                        this.f8231m[i12] = (short) m5418a(i4 - 1, i - 1);
                        int i13 = i12 + 1;
                        this.f8231m[i13] = (short) m5418a(i4, i - 1);
                        int i14 = i13 + 1;
                        this.f8231m[i14] = (short) m5418a(i4, i);
                        i3 = i14 + 1;
                    }
                }
            }
            i++;
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5421a(float f, float f2, float f3, float f4, float f5) {
        float f6 = this.f8233o;
        C2501a c2501a = this.f8221c[m5418a(0, 0)];
        C2501a c2501a2 = this.f8221c[m5418a(1, 0)];
        C2501a c2501a3 = this.f8221c[m5418a(0, 1)];
        C2501a c2501a4 = this.f8221c[m5418a(1, 1)];
        c2501a2.f8322d = c2501a.f8322d + f6;
        c2501a3.f8323e = c2501a.f8323e + f6;
        c2501a4.f8322d = c2501a.f8322d + f6;
        c2501a4.f8323e = c2501a.f8323e + f6;
        C2501a c2501a5 = this.f8221c[m5418a(0, this.f8234p)];
        C2501a c2501a6 = this.f8221c[m5418a(1, this.f8234p)];
        C2501a c2501a7 = this.f8221c[m5418a(0, this.f8235q)];
        C2501a c2501a8 = this.f8221c[m5418a(1, this.f8235q)];
        c2501a6.f8322d = c2501a5.f8322d + f6;
        c2501a7.f8323e = c2501a5.f8323e - f6;
        c2501a8.f8322d = c2501a5.f8322d + f6;
        c2501a8.f8323e = c2501a5.f8323e - f6;
        C2501a c2501a9 = this.f8221c[m5418a(this.f8234p, this.f8234p)];
        C2501a c2501a10 = this.f8221c[m5418a(this.f8235q, this.f8234p)];
        C2501a c2501a11 = this.f8221c[m5418a(this.f8234p, this.f8235q)];
        C2501a c2501a12 = this.f8221c[m5418a(this.f8235q, this.f8235q)];
        c2501a10.f8322d = c2501a9.f8322d - f6;
        c2501a11.f8323e = c2501a9.f8323e - f6;
        c2501a12.f8322d = c2501a9.f8322d - f6;
        c2501a12.f8323e = c2501a9.f8323e - f6;
        C2501a c2501a13 = this.f8221c[m5418a(this.f8234p, 0)];
        C2501a c2501a14 = this.f8221c[m5418a(this.f8235q, 0)];
        C2501a c2501a15 = this.f8221c[m5418a(this.f8234p, 1)];
        C2501a c2501a16 = this.f8221c[m5418a(this.f8235q, 1)];
        c2501a14.f8322d = c2501a13.f8322d - f6;
        c2501a15.f8323e = c2501a13.f8323e + f6;
        c2501a16.f8322d = c2501a13.f8322d - f6;
        c2501a16.f8323e = f6 + c2501a13.f8323e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5423a(float f, float f2) {
        float f3 = this.f8233o;
        float f4 = f / 2.0f;
        float f5 = f2 / 2.0f;
        for (int i = 0; i < this.f8226h; i++) {
            for (int i2 = 0; i2 < this.f8226h; i2++) {
                C2501a c2501a = this.f8221c[m5418a(i2, i)];
                if (i2 == 1) {
                    c2501a.f8322d = (-f4) + f3;
                    c2501a.f8325g = 1.0f;
                } else if (i2 == this.f8235q) {
                    c2501a.f8322d = f4 - f3;
                    c2501a.f8325g = 1.0f;
                }
                if (i == 1) {
                    c2501a.f8323e = (-f5) + f3;
                    c2501a.f8325g = 1.0f;
                } else if (i == this.f8235q) {
                    c2501a.f8323e = f5 - f3;
                    c2501a.f8325g = 1.0f;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5420a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((f3 / this.f8226h) * f6) / 2.0f;
        float f8 = ((f4 / this.f8226h) * f6) / 2.0f;
        for (int i = 0; i < this.f8226h; i++) {
            for (int i2 = 0; i2 < this.f8226h; i2++) {
                C2501a c2501a = this.f8221c[m5418a(i2, i)];
                c2501a.f8325g = f5;
                c2501a.f8322d = (((i2 * this.f8227i) * f3) + f) - (f3 / 2.0f);
                c2501a.f8323e = (((i * this.f8227i) * f4) + f2) - (f4 / 2.0f);
            }
        }
        float f9 = (this.f8226h - 1) / 2.0f;
        for (int i3 = 0; i3 < this.f8226h; i3++) {
            float f10 = (i3 - f9) / f9;
            C2501a c2501a2 = this.f8221c[m5418a(i3, this.f8234p)];
            c2501a2.f8323e = (float) (c2501a2.f8323e + (f7 * Math.cos((f10 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a3 = this.f8221c[m5418a(i3, this.f8235q)];
            c2501a3.f8323e = (float) (c2501a3.f8323e + (f7 * Math.cos((f10 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a4 = this.f8221c[m5418a(i3, 0)];
            c2501a4.f8323e = (float) (c2501a4.f8323e - (f7 * Math.cos((f10 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a5 = this.f8221c[m5418a(i3, 1)];
            c2501a5.f8323e = (float) (c2501a5.f8323e - (f7 * Math.cos((f10 * 3.141592653589793d) / 2.0d)));
        }
        for (int i4 = 0; i4 < this.f8226h; i4++) {
            float f11 = (i4 - f9) / f9;
            C2501a c2501a6 = this.f8221c[m5418a(this.f8234p, i4)];
            c2501a6.f8322d = (float) (c2501a6.f8322d + (f8 * Math.cos((f11 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a7 = this.f8221c[m5418a(this.f8235q, i4)];
            c2501a7.f8322d = (float) (c2501a7.f8322d + (f8 * Math.cos((f11 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a8 = this.f8221c[m5418a(0, i4)];
            c2501a8.f8322d = (float) (c2501a8.f8322d - (f8 * Math.cos((f11 * 3.141592653589793d) / 2.0d)));
            C2501a c2501a9 = this.f8221c[m5418a(1, i4)];
            c2501a9.f8322d = (float) (c2501a9.f8322d - (f8 * Math.cos((f11 * 3.141592653589793d) / 2.0d)));
        }
    }

    /* renamed from: d */
    private void m5396d() {
        final C0975i c0975i = this.f8242x.f8160b;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.b.7
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                c0975i.visible(false);
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        c1017d.m10292n(0.0f);
        c1017d.m10314a(50);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, (int) (300.0f * this.f8212A), c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5424a(float f) {
        this.f8242x.f8160b.scale().f2526x = f;
        this.f8242x.f8160b.scale().f2527y = f;
        this.f8242x.f8160b.scale().f2528z = f;
        this.f8242x.f8160b.alpha(255.0f * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5392e() {
        m5389f();
        this.f8219a.put(this.f8220b);
        this.f8219a.position(0);
    }

    /* renamed from: f */
    private void m5389f() {
        int length = this.f8221c.length;
        for (int i = 0; i < length; i++) {
            this.f8221c[i].m5385a();
            this.f8220b[(i * 3) + 0] = this.f8221c[i].f8319a;
            this.f8220b[(i * 3) + 1] = this.f8221c[i].f8320b;
            this.f8220b[(i * 3) + 2] = this.f8221c[i].f8321c;
        }
    }

    /* renamed from: a */
    private int m5418a(int i, int i2) {
        return (this.f8226h * i2) + i;
    }

    /* renamed from: a */
    private int m5417a(int i, int i2, int i3) {
        return (i2 * i3) + i;
    }

    /* renamed from: a */
    public void m5419a(final float f, final float f2, final float f3, final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.c.b.8
            @Override // java.lang.Runnable
            public void run() {
                C2486b.this.m5405b(0.0f, 0.0f, f3, f3, 1.0f);
                C2486b.this.f8242x.position().f2526x = f;
                C2486b.this.f8242x.position().f2527y = f2;
                C2486b.this.rotation().f2528z = 0.0f;
                C2486b.this.f8242x.m5465a(false);
                C2486b.this.f8241w = 0;
                C2486b.this.m5392e();
                C2486b.this.setAABBPX(-f3, -f3, 0.0f, f3, f3, 0.0f);
                C2486b.this.f8213B = false;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        this.f8241w = 2;
        m5396d();
        float f4 = this.f8242x.position().f2526x;
        float f5 = f4 - f;
        float f6 = this.f8242x.position().f2527y - f2;
        final float sqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        final float degrees = ((float) Math.toDegrees(Math.atan(f6 / f5))) - 90.0f;
        if (f4 > f) {
            degrees += 180.0f;
        }
        final C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.b.9
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
                float f8 = C2486b.this.f8242x.f8162d * 1.0f;
                float f9 = C2486b.this.f8242x.f8162d * 1.0f;
                float f10 = f9 + ((f3 - f9) * f7);
                float f11 = f8 + ((f3 - f8) * f7);
                float f12 = sqrt * f7;
                C2486b.this.m5405b(sqrt, sqrt, f10, f11, 1.0f);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                runnable2.run();
            }
        };
        c1017d.m10313a(C0986a.f2946a);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.10
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
                float f8 = 300.0f * C2486b.this.f8242x.f8162d;
                float f9 = 299.0f * C2486b.this.f8242x.f8162d;
                float f10 = f8 - (f9 * f7);
                C2486b.this.m5405b(0.0f, 0.0f, f8 - (f9 * f7), f10, 0.1f + (0.9f * f7));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2486b.this.f8242x.m5460e();
                C2486b.this.rotation().f2528z = degrees;
                C1014c.m10325a(C2486b.this, (int) (200.0f * C2486b.this.f8212A), c1017d);
            }
        };
        c1017d2.m10314a(0);
        C1014c.m10326a(this);
        C1014c.m10325a(this, (int) (400.0f * this.f8212A), c1017d2);
        this.f8213B = false;
    }

    /* renamed from: b */
    public void m5404b(final float f, final float f2, final float f3, final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.e.c.b.11
            @Override // java.lang.Runnable
            public void run() {
                C2486b.this.m5405b(0.0f, 0.0f, f3, f3, 1.0f);
                C2486b.this.f8242x.position().f2526x = f;
                C2486b.this.f8242x.position().f2527y = f2;
                C2486b.this.rotation().f2528z = 0.0f;
                C2486b.this.f8242x.m5465a(true);
                C2486b.this.f8241w = 0;
                C2486b.this.m5392e();
                C2486b.this.setAABBPX(-f3, -f3, 0.0f, f3, f3, 0.0f);
                C2486b.this.f8213B = false;
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (!this.f8213B) {
            if (this.f8218G < 0.1f) {
                C1014c.m10326a(this);
                m5407b(1.0f);
                runnable2.run();
                return;
            }
            final C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.b.12
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f4) {
                    float f5 = 10.0f * C2486b.this.f8242x.f8162d;
                    float f6 = 40.0f * C2486b.this.f8242x.f8162d;
                    float f7 = f5 + ((f3 - f5) * f4);
                    float f8 = f6 + ((f3 - f6) * f4);
                    C2486b.this.m5405b((1.0f - f4) * C2486b.this.f8217F, 0.0f, f7, f8, 0.5f);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: b */
                public void mo558b(float f4) {
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    runnable2.run();
                }
            };
            final C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.13
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f4) {
                    float f5 = 10.0f * C2486b.this.f8242x.f8162d;
                    float f6 = 40.0f * C2486b.this.f8242x.f8162d;
                    float f7 = f6 + ((f5 - f6) * f4);
                    float f8 = f5 + ((f6 - f5) * f4);
                    C2486b.this.m5405b(C2486b.this.f8217F, 0.0f, f7, f8, 0.5f);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: b */
                public void mo558b(float f4) {
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1014c.m10325a(C2486b.this, (int) (200.0f * C2486b.this.f8212A), c1017d);
                }
            };
            C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.14
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f4) {
                    float f5 = 10.0f * C2486b.this.f8242x.f8162d;
                    float f6 = C2486b.this.f8215D + (((40.0f * C2486b.this.f8242x.f8162d) - C2486b.this.f8215D) * f4);
                    float f7 = C2486b.this.f8214C + ((f5 - C2486b.this.f8214C) * f4);
                    C2486b.this.m5405b(C2486b.this.f8217F, (1.0f - f4) * C2486b.this.f8216E, f6, f7, 0.5f);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: b */
                public void mo558b(float f4) {
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C1014c.m10325a(C2486b.this, (int) (100.0f * C2486b.this.f8212A), c1017d2);
                }
            };
            C1014c.m10326a(this);
            C1014c.m10325a(this, (int) (this.f8212A * 200.0f), c1017d3);
            return;
        }
        this.f8241w = 2;
        m5396d();
        float f4 = this.f8242x.position().f2526x;
        float f5 = f4 - f;
        float f6 = this.f8242x.position().f2527y - f2;
        final float sqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        final float degrees = ((float) Math.toDegrees(Math.atan(f6 / f5))) - 90.0f;
        if (f4 > f) {
            degrees += 180.0f;
        }
        final C1017d c1017d4 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
                float f8 = 10.0f * C2486b.this.f8242x.f8162d;
                float f9 = 40.0f * C2486b.this.f8242x.f8162d;
                float f10 = f9 + ((f3 - f9) * f7);
                float f11 = f8 + ((f3 - f8) * f7);
                C2486b.this.m5405b(sqrt, sqrt * f7, f10, f11, 0.5f);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                runnable2.run();
            }
        };
        c1017d4.m10313a(C0986a.f2946a);
        final C1017d c1017d5 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
                float f8 = 20.0f * C2486b.this.f8242x.f8162d;
                float f9 = 40.0f * C2486b.this.f8242x.f8162d;
                C2486b.this.m5405b(sqrt, 0.0f, (f8 * f7) + f8, (50.0f * C2486b.this.f8242x.f8162d) - (f9 * f7), 0.5f);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1014c.m10325a(C2486b.this, (int) (300.0f * C2486b.this.f8212A), c1017d4);
            }
        };
        c1017d5.m10313a(C0986a.f2946a);
        final C1017d c1017d6 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
                float f8 = 100.0f * C2486b.this.f8242x.f8162d;
                float f9 = 80.0f * C2486b.this.f8242x.f8162d;
                float f10 = sqrt * f7;
                C2486b.this.m5405b(f10, 0.0f, f8 - (f9 * f7), f8 - ((50.0f * C2486b.this.f8242x.f8162d) * f7), 0.5f);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1014c.m10325a(C2486b.this, (int) (200.0f * C2486b.this.f8212A), c1017d5);
            }
        };
        C1017d c1017d7 = new C1017d() { // from class: com.tsf.shell.f.e.c.b.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f7) {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: b */
            public void mo558b(float f7) {
                float f8 = 300.0f * C2486b.this.f8242x.f8162d;
                float f9 = 200.0f * C2486b.this.f8242x.f8162d;
                float f10 = f8 - (f9 * f7);
                C2486b.this.m5405b(0.0f, 0.0f, f8 - (f9 * f7), f10, 0.1f + (0.9f * f7));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2486b.this.rotation().f2528z = degrees;
                C1014c.m10325a(C2486b.this, (int) (200.0f * C2486b.this.f8212A), c1017d6);
            }
        };
        C1014c.m10326a(this);
        C1014c.m10325a(this, (int) (this.f8212A * 200.0f), c1017d7);
        this.f8213B = false;
    }

    /* renamed from: a */
    public void m5422a(final float f, final float f2, final float f3, final float f4) {
        setAABBPX((-f3) / 2.0f, (-f4) / 2.0f, 0.0f, f3 / 2.0f, f4 / 2.0f, 0.0f);
        this.f8242x.mo3599d();
        this.f8236r = f3;
        this.f8237s = f4;
        this.f8241w = 2;
        this.f8242x.m5458g();
        this.f8242x.m5457h();
        final float f5 = this.f8242x.position().f2526x;
        final float f6 = this.f8242x.position().f2527y;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float sqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        final float degrees = ((float) Math.toDegrees(Math.atan(f8 / f7))) - 90.0f;
        if (f5 > f) {
            degrees += 180.0f;
        }
        rotation().f2528z = degrees;
        int i = (int) (0.0f * this.f8243y);
        int i2 = (int) (800.0f * this.f8244z);
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
        this.f8218G = 0.0f;
        alpha(0.0f);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.b.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f18) {
                C2486b.this.f8218G = f18;
                if (f18 >= f16) {
                    C2486b.this.f8213B = true;
                    C2486b.this.f8242x.position().f2526x = f;
                    C2486b.this.f8242x.position().f2527y = f2;
                    C2486b.this.rotation().f2528z = 0.0f;
                    C2486b.this.f8242x.f8160b.visible(true);
                } else {
                    C2486b.this.f8213B = false;
                    C2486b.this.f8242x.position().f2526x = f5;
                    C2486b.this.f8242x.position().f2527y = f6;
                    C2486b.this.rotation().f2528z = degrees;
                    C2486b.this.f8242x.f8160b.visible(false);
                }
                C2486b.this.alpha(255.0f * f18);
                if (f18 >= f13) {
                    if (f18 < f13 || f18 >= f14) {
                        if (f18 < f14 || f18 >= f15) {
                            if (f18 < f15 || f18 >= f16) {
                                if (f18 >= f16 && f18 < f17) {
                                    float f19 = (f18 - f16) / f11;
                                    float f20 = 1.768034f * C2486b.this.f8242x.f8162d;
                                    C2486b.this.m5420a(0.0f, 0.0f, (((f3 * 1.1f) - f20) * f19) + f20, f20 + (((f4 * 1.1f) - f20) * f19), 1.0f, 1.0f);
                                    C2486b.this.m5424a(1.05f * f19);
                                } else if (f18 >= f17 && f18 < 1.0f) {
                                    float f21 = (f18 - f17) / f12;
                                    C2486b.this.m5420a(0.0f, 0.0f, f3, f4, 0.8f, (float) Math.cos(f21 * 3.141592653589793d * 1.5d));
                                    C2486b.this.m5421a(0.0f, 0.0f, f3, f4, 0.2f);
                                    C2486b.this.m5424a((((float) Math.cos(f21 * 3.141592653589793d * 1.5d)) * 0.05f) + 1.0f);
                                }
                            }
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2486b.this.m5423a(f3, f4);
                C2486b.this.f8241w = 1;
            }
        };
        C1014c.m10326a(this);
        C1014c.m10325a(this, i3, c1017d);
    }

    /* renamed from: b */
    public void m5406b(final float f, final float f2, final float f3, final float f4) {
        setAABBPX((-f3) / 2.0f, (-f4) / 2.0f, 0.0f, f3 / 2.0f, f4 / 2.0f, 0.0f);
        this.f8242x.mo3599d();
        this.f8236r = f3;
        this.f8237s = f4;
        this.f8241w = 2;
        this.f8242x.m5458g();
        final float f5 = this.f8242x.position().f2526x;
        final float f6 = this.f8242x.position().f2527y;
        float f7 = f - f5;
        float f8 = f2 - f6;
        final float sqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
        final float degrees = ((float) Math.toDegrees(Math.atan(f8 / f7))) - 90.0f;
        if (f5 > f) {
            degrees += 180.0f;
        }
        rotation().f2528z = degrees;
        int i = (int) (500.0f * this.f8243y);
        int i2 = (int) (500.0f * this.f8244z);
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
        this.f8218G = 0.0f;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.c.b.6
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f22) {
                C2486b.this.f8218G = f22;
                if (f22 >= f20) {
                    C2486b.this.f8213B = true;
                    C2486b.this.f8242x.position().f2526x = f;
                    C2486b.this.f8242x.position().f2527y = f2;
                    C2486b.this.rotation().f2528z = 0.0f;
                    C2486b.this.f8242x.f8160b.visible(true);
                } else {
                    C2486b.this.f8213B = false;
                    C2486b.this.f8242x.position().f2526x = f5;
                    C2486b.this.f8242x.position().f2527y = f6;
                    C2486b.this.rotation().f2528z = degrees;
                    C2486b.this.f8242x.f8160b.visible(false);
                }
                if (f22 < f17) {
                    float f23 = (f22 - 0.0f) / f11;
                    float f24 = 25.0f * C2486b.this.f8242x.f8162d;
                    float f25 = f24 + (f24 * f23);
                    float f26 = f24 + (f23 * f24);
                    C2486b.this.f8214C = f25;
                    C2486b.this.f8215D = f26;
                    C2486b.this.f8216E = 0.0f;
                    C2486b.this.f8217F = 0.0f;
                    C2486b.this.m5405b(0.0f, 0.0f, f26, f25, 0.5f);
                } else if (f22 >= f17 && f22 < f18) {
                    float f27 = (f22 - f17) / f12;
                    float f28 = 50.0f * C2486b.this.f8242x.f8162d;
                    float f29 = f28 + (30.0f * C2486b.this.f8242x.f8162d * f27);
                    float f30 = f28 - ((C2486b.this.f8242x.f8162d * 48.0f) * f27);
                    float f31 = sqrt * f27;
                    C2486b.this.f8214C = f30;
                    C2486b.this.f8215D = f29;
                    C2486b.this.f8216E = 0.0f;
                    C2486b.this.f8217F = f31;
                    C2486b.this.m5405b(f31, 0.0f, f29, f30, 0.5f);
                } else if (f22 >= f18 && f22 < f19) {
                    float f32 = (f22 - f18) / f13;
                    float f33 = 50.0f * C2486b.this.f8242x.f8162d;
                    float f34 = 10.0f * C2486b.this.f8242x.f8162d;
                    float f35 = (40.0f * C2486b.this.f8242x.f8162d * f32) + f33;
                    float f36 = f34 + (80.0f * C2486b.this.f8242x.f8162d * f32);
                    float f37 = sqrt * f32;
                    C2486b.this.f8214C = f36;
                    C2486b.this.f8215D = f35;
                    C2486b.this.f8216E = f37;
                    C2486b.this.f8217F = sqrt;
                    C2486b.this.m5405b(sqrt, f37, f35, f36, 0.5f);
                } else if (f22 >= f19 && f22 < f20) {
                    float f38 = (f22 - f19) / f14;
                    float f39 = 90.0f * C2486b.this.f8242x.f8162d;
                    float f40 = 110.0f * C2486b.this.f8242x.f8162d;
                    float f41 = (f40 * f38) + f39;
                    float f42 = f39 + (f38 * f40);
                    C2486b.this.f8214C = f42;
                    C2486b.this.f8215D = f41;
                    C2486b.this.f8216E = sqrt;
                    C2486b.this.f8217F = sqrt;
                    C2486b.this.m5405b(sqrt, sqrt, f41, f42, 1.0f);
                } else if (f22 >= f20 && f22 < f21) {
                    float f43 = (f22 - f20) / f15;
                    float f44 = 353.6068f * C2486b.this.f8242x.f8162d;
                    C2486b.this.m5420a(0.0f, 0.0f, (((f3 * 1.1f) - f44) * f43) + f44, f44 + (((f4 * 1.1f) - f44) * f43), 1.0f, 1.0f);
                    C2486b.this.m5424a(1.05f * f43);
                } else if (f22 >= f21 && f22 < 1.0f) {
                    float f45 = (f22 - f21) / f16;
                    C2486b.this.m5420a(0.0f, 0.0f, f3, f4, 0.8f, (float) Math.cos(f45 * 3.141592653589793d * 1.5d));
                    C2486b.this.m5421a(0.0f, 0.0f, f3, f4, 0.2f);
                    C2486b.this.m5424a((((float) Math.cos(f45 * 3.141592653589793d * 1.5d)) * 0.05f) + 1.0f);
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2486b.this.m5423a(f3, f4);
                C2486b.this.f8241w = 1;
            }
        };
        C1014c.m10326a(this);
        C1014c.m10325a(this, i3, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5405b(float f, float f2, float f3, float f4, float f5) {
        float f6 = f3 / f4;
        C2501a[] m5399c = m5399c(f, f2, f3, f4);
        C2501a[] m5395d = m5395d(f, f2, f3, f4);
        boolean z = Math.abs(f - f2) > (f3 + f4) / 2.0f;
        for (int i = 0; i < this.f8226h; i++) {
            for (int i2 = 0; i2 < this.f8226h; i2++) {
                C2501a c2501a = this.f8221c[m5418a(i2, i)];
                c2501a.f8325g = f5;
                c2501a.f8322d = 0.0f;
                c2501a.f8323e = 0.0f;
                if (i2 == 0) {
                    c2501a.f8322d = 0 - f4;
                } else if (i2 == this.f8234p) {
                    c2501a.f8322d = 0 + f4;
                }
                if (i == 0) {
                    c2501a.f8323e = 0 - f4;
                } else if (i == this.f8234p) {
                    c2501a.f8323e = 0 + f4;
                }
                if (i >= this.f8235q) {
                    c2501a.f8323e *= f6;
                    c2501a.f8322d *= f6;
                    c2501a.f8323e += f;
                } else {
                    c2501a.f8323e += f2;
                }
                if (i < this.f8235q && i > 1) {
                    float f7 = (i - 2.0f) / (this.f8234p - 2.0f);
                    c2501a.f8323e += (f - f2) * f7;
                    if (z) {
                        if (i2 == 0) {
                            C2501a m5409a = m5409a(m5399c, f7);
                            c2501a.f8322d = m5409a.f8319a;
                            c2501a.f8323e = m5409a.f8320b;
                        } else if (i2 == this.f8234p) {
                            C2501a m5409a2 = m5409a(m5395d, f7);
                            c2501a.f8322d = m5409a2.f8319a;
                            c2501a.f8323e = m5409a2.f8320b;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private C2501a[] m5399c(float f, float f2, float f3, float f4) {
        return f4 < f3 ? new C2501a[]{new C2501a(-f4, f2, 0.0f), new C2501a(-f4, f, 0.0f), new C2501a(-f3, f - f3, 0.0f), new C2501a(-f3, f, 0.0f)} : new C2501a[]{new C2501a(-f4, f2, 0.0f), new C2501a(-f4, f2 + f4, 0.0f), new C2501a(-f3, f2, 0.0f), new C2501a(-f3, f, 0.0f)};
    }

    /* renamed from: d */
    private C2501a[] m5395d(float f, float f2, float f3, float f4) {
        return f4 < f3 ? new C2501a[]{new C2501a(f4, f2, 0.0f), new C2501a(f4, f, 0.0f), new C2501a(f3, f - f3, 0.0f), new C2501a(f3, f, 0.0f)} : new C2501a[]{new C2501a(f4, f2, 0.0f), new C2501a(f4, f2 + f4, 0.0f), new C2501a(f3, f2, 0.0f), new C2501a(f3, f, 0.0f)};
    }

    /* renamed from: a */
    private C2501a m5409a(C2501a[] c2501aArr, float f) {
        C2501a c2501a = new C2501a(0.0f, 0.0f, 0.0f, 0, 0);
        float f2 = (float) ((c2501aArr[1].f8319a - c2501aArr[0].f8319a) * 3.0d);
        float f3 = (float) (((c2501aArr[2].f8319a - c2501aArr[1].f8319a) * 3.0d) - f2);
        float f4 = (float) ((c2501aArr[1].f8320b - c2501aArr[0].f8320b) * 3.0d);
        float f5 = (float) (((c2501aArr[2].f8320b - c2501aArr[1].f8320b) * 3.0d) - f4);
        float f6 = f * f;
        float f7 = f6 * f;
        float f8 = f2 * f;
        c2501a.f8319a = f8 + (f3 * f6) + ((((c2501aArr[3].f8319a - c2501aArr[0].f8319a) - f2) - f3) * f7) + c2501aArr[0].f8319a;
        c2501a.f8320b = ((((c2501aArr[3].f8320b - c2501aArr[0].f8320b) - f4) - f5) * f7) + (f5 * f6) + (f4 * f) + c2501aArr[0].f8320b;
        return c2501a;
    }

    /* renamed from: b */
    private void m5407b(float f) {
        float f2 = this.f8242x.f8163e;
        for (int i = 0; i < this.f8226h; i++) {
            for (int i2 = 0; i2 < this.f8226h; i2++) {
                C2501a c2501a = this.f8221c[m5418a(i2, i)];
                c2501a.f8322d = 0.0f;
                c2501a.f8323e = 0.0f;
                c2501a.f8325g = f;
                if (i2 == 0) {
                    c2501a.f8322d = 0 - (f2 / 2.0f);
                } else if (i2 == this.f8234p) {
                    c2501a.f8322d = 0 + (f2 / 2.0f);
                }
                if (i == 0) {
                    c2501a.f8323e = 0 - (f2 / 2.0f);
                } else if (i == this.f8234p) {
                    c2501a.f8323e = 0 + (f2 / 2.0f);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void drawElement() {
        if (visible()) {
            if (this.f8241w == 2) {
                m5392e();
            }
            ShaderManager.CURRENT_SHADER.glMVPMatrix();
            ShaderManager.CURRENT_SHADER.glTexCoordPointer(2, 5126, false, 0, this.f8222d);
            ShaderManager.CURRENT_SHADER.glVertexPointer(3, 5126, false, 0, this.f8219a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, textures().get(0).textureElement.f2529id);
            switch (this.f8241w) {
                case 0:
                    GLES20.glDrawElements(4, 6, 5123, this.f8224f);
                    break;
                case 1:
                    GLES20.glDrawElements(4, 54, 5123, this.f8225g);
                    break;
                case 2:
                    GLES20.glDrawElements(4, this.f8230l, 5123, this.f8223e);
                    break;
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
