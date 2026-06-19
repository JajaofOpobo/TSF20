package com.tsf.shell.manager.r.b.c;

import android.view.KeyEvent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetPanelOrchestrator extends com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase {
    private b a;
    private c b;
    private com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase e;

    public WidgetPanelOrchestrator(com.tsf.shell.f.e._g.MenuOverlay dVar) {
        super(dVar);
        g();
    }

    private void g() {
        this.a = new SystemWidgetProviderBrowser(this.d, this);
        this.b = new WidgetInstanceListPanel(this.d, this);
        this.c.addChild(this.a.f());
        this.c.addChild(this.b.f());
    }

    public void a(b.a aVar) {
        this.b.a(aVar);
        a((com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase) this.b, true);
        com.censivn.C3DEngine.b.c.b.a(this);
    }

    public void a(com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase aVar, boolean z) {
        if (aVar != this.e) {
            if (this.e != null) {
                this.e.a(z);
            }
            this.e = aVar;
            this.e.b(z);
        }
    }

    public void c(boolean z) {
        com.censivn.C3DEngine.b.c.b.b(this);
        a(this.a, z);
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void c() {
        a((com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase) this.a, false);
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void d() {
        this.a.h();
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void e() {
        this.a.e();
        this.b.e();
        c(false);
        this.e = null;
    }

    @Override // com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase
    public void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }
}
