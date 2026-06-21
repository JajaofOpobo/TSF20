package com.tsf.shell.e.f.a.c.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.e.n;
import com.tsf.shell.e.f.a.c.k;
import com.tsf.shell.e.f.a.c.m;
import com.tsf.shell.e.f.a.j;
import com.tsf.shell.manager.o.c;
import com.tsf.shell.manager.p.g;
import com.tsf.shell.utils.r;

/* loaded from: classes.dex */
public class b extends l {
    public static final int a = com.censivn.C3DEngine.b.b.a.b(26.0f);
    private static TextureElement b = new TextureElement(0, false);
    private static n k;
    private l d;
    private String f;
    private int g;
    private float h;
    private float i;
    private m j;
    private g m;
    private TextureElement c = new TextureElement(0, false);
    private boolean l = false;
    private com.censivn.C3DEngine.b.f.m e = new com.censivn.C3DEngine.b.f.m(a, a, false);

    public b(m mVar) {
        this.j = mVar;
        this.e.textures().addElement(b);
        addChild(this.e);
        this.f = mVar.b;
        this.g = mVar.c;
        c.a(this.e, c.a);
        this.e.alpha(200.0f);
        this.d = a(this.c);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.e.f.a.c.a.b.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (b.this.b()) {
                    b.this.h();
                    b.this.c();
                    b.this.j.a();
                    if (b.this.m != null) {
                        b.this.m.b();
                        return;
                    }
                    return;
                }
                b.this.d();
            }
        });
        this.d.calAABB();
        this.h = (j.a / 2.0f) + com.censivn.C3DEngine.b.b.a.a(25.0f);
        PositionNumber3d position = this.d.position();
        float a2 = com.censivn.C3DEngine.b.b.a.a(-30.0f);
        this.i = a2;
        position.y = a2;
        this.d.visible(false);
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.alpha(0.0f);
        this.d.removeFromParent();
        addChild(this.d);
        c.a(this.d, c.a);
        this.d.alpha(200.0f);
    }

    public void a(int i) {
        this.m = com.tsf.shell.manager.a.a.a(i);
        if (this.m.a()) {
            g();
        }
    }

    public void g() {
        if (k == null) {
            k = new n();
            k.position().x = com.censivn.C3DEngine.b.b.a.a(80.0f);
            k.position().y = com.censivn.C3DEngine.b.b.a.a(220.0f);
            k.alpha(0.0f);
        }
        this.l = true;
    }

    public void h() {
        this.l = false;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        if (this.l && this.d.visible()) {
            k.scale().setAllFrom(this.d.scale());
            k.alpha(this.d.alpha());
            k.dispatchDraw();
        }
    }

    public boolean b() {
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public l a(TextureElement textureElement) {
        com.censivn.C3DEngine.b.f.a.a a2 = k.a();
        a2.a(true);
        a2.textures().addElement(textureElement);
        return a2;
    }

    public void b(int i) {
        e();
        if (this.c.id == 0) {
            k.a(this.c, this.g, this.f);
        }
        this.d.visible(true);
        x xVar = new x();
        xVar.l(1.0f);
        xVar.m(1.0f);
        xVar.h(this.h);
        xVar.a(VEasing.Back.easeIn);
        xVar.b(i);
        w.a(this.d);
        w.a(this.d, VEasing.Linear.easeNone, xVar);
        x xVar2 = new x() { // from class: com.tsf.shell.e.f.a.c.a.b.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
            }
        };
        xVar2.a(60);
        xVar2.b(i);
        w.a(this.e);
        w.a(this.e, VEasing.Linear.easeNone, xVar2);
    }

    public void i() {
        x xVar = new x() { // from class: com.tsf.shell.e.f.a.c.a.b.3
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.d.visible(false);
                b.this.f();
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.h(this.i);
        xVar.a(0);
        w.a(this.d);
        w.a(this.d, 750, xVar);
        x xVar2 = new x();
        xVar2.a(VEasing.Back.easeIn);
        w.a(this.e);
        w.a(this.e, 750, xVar2);
        this.e.visible(true);
    }

    public void e() {
    }

    public void f() {
        if (this.c.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.c);
        }
    }

    public static void j() {
        if (b.id == 0) {
            com.censivn.C3DEngine.a.g().a(b, r.b(a, -1));
        }
    }

    public static void k() {
        if (b.id != 0) {
            com.censivn.C3DEngine.a.g().a(b);
        }
        if (k != null) {
            k.a();
        }
    }
}
