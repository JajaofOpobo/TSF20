package com.tsf.shell.f.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends b {
    private int a;
    private j b;

    public i(int i, LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        this.k.visible(false);
        this.a = i;
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.i.1
                @Override // java.lang.Runnable
                public void run() {
                    i.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        if (this.b != null) {
            this.b.dispatchDraw();
        }
    }

    public j q() {
        return this.b;
    }

    public int aV() {
        return this.a;
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public void l() {
        super.l();
        this.b.aV();
    }

    @Override // com.tsf.shell.f.i.b.e.b
    protected void k() {
        com.tsf.shell.manager.a.d.c.a(this);
    }

    public void a(j jVar) {
        this.b = jVar;
    }

    public void aW() {
        this.b = null;
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        com.tsf.shell.manager.a.d.c.b(this);
        super.g();
    }
}
