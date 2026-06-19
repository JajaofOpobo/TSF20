package com.tsf.shell.f.f.a._c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSettingsPage extends DrawerPageItemBase {
    private static com.tsf.shell.f.e.CircleDotNode l;
    private ArrayList<com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot> g;
    private com.censivn.C3DEngine.b.f.j h;
    private float i;
    private float j;
    private com.tsf.shell.f.f.a._c._a.DrawerIconLoaderTask k;

    public static class a {
        public class String 
        public int c;

        public a(int i, String str) {
            this.c = i;
            this.b = str;
        }

        public void a() {
        }
    }

    public k(com.tsf.shell.f.f.a.FolderPage hVar, com.tsf.shell.f.f.a.PageGridRenderer fVar) {
        super(hVar, fVar, 0, x.c(DrawerWidgetTouchHandler.i.text_more));
        this.g = new ArrayList<>();
        com.tsf.shell.f.f.a._c._a.DrawerIconLoaderTask aVar = new com.tsf.shell.f.f.a._c._a.DrawerIconLoaderTask(new a(DrawerWidgetTouchHandler.d.drawer_classification, x.c(DrawerWidgetTouchHandler.i.text_classify)));
        this.k = aVar;
        this.k.a(com.tsf.shell.manager.p.ThemePreferenceProvider.j);
        this.g.add(aVar);
        this.g.add(new com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot(new a(DrawerWidgetTouchHandler.d.drawer_preferences, x.c(DrawerWidgetTouchHandler.i.text_preferences)) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.1
            @Override // com.tsf.shell.f.f.a._c.DrawerSettingsPage.a
            public void a() {
                com.tsf.shell.manager.app.PreferenceProvider.d().d();
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot(new a(DrawerWidgetTouchHandler.d.drawer_clean, x.c(DrawerWidgetTouchHandler.i.text_clean)) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.2
            @Override // com.tsf.shell.f.f.a._c.DrawerSettingsPage.a
            public void a() {
                com.tsf.shell.e.a(DrawerWidgetTouchHandler.i.mn_next_version_release);
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot(new a(DrawerWidgetTouchHandler.d.drawer_more_manager, x.c(DrawerWidgetTouchHandler.i.menu_manage_apps)) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.3
            @Override // com.tsf.shell.f.f.a._c.DrawerSettingsPage.a
            public void a() {
                Home.b().m();
            }
        }));
        this.g.add(new com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot(new a(DrawerWidgetTouchHandler.d.drawer_more_reset, x.c(DrawerWidgetTouchHandler.i.text_reset)) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.4
            @Override // com.tsf.shell.f.f.a._c.DrawerSettingsPage.a
            public void a() {
                com.tsf.shell.manager.app.StateHub.t().am().c();
            }
        }));
        this.h = new com.censivn.C3DEngine.b.f.j();
        this.h.position().y = com.censivn.C3DEngine.b.b.A.a(20.0f);
        this.i = com.censivn.C3DEngine.b.b.A.b(12.0f) + com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot.a;
        this.j = ((-this.i) * 2.0f) / 2.0f;
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot bVar = this.g.get(DrawerPageItemBase);
            bVar.position().x = f;
            if (i > 2) {
                bVar.visible(false);
                bVar.alpha(0.0f);
            } else if (i < 2) {
                f += this.i;
            }
            this.h.addChild(bVar);
        }
        e().addChild(this.h);
        DrawerLabelElement.a aVarA = com.tsf.shell.manager.app.AppListManager.a(com.tsf.shell.manager.p.ThemePreferenceProvider.i);
        if (aVarA.a()) {
            l = new com.tsf.shell.f.e.CircleDotNode();
            aVarA.a(new DrawerLabelElement.a.C0142a() { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.5
                @Override // com.tsf.shell.manager.p.ThemePreferenceProvider.a.C0142a
                public void a() {
                    k.l.removeFromParent();
                    k.l.a();
                }
            });
            l = new com.tsf.shell.f.e.CircleDotNode();
            DrawerSpringPhysics.position().y = com.censivn.C3DEngine.b.b.A.a(54.0f);
            DrawerSpringPhysics.position().x = com.censivn.C3DEngine.b.b.A.a(70.0f);
            e().addChild(DrawerSpringPhysics);
        }
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void n() {
        super.n();
        com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot.j();
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void p() {
        com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot.k();
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void b(boolean z) {
        Number3d.TEMPNUMBER3D.reset();
        this.h.localToGlobal(Number3d.TEMPNUMBER3D);
        this.b.h().globalToLocal(Number3d.TEMPNUMBER3D);
        float fA = com.censivn.C3DEngine.b.b.A.a(200.0f);
        float f = Number3d.TEMPNUMBER3D.x;
        float f2 = Number3d.TEMPNUMBER3D.y;
        float f3 = com.tsf.shell.f.f.a.PageGridRenderer.c;
        int iNumChildren = this.h.numChildren();
        float fA2 = com.censivn.C3DEngine.b.b.A.a(20.0f);
        int i = 0;
        float f4 = f3;
        while (i < iNumChildren) {
            com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot bVar = this.g.get(DrawerPageItemBase);
            bVar.removeFromParent();
            this.b.h().addChild(bVar);
            bVar.position().setAll(bVar.position().x + f, bVar.position().y + f2, 0.0f);
            bVar.b((i * 20) + 250);
            if (i < 3) {
                com.censivn.C3DEngine.b.g._c.a.a aVar = new com.censivn.C3DEngine.b.g._c.a.a(bVar, (i / 3) + 2, fA) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.6
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(f4);
                aVar.h(fA2);
                aVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.7
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                dVar.f(f4);
                dVar.h(fA2);
                dVar.a(255);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, dVar);
            }
            bVar.visible(true);
            i++;
            f4 += com.tsf.shell.f.f.a.PageGridRenderer.d;
        }
        this.b.e();
    }

    public void c() {
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void a() {
        this.b.f();
        this.k.a();
        float f = this.j;
        for (int i = 0; i < this.g.size(); i++) {
            Number3d.TEMPNUMBER3D.reset();
            final com.tsf.shell.f.f.a._c._a.DrawerIndicatorDot bVar = this.g.get(DrawerPageItemBase);
            bVar.i();
            bVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.h.globalToLocal(Number3d.TEMPNUMBER3D);
            bVar.position().setAllFrom(Number3d.TEMPNUMBER3D);
            float fA = com.censivn.C3DEngine.b.b.A.a(200.0f);
            if (i < 3) {
                com.censivn.C3DEngine.b.g._c.a.a aVar = new com.censivn.C3DEngine.b.g._c.a.a(bVar, (i / 3) + 2, fA) { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.8
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                    }
                };
                aVar.b(i % 2 == 0);
                aVar.f(DrawerShortcutGrid);
                if (i != 2) {
                    f += this.i;
                }
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, (i * 50) + 600, aVar);
            } else {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a._c.DrawerSettingsPage.9
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        bVar.visible(false);
                    }
                };
                dVar.f(DrawerShortcutGrid);
                dVar.h(0.0f);
                dVar.a(0);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, 600, dVar);
            }
            bVar.removeFromParent();
            this.h.addChild(bVar);
        }
        Number3d.TEMPNUMBER3D.reset();
        this.h.localToGlobal(Number3d.TEMPNUMBER3D);
        e().globalToLocal(Number3d.TEMPNUMBER3D);
        this.h.position().setAllFrom(Number3d.TEMPNUMBER3D);
        this.h.removeFromParent();
        e().addChild(this.h);
    }
}
