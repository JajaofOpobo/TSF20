package com.tsf.shell.manager.r.b.a;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.GridRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppListItemCell extends com.tsf.shell.f.i.b.e.DrawerShortcutItemBase {
    private static k a;
    private static TextureElement b;
    private boolean p;

    public AppListItemCell() {
        super(null, com.tsf.shell.manager.o.ButtonPresetManager.a);
        this.p = false;
        if (a == null) {
            a = new GridRenderable(64.0f, 64.0f, 1, 1, true);
            AppListPanel.position().x = 32.0f * com.censivn.C3DEngine.b.b.ScreenConstants.a;
            AppListPanel.position().y = 40.0f * com.censivn.C3DEngine.b.b.ScreenConstants.a;
            b = new TextureElement(0, false);
            AppListPanel.textures().addElementWithoutVerify(b);
        }
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        if (this.p) {
            AppSelectionIndicatorBar.id = f.id;
            AppListPanel.dispatchDraw();
        }
    }

    public void a(boolean z) {
        this.p = z;
    }

    @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase
    public void k() {
    }
}
