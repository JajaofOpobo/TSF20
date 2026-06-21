package com.tsf.shell.manager.p;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class b extends l {
    private TextureElement a = new TextureElement(0, false);
    private TextureElement b = new TextureElement(0, false);
    private m c = com.censivn.C3DEngine.b.b.a.a(103.0f, 149.0f);
    private m d;

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
        x xVar = new x();
        xVar.f(com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(50.0f));
        xVar.h(f2);
        xVar.a(runnable);
        w.a(this);
        w.a(this, i, xVar);
    }

    public void a(final Runnable runnable, final int i) {
        x xVar = new x() { // from class: com.tsf.shell.manager.p.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.a.a().b(runnable, i);
                }
            }
        };
        xVar.a(255);
        w.a(this);
        w.a(this, 500, xVar);
    }

    public void b(final Runnable runnable, final int i) {
        x xVar = new x() { // from class: com.tsf.shell.manager.p.b.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.a.a().b(runnable, i);
                }
            }
        };
        xVar.a(0);
        w.a(this);
        w.a(this, 500, xVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.a.id == 0) {
            com.censivn.C3DEngine.a.g().a(this.a, R.drawable.tips_gesture_finger);
            com.censivn.C3DEngine.a.g().a(this.b, R.drawable.tips_finger_point2);
        }
    }

    public void a(float f) {
        a(f, (Runnable) null);
    }

    public void a(final float f, Runnable runnable) {
        final float f2 = rotation().z;
        x xVar = new x() { // from class: com.tsf.shell.manager.p.b.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f3) {
                b.this.rotation().z = f2 + ((f - f2) * f3);
            }
        };
        xVar.a(runnable);
        w.a(new com.censivn.C3DEngine.b.g.b.b(), 450, xVar);
    }

    public void b() {
        this.d.removeFromParent();
        com.tsf.shell.manager.a.j.a(this.d);
        setZOrderOnTop();
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.visible(true);
        this.d.alpha(255.0f);
        this.d.position().setAllFrom(position());
        x xVar = new x() { // from class: com.tsf.shell.manager.p.b.4
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.d.visible(false);
                b.this.d.alpha(255.0f);
                com.tsf.shell.manager.a.j.b(b.this.d);
            }
        };
        w.a(this.d);
        xVar.l(5.0f);
        xVar.m(5.0f);
        xVar.a(0);
        xVar.a(com.censivn.C3DEngine.b.g.a.a);
        w.a(this.d);
        w.a(this.d, 600, xVar);
    }
}
