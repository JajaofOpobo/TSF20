package com.tsf.shell.manager.p;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
/* loaded from: classes.dex */
public class b extends j {
    private TextureElement a = new TextureElement(0, false);
    private TextureElement b = new TextureElement(0, false);
    private k c = com.censivn.C3DEngine.b.b.a.a(103.0f, 149.0f);
    private k d;

    public b() {
        this.c.position().y = (-this.c.c()) / 2.0f;
        this.c.textures().addElement(this.a);
        this.d = com.censivn.C3DEngine.b.b.a.a(69.0f, 69.0f);
        this.d.textures().addElement(this.b);
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.visible(false);
        addChild(this.c);
    }

    public void a() {
        com.censivn.C3DEngine.a.g().a(this.a);
        com.censivn.C3DEngine.a.g().a(this.b);
    }

    public void a(float f, float f2, int i, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f));
        dVar.h(f2);
        dVar.a(runnable);
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, i, dVar);
    }

    public void a(final Runnable runnable, final int i) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.a.a().b(runnable, i);
                }
            }
        };
        dVar.a(255);
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
    }

    public void b(final Runnable runnable, final int i) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.b.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.a.a().b(runnable, i);
                }
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this);
        com.censivn.C3DEngine.b.g.c.a(this, 500, dVar);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, b.d.tips_gesture_finger);
            com.censivn.C3DEngine.a.g().a(this.b, b.d.tips_finger_point2);
        }
    }

    public void a(float f) {
        a(f, (Runnable) null);
    }

    public void a(final float f, Runnable runnable) {
        final float f2 = rotation().z;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.b.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f3) {
                b.this.rotation().z = f2 + ((f - f2) * f3);
            }
        };
        dVar.a(runnable);
        com.censivn.C3DEngine.b.g.c.a(new com.censivn.C3DEngine.b.g.b.b(), 450, dVar);
    }

    public void b() {
        this.d.removeFromParent();
        com.tsf.shell.manager.a.j.a(this.d);
        setZOrderOnTop();
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.visible(true);
        this.d.alpha(255.0f);
        this.d.position().setAllFrom(position());
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.p.b.4
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.d.visible(false);
                b.this.d.alpha(255.0f);
                com.tsf.shell.manager.a.j.b(b.this.d);
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.d);
        dVar.l(5.0f);
        dVar.m(5.0f);
        dVar.a(0);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 600, dVar);
    }
}
