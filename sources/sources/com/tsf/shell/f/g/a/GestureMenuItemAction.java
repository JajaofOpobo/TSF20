package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.f.f.PageTransitionEffect;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureMenuItemAction extends com.tsf.shell.f.e._g.a.MenuActionItem {
    public b a;
    private com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerH b;
    private GestureMenuBlankItem.C0095a c;
    private GestureMenuEffectItem.a d;

    public GestureMenuItemAction(b bVar) {
        super(GestureMenuOverlay.i.menu_effect_desktop);
        this.a = bVar;
        ArrayList<GestureMenuBlankItem.C0095a> arrayList = new ArrayList<>();
        GestureMenuBlankItem.C0095a.C0096a c0096a = new GestureMenuBlankItem.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.GestureMenuItemAction.1
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.FlagHelper.C0126a.g();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(true);
                c.this.b.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(false);
                c.this.b.d();
            }
        };
        GestureMenuBlankItem.C0095a.C0096a c0096a2 = new GestureMenuBlankItem.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.GestureMenuItemAction.2
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.f.f.PageConfig.c();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.f.f.PageConfig.b(true);
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.f.f.PageConfig.b(false);
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }
        };
        this.c = new GestureMenuBlankItem.C0095a(GestureMenuOverlay.d.effect_setting_desktop_menu_swing, x.c(GestureMenuOverlay.i.menu_effect_swing), new GestureMenuBlankItem.C0095a.C0096a() { // from class: com.tsf.shell.f.g.a.GestureMenuItemAction.3
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.app.v.ObjectHelper.b();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.v.ObjectHelper.c();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.v.ObjectHelper.d();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.d();
            }
        });
        arrayList.add(new GestureMenuBlankItem.C0095a(GestureMenuOverlay.d.effect_setting_desktop_menu_random, x.c(GestureMenuOverlay.i.text_random), c0096a));
        arrayList.add(new GestureMenuBlankItem.C0095a(GestureMenuOverlay.d.effect_setting_desktop_menu_page_border, x.c(GestureMenuOverlay.i.text_border), c0096a2));
        arrayList.add(this.c);
        setFunctions(arrayList);
        this.b = new com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerH(com.censivn.C3DEngine.b.b.ScreenConstants.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.ScreenConstants.c * 20.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 20.0f, com.tsf.shell.manager.o.ButtonPresetManager.c.T * 0.9f, com.tsf.shell.manager.o.ButtonPresetManager.c.U * com.censivn.C3DEngine.b.b.ScreenConstants.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.SparkleEffect() { // from class: com.tsf.shell.f.g.a.GestureMenuItemAction.4
            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public int a() {
                return com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public i a(int i, i iVar) {
                i hVar;
                if (iVar == null) {
                    hVar = new GestureMenuRenderer();
                    hVar.calAABB();
                } else {
                    hVar = iVar;
                }
                l lVarA = com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i);
                h hVar2 = (h) hVar;
                if (lVarA.i()) {
                    hVar2.g();
                } else {
                    hVar2.h();
                }
                if (lVarA.n()) {
                    hVar2.c();
                } else {
                    hVar2.d();
                }
                hVar2.e.textures().clear();
                hVar2.e.textures().addElement(lVarA.a(GestureMenuRenderer.e(), GestureMenuRenderer.f()));
                return hVar;
            }
        });
        this.b.a(new com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF() { // from class: com.tsf.shell.f.g.a.GestureMenuItemAction.5
            @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF
            public void a(i iVar, int i, MotionEvent motionEvent) {
                l lVarA = com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i);
                w.b();
                com.tsf.shell.manager.app.v.FlagHelper.C0126a.c(lVarA);
                c.this.b.d();
            }
        });
        this.d = com.tsf.shell.manager.app.AppListManager.a(this, com.tsf.shell.manager.p.ThemePreferenceProvider.f);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public BaseRenderable getContentContainer() {
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
        super.onHide();
        this.d.b();
        int i = com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i2).l();
        }
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        super.onRecycle();
        int i = com.tsf.shell.manager.app.v.FlagHelper.C0126a.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.FlagHelper.C0126a.a(i2).h();
        }
        GestureMenuRenderer.b();
        com.tsf.shell.manager.app.v.FlagHelper.C0126a.j();
    }
}
