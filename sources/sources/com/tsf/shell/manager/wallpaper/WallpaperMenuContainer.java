package com.tsf.shell.manager.wallpaper;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperMenuContainer extends com.tsf.shell.f.e._g.MenuOverlay {
    private WallpaperMenuPanel a;

    public WallpaperMenuContainer() {
        super(630.0f * com.censivn.C3DEngine.b.b.A.c);
        ArrayList<com.tsf.shell.f.e._g.a.MenuActionItem> arrayList = new ArrayList<>();
        this.a = new WallpaperMenuPanel(this);
        arrayList.add(this.a);
        setMenuItems(arrayList);
    }
}
