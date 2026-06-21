package com.tsf.shell.f.f;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VPage;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.f.f.PageAnimationState;
import com.tsf.shell.f.i.MultiSelectController;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspacePage extends com.censivn.C3DEngine.b.f.BaseRenderable implements WindowManager.a, MultiSelectController.InterfaceC0113a {
    public static com.tsf.shell.f.a.a.GlTextureBinding f;
    public static com.censivn.C3DEngine.b.f.IRenderable i;
    private static com.censivn.C3DEngine.b.f.GridRenderable r;
    private int MultiSelectController;
    private PageAnimationState.a I;
    private com.tsf.shell.f._d.e.a.DashEffectData J;
    private com.censivn.C3DEngine.b.g._b.ITweenTarget L;
    protected WorkspacePage a;
    protected com.tsf.shell.e.CellLayout b;
    protected com.tsf.shell.f.e.f.EditModeNode c;
    protected com.tsf.shell.f.i.MultiSelectController h;
    protected PageTransitionEffect k;
    private com.censivn.C3DEngine.b.f.GridRenderable q;
    private com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable s;
    private com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable t;
    private com.censivn.C3DEngine.b.d.MouseEventListener v;
    private com.censivn.C3DEngine.b.d.MouseEventListener w;
    private WorkspacePage x;
    private WorkspacePage y;
    private int z;
    private static TextureElement m = null;
    private static TextureElement n = null;
    private static TextureElement o = null;
    private static TextureElement p = null;
    public static int d = 0;
    public static int e = 0;
    private TextureElement l = null;
    public float g = 0.0f;
    private boolean B = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean K = false;
    private float M = 255.0f;
    private boolean N = true;
    boolean j = true;
    private boolean O = false;
    private boolean P = false;
    private ArrayList<MultiSelectController> C = new ArrayList<>();
    private VPage u = new VPage();

    public interface a {
        void a();

        void b();
    }

    public WorkspacePage() {
        this.u.vTarget = this;
        this.L = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
        this.a = this;
        com.tsf.shell.manager.app.ObserverManager.a(this);
    }

    public boolean c() {
        return this.G;
    }

    public void d() {
        com.tsf.shell.manager.app.StateHub.ItemTransitionManager.a(this);
    }

    public void e() {
        com.tsf.shell.manager.app.StateHub.ItemTransitionManager.d();
    }

    public void f() {
        this.G = true;
    }

    public void g() {
        this.G = false;
    }

    public PageAnimationState.a a(com.tsf.shell.f._d.e.a.DashEffectData bVar, com.censivn.C3DEngine.b.f.IRenderable iVar, boolean z) {
        this.H = true;
        mouseEnabled(false);
        i = iVar;
        this.J = bVar;
        PageAnimationState.a aVarA = a(z, false);
        this.I = aVarA;
        if (z) {
            com.tsf.shell.manager.app.LauncherAppInfo.g().visible(false);
        }
        return aVarA;
    }

    public void h() {
        this.H = false;
        mouseEnabled(true);
        com.tsf.shell.manager.app.LauncherAppInfo.g().visible(true);
        if (this.I != null) {
            this.I.a = null;
        }
        this.J = null;
    }

    private void a() {
        this.J.a(this);
    }

    public void i() {
        this.K = true;
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void dispatchDraw() {
        if (this.K) {
            this.K = false;
            return;
        }
        if (visible()) {
            if (this.H) {
                MatrixStack.glPushMatrix();
                draw();
                MatrixStack.glColor(alpha(), getDefaultColor());
                ItemPageTransition.dispatchDraw();
                MatrixStack.glPopMatrix();
                return;
            }
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int iNumChildren = numChildren();
                for (int i2 = 0; i2 < iNumChildren; i2++) {
                    com.censivn.C3DEngine.b.f.IRenderable childAt = getChildAt(i2);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }

    public PageAnimationState.a j() {
        return a(false, false);
    }

    public PageAnimationState.a a(boolean z, boolean z2) {
        PageAnimationState.a aVarC = PageAnimationState.c(this);
        if (aVarC.a != this || z2) {
            aVarC.a = this;
            Number3d number3dClone = position().m4clone();
            h.MultiSelectController.visible(false);
            position().setAll(0.0f, 0.0f, 0.0f);
            com.tsf.shell.manager.app.TextureCache.b(PageAnimationState.c(), aVarC.b);
            if (z) {
                com.tsf.shell.manager.app.LauncherAppInfo.a(this);
            }
            boolean zVisible = this.TransitionManager.visible();
            this.TransitionManager.visible(true);
            this.TransitionManager.dispatchDraw();
            this.TransitionManager.visible(Boolean.valueOf(zVisible));
            com.tsf.shell.manager.app.TextureCache.b();
            position().setAllFrom(number3dClone);
            h.MultiSelectController.visible(true);
        }
        return aVarC;
    }

    public void k() {
        com.tsf.shell.manager.app.ObserverManager.a(this);
    }

    public VPage l() {
        return this.u;
    }

    public void a(com.censivn.C3DEngine.b.d.MouseEventListener aVar) {
        this.v = aVar;
    }

    public void b(com.censivn.C3DEngine.b.d.MouseEventListener aVar) {
        this.w = aVar;
    }

    public com.tsf.shell.f.i.MultiSelectController m() {
        return this.h;
    }

    public com.censivn.C3DEngine.b.f.IRenderable n() {
        return this.s;
    }

    public void o() {
        this.s.setMouseEventListener(this.v);
    }

    public void p() {
        this.s.setMouseEventListener(this.w);
    }

    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.f.GridRenderable kVarB = com.tsf.shell.manager.app.StateHub.i().b();
            kVarB.removeFromParent();
            addChild(kVarB);
        } else {
            com.tsf.shell.manager.app.StateHub.i().b().removeFromParent();
        }
        this.B = z;
    }

    public boolean q() {
        return this.B;
    }

    public void a(int i2) {
        this.A = i2;
    }

    public int r() {
        return this.A;
    }

    public com.tsf.shell.e.CellLayout s() {
        return this.b;
    }

    public void b(int i2) {
        this.z = i2;
    }

    public int t() {
        return this.z;
    }

    public void a(Number3d number3d) {
        if (PageConfig.c() && this.PageContentType.a(this, h.a)) {
            h.MultiSelectController.position().setAllFrom(number3d);
            h.MultiSelectController.dispatchDraw();
            h.MultiSelectController.position().reset();
        }
    }

    public void u() {
        if (PageConfig.c() && this.PageContentType.a(this, h.a)) {
            h.MultiSelectController.dispatchDraw();
        }
    }

    private void aj() {
        this.c = new com.tsf.shell.f.e.TransitionRenderer.EditModeNode() { // from class: com.tsf.shell.f.f.WorkspacePage.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (WorkspacePage.this.g != 0.0f && WorkspacePage.this.k != null) {
                    WorkspacePage.this.u();
                }
            }

            @Override // com.tsf.shell.f.e.f.EditModeNode
            public void a(com.tsf.shell.f.i.ShortcutItem cVar) {
                if (cVar instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                    com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.a(cVar, null, null);
                } else {
                    com.tsf.shell.manager.r.c.WidgetDeleteAnimationUtil.a(cVar, (Runnable) null);
                }
            }

            @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
            public void addChild(com.censivn.C3DEngine.b.f.IRenderable iVar) {
                super.addChild(iVar);
                WorkspacePage.this.PageConfig.a(iVar);
            }
        };
        this.h = new com.tsf.shell.f.ItemPageTransition.MultiSelectController(this, this) { // from class: com.tsf.shell.f.f.WorkspacePage.2
            @Override // com.tsf.shell.f.i.MultiSelectController
            public void b(com.tsf.shell.f.i.PageItem bVar) {
                WorkspacePage.this.N();
            }
        };
        addChild(this.c);
    }

    @Override // com.tsf.shell.f.i.MultiSelectController.InterfaceC0113a
    public ArrayList<com.censivn.C3DEngine.b.f.IRenderable> b() {
        return this.TransitionManager.children();
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void destroy() {
        com.tsf.shell.manager.app.ObserverManager.b(this);
        l();
        this.PageConfig.c();
        this.C.clear();
        if (this.l != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.l);
            this.l = null;
            this.q.textures().removeAll();
        }
        if (this instanceof k) {
            ((PageContentType) this).aj();
        }
    }

    public void v() {
        for (com.censivn.C3DEngine.b.f.IRenderable iVar : (ArrayList) this.TransitionManager.children().clone()) {
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                com.tsf.shell.manager.app.WidgetManager.a((com.tsf.shell.f.i.PageItem) iVar);
            }
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.s.b(n.a, PageTouchHandler.b);
        r.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
        this.q.a(com.censivn.C3DEngine.b.b.ScreenConstants.F);
        this.q.b(com.censivn.C3DEngine.b.b.ScreenConstants.G);
        this.t.b(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
        for (com.censivn.C3DEngine.b.f.IRenderable iVar : this.TransitionManager.children()) {
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) iVar;
                bVar.a(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
                bVar.ac();
            }
        }
        if (this.H) {
            l();
        }
    }

    public static void w() {
        ThemeDescription theme = ThemeManager.mix.page.getTheme();
        Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
        o = com.censivn.C3DEngine.C3DEngine.g().a(o, bitmap, true);
        bitmap.recycle();
        Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
        m = com.censivn.C3DEngine.C3DEngine.g().a(m, bitmap2, true);
        bitmap2.recycle();
        Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
        n = com.censivn.C3DEngine.C3DEngine.g().a(n, bitmap3, true);
        bitmap3.recycle();
        Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, com.tsf.shell.manager.g.LayoutDimensionConstants.f, com.tsf.shell.manager.g.LayoutDimensionConstants.f);
        p = com.censivn.C3DEngine.C3DEngine.g().a(p, bitmap4, true);
        bitmap4.recycle();
    }

    public void x() {
        if (!this.F) {
            this.F = true;
            aj();
            this.s = new com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable(n.a, PageTouchHandler.b, new com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds(50, 78, 50, 78, 128.0f, 128.0f));
            this.t = new com.censivn.C3DEngine.b.f.ninepatch.NinePatchRenderable(n.a, PageTouchHandler.b, new com.censivn.C3DEngine.b.f.ninepatch.NinePatchBounds(4.0f, 124.0f, 4.0f, 124.0f, 128.0f, 128.0f));
            this.t.b(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
            this.t.doubleSidedEnabled(true);
            this.t.position().z = (-200.0f) * com.censivn.C3DEngine.b.b.ScreenConstants.b;
            ThemeDescription theme = ThemeManager.mix.page.getTheme();
            if (o == null) {
                Bitmap bitmap = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_BACKGROUND);
                o = com.censivn.C3DEngine.C3DEngine.g().a(bitmap, true);
                bitmap.recycle();
            }
            this.t.textures().addElement(o);
            if (m == null) {
                Bitmap bitmap2 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_UNSELECT);
                m = com.censivn.C3DEngine.C3DEngine.g().a(bitmap2, true);
                bitmap2.recycle();
            }
            if (n == null) {
                Bitmap bitmap3 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_SELECT);
                n = com.censivn.C3DEngine.C3DEngine.g().a(bitmap3, true);
                bitmap3.recycle();
            }
            if (p == null) {
                Bitmap bitmap4 = theme.getBitmap(ThemeShellDescription.PAGE_PREVIEW_HOMEPAGE_MARK, com.tsf.shell.manager.g.LayoutDimensionConstants.f, com.tsf.shell.manager.g.LayoutDimensionConstants.f);
                p = com.censivn.C3DEngine.C3DEngine.g().a(bitmap4, true);
                bitmap4.recycle();
            }
            if (r == null) {
                r = new com.censivn.C3DEngine.b.TransitionRenderer.GridRenderable(com.tsf.shell.manager.g.LayoutDimensionConstants.f, com.tsf.shell.manager.g.LayoutDimensionConstants.f, false);
                r.textures().addElement(p);
                r.position().y = ((-n.b) / 2) + (80.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c);
            }
            this.s.textures().addElement(m);
            this.q = new com.censivn.C3DEngine.b.TransitionRenderer.GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G, 1, 1, false);
            this.q.uvs().set(0, 1.0f, 0.0f);
            this.q.uvs().set(1, 0.0f, 0.0f);
            this.q.uvs().set(2, 1.0f, 1.0f);
            this.q.uvs().set(3, 0.0f, 1.0f);
            addChild(this.q);
        }
        if (this instanceof k) {
            ((PageContentType) this).a();
        }
    }

    public static void y() {
        if (f != null) {
            com.tsf.shell.manager.app.TextureCache.a(TransitionRenderer);
        }
        if (n.a > n.b) {
            d = (int) (0.4f * com.censivn.C3DEngine.b.b.ScreenConstants.F);
            e = (n.b * d) / n.a;
        } else {
            e = (int) (0.4f * com.censivn.C3DEngine.b.b.ScreenConstants.G);
            d = (n.a * e) / n.b;
        }
        f = com.tsf.shell.manager.app.TextureCache.a(d, WindowManager);
    }

    public void b(boolean z) {
        if (visible()) {
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            if (z) {
                this.t.dispatchDraw();
                this.q.dispatchDraw();
            } else {
                this.q.dispatchDraw();
                this.t.dispatchDraw();
            }
            MatrixStack.glPopMatrix();
        }
    }

    public void z() {
    }

    public void A() {
        this.M = this.t.alpha();
    }

    public float B() {
        return this.M;
    }

    public void a(float f2) {
        this.t.alpha(f2);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void killFocus() {
        F();
        com.tsf.shell.manager.app.StateHub.r().b(this, this.L);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void setFocus() {
        E();
        com.tsf.shell.manager.app.StateHub.r().a(this, this.L);
    }

    public void C() {
        r.removeFromParent();
        addChild(r);
    }

    public void D() {
        r.removeFromParent();
    }

    public void E() {
        this.s.textures().clear();
        this.s.textures().addElement(n);
        setZOrderOnTop();
    }

    public void F() {
        this.s.textures().clear();
        this.s.textures().addElement(m);
    }

    public void c(boolean z) {
        this.s.removeFromParent();
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 500, dVar);
            return;
        }
        this.q.scale().x = 1.0f;
        this.q.scale().y = 1.0f;
    }

    public void G() {
        c(true);
    }

    public void H() {
        this.s.removeFromParent();
    }

    public void I() {
        if (this.s.parent() == null) {
            addChildAt(this.s, 0);
        }
    }

    public void d(boolean z) {
        I();
        this.q.scale().setAll(1.0f, 1.0f, 1.0f);
        L();
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
            dVar.l(0.28f);
            dVar.m(0.28f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.q, 500, dVar);
            return;
        }
        this.q.scale().x = 0.28f;
        this.q.scale().y = 0.28f;
    }

    public com.censivn.C3DEngine.b.f.IRenderable J() {
        return this.q;
    }

    public void e(boolean z) {
        this.q.doubleSidedEnabled(z);
    }

    public void K() {
        this.N = true;
        this.TransitionManager.visible(false);
        ab();
        if (this.l == null) {
            this.q.visible(false);
        } else {
            this.q.visible(true);
        }
    }

    public void L() {
        if (!this.N) {
            this.N = true;
            this.TransitionManager.visible(false);
            ab();
            P();
            if (this.l == null) {
                this.q.visible(false);
                return;
            } else {
                this.q.visible(true);
                return;
            }
        }
        if (this.l != null && !this.q.visible()) {
            this.q.visible(true);
        }
    }

    public void M() {
        if (this.N) {
            this.N = false;
            ac();
            this.q.visible(false);
            this.TransitionManager.visible(true);
        }
    }

    public void N() {
        this.D = true;
    }

    public void O() {
        if (this.D) {
            P();
        }
    }

    public void P() {
        if (Q() == 0 && t() != -1) {
            if (this.l != null) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.l);
                this.l = null;
                this.q.textures().clear();
            }
            this.D = false;
            return;
        }
        Number3d number3dClone = position().m4clone();
        position().setAll(0.0f, 0.0f, 0.0f);
        if (this.l == null || this.l.width != d || this.l.height != e) {
            if (this.l != null) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.l);
                this.l = null;
                this.q.textures().clear();
            }
            this.l = com.censivn.C3DEngine.C3DEngine.g().a(d, WindowManager, false);
            this.q.textures().addElement(this.l);
        }
        com.tsf.shell.manager.app.TextureCache.b(f, this.l);
        GLES20.glViewport(0, 0, ItemTransitionManager, WindowManager);
        boolean zVisible = this.TransitionManager.visible();
        this.TransitionManager.visible(true);
        this.TransitionManager.drawQuietly();
        this.TransitionManager.visible(Boolean.valueOf(zVisible));
        com.tsf.shell.manager.app.TextureCache.b();
        GLES20.glViewport(0, 0, com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
        position().setAllFrom(number3dClone);
        this.D = false;
    }

    public void a(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (iVar instanceof com.tsf.shell.f.i.PageItem) {
            com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) iVar;
            bVar.a(m());
            if (bVar.K() != null) {
                bVar.K().screen = this.z;
                bVar.K().updateContainer(null, -1);
            }
        }
        this.TransitionManager.addChild(iVar);
        N();
    }

    public void a(com.censivn.C3DEngine.b.f.IRenderable iVar, int i2) {
        if (iVar instanceof com.tsf.shell.f.i.PageItem) {
            com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) iVar;
            bVar.a(m());
            if (bVar.K() != null) {
                bVar.K().screen = this.z;
            }
        }
        this.TransitionManager.addChildAt(iVar, i2);
        N();
    }

    public void b(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        if (this.TransitionManager.children().contains(iVar)) {
            this.TransitionManager.removeChild(iVar);
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                ((com.tsf.shell.f.i.PageItem) iVar).B();
            }
            N();
        }
    }

    public boolean c(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        return this.TransitionManager.children().contains(iVar);
    }

    public int Q() {
        int i2 = 0;
        Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = this.TransitionManager.children().iterator();
        while (true) {
            int i3 = i2;
            if (it.hasNext()) {
                i2 = it.next() instanceof com.tsf.shell.f.i.PageItem ? i3 + 1 : i3;
            } else {
                return i3;
            }
        }
    }

    public ArrayList<com.censivn.C3DEngine.b.f.IRenderable> R() {
        return this.TransitionManager.children();
    }

    public int d(com.censivn.C3DEngine.b.f.IRenderable iVar) {
        return this.TransitionManager.getChildIndexOf(iVar);
    }

    public com.censivn.C3DEngine.b.f.BaseRenderable S() {
        return this.c;
    }

    public void T() {
        this.O = false;
        if (!this.O && !this.P && this.j) {
            aa();
        }
    }

    public void U() {
        this.O = true;
        if (!this.j) {
            Z();
        }
    }

    public void V() {
        this.P = true;
        if (!this.j) {
            Z();
        }
    }

    public void W() {
        this.P = false;
        if (!this.O && !this.P && this.j) {
            aa();
        }
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return (com.tsf.shell.manager.app.v.FlagHelper.C0126a.h().a() && this.j) ? false : true;
    }

    public void Z() {
        this.j = true;
        if (com.tsf.shell.manager.app.v.FlagHelper.C0126a.h().a() || t() == -1) {
            ab();
        }
        if (this.G) {
            l();
        }
        if (this.b != null) {
            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.f.WorkspacePage.3
                @Override // java.lang.Runnable
                public void run() {
                    if (WorkspacePage.this.j) {
                        WorkspacePage.this.PageRenderBuffer.a();
                    } else {
                        WorkspacePage.this.PageRenderBuffer.b();
                    }
                }
            });
        }
    }

    public void aa() {
        this.j = false;
        if (com.tsf.shell.manager.app.v.FlagHelper.C0126a.h().a() || t() == -1) {
            ac();
        }
        this.g = 0.0f;
        if (this.b != null) {
            com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.f.WorkspacePage.4
                @Override // java.lang.Runnable
                public void run() {
                    if (WorkspacePage.this.j) {
                        WorkspacePage.this.PageRenderBuffer.a();
                    } else {
                        WorkspacePage.this.PageRenderBuffer.b();
                    }
                }
            });
        }
    }

    public void ab() {
        if (!this.E) {
            this.E = true;
            mouseEnabled(false);
            Iterator<MultiSelectController> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void ac() {
        if (this.E) {
            this.E = false;
            mouseEnabled(true);
            Iterator<MultiSelectController> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public boolean ad() {
        return this.E;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (com.tsf.shell.manager.app.v.ObjectHelper.PageRenderBuffer.a()) {
            for (com.censivn.C3DEngine.b.f.IRenderable iVar : R()) {
                if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                    com.tsf.shell.manager.app.v.ObjectHelper.PageRenderBuffer.a((com.tsf.shell.f.i.PageItem) iVar);
                }
            }
        }
    }

    public void ae() {
        for (com.censivn.C3DEngine.b.f.IRenderable iVar : R()) {
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                ((com.tsf.shell.f.i.PageItem) iVar).y();
            }
        }
    }

    private void a(float f2, l lVar) {
        if (this.k != lVar) {
            this.k = lVar;
            ai();
        }
        this.PageContentType.a(this, f2);
    }

    public void af() {
        if (this.k != null) {
            this.PageContentType.b(this, this.g);
        }
    }

    public void a(WorkspacePage gVar) {
        this.y = gVar;
    }

    public WorkspacePage ag() {
        return this.y;
    }

    public void b(WorkspacePage gVar) {
        this.x = gVar;
    }

    public WorkspacePage ah() {
        return this.x;
    }

    public void f(boolean z) {
        if (z) {
            if (parent() == null) {
                com.tsf.shell.manager.app.StateHub.u().addChild(this);
                M();
                this.s.removeFromParent();
                return;
            }
            return;
        }
        if (parent() != null) {
            ae();
            removeFromParent();
            L();
            I();
            ai();
        }
    }

    public void ai() {
        Number3d number3dScale = scale();
        scale().y = 1.0f;
        number3dScale.x = 1.0f;
        rotation().x = 0.0f;
        rotation().y = 0.0f;
        rotation().z = 0.0f;
        position().z = 0.0f;
        position().y = 0.0f;
        position().x = 0.0f;
    }

    public void a(PageTransitionEffect lVar) {
        a(this, 0.0f, true, true, lVar);
    }

    public void a(WorkspacePage gVar, float f2, boolean z, boolean z2, l lVar) {
        if (this.g * f2 < 0.0f) {
            if (f2 < 0.0f) {
                if (this.y != null && this.y != gVar) {
                    this.y.f(false);
                }
            } else if (this.x != null && this.x != gVar) {
                this.x.f(false);
            }
        }
        this.g = f2;
        if (f2 < 1.0f && f2 > -1.0f) {
            f(true);
            a(f2, lVar);
        } else {
            f(false);
        }
        if (z && this.x != null && this.x != gVar) {
            this.x.a(gVar, f2 + 1.0f, true, false, lVar);
        }
        if (z2 && this.y != null && this.y != gVar) {
            this.y.a(gVar, f2 - 1.0f, false, true, lVar);
        }
    }

    public void a(Runnable runnable, float f2) {
        a(com.tsf.shell.manager.app.v.SimpleHelper.b(), runnable, f2);
    }

    public void a(com.tsf.shell.f._d.e.a.DashEffectData bVar, Runnable runnable, float f2) {
        if (this instanceof com.tsf.shell.f.f.a.FolderPage) {
            if (bVar.a()) {
                bVar.a(this, f2, ((com.tsf.shell.f.f.a.FolderPage) this).ap().children(), runnable);
                return;
            } else {
                ((com.tsf.shell.f.f.a.FolderPage) this).c(runnable, true);
                return;
            }
        }
        bVar.a(this, f2, this.TransitionManager.children(), runnable);
    }

    public void a(Runnable runnable, boolean z) {
        a(com.tsf.shell.manager.app.v.SimpleHelper.b(), runnable, z);
    }

    public void a(com.tsf.shell.f._d.e.a.DashEffectData bVar, final Runnable runnable, boolean z) {
        Runnable runnable2 = new Runnable() { // from class: com.tsf.shell.f.f.WorkspacePage.5
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        if (this instanceof com.tsf.shell.f.f.a.FolderPage) {
            if (bVar.a()) {
                bVar.a(this, ((com.tsf.shell.f.f.a.FolderPage) this).ap().children(), runnable2, z);
                return;
            } else {
                ((com.tsf.shell.f.f.a.FolderPage) this).b(runnable2, z);
                return;
            }
        }
        bVar.a(this, this.TransitionManager.children(), runnable2, z);
    }
}
