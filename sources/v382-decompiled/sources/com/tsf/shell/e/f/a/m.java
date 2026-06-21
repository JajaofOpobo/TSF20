package com.tsf.shell.e.f.a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.f.p;
import com.tsf.shell.e.f.r;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class m extends com.tsf.shell.e.f.g implements com.censivn.C3DEngine.b.c.d, b, com.tsf.shell.manager.a.e, com.tsf.shell.manager.a.g {
    public static int A;
    public static int B;
    public static int C;
    public static ArrayList E;
    public static float F;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static float w;
    public static int x;
    public static int y;
    public static int z;
    public com.tsf.shell.e.i.b.e.j G;
    public com.censivn.C3DEngine.b.f.m H;
    protected com.tsf.shell.manager.n.b I;
    private com.censivn.C3DEngine.b.f.l K;
    private com.censivn.C3DEngine.b.f.l L;
    private a M;
    private a N;
    private com.tsf.shell.e.f.a.a.f O;
    private int P;
    private com.tsf.shell.e.e.l T;
    private com.tsf.shell.e.f.a.d.a U;
    private e V;
    private ArrayList W;
    private com.tsf.shell.e.f.a.b.m X;
    private com.censivn.C3DEngine.b.f.l Y;
    private x Z;
    private x aa;
    private com.censivn.C3DEngine.b.g.b.b ab;
    private com.censivn.C3DEngine.b.d.a ad;
    private com.censivn.C3DEngine.b.d.a ae;
    private Runnable af;
    private float ag;
    private j ai;
    private k aj;
    private h ak;
    private c al;
    private com.tsf.shell.manager.n.b ao;
    private com.censivn.C3DEngine.b.f.m aq;
    private TextureElement ar;
    private FrameLayout au;
    public static int l = 0;
    public static float v = 0.9f;
    public static int D = 350;
    private static String J = "ApplicationPageBlackground";
    private boolean Q = false;
    private boolean R = true;
    private boolean S = true;
    private float ac = -1.0f;
    private float ah = 0.0f;
    private boolean am = false;
    private boolean an = false;
    private boolean ap = false;
    private ArrayList as = new ArrayList();
    private Object at = new Object();
    private boolean av = false;

    public com.censivn.C3DEngine.b.f.j a(com.tsf.shell.e.i.c cVar) {
        com.censivn.C3DEngine.b.f.j jVar;
        if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) cVar;
            if (this.G == null) {
                this.G = new com.tsf.shell.e.i.b.e.j();
            }
            this.G.k.textures().clear();
            if (bVar.aC() && !bVar.t()) {
                this.G.k.textures().addElement(bVar.k.textures().get(0).textureElement);
            }
            jVar = this.G;
        } else {
            TextureElement aD = ((com.tsf.shell.e.i.b.d.b) cVar).aD();
            if (this.H == null) {
                this.H = com.tsf.shell.e.i.b.d.b.l();
            }
            this.H.a(aD.width);
            this.H.b(aD.height);
            this.H.textures().addElement(aD);
            jVar = this.H;
        }
        Number3d.TEMPNUMBER3D.reset();
        cVar.localToGlobal(Number3d.TEMPNUMBER3D);
        jVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
        Number3d.TEMPNUMBER3D.x = 1.0f;
        Number3d.TEMPNUMBER3D.y = 1.0f;
        Number3d.TEMPNUMBER3D.z = 1.0f;
        cVar.localScaleToGlobale(Number3d.TEMPNUMBER3D);
        jVar.scale().setAllFrom(Number3d.TEMPNUMBER3D);
        return jVar;
    }

    public void e(com.censivn.C3DEngine.b.f.j jVar) {
        if (jVar instanceof com.tsf.shell.e.i.b.e.b) {
            ((com.tsf.shell.e.i.b.e.b) jVar).k.textures().clear();
        } else {
            ((com.censivn.C3DEngine.b.f.m) jVar).textures().clear();
        }
        jVar.removeFromParent();
    }

    public boolean aj() {
        if (this.an) {
            return false;
        }
        com.tsf.shell.manager.action.h.b();
        this.aj.b(true);
        this.ak.a(true);
        this.an = true;
        com.tsf.shell.manager.a.c.c(this);
        com.censivn.C3DEngine.b.c.c.a(this);
        aP();
        aR();
        this.ai.j();
        am().d();
        return true;
    }

    public boolean c(int i) {
        boolean aj = aj();
        this.ai.a(i);
        return aj;
    }

    public void ak() {
        if (this.an && this.ai.l()) {
            com.tsf.shell.manager.action.h.c();
            this.aj.c(true);
            this.ak.b(true);
            com.censivn.C3DEngine.b.c.c.b(this);
            this.an = false;
            com.tsf.shell.manager.a.c.b(this);
            aQ();
            aS();
            this.ai.k();
        }
    }

    public void a(com.tsf.shell.e.i.c cVar, boolean z2, float f, float f2) {
        if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
            com.tsf.shell.manager.a.p.a(cVar, f, f2, z2, 3);
        } else {
            com.tsf.shell.manager.a.p.a(cVar, f, f2, z2, 3, 5);
        }
    }

    private void aP() {
        x xVar = new x();
        xVar.l(v);
        xVar.m(v);
        xVar.h(w);
        w.a(this.K);
        w.a(this.K, 300, xVar);
    }

    private void aQ() {
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.m.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                m.this.N();
            }
        };
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.h(0.0f);
        w.a(this.K);
        w.a(this.K, 300, xVar);
    }

    private void aR() {
        this.ao = com.tsf.shell.manager.a.q.a(this.ao, com.tsf.shell.utils.x.c(R.string.text_app_drawer_setting));
    }

    private void aS() {
        com.tsf.shell.manager.a.q.b(this.ao);
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ak();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public m() {
        com.tsf.shell.manager.a.w.c().a(this);
        this.al = com.tsf.shell.manager.a.w.d();
        this.U = com.tsf.shell.manager.a.w.b();
        this.V = new e();
        com.tsf.shell.manager.a.w.a().a(this);
        this.O = new com.tsf.shell.e.f.a.a.f();
    }

    public void al() {
        this.O.f();
    }

    public e am() {
        return this.V;
    }

    public com.tsf.shell.e.f.a.d.a an() {
        return this.U;
    }

    public c ao() {
        return this.al;
    }

    public a ap() {
        return this.M;
    }

    public boolean aq() {
        return this.ap;
    }

    public void ar() {
        this.ap = true;
        h_();
        aT();
        aD();
        aX();
        if (this.M != null) {
            this.M.a();
        }
        N();
        this.ap = false;
    }

    @Override // com.tsf.shell.e.f.g, com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
        ar();
    }

    public void as() {
        if (this.ai != null) {
            this.ai.a();
        }
    }

    private void aT() {
        t = (int) (com.censivn.C3DEngine.b.b.a.c * 35.0f);
        u = (int) (com.censivn.C3DEngine.b.b.a.c * 35.0f);
        r = com.tsf.shell.manager.b.g.P() ? (int) (150.0f * com.censivn.C3DEngine.b.b.a.c) : (int) (com.censivn.C3DEngine.b.b.a.c * 35.0f);
        s = com.tsf.shell.manager.b.g.Q() ? com.censivn.C3DEngine.b.b.a.g + (com.censivn.C3DEngine.b.b.a.h * 1) : com.censivn.C3DEngine.b.b.a.h * 2;
        n = (int) (com.tsf.shell.manager.o.b.a.T + (10.0f * com.censivn.C3DEngine.b.b.a.c));
        o = (int) (com.tsf.shell.manager.o.b.a.U + (20.0f * com.censivn.C3DEngine.b.b.a.c));
        float f = (com.censivn.C3DEngine.b.b.a.E - F) - (com.censivn.C3DEngine.b.b.a.h * 2.0f);
        if (com.tsf.shell.manager.a.b.c()) {
            f -= com.censivn.C3DEngine.b.b.a.J;
        }
        v = f / ((com.censivn.C3DEngine.b.b.a.E - r) - s);
        float f2 = (com.censivn.C3DEngine.b.b.a.E / 2.0f) - (((com.censivn.C3DEngine.b.b.a.E / 2.0f) - s) * v);
        if (f2 < F) {
            w = (F - f2) + com.censivn.C3DEngine.b.b.a.h;
        } else {
            w = com.censivn.C3DEngine.b.b.a.h;
        }
        int i = ((((com.censivn.C3DEngine.b.b.a.D - t) - u) - com.tsf.shell.manager.o.b.a.T) / n) + 1;
        int i2 = ((((com.censivn.C3DEngine.b.b.a.E - r) - s) - com.tsf.shell.manager.o.b.a.U) / o) + 1;
        if (i < 2) {
            i = 2;
        }
        if (i2 < 2) {
            i2 = 2;
        }
        B = i;
        C = i2;
        x = 2;
        y = i + 2;
        z = 2;
        A = i2 + 2;
        if (com.tsf.shell.manager.b.g.V()) {
            b(B, C);
        } else if (com.censivn.C3DEngine.b.b.a.O) {
            b(com.tsf.shell.manager.b.g.S(), com.tsf.shell.manager.b.g.R());
        } else {
            b(com.tsf.shell.manager.b.g.U(), com.tsf.shell.manager.b.g.T());
        }
        if (this.aq != null) {
            this.aq.position().y = ((-r.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
        }
        if (this.T != null) {
            this.T.position().x = 0.0f;
            this.T.position().y = (com.censivn.C3DEngine.b.b.a.C + s) - com.censivn.C3DEngine.b.b.a.h;
        }
        if (this.Y != null) {
            this.Y.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
        }
        if (this.aj != null) {
            this.aj.a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
        }
        if (this.ak != null) {
            this.ak.a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
        }
        if (this.ai != null) {
            this.ai.a(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B);
        }
        if (this.an) {
            w.a(this.K);
            this.K.scale().setAll(v, v, 1.0f);
            this.K.position().y = w;
        }
    }

    public void at() {
        if (com.tsf.shell.manager.b.g.Q()) {
            c(true, true);
        } else {
            b(true, true);
        }
    }

    public void b(boolean z2, boolean z3) {
        this.ak.visible(true);
        if (!this.an) {
            this.ak.b(z2);
        }
        if (z3) {
            com.tsf.shell.manager.b.g.m(true);
            ar();
        }
        this.aj.a(true);
    }

    public void c(boolean z2, final boolean z3) {
        this.ak.a(z2, new Runnable() { // from class: com.tsf.shell.e.f.a.m.7
            @Override // java.lang.Runnable
            public void run() {
                m.this.ak.visible(false);
                if (z3) {
                    m.this.ar();
                }
            }
        });
        if (z3) {
            com.tsf.shell.manager.b.g.m(false);
        }
        this.aj.a(true);
    }

    public void g(boolean z2) {
        this.aj.visible(true);
        if (z2) {
            com.tsf.shell.manager.b.g.l(true);
            ar();
        }
    }

    public void h(boolean z2) {
        this.aj.visible(false);
        if (z2) {
            com.tsf.shell.manager.b.g.l(false);
            ar();
        }
    }

    public void au() {
        this.R = false;
        this.Q = true;
        com.tsf.shell.g.a().a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.M != null) {
            this.M.m();
        }
        com.tsf.shell.manager.a.v.f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        com.tsf.shell.g.a().b("PageApplication");
        this.R = true;
        N();
        this.X.f();
        bd();
        setAnimationObjectState(false);
        if (this.af != null) {
            this.af.run();
            this.af = null;
        }
        com.tsf.shell.manager.a.v.f.e();
    }

    private void aV() {
        if (!this.R) {
            this.ag = 0.0f;
            this.ah = 0.0f;
            this.M.b(0.0f);
            this.L.rotation().x = 0.0f;
            aU();
        }
    }

    public void av() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) com.censivn.C3DEngine.b.b.a.a(64.0f), (int) com.censivn.C3DEngine.b.b.a.a(64.0f));
        this.ar = com.censivn.C3DEngine.a.g().a(this.ar, bitmap, true);
        bitmap.recycle();
    }

    private void aW() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) com.censivn.C3DEngine.b.b.a.a(64.0f), (int) com.censivn.C3DEngine.b.b.a.a(64.0f));
        this.ar = com.censivn.C3DEngine.a.g().a(this.ar, bitmap, true);
        bitmap.recycle();
        this.aq = com.censivn.C3DEngine.b.b.a.a(64.0f, 64.0f);
        this.aq.textures().addElement(this.ar);
    }

    public void aw() {
        this.aq.removeFromParent();
        addChild(this.aq);
    }

    public void ax() {
        this.aq.removeFromParent();
    }

    @Override // com.tsf.shell.e.f.g
    public com.tsf.shell.e.i.a m() {
        return this.h;
    }

    private void aX() {
        if (this.M != null) {
            this.T.b(this.M.e());
        }
    }

    private void aY() {
        this.T.a(this.W.size());
        aX();
    }

    @Override // com.tsf.shell.e.f.g
    public void x() {
        boolean z2 = false;
        super.x();
        bf();
        bc();
        this.aj = new k(this);
        this.ak = new h(this);
        if (!com.tsf.shell.manager.b.g.P()) {
            h(false);
        }
        if (!com.tsf.shell.manager.b.g.Q()) {
            c(false, false);
        }
        this.T = new com.tsf.shell.e.e.l(z2) { // from class: com.tsf.shell.e.f.a.m.8
            @Override // com.tsf.shell.e.e.l
            public void a() {
                m.this.at();
            }
        };
        this.T.mouseEnabled(false);
        this.P = com.censivn.C3DEngine.b.b.a.D;
        F = 350.0f * com.censivn.C3DEngine.b.b.a.c;
        this.Y = new com.censivn.C3DEngine.b.f.l();
        this.Y.name(J);
        this.ae = new com.censivn.C3DEngine.b.d.a(this.Y);
        this.ad = f(this.Y);
        this.Y.setMouseEventListener(this.ad);
        this.Y.mouseEnabled(true);
        this.c.addChild(this.Y);
        this.K = new com.censivn.C3DEngine.b.f.l();
        this.L = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.f.a.m.9
            @Override // com.censivn.C3DEngine.b.f.j
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
                m.this.N = null;
                if (m.this.M != null) {
                    float f = m.this.ag / m.this.P;
                    if (!m.this.R) {
                        if (m.this.Q) {
                            m.this.M.b(((f - m.this.M.a) * 0.5f) + m.this.M.a);
                            if (m.this.S) {
                                m.this.L.rotation().x += (m.this.ah - m.this.L.rotation().x) * 0.15f;
                                return;
                            }
                            return;
                        }
                        if (f != 0.0f || Math.abs(m.this.M.a - f) >= 0.002d || Math.abs(rotation().x - m.this.ah) >= 0.002d) {
                            m.this.M.b(((f - m.this.M.a) * 0.15f) + m.this.M.a);
                            if (m.this.S) {
                                m.this.L.rotation().x += (m.this.ah - m.this.L.rotation().x) * 0.2f;
                                return;
                            }
                            return;
                        }
                        if (!m.this.R) {
                            m.this.M.b(0.0f);
                            m.this.aU();
                            Number3d rotation = rotation();
                            m.this.ah = 0.0f;
                            rotation.x = 0.0f;
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawEnd() {
                if (m.this.N != null) {
                    m.this.N.b().a(m.this.L);
                }
            }
        };
        this.K.addChild(this.L);
        this.K.addChild(this.T);
        this.K.addChild(this.aj);
        this.K.addChild(this.ak);
        this.c.addChild(this.K);
        aW();
        aT();
        this.ai = new j(this);
        this.ai.i();
        this.c.addChild(this.ai);
        aZ();
    }

    public void d(int i) {
        if (this.X.b(i)) {
            if (this.R) {
                bd();
                be();
            } else {
                a(new Runnable() { // from class: com.tsf.shell.e.f.a.m.10
                    @Override // java.lang.Runnable
                    public void run() {
                        m.this.bd();
                        m.this.be();
                    }
                });
            }
        }
    }

    public void a(Runnable runnable) {
        this.af = runnable;
    }

    public void b(Runnable runnable) {
        aZ();
        this.M.a(this.al.a(), runnable);
    }

    public void ay() {
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this.al.a());
        }
        az();
    }

    private void aZ() {
        this.L.mouseEnabled(false);
        this.aj.mouseEnabled(false);
        this.ak.mouseEnabled(false);
        ba();
    }

    public void az() {
        this.L.mouseEnabled(true);
        this.aj.mouseEnabled(true);
        this.ak.mouseEnabled(true);
        bb();
    }

    private void ba() {
        this.Y.setMouseEventListener(this.ae);
    }

    private void bb() {
        this.Y.setMouseEventListener(this.ad);
    }

    public com.censivn.C3DEngine.b.f.l aA() {
        return this.L;
    }

    private void bc() {
        this.ab = new com.censivn.C3DEngine.b.g.b.b();
        this.Z = new x() { // from class: com.tsf.shell.e.f.a.m.11
            @Override // com.censivn.C3DEngine.b.g.x
            public void b(float f) {
                m.this.ag = m.this.ac * m.this.P * f;
                if (m.this.S) {
                    m.this.ah = 45.0f * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                w.a(m.this.ab, m.D, m.this.aa);
            }
        };
        this.aa = new x() { // from class: com.tsf.shell.e.f.a.m.12
            @Override // com.censivn.C3DEngine.b.g.x
            public void b(float f) {
                m.this.ag = m.this.ac * m.this.P * (1.0f - f);
                if (m.this.S) {
                    m.this.ah = (-45.0f) * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                m.this.Q = false;
                m.this.M.n();
                m.this.az();
            }
        };
        this.aa.b(260);
        this.Z.a((v) new com.censivn.C3DEngine.b.g.d());
        this.aa.a((v) new com.censivn.C3DEngine.b.g.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        com.tsf.shell.e.f.a.b.l lVar = (com.tsf.shell.e.f.a.b.l) this.X.h();
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.a(0.0f);
            aVar.a(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void be() {
        if (this.M.d() == null) {
            this.ac = 1.0f;
        } else {
            this.ac = -1.0f;
        }
        if (this.S) {
            D = 600;
        } else {
            D = 350;
        }
        w.a(this.ab, D, this.Z);
        aZ();
        au();
    }

    public void aB() {
        if (!this.R) {
            if (this.M != null) {
                this.M.l();
            }
            this.M.b(0.0f);
            aU();
            this.L.rotation().x = 0.0f;
        }
    }

    @Override // com.tsf.shell.e.f.a.b
    public void a(a aVar) {
        this.N = aVar;
    }

    @Override // com.tsf.shell.e.f.a.b
    public a g_() {
        return bg();
    }

    @Override // com.tsf.shell.e.f.a.b
    public void h_() {
        if (!aL()) {
            aV();
        }
    }

    @Override // com.tsf.shell.e.f.a.b
    public void a(a aVar, a aVar2, a aVar3) {
        if (this.W.size() != 1) {
            this.W.remove(aVar);
            if (this.M == aVar) {
                if (aVar3 == null) {
                    this.M = (a) this.W.get(this.W.size() - 1);
                } else {
                    this.M = aVar3;
                }
                this.M.a(true);
                this.M.a(0.0f);
                this.M.p();
            }
            if (this.W.size() >= 3) {
                aVar3.a(aVar2);
                aVar2.b(aVar3);
            } else {
                if (aVar3 != null) {
                    aVar3.a((a) null);
                }
                aVar2.b((a) null);
            }
            aVar.destroy();
            int size = this.W.size();
            for (int i = 0; i < size; i++) {
                ((a) this.W.get(i)).a(i);
            }
            aY();
        }
    }

    private void bf() {
        this.X = new com.tsf.shell.e.f.a.b.m();
    }

    public com.tsf.shell.e.f.a.b.m aC() {
        return this.X;
    }

    public com.tsf.shell.e.i.b.d.b b(ArrayList arrayList) {
        return a(com.tsf.shell.utils.x.c(R.string.widget_folder), ap(), arrayList);
    }

    private com.tsf.shell.e.i.b.d.b a(String str, a aVar, ArrayList arrayList) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.e.i.b.d.b bVar = new com.tsf.shell.e.i.b.d.b(launcherDrawerFolder3DInfo);
        bVar.setMouseEventListener(f(bVar));
        aVar.addChildAt(bVar, 0);
        a(bVar, aVar, 0);
        bVar.c(arrayList);
        ao().c();
        bVar.aJ();
        return bVar;
    }

    public com.tsf.shell.e.i.b.d.b a(String str, ArrayList arrayList, boolean z2) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.e.i.b.d.b bVar = new com.tsf.shell.e.i.b.d.b(launcherDrawerFolder3DInfo);
        bVar.setMouseEventListener(f(bVar));
        if (z2) {
            this.al.a(bVar, 0);
        } else {
            this.al.a(bVar);
        }
        bVar.a(arrayList, true);
        ao().c();
        bVar.aJ();
        return bVar;
    }

    public void aD() {
        if (this.W != null) {
            int e = this.M.e();
            a aVar = (a) this.W.remove(0);
            float alpha = this.M.alpha();
            Iterator it = this.W.iterator();
            while (it.hasNext()) {
                ((a) it.next()).destroy();
            }
            this.W.clear();
            aVar.children().clear();
            aVar.a(0.0f);
            aVar.a(0);
            aVar.b((a) null);
            aVar.a((a) null);
            aVar.a(false);
            this.W.add(aVar);
            int size = this.al.a().size() - 1;
            while (true) {
                int i = size;
                if (i <= -1) {
                    break;
                }
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.al.a().get(i);
                if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                    com.tsf.shell.e.i.b.d.b bVar = (com.tsf.shell.e.i.b.d.b) cVar;
                    if (bVar.aS()) {
                        aVar.addChildAt(bVar.aA(), 0);
                    } else {
                        aVar.addChildAt(cVar, 0);
                    }
                } else {
                    aVar.addChildAt(cVar, 0);
                }
                size = i - 1;
            }
            int size2 = this.W.size() - 1;
            if (e <= size2) {
                size2 = e;
            }
            this.M = (a) this.W.get(size2);
            this.M.a(true);
            this.M.a(0.0f);
            if (alpha != 255.0f) {
                this.M.alpha(alpha);
            }
            aY();
        }
    }

    public void aE() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.m.13
            @Override // java.lang.Runnable
            public void run() {
                m.this.b(m.B, m.C);
                m.this.aD();
            }
        });
    }

    public void a(final int i, final int i2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.m.2
            @Override // java.lang.Runnable
            public void run() {
                m.this.b(i, i2);
                m.this.aD();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (i < x || i > y) {
            i = B;
        }
        if (i2 < z || i2 > A) {
            i2 = C;
        }
        p = i;
        q = i2;
        m = p * q;
        n = (((com.censivn.C3DEngine.b.b.a.D - t) - u) - com.tsf.shell.manager.o.b.a.T) / (p - 1);
        o = (((com.censivn.C3DEngine.b.b.a.E - r) - s) - com.tsf.shell.manager.o.b.a.U) / (q - 1);
        if (E == null) {
            E = new ArrayList();
        } else {
            E.clear();
        }
        float f = (com.tsf.shell.manager.o.b.a.T / 2.0f) + com.censivn.C3DEngine.b.b.a.z + t;
        float f2 = (com.censivn.C3DEngine.b.b.a.B - r) - (com.tsf.shell.manager.o.b.a.U / 2.0f);
        for (int i3 = 0; i3 < m; i3++) {
            int i4 = i3 % p;
            int i5 = i3 / p;
            Number3d number3d = new Number3d();
            number3d.x = (i4 * n) + f;
            number3d.y = ((-i5) * o) + f2;
            E.add(number3d);
        }
        this.X.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E, p, q, E);
    }

    private a bg() {
        int size = this.W.size();
        a aVar = new a((com.tsf.shell.e.f.a.b.l) this.X.h(), this);
        aVar.a(size);
        this.W.add(aVar);
        this.L.addChild(aVar);
        aVar.a(1.0f);
        aVar.a(false);
        if (this.W.size() >= 3) {
            a aVar2 = (a) this.W.get(0);
            aVar2.a(aVar);
            aVar.b(aVar2);
        }
        a aVar3 = (a) this.W.get(size - 1);
        aVar3.b(aVar);
        aVar.a(aVar3);
        aY();
        return aVar;
    }

    private void f(int i) {
        if (this.M != null) {
            this.M.o();
        }
        this.M = (a) this.W.get(i);
        this.M.p();
        this.M.a(true);
        aX();
    }

    public void aF() {
        this.R = false;
        this.Q = false;
        com.tsf.shell.g.a().a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.M != null) {
            this.M.m();
        }
        aH();
        this.M.n();
    }

    public void aG() {
        this.R = false;
        this.Q = false;
        com.tsf.shell.g.a().a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.M != null) {
            this.M.m();
        }
        aI();
        this.M.n();
    }

    public void aH() {
        if (this.M.a > -1.0f && this.M.a < 1.0f) {
            if (this.M.e() == this.W.size() - 1) {
                if (this.W.size() >= 3) {
                    this.M.i();
                    f(0);
                    return;
                }
                return;
            }
            this.M.i();
            f(this.M.e() + 1);
        }
    }

    public void aI() {
        if (this.M.a > -1.0f && this.M.a < 1.0f) {
            if (this.M.e() == 0) {
                if (this.W.size() >= 3) {
                    this.M.j();
                    f(this.W.size() - 1);
                    return;
                }
                return;
            }
            this.M.j();
            f(this.M.e() - 1);
        }
    }

    @Override // com.tsf.shell.manager.a.e
    public void a() {
    }

    @Override // com.tsf.shell.manager.a.e
    public void i_() {
        bh();
    }

    private void bh() {
        if (!this.am && com.tsf.shell.manager.a.w.a().b()) {
            com.tsf.shell.manager.a.w.c().c();
        }
    }

    public boolean aJ() {
        return this.am;
    }

    @Override // com.tsf.shell.manager.a.g
    public void a(ArrayList arrayList) {
        a aVar;
        if (!this.am) {
            this.am = true;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
                if ((cVar.K() == null || !(cVar.K() instanceof LauncherShortcutAppInfo)) ? false : ((LauncherShortcutAppInfo) cVar.K()).isHide) {
                    arrayList3.add(cVar);
                } else {
                    arrayList2.add(cVar);
                }
            }
            this.ai.d().a(arrayList3);
            int size = arrayList2.size();
            this.W = new ArrayList();
            int i = size / m;
            int i2 = (size % m != 0 || size == 0) ? i + 1 : i;
            for (int i3 = 0; i3 < i2; i3++) {
                a aVar2 = new a((com.tsf.shell.e.f.a.b.l) this.X.h(), this);
                aVar2.a(i3);
                this.W.add(aVar2);
                this.L.addChild(aVar2);
                if (i3 != 0) {
                    aVar2.a(false);
                }
            }
            int i4 = 0;
            a aVar3 = i2 >= 3 ? (a) this.W.get(i2 - 1) : null;
            while (i4 < i2) {
                a aVar4 = (a) this.W.get(i4);
                aVar4.a(aVar3);
                if (i4 == i2 - 1) {
                    aVar = i2 >= 3 ? (a) this.W.get(0) : null;
                } else {
                    aVar = (a) this.W.get(i4 + 1);
                }
                aVar4.b(aVar);
                i4++;
                aVar3 = aVar4;
            }
            f(0);
            aY();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                a((com.tsf.shell.e.i.c) arrayList2.get(i5), false, i5);
            }
            aK();
            az();
        }
    }

    public void aK() {
        synchronized (this.at) {
            Iterator it = this.as.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.as.clear();
        }
    }

    public int b(com.tsf.shell.e.i.c cVar) {
        return this.U.a(this.al.a(), cVar);
    }

    public a e(int i) {
        int i2 = i / m;
        if (i2 >= this.W.size()) {
            return bg();
        }
        return (a) this.W.get(i2);
    }

    @Override // com.tsf.shell.manager.a.e
    public void a(com.tsf.shell.e.i.b.e.i iVar, boolean z2) {
        if (this.am) {
            a((com.tsf.shell.e.i.c) iVar, z2);
        }
    }

    private void a(com.tsf.shell.e.i.c cVar, boolean z2) {
        b(cVar, z2);
    }

    private void a(com.tsf.shell.e.i.c cVar, boolean z2, int i) {
        b(cVar, z2, i);
    }

    private void b(com.tsf.shell.e.i.c cVar, boolean z2) {
        b(cVar, z2, b(cVar));
    }

    private void b(com.tsf.shell.e.i.c cVar, boolean z2, int i) {
        this.al.a(cVar, i);
        if (z2 && (cVar instanceof com.tsf.shell.e.i.b.e.i)) {
            ((com.tsf.shell.e.i.b.e.i) cVar).aX();
        }
        e(i).a(cVar, i % m, false);
        cVar.K().index = i;
        cVar.a(this.h);
        this.h.a((com.censivn.C3DEngine.b.f.j) cVar);
    }

    public void a(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
        this.al.a(cVar2, cVar);
    }

    public void a(com.tsf.shell.e.i.c cVar, a aVar, int i) {
        int e = (aVar.e() * m) + i;
        this.al.b(cVar);
        this.al.a(cVar, e);
    }

    public void c(com.tsf.shell.e.i.c cVar) {
        this.al.b(cVar);
    }

    @Override // com.tsf.shell.manager.a.e
    public void a(com.tsf.shell.e.i.b.e.i iVar) {
    }

    @Override // com.tsf.shell.manager.a.e
    public void b(com.tsf.shell.e.i.b.e.i iVar, boolean z2) {
        if (this.am) {
            a aVar = (a) iVar.parent();
            if (aVar != null) {
                aVar.removeChild(iVar);
            }
            ItemInfo K = iVar.K();
            if (K != null) {
                com.tsf.shell.manager.a.w.c().a(K);
            }
            this.al.b(iVar);
        }
    }

    public boolean d(com.tsf.shell.e.i.c cVar) {
        if (cVar instanceof com.tsf.shell.e.i.b.e.i) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) cVar;
            if (iVar.bf()) {
                com.tsf.shell.manager.a.i bd = iVar.bd();
                com.tsf.shell.manager.bind.a.c().b(bd);
                ArrayList arrayList = new ArrayList();
                arrayList.add(bd);
                com.tsf.shell.manager.a.w.b(arrayList, false);
                e((com.tsf.shell.e.i.c) iVar);
                return true;
            }
            if (iVar.be()) {
                this.I = com.tsf.shell.manager.a.q.a(this.I, com.tsf.shell.utils.x.c(R.string.notic_uninstall_error), -52736, 2000);
                return false;
            }
            iVar.bg();
            return false;
        }
        if (!(cVar instanceof com.tsf.shell.e.i.b.d.b)) {
            return false;
        }
        e(cVar);
        return false;
    }

    private void e(final com.tsf.shell.e.i.c cVar) {
        cVar.mouseEnabled(false);
        cVar.n_();
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.m.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                com.tsf.shell.manager.a.w.c().a(cVar.K());
                cVar.g();
                cVar.destroy();
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.n(0.0f);
        w.a(cVar);
        w.a(cVar, VEasing.Back.easeIn, xVar);
    }

    public com.censivn.C3DEngine.b.d.a f(com.censivn.C3DEngine.b.f.j jVar) {
        return new com.censivn.C3DEngine.b.d.a(jVar) { // from class: com.tsf.shell.e.f.a.m.4
            private float b;
            private com.tsf.shell.e.i.c d;
            private com.tsf.shell.e.i.a.d g;
            private boolean e = false;
            private boolean f = false;
            private boolean h = false;
            private float[] i = {0.0f, 0.0f};

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                m.this.as();
                if (m.this.an) {
                    if (this.c instanceof com.tsf.shell.e.i.e) {
                        m.this.ai.e((com.tsf.shell.e.i.e) this.c, motionEvent);
                    }
                } else if (this.h) {
                    if (this.c instanceof com.tsf.shell.e.i.b.e.i) {
                        com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) this.c;
                        if (iVar.aC()) {
                            if (m.this.h.e()) {
                                iVar.ap();
                                return;
                            } else {
                                iVar.l();
                                return;
                            }
                        }
                        return;
                    }
                    if (this.c instanceof com.tsf.shell.e.i.b.d.b) {
                        ((com.tsf.shell.e.i.b.d.b) this.c).aR();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                m.this.as();
                if (m.this.an) {
                    if (this.c instanceof com.tsf.shell.e.i.e) {
                        m.this.ai.c((com.tsf.shell.e.i.e) this.c, motionEvent);
                    }
                } else {
                    m.this.aj();
                    c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (this.c instanceof com.tsf.shell.e.i.e) {
                    m.this.ai.d((com.tsf.shell.e.i.e) this.c, motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (m.this.an) {
                    if (this.c instanceof com.tsf.shell.e.i.e) {
                        m.this.ai.a((com.tsf.shell.e.i.e) this.c, motionEvent, motionEvent2);
                        return;
                    }
                    return;
                }
                if (this.e) {
                    com.tsf.shell.utils.x.a(motionEvent2, this.i);
                    if (this.d.a((int) this.i[0], (int) this.i[1]) == null) {
                        if (this.g != null) {
                            this.g.a(motionEvent, motionEvent2);
                            return;
                        }
                        return;
                    } else {
                        this.f = true;
                        this.e = false;
                        if (this.g != null) {
                            this.g.a(false);
                        }
                        com.tsf.shell.manager.a.h.C();
                        return;
                    }
                }
                if (this.f && this.g != null) {
                    this.g.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (m.this.an && (this.c instanceof com.tsf.shell.e.i.e)) {
                    m.this.ai.a((com.tsf.shell.e.i.e) this.c, motionEvent);
                }
                com.tsf.shell.manager.action.h.a(motionEvent);
                this.h = m.this.R;
                m.this.Q = false;
                this.f = false;
                if (this.c instanceof com.tsf.shell.e.i.b.e.i) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) this.c;
                    if (iVar.aC()) {
                        iVar.aQ();
                        iVar.aY();
                        return;
                    }
                    return;
                }
                boolean z2 = this.c instanceof com.tsf.shell.e.i.b.d.b;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
                if (m.this.an && (this.c instanceof com.tsf.shell.e.i.e)) {
                    m.this.ai.a((com.tsf.shell.e.i.e) this.c, motionEvent, motionEvent2, f, f2);
                }
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.m.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.censivn.C3DEngine.a.h.d().h() == this) {
                            if (!m.this.Q) {
                                m.this.au();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                m mVar = m.this;
                                float f3 = m.this.M.position().x;
                                mVar.ag = f3;
                                anonymousClass4.b = f3;
                            }
                            m.this.ag = AnonymousClass4.this.b + (motionEvent2.getX() - motionEvent.getX());
                            if (m.this.S) {
                                float y2 = (float) (((motionEvent2.getY() - motionEvent.getY()) / (com.censivn.C3DEngine.b.b.a.G / 2)) * 1.3d);
                                m.this.ah = (y2 <= 1.0f ? y2 < -1.0f ? -1.0f : y2 : 1.0f) * 45.0f;
                            }
                        }
                    }
                });
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                if (m.this.Q) {
                    m.this.Q = false;
                    m.this.ag = 0.0f;
                    if (m.this.M.a > 0.5d) {
                        m.this.aI();
                    } else if (m.this.M.a < -0.5d) {
                        m.this.aH();
                    }
                    m.this.M.n();
                    return;
                }
                m.this.aU();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (m.this.an && (this.c instanceof com.tsf.shell.e.i.e)) {
                    m.this.ai.b((com.tsf.shell.e.i.e) this.c, motionEvent);
                }
                m.this.ah = 0.0f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (m.this.an && (this.c instanceof com.tsf.shell.e.i.e)) {
                    m.this.ai.b((com.tsf.shell.e.i.e) this.c, motionEvent, motionEvent2, f, f2);
                }
                m.this.Q = false;
                m.this.ag = 0.0f;
                if (!m.this.R && Math.abs(f) > 100.0f) {
                    if (f < 0.0f) {
                        m.this.aH();
                    } else {
                        m.this.aI();
                    }
                }
                m.this.M.n();
            }
        };
    }

    @Override // com.tsf.shell.e.f.g
    public void ab() {
        super.ab();
        if (this.M != null) {
            this.M.g();
        }
        if (!this.R) {
            com.tsf.shell.g.a().b("PageApplication");
        }
    }

    @Override // com.tsf.shell.e.f.g
    public void ac() {
        super.ac();
        if (this.M != null) {
            this.M.h();
        }
        if (!this.R) {
            com.tsf.shell.g.a().a("PageApplication");
        }
    }

    public boolean aL() {
        return this.R;
    }

    private void bi() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.a.m.5
            @Override // java.lang.Runnable
            public void run() {
                m.this.au = new FrameLayout(com.censivn.C3DEngine.a.d());
                ImageView imageView = new ImageView(com.censivn.C3DEngine.a.d());
                imageView.setImageResource(R.drawable.drawer_loading);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(500L);
                rotateAnimation.setRepeatCount(-1);
                imageView.setAnimation(rotateAnimation);
                rotateAnimation.startNow();
                m.this.au.addView(imageView, new FrameLayout.LayoutParams(com.censivn.C3DEngine.b.b.a.b(80.0f), com.censivn.C3DEngine.b.b.a.b(80.0f), 17));
                com.tsf.shell.manager.a.j.a(m.this.au, new ViewGroup.LayoutParams(-1, -1));
            }
        });
    }

    private void bj() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.f.a.m.6
            @Override // java.lang.Runnable
            public void run() {
                if (m.this.au != null) {
                    com.tsf.shell.manager.a.j.a(m.this.au);
                }
            }
        });
    }

    public void b(Runnable runnable, boolean z2) {
        if (!this.av) {
            ap().a(false);
            return;
        }
        this.T.d(z2);
        this.aj.c(z2);
        this.ak.b(z2);
    }

    public void c(Runnable runnable, boolean z2) {
        this.T.c(z2);
        this.aj.b(z2);
        this.ak.a(z2);
        aZ();
    }

    public boolean aM() {
        return this.av || ap() == null;
    }

    public void aN() {
        if (!aM()) {
            bi();
            int size = this.al.a().size();
            for (int i = 0; i < size; i++) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.al.a().get(i);
                if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
                    ((com.tsf.shell.e.i.b.e.b) cVar).aA();
                }
            }
            bj();
            this.av = true;
        }
    }

    private void bk() {
        if (!aM()) {
            bi();
            a ap = ap();
            int size = this.al.a().size();
            for (int i = 0; i < size; i++) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.al.a().get(i);
                if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
                    ((com.tsf.shell.e.i.b.e.b) cVar).aA();
                }
            }
            if (!ap.visible()) {
                p pVar = (p) com.tsf.shell.manager.a.v.a.b.h();
                pVar.b((com.tsf.shell.e.f.g) this, false);
                pVar.a((com.tsf.shell.e.f.g) this, true);
                ap.a(true);
            }
            bj();
            this.av = true;
            this.T.d(true);
            this.aj.c(true);
            this.ak.b(true);
        }
    }

    @Override // com.tsf.shell.e.f.g
    public void W() {
        super.W();
        bk();
        az();
    }

    public void aO() {
    }
}
