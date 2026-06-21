package com.tsf.shell.f.f;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.c.WindowManager;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.PageEventDispatcher;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.theme.inside.mix.menu.DynamicTextureElement;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageTouchHandler implements KeyboardHandler.a, com.censivn.C3DEngine.b.c.WindowManager.a {
    public static int a;
    public static int b;
    public static float c;
    private Runnable A;
    private com.censivn.C3DEngine.b.f.BaseRenderable B;
    private Runnable C;
    private com.tsf.shell.f.g.a.GestureMenuOverlay D;
    private com.tsf.shell.manager.r.c.MultiSelectLinePicker E;
    private com.tsf.shell.f.f.d.ScrollStateAggregator F;
    private com.tsf.shell.f.i.PageItem J;
    private ArrayList<Integer> L;
    private Runnable M;
    public com.tsf.shell.f.f.c.WorkspaceShortcutTouchHandler d;
    private PageTouchHandler f;
    private com.tsf.shell.f.e.PageIndicatorStrip g;
    private com.censivn.C3DEngine.b.f.BaseRenderable h;
    private com.censivn.C3DEngine.b.f.SortedContainerRenderable i;
    private com.tsf.shell.f.f.a.FolderPage j;
    private ArrayList<WorkspacePage> k;
    private ArrayList<Integer> l;
    private WorkspacePage m;
    private int n;
    private com.tsf.shell.e.Workspace3D p;
    private WorkspacePage q;
    private WorkspacePage r;
    private int s;
    private Runnable u;
    private com.tsf.shell.manager.f.ScreenFadeController v;
    private PageRenderBuffer w;
    private TransitionManager x;
    private com.censivn.C3DEngine.b.d.MouseEventListener y;
    private com.censivn.C3DEngine.b.d.MouseEventListener z;
    private boolean o = false;
    private int t = 2;
    private ArrayList<WorkspacePage> K = new ArrayList<>();
    private boolean N = false;
    boolean e = true;
    private boolean O = false;
    private Object I = this;
    private com.tsf.shell.f.e.e.ItemNode H = new com.tsf.shell.f.e.TransitionConfig.ItemNode() { // from class: com.tsf.shell.f.f.PageTouchHandler.1
        @Override // com.tsf.shell.f.e.e.ItemNode
        public void a(int i, Object obj) {
            c();
            com.tsf.shell.manager.app.StateHub.b((com.tsf.shell.f.i.PageItem) obj);
        }

        @Override // com.tsf.shell.f.e.e.ItemNode
        public float a() {
            return com.tsf.shell.manager.app.WidgetPanelController.PageShaderNode.j() ? com.censivn.C3DEngine.b.b.ScreenConstants.g + (com.censivn.C3DEngine.b.b.ScreenConstants.h * 2) : com.censivn.C3DEngine.b.b.ScreenConstants.h * 2;
        }
    };
    private PageEventDispatcher G = new PageEventDispatcher();

    public PageTouchHandler() {
        this.G.a(new PageEventDispatcher.a() { // from class: com.tsf.shell.f.f.PageTouchHandler.8
            @Override // com.tsf.shell.f.f.PageEventDispatcher.a
            public void a(WorkspacePage gVar) {
                PageTouchHandler.this.WorkspacePage.b(gVar.r() - 1);
            }
        });
        com.tsf.shell.f.i.a.WallpaperDragHandler.d = this;
        com.tsf.shell.f.i.a.PageItemTouchHandler.a = this;
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.f = this;
        aa();
        ab();
    }

    public com.tsf.shell.manager.f.ScreenFadeController a() {
        return this.v;
    }

    public com.tsf.shell.f.e.e.ItemNode b() {
        return this.H;
    }

    public PageEventDispatcher c() {
        return this.G;
    }

    public void a(com.tsf.shell.f.i.PageItem bVar) {
        this.J = bVar;
    }

    public void d() {
        this.J = null;
    }

    public void a(int i) {
        this.WorkspacePage.a(i - 1);
    }

    public void e() {
        WorkspacePage.w();
        this.PageAnimationState.av();
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        S();
        this.v.a(i, i2, i3, i4);
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.9
            @Override // java.lang.Runnable
            public void run() {
                PageTouchHandler.this.K();
            }
        });
    }

    public class c extends TransitionManager {
        public c() {
        }
    }

    private void S() {
        a = (int) ((com.censivn.C3DEngine.b.b.ScreenConstants.F * 0.28f) + (com.censivn.C3DEngine.b.b.ScreenConstants.b * 90.0f));
        b = (int) ((com.censivn.C3DEngine.b.b.ScreenConstants.G * 0.28f) + (com.censivn.C3DEngine.b.b.ScreenConstants.b * 90.0f));
        c = (a - (com.censivn.C3DEngine.b.b.ScreenConstants.b * 90.0f)) / 2.0f;
        WorkspacePage.y();
        if (this.F != null) {
            this.F.a(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G);
        }
        if (this.B != null) {
            this.B.setAABBPX(-2.1474836E9f, -com.censivn.C3DEngine.b.b.ScreenConstants.I, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.b.b.ScreenConstants.I, 0.0f);
        }
        if (this.x != null) {
            this.GraphicsEngineBridge.a(com.censivn.C3DEngine.b.b.ScreenConstants.B, com.censivn.C3DEngine.b.b.ScreenConstants.C, com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.A);
        }
        if (this.w != null) {
            this.HapticFeedbackManager.a(com.censivn.C3DEngine.b.b.ScreenConstants.B, com.censivn.C3DEngine.b.b.ScreenConstants.C, com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.A);
        }
    }

    public com.censivn.C3DEngine.b.f.BaseRenderable f() {
        PageAnimationState.a();
        this.d = new com.tsf.shell.f.f.TransitionManager.WorkspaceShortcutTouchHandler();
        this.g = new com.tsf.shell.f.TransitionConfig.PageIndicatorStrip(true) { // from class: com.tsf.shell.f.f.PageTouchHandler.10
            @Override // com.tsf.shell.f.e.PageIndicatorStrip
            public void a() {
                com.tsf.shell.manager.app.WidgetPanelController.PageShaderNode.k();
            }
        };
        this.i = new com.censivn.C3DEngine.b.TransitionRenderer.SortedContainerRenderable() { // from class: com.tsf.shell.f.f.PageTouchHandler.11
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                PageTouchHandler.this.GraphicsEngineBridge.c();
                PageTouchHandler.this.M();
            }

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawEnd() {
                PageTouchHandler.this.N();
            }
        };
        this.D = new com.tsf.shell.f.g.PageShaderNode.GestureMenuOverlay();
        this.F = new com.tsf.shell.f.f.ItemTransitionManager.ScrollStateAggregator(this) { // from class: com.tsf.shell.f.f.PageTouchHandler.12
            @Override // com.tsf.shell.f.f.d.ScrollStateAggregator
            public void a() {
                com.tsf.shell.manager.app.WidgetAnimator.c();
                com.censivn.C3DEngine.b.c.KeyboardHandler.a(PageTouchHandler.this.f);
            }

            @Override // com.tsf.shell.f.f.d.ScrollStateAggregator
            public void b() {
                PageTouchHandler.this.t = 1;
                PageTouchHandler.this.ItemPageTransition.setAnimationObjectState(false);
                if (PageTouchHandler.this.C != null) {
                    PageTouchHandler.this.C.run();
                    PageTouchHandler.this.C = null;
                }
            }

            @Override // com.tsf.shell.f.f.d.ScrollStateAggregator
            public void c() {
                PageTouchHandler.this.ao();
            }
        };
        S();
        this.w = new PageRenderBuffer();
        this.h = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable() { // from class: com.tsf.shell.f.f.PageTouchHandler.13
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            @SuppressLint({"WrongCall"})
            public void onDrawStart() {
            }
        };
        this.E = new com.tsf.shell.manager.r.TransitionManager.MultiSelectLinePicker() { // from class: com.tsf.shell.f.f.PageTouchHandler.14
            @Override // com.tsf.shell.manager.r.c.MultiSelectLinePicker
            public void e() {
            }

            @Override // com.tsf.shell.manager.r.c.MultiSelectLinePicker
            public void d() {
            }
        };
        this.x = new TransitionManager();
        this.ItemPageTransition.setAnimationObjectState(true);
        this.p = Home.b().l();
        this.B = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable();
        this.v = new com.tsf.shell.manager.TransitionRenderer.ScreenFadeController(this.B);
        this.B.setAABBPX(-2.1474836E9f, -com.censivn.C3DEngine.b.b.ScreenConstants.I, 0.0f, 2.1474836E9f, com.censivn.C3DEngine.b.b.ScreenConstants.I, 0.0f);
        this.y = new com.tsf.shell.f.i.PageShaderNode.WallpaperDragHandler(this.B);
        this.z = new com.censivn.C3DEngine.b.ItemTransitionManager.MouseEventListener(this.B);
        this.B.setMouseEventListener(this.y);
        this.B.mouseEnabled(false);
        this.A = new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.15
            @Override // java.lang.Runnable
            public void run() {
                if (PageTouchHandler.this.J != null) {
                    if (PageTouchHandler.this.J instanceof com.tsf.shell.f.i.b.b.ItemShell) {
                        com.tsf.shell.f.i.b.b.ItemShell aVar = (com.tsf.shell.f.i.b.b.ItemShell) PageTouchHandler.this.J;
                        if (PageTouchHandler.this.m.s() != null && PageTouchHandler.this.m != PageTouchHandler.this.q) {
                            if (!PageTouchHandler.this.m.s().a(aVar.K().width * aVar.K().height, aVar.g)) {
                                PageTouchHandler.this.y();
                                com.tsf.shell.TransitionConfig.a(b.i.out_of_space);
                            }
                        }
                        PageTouchHandler.this.x();
                        return;
                    }
                    PageTouchHandler.this.x();
                    return;
                }
                PageTouchHandler.this.x();
            }
        };
        for (int i = 0; i < this.PageContentType.size(); i++) {
            g gVar = this.PageContentType.get(ItemPageTransition);
            gVar.x();
            d(gVar);
        }
        this.PageConfig.addChild(this.B);
        this.PageConfig.addChild(this.i);
        this.x = new TransitionManager();
        ac();
        this.v.a(this.m);
        if (this.r == null) {
            a(this.PageContentType.get(1));
        }
        this.r.D();
        ae();
        g();
        ai();
        a(this.n);
        this.G.a(this.m);
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.B.setMouseEventListener(this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.B.setMouseEventListener(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(WorkspacePage gVar) {
        this.PageContentType.remove(gVar);
        this.K.add(gVar);
    }

    private WorkspacePage e(int i) {
        g gVarW = W();
        gVarW.b(ItemPageTransition);
        this.PageContentType.add(gVarW);
        return gVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WorkspacePage V() {
        if (this.K.size() == 0) {
            g gVarW = W();
            gVarW.b(Z().intValue());
            this.PageContentType.add(gVarW);
            return gVarW;
        }
        g gVarRemove = this.K.remove(0);
        gVarRemove.k();
        gVarRemove.a(com.censivn.C3DEngine.b.b.ScreenConstants.B, com.censivn.C3DEngine.b.b.ScreenConstants.C, com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.A);
        return gVarRemove;
    }

    private WorkspacePage W() {
        return new PageContentType();
    }

    private WorkspacePage X() {
        if (this.j == null) {
            this.j = new com.tsf.shell.f.f.PageShaderNode.FolderPage();
            this.PageAnimationState.b(-1);
            this.PageContentType.add(this.j);
        }
        return this.j;
    }

    private void Y() {
        this.l = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            this.PageTransitionEffect.add(Integer.valueOf(ItemPageTransition));
        }
    }

    private Integer a(Integer num) {
        if (!this.PageTransitionEffect.contains(num)) {
            return this.PageTransitionEffect.remove(0);
        }
        this.PageTransitionEffect.remove(num);
        return num;
    }

    private Integer Z() {
        return this.PageTransitionEffect.remove(0);
    }

    public boolean b(int i) {
        return this.L.contains(Integer.valueOf(ItemPageTransition));
    }

    private void aa() {
        boolean z;
        String[] strArrSplit = com.tsf.shell.manager.b.ConfigManager.am().split(",");
        this.L = new ArrayList<>();
        for (String str : strArrSplit) {
            try {
                Integer numValueOf = Integer.valueOf(Integer.parseInt(str));
                Iterator<Integer> it = this.L.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() == numValueOf) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.L.add(numValueOf);
                }
            } catch (Exception e) {
            }
        }
    }

    private void ab() {
        int i;
        Y();
        int iAk = com.tsf.shell.manager.b.ConfigManager.ak();
        int iAl = com.tsf.shell.manager.b.ConfigManager.al();
        this.k = new ArrayList<>();
        int size = this.L.size();
        if (size > 16) {
            i = 16;
        } else {
            i = size < 1 ? 1 : size;
        }
        X();
        int i2 = 0;
        while (i2 < i) {
            int iIntValue = i2 < size ? this.L.get(i2).intValue() : 0;
            if (iIntValue != -1) {
                e(a(Integer.valueOf(iIntValue)).intValue());
            }
            i2++;
        }
        if (this.j == null) {
            X();
        }
        int size2 = this.PageContentType.size();
        for (int i3 = 0; i3 < size2; i3++) {
            g gVar = this.PageContentType.get(i3);
            gVar.a(i3);
            if (i3 > 0) {
                if (i3 == 1) {
                    if (size2 == 2) {
                        gVar.b((WorkspacePage) null);
                        gVar.a((WorkspacePage) null);
                    } else {
                        gVar.b(this.PageContentType.get(i3 + 1));
                        gVar.a(this.PageContentType.get(size2 - 1));
                    }
                } else if (i3 == size2 - 1) {
                    if (size2 == 3) {
                        gVar.b((WorkspacePage) null);
                        gVar.a(this.PageContentType.get(1));
                    } else {
                        gVar.b(this.PageContentType.get(1));
                        gVar.a(this.PageContentType.get(i3 - 1));
                    }
                } else {
                    gVar.b(this.PageContentType.get(i3 + 1));
                    gVar.a(this.PageContentType.get(i3 - 1));
                }
            }
            gVar.position().x = i3 * c;
            if (gVar.t() == iAk && iAk != -1) {
                this.m = gVar;
            }
            if (gVar.t() == iAl && iAl != -1) {
                this.r = gVar;
                a(gVar);
            }
        }
        if (this.m == null) {
            this.m = this.PageContentType.get(1);
        }
        int iR = this.m.r();
        for (int i4 = 0; i4 < size2; i4++) {
            g gVar2 = this.PageContentType.get(i4);
            if (i4 < iR) {
                gVar2.g = -1.0f;
            } else if (i4 > iR) {
                gVar2.g = 1.0f;
            } else {
                gVar2.g = 0.0f;
            }
        }
    }

    public void g() {
        a(com.tsf.shell.manager.b.ConfigManager.J());
    }

    public void a(boolean z) {
        if (!z || this.n == 2 || this.n == 3) {
            this.PageContentType.get(1).a((WorkspacePage) null);
            this.PageContentType.get(this.n - 1).b((WorkspacePage) null);
        } else {
            this.PageContentType.get(1).a(this.PageContentType.get(this.n - 1));
            this.PageContentType.get(this.n - 1).b(this.PageContentType.get(1));
        }
        this.PageAnimationState.a((WorkspacePage) null);
        this.PageAnimationState.b((WorkspacePage) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final WorkspacePage gVar) {
        com.censivn.C3DEngine.b.f.IRenderable iVarN = gVar.n();
        if (iVarN != null) {
            iVarN.calAABB(1.0f, 1.5f, 1.0f);
            A aVar = new PageShaderNode(iVarN);
            aVar.a(gVar);
            gVar.b(aVar);
            gVar.a(new com.tsf.shell.f.i.PageShaderNode.WallpaperDragHandler(iVarN) { // from class: com.tsf.shell.f.f.PageTouchHandler.2
                @Override // com.tsf.shell.f.i.a.WallpaperDragHandler, com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent) {
                    if (PageTouchHandler.this.t == 1 || PageTouchHandler.this.t == 3) {
                        PageTouchHandler.this.a(gVar, true, true);
                        PageTouchHandler.this.x();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        int i;
        int i2 = 0;
        Iterator<WorkspacePage> it = this.PageContentType.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                break;
            } else {
                i2 = !it.next().q() ? i + 1 : i;
            }
        }
        if (i != this.n) {
            this.n = i;
            this.F.a(this.n);
            a(this.n);
        }
    }

    public float c(int i) {
        return -(i * c);
    }

    public com.tsf.shell.f.e.PageIndicatorStrip h() {
        return this.g;
    }

    public void a(WorkspacePage gVar) {
        if (!gVar.q() && gVar.t() != -1) {
            if (this.t == 2) {
                this.r = gVar;
            } else {
                if (this.r != null) {
                    this.r.D();
                }
                this.r = gVar;
                this.r.C();
            }
            com.tsf.shell.manager.b.ConfigManager.o(gVar.t());
        }
    }

    public PageRenderBuffer i() {
        return this.w;
    }

    public com.tsf.shell.f.g.a.GestureMenuOverlay j() {
        return this.D;
    }

    public WorkspacePage k() {
        return this.q;
    }

    public void b(com.tsf.shell.f.i.PageItem bVar) {
        ((com.tsf.shell.f.i.a.PageItemTouchHandler) bVar.getMouseEventListener()).a(true);
        bVar.f_();
        w();
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.t;
    }

    public WorkspacePage n() {
        return this.m;
    }

    public WorkspacePage o() {
        return this.PageContentType.get(1);
    }

    public WorkspacePage p() {
        return this.PageContentType.get(this.PageContentType.size() - 1);
    }

    public int q() {
        return this.PageContentType.get(1).t();
    }

    public com.tsf.shell.f.f.d.ScrollStateAggregator r() {
        return this.F;
    }

    public C s() {
        return this.x;
    }

    public WorkspacePage d(int i) {
        for (g gVar : this.k) {
            if (gVar.t() == i) {
                return gVar;
            }
        }
        for (g gVar2 : this.k) {
            if (gVar2.t() != -1) {
                return gVar2;
            }
        }
        return null;
    }

    public com.tsf.shell.f.f.a.FolderPage t() {
        return this.j;
    }

    public com.censivn.C3DEngine.b.f.BaseRenderable u() {
        return this.i;
    }

    public com.censivn.C3DEngine.b.f.BaseRenderable v() {
        return this.h;
    }

    public void w() {
        if (!this.o && !this.GraphicsEngineBridge.a()) {
            this.s = 1;
            this.ItemPageTransition.invalidate();
        }
    }

    public void x() {
        ad();
        this.s = 2;
        this.ItemPageTransition.invalidate();
    }

    public void b(WorkspacePage gVar) {
        this.q = gVar;
    }

    public void y() {
        if (this.q != null) {
            if (this.q.t() == -1) {
                Iterator<WorkspacePage> it = this.PageContentType.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (next.t() != -1) {
                        this.q = next;
                        break;
                    }
                }
            }
            a(this.q, true, true);
        }
    }

    private void ad() {
        if (this.M != null) {
            com.censivn.C3DEngine.C3DEngine.a().g(this.M);
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        float fC = c(this.m.r());
        this.m.position().x = -fC;
        this.ItemPageTransition.position().x = fC;
    }

    public boolean a(WorkspacePage gVar, Runnable runnable, Runnable runnable2) {
        if (B()) {
            try {
                if (gVar != this.m) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    com.tsf.shell.manager.app.StateHub.af();
                    this.GraphicsEngineBridge.b(gVar, runnable2);
                }
                return true;
            } catch (Exception e) {
                if (runnable2 == null) {
                    return false;
                }
                runnable2.run();
                return false;
            }
        }
        if (runnable2 == null) {
            return false;
        }
        runnable2.run();
        return false;
    }

    private void af() {
        this.PageAnimationState.b(o());
        o().a((WorkspacePage) this.j);
        p().b((WorkspacePage) null);
    }

    public void z() {
        if (com.censivn.C3DEngine.a.TransitionConfig.l()) {
            if (this.r != this.m) {
                if (this.m == this.j) {
                    this.q = this.r;
                    s().c(VEasing.Linear.easeNone);
                    return;
                } else {
                    a(this.r, (Runnable) null, (Runnable) null);
                    return;
                }
            }
            return;
        }
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.3
            @Override // java.lang.Runnable
            public void run() {
                PageTouchHandler.this.z();
            }
        });
    }

    public void A() {
        if (com.censivn.C3DEngine.a.TransitionConfig.l()) {
            if (B()) {
                try {
                    if (this.r != this.m) {
                        if (this.m == this.j) {
                            this.q = this.r;
                            s().c(VEasing.Linear.easeNone);
                        } else {
                            a(this.r, (Runnable) null, (Runnable) null);
                        }
                    } else if (this.m != this.j) {
                        s().c(VEasing.Linear.easeNone);
                    }
                    return;
                } catch (Exception e) {
                    return;
                }
            }
            return;
        }
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.4
            @Override // java.lang.Runnable
            public void run() {
                PageTouchHandler.this.A();
            }
        });
    }

    public boolean B() {
        return this.t == 2 && com.tsf.shell.manager.app.AppListModel.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        com.tsf.shell.e.Workspace3ItemTransitionManager.setMouseEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        com.tsf.shell.e.Workspace3ItemTransitionManager.setMouseEnabled(true);
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        this.F.a(f, f2, f3, f4, this.O);
        com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.5
            @Override // java.lang.Runnable
            public void run() {
                PageTouchHandler.this.b(f, f2, f3, f4);
            }
        });
    }

    public void b(float f, float f2, float f3, float f4) {
        if (this.t != 4 && this.t != 2) {
            com.tsf.shell.manager.app.LauncherAppInfo.a(f / com.censivn.C3DEngine.b.b.ScreenConstants.D);
            g gVar = this.PageContentType.get(this.F.a(this.n, TransitionRenderer, f2, f3, f4, this.O));
            if (gVar != this.m) {
                a(gVar, true, false);
                ad();
                this.M = this.A;
                com.censivn.C3DEngine.C3DEngine.a().b(this.M, 1400L);
            }
        }
    }

    public void a(WorkspacePage gVar, boolean z, boolean z2) {
        if (z) {
            this.m.killFocus();
            this.m = gVar;
            this.m.setFocus();
        } else {
            this.m.F();
            this.m = gVar;
            this.m.E();
        }
        ai();
        if (z2) {
            this.G.a(this.m);
        }
    }

    private void ai() {
        e(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(WorkspacePage gVar) {
        com.tsf.shell.f.i.b.e.DrawerItemGather.h(((-gVar.r()) / this.n) * 360.0f);
    }

    public void C() {
        this.N = true;
        x();
    }

    private void aj() {
        this.PageAnimationState.position().x = -c;
        this.PageAnimationState.position().y = 0.0f;
        this.PageAnimationState.rotation().y = 0.0f;
        this.PageAnimationState.d(false);
        this.PageAnimationState.removeFromParent();
        this.ItemPageTransition.addChild(this.j);
        a((WorkspacePage) this.j, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        com.tsf.shell.manager.app.v.ObjectHelper.f();
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        this.e = true;
    }

    private void am() {
        ag();
    }

    @SuppressLint({"WrongCall"})
    public void D() {
        if (this.t != 2 && this.t != 4) {
            this.F.d();
            return;
        }
        if (this.t != 3 && this.t != 1) {
            com.tsf.shell.manager.app.PanelStateManager.i();
            ak();
            this.O = this.J != null;
            this.v.b();
            this.G.a();
            com.tsf.shell.manager.app.AppListModel.a(this.I);
            this.ItemPageTransition.setAnimationObjectState(true);
            if (this.t == 2) {
                this.m.V();
                this.q = this.m;
                this.B.mouseEnabled(true);
            }
            this.r.C();
            this.PageAnimationState.aw();
            this.m.d(true);
            this.t = 3;
            if (this.u != null) {
                this.u.run();
                this.u = null;
            }
            this.F.a(this, this.n, this.k, this.m, this.O);
        }
    }

    private void an() {
        if (this.t != 4 && this.t != 2) {
            if (this.N) {
                aj();
            }
            com.tsf.shell.manager.app.PanelStateManager.j();
            com.tsf.shell.manager.app.AppListModel.a(this.I, true);
            this.v.a(this.m);
            this.G.b();
            this.G.a(this.m);
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            this.ItemPageTransition.setAnimationObjectState(true);
            if (this.O && !this.N) {
                this.o = true;
                if (F() == -1) {
                    com.tsf.shell.TransitionConfig.a(com.censivn.C3DEngine.C3DEngine.d().getString(b.i.notic_widget_forbid_add));
                    y();
                }
            }
            this.N = false;
            this.t = 4;
            this.r.D();
            this.PageAnimationState.ax();
            this.F.a(this, this.k, this.m, this.O);
            this.m.g = 0.0f;
            a(true, "hdieSelect");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        g gVarN;
        this.B.mouseEnabled(false);
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.6
            @Override // java.lang.Runnable
            public void run() {
                if (PageTouchHandler.this.m.t() == -1) {
                    com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(false);
                } else {
                    com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(true);
                }
                PageTouchHandler.this.ah();
                com.tsf.shell.manager.b.ConfigManager.n(PageTouchHandler.this.m.t());
                PageTouchHandler.this.t = 2;
            }
        };
        if (this.J != null) {
            com.tsf.shell.f.i.a.PageItemTouchHandler cVar = (com.tsf.shell.f.i.a.PageItemTouchHandler) this.J.getMouseEventListener();
            cVar.a(false);
            if (!cVar.a() && (gVarN = com.tsf.shell.manager.app.StateHub.n()) != null) {
                this.J.removeFromParent();
                gVarN.a(this.J);
            }
            this.J.o_();
            d();
            this.o = false;
        }
        this.p.post(runnable);
        this.m.M();
        this.m.g = 0.0f;
        this.m.W();
        this.ItemPageTransition.setAnimationObjectState(false);
        al();
    }

    public boolean E() {
        return com.tsf.shell.manager.app.StateHub.F() == -1;
    }

    public int F() {
        if (this.m == null) {
            return -1;
        }
        return this.m.t();
    }

    public ArrayList<com.censivn.C3DEngine.b.f.IRenderable> G() {
        return this.m.R();
    }

    public void H() {
        ag();
        com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(false);
    }

    public void I() {
        if (this.t == 2) {
            if (this.m.t() == -1) {
                com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(false);
            } else {
                com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(true);
            }
            ah();
        }
    }

    public void J() {
        ap();
    }

    public void K() {
        Iterator<WorkspacePage> it = this.PageContentType.iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    private void ap() {
        this.ItemPageTransition.invalidate();
        for (g gVar : this.k) {
            if (this.m != gVar) {
                gVar.N();
                gVar.K();
                gVar.V();
            } else {
                gVar.W();
            }
        }
        this.m.removeFromParent();
        this.ItemPageTransition.addChild(this.m);
        this.m.M();
        com.tsf.shell.manager.app.LauncherAppInfo.d();
        com.tsf.shell.f._d.c().b();
        this.ItemPageTransition.setAnimationObjectState(false);
        if (this.m.t() == -1) {
            com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(false);
        }
    }

    public void L() {
        if (com.tsf.shell.manager.app.FeatureConfig.a() && this.s != 1) {
            w();
            am();
            N();
            this.HapticFeedbackManager.g();
        }
    }

    public void M() {
        if (this.t == 2 && this.s == 1) {
            am();
        }
    }

    public void N() {
        if (this.s == 2) {
            an();
        } else if (this.s == 1) {
            D();
        }
    }

    public void O() {
        if (this.m != null) {
            this.m.ac();
            Iterator<WorkspacePage> it = this.PageContentType.iterator();
            while (it.hasNext()) {
                it.next().T();
            }
        }
    }

    public void P() {
        if (this.m != null) {
            this.m.ab();
            Iterator<WorkspacePage> it = this.PageContentType.iterator();
            while (it.hasNext()) {
                it.next().U();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.HapticFeedbackManager.a()) {
                com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
                x();
            } else {
                this.HapticFeedbackManager.l();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void Q() {
        n().m().f();
    }

    public void R() {
        com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.app.FeatureConfig.a()) {
                    com.censivn.C3DEngine.a.ItemTransitionManager.d().i();
                    if (!PageTouchHandler.this.E.a() && com.tsf.shell.manager.app.StateHub.B() && com.tsf.shell.manager.app.StateHub.F() != -1) {
                        PageTouchHandler.this.E.b();
                        com.tsf.shell.manager.p.TipsDialogManager.a(5);
                        com.tsf.shell.TransitionConfig.a(b.i.notic_page_lasso_mode_enable);
                    }
                }
            }
        });
    }

    public class C implements com.censivn.C3DEngine.b.c.KeyboardHandler.a {
        private com.censivn.C3DEngine.b.f.BaseRenderable A;
        private com.censivn.C3DEngine.b.f.BaseRenderable B;
        private double C;
        private float D;
        private A E;
        private com.censivn.C3DEngine.b.d.MouseEventListener F;
        private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper G;
        private com.censivn.C3DEngine.b.g.TweenParams H;
        private WorkspacePage I;
        private float J;
        private float K;
        private WorkspacePage L;
        private Runnable M;
        l c;
        private float f;
        private float g;
        private float n;
        private float o;
        private float p;
        private float v;
        private boolean h = false;
        private boolean i = true;
        private boolean j = false;
        private boolean k = true;
        private boolean l = false;
        private boolean m = false;
        private float q = 0.0f;
        private float r = 0.0f;
        private float s = 0.0f;
        private float t = 0.0f;
        private float u = 0.0f;
        private boolean w = true;
        private float x = 0.03f;
        private boolean y = false;
        private boolean z = false;
        public float a = 0.125f;
        public float b = 0.3f;
        boolean d = false;
        private boolean N = true;

        public void a(float f) {
            this.r = f;
        }

        public void b(float f) {
            this.q = f;
        }

        public boolean a() {
            return !this.k;
        }

        public boolean b() {
            return this.j;
        }

        public void a(int i, int i2, int i3, int i4) {
            if (this.B != null) {
                this.B.setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.C, 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, com.censivn.C3DEngine.b.b.ScreenConstants.B, 0.0f);
            }
            this.n = m();
            if (!this.w) {
                this.o = -this.n;
                this.p = -((int) (this.n * 3.5f));
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < PageTouchHandler.this.n) {
                        g gVar = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i6);
                        gVar.position().z = (float) (Math.cos(((double) i6) * this.C) * ((double) this.n));
                        gVar.position().x = (float) (Math.sin(((double) i6) * this.C) * ((double) this.n));
                        gVar.rotation().y = this.D * i6;
                        i5 = i6 + 1;
                    } else {
                        this.u = this.A.rotation().y;
                        this.v = this.A.position().z;
                        this.s = (this.o + this.p) / 3.0f;
                        this.A.position().z = this.s;
                        return;
                    }
                }
            }
        }

        public C() {
            com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(this);
            this.G = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
            this.E = new PageShaderNode();
            i();
        }

        private void i() {
            this.o = -this.n;
            this.p = -((int) (this.n * 3.5f));
            this.B = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable();
            this.A = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.1
                @Override // com.censivn.C3DEngine.b.f.BaseRenderable
                public void onDrawChildStart() {
                    boolean z;
                    for (com.censivn.C3DEngine.b.f.IRenderable iVar : TransitionManager.this.A.children()) {
                        g gVar = (WorkspacePage) iVar;
                        float fA = GraphicsEngineBridge.a(iVar.rotation().y + rotation().y);
                        if (fA <= 90.0f || fA >= 270.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVar.b(z);
                    }
                }

                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawEnd() {
                    if (!TransitionManager.this.w && !TransitionManager.this.z) {
                        Collections.sort(children(), TransitionManager.this.E);
                        position().z += (TransitionManager.this.s - position().z) * 0.2f;
                        float fAbs = TransitionManager.this.y ? 255.0f : Math.abs((position().z - TransitionManager.this.o) / (TransitionManager.this.p - TransitionManager.this.o)) * 255.0f;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= PageTouchHandler.this.n) {
                                break;
                            }
                            ((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2)).a(fAbs);
                            i = i2 + 1;
                        }
                        if (TransitionManager.this.I == null) {
                            if (TransitionManager.this.y) {
                                rotation().y += (TransitionManager.this.q - rotation().y) * 0.3f;
                                rotation().x += (TransitionManager.this.r - rotation().x) * 0.3f;
                                return;
                            }
                            rotation().y += (TransitionManager.this.q - rotation().y) * TransitionManager.this.x;
                            rotation().x += (TransitionManager.this.r - rotation().x) * TransitionManager.this.x;
                            if (Math.abs(TransitionManager.this.q - rotation().y) > 0.1f || Math.abs(TransitionManager.this.r - rotation().x) > 0.1f) {
                                float f = (TransitionManager.this.A.rotation().y - TransitionManager.this.u) / TransitionManager.this.t;
                                float fAbs2 = 1.0f - (Math.abs(f - 0.5f) * 2.0f);
                                if (f < 0.5d) {
                                    TransitionManager.this.s = (fAbs2 * (TransitionManager.this.p - TransitionManager.this.v)) + TransitionManager.this.v;
                                } else {
                                    TransitionManager.this.s = (fAbs2 * (TransitionManager.this.p - TransitionManager.this.o)) + TransitionManager.this.o;
                                }
                                if (f > 0.9d) {
                                    TransitionManager.this.x += 0.008f;
                                }
                                if (f > 0.9d) {
                                    float f2 = (1.0f - f) * 10.0f;
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = i3;
                                        if (i4 < PageTouchHandler.this.n) {
                                            g gVar = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i4);
                                            if (gVar != PageTouchHandler.this.m) {
                                                gVar.J().alpha((int) (255.0f * f2));
                                            }
                                            i3 = i4 + 1;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                rotation().y = TransitionManager.this.q;
                                rotation().x = TransitionManager.this.r;
                                TransitionManager.this.w = true;
                                position().z = TransitionManager.this.o;
                                TransitionManager.this.k();
                            }
                        } else {
                            rotation().y += (TransitionManager.this.q - rotation().y) * 0.2f;
                            rotation().x += (TransitionManager.this.r - rotation().x) * 0.2f;
                            if (Math.abs(TransitionManager.this.q - rotation().y) <= 10.0f) {
                                TransitionManager.this.I = null;
                                TransitionManager.this.B.mouseEnabled(true);
                                TransitionManager.this.F.f(null);
                            }
                        }
                    }
                }
            };
            this.A.renderChildren(false);
            this.A.position().z = this.o;
            this.B.setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.z, com.censivn.C3DEngine.b.b.ScreenConstants.C, 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.A, com.censivn.C3DEngine.b.b.ScreenConstants.B, 0.0f);
            com.censivn.C3DEngine.b.d.MouseEventListener aVar = new com.censivn.C3DEngine.b.ItemTransitionManager.MouseEventListener(this.B) { // from class: com.tsf.shell.f.f.PageTouchHandler.c.3
                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                    TransitionManager.this.q = TransitionManager.this.J + (((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.ScreenConstants.F) * 360.0f * 1.2f);
                    float y = ((motionEvent2.getY() - motionEvent.getY()) / com.censivn.C3DEngine.b.b.ScreenConstants.G) * 180.0f;
                    TransitionManager.this.r = TransitionManager.this.K + y;
                    if (TransitionManager.this.r > 45.0f) {
                        TransitionManager.this.r = 45.0f;
                        TransitionManager.this.K = TransitionManager.this.r - y;
                    } else if (TransitionManager.this.r < -45.0f) {
                        TransitionManager.this.r = -45.0f;
                        TransitionManager.this.K = TransitionManager.this.r - y;
                    }
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void e(MotionEvent motionEvent) {
                    TransitionManager.this.x = 0.03f;
                    com.censivn.C3DEngine.b.g.TweenUtils.a(TransitionManager.this.A);
                    TransitionManager.this.h = false;
                    TransitionManager.this.y = true;
                    TransitionManager.this.z = false;
                    TransitionManager.this.J = TransitionManager.this.q = TransitionManager.this.A.rotation().y;
                    TransitionManager.this.K = TransitionManager.this.r = TransitionManager.this.A.rotation().x;
                    TransitionManager.this.s = (TransitionManager.this.o + TransitionManager.this.p) / 3.0f;
                    TransitionManager.this.j();
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void f(MotionEvent motionEvent) {
                    TransitionManager.this.a((WorkspacePage) null);
                }

                @Override // com.censivn.C3DEngine.b.d.MouseEventListener
                public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    TransitionManager.this.h = true;
                    TransitionManager.this.q = ((((int) (TransitionManager.this.A.rotation().y + (f / 4.0f))) / 360) * 360) + TransitionManager.this.l();
                    TransitionManager.this.u = TransitionManager.this.A.rotation().y;
                    TransitionManager.this.v = TransitionManager.this.A.position().z;
                    TransitionManager.this.t = TransitionManager.this.q - TransitionManager.this.A.rotation().y;
                    TransitionManager.this.j();
                }
            };
            this.F = aVar;
            this.B.setMouseEventListener(aVar);
            this.B.addChild(this.A);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < PageTouchHandler.this.n) {
                    g gVar = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i2);
                    if (gVar != PageTouchHandler.this.m) {
                        gVar.J().alpha(255.0f);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        class A implements Comparator<com.censivn.C3DEngine.b.f.IRenderable> {
            private double b = 0.017453292519943295d;

            A() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(com.censivn.C3DEngine.b.f.IRenderable iVar, com.censivn.C3DEngine.b.f.IRenderable iVar2) {
                float fCos = (float) (Math.cos(((double) (iVar.rotation().y + TransitionManager.this.A.rotation().y)) * this.b) * ((double) TransitionManager.this.n));
                float fCos2 = (float) (Math.cos(((double) (iVar2.rotation().y + TransitionManager.this.A.rotation().y)) * this.b) * ((double) TransitionManager.this.n));
                if (fCos > fCos2) {
                    return 1;
                }
                if (fCos < fCos2) {
                    return -1;
                }
                return 0;
            }
        }

        @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void a(int i, KeyEvent keyEvent) {
            if (i == 4 && !this.z && this.A.numChildren() > 0) {
                this.F.f(null);
            }
        }

        @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
        public void b(int i, KeyEvent keyEvent) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            this.B.removeFromParent();
            for (int i = 0; i < PageTouchHandler.this.n; i++) {
                g gVar = (WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition);
                gVar.f(false);
                gVar.position().z = 0.0f;
                gVar.position().x = 0.0f;
                gVar.rotation().y = 0.0f;
                gVar.e(false);
                gVar.removeFromParent();
                gVar.J().alpha(255.0f);
            }
            PageTouchHandler.this.m.H();
            PageTouchHandler.this.m.M();
            PageTouchHandler.this.ItemPageTransition.addChild(PageTouchHandler.this.m);
            com.tsf.shell.manager.app.AppListModel.a(PageTouchHandler.this.I, true);
            com.tsf.shell.manager.app.AppListModel.b(PageTouchHandler.this.I);
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            a(false);
            PageTouchHandler.this.al();
        }

        public float a(int i) {
            return (-i) * this.D;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return a(PageTouchHandler.this.m.r());
        }

        private float m() {
            return ((float) (((double) ((com.censivn.C3DEngine.b.b.ScreenConstants.F * 0.9f) / 2.0f)) / Math.sin((((double) ((360 / PageTouchHandler.this.n) / 2)) * 3.141592653589793d) / 180.0d))) + (200.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        }

        public void c(float f) {
            this.x = 0.03f;
            com.censivn.C3DEngine.b.c.KeyboardHandler.a(this);
            this.n = m();
            this.o = -this.n;
            this.p = -((int) (this.n * 3.5f));
            this.C = 6.283185307179586d / ((double) PageTouchHandler.this.n);
            this.D = 360.0f / PageTouchHandler.this.n;
            if (this.w) {
                PageTouchHandler.this.ak();
                com.tsf.shell.manager.app.AppListModel.a(PageTouchHandler.this.I);
                com.tsf.shell.manager.app.AppListModel.c(PageTouchHandler.this.I);
                this.w = false;
                for (int i = 0; i < PageTouchHandler.this.n; i++) {
                    g gVar = (WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition);
                    if (gVar != PageTouchHandler.this.m) {
                        gVar.O();
                    }
                    gVar.f(false);
                    gVar.L();
                    gVar.H();
                    gVar.z();
                    gVar.e(true);
                    gVar.position().z = (float) (Math.cos(((double) i) * this.C) * ((double) this.n));
                    gVar.position().x = (float) (Math.sin(((double) i) * this.C) * ((double) this.n));
                    gVar.rotation().y = this.D * i;
                    gVar.J().scale().setAll(1.0f, 1.0f, 1.0f);
                    this.A.addChild(gVar);
                }
                Number3d number3dRotation = this.A.rotation();
                float fL = l();
                number3dRotation.y = fL;
                this.q = fL;
                this.B.removeFromParent();
                PageTouchHandler.this.PageConfig.addChild(this.B);
            }
            this.u = this.A.rotation().y;
            this.v = this.A.position().z;
            j();
        }

        public void c() {
            boolean z;
            if (this.c != null && !this.TransitionManager.a()) {
                com.tsf.shell.manager.app.v.ObjectHelper.PageRenderBuffer.a(true);
                com.tsf.shell.manager.app.v.ObjectHelper.PageRenderBuffer.a(PageTouchHandler.this.m);
            } else {
                com.tsf.shell.manager.app.v.ObjectHelper.PageRenderBuffer.a(false);
            }
            if (!this.k) {
                if (this.L != null) {
                    if (this.g < 0.0f) {
                        this.TransitionManager.b(PageTouchHandler.this.m.g, this.g);
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, this.g, true, false, this.c);
                        z = false;
                    } else {
                        this.TransitionManager.b(PageTouchHandler.this.m.g, this.g);
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, this.g, false, true, this.c);
                        z = false;
                    }
                } else if (this.j) {
                    float f = PageTouchHandler.this.m.g + ((this.g - PageTouchHandler.this.m.g) * 0.25f);
                    this.TransitionManager.b(PageTouchHandler.this.m.g, TransitionRenderer);
                    if (f < 0.0f) {
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, TransitionRenderer, true, false, this.c);
                    } else {
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, TransitionRenderer, false, true, this.c);
                    }
                    z = false;
                } else if (!this.TransitionManager.b() || Math.abs(PageTouchHandler.this.m.g - this.g) >= 0.001d) {
                    float f2 = PageTouchHandler.this.m.g + ((this.g - PageTouchHandler.this.m.g) * this.b);
                    this.TransitionManager.b(PageTouchHandler.this.m.g, f2);
                    if (f2 < 0.0f) {
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, f2, true, false, this.c);
                        z = false;
                    } else {
                        PageTouchHandler.this.m.a(PageTouchHandler.this.m, f2, false, true, this.c);
                        z = false;
                    }
                } else {
                    this.TransitionManager.b(PageTouchHandler.this.m.g, this.g);
                    PageTouchHandler.this.m.a(PageTouchHandler.this.m, this.g, true, false, this.c);
                    z = true;
                }
                if (this.L == null && !z) {
                    PageTouchHandler.this.a(false, "onDrawFrame");
                }
                PageTouchHandler.this.ItemPageTransition.a();
                Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = PageTouchHandler.this.ItemPageTransition.children().iterator();
                while (it.hasNext()) {
                    g gVar = (WorkspacePage) it.next();
                    gVar.i();
                    gVar.af();
                }
                if (z) {
                    a(true);
                }
            }
        }

        public void d() {
            a((PageTransitionEffect) null);
        }

        public void a(PageTransitionEffect lVar) {
            if (this.i) {
                if (lVar == null) {
                    lVar = com.tsf.shell.manager.app.v.FlagHelper.C0126a.h();
                }
                this.c = lVar;
                this.TransitionManager.d();
                com.tsf.shell.manager.app.v.FlagHelper.C0126PageShaderNode.a2(this.c);
                this.h = false;
                this.i = false;
                this.f = PageTouchHandler.this.m.g;
                PageTouchHandler.this.PageConfig.setAnimationObjectState(true);
                PageTouchHandler.this.PageConfig.invalidate();
                if (this.k) {
                    this.k = false;
                    PageTouchHandler.this.ag();
                    PageTouchHandler.this.m.V();
                }
                PageTouchHandler.this.ItemPageTransition.position().x = 0.0f;
                com.tsf.shell.manager.app.PanelStateManager.i();
            }
        }

        public void a(WorkspacePage gVar) {
            this.y = false;
            this.r = 0.0f;
            if (!this.h) {
                if (gVar == null) {
                    if (this.A.numChildren() != 0) {
                        PageTouchHandler.this.a((WorkspacePage) this.A.getChildAt(this.A.numChildren() - 1), false, true);
                    }
                } else {
                    PageTouchHandler.this.a(gVar, false, true);
                }
                PageTouchHandler.this.m.g = 0.0f;
                PageTouchHandler.this.v.a(PageTouchHandler.this.m);
                PageTouchHandler.this.a(true, "RotationUp");
                float fL = (((int) (this.A.rotation().y / 360.0f)) * 360) + 360 + l();
                float fL2 = (((int) (this.A.rotation().y / 360.0f)) * 360) + l();
                float fL3 = ((((int) (this.A.rotation().y / 360.0f)) * 360) - 360) + l();
                float fAbs = Math.abs(fL - this.A.rotation().y);
                float fAbs2 = Math.abs(fL2 - this.A.rotation().y);
                float fAbs3 = Math.abs(fL3 - this.A.rotation().y);
                if (fAbs < fAbs2 && fAbs < fAbs3) {
                    this.q = fL;
                } else if (fAbs2 < fAbs && fAbs2 < fAbs3) {
                    this.q = fL2;
                } else {
                    this.q = fL3;
                }
                this.u = this.A.rotation().y;
                this.v = this.A.position().z;
                this.t = this.q - this.A.rotation().y;
                this.z = true;
                for (int i = 0; i < PageTouchHandler.this.n; i++) {
                    ((WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition)).A();
                }
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.4
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 < PageTouchHandler.this.n) {
                                g gVar2 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i3);
                                if (gVar2 != PageTouchHandler.this.m) {
                                    gVar2.J().alpha((int) (255.0f - (255.0f * f)));
                                }
                                gVar2.a(gVar2.B() * (1.0f - f));
                                i2 = i3 + 1;
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        TransitionManager.this.w = true;
                        TransitionManager.this.z = false;
                        TransitionManager.this.k();
                    }
                };
                dVar.c(0.0f);
                dVar.d(this.q);
                dVar.j(this.o);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.A);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.A, 500, dVar);
            }
        }

        public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.i && this.l) {
                this.h = true;
                if (Math.abs(TransitionRenderer) > 300.0f) {
                    if (f < 0.0f) {
                        o();
                    } else {
                        p();
                    }
                }
            }
        }

        public boolean e() {
            if (!this.i) {
                return false;
            }
            d();
            this.k = true;
            c(0.0f);
            this.F.e(null);
            this.r = 30.0f;
            this.K = 30.0f;
            return true;
        }

        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            this.F.a(motionEvent, motionEvent2);
        }

        public void a(MotionEvent motionEvent) {
            this.F.f(motionEvent);
        }

        public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.F.b(motionEvent, motionEvent2, TransitionRenderer, f2);
        }

        public boolean f() {
            return this.m;
        }

        public boolean g() {
            return this.l;
        }

        public void b(MotionEvent motionEvent) {
        }

        public void c(MotionEvent motionEvent) {
            if (!this.m) {
                this.m = true;
                this.l = false;
            }
        }

        public void c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.m) {
                this.b = this.a;
                int iAbs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int iAbs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((iAbs * iAbs) + (iAbs2 * iAbs2) > com.censivn.C3DEngine.a.b.b / 2.0f) {
                    if (iAbs > iAbs2) {
                        this.l = true;
                    } else {
                        this.l = false;
                    }
                    this.m = true;
                }
            }
            if (this.m && this.l) {
                if (this.i) {
                    com.tsf.shell.f.e._g.MenuOverlay.onTempleteHide();
                    com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.5
                        @Override // java.lang.Runnable
                        public void run() {
                            TransitionManager.this.d();
                        }
                    });
                }
                this.g = this.f + (((motionEvent.getX() - motionEvent2.getX()) / com.censivn.C3DEngine.b.b.ScreenConstants.F) * (PageTouchHandler.this.n - 1) * 1.7f);
                this.j = true;
            }
        }

        public void d(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.m) {
                this.b = this.a;
                int iAbs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int iAbs2 = (int) Math.abs(motionEvent2.getY() - motionEvent.getY());
                if ((iAbs * iAbs) + (iAbs2 * iAbs2) > com.censivn.C3DEngine.a.b.b) {
                    if (iAbs > iAbs2) {
                        this.l = true;
                    } else {
                        this.l = false;
                    }
                    this.m = true;
                }
            }
            if (this.m && this.l) {
                if (this.i) {
                    com.tsf.shell.f.e._g.MenuOverlay.onTempleteHide();
                    com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.6
                        @Override // java.lang.Runnable
                        public void run() {
                            TransitionManager.this.d();
                        }
                    });
                }
                this.g = this.f + ((motionEvent2.getX() - motionEvent.getX()) / com.censivn.C3DEngine.b.b.ScreenConstants.F);
                if (PageTouchHandler.this.m.ah() == null && this.g < 0.0f) {
                    this.g = com.tsf.shell.f.e.TransitionManager.a(this.g);
                }
                if (PageTouchHandler.this.m.ag() == null && this.g > 0.0f) {
                    this.g = com.tsf.shell.f.e.TransitionManager.a(this.g);
                }
                this.j = true;
            }
        }

        public void d(MotionEvent motionEvent) {
            if (this.m) {
                com.tsf.shell.f.e._g.MenuOverlay.onTempleteShow();
                this.m = false;
                this.i = true;
                this.j = false;
                this.g = 0.0f;
                if (!this.h && this.L == null && !this.k) {
                    g gVarN = n();
                    if (gVarN != null && gVarN != PageTouchHandler.this.m) {
                        PageTouchHandler.this.a(gVarN, false, true);
                        return;
                    }
                    return;
                }
                this.h = false;
            }
        }

        private WorkspacePage n() {
            float f;
            g gVar;
            g gVar2 = null;
            float f2 = Float.MAX_VALUE;
            int i = 1;
            while (i < PageTouchHandler.this.n) {
                g gVar3 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition);
                float fAbs = Math.abs(gVar3.g);
                if (fAbs < f2) {
                    gVar = gVar3;
                    f = fAbs;
                } else {
                    f = f2;
                    gVar = gVar2;
                }
                i++;
                gVar2 = gVar;
                f2 = f;
            }
            return gVar2;
        }

        private void a(boolean z) {
            this.i = true;
            this.k = true;
            this.d = false;
            PageTouchHandler.this.PageConfig.setAnimationObjectState(false);
            if (z) {
                PageTouchHandler.this.m.a(this.c);
            }
            PageTouchHandler.this.I();
            com.tsf.shell.manager.b.ConfigManager.n(PageTouchHandler.this.m.t());
            PageTouchHandler.this.m.W();
            g gVar = PageTouchHandler.this.m;
            this.f = 0.0f;
            gVar.g = 0.0f;
            if (this.c != null) {
                this.TransitionManager.c();
            }
            PageTouchHandler.this.ae();
            PageTouchHandler.this.g();
            com.tsf.shell.manager.app.v.FlagHelper.C0126a();
            PageConfig.a(false);
            com.tsf.shell.manager.app.PanelStateManager.j();
        }

        private void a(WorkspacePage gVar, Runnable runnable) {
            a(gVar, runnable, (PageTransitionEffect) null);
        }

        private void a(WorkspacePage gVar, Runnable runnable, l lVar) {
            PageConfig.a(true);
            com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(false);
            this.L = gVar;
            PageTouchHandler.this.a(this.L, true, "hdieSelect");
            if (this.M != null) {
                this.M.run();
            }
            this.M = runnable;
            PageTouchHandler.this.v.a(gVar);
            a(lVar);
            this.k = false;
            this.j = true;
            this.m = true;
        }

        private void a(final WorkspacePage gVar, int i, Runnable runnable, final boolean z, final l lVar) {
            if (this.d || gVar == null || this.L == gVar || gVar == PageTouchHandler.this.m || !this.k) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            this.d = true;
            PageTouchHandler.this.b(PageTouchHandler.this.m);
            PageTouchHandler.this.e(gVar);
            PageTouchHandler.this.G.a(gVar);
            a(gVar, runnable, lVar);
            final g gVar2 = PageTouchHandler.this.m;
            final g gVarAg = gVar2.ag();
            final g gVarAh = gVar2.ah();
            final g gVarAg2 = gVar.ag();
            final g gVarAh2 = gVar.ah();
            lVar.b(gVar2, true);
            lVar.a(gVar, true);
            if (z) {
                gVar.b(gVar2);
                gVar.a((WorkspacePage) null);
                gVar2.a(gVar);
                gVar2.b((WorkspacePage) null);
            } else {
                gVar.b((WorkspacePage) null);
                gVar.a(gVar2);
                gVar2.a((WorkspacePage) null);
                gVar2.b(gVar);
            }
            final float f = z ? 1.0f : -1.0f;
            this.H = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.7
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    lVar.a(gVar2, false);
                    TransitionManager.this.j = false;
                    TransitionManager.this.m = false;
                    TransitionManager.this.g = 0.0f;
                    gVar2.a(gVar2, z ? 1.0f : -1.0f, false, false, TransitionManager.this.c);
                    gVar2.a(gVarAg);
                    gVar2.b(gVarAh);
                    gVar.a(gVarAg2);
                    gVar.b(gVarAh2);
                    PageTouchHandler.this.a(gVar, false, true);
                    com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(true);
                    TransitionManager.this.L = null;
                    if (TransitionManager.this.M != null) {
                        com.censivn.C3DEngine.C3DEngine.a().c(TransitionManager.this.M);
                        TransitionManager.this.M = null;
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f2) {
                    TransitionManager.this.g = f * f2;
                }
            };
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.G);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.G, ItemPageTransition, this.H);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(final WorkspacePage gVar, Runnable runnable) {
            if (!this.d && this.L != gVar && gVar != PageTouchHandler.this.m) {
                PageTouchHandler.this.G.a(gVar);
                PageTouchHandler.this.e(gVar);
                PageTouchHandler.this.b(PageTouchHandler.this.m);
                a(gVar, runnable);
                int iR = gVar.r() - PageTouchHandler.this.m.r();
                final float f = PageTouchHandler.this.m.g;
                final float f2 = -iR;
                this.H = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.8
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        TransitionManager.this.j = false;
                        TransitionManager.this.m = false;
                        TransitionManager.this.g = 0.0f;
                        PageTouchHandler.this.a(gVar, false, true);
                        com.censivn.C3DEngine.a.ItemTransitionManager.d().c().a(true);
                        TransitionManager.this.L = null;
                        if (TransitionManager.this.M != null) {
                            com.censivn.C3DEngine.C3DEngine.a().c(TransitionManager.this.M);
                            TransitionManager.this.M = null;
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f3) {
                        if (f3 > 0.5d) {
                            TransitionManager.this.j = false;
                        }
                        TransitionManager.this.g = f + ((f2 - f) * f3);
                    }
                };
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.G);
                int iAbs = Math.abs(iR * 150);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.G, iAbs >= 500 ? iAbs : 500, this.H);
                return;
            }
            runnable.run();
        }

        public void b(int i) {
            a(i, (Runnable) null);
        }

        public void a(int i, final Runnable runnable) {
            if (this.N) {
                this.N = false;
                final float f = PageTouchHandler.this.m.g;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.9
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        TransitionManager.this.j = false;
                        TransitionManager.this.m = false;
                        TransitionManager.this.g = 0.0f;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f2) {
                        TransitionManager.this.g = f + ((0.0f - f) * f2);
                    }
                };
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.G);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.G, ItemPageTransition, dVar);
            }
        }

        public void h() {
            c(VEasing.Linear.easeNone);
        }

        public void c(final int i) {
            if (com.censivn.C3DEngine.a.TransitionConfig.l()) {
                if (PageTouchHandler.this.t().aJ() && this.k) {
                    g gVarN = PageTouchHandler.this.n();
                    if (gVarN.t() == -1) {
                        ((com.tsf.shell.f.f.a.FolderPage) gVarN).aB();
                        g gVarK = PageTouchHandler.this.k();
                        if (gVarK == null || gVarK.t() == -1) {
                            gVarK = PageTouchHandler.this.o();
                        }
                        a(gVarK, ItemPageTransition, null, false, com.tsf.shell.manager.app.v.FlagHelper.PageRenderBuffer.h());
                        com.tsf.shell.manager.app.AppListModel.a(PageTouchHandler.this.I, false);
                        return;
                    }
                    a(PageTouchHandler.this.t(), ItemPageTransition, null, true, com.tsf.shell.manager.app.v.FlagHelper.PageRenderBuffer.h());
                    com.tsf.shell.manager.app.AppListModel.a(PageTouchHandler.this.I);
                    return;
                }
                return;
            }
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.10
                @Override // java.lang.Runnable
                public void run() {
                    TransitionManager.this.c(ItemPageTransition);
                }
            });
        }

        public void d(int i) {
            c(ItemPageTransition);
        }

        public void a(int i, final int i2) {
            this.N = true;
            final boolean z = PageTouchHandler.this.m.ah() != null;
            d();
            final float f = PageTouchHandler.this.m.g;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.c.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    TransitionManager.this.b(i2);
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f2) {
                    if (z) {
                        TransitionManager.this.g = f - ((f + 1.0f) * f2);
                    } else {
                        TransitionManager.this.g = f - ((f - 1.0f) * f2);
                    }
                }
            };
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.G);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.G, ItemPageTransition, dVar);
            this.k = false;
            this.j = true;
            this.m = true;
        }

        private void o() {
            if (PageTouchHandler.this.m.ah() != null) {
                PageTouchHandler.this.m.a(PageTouchHandler.this.m, PageTouchHandler.this.m.g, true, false, this.c);
                PageTouchHandler.this.a(PageTouchHandler.this.m.ah(), false, true);
                this.g = 0.0f;
            }
        }

        private void p() {
            if (PageTouchHandler.this.m.ag() != null) {
                PageTouchHandler.this.m.a(PageTouchHandler.this.m, PageTouchHandler.this.m.g, false, true, this.c);
                PageTouchHandler.this.a(PageTouchHandler.this.m.ag(), false, true);
                this.g = 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str) {
        a(this.m, z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WorkspacePage gVar, boolean z, String str) {
        com.tsf.shell.manager.app.LauncherAppInfo.a(gVar, z, true);
    }

    public class b {
        private WorkspacePage C;
        private DynamicTextureElement D;
        private com.censivn.C3DEngine.b.f.BaseRenderable c;
        private boolean e;
        private float f;
        private float g;
        private float l;
        private float t;
        private WorkspacePage u;
        private Number3d v;
        private int y;
        private float m = 32.0f;
        private float n = -50.0f;
        private boolean r = false;
        private boolean s = false;
        private boolean x = false;
        private int z = 1;
        private int A = 2;
        private int B = 0;
        private boolean G = false;
        private com.tsf.shell.f.e.e.ItemContainerNode F = com.tsf.shell.manager.app.WidgetAnimator.d();
        private com.censivn.C3DEngine.b.f.GridRenderable E = new com.censivn.C3DEngine.b.TransitionRenderer.GridRenderable(com.tsf.shell.manager.g.LayoutDimensionConstants.g, com.tsf.shell.manager.g.LayoutDimensionConstants.g, false);
        private float b = 0.017453292f;
        private float h = com.censivn.C3DEngine.b.b.ScreenConstants.D;
        private float o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        private float p = (com.censivn.C3DEngine.b.b.ScreenConstants.B + ((int) (Math.sin(this.b * this.m) * ((double) this.h)))) - (100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
        private float w = (float) (((double) this.o) + (Math.cos(this.b * this.m) * ((double) this.h)));
        private float q = ((float) (((double) this.p) - (Math.sin(this.b * this.m) * ((double) this.h)))) - (n.b / 2);
        private float i = 360.0f / (((float) (((double) (2.0f * this.h)) * 3.141592653589793d)) / (n.a - 40));
        private float k = this.i / (n.a - 40);
        private float j = this.i * this.b;
        private com.censivn.C3DEngine.b.f.BaseRenderable d = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable();

        public b() {
            this.c = new com.censivn.C3DEngine.b.TransitionRenderer.BaseRenderable() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.1
                @Override // com.censivn.C3DEngine.b.f.IRenderable
                public void onDrawStart() {
                    if (!PageRenderBuffer.this.r) {
                        if (PageRenderBuffer.this.s) {
                            rotation().y += (PageRenderBuffer.this.t - rotation().y) * 0.5f;
                            return;
                        }
                        rotation().y += (PageRenderBuffer.this.t - rotation().y) * 0.2f;
                        if (rotation().y < PageRenderBuffer.this.f && PageRenderBuffer.this.t < PageRenderBuffer.this.f) {
                            PageRenderBuffer.this.t += (PageRenderBuffer.this.f - PageRenderBuffer.this.t) * 0.3f;
                        } else if (rotation().y > PageRenderBuffer.this.g && PageRenderBuffer.this.t > PageRenderBuffer.this.g) {
                            PageRenderBuffer.this.t += (PageRenderBuffer.this.g - PageRenderBuffer.this.t) * 0.3f;
                        }
                        if (Math.abs(rotation().y - PageRenderBuffer.this.t) < 0.01d && getAnimationObjectState()) {
                            setAnimationObjectState(false);
                            rotation().y = PageRenderBuffer.this.t;
                        }
                        if (PageRenderBuffer.this.y != PageRenderBuffer.this.z) {
                            if (PageRenderBuffer.this.y == PageRenderBuffer.this.A) {
                                PageRenderBuffer.this.t += 2.0f;
                                if (PageRenderBuffer.this.t > PageRenderBuffer.this.g) {
                                    PageRenderBuffer.this.t = PageRenderBuffer.this.g;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        PageRenderBuffer.this.t -= 2.0f;
                        if (PageRenderBuffer.this.t < PageRenderBuffer.this.f) {
                            PageRenderBuffer.this.t = PageRenderBuffer.this.f;
                        }
                    }
                }
            };
        }

        public void a(int i, int i2, int i3, int i4) {
            this.h = com.censivn.C3DEngine.b.b.ScreenConstants.D;
            this.o = (-this.h) - (200.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
            this.p = (com.censivn.C3DEngine.b.b.ScreenConstants.B + ((int) (Math.sin(this.b * this.m) * ((double) this.h)))) - (100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b);
            this.w = (float) (((double) this.o) + (Math.cos(this.b * this.m) * ((double) this.h)));
            this.q = ((float) (((double) this.p) - (Math.sin(this.b * this.m) * ((double) this.h)))) - (n.b / 2);
            this.i = 360.0f / (((float) (((double) (2.0f * this.h)) * 3.141592653589793d)) / (n.a - 40));
            this.k = this.i / (n.a - 40);
            this.j = this.i * this.b;
            if (this.e) {
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
                this.TransitionManager.position().z = this.o;
                this.TransitionManager.rotation().x = this.m;
                this.TransitionManager.position().y = this.p;
                this.TransitionManager.rotation().y = this.t;
                for (g gVar : PageTouchHandler.this.k) {
                    if (gVar != this.C) {
                        b(gVar);
                    }
                }
            }
        }

        public boolean a() {
            return this.e;
        }

        public com.censivn.C3DEngine.b.f.GridRenderable b() {
            return this.E;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (!this.e && !this.r) {
                com.tsf.shell.manager.app.ServiceFactory.k();
                this.E.textures().clear();
                if (this.D != null) {
                    com.censivn.C3DEngine.C3DEngine.g().a(this.D);
                }
                this.D = ThemeManager.mix.page.getTextureElement(ThemeShellDescription.PAGE_ADD_BUTTON, com.tsf.shell.manager.g.LayoutDimensionConstants.g, com.tsf.shell.manager.g.LayoutDimensionConstants.g);
                this.E.textures().addElement(this.D);
                PageTouchHandler.this.T();
                this.e = true;
                this.r = true;
                this.g = 90.0f;
                this.t = this.g - (PageTouchHandler.this.m.r() * this.i);
                for (g gVar : PageTouchHandler.this.k) {
                    gVar.p();
                    Number3d number3dLocalToGlobal = gVar.localToGlobal(new Number3d());
                    Number3d number3dLocalRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
                    gVar.removeFromParent();
                    this.TransitionManager.globalToLocal(number3dLocalToGlobal);
                    gVar.position().setAllFrom(number3dLocalToGlobal);
                    gVar.rotation().setAllFrom(number3dLocalRotationToGlobal);
                    gVar.removeFromParent();
                    this.TransitionManager.addChild(gVar);
                    b(gVar, 750);
                }
                k();
                this.ItemTransitionManager.removeFromParent();
                this.TransitionManager.removeFromParent();
                PageTouchHandler.this.PageConfig.addChildAt(this.d, 1);
                PageTouchHandler.this.PageConfig.addChildAt(this.c, 1);
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.2
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        PageRenderBuffer.this.r = false;
                    }
                };
                if (PageTouchHandler.this.n < 16) {
                    j();
                }
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
                dVar.j(this.o);
                dVar.c(this.m);
                dVar.h(this.p);
                dVar.d(this.t);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 750, dVar);
            }
        }

        private void h() {
            this.F.removeFromParent();
            this.F.position().x = 0.0f;
            this.F.a(0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.C + (100.0f * com.censivn.C3DEngine.b.b.ScreenConstants.b), true);
            PageTouchHandler.this.PageConfig.addChild(this.F);
            this.F.b();
        }

        private void i() {
            this.F.c();
        }

        public void c() {
            HapticFeedbackManager.a(3);
        }

        public void d() {
        }

        public void a(float f, float f2) {
            this.F.a(GraphicsEngineBridge.b(this.F.c, this.F.d, TransitionRenderer, f2), TransitionRenderer, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.C = PageTouchHandler.this.V();
            this.C.x();
            PageTouchHandler.this.d(this.C);
            this.C.p();
            this.C.a(-1);
            this.C.rotation().x = this.n;
            this.C.rotation().y = 0.0f;
            this.C.rotation().z = 0.0f;
            this.C.position().x = 0.0f;
            this.C.position().z = this.w - (((0.0f - this.q) + 50.0f) / 2.0f);
            this.C.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.C;
            this.C.a(true);
            this.C.d(false);
            this.ItemTransitionManager.addChild(this.C);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
            dVar.h(0.0f);
            dVar.f(0.0f);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.C, 500, dVar);
        }

        private void k() {
            this.f = this.g - ((this.TransitionManager.numChildren() - 1) * this.i);
        }

        private void b(final WorkspacePage gVar, int i) {
            gVar.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.3
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    gVar.mouseEnabled(true);
                }
            };
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar);
            A aVarC = c(gVar);
            dVar.f(aVarC.a);
            dVar.j(aVarC.b);
            dVar.h(0.0f);
            dVar.c(0.0f);
            dVar.d(aVarC.c);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar, ItemPageTransition, dVar);
        }

        private void b(WorkspacePage gVar) {
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar);
            A aVarC = c(gVar);
            gVar.position().setAll(aVarC.a, 0.0f, aVarC.b);
            gVar.rotation().setAll(0.0f, aVarC.c, 0.0f);
            gVar.scale().setAll(1.0f, 1.0f, 1.0f);
        }

        private PageShaderNode c(WorkspacePage gVar) {
            A aVar = new PageShaderNode();
            int iR = gVar.r();
            aVar.a = (float) (Math.cos(((double) (iR * (-this.j))) - 3.141592653589793d) * ((double) this.h));
            aVar.b = (float) (Math.sin(((double) (iR * (-this.j))) - 3.141592653589793d) * ((double) this.h));
            aVar.c = (iR * this.i) - 90.0f;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l() {
            if (this.e && !this.r && !this.G) {
                com.tsf.shell.manager.app.ServiceFactory.i();
                ArrayList arrayList = (ArrayList) this.ItemTransitionManager.children().clone();
                if (this.ItemTransitionManager.numChildren() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g gVar = (g) ((com.censivn.C3DEngine.b.f.IRenderable) it.next());
                        if (gVar.r() == -1) {
                            if (gVar.q()) {
                                f(gVar);
                            } else {
                                a(gVar, 500);
                            }
                        }
                    }
                }
                PageTouchHandler.this.F.a(PageTouchHandler.this.m);
                this.r = true;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < PageTouchHandler.this.n) {
                        g gVar2 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i2);
                        if (i2 > 0) {
                            if (i2 == 1) {
                                if (PageTouchHandler.this.n != 2) {
                                    gVar2.b((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2 + 1));
                                    gVar2.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(PageTouchHandler.this.n - 1));
                                } else {
                                    gVar2.b((WorkspacePage) null);
                                    gVar2.a((WorkspacePage) null);
                                }
                            } else if (i2 == PageTouchHandler.this.n - 1) {
                                if (PageTouchHandler.this.n != 3) {
                                    gVar2.b((WorkspacePage) PageTouchHandler.this.PageContentType.get(1));
                                    gVar2.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2 - 1));
                                } else {
                                    gVar2.b((WorkspacePage) null);
                                    gVar2.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2 - 1));
                                }
                            } else {
                                gVar2.b((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2 + 1));
                                gVar2.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(i2 - 1));
                            }
                        }
                        gVar2.o();
                        Number3d number3dLocalToGlobal = gVar2.localToGlobal(new Number3d());
                        Number3d number3dLocalRotationToGlobal = gVar2.localRotationToGlobal(new Number3d());
                        gVar2.removeFromParent();
                        gVar2.mouseEnabled(true);
                        PageTouchHandler.this.ItemPageTransition.globalToLocal(number3dLocalToGlobal);
                        gVar2.position().setAllFrom(number3dLocalToGlobal);
                        gVar2.rotation().setAllFrom(number3dLocalRotationToGlobal);
                        PageTouchHandler.this.ItemPageTransition.addChild(gVar2);
                        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
                        com.censivn.C3DEngine.b.g.TweenUtils.a(gVar2);
                        PageTouchHandler.this.F.a(dVar, gVar2);
                        com.censivn.C3DEngine.b.g.TweenUtils.a(gVar2, 500, dVar);
                        i = i2 + 1;
                    } else {
                        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 500, new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.4
                            @Override // com.censivn.C3DEngine.b.g.TweenParams
                            public void a() {
                                PageRenderBuffer.this.E.textures().clear();
                                if (PageRenderBuffer.this.D != null) {
                                    com.censivn.C3DEngine.C3DEngine.g().a(PageRenderBuffer.this.D);
                                    PageRenderBuffer.this.D = null;
                                }
                                PageRenderBuffer.this.TransitionManager.removeFromParent();
                                PageRenderBuffer.this.ItemTransitionManager.removeFromParent();
                                PageRenderBuffer.this.r = false;
                                PageRenderBuffer.this.e = false;
                                PageTouchHandler.this.U();
                                String str = "";
                                Iterator it2 = PageTouchHandler.this.PageContentType.iterator();
                                while (true) {
                                    String str2 = str;
                                    if (it2.hasNext()) {
                                        str = str2 + ((WorkspacePage) it2.next()).t() + ",";
                                    } else {
                                        com.tsf.shell.manager.b.ConfigManager.i(str2.substring(0, str2.length() - 1));
                                        return;
                                    }
                                }
                            }
                        });
                        this.TransitionManager.position().z = 0.0f;
                        this.TransitionManager.position().y = 0.0f;
                        this.TransitionManager.rotation().x = 0.0f;
                        this.TransitionManager.rotation().y = 0.0f;
                        PageTouchHandler.this.m.setFocus();
                        PageTouchHandler.this.g();
                        return;
                    }
                }
            }
        }

        public void e() {
            this.s = true;
            float f = this.TransitionManager.rotation().y;
            this.l = f;
            this.t = f;
            this.TransitionManager.setAnimationObjectState(true);
            this.TransitionManager.invalidate();
        }

        public void f() {
            this.s = false;
        }

        public void a(float f) {
            this.t += this.k * f;
        }

        public void b(float f) {
            this.t = this.l + (this.k * f);
        }

        public void a(WorkspacePage gVar, MotionEvent motionEvent) {
            if (gVar.t() != -1 && !gVar.q() && PageTouchHandler.this.n > 2) {
                h();
            }
            HapticFeedbackManager.a();
            this.u = gVar;
            gVar.setAnimationObjectState(true);
            Number3d number3dLocalToGlobal = gVar.localToGlobal(new Number3d());
            Number3d number3dLocalRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
            gVar.removeFromParent();
            this.ItemTransitionManager.globalToLocal(number3dLocalToGlobal);
            this.ItemTransitionManager.globalRotationToLocal(number3dLocalRotationToGlobal);
            gVar.position().setAllFrom(number3dLocalToGlobal);
            gVar.rotation().setAllFrom(number3dLocalRotationToGlobal);
            this.ItemTransitionManager.addChild(gVar);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar);
            dVar.l(1.1f);
            dVar.m(1.1f);
            dVar.d(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar, 250, dVar);
            if (gVar.getTag() != null && (gVar.getTag() instanceof Number3d)) {
                this.v = (Number3d) gVar.getTag();
                this.v.x = this.u.position().x;
                this.v.y = this.u.position().y;
                return;
            }
            this.v = this.u.position().m4clone();
            this.v.z = this.w;
        }

        public void b(WorkspacePage gVar, MotionEvent motionEvent) {
            boolean z;
            if (gVar.t() == -1 || gVar.q() || PageTouchHandler.this.n <= 2) {
                z = false;
            } else {
                i();
                e(gVar);
                z = true;
            }
            this.y = this.B;
            gVar.setAnimationObjectState(false);
            float[] fArrA = GraphicsEngineBridge.a(motionEvent);
            if (fArrA[1] - this.q > -50.0f) {
                a(fArrA[0], fArrA[1], gVar, true);
                a(gVar, 250);
                if (gVar.q()) {
                    gVar.a(false);
                    PageTouchHandler.this.ac();
                    this.C = null;
                    if (PageTouchHandler.this.n < 16) {
                        j();
                    }
                }
            } else {
                if (gVar.r() != -1) {
                    gVar.setTag(this.v.m4clone());
                    g(gVar);
                }
                if (gVar.Q() == 0 && z) {
                    f(gVar);
                    z = false;
                } else {
                    com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams();
                    com.censivn.C3DEngine.b.g.TweenUtils.a(gVar);
                    dVar.l(1.0f);
                    dVar.m(1.0f);
                    dVar.d(0.0f);
                    dVar.e(0.0f);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(gVar, 250, dVar);
                }
            }
            if (z) {
                float[] fArrA2 = GraphicsEngineBridge.a(motionEvent);
                if (this.F.calTouchCollision(fArrA2[0], fArrA2[1])) {
                    f(gVar);
                }
            }
            PageTouchHandler.this.G.a(PageTouchHandler.this.m);
        }

        public void a(final WorkspacePage gVar, MotionEvent motionEvent, final MotionEvent motionEvent2) {
            final float[] fArrA = GraphicsEngineBridge.a(motionEvent2);
            this.u.position().x = this.v.x + ((motionEvent2.getX() - motionEvent.getX()) * 1.3f);
            this.u.position().y = this.v.y - (motionEvent2.getY() - motionEvent.getY());
            com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.5
                @Override // java.lang.Runnable
                public void run() {
                    PageRenderBuffer.this.a(fArrA[0], fArrA[1]);
                    float f = fArrA[1] - PageRenderBuffer.this.q;
                    if (f > 50.0f) {
                        PageRenderBuffer.this.u.rotation().x = PageRenderBuffer.this.m;
                        PageRenderBuffer.this.u.position().z = PageRenderBuffer.this.v.z;
                        PageRenderBuffer.this.a(fArrA[0], fArrA[1], gVar);
                    } else if (f < -50.0f) {
                        PageRenderBuffer.this.u.rotation().x = PageRenderBuffer.this.n;
                        PageRenderBuffer.this.u.position().z = PageRenderBuffer.this.v.z - ((f + 50.0f) / 2.0f);
                    } else {
                        PageRenderBuffer.this.u.rotation().x = (((f + 50.0f) / 100.0f) * (PageRenderBuffer.this.m - PageRenderBuffer.this.n)) + PageRenderBuffer.this.n;
                        PageRenderBuffer.this.u.position().z = PageRenderBuffer.this.v.z;
                        PageRenderBuffer.this.a(fArrA[0], fArrA[1], gVar);
                    }
                    if (gVar.t() != -1 && !gVar.q() && PageTouchHandler.this.n > 2) {
                        float[] fArrA2 = GraphicsEngineBridge.a(motionEvent2);
                        if (PageRenderBuffer.this.F.calTouchCollision(fArrA2[0], fArrA2[1])) {
                            PageRenderBuffer.this.d(gVar);
                        } else {
                            PageRenderBuffer.this.e(gVar);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(WorkspacePage gVar) {
            if (!this.x) {
                this.x = true;
                gVar.setDefaultColor(com.tsf.shell.manager.o.ThemeColorConstants.c);
                c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(WorkspacePage gVar) {
            if (this.x) {
                this.x = false;
                gVar.clearDefaultColor();
                d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float f, float f2, g gVar) {
            if (f > (com.censivn.C3DEngine.b.b.ScreenConstants.D / 2) - (com.censivn.C3DEngine.b.b.ScreenConstants.a * 50.0f)) {
                this.y = this.z;
            } else if (f < (-r0) + (com.censivn.C3DEngine.b.b.ScreenConstants.a * 50.0f)) {
                this.y = this.A;
            } else {
                a(f, f2, gVar, false);
            }
        }

        private void a(float f, float f2, g gVar, boolean z) {
            g gVarO;
            this.y = this.B;
            com.censivn.C3DEngine.b.f.IRenderable hittingTarget = this.TransitionManager.getHittingTarget(f, f2, true);
            if (hittingTarget != null) {
                if (hittingTarget == null) {
                    float f3 = this.TransitionManager.rotation().y;
                    if (f3 > this.g) {
                        f3 = this.g;
                    } else if (f3 < this.f) {
                        f3 = this.f;
                    }
                    gVarO = (WorkspacePage) PageTouchHandler.this.PageContentType.get(((int) (((this.g - f3) / (this.g - this.f)) * (this.TransitionManager.numChildren() - 1))) + 1);
                } else {
                    gVarO = (WorkspacePage) hittingTarget.parent();
                }
                if (gVarO.t() == -1 && gVar == (gVarO = PageTouchHandler.this.o())) {
                    gVar.a(1);
                    return;
                }
                int iR = gVarO.r();
                int size = iR == -1 ? PageTouchHandler.this.PageContentType.size() - 1 : iR;
                int iR2 = gVar.r();
                if (iR2 == -1) {
                    int size2 = PageTouchHandler.this.PageContentType.size();
                    for (int i = size; i < size2; i++) {
                        g gVar2 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition);
                        if (gVar2.r() != -1) {
                            gVar2.a(i + 1);
                            b(gVar2, 250);
                        }
                    }
                    PageTouchHandler.this.PageContentType.remove(gVar);
                    PageTouchHandler.this.PageContentType.add(size, gVar);
                    gVar.a(size);
                    return;
                }
                if (size > iR2) {
                    int i2 = iR2 + 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 < size + 1) {
                            g gVar3 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i3);
                            gVar3.a(i3 - 1);
                            b(gVar3, 250);
                            i2 = i3 + 1;
                        } else {
                            PageTouchHandler.this.PageContentType.remove(gVar);
                            PageTouchHandler.this.PageContentType.add(size, gVar);
                            gVar.a(size);
                            return;
                        }
                    }
                } else {
                    for (int i4 = size; i4 < iR2; i4++) {
                        g gVar4 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(i4);
                        gVar4.a(i4 + 1);
                        b(gVar4, 250);
                    }
                    PageTouchHandler.this.PageContentType.remove(gVar);
                    PageTouchHandler.this.PageContentType.add(size, gVar);
                    gVar.a(size);
                }
            }
        }

        private void f(final WorkspacePage gVar) {
            this.G = true;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.WorkspacePage.TweenParams() { // from class: com.tsf.shell.f.f.PageTouchHandler.b.6
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    PageTouchHandler.this.c(gVar);
                    gVar.removeFromParent();
                    gVar.destroy();
                    gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                    if (gVar.q()) {
                        gVar.a(false);
                    }
                    if (PageTouchHandler.this.n < 16 && PageRenderBuffer.this.C == null) {
                        PageRenderBuffer.this.j();
                    }
                    PageRenderBuffer.this.G = false;
                }
            };
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.n(0.0f);
            dVar.f(0.0f);
            dVar.h(com.censivn.C3DEngine.b.b.ScreenConstants.C);
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar);
            com.censivn.C3DEngine.b.g.TweenUtils.a(gVar, 500, dVar);
            PageTouchHandler.this.PageContentType.remove(gVar);
            PageTouchHandler.this.ac();
            if (PageTouchHandler.this.m == gVar) {
                PageTouchHandler.this.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(1), false, true);
            }
            if (PageTouchHandler.this.r == gVar) {
                PageTouchHandler.this.a((WorkspacePage) PageTouchHandler.this.PageContentType.get(1));
            }
        }

        private void g(WorkspacePage gVar) {
            int iR = gVar.r();
            int size = PageTouchHandler.this.PageContentType.size();
            gVar.a(-1);
            PageTouchHandler.this.PageContentType.remove(gVar);
            PageTouchHandler.this.PageContentType.add(gVar);
            for (int i = iR; i < size; i++) {
                g gVar2 = (WorkspacePage) PageTouchHandler.this.PageContentType.get(ItemPageTransition);
                if (gVar2.r() != -1) {
                    gVar2.a(ItemPageTransition);
                    b(gVar2, 250);
                }
            }
            k();
        }

        public void a(WorkspacePage gVar, int i) {
            Number3d number3dLocalToGlobal = gVar.localToGlobal(new Number3d());
            Number3d number3dLocalRotationToGlobal = gVar.localRotationToGlobal(new Number3d());
            gVar.removeFromParent();
            this.TransitionManager.globalToLocal(number3dLocalToGlobal);
            this.TransitionManager.globalRotationToLocal(number3dLocalRotationToGlobal);
            number3dLocalRotationToGlobal.z = 0.0f;
            number3dLocalRotationToGlobal.x = 0.0f;
            number3dLocalRotationToGlobal.y = 0.0f;
            gVar.position().setAllFrom(number3dLocalToGlobal);
            gVar.rotation().x = 0.0f;
            gVar.rotation().y = -this.TransitionManager.rotation().y;
            gVar.rotation().z = 0.0f;
            gVar.setTag(null);
            if (gVar.r() == -1) {
                gVar.a(this.TransitionManager.numChildren());
            }
            this.TransitionManager.addChild(gVar);
            k();
            PageTouchHandler.this.PageContentType.remove(gVar);
            PageTouchHandler.this.PageContentType.add(gVar.r(), gVar);
            b(gVar, ItemPageTransition);
        }

        public void a(WorkspacePage gVar) {
            if (!gVar.q()) {
                if (PageTouchHandler.this.r == gVar) {
                    PageTouchHandler.this.a(gVar, false, true);
                    return;
                } else {
                    PageTouchHandler.this.a(gVar);
                    return;
                }
            }
            a(0.0f, this.q, gVar, true);
            a(gVar, 500);
            gVar.a(false);
            PageTouchHandler.this.ac();
            this.C = null;
            if (PageTouchHandler.this.n < 16) {
                j();
            }
        }

        class a {
            float a;
            float b;
            float c;

            a() {
            }
        }
    }

    class A extends com.censivn.C3DEngine.b.d.MouseEventListener {
        boolean a;
        boolean b;
        private WorkspacePage e;
        private boolean f;
        private boolean g;

        public A(com.censivn.C3DEngine.b.f.IRenderable iVar) {
            super(iVar);
            this.a = false;
            this.b = false;
        }

        public void a(WorkspacePage gVar) {
            this.e = gVar;
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void c(MotionEvent motionEvent) {
            if (!this.g && this.TransitionConfig.t() != -1) {
                PageTouchHandler.this.HapticFeedbackManager.a(this.e, motionEvent);
                this.g = true;
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (this.g) {
                PageTouchHandler.this.HapticFeedbackManager.a(this.e, motionEvent, motionEvent2);
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent) {
            HapticFeedbackManager.b();
            PageTouchHandler.this.HapticFeedbackManager.a(this.e);
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void f(MotionEvent motionEvent) {
            if (this.g) {
                this.g = false;
                PageTouchHandler.this.HapticFeedbackManager.b(this.e, motionEvent);
            }
            PageTouchHandler.this.HapticFeedbackManager.f();
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void e(MotionEvent motionEvent) {
            this.a = false;
            this.b = false;
            this.f = true;
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
            if (this.f) {
                this.f = false;
                if (Math.abs(TransitionRenderer) > Math.abs(f2)) {
                    this.b = true;
                    PageTouchHandler.this.HapticFeedbackManager.e();
                } else {
                    com.censivn.C3DEngine.C3DEngine.a().b(new Runnable() { // from class: com.tsf.shell.f.f.PageTouchHandler.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PageShaderNode.this.c(motionEvent2);
                        }
                    });
                }
            }
            if (this.b) {
                PageTouchHandler.this.HapticFeedbackManager.b(motionEvent2.getX() - motionEvent.getX());
            }
        }

        @Override // com.censivn.C3DEngine.b.d.MouseEventListener
        public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.b && Math.abs(TransitionRenderer) > 250.0f) {
                PageTouchHandler.this.HapticFeedbackManager.a(f / 2.0f);
            }
        }
    }

    public void a(com.tsf.shell.f.i.ShortcutItem cVar, com.censivn.C3DEngine.b.f.IRenderable iVar, java.util.ArrayList<Integer> arrayList, java.util.ArrayList<Integer> arrayList2) {}
}
