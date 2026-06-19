package com.tsf.shell.manager.r.b.a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.a;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AppSelectionIndicatorBar extends j {
    private TextureElement a = new TextureElement(0, false);
    private k b;
    private m c;
    private com.tsf.shell.f.e._g.a.a.C0095a d;
    private com.tsf.shell.f.e._g.a.a.C0095a e;

    public B() {
        d();
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
        this.b = new k(com.censivn.C3DEngine.b.b.A.a(24.0f), com.censivn.C3DEngine.b.b.A.a(45.0f), false) { // from class: com.tsf.shell.manager.r.b.a.b.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (AppSelectionIndicatorBar.this.a.id == 0) {
                    Bitmap bitmapA = x.a(b.d.scrollcontainer_arrow);
                    com.censivn.C3DEngine.A.g().a(AppSelectionIndicatorBar.this.a, bitmapA);
                    bitmapA.recycle();
                }
            }
        };
        this.b.textures().addElement(this.a);
        this.b.calAABB(3.0f, 1.0f, 1.0f);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.b, com.tsf.shell.manager.o.ThemeColorConstants.h);
        a(this.b);
        addChild(this.b);
        this.b.rotation().z = 180.0f;
        this.c = new m();
        this.c.d(42);
        this.c.e(-1);
        this.c.b(1);
        a(this.c);
        addChild(this.c);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.c, com.tsf.shell.manager.o.ThemeColorConstants.h);
        this.d = new com.tsf.shell.f.e._g.a.a.C0095a(b.d.widget_menu_app_folder, x.c(b.i.widget_folder), new com.tsf.shell.f.e._g.a.a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.a.b.2
            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return false;
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                AppSelectionIndicatorBar.this.b();
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
            }
        });
        this.e = new com.tsf.shell.f.e._g.a.a.C0095a(b.d.widget_menu_app_desktop, x.c(b.i.menu_effect_desktop), new com.tsf.shell.f.e._g.a.a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.a.b.3
            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public boolean a() {
                return false;
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void b() {
                AppSelectionIndicatorBar.this.c();
            }

            @Override // com.tsf.shell.f.e._g.a.com.tsf.shell.f.e._g.a.a.C0095a.C0096a
            public void c() {
            }
        });
        addChild(this.d);
        addChild(this.e);
    }

    public void a(int i) {
        this.c.a(Integer.toString(i));
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b.position().x = com.censivn.C3DEngine.b.b.A.a(20.0f) + f + com.censivn.C3DEngine.b.b.A.a(12.0f);
        this.c.position().x = this.b.position().x + com.censivn.C3DEngine.b.b.A.a(12.0f) + com.censivn.C3DEngine.b.b.A.a(20.0f);
        h();
    }

    public void e() {
        com.censivn.C3DEngine.A.g().a(this.a);
    }

    public void a(i iVar) {
        iVar.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(iVar) { // from class: com.tsf.shell.manager.r.b.a.b.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                AppSelectionIndicatorBar.this.a();
            }
        });
    }

    private void h() {
        float fA = com.censivn.C3DEngine.b.b.A.a(30.0f);
        float f = (-((this.d.b() + this.e.b()) + fA)) / 2.0f;
        this.d.position().x = (this.d.b() / 2.0f) + f;
        float fB = fA + this.d.b() + f;
        this.e.position().x = fB + (this.e.b() / 2.0f);
    }

    public void f() {
        this.d.d();
        this.e.d();
        h();
    }

    public void g() {
        e();
        this.d.e();
        this.e.e();
    }
}
