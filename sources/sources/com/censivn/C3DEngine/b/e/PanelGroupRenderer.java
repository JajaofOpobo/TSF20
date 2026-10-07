package com.censivn.C3DEngine.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PanelGroupRenderer extends DesktopPanelRenderer {
    private PanelBarRenderer a = new PanelBarRenderer();

    public PanelGroupRenderer() {
        a(this.a);
    }

    public void b(AbstractPanelRenderer fVar) {
        this.a.a(fVar);
    }

    public void a(AbstractPanelRenderer fVar, float f) {
        this.a.a(fVar, f);
    }

    public void c(AbstractPanelRenderer fVar) {
        this.a.removeChild(fVar);
    }
}
