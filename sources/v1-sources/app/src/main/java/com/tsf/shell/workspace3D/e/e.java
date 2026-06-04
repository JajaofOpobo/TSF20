package com.tsf.shell.workspace3D.e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends cd {
    float A;
    float B;
    float C;
    private e G;
    private ArrayList K;
    private ArrayList L;
    private com.censivn.C3DEngine.b.r N;
    private com.tsf.shell.workspace3D.k.o O;
    private float P;
    private p Q;
    private com.tsf.shell.workspace3D.k.j T;
    private com.tsf.shell.workspace3D.k.j U;
    private TextureElement V;
    private float Y;
    private float Z;
    private Runnable aa;
    private com.tsf.shell.workspace3D.k.c.b.ac ag;
    private Runnable ai;
    private float H = 0.0f;
    private float I = 0.0f;
    private float J = 0.0f;
    private boolean M = true;
    boolean a = false;
    private boolean W = false;
    private boolean X = false;
    boolean D = false;
    boolean E = false;
    private Number3d ab = new Number3d();
    private Number3d ac = new Number3d();
    private float[] ad = new float[2];
    private int ae = 0;
    private boolean af = false;
    private boolean ah = false;
    private boolean aj = true;
    private com.censivn.C3DEngine.e.b R = com.tsf.shell.workspace3D.k.b.ap.b();
    private TextureElement S = new TextureElement(0, false);

    public e(p pVar) {
        this.R.z().b(this.S);
        this.Q = pVar;
        this.G = this;
        this.O = new f(this, this);
        com.tsf.shell.workspace3D.k.o.a(this.O, 0);
        this.P = 12.0f * com.censivn.C3DEngine.a.b;
        this.N = new com.censivn.C3DEngine.e.b(128.0f, 128.0f);
        this.N.a((Boolean) false);
        this.K = new ArrayList();
        this.L = new ArrayList();
        com.tsf.shell.workspace3D.bf.o().b(this);
        this.ai = new m(this);
    }

    public final boolean a(float f, float f2) {
        if (aT() >= 1.0f && !this.Q.v()) {
            return false;
        }
        if (!this.a) {
            this.Y = f;
            this.Z = f2;
            this.W = false;
            this.X = false;
            this.a = true;
            this.Q.u();
            this.A = this.J;
            this.B = this.I;
            this.C = this.H;
            p.p.a(aT());
        }
        return true;
    }

    public final void c(float f, float f2) {
        if (this.X) {
            com.tsf.shell.workspace3D.bf.j().a(f, f2, this.Y, this.Z);
            return;
        }
        if (this.W) {
            com.censivn.C3DEngine.h.a.a(f, f2, this.ad);
            this.ac.setAll(this.ad[0], this.ad[1], 0.0f);
            d(this.ac);
            if (p.p.b(this.ac.x, this.ac.y) == -4) {
                this.W = false;
                com.tsf.shell.workspace3D.bf.j().r();
                this.X = true;
                return;
            }
            return;
        }
        if (this.a) {
            com.censivn.C3DEngine.h.a.a(f, f2, this.ad);
            this.ac.setAll(this.ad[0], this.ad[1], 0.0f);
            d(this.ac);
            if (this.aa == null) {
                this.aa = new g(this);
            }
            com.censivn.C3DEngine.a.a().c(this.aa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.workspace3D.k.j jVar) {
        if (jVar != null) {
            this.T = jVar;
            if (jVar instanceof com.tsf.shell.workspace3D.k.ab) {
                if (((com.tsf.shell.workspace3D.k.ab) jVar).bJ() != null) {
                    this.U = jVar;
                    this.V = ((com.tsf.shell.workspace3D.k.ab) jVar).bJ();
                    return;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("setCurrentLable error widget", jVar.toString());
                    hashMap.put("setCurrentLable error info", jVar.be().toString());
                    com.flurry.android.t.a("EVENT_ISSUSE_DOCK_CONTAINER", hashMap);
                }
            }
        } else {
            this.T = null;
        }
        this.U = null;
        this.V = null;
    }

    public final void n() {
        if (this.X) {
            com.tsf.shell.workspace3D.bf.j().s();
            return;
        }
        if (!this.W && this.a) {
            this.a = false;
            if (this.O.d()) {
                if (this.T instanceof com.tsf.shell.workspace3D.k.z) {
                    ((com.tsf.shell.workspace3D.k.z) this.T).bB();
                }
            } else {
                com.tsf.shell.workspace3D.k.j jVar = this.T;
                if (jVar != null) {
                    if (jVar instanceof com.tsf.shell.workspace3D.k.ab) {
                        h hVar = new h(this, jVar);
                        com.censivn.C3DEngine.a.a();
                        com.censivn.C3DEngine.b.w.a(hVar, 200L);
                    } else if (jVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
                        com.censivn.C3DEngine.a.a().c(new i(this, jVar));
                    }
                }
                this.U = null;
                this.V = null;
            }
            this.T = null;
            a((com.tsf.shell.workspace3D.k.j) null);
            if (this.Q.u()) {
                aH();
            } else {
                Iterator it = this.K.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    oVar.i = 0.0f;
                    oVar.d = 0.0f;
                    oVar.h = false;
                }
                this.M = false;
                a_(true);
                e(false);
                com.censivn.C3DEngine.a.d().g();
            }
            this.Q.o();
        }
    }

    public final void o() {
        aU();
        aI();
    }

    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.c.o
    public final void a(com.tsf.shell.workspace3D.k.z zVar) {
        j jVar = new j(this, zVar);
        if (zVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            com.tsf.shell.workspace3D.k.b.ap.a(zVar, 1, null, jVar);
        } else {
            com.tsf.shell.workspace3D.k.b.ap.a(zVar, 1, jVar);
        }
    }

    public final void p() {
        int size;
        aV();
        if (aD().size() < 6) {
            size = 150;
        } else {
            size = ThemeShellDescription.PICKER_MENU / aD().size();
        }
        for (int i = 0; i < aD().size(); i++) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) aD().get(i);
            float f = (i * 20) + 10;
            if (f > 150.0f) {
                f = 150.0f;
            }
            rVar.e(false);
            k kVar = new k(this, rVar, (i / 3) + 1, f, rVar);
            kVar.j(0.0f);
            kVar.k(0.0f);
            kVar.f(0.0f);
            kVar.h(0.0f);
            kVar.b(i % 2 == 0);
            com.censivn.C3DEngine.g.s.a(rVar);
            com.censivn.C3DEngine.g.s.a(rVar, (size * i) + 250, kVar);
        }
    }

    public final void q() {
        int size;
        aV();
        aI();
        if (aD().size() < 6) {
            size = 150;
        } else {
            size = ThemeShellDescription.PICKER_MENU / aD().size();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < aD().size()) {
                o oVar = (o) this.K.get(i2);
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) aD().get(i2);
                if (!rVar.A()) {
                    rVar.M().z = oVar.c;
                    rVar.L().x = 0.0f;
                    rVar.L().y = 0.0f;
                    rVar.N().setAll(0.0f, 0.0f, 1.0f);
                }
                rVar.a((Boolean) true);
                rVar.e(false);
                l lVar = new l(this, rVar, (i2 / 3) + 1, (float) (20.0d + (Math.random() * 120.0d)), rVar);
                lVar.j(oVar.d);
                lVar.k(oVar.d);
                lVar.f(oVar.a);
                lVar.h(oVar.b);
                lVar.e(oVar.c);
                lVar.a(255);
                lVar.b(i2 % 2 == 0);
                lVar.a(false);
                com.censivn.C3DEngine.g.s.a(rVar);
                com.censivn.C3DEngine.g.s.a(rVar, (size * i2) + 250, lVar);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    private o aS() {
        if (this.L.isEmpty()) {
            return new o(this);
        }
        o oVar = (o) this.L.remove(0);
        oVar.a = 0.0f;
        oVar.b = 0.0f;
        oVar.d = 1.0f;
        oVar.i = 255.0f;
        oVar.h = false;
        return oVar;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!this.D) {
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int abs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
            if ((abs * abs) + (abs2 * abs2) > com.censivn.C3DEngine.b.b.b) {
                if (abs > abs2) {
                    this.E = true;
                } else {
                    this.E = false;
                }
                this.D = true;
            }
        }
        if (this.D) {
            return p.p.a(this.E);
        }
        return true;
    }

    public final void aG() {
        this.D = false;
    }

    public final void aH() {
        aI();
        this.M = false;
        a_(true);
        e(false);
        com.censivn.C3DEngine.a.d().g();
    }

    public final void aI() {
        p.p.a(this.K, aD(), aD().size(), this.J, this.H, this.I, this.P);
    }

    public final float g(float f) {
        return p.p.a(aD(), aD().size(), f, this.H, this.I, this.P);
    }

    private float aT() {
        return p.p.a(aD(), aD().size(), this.J, this.H, this.I, this.P);
    }

    public final void h(float f) {
        k(f);
    }

    public final void aJ() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((o) it.next()).h = true;
        }
        Iterator it2 = aD().iterator();
        while (it2.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it2.next();
            rVar.L().x = 0.0f;
            rVar.L().y = 0.0f;
            rVar.M().z = 0.0f;
            rVar.N().setAll(0.0f, 0.0f, 1.0f);
        }
        this.M = true;
        a_(false);
    }

    public final void i(float f) {
        if (this.J != f) {
            this.J = f;
            aU();
            aH();
        }
    }

    public final void j(float f) {
        this.J = f;
        aU();
        aH();
    }

    public final void k(float f) {
        if (this.J != f) {
            this.J = f;
            aU();
            aI();
        }
    }

    public final float aK() {
        return this.J;
    }

    private void aU() {
        p.p.a(this, this.H, this.I, this.J);
    }

    private void aV() {
        for (int i = 0; i < aD().size(); i++) {
            ((o) this.K.get(i)).h = true;
        }
        this.M = true;
        e(true);
        a_(false);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (this.U != null) {
            p.p.a(this.R, this.U);
            this.S.id = this.V.id;
            this.R.f();
        }
        if (!this.M) {
            this.M = true;
            for (int i = 0; i < aD().size(); i++) {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) aD().get(i);
                o oVar = (o) this.K.get(i);
                if (!oVar.h) {
                    float f = oVar.a;
                    float f2 = oVar.b;
                    rVar.L().x += (f - rVar.L().x) * 0.15f;
                    rVar.L().y += (f2 - rVar.L().y) * 0.15f;
                    rVar.M().z += (oVar.c - rVar.M().z) * 0.15f;
                    Number3d N = rVar.N();
                    Number3d N2 = rVar.N();
                    float f3 = N2.y + ((oVar.d - rVar.N().x) * 0.15f);
                    N2.y = f3;
                    N.x = f3;
                    float I = rVar.I();
                    rVar.b(I + ((oVar.i - I) * 0.15f));
                    if (Math.abs(rVar.I() - oVar.i) < 0.2f && Math.abs(rVar.L().x - f) < 0.2f && Math.abs(rVar.L().y - f2) < 0.2f && Math.abs(rVar.N().x - oVar.d) < 0.01f && Math.abs(rVar.M().z - oVar.c) < 0.2f) {
                        rVar.L().x = f;
                        rVar.L().y = f2;
                        rVar.M().z = oVar.c;
                        Number3d N3 = rVar.N();
                        Number3d N4 = rVar.N();
                        float f4 = oVar.d;
                        N4.y = f4;
                        N3.x = f4;
                        oVar.h = true;
                        rVar.b(oVar.i);
                    }
                    if (rVar.I() == 0.0f) {
                        rVar.a((Boolean) false);
                    } else {
                        rVar.a((Boolean) true);
                    }
                }
                this.M = oVar.h && this.M;
            }
            if (this.M) {
                e(true);
                a_(false);
            }
        }
    }

    public final o g(com.censivn.C3DEngine.b.r rVar) {
        int indexOf = aD().indexOf(rVar);
        if (indexOf == -1) {
            return null;
        }
        return (o) this.K.get(indexOf);
    }

    public final com.censivn.C3DEngine.e.b h(com.censivn.C3DEngine.b.r rVar) {
        if (!aD().contains(rVar)) {
            return null;
        }
        com.censivn.C3DEngine.e.b a = bx.a(rVar);
        aD().set(aD().indexOf(rVar), a);
        a.a((com.censivn.C3DEngine.d.b) this);
        rVar.a((com.censivn.C3DEngine.d.b) null);
        return a;
    }

    public final void a(com.censivn.C3DEngine.e.b bVar, com.censivn.C3DEngine.b.r rVar) {
        rVar.Q();
        if (aD().contains(bVar)) {
            aD().set(aD().indexOf(bVar), rVar);
            rVar.L().setAllFrom(bVar.L());
            rVar.a((com.censivn.C3DEngine.d.b) this);
            bVar.a((com.censivn.C3DEngine.d.b) null);
            bx.a(bVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final void d(com.censivn.C3DEngine.b.r rVar) {
        this.K.add(aS());
        super.d(rVar);
        aH();
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void a(com.censivn.C3DEngine.b.r rVar, int i) {
        this.K.add(aS());
        super.a(rVar, i);
        aH();
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final boolean e(com.censivn.C3DEngine.b.r rVar) {
        boolean e = super.e(rVar);
        if (e) {
            this.L.add((o) this.K.remove(0));
            aH();
            aL();
            if (rVar instanceof com.tsf.shell.workspace3D.k.j) {
                ((com.tsf.shell.workspace3D.k.j) rVar).L = false;
                ((com.tsf.shell.workspace3D.k.j) rVar).aW();
            }
            if (rVar instanceof com.tsf.shell.workspace3D.k.ab) {
                ((com.tsf.shell.workspace3D.k.ab) rVar).bM();
            } else if (rVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
                ((com.tsf.shell.workspace3D.k.c.b.ac) rVar).aH().n();
                com.tsf.shell.workspace3D.bf.o().c((com.tsf.shell.workspace3D.k.c.b.ac) rVar);
            }
        }
        return e;
    }

    public final void d(float f, float f2) {
        this.H = f;
        this.I = f2;
        aH();
    }

    private int a(com.censivn.C3DEngine.b.r rVar, Number3d number3d) {
        Number3d.TEMPNUMBER3D.reset();
        rVar.c(Number3d.TEMPNUMBER3D);
        return a(Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y, number3d);
    }

    private int a(float f, float f2, Number3d number3d) {
        number3d.setAll(f, f2, 0.0f);
        d(number3d);
        if (aD().size() == 0) {
            return 0;
        }
        int a = p.p.a(number3d, this.K, aD().size());
        if (a >= aD().size()) {
            return aD().size() - 1;
        }
        return a;
    }

    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final boolean a(com.tsf.shell.workspace3D.g.g gVar, float f, float f2) {
        if (!(gVar instanceof com.tsf.shell.workspace3D.k.ab) && !(gVar instanceof com.tsf.shell.workspace3D.k.c.b.ac)) {
            return true;
        }
        if (!this.af && aD().size() != 0) {
            int a = a(f, f2, this.ab);
            if (a == -1 || a == -2) {
                return false;
            }
            return d(a) instanceof com.tsf.shell.workspace3D.k.c.b.ac;
        }
        return false;
    }

    private void g(com.tsf.shell.workspace3D.g.g gVar) {
        this.ag.c(gVar);
        this.ag = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        this.af = true;
        com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) gVar;
        com.censivn.C3DEngine.b.r rVar = this.N;
        float f = jVar.k[0];
        float f2 = jVar.m[1];
        float f3 = jVar.k[2];
        float f4 = jVar.l[0];
        float f5 = jVar.k[1];
        float[] fArr = jVar.k;
        rVar.b(f, f2, f3, f4, f5);
        this.ae = a((com.censivn.C3DEngine.b.r) gVar, this.ab);
        if (this.ae == -1) {
            this.ae = 0;
        } else if (this.ae == -2) {
            this.ae = aD().size() - 1;
        }
        a(this.N, this.ae);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final void a(com.tsf.shell.workspace3D.g.g gVar) {
        int size;
        int a = a((com.censivn.C3DEngine.b.r) gVar, this.ab);
        if (a == -1) {
            size = 0;
        } else {
            size = a == -2 ? aD().size() - 1 : a;
        }
        Number3d number3d = this.ab;
        if (a >= 0) {
            com.censivn.C3DEngine.b.r d = d(a);
            if (d instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
                r1 = p.p.a(number3d, d, this.ae < a);
            }
        }
        if (r1) {
            com.tsf.shell.workspace3D.k.c.b.ac acVar = (com.tsf.shell.workspace3D.k.c.b.ac) d(size);
            if (this.ag == null) {
                this.ag = acVar;
                this.ag.b(gVar);
            }
            this.ag.e(gVar);
            return;
        }
        if (this.ag != null) {
            g(gVar);
        }
        if (this.ae != size) {
            this.ae = size;
            super.e(this.N);
            super.a(this.N, size);
            aH();
        }
    }

    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        this.af = false;
        if (this.ag != null) {
            g(gVar);
        }
        e(this.N);
    }

    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        boolean z;
        this.af = false;
        com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) gVar;
        if (this.ag != null) {
            z = this.ag.d(gVar);
            this.ag = null;
            if (z) {
                e(this.N);
            }
        } else {
            z = false;
        }
        if (!z) {
            com.censivn.C3DEngine.g.s.a(jVar);
            d(jVar.L());
            jVar.Q();
            jVar.K();
            super.e(this.N);
            if (this.ae < 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("onBeHittingRelease error ", new StringBuilder().append(this.ae).toString());
                com.flurry.android.t.a("DockItemContainer", hashMap);
                this.ae = 0;
            } else if (this.ae > aD().size()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("onBeHittingRelease error ", new StringBuilder().append(this.ae).toString());
                com.flurry.android.t.a("DockItemContainer", hashMap2);
                this.ae = aD().size();
                if (this.ae < 0) {
                    this.ae = 0;
                }
            }
            super.a(jVar, this.ae);
            a(jVar, true);
            if (jVar instanceof com.tsf.shell.workspace3D.k.z) {
                com.tsf.shell.workspace3D.k.z zVar = (com.tsf.shell.workspace3D.k.z) jVar;
                if (zVar.bz()) {
                    Iterator it = zVar.bH().iterator();
                    while (it.hasNext()) {
                        a((com.tsf.shell.workspace3D.k.j) it.next(), true);
                    }
                    zVar.bF();
                }
            }
            aL();
        }
        return true;
    }

    public final void a(com.tsf.shell.workspace3D.k.j jVar, boolean z) {
        jVar.a(this.O);
        jVar.L = true;
        if (jVar instanceof com.tsf.shell.workspace3D.k.ab) {
            ((com.tsf.shell.workspace3D.k.ab) jVar).bL();
        } else if (jVar instanceof com.tsf.shell.workspace3D.k.c.b.ac) {
            ((com.tsf.shell.workspace3D.k.c.b.ac) jVar).aH().m();
            com.tsf.shell.workspace3D.bf.o().a(jVar);
        }
        if (z) {
            jVar.be().container = -4;
            jVar.bs();
        }
    }

    public final void aL() {
        if (!this.ah) {
            this.ah = true;
            com.censivn.C3DEngine.a.a().c(this.ai);
        }
    }

    @Override // com.tsf.shell.workspace3D.e.cd, com.tsf.shell.workspace3D.g.g
    public final boolean l() {
        return this.aj;
    }

    @Override // com.tsf.shell.workspace3D.e.cd
    public final void h(boolean z) {
        this.aj = z;
    }
}
