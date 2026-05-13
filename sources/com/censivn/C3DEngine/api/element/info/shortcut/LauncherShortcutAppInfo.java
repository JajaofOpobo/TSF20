package com.censivn.C3DEngine.api.element.info.shortcut;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p187r.p193c.C3695a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
/* loaded from: classes.dex */
public class LauncherShortcutAppInfo extends LauncherShortcut3DInfo {
    public int clickCount;
    public boolean isHide;
    public int versionCode;
    public String versionName;

    public void applicationOnClick() {
        this.clickCount++;
        C3359a.f11109w.m2708c().m2733a(this, 32);
        C3359a.f11109w.m2716a().m2749a().m2691a(this);
    }

    public LauncherShortcutAppInfo() {
        super(2);
    }

    public void reloadTexture() {
        if (this.texture.f2529id != 0 && getWidget() != null) {
            C0853a.m10853g().m10540a(this.texture, C3695a.m1690a(this, ((C3222g) getWidget()).f10498n, ((C3222g) getWidget()).m3106bd()));
        }
        if (getWidget() != null) {
            getWidget().mo3118C();
        }
    }

    public static TextureElement getTexture(LauncherShortcutAppInfo launcherShortcutAppInfo, C3560a c3560a, C3377f c3377f) {
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.isCustomTexture()) {
            C0853a.m10853g().m10540a(launcherShortcutAppInfo.texture, C3695a.m1690a(launcherShortcutAppInfo, c3560a, c3377f));
            return launcherShortcutAppInfo.texture;
        }
        if (launcherShortcutAppInfo != null && launcherShortcutAppInfo.texture.f2529id != 0) {
            C0853a.m10853g().m10543a(launcherShortcutAppInfo.texture);
        }
        if (c3377f.f11171d.f2529id == 0) {
            C0853a.m10853g().m10540a(c3377f.f11171d, C3695a.m1690a(null, c3560a, c3377f));
        }
        return c3377f.f11171d;
    }

    @Override // com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo
    public Bitmap getIconBitmap() {
        return C3695a.m1690a((LauncherShortcutAppInfo) getWidget().m3534K(), ((C3222g) getWidget()).f10498n, ((C3222g) getWidget()).m3106bd());
    }
}
