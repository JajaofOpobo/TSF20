package com.tsf.shell.theme.inside.mix.menu;

import com.censivn.C3DEngine.b.b.a;
import com.tsf.shell.f.e.g.a.b;
import com.tsf.shell.f.e.g.d;
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

    @Override // com.tsf.shell.f.e.g.d
    public void onShow() {
    }

    @Override // com.tsf.shell.f.e.g.d
    public void onHide() {
    }

    public void pausePreviewEffect() {
        com.tsf.shell.manager.a.h.s().b(500);
    }
}
