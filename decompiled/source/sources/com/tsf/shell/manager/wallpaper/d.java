package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.Home;
import com.tsf.shell.manager.wallpaper.b;
/* loaded from: classes.dex */
public class d extends b.c {
    private a a;

    @Override // com.tsf.shell.manager.wallpaper.b.c
    public /* bridge */ /* synthetic */ void a(i iVar) {
        super.a(iVar);
    }

    public d(String str) {
        super(str);
        this.a = new a(com.censivn.C3DEngine.a.d(), b.c.b, b.c.c);
        a((i) this.a.getVirtualTarget());
    }

    @Override // com.tsf.shell.manager.wallpaper.b.c
    public void b() {
        this.a.a();
        super.b();
    }

    @Override // com.tsf.shell.manager.wallpaper.b.c
    public void a() {
        Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
        intent.setAction("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
        Home.b().a(intent, (Object) null);
    }
}
