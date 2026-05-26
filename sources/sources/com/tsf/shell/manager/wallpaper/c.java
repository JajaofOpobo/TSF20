package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.b.e.h;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.l;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.tsf.shell.f.e.g.a.d {
    private j a;
    private l b;
    private h c;
    private int d;

    public c() {
        setTitle(b.i.text_wallpaper_blur);
        setMenuHeight(com.censivn.C3DEngine.b.b.a.a(330.0f));
        this.a = new j();
        this.b = new l(b.d.button_reset, b.i.text_reset) { // from class: com.tsf.shell.manager.wallpaper.c.1
            @Override // com.tsf.shell.f.e.l
            public void a() {
                c.this.c.a(0, true);
            }
        };
        com.tsf.shell.manager.o.c.a(this.b, com.tsf.shell.manager.o.c.h);
        this.b.a(0);
        this.b.position().y = com.censivn.C3DEngine.b.b.a.a(-250.0f);
        this.c = new com.censivn.C3DEngine.b.e.e() { // from class: com.tsf.shell.manager.wallpaper.c.2
            @Override // com.censivn.C3DEngine.b.e.e, com.censivn.C3DEngine.b.e.h
            public void f(int i) {
                d(i + "%");
            }
        };
        this.c.g(b.i.text_level);
        this.c.i(0);
        this.c.j(100);
        this.c.b((int) com.censivn.C3DEngine.b.b.a.a(850.0f));
        this.c.position().y = com.censivn.C3DEngine.b.b.a.a(10.0f);
        this.c.a(new h.a() { // from class: com.tsf.shell.manager.wallpaper.c.3
            @Override // com.censivn.C3DEngine.b.e.h.a
            public boolean a(int i) {
                c.this.d = i;
                com.tsf.shell.manager.a.f.b(i);
                return true;
            }
        });
        this.a.addChild(this.c);
        this.a.addChild(this.b);
    }

    private void a() {
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public j getContentContainer() {
        return this.a;
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
    public void onLayout(float f, float f2, float f3, float f4) {
        super.onLayout(f, f2, f3, f4);
        a();
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
    public void onShow() {
        super.onShow();
        a();
        this.c.f();
        this.d = com.tsf.shell.manager.a.f.j();
        this.c.k(this.d);
    }

    @Override // com.tsf.shell.f.e.g.a.c
    public void onHideComplete() {
        recycle();
        com.tsf.shell.manager.a.f.c(this.d);
    }

    @Override // com.tsf.shell.f.e.g.a.d
    public void onRequestExit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.f.e.g.a.d, com.tsf.shell.f.e.g.a.c
    public void recycle() {
        super.recycle();
        removeIcon();
        this.b.b();
        this.c.g();
    }
}
