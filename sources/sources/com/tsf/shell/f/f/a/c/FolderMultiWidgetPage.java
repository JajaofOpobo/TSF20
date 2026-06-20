package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.tsf.b;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderMultiWidgetPage extends FolderPageItemBase {
    private com.censivn.C3DEngine.b.h.e.DockRenderer g;
    private com.tsf.shell.f.f.a.d.DrawerSortManager h;
    private ArrayList<com.tsf.shell.f.g.a.GestureMenuRenderer> i;
    private com.tsf.shell.f.g.a.GestureMenuRenderer j;
    private com.censivn.C3DEngine.b.f.LabelRenderable k;
    private float l;

    public FolderMultiWidgetPage(com.tsf.shell.f.f.a.FolderPage hVar, com.tsf.shell.f.f.a.PageGridRenderer fVar) {
        super(hVar, fVar, FolderWidgetTouchHandler.d.drawer_sort, x.c(FolderWidgetTouchHandler.i.text_sort));
        this.h = com.tsf.shell.manager.app.ServiceProvider.b();
        d();
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void b(boolean z) {
        c();
        this.b.e();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.f.g.a.GestureMenuRenderer hVar = this.i.get(i2);
                com.tsf.shell.f.f.a.d.a.DrawerSortBase cVarA = this.h.a(i2);
                hVar.e.textures().addElement(cVarA.a(com.tsf.shell.f.g.a.GestureMenuRenderer.e(), com.tsf.shell.f.g.a.GestureMenuRenderer.f()));
                if (cVarA == this.h.b()) {
                    this.j = hVar;
                    hVar.g();
                } else {
                    hVar.h();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.l) / 2.0f, i3, this.l / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.h.a()) {
                com.tsf.shell.f.g.a.GestureMenuRenderer hVar = this.i.get(i2);
                this.h.a(i2).h();
                hVar.e.textures().clear();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.k.a(this.h.b().c());
    }

    private void d() {
        this.k = new com.censivn.C3DEngine.b.f.LabelRenderable();
        this.k.d(38);
        this.k.position().y = com.censivn.C3DEngine.b.b.A.a(145.0f);
        this.i = new ArrayList<>();
        float f = 0.0f;
        float fMaxY = 0.0f;
        final int i = 0;
        while (i < this.h.a()) {
            final com.tsf.shell.f.g.a.GestureMenuRenderer hVar = new com.tsf.shell.f.g.a.GestureMenuRenderer(1.0f);
            hVar.e.scale().setAll(0.8f, 0.8f, 1.0f);
            hVar.e.position().y = com.censivn.C3DEngine.b.b.A.a(20.0f);
            com.tsf.shell.manager.o.ThemeColorConstants.a(hVar, com.tsf.shell.manager.o.ThemeColorConstants.h);
            com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(hVar) { // from class: com.tsf.shell.f.f.a.c.FolderMultiWidgetPage.1
                @Override // com.censivn.C3DEngine.b.d.a
                public void a(MotionEvent motionEvent) {
                    if (com.tsf.shell.manager.app.StateHub.t().aL()) {
                        m.this.h.b(m.this.h.a(FolderPageItemBase).k());
                        w.b();
                        if (m.this.j != null) {
                            m.this.j.h();
                        }
                        m.this.j = hVar;
                        hVar.g();
                        m.this.c();
                    }
                }
            };
            hVar.calAABB();
            hVar.setMouseEventListener(aVar);
            fMaxY = hVar.maxY() - hVar.minY();
            float fMaxX = hVar.maxX() - hVar.minX();
            this.i.add(hVar);
            i++;
            f = fMaxX;
        }
        this.l = fMaxY;
        this.g = new com.censivn.C3DEngine.b.h.e.DockRenderer(com.censivn.C3DEngine.b.b.A.D, fMaxY, f * 0.8f, 80.0f * com.censivn.C3DEngine.b.b.A.c, 40.0f * com.censivn.C3DEngine.b.b.A.c);
        this.g.d();
        this.g.d();
        addChild(this.g);
        for (int i2 = 0; i2 < this.h.a(); i2++) {
            this.g.addChild(this.i.get(i2));
        }
        addChild(this.k);
    }
}
