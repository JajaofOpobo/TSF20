package com.tsf.shell.e.e.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class f extends g {
    private static TextureElement d = new TextureElement(0, false);
    private m a;

    public f(float f, float f2, boolean z) {
        super(f, f2, z);
        this.a = new m(com.censivn.C3DEngine.b.b.a.a(64.0f), com.censivn.C3DEngine.b.b.a.a(14.0f), false) { // from class: com.tsf.shell.e.e.e.f.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                if (f.d.id == 0) {
                    com.censivn.C3DEngine.a.g().a(f.d, R.drawable.editer_icon_delete_cap);
                }
            }
        };
        this.a.moveAllPointsPX(this.a.b() / 2.0f, this.a.c() / 2.0f, 0.0f);
        this.a.position().x = (-this.a.b()) / 2.0f;
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(18.0f);
        this.a.textures().addElement(d);
        addChild(this.a);
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void a(com.tsf.shell.e.e.g gVar) {
        e();
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void e(com.tsf.shell.e.e.g gVar) {
        f();
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void d(com.tsf.shell.e.e.g gVar) {
        f();
    }

    private void e() {
        x xVar = new x();
        xVar.e(50.0f);
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(this.a);
        w.a(this.a, VEasing.Linear.easeNone, xVar);
    }

    private void f() {
        x xVar = new x();
        xVar.e(0.0f);
        w.a(this.a);
        w.a(this.a, 300, xVar);
    }
}
