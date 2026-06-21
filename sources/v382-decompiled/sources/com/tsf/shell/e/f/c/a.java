package com.tsf.shell.e.f.c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.d;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.e.f.g;
import com.tsf.shell.utils.s;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class a implements d, k {
    private TextureElement b;
    private l c;
    private com.tsf.shell.e.i.c d;
    private float g;
    private float h;
    private int i;
    private int j;
    private g l;
    private com.tsf.shell.manager.n.b m;
    private boolean e = false;
    private boolean f = false;
    private float[] k = {0.0f, 0.0f};
    public b a = new b(this);

    public a() {
        com.tsf.shell.manager.a.b.a(this);
        this.c = new l() { // from class: com.tsf.shell.e.f.c.a.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                float f;
                float f2;
                float f3;
                float f4;
                float f5;
                int i;
                float f6;
                int i2;
                int i3;
                int i4;
                int i5;
                float f7;
                float f8;
                float f9;
                float f10;
                int i6;
                int i7;
                int i8;
                if (a.this.e && !a.this.f) {
                    int b = a.this.a.a.b();
                    for (int i9 = 0; i9 < b; i9++) {
                        ((c) a.this.a.a.a(i9).a()).c = 23.0f;
                    }
                    if (a.this.d != null) {
                        float f11 = a.this.d.position().x;
                        f = a.this.a.f;
                        float f12 = f11 + (f / 2.0f);
                        float f13 = a.this.i;
                        f2 = a.this.a.f;
                        float f14 = f12 - ((f13 * f2) / 2.0f);
                        float f15 = a.this.d.position().y;
                        f3 = a.this.a.g;
                        float f16 = f15 + (f3 / 2.0f);
                        float f17 = a.this.j;
                        f4 = a.this.a.g;
                        float f18 = f16 + ((f17 * f4) / 2.0f);
                        if (f14 < com.censivn.C3DEngine.b.b.a.r) {
                            f14 = com.censivn.C3DEngine.b.b.a.r;
                        }
                        if (f18 > com.censivn.C3DEngine.b.b.a.s) {
                            f18 = com.censivn.C3DEngine.b.b.a.s;
                        }
                        f5 = a.this.a.f;
                        int i10 = (int) ((f14 - com.censivn.C3DEngine.b.b.a.r) / f5);
                        i = a.this.a.i;
                        f6 = a.this.a.g;
                        int i11 = i - ((int) ((f18 - com.censivn.C3DEngine.b.b.a.u) / f6));
                        int i12 = i10 + a.this.i;
                        i2 = a.this.a.h;
                        if (i12 > i2) {
                            i8 = a.this.a.h;
                            i3 = i8;
                        } else {
                            i3 = i12;
                        }
                        int i13 = i3 - a.this.i;
                        int i14 = i13 < 0 ? 0 : i13;
                        int i15 = a.this.j + i11;
                        i4 = a.this.a.i;
                        if (i15 > i4) {
                            i7 = a.this.a.i;
                            i5 = i7;
                        } else {
                            i5 = i15;
                        }
                        int i16 = i5 - a.this.j;
                        if (i16 < 0) {
                            i16 = 0;
                        }
                        f7 = a.this.a.f;
                        float f19 = (((i3 - i14) * f7) / 2.0f) + com.censivn.C3DEngine.b.b.a.r;
                        f8 = a.this.a.f;
                        float f20 = com.censivn.C3DEngine.b.b.a.s;
                        f9 = a.this.a.g;
                        float f21 = f20 - (i16 * f9);
                        f10 = a.this.a.g;
                        a.this.k[0] = f19 + (i14 * f8);
                        a.this.k[1] = f21 - (((i5 - i16) * f10) / 2.0f);
                        while (true) {
                            int i17 = i16;
                            if (i17 >= i5 + 1) {
                                break;
                            }
                            for (int i18 = i14; i18 < i3 + 1; i18++) {
                                com.censivn.C3DEngine.b.f.a.a aVar = a.this.a.a;
                                i6 = a.this.a.h;
                                ((c) aVar.a(((i6 + 1) * i17) + i18).a()).c = 230.0f;
                            }
                            i16 = i17 + 1;
                        }
                    }
                    for (int i19 = 0; i19 < b; i19++) {
                        com.censivn.C3DEngine.b.f.a.b a = a.this.a.a.a(i19);
                        c cVar = (c) a.a();
                        float c = a.c();
                        a.a(((cVar.c - c) * 0.2f) + c);
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
        this.b = x.b(R.drawable.grid_point);
        this.a.a(com.censivn.C3DEngine.b.b.a.p, com.censivn.C3DEngine.b.b.a.q, s.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.i), s.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.j));
    }

    public boolean a(g gVar) {
        if (this.e) {
            return false;
        }
        this.l = gVar;
        this.l.f();
        com.censivn.C3DEngine.b.c.c.a(this);
        this.e = true;
        gVar.addChildAt(this.c, 0);
        this.m = com.tsf.shell.manager.a.q.a(this.m, "Desktop reference grid");
        this.c.children().clear();
        this.a.a.removeFromParent();
        this.c.addChild(this.a.a);
        w.a(this.c);
        return true;
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        this.d = cVar;
        float u = this.d.u();
        this.g = (this.d.maxX() - this.d.minX()) * u;
        this.h = u * (this.d.maxY() - this.d.minY());
        float f5 = this.g;
        f = this.a.f;
        this.i = (int) (f5 / f);
        float f6 = this.g;
        f2 = this.a.f;
        this.i = f6 % f2 != 0.0f ? this.i + 1 : this.i;
        this.i = this.i < 1 ? 1 : this.i;
        float f7 = this.h;
        f3 = this.a.g;
        this.j = (int) (f7 / f3);
        float f8 = this.h;
        f4 = this.a.g;
        this.j = f8 % f4 != 0.0f ? this.j + 1 : this.j;
        this.j = this.j >= 1 ? this.j : 1;
    }

    public void b(com.tsf.shell.e.i.c cVar) {
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
            final int b = this.a.a.b();
            for (int i = 0; i < b; i++) {
                com.censivn.C3DEngine.b.f.a.b a = this.a.a.a(i);
                ((c) a.a()).c = a.c();
            }
            final b bVar = this.a;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.c.a.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < b) {
                            com.censivn.C3DEngine.b.f.a.b a2 = bVar.a.a(i3);
                            a2.a(((c) a2.a()).c * (1.0f - f));
                            i2 = i3 + 1;
                        } else {
                            return;
                        }
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    for (int i2 = 0; i2 < b; i2++) {
                        com.censivn.C3DEngine.b.f.a.b a2 = bVar.a.a(i2);
                        ((c) a2.a()).c = 0.0f;
                        a2.a(0.0f);
                    }
                    a.this.d = null;
                    a.this.c.removeFromParent();
                    a.this.f = false;
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void c() {
                    a.this.f = false;
                }
            };
            w.a(this.c);
            w.a(this.c, 300, xVar);
            this.f = true;
            com.tsf.shell.manager.a.q.b(this.m);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            com.censivn.C3DEngine.b.c.c.b(this);
            d();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        this.a.a(com.censivn.C3DEngine.b.b.a.p, com.censivn.C3DEngine.b.b.a.q, s.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.i), s.a(com.censivn.C3DEngine.a.d(), com.censivn.C3DEngine.b.b.a.j));
    }
}
