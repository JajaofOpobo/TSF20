package com.tsf.shell.workspace3D.g.d;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeOptionMenuDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends com.censivn.C3DEngine.b.v {
    public float A;
    public float B;
    public int C;
    public int D;
    public com.censivn.C3DEngine.b.v E;
    private TextureElement F;
    private a G;
    private com.censivn.C3DEngine.e.b H;
    private o I;
    private o J;
    private float K;
    private float L;
    private float M;
    private float O;
    private float P;
    private com.censivn.C3DEngine.e.c Q;
    private q R;
    private ArrayList S;
    private int T;
    private int U;
    private float V;
    private int W;
    private d X;
    private d Y;
    private w Z;
    public com.censivn.C3DEngine.b.l a;
    private int aa;
    private TextureElement ac;
    private float N = 20.0f;
    private boolean ab = false;
    private boolean ad = false;
    private boolean ae = false;

    public final void a(d dVar) {
        this.X = dVar;
    }

    public final void b(d dVar) {
        this.Y = dVar;
    }

    public final o i() {
        return (o) this.E.d(2);
    }

    public d(w wVar, i iVar) {
        this.Z = wVar;
        this.O = iVar.b;
        this.M = iVar.a;
        this.P = iVar.g;
        this.Q = iVar.h;
        this.T = iVar.c;
        this.U = iVar.d;
        this.V = iVar.l;
        this.A = iVar.f;
        this.B = iVar.e;
        this.C = iVar.j;
        this.D = iVar.k;
        this.aa = iVar.m;
        this.W = iVar.i;
        this.G = new a(this.T, this.M);
        this.G.a_(true);
        this.G.b(0.0f);
        this.a = new e(this, this.Q);
        if (this.U != 0) {
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(this.U);
            this.H = new f(this, bitmap.getWidth() * com.censivn.C3DEngine.a.b, bitmap.getHeight() * com.censivn.C3DEngine.a.b);
            bitmap.recycle();
            this.H.a_(true);
            this.H.c(0.0f, this.M, 0.0f);
        }
        this.S = new ArrayList();
        d(this.G);
        if (this.H != null) {
            d(this.H);
        }
        this.E = new com.censivn.C3DEngine.b.v();
        d(this.E);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (this.J != null && this.J != null && this.J != this.I) {
            if (this.I != null) {
                this.I.h(false);
            }
            this.I = this.J;
            this.I.h(true);
            if (this.I.m() == null) {
                this.Z.d().a((TextureElement) null, this.aa);
            } else {
                this.Z.d().a(this.I.m().d, this.aa);
            }
            a(this.I.m());
            return;
        }
        if (this.J == null && this.I != null) {
            this.I.h(false);
            this.Z.d().a((TextureElement) null, this.aa);
            this.I = null;
            if (this.X != null) {
                this.X.a((Runnable) null, false);
            }
        }
    }

    public final void j() {
        this.J = null;
        this.L = 0.0f;
    }

    public void a(r rVar) {
    }

    public void b(r rVar) {
    }

    public final void k() {
        if (this.I != null && this.R != null) {
            b((r) this.R.a.get(this.I.aH()));
        }
    }

    static /* synthetic */ void a(d dVar, MotionEvent motionEvent) {
        switch (dVar.a(motionEvent)) {
            case 1:
                com.censivn.C3DEngine.b.m.d().a(dVar.X.a, true);
                if (dVar.X.ab) {
                    dVar.X.m();
                }
                dVar.X.a(motionEvent);
                break;
            case 2:
                dVar.j();
                com.censivn.C3DEngine.b.m.d().a(dVar.Y.a, true);
                dVar.Y.a(motionEvent);
                break;
        }
    }

    public final boolean l() {
        return this.ab;
    }

    static /* synthetic */ void d(d dVar) {
        if (dVar.ab) {
            return;
        }
        dVar.ab = true;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dVar.R.a.size()) {
                return;
            }
            o oVar = ((r) dVar.R.a.get(i2)).a;
            if (oVar != null && (oVar instanceof k)) {
                k kVar = (k) oVar;
                if (kVar.m() == null || !kVar.m().k) {
                    dVar.a(kVar);
                } else {
                    kVar.i();
                }
            }
            i = i2 + 1;
        }
    }

    public final void a(k kVar) {
        if (this.ab) {
            if (this.ac == null) {
                Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(ThemeOptionMenuDescription.OPTION_MENU_FAVORITE_RETURN);
                this.ac = com.censivn.C3DEngine.a.f().a(bitmap, false);
                bitmap.recycle();
            }
            kVar.a(this.ac);
        }
    }

    public final void m() {
        int i = 0;
        if (this.ab) {
            this.ab = false;
            while (true) {
                int i2 = i;
                if (i2 >= this.R.a.size()) {
                    break;
                }
                o oVar = ((r) this.R.a.get(i2)).a;
                if (oVar != null && (oVar instanceof k)) {
                    k kVar = (k) oVar;
                    if (kVar.m() != null && kVar.m().k) {
                        kVar.j();
                    } else {
                        kVar.a(kVar.m().c);
                    }
                }
                i = i2 + 1;
            }
            if (this.ac != null) {
                com.censivn.C3DEngine.a.f().a(this.ac);
                this.ac = null;
            }
        }
    }

    public final void b(k kVar) {
        kVar.k();
        kVar.aG();
        kVar.Q();
        this.Z.a(kVar.m());
        a((o) kVar);
    }

    private o aG() {
        if (this.S.isEmpty()) {
            if (this.W == 1) {
                return new ap(this.A, this.B, this.M + this.P, this.D, this.C, this.a);
            }
            return new k(this, this.A, this.B, this.P + this.M, this.D, this.C, this.a);
        }
        return (o) this.S.remove(0);
    }

    public final void a(o oVar) {
        oVar.a((r) null);
        this.S.add(oVar);
    }

    static /* synthetic */ int b(d dVar, MotionEvent motionEvent) {
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        float b = com.censivn.C3DEngine.h.a.b(a[0], a[1], dVar.L().x, dVar.L().y);
        if (b <= dVar.M + (com.censivn.C3DEngine.a.b * 50.0f) || dVar.X == null) {
            return (b >= dVar.M - (com.censivn.C3DEngine.a.b * 50.0f) || dVar.Y == null) ? 0 : 2;
        }
        return 1;
    }

    public final int a(MotionEvent motionEvent) {
        float f;
        if (!this.ae) {
            return 0;
        }
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        float b = com.censivn.C3DEngine.h.a.b(a[0], a[1], L().x, L().y);
        if (b > this.M + (com.censivn.C3DEngine.a.b * 50.0f) && this.X != null && this.X.ae) {
            return 1;
        }
        if (b < this.M - (com.censivn.C3DEngine.a.b * 50.0f) && this.Y != null && this.Y.ae) {
            return 2;
        }
        float d = (com.censivn.C3DEngine.h.a.d(a[0], a[1], L().x, L().y) + 90.0f) - M().z;
        float f2 = 2.1474836E9f;
        int i = 0;
        o oVar = null;
        while (i < this.R.a.size()) {
            o oVar2 = ((r) this.R.a.get(i)).a;
            if (oVar2 != null) {
                float abs = Math.abs(d - oVar2.o());
                if (abs < f2) {
                    f = abs;
                    i++;
                    f2 = f;
                    oVar = oVar2;
                }
            }
            oVar2 = oVar;
            f = f2;
            i++;
            f2 = f;
            oVar = oVar2;
        }
        if (f2 > this.O || a[1] < L().y - (100.0f * com.censivn.C3DEngine.a.b) || b < this.M - (70.0f * com.censivn.C3DEngine.a.b)) {
            this.L = 0.0f;
            oVar = null;
        } else {
            this.K = oVar.o();
            this.L = 255.0f;
        }
        this.J = oVar;
        return 0;
    }

    public final void n() {
        if (!this.ad) {
            this.G.j();
            if (this.H != null) {
                this.F = com.censivn.C3DEngine.a.f().a(ThemeManager.getInstance().getCurrentThemeDescription().optionMenu.getBitmap(this.U), false);
                this.H.z().c(this.F);
            }
            this.ad = true;
        }
    }

    public final void o() {
        if (this.ad) {
            this.G.k();
            if (this.F != null) {
                com.censivn.C3DEngine.a.f().a(this.F);
                this.F = null;
                this.H.z().d();
            }
            this.ad = false;
        }
    }

    public final boolean p() {
        return this.ae;
    }

    public final void a(q qVar, com.censivn.C3DEngine.b.r rVar) {
        a(qVar, rVar.L().x, rVar.L().y, rVar.M().z, false);
    }

    public final void a(q qVar, float f, float f2) {
        a(qVar, f, f2, 0.0f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        this.G.g(((5 - this.R.a.size()) * (this.O / 2.0f)) + this.V);
        this.N = ((this.R.a.size() * this.O) / 2.0f) - (this.O / 2.0f);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.R.a.size()) {
                float f = this.N - (i2 * this.O);
                r rVar = (r) this.R.a.get(i2);
                o oVar = rVar.a;
                if (oVar == 0) {
                    oVar = aG();
                    oVar.a(rVar.c);
                    oVar.a(rVar);
                    rVar.a = oVar;
                    oVar.a(i2);
                    oVar.n();
                    oVar.a(i2, f);
                    this.E.d((com.censivn.C3DEngine.b.r) oVar);
                } else if (oVar instanceof k) {
                    ((k) oVar).a(i2);
                    k kVar = (k) oVar;
                    com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                    uVar.e(f);
                    com.censivn.C3DEngine.g.s.a(kVar);
                    com.censivn.C3DEngine.g.s.a(kVar, 300, uVar);
                }
                oVar.aI();
                oVar.g(f);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(q qVar, float f, float f2, float f3, boolean z) {
        boolean z2;
        if (qVar != this.R) {
            if (!this.ae || qVar == this.R) {
                z2 = false;
            } else {
                z2 = true;
                this.G.g(((5 - qVar.a.size()) * (this.O / 2.0f)) + this.V);
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.R.a.size()) {
                        break;
                    }
                    o oVar = ((r) this.R.a.get(i2)).a;
                    if (oVar instanceof k) {
                        ((k) oVar).q();
                    }
                    i = i2 + 1;
                }
                this.R = qVar;
            }
            this.R = qVar;
            this.ae = true;
            if (z) {
                if ((220.0f * com.censivn.C3DEngine.a.b) + f2 > com.censivn.C3DEngine.a.g) {
                    f2 = com.censivn.C3DEngine.a.g - (220.0f * com.censivn.C3DEngine.a.b);
                }
                L().x = f;
                L().y = f2 - this.M;
                float f4 = this.N + 10.0f;
                float sin = (float) (Math.sin(0.017453292519943295d * f4) * this.M);
                if (f + sin > com.censivn.C3DEngine.a.f) {
                    M().z = f4 - ((float) ((Math.asin((com.censivn.C3DEngine.a.f - f) / this.M) / 3.141592653589793d) * 180.0d));
                } else if (f - sin < com.censivn.C3DEngine.a.e) {
                    M().z = -(f4 - ((float) ((Math.asin((f - com.censivn.C3DEngine.a.e) / this.M) / 3.141592653589793d) * 180.0d)));
                } else {
                    M().z = 0.0f;
                }
                float cos = (float) (Math.cos((f4 + Math.abs(M().z)) * 0.017453292519943295d) * this.M);
                if (L().y + cos < com.censivn.C3DEngine.a.h) {
                    float f5 = com.censivn.C3DEngine.a.h - (cos + L().y);
                    PositionNumber3d L = L();
                    L.y = f5 + L.y;
                }
            } else {
                L().x = f;
                L().y = f2;
                M().z = f3;
            }
            this.N = ((this.R.a.size() * this.O) / 2.0f) - (this.O / 2.0f);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= this.R.a.size()) {
                    break;
                }
                float f6 = this.N - (i4 * this.O);
                o aG = aG();
                r rVar = (r) this.R.a.get(i4);
                aG.a(i4);
                aG.a(rVar);
                rVar.a = aG;
                aG.a(rVar.c);
                aG.aI();
                aG.g(f6);
                aG.a(i4, f6);
                this.E.d((com.censivn.C3DEngine.b.r) aG);
                i3 = i4 + 1;
            }
            this.L = 0.0f;
            if (!z2) {
                if (this.H != null) {
                    this.H.b(0.0f);
                }
                if (this.W == 1) {
                    this.G.h(((5 - this.R.a.size()) * (this.O / 2.0f)) + this.V);
                    this.G.M().z = 90.0f;
                    com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                    uVar.a(255);
                    uVar.e(0.0f);
                    uVar.a(com.censivn.C3DEngine.g.a.a);
                    com.censivn.C3DEngine.g.s.a(this.G);
                    com.censivn.C3DEngine.g.s.a(this.G, 350, uVar);
                } else {
                    this.G.g(((5 - this.R.a.size()) * (this.O / 2.0f)) + this.V);
                    com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
                    uVar2.h(0.0f);
                    uVar2.a(255);
                    uVar2.a(com.censivn.C3DEngine.g.a.a);
                    com.censivn.C3DEngine.g.s.a(this.G);
                    com.censivn.C3DEngine.g.s.a(this.G, 350, uVar2);
                }
                this.Z.a(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Runnable runnable, boolean z) {
        if (this.ae) {
            this.ae = false;
            m();
            for (int i = 0; i < this.R.a.size(); i++) {
                o oVar = ((r) this.R.a.get(i)).a;
                if ((oVar instanceof k) && !z) {
                    ((k) oVar).q();
                } else {
                    g gVar = new g(this, oVar);
                    gVar.a(0);
                    com.censivn.C3DEngine.g.s.a((com.censivn.C3DEngine.b.r) oVar, 250, gVar);
                }
            }
            if (this.H != null) {
                this.L = 0.0f;
                com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                uVar.a(0);
                com.censivn.C3DEngine.g.s.a(this.H, 250, uVar);
            }
            h hVar = new h(this, runnable);
            hVar.a(0);
            if (this.W == 2 && !z) {
                hVar.h((-100.0f) * com.censivn.C3DEngine.a.b);
            }
            com.censivn.C3DEngine.g.s.a(this.G);
            com.censivn.C3DEngine.g.s.a(this.G, 250, hVar);
            this.R = null;
        }
    }
}
