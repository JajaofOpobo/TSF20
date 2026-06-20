package com.tsf.shell.f.h.a;

import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.b;
import com.tsf.shell.f.h.a.a.SceneElementRenderer;
import com.tsf.shell.manager.b.ConfigManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WorkspacePreviewNode extends com.tsf.shell.f.h.a.WorkspaceSceneNode {
    public static final float a = com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f);
    private A b;
    private d c;
    private com.tsf.shell.f.h.a.b.SceneAnimationController d;

    public interface a {
        j a();

        void a(boolean z);

        void b();

        void b(boolean z);

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();

        int j();
    }

    public WorkspacePreviewNode() {
        int iAu = e.au();
        this.c = new d(this);
        this.c.a(0);
        this.c.a(false);
        this.d = new com.tsf.shell.f.h.a.b.SceneAnimationController(this);
        this.d.a(1);
        this.d.a(false);
        if (iAu == 0) {
            a((WorkspaceSceneNode) this.c, false, false);
        } else {
            a((WorkspaceSceneNode) this.d, false, false);
        }
        if (!e.av()) {
            a(false, false, false);
        }
    }

    private void x() {
        if (this.b == this.c) {
            a((WorkspaceSceneNode) this.d, true, true);
        } else {
            a((WorkspaceSceneNode) this.c, true, true);
        }
    }

    private void a(A aVar, boolean z, boolean z2) {
        if (this.b != null) {
            this.b.d();
            this.b.a(z);
        }
        a(aVar.a());
        this.b = aVar;
        this.b.b(z);
        if (z2) {
            this.b.c();
            e.t(this.b.j());
        }
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void b(int i) {
        if (i == 0) {
            if (this.b == this.c) {
                d(b.d.ico_recents_app);
                e(b.i.text_toggle_recent_apps);
                return;
            } else {
                d(b.d.ico_contact);
                e(b.i.text_quick_contact);
                return;
            }
        }
        d(b.d.ico_setting);
        a("");
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public boolean c(int i) {
        if (i != 0) {
            return true;
        }
        a();
        return false;
    }

    public d v() {
        return this.c;
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void d() {
        this.b.b();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void u() {
        super.u();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void a(boolean z) {
        e.w(z);
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void t() {
        this.b.i();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void m() {
        this.b.c();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void n() {
        this.b.d();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void o() {
        this.b.e();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void p() {
        this.b.f();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void r() {
        this.b.g();
    }

    @Override // com.tsf.shell.f.h.a.WorkspaceSceneNode
    public void s() {
        this.b.h();
    }

    public void w() {
        a();
        a();
    }
}
