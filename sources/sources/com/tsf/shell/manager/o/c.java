package com.tsf.shell.manager.o;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    public static final Color4 a = a(255, 255, 255, 255);
    public static final Color4 b = a(240, 255, 255, 255);
    public static final Color4 c = a(180, 255, 50, 0);
    public static final Color4 d = a(ItemInfo.APP_INTENT, 0, 0, 0);
    public static final Color4 e = a(210, 255, 255, 255);
    public static final Color4 f = a(50, e.r, e.g, e.b);
    public static final Color4 g = a(70, e.r, e.g, e.b);
    public static final Color4 h = a(VEasing.Back.easeIn, 255, 255, 255);
    public static final Color4 i = a(140, h.r, h.g, h.b);
    public static final Color4 j = a(50, h.r, h.g, h.b);
    public static final Color4 k = a(100, h.r, h.g, h.b);
    public static final Color4 l = a(255, 0, 192, 255);
    public static final Color4 m = a(255, 255, 255, 255);
    public static final Color4 n = a(ThemeFeaturedMenu.NOTIF_POINT_VERSION_CODE_130, h.r, h.g, h.b);
    public static final Color4 o = a(119, 34, 34, 34);
    public static final Color4 p = a(255, 160, 160, 160);

    public static void a(i iVar, Color4 color4) {
        iVar.setDefaultColor(color4);
    }

    public static void a() {
    }

    public static Color4 a(int i2, int i3, int i4, int i5) {
        return new Color4(i3, i4, i5, i2);
    }
}
