package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureMenuEffectItem extends GestureMenuBlankItem {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;

    public GestureMenuEffectItem(b bVar) {
        super(GestureMenuOverlay.i.menu_effect_clicking);
        this.a = bVar;
        GestureMenuBlankItem.C0095a.C0096a c0096a = new GestureMenuBlankItem.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.GestureMenuEffectItem.1
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.AnimationHelper.b();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.AnimationHelper.a(true);
                e.this.b.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.AnimationHelper.a(false);
                e.this.b.d();
            }
        };
        ArrayList<GestureMenuBlankItem.C0095a> arrayList = new ArrayList<>();
        arrayList.add(new GestureMenuBlankItem.C0095a(GestureMenuOverlay.d.effect_setting_desktop_menu_random, x.c(GestureMenuOverlay.i.text_random), c0096a));
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.A.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.tsf.shell.manager.o.ButtonPresetManager.c.T * 0.9f, com.tsf.shell.manager.o.ButtonPresetManager.c.U * com.censivn.C3DEngine.b.b.A.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.GestureMenuEffectItem.2
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.app.v.AnimationHelper.d();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f._d.a.DashElementBase aVarA = com.tsf.shell.manager.app.v.AnimationHelper.a(i);
                h hVar = (h) aVarA.e();
                hVar.e.textures().clear();
                hVar.e.textures().addElement(GestureMenuRenderer.i());
                if (aVarA.b()) {
                    hVar.g();
                } else {
                    hVar.h();
                }
                return hVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.GestureMenuEffectItem.3
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.f._d.a.DashElementBase aVarA = com.tsf.shell.manager.app.v.AnimationHelper.a(i);
                w.b();
                com.tsf.shell.manager.app.v.AnimationHelper.a(aVarA);
                if (aVarA.b()) {
                    e.this.a.a().a(aVarA);
                }
                e.this.b.d();
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
    public void onHide() {
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        super.onRecycle();
        GestureMenuRenderer.b();
        GestureMenuRenderer.j();
        com.tsf.shell.manager.app.v.AnimationHelper.e();
    }
}
