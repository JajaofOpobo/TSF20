package com.tsf.shell.f.f.a._c;

import android.view.MotionEvent;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerAppMenu extends DrawerPageItemBase {
    private com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerH g;
    private com.tsf.shell.f.f.a._b.DrawerTransitionManagerV2 h;
    private com.tsf.shell.f.e._g.MenuContainer i;
    private ArrayList<com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a> j;

    public DrawerAppMenu(com.tsf.shell.f.f.a.FolderPage hVar, com.tsf.shell.f.f.a.PageGridRenderer fVar) {
        super(hVar, fVar, DrawerWidgetTouchHandler.d.drawer_effect, x.c(DrawerWidgetTouchHandler.i.text_effect));
        this.h = hVar.aC();
        c();
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-com.tsf.shell.manager.o.ButtonPresetManager.c.U) / 2.0f, i3, com.tsf.shell.manager.o.ButtonPresetManager.c.U / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void b(boolean z) {
        this.b.e();
        this.g.d();
        if (this.j != null && this.j.size() > 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.j.size()) {
                    this.j.get(i2).d();
                    i = i2 + 1;
                } else {
                    this.i.measure();
                    return;
                }
            }
        }
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void a() {
        this.b.f();
    }

    @Override // com.tsf.shell.f.f.a._c.DrawerPageItemBase
    public void b() {
        for (int i = 0; i < this.h.i(); i++) {
            this.h.a(DrawerPageItemBase).h();
        }
        if (this.j != null && this.j.size() > 0) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).e();
            }
        }
        com.tsf.shell.f.g.a.GestureMenuRenderer.b();
        this.h.j();
    }

    private void c() {
        this.g = new com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerH(com.censivn.C3DEngine.b.b.A.D, com.tsf.shell.manager.o.ButtonPresetManager.c.U, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.tsf.shell.manager.o.ButtonPresetManager.c.T * 0.9f, com.tsf.shell.manager.o.ButtonPresetManager.c.U * com.censivn.C3DEngine.b.b.A.c * 0.9f);
        this.g.a(new com.censivn.C3DEngine.b.h.b.SparkleEffect() { // from class: com.tsf.shell.f.f.a._c.DrawerAppMenu.1
            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public int a() {
                return d.this.h.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public com.censivn.C3DEngine.b.f.IRenderable a(int i, com.censivn.C3DEngine.b.f.IRenderable iVar) {
                com.censivn.C3DEngine.b.f.IRenderable hVar;
                if (iVar == null) {
                    hVar = new com.tsf.shell.f.g.a.GestureMenuRenderer();
                    hVar.calAABB();
                } else {
                    hVar = iVar;
                }
                com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2 kVarA = d.this.h.a(DrawerPageItemBase);
                com.tsf.shell.f.g.a.GestureMenuRenderer hVar2 = (com.tsf.shell.f.g.a.GestureMenuRenderer) hVar;
                if (kVarA.i()) {
                    hVar2.g();
                } else {
                    hVar2.h();
                }
                hVar2.e.textures().clear();
                hVar2.e.textures().addElement(kVarA.a(com.tsf.shell.f.g.a.GestureMenuRenderer.e(), com.tsf.shell.f.g.a.GestureMenuRenderer.f()));
                return hVar;
            }
        });
        this.g.a(new com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF() { // from class: com.tsf.shell.f.f.a._c.DrawerAppMenu.2
            @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF
            public void a(com.censivn.C3DEngine.b.f.IRenderable iVar, int i, MotionEvent motionEvent) {
                w.b();
                if (!com.tsf.shell.manager.app.StateHub.t().an().c()) {
                    d.this.a.d(DrawerPageItemBase);
                    w.b();
                }
                d.this.g.d();
            }
        });
        addChild(this.g);
        ArrayList<com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a(DrawerWidgetTouchHandler.d.effect_setting_desktop_menu_random, x.c(DrawerWidgetTouchHandler.i.text_random), new com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a() { // from class: com.tsf.shell.f.f.a._c.DrawerAppMenu.3
            @Override // com.tsf.shell.f.e._g.a.MenuItemBaseom.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return d.this.h.g();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuItemBaseom.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                d.this.h.a(true);
                d.this.g.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuItemBaseom.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                d.this.h.a(false);
                d.this.g.d();
            }
        }));
        a(arrayList);
    }

    public void a(ArrayList<com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a> arrayList) {
        if (arrayList != null) {
            this.j = arrayList;
            this.i = new com.tsf.shell.f.e._g.MenuContainer();
            this.i.position().y = com.censivn.C3DEngine.b.b.A.a(160.0f);
            Iterator<com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a> it = arrayList.iterator();
            while (it.hasNext()) {
                this.i.addChild(it.next());
            }
            addChild(this.i);
        }
    }
}
