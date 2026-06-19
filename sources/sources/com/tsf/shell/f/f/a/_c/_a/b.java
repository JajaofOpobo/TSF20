package com.tsf.shell.f.f.a._c._a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.f.e.CircleDotNode;
import com.tsf.shell.f.f.a.f;
import com.tsf.shell.manager.o.ThemeColorConstants;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.utils.BitmapTransformationHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends j {
    public static final int a = com.censivn.C3DEngine.b.b.A.b(26.0f);
    private static TextureElement b = new TextureElement(0, false);
    private static k CircleDotNode;
    private j d;
    private String f;
    private int g;
    private float h;
    private float i;
    private CircleDotNode.a j;
    private e.a m;
    private TextureElement c = new TextureElement(0, false);
    private boolean l = false;
    private com.censivn.C3DEngine.b.f.k e = new com.censivn.C3DEngine.b.f.k(a, a, false);

    public b(CircleDotNode.a aVar) {
        this.j = aVar;
        this.e.textures().addElement(b);
        addChild(this.e);
        this.f = aVar.b;
        this.g = aVar.c;
        c.a(this.e, c.a);
        this.e.alpha(200.0f);
        this.d = a(this.c);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.f.f.a._c._a.b.1
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
        this.h = (f.a / 2.0f) + com.censivn.C3DEngine.b.b.A.a(25.0f);
        PositionNumber3d positionNumber3dPosition = this.d.position();
        float fA = com.censivn.C3DEngine.b.b.A.a(-30.0f);
        this.i = fA;
        positionNumber3dPosition.y = fA;
        this.d.visible(false);
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.alpha(0.0f);
        this.d.removeFromParent();
        addChild(this.d);
        c.a(this.d, c.a);
        this.d.alpha(200.0f);
    }

    public void a(int i) {
        this.m = com.tsf.shell.manager.app.AppListManager.a(i);
        if (this.m.a()) {
            g();
        }
    }

    public void g() {
        if (k == null) {
            k = new com.tsf.shell.f.e.CircleDotNode();
            CircleDotNode.position().x = com.censivn.C3DEngine.b.b.A.a(80.0f);
            CircleDotNode.position().y = com.censivn.C3DEngine.b.b.A.a(220.0f);
            CircleDotNode.alpha(0.0f);
        }
        this.l = true;
    }

    public void h() {
        this.l = false;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        if (this.l && this.d.visible()) {
            CircleDotNode.scale().setAllFrom(this.d.scale());
            CircleDotNode.alpha(this.d.alpha());
            CircleDotNode.dispatchDraw();
        }
    }

    public boolean b() {
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public j a(TextureElement textureElement) {
        com.censivn.C3DEngine.b.f._a.a aVarA = com.tsf.shell.f.f.a._c.j.a();
        aVarA.a(true);
        aVarA.textures().addElement(textureElement);
        return aVarA;
    }

    public void b(int i) {
        e();
        if (this.c.id == 0) {
            com.tsf.shell.f.f.a._c.j.a(this.c, this.g, this.f);
        }
        this.d.visible(true);
        d dVar = new d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.h(this.h);
        dVar.a(VEasing.Back.easeIn);
        dVar.b(i);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, VEasing.Linear.easeNone, dVar);
        d dVar2 = new d() { // from class: com.tsf.shell.f.f.a._c._a.b.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
            }
        };
        dVar2.a(60);
        dVar2.b(i);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, VEasing.Linear.easeNone, dVar2);
    }

    public void i() {
        d dVar = new d() { // from class: com.tsf.shell.f.f.a._c._a.b.3
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                b.this.d.visible(false);
                b.this.f();
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.h(this.i);
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.d);
        com.censivn.C3DEngine.b.g.c.a(this.d, 750, dVar);
        d dVar2 = new d();
        dVar2.a(VEasing.Back.easeIn);
        com.censivn.C3DEngine.b.g.c.a(this.e);
        com.censivn.C3DEngine.b.g.c.a(this.e, 750, dVar2);
        this.e.visible(true);
    }

    public void e() {
    }

    public void f() {
        if (this.c.id != 0) {
            com.censivn.C3DEngine.A.g().a(this.c);
        }
    }

    public static void j() {
        if (b.id == 0) {
            com.censivn.C3DEngine.A.g().a(b, q.b(a, -1));
        }
    }

    public static void k() {
        if (b.id != 0) {
            com.censivn.C3DEngine.A.g().a(b);
        }
        if (k != null) {
            CircleDotNode.a();
        }
    }
}
