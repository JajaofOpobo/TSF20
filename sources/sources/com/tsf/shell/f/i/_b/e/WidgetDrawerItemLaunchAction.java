package com.tsf.shell.f.i._b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDrawerItemLaunchAction extends WidgetDrawerShortcutItemBase {
    private int a;
    private j b;

    public i(int i, LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.ButtonMetrics aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        this.k.visible(false);
        this.a = i;
        if (z) {
            com.tsf.shell.manager.bind.ShellBindController.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            k();
        } else {
            com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemLaunchAction.1
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

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    public void l() {
        super.l();
        this.b.aV();
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    protected void k() {
        com.tsf.shell.manager.app.FolderManager.c.a(this);
    }

    public void a(j jVar) {
        this.b = jVar;
    }

    public void aW() {
        this.b = null;
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        com.tsf.shell.manager.app.FolderManager.c.b(this);
        super.g();
    }
}
