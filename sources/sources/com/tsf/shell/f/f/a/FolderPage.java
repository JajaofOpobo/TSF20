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
import com.censivn.C3DEngine.b.g.A;
// import com.tsf.shell.f.f.a.PageContainerBase;
import com.tsf.shell.f.f.a.b.DrawerTransitionManager;
import com.tsf.shell.f.f.PageTouchHandler;
import com.tsf.shell.manager.app.AppListModel;
import com.tsf.shell.manager.app.FolderManager;
import com.tsf.shell.manager.n.ToastOverlayController;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;
import com.tsf.shell.f.f.a.PageContainerView0133a;
import com.tsf.shell.f.f.a.InterfaceC0101a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderPage extends com.tsf.shell.f.f.WorkspacePage implements b.a, InterfaceC0101a, c.a, d.a {
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
    public com.tsf.shell.f.i.b.e.DrawerItemButton G;
    public k H;
    protected C0133a I;
    private j K;
    private j L;
    private a M;
    private a N;
    private com.tsf.shell.f.f.a._a.DrawerItemContainer O;
    private int P;
    private com.tsf.shell.f.e.PageIndicatorStrip T;
    private com.tsf.shell.f.f.a.d.DrawerSortManager U;
    private FolderManager V;
    private ArrayList<a> W;
    private l X;
    private j Y;
    private com.censivn.C3DEngine.b.g.d Z;
    private com.censivn.C3DEngine.b.g.d aa;
    private com.censivn.C3DEngine.b.g._b.b ab;
    private com.censivn.C3DEngine.b.d.a ad;
    private com.censivn.C3DEngine.b.d.a ae;
    private Runnable af;
    private float ag;
    private f ai;
    private g aj;
    private e ak;
    private B al;
    private C0133a ao;
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

    public i a(com.tsf.shell.f.i.PageItem bVar) {
        i iVar;
        if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar2 = (com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar;
            if (this.G == null) {
                this.G = new com.tsf.shell.f.i.b.e.DrawerItemButton();
            }
            this.G.k.textures().clear();
            if (bVar2.aC() && !bVar2.t()) {
                this.G.k.textures().addElement(bVar2.k.textures().get(0).textureElement);
            }
            iVar = this.G;
        } else {
            TextureElement textureElementAD = ((com.tsf.shell.f.i.b.d.FolderShortcutItem) bVar).aD();
            if (this.H == null) {
                this.H = com.tsf.shell.f.i.b.d.FolderShortcutItem.l();
            }
            this.H.a(textureElementAD.width);
            this.H.b(textureElementAD.height);
            this.H.textures().addElement(textureElementAD);
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
        if (iVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) iVar).k.textures().clear();
        } else {
            ((k) iVar).textures().clear();
        }
        iVar.removeFromParent();
    }

    public boolean aj() {
        if (this.an) {
            return false;
        }
        com.tsf.shell.manager.action.GestureHandler.b();
        this.aj.b(true);
        this.ak.a(true);
        this.an = true;
        com.tsf.shell.manager.app.AppListModel.c(this);
        com.censivn.C3DEngine.b.c.b.a(this);
        aP();
        aR();
        this.ai.j();
        am().d();
        return true;
    }

    public boolean c(int i) {
        boolean zAj = aj();
        this.ai.a(i);
        return zAj;
    }

    public void ak() {
        if (this.an && this.ai.l()) {
            com.tsf.shell.manager.action.GestureHandler.c();
            this.aj.c(true);
            this.ak.b(true);
            com.censivn.C3DEngine.b.c.b.b(this);
            this.an = false;
            com.tsf.shell.manager.app.AppListModel.b(this);
            aQ();
            aS();
            this.ai.k();
        }
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, boolean z2, float f, float f2) {
        if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
            com.tsf.shell.manager.app.WidgetAnimator.a(bVar, f, f2, z2, 3);
        } else {
            com.tsf.shell.manager.app.WidgetAnimator.a(bVar, f, f2, z2, 3, 5);
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.FolderPage.1
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
        this.ao = com.tsf.shell.manager.app.Notifier.a(this.ao, x.c(b.i.text_app_drawer_setting));
    }

    private void aS() {
        com.tsf.shell.manager.app.Notifier.b(this.ao);
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

    public FolderPage() {
        com.tsf.shell.manager.app.ServiceProvider.c().a(this);
        this.al = com.tsf.shell.manager.app.ServiceProvider.d();
        this.U = com.tsf.shell.manager.app.ServiceProvider.b();
        this.V = new AppClassifier();
        com.tsf.shell.manager.app.ServiceProvider.a().a(this);
        this.O = new com.tsf.shell.f.f.a._a.DrawerItemContainer();
    }

    public void al() {
        this.O.f();
    }

    public FolderManager c() {
        return this.V;
    }

    public com.tsf.shell.f.f.a.d.DrawerSortManager an() {
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

    @Override // com.tsf.shell.f.f.WorkspacePage, com.censivn.C3DEngine.b.c.e.a
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
        t = (int) (com.censivn.C3DEngine.b.b.A.c * 35.0f);
        u = (int) (com.censivn.C3DEngine.b.b.A.c * 35.0f);
        r = com.tsf.shell.manager.b.ConfigManager.Q() ? (int) (150.0f * com.censivn.C3DEngine.b.b.A.c) : (int) (com.censivn.C3DEngine.b.b.A.c * 35.0f);
        s = com.tsf.shell.manager.b.ConfigManager.R() ? com.censivn.C3DEngine.b.b.A.g + (com.censivn.C3DEngine.b.b.A.h * 1) : com.censivn.C3DEngine.b.b.A.h * 2;
        n = (int) (com.tsf.shell.manager.o.ButtonPresetManager.a.T + (10.0f * com.censivn.C3DEngine.b.b.A.c));
        o = (int) (com.tsf.shell.manager.o.ButtonPresetManager.a.U + (20.0f * com.censivn.C3DEngine.b.b.A.c));
        float f = (com.censivn.C3DEngine.b.b.A.E - F) - (com.censivn.C3DEngine.b.b.A.h * 2.0f);
        if (com.tsf.shell.manager.app.ObserverManager.c()) {
            f -= com.censivn.C3DEngine.b.b.A.J;
        }
        v = f / ((com.censivn.C3DEngine.b.b.A.E - r) - s);
        float f2 = (com.censivn.C3DEngine.b.b.A.E / 2.0f) - (((com.censivn.C3DEngine.b.b.A.E / 2.0f) - s) * v);
        if (f2 < F) {
            w = (F - f2) + com.censivn.C3DEngine.b.b.A.h;
        } else {
            w = com.censivn.C3DEngine.b.b.A.h;
        }
        int i = ((((com.censivn.C3DEngine.b.b.A.D - t) - u) - com.tsf.shell.manager.o.ButtonPresetManager.a.T) / n) + 1;
        int i2 = ((((com.censivn.C3DEngine.b.b.A.E - r) - s) - com.tsf.shell.manager.o.ButtonPresetManager.a.U) / o) + 1;
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
        if (com.tsf.shell.manager.b.ConfigManager.W()) {
            b(B, C);
        } else if (com.censivn.C3DEngine.b.b.A.O) {
            b(com.tsf.shell.manager.b.ConfigManager.T(), com.tsf.shell.manager.b.ConfigManager.S());
        } else {
            b(com.tsf.shell.manager.b.ConfigManager.V(), com.tsf.shell.manager.b.ConfigManager.U());
        }
        if (this.aq != null) {
            this.aq.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.A.c);
        }
        if (this.T != null) {
            this.T.position().x = 0.0f;
            this.T.position().y = (com.censivn.C3DEngine.b.b.A.C + s) - com.censivn.C3DEngine.b.b.A.h;
        }
        if (this.Y != null) {
            this.Y.setAABBPX(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, 0.0f, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B, 0.0f);
        }
        if (this.aj != null) {
            this.aj.a(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B);
        }
        if (this.ak != null) {
            this.ak.a(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B);
        }
        if (this.ai != null) {
            this.ai.a(com.censivn.C3DEngine.b.b.A.z, com.censivn.C3DEngine.b.b.A.C, com.censivn.C3DEngine.b.b.A.A, com.censivn.C3DEngine.b.b.A.B);
        }
        if (this.an) {
            com.censivn.C3DEngine.b.g.c.a(this.K);
            this.K.scale().setAll(v, v, 1.0f);
            this.K.position().y = w;
        }
    }

    public void at() {
        if (com.tsf.shell.manager.b.ConfigManager.R()) {
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
            com.tsf.shell.manager.b.ConfigManager.n(true);
            ar();
        }
        this.aj.a(true);
    }

    public void c(boolean z2, final boolean z3) {
        this.ak.a(z2, new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.7
            @Override // java.lang.Runnable
            public void run() {
                h.this.ak.visible(false);
                if (z3) {
                    h.this.ar();
                }
            }
        });
        if (z3) {
            com.tsf.shell.manager.b.ConfigManager.n(false);
        }
        this.aj.a(true);
    }

    public void g(boolean z2) {
        this.aj.visible(true);
        if (z2) {
            com.tsf.shell.manager.b.ConfigManager.m(true);
            ar();
        }
    }

    public void h(boolean z2) {
        this.aj.visible(false);
        if (z2) {
            com.tsf.shell.manager.b.ConfigManager.m(false);
            ar();
        }
    }

    public void au() {
        this.R = false;
        this.Q = true;
        com.tsf.shell.d.ShellDataParser().a("PageApplication");
        invalidate();
        setAnimationObjectState(true);
        if (this.M != null) {
            this.M.m();
        }
        com.tsf.shell.manager.app.v.StateAccessor.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aU() {
        com.tsf.shell.d.ShellDataParser().b("PageApplication");
        this.R = true;
        N();
        this.X.f();
        bd();
        setAnimationObjectState(false);
        if (this.af != null) {
            this.af.run();
            this.af = null;
        }
        com.tsf.shell.manager.app.v.StateAccessor.e();
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
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) com.censivn.C3DEngine.b.b.A.a(64.0f), (int) com.censivn.C3DEngine.b.b.A.a(64.0f));
        this.ar = com.censivn.C3DEngine.A.g().a(this.ar, bitmap, true);
        bitmap.recycle();
    }

    private void aW() {
        Bitmap bitmap = ThemeManager.mix.page.getTheme().getBitmap(ThemeShellDescription.PAGE_PREVIEW_DRAWER_MARK, (int) com.censivn.C3DEngine.b.b.A.a(64.0f), (int) com.censivn.C3DEngine.b.b.A.a(64.0f));
        this.ar = com.censivn.C3DEngine.A.g().a(this.ar, bitmap, true);
        bitmap.recycle();
        this.aq = com.censivn.C3DEngine.b.b.A.a(64.0f, 64.0f);
        this.aq.textures().addElement(this.ar);
    }

    public void aw() {
        this.aq.removeFromParent();
        addChild(this.aq);
    }

    public void ax() {
        this.aq.removeFromParent();
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public com.tsf.shell.f.i.MultiSelectController m() {
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

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void x() {
        boolean z2 = false;
        super.x();
        bf();
        bc();
        this.aj = new FolderRenameDialog(this);
        this.ak = new DragOverlayElement(this);
        if (!com.tsf.shell.manager.b.ConfigManager.Q()) {
            h(false);
        }
        if (!com.tsf.shell.manager.b.ConfigManager.R()) {
            c(false, false);
        }
        this.T = new com.tsf.shell.f.e.PageIndicatorStrip(z2) { // from class: com.tsf.shell.f.f.a.FolderPage.8
            @Override // com.tsf.shell.f.e.PageIndicatorStrip
            public void a() {
                h.this.at();
            }
        };
        this.T.mouseEnabled(false);
        this.P = com.censivn.C3DEngine.b.b.A.D;
        F = 350.0f * com.censivn.C3DEngine.b.b.A.c;
        this.Y = new j();
        this.Y.name(J);
        this.ae = new com.censivn.C3DEngine.b.d.a(this.Y);
        this.ad = f(this.Y);
        this.Y.setMouseEventListener(this.ad);
        this.Y.mouseEnabled(true);
        this.c.addChild(this.Y);
        this.K = new j();
        this.L = new j() { // from class: com.tsf.shell.f.f.a.FolderPage.9
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
                                return;
                            }
                            return;
                        }
                        if (f != 0.0f || Math.abs(h.this.M.a - f) >= 0.002d || Math.abs(rotation().x - h.this.ah) >= 0.002d) {
                            h.this.M.b(((f - h.this.M.a) * 0.15f) + h.this.M.a);
                            if (h.this.S) {
                                h.this.L.rotation().x += (h.this.ah - h.this.L.rotation().x) * 0.2f;
                                return;
                            }
                            return;
                        }
                        if (!h.this.R) {
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
        this.ai = new PageGridRenderer(this);
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
                a(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.10
                    @Override // java.lang.Runnable
                    public void run() {
                        h.this.bd();
                        h.this.be();
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
        this.ab = new com.censivn.C3DEngine.b.g._b.b();
        this.Z = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.FolderPage.11
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
        this.aa = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.FolderPage.12
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
        this.Z.a((com.censivn.C3DEngine.b.g.b) new PageElement.C0030a.b());
        this.aa.a((com.censivn.C3DEngine.b.g.b) new PageElement.C0030a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        com.tsf.shell.f.f.a.b.DrawerTransitionBase kVarH = this.X.h();
        for (A aVar : this.W) {
            aVar.a(0.0f);
            aVar.a(kVarH);
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

    @Override // com.tsf.shell.f.f.a.InterfaceC0101a
    public void a(A aVar) {
        this.N = aVar;
    }

    @Override // com.tsf.shell.f.f.a.InterfaceC0101a
    public a i_() {
        return bg();
    }

    @Override // com.tsf.shell.f.f.a.InterfaceC0101a
    public void j_() {
        if (!aL()) {
            aV();
        }
    }

    @Override // com.tsf.shell.f.f.a.InterfaceC0101a
    public void a(A aVar, A aVar2, A aVar3) {
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
                    aVar3.a((PageContainerBase) null);
                }
                aVar2.b((PageContainerBase) null);
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

    public com.tsf.shell.f.i.b.d.FolderShortcutItem b(ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList) {
        return a(x.c(b.i.widget_folder), ap(), arrayList);
    }

    private com.tsf.shell.f.i.b.d.FolderShortcutItem a(String str, A aVar, ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.f.i.b.d.FolderShortcutItem bVar = new com.tsf.shell.f.i.b.d.FolderShortcutItem(launcherDrawerFolder3DInfo);
        bVar.setMouseEventListener(f(bVar));
        aVar.addChildAt(bVar, 0);
        a(bVar, aVar, 0);
        bVar.c(arrayList);
        ao().c();
        bVar.aJ();
        return bVar;
    }

    public com.tsf.shell.f.i.b.d.FolderShortcutItem a(String str, ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> arrayList, boolean z2) {
        LauncherDrawerFolder3DInfo launcherDrawerFolder3DInfo = new LauncherDrawerFolder3DInfo(false);
        launcherDrawerFolder3DInfo.title = str;
        com.tsf.shell.f.i.b.d.FolderShortcutItem bVar = new com.tsf.shell.f.i.b.d.FolderShortcutItem(launcherDrawerFolder3DInfo);
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
            int iE = this.M.e();
            A aVarRemove = this.W.remove(0);
            float fAlpha = this.M.alpha();
            Iterator<a> it = this.W.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.W.clear();
            aVarRemove.children().clear();
            aVarRemove.a(0.0f);
            aVarRemove.a(0);
            aVarRemove.b((PageContainerBase) null);
            aVarRemove.a((PageContainerBase) null);
            aVarRemove.a(false);
            this.W.add(aVarRemove);
            int size = this.al.a().size() - 1;
            while (true) {
                int i = size;
                if (i <= -1) {
                    break;
                }
                com.tsf.shell.f.i.PageItem bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                    com.tsf.shell.f.i.b.d.FolderShortcutItem bVar2 = (com.tsf.shell.f.i.b.d.FolderShortcutItem) bVar;
                    if (bVar2.aS()) {
                        aVarRemove.addChildAt(bVar2.aA(), 0);
                    } else {
                        aVarRemove.addChildAt(bVar, 0);
                    }
                } else {
                    aVarRemove.addChildAt(bVar, 0);
                }
                size = i - 1;
            }
            int size2 = this.W.size() - 1;
            if (iE <= size2) {
                size2 = iE;
            }
            this.M = this.W.get(size2);
            this.M.a(true);
            this.M.a(0.0f);
            if (fAlpha != 255.0f) {
                this.M.alpha(fAlpha);
            }
            aY();
        }
    }

    public void aE() {
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.13
            @Override // java.lang.Runnable
            public void run() {
                h.this.b(h.B, h.C);
                h.this.aD();
            }
        });
    }

    public void a(final int i, final int i2) {
        com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.2
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
        n = (((com.censivn.C3DEngine.b.b.A.D - t) - u) - com.tsf.shell.manager.o.ButtonPresetManager.a.T) / (p - 1);
        o = (((com.censivn.C3DEngine.b.b.A.E - r) - s) - com.tsf.shell.manager.o.ButtonPresetManager.a.U) / (q - 1);
        if (E == null) {
            E = new ArrayList<>();
        } else {
            E.clear();
        }
        float f = (com.tsf.shell.manager.o.ButtonPresetManager.a.T / 2.0f) + com.censivn.C3DEngine.b.b.A.z + t;
        float f2 = (com.censivn.C3DEngine.b.b.A.B - r) - (com.tsf.shell.manager.o.ButtonPresetManager.a.U / 2.0f);
        for (int i3 = 0; i3 < m; i3++) {
            int i4 = i3 % p;
            int i5 = i3 / p;
            Number3d number3d = new Number3d();
            number3d.x = (i4 * n) + f;
            number3d.y = ((-i5) * o) + f2;
            E.add(number3d);
        }
        this.X.a(com.censivn.C3DEngine.b.b.A.D, com.censivn.C3DEngine.b.b.A.E, p, q, E);
    }

    private a bg() {
        int size = this.W.size();
        A aVar = new PageContainerBase(this.X.h(), this);
        aVar.a(size);
        this.W.add(aVar);
        this.L.addChild(aVar);
        aVar.a(1.0f);
        aVar.a(false);
        if (this.W.size() >= 3) {
            A aVar2 = this.W.get(0);
            aVar2.a(aVar);
            aVar.b(aVar2);
        }
        A aVar3 = this.W.get(size - 1);
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
        com.tsf.shell.d.ShellDataParser().a("PageApplication");
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
        com.tsf.shell.d.ShellDataParser().a("PageApplication");
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

    @Override // com.tsf.shell.manager.app.AppListModel.a
    public void a() {
    }

    @Override // com.tsf.shell.manager.app.AppListModel.a
    public void k_() {
        bh();
    }

    private void bh() {
        if (!this.am && com.tsf.shell.manager.app.ServiceProvider.a().b()) {
            com.tsf.shell.manager.app.ServiceProvider.c().c();
        }
    }

    public boolean aJ() {
        return this.am;
    }

    @Override // com.tsf.shell.manager.app.FolderManager.a
    public void a(ArrayList<com.tsf.shell.f.i.PageItem> arrayList) {
        A aVar;
        if (!this.am) {
            this.am = true;
            ArrayList arrayList2 = new ArrayList();
            ArrayList<com.tsf.shell.f.i.PageItem> arrayList3 = new ArrayList<>();
            for (com.tsf.shell.f.i.PageItem bVar : arrayList) {
                if ((bVar.K() == null || !(bVar.K() instanceof LauncherShortcutAppInfo)) ? false : ((LauncherShortcutAppInfo) bVar.K()).isHide) {
                    arrayList3.add(bVar);
                } else {
                    arrayList2.add(bVar);
                }
            }
            this.ai.d().a(arrayList3);
            int size = arrayList2.size();
            this.W = new ArrayList<>();
            int i = size / m;
            int i2 = (size % m != 0 || size == 0) ? i + 1 : i;
            for (int i3 = 0; i3 < i2; i3++) {
                A aVar2 = new PageContainerBase(this.X.h(), this);
                aVar2.a(i3);
                this.W.add(aVar2);
                this.L.addChild(aVar2);
                if (i3 != 0) {
                    aVar2.a(false);
                }
            }
            int i4 = 0;
            A aVar3 = i2 >= 3 ? this.W.get(i2 - 1) : null;
            while (i4 < i2) {
                A aVar4 = this.W.get(i4);
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
                a((com.tsf.shell.f.i.PageItem) arrayList2.get(i5), false, i5);
            }
            aK();
            az();
        }
    }

    public void aK() {
        new FolderManager(this.at) {
            {
                Iterator<Runnable> it = this.as.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                this.as.clear();
            }
        };
    }

    public int b(com.tsf.shell.f.i.PageItem bVar) {
        return this.U.a(this.al.a(), bVar);
    }

    public a e(int i) {
        int i2 = i / m;
        if (i2 >= this.W.size()) {
            return bg();
        }
        return this.W.get(i2);
    }

    @Override // com.tsf.shell.manager.app.AppListModel.a
    public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z2) {
        if (this.am) {
            a((com.tsf.shell.f.i.PageItem) gVar, z2);
        }
    }

    private void a(com.tsf.shell.f.i.PageItem bVar, boolean z2) {
        b(bVar, z2);
    }

    private void a(com.tsf.shell.f.i.PageItem bVar, boolean z2, int i) {
        b(bVar, z2, i);
    }

    private void b(com.tsf.shell.f.i.PageItem bVar, boolean z2) {
        b(bVar, z2, b(bVar));
    }

    private void b(com.tsf.shell.f.i.PageItem bVar, boolean z2, int i) {
        this.al.a(bVar, i);
        if (z2 && (bVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual)) {
            ((com.tsf.shell.f.i.b.e.DrawerItemVisual) bVar).aX();
        }
        e(i).a(bVar, i % m, false);
        bVar.K().index = i;
        bVar.a(this.h);
        this.h.a((i) bVar);
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, com.tsf.shell.f.i.PageItem bVar2) {
        this.al.a(bVar2, bVar);
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, A aVar, int i) {
        int iE = (aVar.e() * m) + i;
        this.al.b(bVar);
        this.al.a(bVar, iE);
    }

    public void c(com.tsf.shell.f.i.PageItem bVar) {
        this.al.b(bVar);
    }

    @Override // com.tsf.shell.manager.app.AppListModel.a
    public void a(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar) {
    }

    @Override // com.tsf.shell.manager.app.AppListModel.a
    public void b(com.tsf.shell.f.i.b.e.DrawerItemVisual gVar, boolean z2) {
        if (this.am) {
            A aVar = (PageContainerBase) gVar.parent();
            if (aVar != null) {
                aVar.removeChild(gVar);
            }
            ItemInfo itemInfoK = gVar.K();
            if (itemInfoK != null) {
                com.tsf.shell.manager.app.ServiceProvider.c().a(itemInfoK);
            }
            this.al.b(gVar);
        }
    }

    public boolean d(com.tsf.shell.f.i.PageItem bVar) {
        if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
            com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = (com.tsf.shell.f.i.b.e.DrawerItemVisual) bVar;
            if (gVar.bf()) {
                com.tsf.shell.manager.app.LauncherAppInfo fVarBd = gVar.bd();
                com.tsf.shell.manager.bind.ShellBindContext.c().b(fVarBd);
                ArrayList<com.tsf.shell.manager.app.LauncherAppInfo> arrayList = new ArrayList<>();
                arrayList.add(fVarBd);
                com.tsf.shell.manager.app.ServiceProvider.b(arrayList, false);
                e((com.tsf.shell.f.i.PageItem) gVar);
                return true;
            }
            if (gVar.be()) {
                this.I = com.tsf.shell.manager.app.Notifier.a(this.I, x.c(b.i.notic_uninstall_error), -52736, 2000);
                return false;
            }
            gVar.bg();
            return false;
        }
        if (!(bVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem)) {
            return false;
        }
        e(bVar);
        return false;
    }

    private void e(final com.tsf.shell.f.i.PageItem bVar) {
        bVar.mouseEnabled(false);
        bVar.p_();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.FolderPage.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.tsf.shell.manager.app.ServiceProvider.c().a(bVar.K());
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
        return new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.f.f.a.FolderPage.4
            private float b;
            private com.tsf.shell.f.i.PageItem d;
            private com.tsf.shell.f.i.a.PageItemDropHandler g;
            private boolean e = false;
            private boolean f = false;
            private boolean h = false;
            private float[] i = {0.0f, 0.0f};

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                h.this.as();
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.ShortcutItem) {
                        h.this.ai.e((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent);
                    }
                } else if (this.h) {
                    if (this.c instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
                        com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = (com.tsf.shell.f.i.b.e.DrawerItemVisual) this.c;
                        if (gVar.aC()) {
                            if (h.this.h.e()) {
                                gVar.ap();
                                return;
                            } else {
                                gVar.l();
                                return;
                            }
                        }
                        return;
                    }
                    if (this.c instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                        ((com.tsf.shell.f.i.b.d.FolderShortcutItem) this.c).aR();
                    }
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                h.this.as();
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.ShortcutItem) {
                        h.this.ai.c((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent);
                    }
                } else {
                    if (!h.this.aj()) {
                    }
                    c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (this.c instanceof com.tsf.shell.f.i.ShortcutItem) {
                    h.this.ai.d((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (h.this.an) {
                    if (this.c instanceof com.tsf.shell.f.i.ShortcutItem) {
                        h.this.ai.a((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent, motionEvent2);
                        return;
                    }
                    return;
                }
                if (this.e) {
                    x.a(motionEvent2, this.i);
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
                        com.tsf.shell.manager.app.StateHub.C();
                        return;
                    }
                }
                if (this.f && this.g != null) {
                    this.g.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.ShortcutItem)) {
                    h.this.ai.a((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent);
                }
                com.tsf.shell.manager.action.GestureHandler.a(motionEvent);
                this.h = h.this.R;
                h.this.Q = false;
                this.f = false;
                if (this.c instanceof com.tsf.shell.f.i.b.e.DrawerItemVisual) {
                    com.tsf.shell.f.i.b.e.DrawerItemVisual gVar = (com.tsf.shell.f.i.b.e.DrawerItemVisual) this.c;
                    if (gVar.aC()) {
                        gVar.aQ();
                        gVar.aY();
                        return;
                    }
                    return;
                }
                if (this.c instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(final MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.ShortcutItem)) {
                    h.this.ai.a((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent, motionEvent2, f, f2);
                }
                com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.censivn.C3DEngine.a.d.d().h() == this) {
                            if (!h.this.Q) {
                                h.this.au();
                                AnonymousClass4.this.b = h.this.ag = h.this.M.position().x;
                            }
                            h.this.ag = AnonymousClass4.this.b + (motionEvent2.getX() - motionEvent.getX());
                            if (h.this.S) {
                                float y2 = (float) (((double) ((motionEvent2.getY() - motionEvent.getY()) / (com.censivn.C3DEngine.b.b.A.G / 2))) * 1.3d);
                                h.this.ah = (y2 <= 1.0f ? y2 < -1.0f ? -1.0f : y2 : 1.0f) * 45.0f;
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
                if (h.this.M.a > 0.5d) {
                    h.this.aI();
                } else if (h.this.M.a < -0.5d) {
                    h.this.aH();
                }
                h.this.M.n();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.ShortcutItem)) {
                    h.this.ai.b((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent);
                }
                h.this.ah = 0.0f;
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (h.this.an && (this.c instanceof com.tsf.shell.f.i.ShortcutItem)) {
                    h.this.ai.b((com.tsf.shell.f.i.ShortcutItem) this.c, motionEvent, motionEvent2, f, f2);
                }
                h.this.Q = false;
                h.this.ag = 0.0f;
                if (!h.this.R && Math.abs(PageGridRenderer) > 100.0f) {
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

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void ab() {
        super.ab();
        if (this.M != null) {
            this.M.g();
        }
        if (!this.R) {
            com.tsf.shell.d.ShellDataParser().b("PageApplication");
        }
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void ac() {
        super.ac();
        if (this.M != null) {
            this.M.h();
        }
        if (!this.R) {
            com.tsf.shell.d.ShellDataParser().a("PageApplication");
        }
    }

    public boolean aL() {
        return this.R;
    }

    private void bi() {
        com.censivn.C3DEngine.A.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.5
            @Override // java.lang.Runnable
            public void run() {
                h.this.au = new FrameLayout(com.censivn.C3DEngine.A.d());
                ImageView imageView = new ImageView(com.censivn.C3DEngine.A.d());
                imageView.setImageResource(b.d.drawer_loading);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(500L);
                rotateAnimation.setRepeatCount(-1);
                imageView.setAnimation(rotateAnimation);
                rotateAnimation.startNow();
                h.this.au.addView(imageView, new FrameLayout.LayoutParams(com.censivn.C3DEngine.b.b.A.b(80.0f), com.censivn.C3DEngine.b.b.A.b(80.0f), 17));
                com.tsf.shell.manager.app.TaskScheduler.a(h.this.au, new ViewGroup.LayoutParams(-1, -1));
            }
        });
    }

    private void bj() {
        com.censivn.C3DEngine.A.a().a(new Runnable() { // from class: com.tsf.shell.f.f.a.FolderPage.6
            @Override // java.lang.Runnable
            public void run() {
                if (h.this.au != null) {
                    com.tsf.shell.manager.app.TaskScheduler.a(h.this.au);
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
                com.tsf.shell.f.i.PageItem bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
                    ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar).aA();
                }
            }
            bj();
            this.av = true;
        }
    }

    private void bk() {
        if (!aM()) {
            bi();
            A aVarAp = ap();
            int size = this.al.a().size();
            for (int i = 0; i < size; i++) {
                com.tsf.shell.f.i.PageItem bVar = this.al.a().get(i);
                if (bVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
                    ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) bVar).aA();
                }
            }
            if (!aVarAp.visible()) {
                com.tsf.shell.f.f.PageTransitionEffect lVarH = com.tsf.shell.manager.app.v.FlagHelper.b.h();
                lVarH.b((com.tsf.shell.f.f.WorkspacePage) this, false);
                lVarH.a((com.tsf.shell.f.f.WorkspacePage) this, true);
                aVarAp.a(true);
            }
            bj();
            this.av = true;
            this.T.d(true);
            this.aj.c(true);
            this.ak.b(true);
        }
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void W() {
        super.W();
        bk();
        az();
    }

    public void aO() {
    }
}
