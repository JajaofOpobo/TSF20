package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.b.f.o;

/* loaded from: classes.dex */
class h extends com.censivn.C3DEngine.b.f.l {
    public static final int b = (int) com.censivn.C3DEngine.b.b.a.a(300.0f);
    public static final int c = (int) com.censivn.C3DEngine.b.b.a.a(500.0f);
    private o a = new o();
    private com.censivn.C3DEngine.b.f.j d;

    public h(String str) {
        this.a.a(str);
        this.a.d(36);
        addChild(this.a);
        this.a.position().y = ((-c) / 2.0f) - com.censivn.C3DEngine.b.b.a.a(5.0f);
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        this.d = jVar;
        this.d.position().y = com.censivn.C3DEngine.b.b.a.a(25.0f);
        addChild(this.d);
    }

    public void b() {
        this.a.a();
    }

    public void a() {
    }
}
