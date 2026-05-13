package com.tsf.shell.p096f.p131f.p143c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0915b;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.utils.C4182r;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.f.c.a */
/* loaded from: classes.dex */
public class C2913a implements C0915b.InterfaceC0918a, C0925e.InterfaceC0934a {

    /* renamed from: b */
    private TextureElement f9444b;

    /* renamed from: c */
    private C0980j f9445c;

    /* renamed from: d */
    private C3112b f9446d;

    /* renamed from: g */
    private float f9449g;

    /* renamed from: h */
    private float f9450h;

    /* renamed from: i */
    private int f9451i;

    /* renamed from: j */
    private int f9452j;

    /* renamed from: l */
    private C2932g f9454l;

    /* renamed from: m */
    private C3550a.C3558a f9455m;

    /* renamed from: e */
    private boolean f9447e = false;

    /* renamed from: f */
    private boolean f9448f = false;

    /* renamed from: k */
    private float[] f9453k = {0.0f, 0.0f};

    /* renamed from: a */
    public C2916a f9443a = new C2916a();

    /* renamed from: com.tsf.shell.f.f.c.a$b */
    /* loaded from: classes.dex */
    public static class C2917b {

        /* renamed from: a */
        public int f9471a = 0;

        /* renamed from: b */
        public int f9472b = 0;

        /* renamed from: c */
        public float f9473c = 0.0f;
    }

    /* renamed from: com.tsf.shell.f.f.c.a$a */
    /* loaded from: classes.dex */
    public class C2916a {

        /* renamed from: a */
        public C0962a f9460a;

        /* renamed from: b */
        public float f9461b;

        /* renamed from: c */
        public float f9462c;

        /* renamed from: d */
        public float f9463d;

        /* renamed from: f */
        private float f9465f;

        /* renamed from: g */
        private float f9466g;

        /* renamed from: h */
        private int f9467h;

        /* renamed from: i */
        private int f9468i;

        /* renamed from: j */
        private int f9469j;

        /* renamed from: k */
        private int f9470k;

        public C2916a() {
        }

        /* renamed from: a */
        public void m4321a(float f, float f2, float f3, float f4) {
            this.f9463d = C0892a.m10742a(160.0f);
            this.f9469j = (int) (f / f3);
            this.f9470k = (int) (f2 / f4);
            this.f9467h = this.f9469j * 2;
            this.f9468i = this.f9470k * 2;
            this.f9461b = f / this.f9469j;
            this.f9462c = f2 / this.f9470k;
            this.f9465f = f / this.f9467h;
            this.f9466g = f2 / this.f9468i;
            int i = (this.f9467h + 1) * (this.f9468i + 1);
            this.f9460a = new C0962a(i, 26, 26, true);
            for (int i2 = 0; i2 < i; i2++) {
                this.f9460a.m10456a(i2).m10438a(0, 0, 1, 1, 26.0f * C0892a.f2567c, 26.0f * C0892a.f2567c);
            }
            float f5 = ((-f) / 2.0f) + C0892a.f2575k;
            float f6 = (f2 / 2.0f) - C0892a.f2577m;
            for (int i3 = 0; i3 < this.f9468i + 1; i3++) {
                for (int i4 = 0; i4 < this.f9467h + 1; i4++) {
                    float f7 = C0892a.f2582r + (this.f9465f * i4);
                    float f8 = C0892a.f2583s - (this.f9466g * i3);
                    C0964b m10456a = this.f9460a.m10456a(((this.f9467h + 1) * i3) + i4);
                    C2917b c2917b = new C2917b();
                    c2917b.f9471a = i4;
                    c2917b.f9472b = i3;
                    m10456a.m10434a(c2917b);
                    m10456a.m10407i().f2526x = f7;
                    m10456a.m10407i().f2527y = f8;
                    m10456a.f2831I = 0.0f;
                    m10456a.m10408h();
                }
            }
            this.f9460a.textures().addElement(C2913a.this.f9444b);
        }
    }

