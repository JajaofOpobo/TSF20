package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.tsf.shell.Home;
import com.tsf.shell.manager.wallpaper.C3755b;
/* renamed from: com.tsf.shell.manager.wallpaper.d */
/* loaded from: classes.dex */
public class C3769d extends C3755b.C3764c {

    /* renamed from: a */
    private C3751a f12371a;

    @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1534a(C0975i c0975i) {
        super.mo1534a(c0975i);
    }

    public C3769d(String str) {
        super(str);
        this.f12371a = new C3751a(C0853a.m10856d(), C3755b.C3764c.f12360b, C3755b.C3764c.f12361c);
        mo1534a((C0975i) this.f12371a.getVirtualTarget());
    }

    @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
    /* renamed from: b */
    public void mo1533b() {
        this.f12371a.m1560a();
        super.mo1533b();
    }

    @Override // com.tsf.shell.manager.wallpaper.C3755b.C3764c
    /* renamed from: a */
    public void mo1535a() {
        Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
        intent.setAction("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
        Home.m6177b().m6182a(intent, (Object) null);
    }
}
