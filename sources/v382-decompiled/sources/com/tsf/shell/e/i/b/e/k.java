package com.tsf.shell.e.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;

/* loaded from: classes.dex */
public class k extends b {
    private int a;
    private l b;

    public k(int i, LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        this.k.visible(false);
        this.a = i;
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.i.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.e.k.1
                @Override // java.lang.Runnable
                public void run() {
                    k.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        if (this.b != null) {
            this.b.dispatchDraw();
        }
    }

    public l q() {
        return this.b;
    }

    public int aV() {
        return this.a;
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void l() {
        super.l();
        this.b.aV();
    }

    @Override // com.tsf.shell.e.i.b.e.b
    protected void k() {
        com.tsf.shell.manager.a.d.c.a(this);
    }

    public void a(l lVar) {
        this.b = lVar;
    }

    public void aW() {
        this.b = null;
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void g() {
        com.tsf.shell.manager.a.d.c.b(this);
        super.g();
    }
}
