package com.censivn.C3DEngine.api.element.info.shortcut;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.f.i.b.e.DrawerItemVisual;
import com.tsf.shell.manager.GlobalServiceLocator;
import com.tsf.shell.manager.app.LauncherAppInfo;
import com.tsf.shell.manager.o.ButtonMetrics;
import com.tsf.shell.f.i.PageItem;
import com.tsf.shell.manager.r.c.IconRenderer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LauncherShortcutAppInfo extends LauncherShortcut3DInfo {
    public int clickCount;
    public boolean isHide;
    public int versionCode;
    public String versionName;

    public void applicationOnClick() {
        this.clickCount++;
        GlobalServiceLocator.w.h_().a(this, 32);
        GlobalServiceLocator.w.a().a().a(this);
    }

    public LauncherShortcutAppInfo() {
        super(2);
    }

    public void reloadTexture() {
        if (this.texture.id != 0 && getWidget() != null) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.texture, IconRenderer.a(this, ((DrawerItemVisual) getWidget()).n, ((DrawerItemVisual) getWidget()).bd()));
        }
        if (getWidget() != null) {
            ((PageItem) getWidget()).C();
        }
    }

    public static TextureElement getTexture(LauncherShortcutAppInfo launcherShortcutAppInfo, ButtonMetrics aVar, LauncherAppInfo fVar) {
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.isCustomTexture()) {
            com.censivn.C3DEngine.C3DEngine.g().a(launcherShortcutAppInfo.texture, IconRenderer.a(launcherShortcutAppInfo, aVar, fVar));
            return launcherShortcutAppInfo.texture;
        }
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.texture.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(launcherShortcutAppInfo.texture);
        }
        if (fVar.d.id == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(fVar.d, IconRenderer.a(null, aVar, fVar));
        }
        return fVar.d;
    }

    @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo
    public Bitmap getIconBitmap() {
        return IconRenderer.a((LauncherShortcutAppInfo) ((PageItem) getWidget()).K(), ((DrawerItemVisual) getWidget()).n, ((DrawerItemVisual) getWidget()).bd());
    }
}
