package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public class k extends h {
    private a a;

    @Override // com.tsf.shell.manager.wallpaper.h
    public /* bridge */ /* synthetic */ void a(com.censivn.C3DEngine.b.f.j jVar) {
        super.a(jVar);
    }

    public k(String str) {
        super(str);
        this.a = new a(com.censivn.C3DEngine.a.d(), h.b, h.c);
        a((com.censivn.C3DEngine.b.f.j) this.a.getVirtualTarget());
    }

    @Override // com.tsf.shell.manager.wallpaper.h
    public void b() {
        this.a.a();
        super.b();
    }

    @Override // com.tsf.shell.manager.wallpaper.h
    public void a() {
        Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
        intent.setAction("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
        Home.b().a(intent, (Object) null);
    }
}
