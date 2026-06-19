package com.tsf.shell.theme.inside.mix.menu;

import com.censivn.C3DEngine.b.b.A;
import com.tsf.shell.f.e._g.a.b;
import com.tsf.shell.f.e._g.MenuOverlay;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeSettingMenu extends d {
    public ThemeInstalledMenu localMenu;

    public ThemeSettingMenu() {
        super(600.0f * a.c);
        this.localMenu = new ThemeInstalledMenu(this);
        ArrayList<b> arrayList = new ArrayList<>();
        arrayList.add(new ThemeMixMenu(this));
        arrayList.add(this.localMenu);
        arrayList.add(new ThemeFeaturedMenu(this));
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.f.e._g.MenuOverlay
    public void onShow() {
    }

    @Override // com.tsf.shell.f.e._g.MenuOverlay
    public void onHide() {
    }

    public void pausePreviewEffect() {
        com.tsf.shell.manager.app.StateHub.s().b(500);
    }
}
