package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderShortcutGrid extends FolderPageItemBase {
    private com.censivn.C3DEngine.b.h.e.DockRendererB g;
    private com.censivn.C3DEngine.b.f.LabelRenderable h;
    private float i;

    public FolderShortcutGrid(com.tsf.shell.f.f.a.FolderPage hVar, com.tsf.shell.f.f.a.PageGridRenderer fVar) {
        super(hVar, fVar, FolderWidgetTouchHandler.d.drawer_hide, x.c(FolderWidgetTouchHandler.i.text_hide));
        float f = 0.8f * (com.tsf.shell.manager.o.ButtonPresetManager.c.U / com.tsf.shell.manager.o.ButtonPresetManager.a.U);
        this.i = com.tsf.shell.manager.o.ButtonPresetManager.a.U * f;
        this.g = new com.censivn.C3DEngine.b.h.e.DockRendererB(com.censivn.C3DEngine.b.b.ScreenConstants.D, this.i, com.tsf.shell.manager.o.ButtonPresetManager.a.U * f, 30.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c * f, 10.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c * f, f) { // from class: com.tsf.shell.f.f.a.c.FolderShortcutGrid.1
            @Override // com.censivn.C3DEngine.b.h.e.DockRendererB
            public void a(int i) {
                if (i > 0) {
                    com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.f.a.c.FolderShortcutGrid.1.1
                        @Override // com.censivn.C3DEngine.b.g.TweenParams
                        public void a() {
                            FolderShortcutGrid.this.h.visible(false);
                            FolderShortcutGrid.this.h.a();
                        }
                    };
                    dVar.h(com.censivn.C3DEngine.b.b.ScreenConstants.a(-150.0f));
                    dVar.a(0);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(FolderShortcutGrid.this.h);
                    com.censivn.C3DEngine.b.g.TweenUtils.a(FolderShortcutGrid.this.h, 300, dVar);
                    return;
                }
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar2.h(0.0f);
                dVar2.a(255);
                com.censivn.C3DEngine.b.g.TweenUtils.a(FolderShortcutGrid.this.h);
                com.censivn.C3DEngine.b.g.TweenUtils.a(FolderShortcutGrid.this.h, 300, dVar2);
                FolderShortcutGrid.this.h.visible(true);
            }

            @Override // com.censivn.C3DEngine.b.h.e.DockRendererB
            public void b(com.censivn.C3DEngine.b.f.IRenderable iVar) {
                com.tsf.shell.f.i.ShortcutItem cVar = iVar instanceof com.tsf.shell.f.i.ShortcutItem ? (com.tsf.shell.f.i.ShortcutItem) iVar : null;
                if (cVar != null && cVar.K() != null) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) cVar.K();
                    launcherShortcutAppInfo.isHide = false;
                    com.tsf.shell.manager.app.ServiceProvider.c().a(launcherShortcutAppInfo, 64);
                }
            }
        };
        addChild(this.g);
        this.h = new com.censivn.C3DEngine.b.f.LabelRenderable();
        this.h.c(FolderWidgetTouchHandler.i.notic_hide_app);
        this.h.d(38);
        this.h.e(-1);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.h, com.tsf.shell.manager.o.ThemeColorConstants.h);
        addChild(this.h);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.i) / 2.0f, i3, this.i / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void b() {
        this.h.a();
    }

    public void a(ArrayList<com.tsf.shell.f.i.PageItem> arrayList) {
        Iterator<com.tsf.shell.f.i.PageItem> it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.d(it.next());
        }
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void c(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
        this.b.b().c(cVar, motionEvent);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void d(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
        this.b.b().d(cVar, motionEvent);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void a(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.b.b().a(cVar, motionEvent, motionEvent2);
    }

    @Override // com.tsf.shell.f.f.a.c.FolderPageItemBase
    public void e(com.tsf.shell.f.i.ShortcutItem cVar, MotionEvent motionEvent) {
        if ((cVar.parent() instanceof com.tsf.shell.f.f.a.PageContainerBase) && (cVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase)) {
            this.a.c((com.tsf.shell.f.i.PageItem) cVar);
            this.g.d(cVar);
            if (cVar.K() != null) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) cVar.K();
                launcherShortcutAppInfo.isHide = true;
                com.tsf.shell.manager.app.ServiceProvider.c().a(launcherShortcutAppInfo, 68);
                return;
            }
            return;
        }
        if (cVar.parent() == this.g.l()) {
            cVar.visible(true);
            cVar.scale().setAll(1.0f, 1.0f, 1.0f);
            Number3FolderAppMenu.TEMPNUMBER3FolderAppMenu.reset();
            Number3d number3dLocalToGlobal = cVar.localToGlobal(Number3FolderAppMenu.TEMPNUMBER3D);
            this.g.removeChild(cVar);
            com.tsf.shell.f.f.a.PageContainerBase aVarAp = this.a.ap();
            cVar.position().setAllFrom(aVarAp.globalToLocal(number3dLocalToGlobal));
            aVarAp.addChildAt(cVar, 0);
            this.a.a(cVar, aVarAp, 0);
            this.a.ao().c();
        }
    }
}
