package com.tsf.shell.f.i.b.e;

import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerItemLaunchAction extends DrawerShortcutItemBase {
    private int a;
    private DrawerItemSettingsAction b;

    public DrawerItemLaunchAction(int i, LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.ButtonMetrics aVar, boolean z) {
        super(launcherShortcut3DInfo, aVar);
        this.k.visible(false);
        this.a = i;
        if (z) {
            com.tsf.shell.manager.bind.ShellBindController.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            DrawerItemLaunchAction();
        } else {
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.DrawerItemLaunchAction.1
                @Override // java.lang.Runnable
                public void run() {
                    DrawerItemLaunchAction.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildStart() {
        if (this.b != null) {
            this.b.dispatchDraw();
        }
    }

    public DrawerItemSettingsAction q() {
        return this.b;
    }

    public int aV() {
        return this.a;
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public void l() {
        super.l();
        this.b.aV();
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    protected void k() {
        com.tsf.shell.manager.app.FolderManager.c.a(this);
    }

    public void a(DrawerItemSettingsAction jVar) {
        this.b = jVar;
    }

    public void aW() {
        this.b = null;
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        com.tsf.shell.manager.app.FolderManager.c.b(this);
        super.g();
    }
}
