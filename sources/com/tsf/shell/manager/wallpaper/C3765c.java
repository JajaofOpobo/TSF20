package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0953h;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.p096f.p118e.C2637l;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2583d;
/* renamed from: com.tsf.shell.manager.wallpaper.c */
/* loaded from: classes.dex */
public class C3765c extends C2583d {

    /* renamed from: a */
    private C0980j f12364a;

    /* renamed from: b */
    private C2637l f12365b;

    /* renamed from: c */
    private C0953h f12366c;

    /* renamed from: d */
    private int f12367d;

    public C3765c() {
        setTitle(C1306b.C1315i.text_wallpaper_blur);
        setMenuHeight(C0892a.m10742a(330.0f));
        this.f12364a = new C0980j();
        this.f12365b = new C2637l(C1306b.C1310d.button_reset, C1306b.C1315i.text_reset) { // from class: com.tsf.shell.manager.wallpaper.c.1
            @Override // com.tsf.shell.p096f.p118e.C2637l
            /* renamed from: a */
            public void mo731a() {
                C3765c.this.f12366c.m10485a(0, true);
            }
        };
        C3567c.m1967a(this.f12365b, C3567c.f11849h);
        this.f12365b.m5099a(0);
        this.f12365b.position().f2527y = C0892a.m10742a(-250.0f);
        this.f12366c = new C0950e() { // from class: com.tsf.shell.manager.wallpaper.c.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0950e, com.censivn.C3DEngine.p031b.p037e.C0953h
            /* renamed from: f */
            public void mo866f(int i) {
                m10475d(i + "%");
            }
        };
        this.f12366c.m10472g(C1306b.C1315i.text_level);
        this.f12366c.m10469i(0);
        this.f12366c.m10468j(100);
        this.f12366c.m10620b((int) C0892a.m10742a(850.0f));
        this.f12366c.position().f2527y = C0892a.m10742a(10.0f);
        this.f12366c.m10484a(new C0953h.C0955a() { // from class: com.tsf.shell.manager.wallpaper.c.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public boolean mo733a(int i) {
                C3765c.this.f12367d = i;
                C3359a.f11092f.m1596b(i);
                return true;
            }
        });
        this.f12364a.addChild(this.f12366c);
        this.f12364a.addChild(this.f12365b);
    }

    /* renamed from: a */
    private void m1538a() {
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public C0980j getContentContainer() {
        return this.f12364a;
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onLayout(float f, float f2, float f3, float f4) {
        super.onLayout(f, f2, f3, f4);
        m1538a();
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onShow() {
        super.onShow();
        m1538a();
        this.f12366c.mo539f();
        this.f12367d = C3359a.f11092f.m1573j();
        this.f12366c.mo865k(this.f12367d);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void onHideComplete() {
        recycle();
        C3359a.f11092f.m1590c(this.f12367d);
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d
    public void onRequestExit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.p096f.p118e.p127g.p128a.C2583d, com.tsf.shell.p096f.p118e.p127g.p128a.AbstractC2580c
    public void recycle() {
        super.recycle();
        removeIcon();
        this.f12365b.m5098b();
        this.f12366c.mo538g();
    }
}
