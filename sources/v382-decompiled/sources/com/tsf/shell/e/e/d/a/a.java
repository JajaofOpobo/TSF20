package com.tsf.shell.e.e.d.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class a extends l {
    private b a = new b();

    public a() {
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.e.e.d.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                a.this.a();
            }
        });
        setAABBPX(-com.censivn.C3DEngine.b.b.a.a(150.0f), -com.censivn.C3DEngine.b.b.a.a(150.0f), 0.0f, com.censivn.C3DEngine.b.b.a.a(150.0f), com.censivn.C3DEngine.b.b.a.a(150.0f), 0.0f);
    }

    public void a() {
    }

    public void b() {
        if (parent() == null) {
            com.tsf.shell.manager.a.j.a(this);
            position().x = com.censivn.C3DEngine.b.b.a.z - com.censivn.C3DEngine.b.b.a.a(100.0f);
            position().y = com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.a(84.0f);
            this.a.position().x = com.censivn.C3DEngine.b.b.a.a(45.0f);
        }
        x xVar = new x();
        xVar.f(com.censivn.C3DEngine.b.b.a.z);
        w.a(this);
        w.a(this, 500, xVar);
    }

    public void c() {
        position().x = com.censivn.C3DEngine.b.b.a.z;
        position().y = com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.a(84.0f);
    }

    public void d() {
        x xVar = new x() { // from class: com.tsf.shell.e.e.d.a.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                a.this.removeFromParent();
            }
        };
        xVar.f(com.censivn.C3DEngine.b.b.a.z - com.censivn.C3DEngine.b.b.a.a(100.0f));
        w.a(this);
        w.a(this, 500, xVar);
    }

    public void a(float f) {
        this.a.a();
        x xVar = new x();
        xVar.f(f);
        w.a(this.a);
        w.a(this.a, 500, xVar);
    }

    public void e() {
        this.a.b();
        x xVar = new x();
        xVar.f(com.censivn.C3DEngine.b.b.a.a(45.0f));
        w.a(this.a);
        w.a(this.a, 500, xVar);
    }
}
