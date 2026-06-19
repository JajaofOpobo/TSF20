package com.tsf.shell.f.i.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerItemEffect extends DrawerItemVisual {
    private com.tsf.shell.manager.app.LauncherAppInfo a;

    public e() {
        this.k.visible(true);
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerItemVisual, com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    protected void k() {
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerItemVisual
    public void aV() {
        this.a.a();
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerItemVisual, com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public void l() {
        this.a.a();
    }

    public void a(g gVar) {
        this.a = gVar.bd();
        this.k.textures().removeAll();
        this.k.textures().addElement(this.a.d);
    }

    public void aW() {
        this.k.textures().removeAll();
        this.a = null;
    }
}
