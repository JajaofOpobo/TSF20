package com.tsf.shell.e.f.a.c;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class d extends com.censivn.C3DEngine.b.f.l {
    public d() {
        visible(false);
        position().y = -com.censivn.C3DEngine.b.b.a.a(150.0f);
        alpha(0.0f);
    }

    public void f() {
        visible(true);
        x xVar = new x();
        xVar.a(255);
        xVar.h(0.0f);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this);
        w.a(this, VEasing.Linear.easeNone, xVar);
        a();
    }

    public void g() {
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.d.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                d.this.visible(false);
                d.this.d();
            }
        };
        xVar.a(0);
        xVar.h(-com.censivn.C3DEngine.b.b.a.a(150.0f));
        w.a(this);
        w.a(this, 350, xVar);
        c();
    }

    public void a() {
    }

    public void c() {
    }

    public void d() {
    }
}
