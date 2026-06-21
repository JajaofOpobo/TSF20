package com.tsf.shell.theme.inside.mix.menu;

import com.censivn.C3DEngine.b.b.a;
import com.tsf.shell.e.e.g.e;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeSettingMenu extends e {
    public ThemeInstalledMenu localMenu;

    public ThemeSettingMenu() {
        super(600.0f * a.c);
        this.localMenu = new ThemeInstalledMenu(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeMixMenu(this));
        arrayList.add(this.localMenu);
        arrayList.add(new ThemeFeaturedMenu(this));
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.e.e.g.e
    public void onShow() {
    }

    @Override // com.tsf.shell.e.e.g.e
    public void onHide() {
    }

    public void pausePreviewEffect() {
        com.tsf.shell.manager.a.h.s().b(500);
    }
}
