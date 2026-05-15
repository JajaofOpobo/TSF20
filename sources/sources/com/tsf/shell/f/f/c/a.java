package com.tsf.shell.f.f.c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.b;
import com.tsf.shell.f.f.g;
import com.tsf.shell.manager.n.a;
import com.tsf.shell.utils.r;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a implements b.a, e.a {
    private TextureElement b;
    private j c;
    private com.tsf.shell.f.i.b d;
    private float g;
    private float h;
    private int i;
    private int j;
    private g l;
    private a.C0133a m;
    private boolean e = false;
    private boolean f = false;
    private float[] k = {0.0f, 0.0f};
    public C0109a a = new C0109a();

    public static class b {
        public int a = 0;
        public int b = 0;
        public float c = 0.0f;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.f.c.a$a, reason: collision with other inner class name */
    public class C0109a {
        public com.censivn.C3DEngine.b.f.a.a a;
        public float b;
        public float c;
        public float d;
        private float f;
        private float g;
        private int h;
        private int i;
        private int j;
        private int k;

        public C0109a() {
        }

        public void a(float f, float f2, float f3, float f4) {
            this.d = com.censivn.C3DEngine.b.b.a.a(160.0f);
            this.j = (int) (f / f3);
            this.k = (int) (f2 / f4);
            this.h = this.j * 2;
            this.i = this.k * 2;
            this.b = f / this.j;
            this.c = f2 / this.k;
            this.f = f / this.h;
            this.g = f2 / this.i;
            int i = (this.h + 1) * (this.i + 1);
            this.a = new com.censivn.C3DEngine.b.f.a.a(i, 26, 26, true);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.a(i2).a(0, 0, 1, 1, 26.0f * com.censivn.C3DEngine.b.b.a.c, 26.0f * com.censivn.C3DEngine.b.b.a.c);
            }
            float f5 = ((-f) / 2.0f) + com.censivn.C3DEngine.b.b.a.k;
            float f6 = (f2 / 2.0f) - com.censivn.C3DEngine.b.b.a.m;
            for (int i3 = 0; i3 < this.i + 1; i3++) {
                for (int i4 = 0; i4 < this.h + 1; i4++) {
                    float f7 = com.censivn.C3DEngine.b.b.a.r + (this.f * i4);
                    float f8 = com.censivn.C3DEngine.b.b.a.s - (this.g * i3);
                    com.censivn.C3DEngine.b.f.a.b bVarA = this.a.a(((this.h + 1) * i3) + i4);
                    b bVar = new b();
                    bVar.a = i4;
                    bVar.b = i3;
                    bVarA.a(bVar);
                    bVarA.i().x = f7;
                    bVarA.i().y = f8;
                    bVarA.I = 0.0f;
                    bVarA.h();
                }
            }
            this.a.textures().addElement(a.this.b);
        }
    }

    public a() {
        com.tsf.shell.manager.a.b.a(this);
        this.c = new j() { // from class: com.tsf.shell.f.f.c.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (a.this.e && !a.this.f) {
                    int iB = a.this.a.a.b();
                    for (int i = 0; i < iB; i++) {
                        ((b) a.this.a.a.a(i).a()).c = 23.0f;
                    }
                    if (a.this.d != null) {
                        float f = (a.this.d.position().x + (a.this.a.f / 2.0f)) - ((a.this.i * a.this.a.f) / 2.0f);
                        float f2 = a.this.d.position().y + (a.this.a.g / 2.0f) + ((a.this.j * a.this.a.g) / 2.0f);
                        if (f < com.censivn.C3DEngine.b.b.a.r) {
                            f = com.censivn.C3DEngine.b.b.a.r;
                        }
                        if (f2 > com.censivn.C3DEngine.b.b.a.s) {
                            f2 = com.censivn.C3DEngine.b.b.a.s;
                        }
                        int i2 = (int) ((f - com.censivn.C3DEngine.b.b.a.r) / a.this.a.f);
                        int i3 = a.this.a.i - ((int) ((f2 - com.censivn.C3DEngine.b.b.a.u) / a.this.a.g));
                        int i4 = i2 + a.this.i;
                        int i5 = i4 > a.this.a.h ? a.this.a.h : i4;
                        int i6 = i5 - a.this.i;
                        int i7 = i6 < 0 ? 0 : i6;
                        int i8 = a.this.j + i3;
                        int i9 = i8 > a.this.a.i ? a.this.a.i : i8;
                        int i10 = i9 - a.this.j;
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        float f3 = (((i5 - i7) * a.this.a.f) / 2.0f) + com.censivn.C3DEngine.b.b.a.r + (i7 * a.this.a.f);
                        float f4 = (com.censivn.C3DEngine.b.b.a.s - (i10 * a.this.a.g)) - (((i9 - i10) * a.this.a.g) / 2.0f);
                        a.this.k[0] = f3;
                        a.this.k[1] = f4;
                        while (true) {
                            int i11 = i10;
                            if (i11 >= i9 + 1) {
                                break;
                            }
                            for (int i12 = i7; i12 < i5 + 1; i12++) {
                                ((b) a.this.a.a.a(((a.this.a.h + 1) * i11) + i12).a()).c = 230.0f;
                            }
                            i10 = i11 + 1;
                        }
                    }
                    for (int i13 = 0; i13 < iB; i13++) {
                        com.censivn.C3DEngine.b.f.a.b bVarA = a.this.a.a.a(i13);
                        b bVar = (b) bVarA.a();
                        float fC = bVarA.c();
                        bVarA.a(((bVar.c - fC) * 0.2f) + fC);
                    }
                }
            }
        };
        c();
    }

    public float[] a() {
        return this.k;
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.b = x.b(b.d.grid_point);
        this.a.a(com.censivn.C3DEngine.b.b.a.p, com.censivn.C3DEngine.b.b.a.q, r.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.i), r.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.j));
    }

    public boolean a(g gVar) {
        if (this.e) {
            return false;
        }
        this.l = gVar;
        this.l.f();
        com.censivn.C3DEngine.b.c.b.a(this);
        this.e = true;
        gVar.addChildAt(this.c, 0);
        this.m = com.tsf.shell.manager.a.q.a(this.m, "Desktop reference grid");
        this.c.children().clear();
        this.a.a.removeFromParent();
        this.c.addChild(this.a.a);
        c.a(this.c);
        return true;
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        this.d = bVar;
        float fU = this.d.u();
        this.g = (this.d.maxX() - this.d.minX()) * fU;
        this.h = fU * (this.d.maxY() - this.d.minY());
        this.i = (int) (this.g / this.a.f);
        this.i = this.g % this.a.f != 0.0f ? this.i + 1 : this.i;
        this.i = this.i < 1 ? 1 : this.i;
        this.j = (int) (this.h / this.a.g);
        this.j = this.h % this.a.g != 0.0f ? this.j + 1 : this.j;
        this.j = this.j >= 1 ? this.j : 1;
    }

    public void b(com.tsf.shell.f.i.b bVar) {
        this.d = null;
    }

    public int[] a(int i, int i2) {
        int i3 = (int) (i / this.a.b);
        if (i % this.a.b != 0.0f) {
            i3++;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = (int) (i2 / this.a.c);
        if (i2 % this.a.c != 0.0f) {
            i4++;
        }
        if (i4 < 1) {
            i4 = 1;
        }
        return new int[]{(int) (i3 * this.a.b), (int) (i4 * this.a.c)};
    }

    public void d() {
        if (this.e) {
            this.e = false;
            this.l.g();
            this.l = null;
            final int iB = this.a.a.b();
            for (int i = 0; i < iB; i++) {
                com.censivn.C3DEngine.b.f.a.b bVarA = this.a.a.a(i);
                ((b) bVarA.a()).c = bVarA.c();
            }
            final C0109a c0109a = this.a;
            d dVar = new d() { // from class: com.tsf.shell.f.f.c.a.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < iB) {
                            com.censivn.C3DEngine.b.f.a.b bVarA2 = c0109a.a.a(i3);
                            bVarA2.a(((b) bVarA2.a()).c * (1.0f - f));
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    for (int i2 = 0; i2 < iB; i2++) {
                        com.censivn.C3DEngine.b.f.a.b bVarA2 = c0109a.a.a(i2);
                        ((b) bVarA2.a()).c = 0.0f;
                        bVarA2.a(0.0f);
                    }
                    a.this.d = null;
                    a.this.c.removeFromParent();
                    a.this.f = false;
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void c() {
                    a.this.f = false;
                }
            };
            c.a(this.c);
            c.a(this.c, 300, dVar);
            this.f = true;
            com.tsf.shell.manager.a.q.b(this.m);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            com.censivn.C3DEngine.b.c.b.b(this);
            d();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        this.a.a(com.censivn.C3DEngine.b.b.a.p, com.censivn.C3DEngine.b.b.a.q, r.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.i), r.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.j));
    }
}
