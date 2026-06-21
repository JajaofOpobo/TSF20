package com.tsf.shell.e.e;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public class aa extends com.censivn.C3DEngine.b.f.l implements com.censivn.C3DEngine.b.c.d {
    private static aa a;
    private static ad b;
    private static com.tsf.shell.e.i.b.b.a c;
    private static com.tsf.shell.d.g d;
    private static boolean e = false;
    private static ac f;

    public static void a() {
        a.h();
    }

    public static void b() {
        a = new aa();
        b = new ad(500.0f, 500.0f, new com.censivn.C3DEngine.b.f.b.b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f), a);
        a.addChild(b);
    }

    public static void a(com.tsf.shell.e.i.b.b.a aVar) {
        a(aVar, (ac) null);
    }

    public static void a(com.tsf.shell.e.i.b.b.a aVar, ac acVar) {
        e = true;
        f = acVar;
        c = aVar;
        com.tsf.shell.d.g gVar = (com.tsf.shell.d.g) aVar.g.getLayoutParams();
        d = gVar;
        int i = gVar.d;
        int i2 = gVar.e;
        int i3 = (gVar.a - (com.censivn.C3DEngine.b.b.a.F / 2)) + (i / 2);
        int i4 = ((com.censivn.C3DEngine.b.b.a.G / 2) - gVar.b) - (i2 / 2);
        a.removeFromParent();
        com.tsf.shell.manager.a.j.a(a);
        a.position().x = i3;
        a.position().y = i4;
        a.c().a(i, i2);
        a.c().setFocus();
        a.c().h();
        a.c().a((-i) / 2, (-i2) / 2, i / 2, i2 / 2);
        com.censivn.C3DEngine.b.c.c.a(a);
        com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
        xVar.a(255);
        com.censivn.C3DEngine.b.g.w.a(a);
        com.censivn.C3DEngine.b.g.w.a(a, 250, xVar);
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            h();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (e) {
            b.i();
            c = null;
            com.censivn.C3DEngine.b.c.c.b(this);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.aa.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    aa.a.removeFromParent();
                }
            };
            xVar.a(0);
            com.censivn.C3DEngine.b.g.w.a(this);
            com.censivn.C3DEngine.b.g.w.a(this, 250, xVar);
            e = false;
            if (f != null) {
                f.a();
                f = null;
            }
        }
    }

    public ad c() {
        return b;
    }
}
