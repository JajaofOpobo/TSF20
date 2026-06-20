package com.tsf.shell.f.h.a.a;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.f.h.a.WorkspacePreviewNode;
import com.tsf.shell.theme.inside.ThemeManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneElementRenderer implements SceneNodeAnimator.a, SceneElementBase.a {
    public static int a;
    public static int b;
    public static int c;
    private com.tsf.shell.f.h.a.WorkspacePreviewNode d;
    private com.censivn.C3DEngine.b.b.A.b e;
    private e f;
    private A g;
    private f h;
    private com.tsf.shell.f.h.a.a.a.SceneSurfaceNode i;
    private int k;
    private boolean j = false;
    private TextureElement l = new TextureElement(0, false);
    private TextureElement m = new TextureElement(0, false);

    public SceneElementRenderer(com.tsf.shell.f.h.a.WorkspacePreviewNode cVar) {
        this.d = cVar;
        a = (int) com.censivn.C3DEngine.b.b.A.a(170.0f);
        int iA = (int) com.censivn.C3DEngine.b.b.A.a(550.0f);
        c = iA;
        b = iA;
        this.f = new SceneElementHandler(this) { // from class: com.tsf.shell.f.h.a.a.SceneElementRenderer.1
            @Override // com.tsf.shell.f.h.a.a.SceneElementHandler, com.censivn.C3DEngine.b.e.c
            public void g() {
                super.g();
                d.this.d.u();
            }
        };
        this.e = new com.censivn.C3DEngine.b.b.A.b();
        this.i = new com.tsf.shell.f.h.a.a.a.SceneSurfaceNode(this, cVar.c());
        this.g = new SceneNodeContainer();
        this.h = new SceneElementConfig();
        this.e.setAABBPX(0.0f, com.censivn.C3DEngine.b.b.A.a(180.0f));
    }

    public void a(int i) {
        this.k = i;
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public int j() {
        return this.k;
    }

    public f k() {
        return this.h;
    }

    public void a(b bVar) {
        this.d.f();
        this.j = true;
        this.i.a(bVar);
        com.tsf.shell.manager.app.ServiceFactory.f();
        com.censivn.C3DEngine.b.c.b.a(this);
    }

    public void l() {
        if (this.j && this.i.c()) {
            this.d.g();
            this.j = false;
            com.tsf.shell.manager.app.ServiceFactory.g();
            com.censivn.C3DEngine.b.c.b.b(this);
        }
    }

    public TextureElement a(boolean z) {
        if (z) {
            if (this.m.id == 0) {
                Bitmap defaultBitmap = ThemeManager.mix.contact.getDefaultBitmap(b, b, true);
                com.censivn.C3DEngine.C3DEngine.g().a(this.m, defaultBitmap);
                defaultBitmap.recycle();
            }
            return this.m;
        }
        if (this.l.id == 0) {
            Bitmap defaultBitmap2 = ThemeManager.mix.contact.getDefaultBitmap(a, a, false);
            com.censivn.C3DEngine.C3DEngine.g().a(this.l, defaultBitmap2);
            defaultBitmap2.recycle();
        }
        return this.l;
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4 && this.j) {
            SceneElementRenderer();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void b() {
        SceneElementRenderer();
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void c() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void d() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void e() {
        this.i.d();
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void f() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void g() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.l);
        com.censivn.C3DEngine.C3DEngine.g().a(this.m);
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void h() {
        if (this.i != null) {
            this.i.e();
        }
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void i() {
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public BaseRenderable a() {
        return this.e;
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void a(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.h.a.a.SceneElementRenderer.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    d.this.e.removeFromParent();
                }
            };
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
        this.e.alpha(0.0f);
        this.e.removeFromParent();
    }

    @Override // com.tsf.shell.f.h.a.WorkspacePreviewNode.a
    public void b(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, 300, dVar);
            return;
        }
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
        this.e.alpha(255.0f);
    }
}
