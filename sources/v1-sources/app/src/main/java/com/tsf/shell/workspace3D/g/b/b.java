package com.tsf.shell.workspace3D.g.b;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.aq;
import com.tsf.shell.at;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends v implements at, bj, i {
    private com.censivn.C3DEngine.e.b A;
    private com.censivn.C3DEngine.e.b B;
    private com.censivn.C3DEngine.e.b C;
    private v D;
    private TextureElement E;
    private TextureElement F;
    private TextureElement G;
    private com.censivn.C3DEngine.b.l H;
    private k I;
    private com.tsf.shell.workspace3D.k.o J;
    private ArrayList K;
    private Number3d Q;
    private Number3d R;
    private Number3d S;
    private Number3d T;
    private Number3d U;
    private Number3d V;
    private Number3d W;
    private Number3d X;
    private Number3d Y;
    private Number3d Z;
    private Number3d aa;
    private Number3d ab;
    private Number3d ac;
    private Number3d ad;
    private Number3d ae;
    private Number3d af;
    private int ak;
    private int al;
    private com.tsf.shell.workspace3D.h.a ao;
    private int L = 0;
    private float M = 0.0f;
    private float N = 0.0f;
    private boolean O = false;
    private boolean P = false;
    private boolean am = false;
    private boolean an = true;
    private float ai = 32.0f * com.censivn.C3DEngine.a.a;
    private float aj = 32.0f * com.censivn.C3DEngine.a.a;
    private Number3d ag = new Number3d();
    private Number3d ah = new Number3d();
    private v a = this;

    public b(com.tsf.shell.workspace3D.h.a aVar, boolean z, boolean z2) {
        this.ao = aVar;
        ThemeShellDescription themeShellDescription = ThemeManager.getInstance().getCurrentThemeDescription().shell;
        this.K = new ArrayList();
        Bitmap bitmap = themeShellDescription.getBitmap(ThemeShellDescription.INTERACTIVE_ARRANGE_BG);
        this.E = com.censivn.C3DEngine.a.f().a(bitmap, true);
        bitmap.recycle();
        this.A = new c(this);
        this.A.z().c(this.E);
        this.A.c((Boolean) false);
        this.A.a_(true);
        this.A.as();
        this.H = new d(this, this.A);
        this.A.a(this.H);
        this.Q = this.A.E().getAsNumber3dPX(13);
        this.R = this.A.E().getAsNumber3dPX(9);
        this.S = this.A.E().getAsNumber3dPX(5);
        this.T = this.A.E().getAsNumber3dPX(1);
        this.U = this.A.E().getAsNumber3dPX(12);
        this.V = this.A.E().getAsNumber3dPX(8);
        this.W = this.A.E().getAsNumber3dPX(4);
        this.Y = this.A.E().getAsNumber3dPX(2);
        this.Z = this.A.E().getAsNumber3dPX(3);
        this.aa = this.A.E().getAsNumber3dPX(6);
        this.ab = this.A.E().getAsNumber3dPX(7);
        this.ac = this.A.E().getAsNumber3dPX(10);
        this.ad = this.A.E().getAsNumber3dPX(11);
        this.ae = this.A.E().getAsNumber3dPX(14);
        this.af = this.A.E().getAsNumber3dPX(15);
        this.X = this.A.E().getAsNumber3dPX(0);
        d(this.A);
        this.I = new e(this);
        this.J = new com.tsf.shell.workspace3D.k.o(this.I.b(), 3);
        this.I.aw().b = this.A;
        this.I.a((i) this);
        this.D = this.I.b();
        d(this.I);
        Bitmap bitmap2 = themeShellDescription.getBitmap(ThemeShellDescription.INTERACTIVE_ARRANGE_SCALE_BUTTON);
        this.F = com.censivn.C3DEngine.a.f().a(bitmap2, true);
        bitmap2.recycle();
        this.B = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1, true);
        this.B.z().c(this.F);
        this.B.a(-32.0f, -64.0f, 0.0f, 64.0f, 32.0f);
        this.B.a((com.censivn.C3DEngine.b.l) new f(this, this.A));
        d(this.B);
        Bitmap bitmap3 = themeShellDescription.getBitmap(ThemeShellDescription.PUBLIC_BUTTON_RETURN);
        this.G = com.censivn.C3DEngine.a.f().a(bitmap3, true);
        bitmap3.recycle();
        this.C = new com.censivn.C3DEngine.e.b(64.0f, 64.0f, 1, 1, true);
        this.C.z().c(this.G);
        this.C.a(-32.0f, -32.0f, 0.0f, 64.0f, 64.0f);
        this.C.a((com.censivn.C3DEngine.b.l) new g(this, this.A));
        d(this.C);
        if (z) {
            this.A.az();
        }
        aq.a(this);
        if (z2) {
            com.tsf.shell.tips.b.a(8);
        }
        this.ao.g(this);
        bd.a(this);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (!this.an) {
            this.a.L().x += (this.M - this.a.L().x) * 0.6f;
            this.a.L().y += (this.N - this.a.L().y) * 0.6f;
            if (Math.abs(this.a.L().x - this.M) < 0.2f && Math.abs(this.a.L().y - this.N) < 0.2f) {
                this.a.L().x = this.M;
                this.a.L().y = this.N;
                this.an = true;
            }
        }
        if (this.am) {
            if (this.a.L().x == 0.0f && this.a.L().y == 0.0f) {
                if (this.al < com.censivn.C3DEngine.a.h) {
                    this.al = com.censivn.C3DEngine.a.h;
                }
                if (this.ak > com.censivn.C3DEngine.a.f) {
                    this.ak = com.censivn.C3DEngine.a.f;
                }
                a(this.ak, -this.al);
            } else {
                if (this.al + this.a.L().y < com.censivn.C3DEngine.a.h) {
                    this.al = (int) (com.censivn.C3DEngine.a.h + this.a.L().y);
                }
                if (this.ak + this.a.L().x > com.censivn.C3DEngine.a.f) {
                    this.ak = (int) (com.censivn.C3DEngine.a.f - this.a.L().x);
                }
                int i = this.ak;
                int i2 = -this.al;
                float f = i - ((com.censivn.C3DEngine.a.a * 128.0f) / 2.0f);
                float f2 = i2 - ((com.censivn.C3DEngine.a.a * 128.0f) / 2.0f);
                if ((this.X.x + f) - this.A.E().pxX(15) < com.censivn.C3DEngine.a.a * 128.0f) {
                    f = ((com.censivn.C3DEngine.a.a * 128.0f) + this.A.E().pxX(15)) - this.X.x;
                }
                if ((this.A.E().pxY(15) - this.X.y) + f2 < com.censivn.C3DEngine.a.a * 128.0f) {
                    f2 = ((com.censivn.C3DEngine.a.a * 128.0f) - this.A.E().pxY(15)) + this.X.y;
                }
                this.B.L().x = this.ai + f;
                this.B.L().y = (-this.aj) - f2;
                this.C.L().x = this.ai + f;
                this.A.E().pxX(13, this.Q.x + f);
                this.A.E().pxX(9, this.R.x + f);
                this.A.E().pxX(5, this.S.x + f);
                this.A.E().pxX(1, this.T.x + f);
                this.A.E().pxX(12, this.U.x + f);
                this.A.E().pxX(8, this.V.x + f);
                this.A.E().pxX(4, this.W.x + f);
                this.A.E().pxX(0, f + this.X.x);
                this.A.E().pxY(0, this.X.y - f2);
                this.A.E().pxY(1, this.T.y - f2);
                this.A.E().pxY(2, this.Y.y - f2);
                this.A.E().pxY(3, this.Z.y - f2);
                this.A.E().pxY(4, this.W.y - f2);
                this.A.E().pxY(5, this.S.y - f2);
                this.A.E().pxY(6, this.aa.y - f2);
                this.A.E().pxY(7, this.ab.y - f2);
            }
            aG();
        }
    }

    public final r i() {
        return this.A;
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            k();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        this.K.add(jVar.L().m2clone());
        u uVar = new u();
        uVar.e(0.0f);
        s.a(jVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
        jVar.a(this.J);
        this.I.c(jVar);
        this.L = this.K.size();
        aG();
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
            this.K.add(jVar.L().m2clone());
            u uVar = new u();
            uVar.e(0.0f);
            s.a(jVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            jVar.a(this.J);
        }
        this.I.b(arrayList);
        this.L = this.K.size();
        aG();
    }

    private void aG() {
        int i;
        int i2;
        int round;
        int i3;
        int i4 = 2;
        this.ag.x = this.A.E().pxX(15);
        this.ag.y = this.A.E().pxY(15);
        this.ah.x = this.A.E().pxX(0);
        this.ah.y = this.A.E().pxY(0);
        int i5 = (int) (this.ah.x - this.ag.x);
        int i6 = (int) (this.ag.y - this.ah.y);
        if (this.L < 2) {
            i2 = 2;
            i = 2;
        } else if (i5 / (this.L - 1) > com.censivn.C3DEngine.a.a * 130.0f || i6 / (this.L - 1) > com.censivn.C3DEngine.a.a * 130.0f) {
            if (i5 > i6 / 2) {
                while (i5 / (i4 - 1) > com.censivn.C3DEngine.a.a * 130.0f && i4 < this.L) {
                    i4++;
                }
                if (this.L % i4 == 0) {
                    i2 = this.L / i4;
                    i = i4;
                } else {
                    i2 = (this.L / i4) + 1;
                    i = i4;
                }
            } else {
                while (i6 / (i4 - 1) > com.censivn.C3DEngine.a.a * 130.0f && i4 < this.L) {
                    i4++;
                }
                if (this.L % i4 == 0) {
                    i = this.L / i4;
                    i2 = i4;
                } else {
                    i = (this.L / i4) + 1;
                    i2 = i4;
                }
            }
        } else {
            if (i5 > i6) {
                round = (int) Math.round(i5 / i6);
                i3 = 2;
            } else {
                round = (int) Math.round(i6 / i5);
                i3 = 2;
            }
            while (true) {
                if (i5 > i6) {
                    i = i3 * round;
                    i2 = i3;
                } else {
                    i2 = i3 * round;
                    i = i3;
                }
                if (i * i2 >= this.L) {
                    break;
                } else {
                    i3++;
                }
            }
            if (round != 1) {
                if (i5 > i6) {
                    while ((i - 1) * i2 >= this.L && i != 2) {
                        i--;
                    }
                } else {
                    while ((i2 - 1) * i >= this.L && i2 != 2) {
                        i2--;
                    }
                }
            } else if (i6 > i5) {
                while ((i - 1) * i2 >= this.L && i != 2) {
                    i--;
                }
            } else {
                while ((i2 - 1) * i >= this.L && i2 != 2) {
                    i2--;
                }
            }
        }
        int i7 = (int) (60.0f * com.censivn.C3DEngine.a.a);
        int i8 = (int) (68.0f * com.censivn.C3DEngine.a.a);
        float f = i != 1 ? (i5 - (i7 * 2)) / (i - 1) : 0.0f;
        float f2 = i2 != 1 ? (i6 - (i8 * 2)) / (i2 - 1) : 0.0f;
        int i9 = (int) (this.ag.x + i7);
        int i10 = (int) (this.ag.y - i8);
        for (int i11 = 0; i11 < this.L; i11++) {
            Number3d number3d = (Number3d) this.K.get(i11);
            number3d.x = ((i11 % i) * f) + i9;
            number3d.y = i10 - ((i11 / i) * f2);
        }
        this.I.a(this.K);
        this.I.b((int) this.ag.x, (int) this.ah.y, 0.0f, (int) this.ah.x, (int) this.ag.y);
    }

    public final void j() {
        int i;
        if (400 > com.censivn.C3DEngine.a.j) {
            i = (com.censivn.C3DEngine.a.j / 2) - 20;
        } else {
            i = 200;
        }
        a(i, i);
    }

    public final void a(int i, int i2) {
        if (i < com.censivn.C3DEngine.a.a * 64.0f) {
            i = (int) (com.censivn.C3DEngine.a.a * 64.0f);
        }
        if (i2 < com.censivn.C3DEngine.a.a * 64.0f) {
            i2 = (int) (com.censivn.C3DEngine.a.a * 64.0f);
        }
        int i3 = i - (((int) (com.censivn.C3DEngine.a.a * 128.0f)) / 2);
        int i4 = i2 - (((int) (com.censivn.C3DEngine.a.a * 128.0f)) / 2);
        this.B.L().x = i - this.ai;
        this.B.L().y = (-i2) + this.aj;
        this.C.L().x = i - this.ai;
        this.C.L().y = i2 - this.aj;
        this.A.E().pxX(13, this.Q.x + i3);
        this.A.E().pxX(9, this.R.x + i3);
        this.A.E().pxX(5, this.S.x + i3);
        this.A.E().pxX(1, this.T.x + i3);
        this.A.E().pxX(12, this.U.x + i3);
        this.A.E().pxX(8, this.V.x + i3);
        this.A.E().pxX(4, this.W.x + i3);
        this.A.E().pxX(0, this.X.x + i3);
        this.A.E().pxY(0, this.X.y - i4);
        this.A.E().pxY(1, this.T.y - i4);
        this.A.E().pxY(2, this.Y.y - i4);
        this.A.E().pxY(3, this.Z.y - i4);
        this.A.E().pxY(4, this.W.y - i4);
        this.A.E().pxY(5, this.S.y - i4);
        this.A.E().pxY(6, this.aa.y - i4);
        this.A.E().pxY(7, this.ab.y - i4);
        this.A.E().pxX(2, this.Y.x - i3);
        this.A.E().pxX(6, this.aa.x - i3);
        this.A.E().pxX(10, this.ac.x - i3);
        this.A.E().pxX(14, this.ae.x - i3);
        this.A.E().pxX(3, this.Z.x - i3);
        this.A.E().pxX(7, this.ab.x - i3);
        this.A.E().pxX(11, this.ad.x - i3);
        this.A.E().pxX(15, this.af.x - i3);
        this.A.E().pxY(8, this.V.y + i4);
        this.A.E().pxY(9, this.R.y + i4);
        this.A.E().pxY(10, this.ac.y + i4);
        this.A.E().pxY(11, this.ad.y + i4);
        this.A.E().pxY(12, this.U.y + i4);
        this.A.E().pxY(13, this.Q.y + i4);
        this.A.E().pxY(14, this.ae.y + i4);
        this.A.E().pxY(15, i4 + this.af.y);
    }

    public final void k() {
        if (!this.P && !this.O) {
            aq.b(this);
            bd.b(this);
            this.J.b();
            this.P = true;
            float f = this.a.L().x;
            float f2 = this.a.L().y;
            Iterator it = this.I.j().iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                rVar.L().x += f;
                rVar.L().y += f2;
                rVar.e(true);
                rVar.Q();
                this.ao.g(rVar);
                ((com.tsf.shell.workspace3D.k.j) rVar).bs();
            }
            this.K.clear();
            h hVar = new h(this);
            hVar.a(0);
            s.a(this.A);
            s.a(this.A, 300, hVar);
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void l() {
        if (!this.O) {
            int aB = this.D.aB();
            for (int i = 0; i < aB; i++) {
                r d = this.D.d(i);
                Number3d number3d = (Number3d) this.K.get(i);
                d.L().x = (float) (r4.x + ((number3d.x - d.L().x) * 0.2d));
                d.L().y = (float) (r4.y + ((number3d.y - d.L().y) * 0.2d));
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.H.a(motionEvent, motionEvent2);
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(MotionEvent motionEvent) {
        this.H.e(motionEvent);
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void m() {
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void n() {
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void o() {
        this.O = true;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void p() {
        this.O = false;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void g(float f) {
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final boolean e(int i) {
        return false;
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void q() {
    }

    @Override // com.tsf.shell.workspace3D.g.b.i
    public final void a(com.tsf.shell.workspace3D.k.j jVar, Number3d number3d) {
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        if (!this.P) {
            j();
            aG();
            this.an = false;
            this.M = 0.0f;
            this.N = 0.0f;
        }
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }
}