    public C2913a() {
        C3359a.f11088b.m10565a(this);
        this.f9445c = new C0980j() { // from class: com.tsf.shell.f.f.c.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2913a.this.f9447e && !C2913a.this.f9448f) {
                    int m10447b = C2913a.this.f9443a.f9460a.m10447b();
                    for (int i = 0; i < m10447b; i++) {
                        ((C2917b) C2913a.this.f9443a.f9460a.m10456a(i).m10444a()).f9473c = 23.0f;
                    }
                    if (C2913a.this.f9446d != null) {
                        float f = (C2913a.this.f9446d.position().f2526x + (C2913a.this.f9443a.f9465f / 2.0f)) - ((C2913a.this.f9451i * C2913a.this.f9443a.f9465f) / 2.0f);
                        float f2 = C2913a.this.f9446d.position().f2527y + (C2913a.this.f9443a.f9466g / 2.0f) + ((C2913a.this.f9452j * C2913a.this.f9443a.f9466g) / 2.0f);
                        if (f < C0892a.f2582r) {
                            f = C0892a.f2582r;
                        }
                        if (f2 > C0892a.f2583s) {
                            f2 = C0892a.f2583s;
                        }
                        int i2 = C2913a.this.f9443a.f9468i - ((int) ((f2 - C0892a.f2585u) / C2913a.this.f9443a.f9466g));
                        int i3 = ((int) ((f - C0892a.f2582r) / C2913a.this.f9443a.f9465f)) + C2913a.this.f9451i;
                        int i4 = i3 > C2913a.this.f9443a.f9467h ? C2913a.this.f9443a.f9467h : i3;
                        int i5 = i4 - C2913a.this.f9451i;
                        int i6 = i5 < 0 ? 0 : i5;
                        int i7 = C2913a.this.f9452j + i2;
                        int i8 = i7 > C2913a.this.f9443a.f9468i ? C2913a.this.f9443a.f9468i : i7;
                        int i9 = i8 - C2913a.this.f9452j;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        float f3 = (((i4 - i6) * C2913a.this.f9443a.f9465f) / 2.0f) + C0892a.f2582r + (i6 * C2913a.this.f9443a.f9465f);
                        float f4 = (C0892a.f2583s - (i9 * C2913a.this.f9443a.f9466g)) - (((i8 - i9) * C2913a.this.f9443a.f9466g) / 2.0f);
                        C2913a.this.f9453k[0] = f3;
                        C2913a.this.f9453k[1] = f4;
                        while (true) {
                            int i10 = i9;
                            if (i10 >= i8 + 1) {
                                break;
                            }
                            for (int i11 = i6; i11 < i4 + 1; i11++) {
                                ((C2917b) C2913a.this.f9443a.f9460a.m10456a(((C2913a.this.f9443a.f9467h + 1) * i10) + i11).m10444a()).f9473c = 230.0f;
                            }
                            i9 = i10 + 1;
                        }
                    }
                    for (int i12 = 0; i12 < m10447b; i12++) {
                        C0964b m10456a = C2913a.this.f9443a.f9460a.m10456a(i12);
                        float m10425c = m10456a.m10425c();
                        m10456a.m10443a(((((C2917b) m10456a.m10444a()).f9473c - m10425c) * 0.2f) + m10425c);
                    }
                }
            }
        };
        m4330c();
    }

    /* renamed from: a */
    public float[] m4340a() {
        return this.f9453k;
    }

    /* renamed from: b */
    public boolean m4333b() {
        return this.f9447e;
    }

    /* renamed from: c */
    public void m4330c() {
        this.f9444b = C4189x.m593b(C1306b.C1310d.grid_point);
        this.f9443a.m4321a(C0892a.f2580p, C0892a.f2581q, C4182r.m631a(C0853a.m10856d(), C0892a.f2573i), C4182r.m631a(C0853a.m10856d(), C0892a.f2574j));
    }

    /* renamed from: a */
    public boolean m4335a(C2932g c2932g) {
        if (this.f9447e) {
            return false;
        }
        this.f9454l = c2932g;
        this.f9454l.m4196f();
        C0915b.m10597a(this);
        this.f9447e = true;
        c2932g.addChildAt(this.f9445c, 0);
        this.f9455m = C3359a.f11103q.m2043a(this.f9455m, "Desktop reference grid");
        this.f9445c.children().clear();
        this.f9443a.f9460a.removeFromParent();
        this.f9445c.addChild(this.f9443a.f9460a);
        C1014c.m10326a(this.f9445c);
        return true;
    }

    /* renamed from: a */
    public void m4334a(C3112b c3112b) {
        this.f9446d = c3112b;
        float m3491u = this.f9446d.m3491u();
        this.f9449g = (this.f9446d.maxX() - this.f9446d.minX()) * m3491u;
        this.f9450h = m3491u * (this.f9446d.maxY() - this.f9446d.minY());
        this.f9451i = (int) (this.f9449g / this.f9443a.f9465f);
        this.f9451i = this.f9449g % this.f9443a.f9465f != 0.0f ? this.f9451i + 1 : this.f9451i;
        this.f9451i = this.f9451i < 1 ? 1 : this.f9451i;
        this.f9452j = (int) (this.f9450h / this.f9443a.f9466g);
        this.f9452j = this.f9450h % this.f9443a.f9466g != 0.0f ? this.f9452j + 1 : this.f9452j;
        this.f9452j = this.f9452j >= 1 ? this.f9452j : 1;
    }

    /* renamed from: b */
    public void m4331b(C3112b c3112b) {
        this.f9446d = null;
    }

    /* renamed from: a */
    public int[] m4339a(int i, int i2) {
        int i3 = (int) (i / this.f9443a.f9461b);
        if (i % this.f9443a.f9461b != 0.0f) {
            i3++;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = (int) (i2 / this.f9443a.f9462c);
        if (i2 % this.f9443a.f9462c != 0.0f) {
            i4++;
        }
        if (i4 < 1) {
            i4 = 1;
        }
        return new int[]{(int) (i3 * this.f9443a.f9461b), (int) (i4 * this.f9443a.f9462c)};
    }

    /* renamed from: d */
    public void m4328d() {
        if (this.f9447e) {
            this.f9447e = false;
            this.f9454l.m4194g();
            this.f9454l = null;
            final int m10447b = this.f9443a.f9460a.m10447b();
            for (int i = 0; i < m10447b; i++) {
                C0964b m10456a = this.f9443a.f9460a.m10456a(i);
                ((C2917b) m10456a.m10444a()).f9473c = m10456a.m10425c();
            }
            final C2916a c2916a = this.f9443a;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.c.a.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < m10447b) {
                            C0964b m10456a2 = c2916a.f9460a.m10456a(i3);
                            m10456a2.m10443a(((C2917b) m10456a2.m10444a()).f9473c * (1.0f - f));
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    for (int i2 = 0; i2 < m10447b; i2++) {
                        C0964b m10456a2 = c2916a.f9460a.m10456a(i2);
                        ((C2917b) m10456a2.m10444a()).f9473c = 0.0f;
                        m10456a2.m10443a(0.0f);
                    }
                    C2913a.this.f9446d = null;
                    C2913a.this.f9445c.removeFromParent();
                    C2913a.this.f9448f = false;
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: c */
                public void mo4322c() {
                    C2913a.this.f9448f = false;
                }
            };
            C1014c.m10326a(this.f9445c);
            C1014c.m10325a(this.f9445c, 300, c1017d);
            this.f9448f = true;
            C3359a.f11103q.m2037b(this.f9455m);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: a */
    public void mo727a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C0915b.m10594b(this);
            m4328d();
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0915b.InterfaceC0918a
    /* renamed from: b */
    public void mo726b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        this.f9443a.m4321a(C0892a.f2580p, C0892a.f2581q, C4182r.m631a(C0853a.m10856d(), C0892a.f2573i), C4182r.m631a(C0853a.m10856d(), C0892a.f2574j));
    }
}
