package com.censivn.C3DEngine.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class AbstractPanelRenderer extends com.censivn.C3DEngine.b.b.DesktopRenderer {
    private boolean a = true;
    public PanelBarRenderer c;

    public abstract void f();

    public abstract void g();

    public void a(PanelBarRenderer dVar) {
        this.c = dVar;
    }

    public void i() {
        mouseEnabled(false);
    }

    public void j() {
        mouseEnabled(true);
    }

    public boolean k() {
        return this.a;
    }

    public void l() {
        this.a = false;
    }
}
