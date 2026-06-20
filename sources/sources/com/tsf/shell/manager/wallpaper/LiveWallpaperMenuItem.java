package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.Home;
import com.tsf.shell.manager.wallpaper.WallpaperMenuPanel;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LiveWallpaperMenuItem extends WallpaperMenuPanel.MenuItem {
    private WallpaperPreviewRenderer a;

    @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.MenuItem
    public /* bridge */ /* synthetic */ void a(i iVar) {
        super.a(iVar);
    }

    public LiveWallpaperMenuItem(String str) {
        super(str);
        this.a = new WallpaperPreviewRenderer(com.censivn.C3DEngine.C3DEngine.d(), WallpaperMenuPanel.MenuItem.b, WallpaperMenuPanel.MenuItem.c);
        a((i) this.a.getVirtualTarget());
    }

    @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.MenuItem
    public void b() {
        this.a.a();
        super.b();
    }

    @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.MenuItem
    public void a() {
        Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
        intent.setAction("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
        Home.b().a(intent, (Object) null);
    }
}
