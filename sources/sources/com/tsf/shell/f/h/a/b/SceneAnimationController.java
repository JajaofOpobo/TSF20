package com.tsf.shell.f.h.a.b;

import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.LabelRenderable;
import com.tsf.b;
import com.tsf.shell.f.e.ObjectPool;
import com.tsf.shell.f.h.a.WorkspacePreviewNode;
import com.tsf.shell.f.i.b.e.DrawerItemVisual;
import com.tsf.shell.f.i.b.e.DrawerItemButton;
import com.tsf.shell.manager.app.LauncherAppInfo;
import com.tsf.shell.manager.b.ConfigManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneAnimationController implements c.a {
    private c a;
    private int e;
    private LabelRenderable f;
    private int g;
    private b b = new SceneAnimationHandler(this) { // from class: com.tsf.shell.f.h.a.b.SceneAnimationController.1
        @Override // com.tsf.shell.f.h.a.b.SceneAnimationHandler, com.censivn.C3DEngine.b.e.DesktopPanelRenderer
        public void g() {
            super.g();
            a.this.a.u();
        }
    };
    private d<C0112a> d = new d<C0112a>() { // from class: com.tsf.shell.f.h.a.b.SceneAnimationController.2
        @Override // com.tsf.shell.f.e.ObjectPool
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0112a a() {
            C0112a c0112a = a.this.new C0112a();
            c0112a.setAABBPX(com.tsf.shell.manager.o.ButtonPresetManager.a.T, com.tsf.shell.manager.o.ButtonPresetManager.a.U);
            c0112a.position().y = -com.censivn.C3DEngine.b.b.ScreenConstants.a(30.0f);
            return c0112a;
        }
    };
    private com.censivn.C3DEngine.b.b.ScreenConstants.b c = new com.censivn.C3DEngine.b.b.ScreenConstants.b();

    public SceneAnimationController(c cVar) {
        this.e = 8;
        this.a = cVar;
        this.c.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.a(180.0f));
        this.e = b(e.ax());
    }

    public int k() {
        return this.e;
    }

    public void a(int i, boolean z) {
        this.e = b(i);
        if (z) {
            SceneAnimationController();
            e.u(this.e);
        }
    }

    private int b(int i) {
        if (i < 3) {
            return 3;
        }
        if (i > 15) {
            return 15;
        }
        return i;
    }

    private void l() {
        while (!this.c.children().isEmpty()) {
            i iVarRemoveChildAt = this.c.removeChildAt(0);
            if (iVarRemoveChildAt instanceof C0112a) {
                C0112a c0112a = (C0112a) iVarRemoveChildAt;
                c0112a.q();
                c0112a.textures().clear();
                this.d.a(c0112a);
            }
        }
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.h.a.b.SceneAnimationController.3
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    a.this.c.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
        this.c.alpha(0.0f);
        this.c.removeFromParent();
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void b(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
        this.c.alpha(255.0f);
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public BaseRenderable a() {
        return this.c;
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void b() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void c() {
        SceneAnimationController();
    }

    private LabelRenderable m() {
        if (this.f == null) {
            this.f = new LabelRenderable();
            this.f.d(40);
            this.f.c(SceneAnimationHandler.i.notic_no_recent_apps);
            this.f.b();
            this.f.minX(com.censivn.C3DEngine.b.b.ScreenConstants.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.ScreenConstants.A);
        }
        return this.f;
    }

    private void n() {
        System.currentTimeMillis();
        ArrayList<g> arrayListA = com.tsf.shell.manager.app.ServiceProvider.a().a().a(this.e);
        SceneAnimationController();
        if (arrayListA.isEmpty()) {
            this.c.addChild(m());
            return;
        }
        if (this.f != null) {
            this.f.a();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayListA.size()) {
                g gVar = arrayListA.get(i2);
                C0112a c0112aC = this.d.c();
                c0112aC.a(gVar.bd());
                c0112aC.scale().setAll(0.9f, 0.9f, 1.0f);
                c0112aC.k.textures().clear();
                c0112aC.k.textures().addElement(gVar.aZ());
                this.c.addChild(c0112aC);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void d() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void e() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void f() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void g() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void h() {
        if (this.f != null) {
            this.f.minX(com.censivn.C3DEngine.b.b.ScreenConstants.z);
            this.f.maxX(com.censivn.C3DEngine.b.b.ScreenConstants.A);
            this.c.onChildMeasure(this.f);
        }
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void i() {
        this.b.d();
    }

    public void a(int i) {
        this.g = i;
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public int j() {
        return this.g;
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.h.a.b.SceneAnimationController$a, reason: collision with other inner class name */
    class C0112a extends h {
        private LauncherAppInfo b;

        public C0112a() {
        }

        @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
        public void l() {
            if (this.b != null) {
                this.b.a();
            }
        }

        public void a(LauncherAppInfo fVar) {
            this.b = fVar;
        }

        public void q() {
            this.b = null;
        }
    }
}
