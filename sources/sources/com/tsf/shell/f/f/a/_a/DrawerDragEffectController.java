package com.tsf.shell.f.f.a._a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.manager.app.WidgetPanelController;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerDragEffectController extends com.tsf.shell.f.f.a._a.a.DrawerAppLayoutStrategy {
    private g.b a;
    private com.tsf.shell.f.e.ObjectPool<com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect> b;
    private ArrayList<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> c;
    private TextureElement d;
    private k e;
    private float f;

    public DrawerDragEffectController(c cVar) {
        super(cVar, b.d.allapps_recent_icon);
        this.d = new TextureElement(0, false);
        this.f = -com.censivn.C3DEngine.b.b.A.a(50.0f);
        this.c = new ArrayList<>();
        this.b = new com.tsf.shell.f.e.ObjectPool<com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect>() { // from class: com.tsf.shell.f.f.a._a.DrawerDragEffectController.1
            @Override // com.tsf.shell.f.e.ObjectPool
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect b() {
                return new com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect();
            }
        };
        this.a = new g.b() { // from class: com.tsf.shell.f.f.a._a.DrawerDragEffectController.2
            @Override // com.tsf.shell.manager.app.WidgetPanelController.b
            public void a(ArrayList<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> arrayList) {
                d.this.g();
            }
        };
        com.tsf.shell.manager.app.ServiceProvider.a().a().a(this.a);
        this.e = new k(com.censivn.C3DEngine.b.b.A.a(60.0f), com.censivn.C3DEngine.b.b.A.a(50.0f), false) { // from class: com.tsf.shell.f.f.a._a.DrawerDragEffectController.3
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (d.this.d.id == 0) {
                    com.censivn.C3DEngine.C3DEngine.g().a(d.this.d, b.d.allapps_direction_swap);
                }
            }
        };
        this.e.position().y = this.f;
        this.e.textures().addElement(this.d);
        this.e.calAABB(3.0f, 3.0f, 1.0f);
        i().addChild(this.e);
        this.e.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.e) { // from class: com.tsf.shell.f.f.a._a.DrawerDragEffectController.4
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                d.this.h().a();
            }
        });
    }

    @Override // com.tsf.shell.f.f.a._a.a.DrawerItemLayoutData
    public void a(int i, boolean z) {
        super.a(i, z);
        float fR = r();
        com.censivn.C3DEngine.b.g.c.a(this.e);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            if (i == DrawerItemContainer.b) {
                dVar.e(0.0f);
            } else {
                dVar.e(180.0f);
            }
            dVar.f(fR);
            dVar.a(com.censivn.C3DEngine.b.g.a.n);
            com.censivn.C3DEngine.b.g.c.a(this.e, 500, dVar);
            return;
        }
        this.e.position().x = fR;
        if (i == DrawerItemContainer.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.f.f.a._a.a.DrawerItemLayoutData
    public void e() {
        super.e();
        com.tsf.shell.f.f.a._a.b.DrawerBaseElement.a(this.e, this.f - DrawerItemContainer.a, this.f);
    }

    @Override // com.tsf.shell.f.f.a._a.a.DrawerItemLayoutData, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        this.e.position().x = r();
        if (q() == DrawerItemContainer.b) {
            this.e.rotation().z = 0.0f;
        } else {
            this.e.rotation().z = 180.0f;
        }
    }

    @Override // com.tsf.shell.f.f.a._a.a.DrawerAppLayoutStrategy, com.tsf.shell.f.f.a._a.a.DrawerItemLayoutData
    public void f() {
        super.f();
        if (this.d.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.d);
        }
        v();
    }

    public void g() {
        v();
        int iK = k() * 3;
        for (com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual gVar : com.tsf.shell.manager.app.ServiceProvider.a().a().a(iK <= 12 ? iK : 12)) {
            com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect eVarC = this.b.c();
            eVarC.a(gVar);
            this.c.add(eVarC);
        }
        j();
        a(this.c);
    }

    private void v() {
        Iterator<com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual> it = this.c.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect eVar = (com.tsf.shell.f.i._b.e.WidgetDrawerItemEffect) it.next();
            eVar.aW();
            this.b.a(eVar);
        }
        this.c.clear();
    }
}
