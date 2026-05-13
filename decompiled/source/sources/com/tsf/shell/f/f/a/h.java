package com.tsf.shell.f.f.a;

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
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.a;
import com.tsf.b;
import com.tsf.shell.f.f.a.a;
import com.tsf.shell.f.f.a.b.l;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.a.c;
import com.tsf.shell.manager.a.d;
import com.tsf.shell.manager.n.a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h extends com.tsf.shell.f.f.g implements b.a, a.InterfaceC0101a, c.a, d.a {
    public static int A;
    public static int B;
    public static int C;
    public static ArrayList<Number3d> E;
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
    public com.tsf.shell.f.i.b.e.h G;
    public k H;
    protected a.C0133a I;
    private j K;
    private j L;
    private a M;
    private a N;
    private com.tsf.shell.f.f.a.a.c O;
    private int P;
    private com.tsf.shell.f.e.j T;
    private com.tsf.shell.f.f.a.d.a U;
    private d V;
    private ArrayList<a> W;
    private l X;
    private j Y;
    private com.censivn.C3DEngine.b.g.d Z;
    private com.censivn.C3DEngine.b.g.d aa;
    private com.censivn.C3DEngine.b.g.b.b ab;
    private com.censivn.C3DEngine.b.d.a ad;
    private com.censivn.C3DEngine.b.d.a ae;
    private Runnable af;
    private float ag;
    private f ai;
    private g aj;
    private e ak;
    private b al;
    private a.C0133a ao;
    private k aq;
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
    private ArrayList<Runnable> as = new ArrayList<>();
    private Object at = new Object();
    private boolean av = false;

    public i a(com.tsf.shell.f.i.b bVar) {
        i iVar;
        if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
            com.tsf.shell.f.i.b.e.b bVar2 = (com.tsf.shell.f.i.b.e.b) bVar;
            if (this.G == null) {
                this.G = new com.tsf.shell.f.i.b.e.h();
            }
            this.G.k.textures().clear();
            if (bVar2.aC() && !bVar2.t()) {
                this.G.k.textures().addElement(bVar2.k.textures().get(0).textureElement);
            }
            iVar = this.G;
        } else {
            TextureElement aD = ((com.tsf.shell.f.i.b.d.b) bVar).aD();
            if (this.H == null) {
                this.H = com.tsf.shell.f.i.b.d.b.l();
            }
            this.H.a(aD.width);
            this.H.b(aD.height);
            this.H.textures().addElement(aD);
            iVar = this.H;
        }
        Number3d.TEMPNUMBER3D.reset();
        bVar.localToGlobal(Number3d.TEMPNUMBER3D);
        iVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
        Number3d.TEMPNUMBER3D.x = 1.0f;
        Number3d.TEMPNUMBER3D.y = 1.0f;
        Number3d.TEMPNUMBER3D.z = 1.0f;
        bVar.localScaleToGlobale(Number3d.TEMPNUMBER3D);
        iVar.scale().setAllFrom(Number3d.TEMPNUMBER3D);
        return iVar;
    }

    public void e(i iVar) {
        if (iVar instanceof com.tsf.shell.f.i.b.e.b) {
            ((com.tsf.shell.f.i.b.e.b) iVar).k.textures().clear();
        } else {
            ((k) iVar).textures().clear();
        }
        iVar.removeFromParent();
    }

    public boolean aj() {
        if (this.an) {
            return false;
        }
        com.tsf.shell.manager.action.f.b();
        this.aj.b(true);
        this.ak.a(true);
        this.an = true;
        com.tsf.shell.manager.a.c.c(this);
        com.censivn.C3DEngine.b.c.b.a(this);
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
            com.tsf.shell.manager.action.f.c();
            this.aj.c(true);
            this.ak.b(true);
            com.censivn.C3DEngine.b.c.b.b(this);
            this.an = false;
            com.tsf.shell.manager.a.c.b(this);
            aQ();
            aS();
            this.ai.k();
        }
    }

    public void a(com.tsf.shell.f.i.b bVar, boolean z2, float f, float f2) {
        if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
            com.tsf.shell.manager.a.p.a(bVar, f, f2, z2, 3);
        } else {
            com.tsf.shell.manager.a.p.a(bVar, f, f2, z2, 3, 5);
        }
    }

    private void aP() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(v);
        dVar.m(v);
        dVar.h(w);
        com.censivn.C3DEngine.b.g.c.a(this.K);
        com.censivn.C3DEngine.b.g.c.a(this.K, 300, dVar);
    }

    private void aQ() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.h.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                h.this.N();
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.h(0.0f);
        com.censivn.C3DEngine.b.g.c.a(this.K);
        com.censivn.C3DEngine.b.g.c.a(this.K, 300, dVar);
    }

    private void aR() {
        this.ao = com.tsf.shell.manager.a.q.a(this.ao, x.c(b.i.text_app_drawer_setting));
    }

    private void aS() {
        com.tsf.shell.manager.a.q.b(this.ao);
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            ak();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public h() {
        com.tsf.shell.manager.a.w.c().a(this);
        this.al = com.tsf.shell.manager.a.w.d();
        this.U = com.tsf.shell.manager.a.w.b();
        this.V = new d();
        com.tsf.shell.manager.a.w.a().a(this);
        this.O = new com.tsf.shell.f.f.a.a.c();
    }

    public void al() {
        this.O.f();
    }

    public d am() {
        return this.V;
    }

    public com.tsf.shell.f.f.a.d.a an() {
        return this.U;
    }

    public b ao() {
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
        j_();
        aT();
        aD();
        aX();
        if (this.M != null) {
            this.M.a();
        }
        N();
        this.ap = false;
    }

    @Override // com.tsf.shell.f.f.g, com.censivn.C3DEngine.b.c.e.a
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
        r = com.tsf.shell.manager.b.e.Q() ? (int) (150.0f * com.censivn.C3DEngine.b.b.a.c) : (int) (com.censivn.C3DEngine.b.b.a.c * 35.0f);
        s = com.tsf.shell.manager.b.e.R() ? com.censivn.C3DEngine.b.b.a.g + (com.censivn.C3DEngine.b.b.a.h * 1) : com.censivn.C3DEngine.b.b.a.h * 2;
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
        if (com.tsf.shell.manager.b.e.W()) {
            b(B, C);
        } else if (com.censivn.C3DEngine.b.b.a.O) {
            b(com.tsf.shell.manager.b.e.T(), com.tsf.shell.manager.b.e.S());
        } else {
            b(com.tsf.shell.manager.b.e.V(), com.tsf.shell.manager.b.e.U());
        }
        if (this.aq != null) {
            this.aq.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.a.c);
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
            com.censivn.C3DEngine.b.g.c.a(this.K);
            this.K.scale().setAll(v, v, 1.0f);
            this.K.position().y = w;
        }
    }

    public void at() {
        if (com.tsf.shell.manager.b.e.R()) {
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
            com.tsf.shell.manager.b.e.n(true);
            ar();
        }
        this.aj.a(true);
    }

    public void c(boolean z2, final boolean z3) {
        this.ak.a(z2, new Runnable() { // from class: com.tsf.shell.f.f.a.h.7
            @Override // java.lang.Runnable
            public void run() {
                h.this.ak.visible(false);
                if (z3) {
                    h.this.ar();
                }
            }
        });
        if (z3) {
            com.tsf.shell.manager.b.e.n(false);
        }
        this.aj.a(true);
    }

    public void g(boolean z2) {
        this.aj.visible(true);
        if (z2) {
            com.tsf.shell.manager.b.e.m(true);
            ar();
        }
    }

    public void h(boolean z2) {
        this.aj.visible(false);
        if (z2) {
            com.tsf.shell.manager.b.e.m(false);
            ar();
        }
    }

    public void au() {
        this.R = false;
        this.Q = true;
        com.tsf.shell.d.a().a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.M != null) {
            this.M.m();
        }
        com.tsf.shell.manager.a.v.f.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        com.tsf.shell.d.a().b("PageApplication");
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

    @Override // com.tsf.shell.f.f.g
    public com.tsf.shell.f.i.a m() {
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

    @Override // com.tsf.shell.f.f.g
    public void x() {
        super.x();
        bf();
        bc();
        this.aj = new g(this);
        this.ak = new e(this);
        if (!com.tsf.shell.manager.b.e.Q()) {
            h(false);
        }
        if (!com.tsf.shell.manager.b.e.R()) {
            c(false, false);
        }
        this.T = new com.tsf.shell.f.e.j(false) { // from class: com.tsf.shell.f.f.a.h.8
            @Override // com.tsf.shell.f.e.j
            public void a() {
                h.this.at();
            }
        };
        this.T.mouseEnabled(false);
        this.P = com.censivn.C3DEngine.b.b.a.D;
        F = 350.0f * com.censivn.C3DEngine.b.b.a.c;
        this.Y = new j();
        this.Y.name(J);
        this.ae = new com.censivn.C3DEngine.b.d.a(this.Y);
        this.ad = f(this.Y);
        this.Y.setMouseEventListener(this.ad);
        this.Y.mouseEnabled(true);
        this.c.addChild(this.Y);
        this.K = new j();
        this.L = new j() { // from class: com.tsf.shell.f.f.a.h.9
            @Override // com.censivn.C3DEngine.b.f.i
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
                h.this.N = null;
                if (h.this.M != null) {
                    float f = h.this.ag / h.this.P;
                    if (!h.this.R) {
                        if (h.this.Q) {
                            h.this.M.b(((f - h.this.M.a) * 0.5f) + h.this.M.a);
                            if (h.this.S) {
                                h.this.L.rotation().x += (h.this.ah - h.this.L.rotation().x) * 0.15f;
                            }
                        } else if (f != 0.0f || Math.abs(h.this.M.a - f) >= 0.002d || Math.abs(rotation().x - h.this.ah) >= 0.002d) {
                            h.this.M.b(((f - h.this.M.a) * 0.15f) + h.this.M.a);
                            if (h.this.S) {
                                h.this.L.rotation().x += (h.this.ah - h.this.L.rotation().x) * 0.2f;
                            }
                        } else if (!h.this.R) {
                            h.this.M.b(0.0f);
                            h.this.aU();
                            rotation().x = h.this.ah = 0.0f;
                        }
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawEnd() {
                if (h.this.N != null) {
                    h.this.N.b().a(h.this.L);
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
        this.ai = new f(this);
        this.ai.i();
        this.c.addChild(this.ai);
        aZ();
    }

    public void d(int i) {
        if (this.X.b(i)) {
            if (this.R) {
                bd();
                be();
                return;
            }
            a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.10
                @Override // java.lang.Runnable
                public void run() {
                    h.this.bd();
                    h.this.be();
                }
            });
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
        Iterator<a> it = this.W.iterator();
        while (it.hasNext()) {
            it.next().a(this.al.a());
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

    public j aA() {
        return this.L;
    }

    private void bc() {
        this.ab = new com.censivn.C3DEngine.b.g.b.b();
        this.Z = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.h.11
            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f) {
                h.this.ag = h.this.ac * h.this.P * f;
                if (h.this.S) {
                    h.this.ah = 45.0f * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.c.a(h.this.ab, h.D, h.this.aa);
            }
        };
        this.aa = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.h.12
            @Override // com.censivn.C3DEngine.b.g.d
            public void b(float f) {
                h.this.ag = h.this.ac * h.this.P * (1.0f - f);
                if (h.this.S) {
                    h.this.ah = (-45.0f) * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
                }
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                h.this.Q = false;
                h.this.M.n();
                h.this.az();
            }
        };
        this.aa.b(260);
        this.Z.a((com.censivn.C3DEngine.b.g.b) new a.C0030a.b());
        this.aa.a((com.censivn.C3DEngine.b.g.b) new a.C0030a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        com.tsf.shell.f.f.a.b.k h = this.X.h();
        Iterator<a> it = this.W.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.a(0.0f);
            next.a(h);
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
        com.censivn.C3DEngine.b.g.c.a(this.ab, D, this.Z);
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

    @Override // com.tsf.shell.f.f.a.a.InterfaceC0101a
    public void a(a aVar) {
        this.N = aVar;
    }

    @Override // com.tsf.shell.f.f.a.a.InterfaceC0101a
    public a i_() {
        return bg();
    }

    @Override // com.tsf.shell.f.f.a.a.InterfaceC0101a
    public void j_() {
        if (!aL()) {
            aV();
        }
    }

    @Override // com.tsf.shell.f.f.a.a.InterfaceC0101a
    public void a(a aVar, a aVar2, a aVar3) {
        if (this.W.size() != 1) {
            this.W.remove(aVar);
            if (this.M == aVar) {
                if (aVar3 == null) {
                    this.M = this.W.get(this.W.size() - 1);
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
                this.W.get(i).a(i);
            }
            aY();
        }
    }

    private void bf() {
        this.X = new l();
    }

    public l aC() {
        return this.X;
    }

    public com.tsf.shell.f.i.b.d.b b(ArrayList<com.tsf.shell.f.i.b.e.b> arrayList) {
        return a(x.c(b.i.widget_folder), ap(), arrayList);
    }

    private com.tsf.shell.f.i.b.d.b a(String str, a aVar, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.f.i.b.d.b bVar = new com.tsf.shell.f.i.b.d.b(launcherDrawerFolder3DInfo);
        bVar.setMouseEventListener(f(bVar));
        aVar.addChildAt(bVar, 0);
        a(bVar, aVar, 0);
        bVar.c(arrayList);
        ao().c();
        bVar.aJ();
        return bVar;
    }

    public com.tsf.shell.f.i.b.d.b a(String str, ArrayList<com.tsf.shell.f.i.b.e.b> arrayList, boolean z2) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.f.i.b.d.b bVar = new com.tsf.shell.f.i.b.d.b(launcherDrawerFolder3DInfo);
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
            a remove = this.W.remove(0);
            float alpha = this.M.alpha();
            Iterator<a> it = this.W.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.W.clear();
            remove.children().clear();
            remove.a(0.0f);
            remove.a(0);
            remove.b((a) null);
            remove.a((a) null);
            remove.a(false);
            this.W.add(remove);
            int size = this.al.a().size() - 1;
            while (true) {
                int i = size;
                if (i <= -1) {
                    break;
                }
                com.tsf.shell.f.i.b bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
                    com.tsf.shell.f.i.b.d.b bVar2 = (com.tsf.shell.f.i.b.d.b) bVar;
                    if (bVar2.aS()) {
                        remove.addChildAt(bVar2.aA(), 0);
                    } else {
                        remove.addChildAt(bVar, 0);
                    }
                } else {
                    remove.addChildAt(bVar, 0);
                }
                size = i - 1;
            }
            int size2 = this.W.size() - 1;
            if (e <= size2) {
                size2 = e;
            }
            this.M = this.W.get(size2);
            this.M.a(true);
            this.M.a(0.0f);
            if (alpha != 255.0f) {
                this.M.alpha(alpha);
            }
            aY();
        }
    }

    public void aE() {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.13
            @Override // java.lang.Runnable
            public void run() {
                h.this.b(h.B, h.C);
                h.this.aD();
            }
        });
    }

    public void a(final int i, final int i2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.2
            @Override // java.lang.Runnable
            public void run() {
                h.this.b(i, i2);
                h.this.aD();
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
            E = new ArrayList<>();
        } else {
            E.clear();
        }
        float f = (com.tsf.shell.manager.o.b.a.T / 2.0f) + com.censivn.C3DEngine.b.b.a.z + t;
        float f2 = (com.censivn.C3DEngine.b.b.a.B - r) - (com.tsf.shell.manager.o.b.a.U / 2.0f);
        for (int i3 = 0; i3 < m; i3++) {
            Number3d number3d = new Number3d();
            number3d.x = ((i3 % p) * n) + f;
            number3d.y = ((-(i3 / p)) * o) + f2;
            E.add(number3d);
        }
        this.X.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E, p, q, E);
    }

    private a bg() {
        int size = this.W.size();
        a aVar = new a(this.X.h(), this);
        aVar.a(size);
        this.W.add(aVar);
        this.L.addChild(aVar);
        aVar.a(1.0f);
        aVar.a(false);
        if (this.W.size() >= 3) {
            a aVar2 = this.W.get(0);
            aVar2.a(aVar);
            aVar.b(aVar2);
        }
        a aVar3 = this.W.get(size - 1);
        aVar3.b(aVar);
        aVar.a(aVar3);
        aY();
        return aVar;
    }

    private void f(int i) {
        if (this.M != null) {
            this.M.o();
        }
        this.M = this.W.get(i);
        this.M.p();
        this.M.a(true);
        aX();
    }

    public void aF() {
        this.R = false;
        this.Q = false;
        com.tsf.shell.d.a().a("PageApplication");
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
        com.tsf.shell.d.a().a("PageApplication");
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

    @Override // com.tsf.shell.manager.a.c.a
    public void a() {
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void k_() {
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

    @Override // com.tsf.shell.manager.a.d.a
    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        a aVar;
        if (!this.am) {
            this.am = true;
            ArrayList arrayList2 = new ArrayList();
            ArrayList<com.tsf.shell.f.i.b> arrayList3 = new ArrayList<>();
            Iterator<com.tsf.shell.f.i.b> it = arrayList.iterator();
            while (it.hasNext()) {
                com.tsf.shell.f.i.b next = it.next();
                if ((next.K() == null || !(next.K() instanceof LauncherShortcutAppInfo)) ? false : ((LauncherShortcutAppInfo) next.K()).isHide) {
                    arrayList3.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            this.ai.d().a(arrayList3);
            int size = arrayList2.size();
            this.W = new ArrayList<>();
            int i = size / m;
            int i2 = (size % m != 0 || size == 0) ? i + 1 : i;
            for (int i3 = 0; i3 < i2; i3++) {
                a aVar2 = new a(this.X.h(), this);
                aVar2.a(i3);
                this.W.add(aVar2);
                this.L.addChild(aVar2);
                if (i3 != 0) {
                    aVar2.a(false);
                }
            }
            int i4 = 0;
            a aVar3 = i2 >= 3 ? this.W.get(i2 - 1) : null;
            while (i4 < i2) {
                a aVar4 = this.W.get(i4);
                aVar4.a(aVar3);
                if (i4 == i2 - 1) {
                    aVar = i2 >= 3 ? this.W.get(0) : null;
                } else {
                    aVar = this.W.get(i4 + 1);
                }
                aVar4.b(aVar);
                i4++;
                aVar3 = aVar4;
            }
            f(0);
            aY();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                a((com.tsf.shell.f.i.b) arrayList2.get(i5), false, i5);
            }
            aK();
            az();
        }
    }

    public void aK() {
        synchronized (this.at) {
            Iterator<Runnable> it = this.as.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.as.clear();
        }
    }

    public int b(com.tsf.shell.f.i.b bVar) {
        return this.U.a(this.al.a(), bVar);
    }

    public a e(int i) {
        int i2 = i / m;
        if (i2 >= this.W.size()) {
            return bg();
        }
        return this.W.get(i2);
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z2) {
        if (this.am) {
            a((com.tsf.shell.f.i.b) gVar, z2);
        }
    }

    private void a(com.tsf.shell.f.i.b bVar, boolean z2) {
        b(bVar, z2);
    }

    private void a(com.tsf.shell.f.i.b bVar, boolean z2, int i) {
        b(bVar, z2, i);
    }

    private void b(com.tsf.shell.f.i.b bVar, boolean z2) {
        b(bVar, z2, b(bVar));
    }

    private void b(com.tsf.shell.f.i.b bVar, boolean z2, int i) {
        this.al.a(bVar, i);
        if (z2 && (bVar instanceof com.tsf.shell.f.i.b.e.g)) {
            ((com.tsf.shell.f.i.b.e.g) bVar).aX();
        }
        e(i).a(bVar, i % m, false);
        bVar.K().index = i;
        bVar.a(this.h);
        this.h.a((i) bVar);
    }

    public void a(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
        this.al.a(bVar2, bVar);
    }

    public void a(com.tsf.shell.f.i.b bVar, a aVar, int i) {
        this.al.b(bVar);
        this.al.a(bVar, (aVar.e() * m) + i);
    }

    public void c(com.tsf.shell.f.i.b bVar) {
        this.al.b(bVar);
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void a(com.tsf.shell.f.i.b.e.g gVar) {
    }

    @Override // com.tsf.shell.manager.a.c.a
    public void b(com.tsf.shell.f.i.b.e.g gVar, boolean z2) {
        if (this.am) {
            a aVar = (a) gVar.parent();
            if (aVar != null) {
                aVar.removeChild(gVar);
            }
            ItemInfo K = gVar.K();
            if (K != null) {
                com.tsf.shell.manager.a.w.c().a(K);
            }
            this.al.b(gVar);
        }
    }

    public boolean d(com.tsf.shell.f.i.b bVar) {
        if (bVar instanceof com.tsf.shell.f.i.b.e.g) {
            com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) bVar;
            if (gVar.bf()) {
                com.tsf.shell.manager.a.f bd = gVar.bd();
                com.tsf.shell.manager.bind.a.c().b(bd);
                ArrayList<com.tsf.shell.manager.a.f> arrayList = new ArrayList<>();
                arrayList.add(bd);
                com.tsf.shell.manager.a.w.b(arrayList, false);
                e((com.tsf.shell.f.i.b) gVar);
                return true;
            } else if (gVar.be()) {
                this.I = com.tsf.shell.manager.a.q.a(this.I, x.c(b.i.notic_uninstall_error), -52736, 2000);
                return false;
            } else {
                gVar.bg();
                return false;
            }
        } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
            e(bVar);
            return false;
        } else {
            return false;
        }
    }

    private void e(final com.tsf.shell.f.i.b bVar) {
        bVar.mouseEnabled(false);
        bVar.p_();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.h.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.tsf.shell.manager.a.w.c().a(bVar.K());
                bVar.g();
                bVar.destroy();
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.n(0.0f);
        com.censivn.C3DEngine.b.g.c.a(bVar);
        com.censivn.C3DEngine.b.g.c.a(bVar, VEasing.Back.easeIn, dVar);
    }

    public com.censivn.C3DEngine.b.d.a f(i iVar) {
        return new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.f.f.a.h.4
            private float b;
            private com.tsf.shell.f.i.b d;
            private com.tsf.shell.f.i.a.d g;
            private boolean e = false;
            private boolean f = false;
            private boolean h = false;
            private float[] i = {0.0f, 0.0f};

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                h.this.as();
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.c) {
                        h.this.ai.e((com.tsf.shell.f.i.c) this.c, motionEvent);
                    }
                } else if (this.h) {
                    if (this.c instanceof com.tsf.shell.f.i.b.e.g) {
                        com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) this.c;
                        if (gVar.aC()) {
                            if (h.this.h.e()) {
                                gVar.ap();
                            } else {
                                gVar.l();
                            }
                        }
                    } else if (this.c instanceof com.tsf.shell.f.i.b.d.b) {
                        ((com.tsf.shell.f.i.b.d.b) this.c).aR();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                h.this.as();
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.c) {
                        h.this.ai.c((com.tsf.shell.f.i.c) this.c, motionEvent);
                        return;
                    }
                    return;
                }
                if (!h.this.aj()) {
                }
                c(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (this.c instanceof com.tsf.shell.f.i.c) {
                    h.this.ai.d((com.tsf.shell.f.i.c) this.c, motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.c) {
                        h.this.ai.a((com.tsf.shell.f.i.c) this.c, motionEvent, motionEvent2);
                    }
                } else if (this.e) {
                    x.a(motionEvent2, this.i);
                    if (this.d.a((int) this.i[0], (int) this.i[1]) == null) {
                        if (this.g != null) {
                            this.g.a(motionEvent, motionEvent2);
                            return;
                        }
                        return;
                    }
                    this.f = true;
                    this.e = false;
                    if (this.g != null) {
                        this.g.a(false);
                    }
                    com.tsf.shell.manager.a.h.C();
                } else if (this.f && this.g != null) {
                    this.g.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.c)) {
                    h.this.ai.a((com.tsf.shell.f.i.c) this.c, motionEvent);
                }
                com.tsf.shell.manager.action.f.a(motionEvent);
                this.h = h.this.R;
                h.this.Q = false;
                this.f = false;
                if (this.c instanceof com.tsf.shell.f.i.b.e.g) {
                    com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) this.c;
                    if (gVar.aC()) {
                        gVar.aQ();
                        gVar.aY();
                        return;
                    }
                    return;
                }
                if (this.c instanceof com.tsf.shell.f.i.b.d.b) {
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.c)) {
                    h.this.ai.a((com.tsf.shell.f.i.c) this.c, motionEvent, motionEvent2, f, f2);
                }
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.h.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        float f3 = 1.0f;
                        if (com.censivn.C3DEngine.a.d.d().h() == this) {
                            if (!h.this.Q) {
                                h.this.au();
                                AnonymousClass4.this.b = h.this.ag = h.this.M.position().x;
                            }
                            h.this.ag = AnonymousClass4.this.b + (motionEvent2.getX() - motionEvent.getX());
                            if (h.this.S) {
                                float y2 = (float) (((motionEvent2.getY() - motionEvent.getY()) / (com.censivn.C3DEngine.b.b.a.G / 2)) * 1.3d);
                                if (y2 <= 1.0f) {
                                    f3 = y2 < -1.0f ? -1.0f : y2;
                                }
                                h.this.ah = f3 * 45.0f;
                            }
                        }
                    }
                });
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                if (h.this.an) {
                }
                if (!h.this.Q) {
                    h.this.aU();
                    return;
                }
                h.this.Q = false;
                h.this.ag = 0.0f;
                if (h.this.M.a <= 0.5d) {
                    if (h.this.M.a < -0.5d) {
                        h.this.aH();
                    }
                } else {
                    h.this.aI();
                }
                h.this.M.n();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.c)) {
                    h.this.ai.b((com.tsf.shell.f.i.c) this.c, motionEvent);
                }
                h.this.ah = 0.0f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.c)) {
                    h.this.ai.b((com.tsf.shell.f.i.c) this.c, motionEvent, motionEvent2, f, f2);
                }
                h.this.Q = false;
                h.this.ag = 0.0f;
                if (!h.this.R && Math.abs(f) > 100.0f) {
                    if (f < 0.0f) {
                        h.this.aH();
                    } else {
                        h.this.aI();
                    }
                }
                h.this.M.n();
            }
        };
    }

    @Override // com.tsf.shell.f.f.g
    public void ab() {
        super.ab();
        if (this.M != null) {
            this.M.g();
        }
        if (!this.R) {
            com.tsf.shell.d.a().b("PageApplication");
        }
    }

    @Override // com.tsf.shell.f.f.g
    public void ac() {
        super.ac();
        if (this.M != null) {
            this.M.h();
        }
        if (!this.R) {
            com.tsf.shell.d.a().a("PageApplication");
        }
    }

    public boolean aL() {
        return this.R;
    }

    private void bi() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.5
            @Override // java.lang.Runnable
            public void run() {
                h.this.au = new FrameLayout(com.censivn.C3DEngine.a.d());
                ImageView imageView = new ImageView(com.censivn.C3DEngine.a.d());
                imageView.setImageResource(b.d.drawer_loading);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(500L);
                rotateAnimation.setRepeatCount(-1);
                imageView.setAnimation(rotateAnimation);
                rotateAnimation.startNow();
                h.this.au.addView(imageView, new FrameLayout.LayoutParams(com.censivn.C3DEngine.b.b.a.b(80.0f), com.censivn.C3DEngine.b.b.a.b(80.0f), 17));
                com.tsf.shell.manager.a.j.a(h.this.au, new ViewGroup.LayoutParams(-1, -1));
            }
        });
    }

    private void bj() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.h.6
            @Override // java.lang.Runnable
            public void run() {
                if (h.this.au != null) {
                    com.tsf.shell.manager.a.j.a(h.this.au);
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
                com.tsf.shell.f.i.b bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
                    ((com.tsf.shell.f.i.b.e.b) bVar).aA();
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
                com.tsf.shell.f.i.b bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
                    ((com.tsf.shell.f.i.b.e.b) bVar).aA();
                }
            }
            if (!ap.visible()) {
                com.tsf.shell.f.f.l h = com.tsf.shell.manager.a.v.a.b.h();
                h.b((com.tsf.shell.f.f.g) this, false);
                h.a((com.tsf.shell.f.f.g) this, true);
                ap.a(true);
            }
            bj();
            this.av = true;
            this.T.d(true);
            this.aj.c(true);
            this.ak.b(true);
        }
    }

    @Override // com.tsf.shell.f.f.g
    public void W() {
        super.W();
        bk();
        az();
    }

    public void aO() {
    }
}
