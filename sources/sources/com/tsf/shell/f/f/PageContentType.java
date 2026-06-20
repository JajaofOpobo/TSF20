package com.tsf.shell.f.f;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerC;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageContentType extends g {
    private com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerC l;

    public PageContentType() {
        this.b = new com.tsf.shell.e.CellLayout(com.censivn.C3DEngine.C3DEngine.d(), this.a);
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void O() {
        for (com.censivn.C3DEngine.b.f.IRenderable iVar : this.c.children()) {
            if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                ((com.tsf.shell.f.i.PageItem) iVar).ae();
            }
        }
        super.O();
    }

    public void a() {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.f.PageContentType.1
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().addView(k.this.b);
            }
        });
    }

    public void aj() {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.f.f.PageContentType.2
            @Override // java.lang.Runnable
            public void run() {
                Home.b().l().removeView(k.this.b);
            }
        });
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void ab() {
        if (!ad() && X()) {
            super.ab();
            PageContentType().g();
            for (com.censivn.C3DEngine.b.f.IRenderable iVar : this.c.children()) {
                if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                    ((com.tsf.shell.f.i.PageItem) iVar).q_();
                }
            }
        }
    }

    @Override // com.tsf.shell.f.f.WorkspacePage
    public void ac() {
        if (ad() && Y()) {
            super.ac();
            for (com.censivn.C3DEngine.b.f.IRenderable iVar : this.c.children()) {
                if (iVar instanceof com.tsf.shell.f.i.PageItem) {
                    ((com.tsf.shell.f.i.PageItem) iVar).j();
                }
            }
        }
    }

    public void a(c.a aVar) {
        this.l = new com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerC(this, false, aVar);
        int i = ((int) (((double) (com.censivn.C3DEngine.b.b.ScreenConstants.D > com.censivn.C3DEngine.b.b.ScreenConstants.E ? com.censivn.C3DEngine.b.b.ScreenConstants.E : com.censivn.C3DEngine.b.b.ScreenConstants.D)) * 0.9d)) / 2;
        this.l.a(i, i);
        this.l.scale().setAll(0.5f, 0.5f, 1.0f);
        this.l.alpha(0.0f);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.l);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.l, 386, dVar);
    }

    public void a(com.censivn.C3DEngine.b.f.IRenderable iVar, com.tsf.shell.f.i.b.e.DrawerItemVisual gVar) {
        com.tsf.shell.f.i.b.e.DrawerItemVisual gVarBa = gVar.ba();
        gVarBa.removeFromParent();
        gVarBa.position().setAllFrom(this.l.globalToLocal(iVar.localToGlobal(new Number3d())));
        gVarBa.position().z = 0.0f;
        this.l.a(gVarBa);
    }
}
