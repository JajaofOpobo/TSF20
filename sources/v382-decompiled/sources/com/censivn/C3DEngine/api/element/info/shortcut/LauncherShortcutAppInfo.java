package com.censivn.C3DEngine.api.element.info.shortcut;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.e.i.b.e.i;
import com.tsf.shell.manager.a;

/* loaded from: classes.dex */
public class LauncherShortcutAppInfo extends LauncherShortcut3DInfo {
    public int clickCount;
    public boolean isHide;
    public int versionCode;
    public String versionName;

    public void applicationOnClick() {
        this.clickCount++;
        a.w.c().a(this, 32);
        a.w.a().a().a(this);
    }

    public LauncherShortcutAppInfo() {
        super(2);
    }

    public void reloadTexture() {
        if (this.texture.id != 0 && getWidget() != null) {
            com.censivn.C3DEngine.a.g().a(this.texture, com.tsf.shell.manager.r.c.a.a(this, ((i) getWidget()).n, ((i) getWidget()).bd()));
        }
        if (getWidget() != null) {
            getWidget().C();
        }
    }

    public static TextureElement getTexture(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.o.a aVar, com.tsf.shell.manager.a.i iVar) {
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.isCustomTexture()) {
            com.censivn.C3DEngine.a.g().a(launcherShortcutAppInfo.texture, com.tsf.shell.manager.r.c.a.a(launcherShortcutAppInfo, aVar, iVar));
            return launcherShortcutAppInfo.texture;
        }
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.texture.id != 0) {
            com.censivn.C3DEngine.a.g().a(launcherShortcutAppInfo.texture);
        }
        if (iVar.d.id == 0) {
            com.censivn.C3DEngine.a.g().a(iVar.d, com.tsf.shell.manager.r.c.a.a(null, aVar, iVar));
        }
        return iVar.d;
    }

    @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo
    public Bitmap getIconBitmap() {
        return com.tsf.shell.manager.r.c.a.a((LauncherShortcutAppInfo) getWidget().K(), ((i) getWidget()).n, ((i) getWidget()).bd());
    }
}
