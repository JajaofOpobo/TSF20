package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.f.f.PageTransitionEffect;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureMenuDrawerItem extends com.tsf.shell.f.e._g.a.MenuActionItem {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;

    public d(b bVar) {
        super(GestureMenuOverlay.i.mn_drawer);
        this.a = bVar;
        ArrayList<GestureMenuBlankItem.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new GestureMenuBlankItem.C0095a(GestureMenuOverlay.d.effect_setting_desktop_menu_random, x.c(GestureMenuOverlay.i.text_random), new GestureMenuBlankItem.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.GestureMenuDrawerItem.1
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.FlagHelper.b.g();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.FlagHelper.b.a(true);
                d.this.b.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.FlagHelper.b.a(false);
                d.this.b.d();
            }
        }));
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.A.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.tsf.shell.manager.o.ButtonPresetManager.c.T * 0.9f, com.tsf.shell.manager.o.ButtonPresetManager.c.U * com.censivn.C3DEngine.b.b.A.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.GestureMenuDrawerItem.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.app.v.FlagHelper.b.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f.f.b.a.FolderPageTransitionBase dVar = (com.tsf.shell.f.f.b.a.FolderPageTransitionBase) com.tsf.shell.manager.app.v.FlagHelper.b.a(i);
                com.tsf.shell.f._d.e.DashRendererBase aVar = (com.tsf.shell.f._d.e.DashRendererBase) dVar.o();
                aVar.e.textures().clear();
                aVar.e.textures().addElement(com.tsf.shell.f._d.e.a.DashEffectParams());
                if (dVar.i()) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                return aVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.GestureMenuDrawerItem.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                l lVarA = com.tsf.shell.manager.app.v.FlagHelper.b.a(i);
                w.b();
                com.tsf.shell.manager.app.v.FlagHelper.b.b(lVarA);
                d.this.b.d();
            }
        });
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        this.b.d();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.app.v.FlagHelper.b.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.FlagHelper.b.a(i2).h();
        }
        GestureMenuRenderer.b();
        com.tsf.shell.manager.app.v.FlagHelper.b.j();
    }
}
