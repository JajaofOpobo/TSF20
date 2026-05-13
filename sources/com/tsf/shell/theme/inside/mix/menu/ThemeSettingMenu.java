package com.tsf.shell.theme.inside.mix.menu;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2578b;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeFeaturedMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeInstalledMenu;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeMixMenu;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemeSettingMenu extends AbstractC2593d {
    public ThemeInstalledMenu localMenu;

    public ThemeSettingMenu() {
        super(600.0f * C0892a.f2567c);
        this.localMenu = new ThemeInstalledMenu(this);
        ArrayList<C2578b> arrayList = new ArrayList<>();
        arrayList.add(new ThemeMixMenu(this));
        arrayList.add(this.localMenu);
        arrayList.add(new ThemeFeaturedMenu(this));
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onShow() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.AbstractC2593d
    public void onHide() {
    }

    public void pausePreviewEffect() {
        C3359a.f11094h.m4021s().m3915b(500);
    }
}
