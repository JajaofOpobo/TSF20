package com.tsf.shell.e.e.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class a extends l {
    private b b;
    private c c;
    private boolean d = false;
    private b a = new b(this, com.censivn.C3DEngine.b.b.a.a(20.0f), com.censivn.C3DEngine.b.b.a.E, 0);

    public a() {
        this.a.setDefaultColor(new Color4(255, 255, 255, 100));
        this.a.alpha(0.0f);
        this.b = new b(this, com.censivn.C3DEngine.b.b.a.a(20.0f), com.censivn.C3DEngine.b.b.a.E, 1);
        this.b.setDefaultColor(new Color4(255, 255, 255, 100));
        this.b.alpha(0.0f);
        addChild(this.a);
        addChild(this.b);
        this.c = new c() { // from class: com.tsf.shell.e.e.e.a.1
            @Override // com.tsf.shell.e.e.e.c, java.lang.Runnable
            public void run() {
                a.this.a(this.c, this.b);
            }
        };
    }

    public void a(int i, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        visible(true);
        x xVar = new x();
        xVar.a(255);
        w.a(this.a);
        w.a(this.a, 250, xVar);
        x xVar2 = new x();
        xVar2.a(255);
        w.a(this.b);
        w.a(this.b, 250, xVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        x xVar = new x() { // from class: com.tsf.shell.e.e.e.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.visible(false);
                if (!a.this.d) {
                    com.tsf.shell.manager.a.j.b(a.this);
                }
            }
        };
        xVar.a(0);
        w.a(this.a);
        w.a(this.a, 250, xVar);
        x xVar2 = new x();
        xVar2.a(0);
        w.a(this.b);
        w.a(this.b, 250, xVar2);
    }

    public float a() {
        return 0.0f;
    }

    public void b() {
        if (!this.d) {
            this.d = true;
            removeFromParent();
            float a = com.censivn.C3DEngine.b.b.a.C + a();
            this.a.points().setYPX(0, a);
            this.a.points().setYPX(1, a);
            this.b.points().setYPX(0, a);
            this.b.points().setYPX(1, a);
            this.a.points().setYPX(2, com.censivn.C3DEngine.b.b.a.B);
            this.a.points().setYPX(3, com.censivn.C3DEngine.b.b.a.B);
            this.b.points().setYPX(2, com.censivn.C3DEngine.b.b.a.B);
            this.b.points().setYPX(3, com.censivn.C3DEngine.b.b.a.B);
            this.a.updatePointsVBO();
            this.b.updatePointsVBO();
            this.a.calAABB(6.0f, 1.0f, 1.0f);
            this.b.calAABB(6.0f, 1.0f, 1.0f);
            com.tsf.shell.manager.a.j.a(this);
            com.tsf.shell.manager.a.k.b(this.a);
            com.tsf.shell.manager.a.k.b(this.b);
            this.a.position().x = com.censivn.C3DEngine.b.b.a.z;
            this.b.position().x = com.censivn.C3DEngine.b.b.a.A;
        }
    }

    public void a(int i) {
        com.censivn.C3DEngine.a.a().b(this.c, i);
    }

    public void c() {
        if (this.d) {
            this.d = false;
            e();
            com.tsf.shell.manager.a.k.c(this.a);
            com.tsf.shell.manager.a.k.c(this.b);
        }
    }
}
