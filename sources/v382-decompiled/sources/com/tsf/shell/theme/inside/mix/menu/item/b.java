package com.tsf.shell.theme.inside.mix.menu.item;

import com.censivn.C3DEngine.b.f.m;

/* loaded from: classes.dex */
class b extends ThemeIconPlane {
    final /* synthetic */ ThemeInstalledMenu b;
    private boolean c = false;
    public com.censivn.C3DEngine.b.f.a.a a = com.tsf.shell.manager.o.b.c.b();

    public b(ThemeInstalledMenu themeInstalledMenu) {
        this.b = themeInstalledMenu;
        this.a.calAABB();
        this.a.position().y = 10.0f * com.censivn.C3DEngine.b.b.a.c;
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this));
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeIconPlane, com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        m mVar;
        super.onDrawChildEnd();
        if (this.c) {
            mVar = this.b.mSelectPlane;
            mVar.dispatchDraw();
        }
    }

    public void a() {
        this.c = true;
    }

    public void b() {
        this.c = false;
    }
}
