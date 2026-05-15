package com.tsf.shell.f.e.d.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    private b a = new b();

    public a() {
        addChild(this.a);
        setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this) { // from class: com.tsf.shell.f.e.d.a.a.1
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(com.censivn.C3DEngine.b.b.a.z);
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
    }

    public void c() {
        position().x = com.censivn.C3DEngine.b.b.a.z;
        position().y = com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.a(84.0f);
    }

    public void d() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.e.d.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                a.this.removeFromParent();
            }
        };
        dVar.f(com.censivn.C3DEngine.b.b.a.z - com.censivn.C3DEngine.b.b.a.a(100.0f));
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
    }

    public void a(float f) {
        this.a.a();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(f);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 500, dVar);
    }

    public void e() {
        this.a.b();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(com.censivn.C3DEngine.b.b.a.a(45.0f));
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 500, dVar);
    }
}
