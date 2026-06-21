package com.tsf.shell.f.h.a.a;

import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.censivn.C3DEngine.b.e.PanelGroupRenderer;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneElementHandler extends i {
    private d a;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer b;
    private com.censivn.C3DEngine.b.e.PercentLabelRenderer c;
    private com.tsf.shell.f.h.a.ScenePositionConfig d;

    public SceneElementHandler(d dVar) {
        this.a = dVar;
        a(SceneNodeAnimator.i.text_preferences);
        com.censivn.C3DEngine.b.e.IconButtonRenderer aVar = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.b = aVar;
        aVar.h(SceneNodeAnimator.i.text_show_recents);
        aVar.a(new SceneNodeContainer.C0027a() { // from class: com.tsf.shell.f.h.a.a.SceneElementHandler.1
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                return true;
            }
        });
        b(aVar);
        com.censivn.C3DEngine.b.e.PercentLabelRenderer eVar = new com.censivn.C3DEngine.b.e.PercentLabelRenderer();
        this.c = eVar;
        eVar.g(SceneNodeAnimator.i.text_show_recents);
        eVar.h(SceneNodeAnimator.i.mn_contacts_maximum);
        eVar.a("");
        eVar.i(3);
        eVar.j(10);
        this.d = new com.tsf.shell.f.h.a.ScenePositionConfig();
        b(this.d);
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void h() {
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        this.b.c(this.a.k().c());
        this.c.k(this.a.k().a());
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void g() {
        if (this.b.e() != this.a.k().visible()) {
            this.a.k().a(this.b.e());
        }
        com.tsf.shell.manager.app.ServiceFactory.a().a(this.d.e());
    }
}
