package com.tsf.shell.manager.r.b;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.b;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.f.i.c.ItemGroupBase;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDecorationPanel extends com.tsf.shell.f.e._g.a.MenuActionItem {
    private a.C0095a a;
    private a.C0095a b;
    private Runnable c;
    private com.tsf.shell.manager.r.b.c.WidgetDragDropArea d;
    private BaseRenderable e;

    public WidgetDecorationPanel(final WidgetMenuPanel aVar, String str) {
        super(str);
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        this.c = new Runnable() { // from class: com.tsf.shell.manager.r.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                WidgetDecorationPanel.this.a.a();
            }
        };
        final Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.C3DEngine.a().c(WidgetDecorationPanel.this.c);
            }
        };
        a.C0095a.C0096a c0096a = new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.b.3
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.r.c.WidgetFeatureConfig.c;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.WidgetManager.b().a(runnable);
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.WidgetManager.b().a(false);
            }
        };
        a.C0095a c0095a = new a.C0095a(b.d.widget_menu_decoration_floating, x.c(b.i.text_floating), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.r.b.b.4
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.r.c.WidgetFeatureConfig.a;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.app.WidgetManager.b().b(true);
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.app.WidgetManager.b().b(false);
            }
        });
        com.tsf.shell.manager.r.c.WidgetFeatureConfig.e = c0095a;
        this.b = c0095a;
        a.C0095a c0095a2 = new a.C0095a(b.d.widget_menu_setting, x.c(b.i.text_animation), c0096a);
        com.tsf.shell.manager.r.c.WidgetFeatureConfig.f = c0095a2;
        this.a = c0095a2;
        arrayList.add(this.a);
        arrayList.add(this.b);
        setFunctions(arrayList);
        this.e = new BaseRenderable();
        this.d = new com.tsf.shell.manager.r.b.c.WidgetDragDropArea(aVar, this) { // from class: com.tsf.shell.manager.r.b.b.5
            @Override // com.tsf.shell.manager.r.b.c.WidgetDragDropArea
            public void a(com.tsf.shell.f.i.c.ItemLabelProvider eVar) {
                WidgetDecorationPanel.this.a(eVar, 0.0f, aVar.getScreenFreeSpaceCenter());
            }

            @Override // com.tsf.shell.manager.r.b.c.WidgetDragDropArea
            public boolean a(com.tsf.shell.f.i.c.ItemLabelProvider eVar, float f, float f2) {
                return WidgetDecorationPanel.this.a(eVar, f, f2);
            }
        };
        this.e.addChild(this.d.f());
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        this.d.b(false);
        this.d.c();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onHide() {
        this.d.a();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public BaseRenderable getContentContainer() {
        return this.e;
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        super.onRecycle();
        this.d.e();
    }

    public boolean a(com.tsf.shell.f.i.c.ItemLabelProvider eVar, float f, float f2) {
        com.tsf.shell.manager.r.c.a.WidgetPlacementHelper.a((g) eVar, f, f2, new a.AbstractC0146a() { // from class: com.tsf.shell.manager.r.b.b.6
            @Override // com.tsf.shell.manager.r.c.a.WidgetInstantiator.AbstractC0146a
            public void a(ItemInfo itemInfo) {
            }

            @Override // com.tsf.shell.manager.r.c.a.WidgetInstantiator.AbstractC0146a
            public void a(com.tsf.shell.f.i.PageItem bVar, g gVar) {
                bVar.scale().setAll(0.0f, 0.0f, 1.0f);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(1.0f);
                dVar.m(1.0f);
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(bVar);
                com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar);
            }
        });
        return true;
    }

    public void a(com.tsf.shell.f.i.c.ItemLabelProvider eVar) {
        this.d.b(eVar);
    }

    public void b(com.tsf.shell.f.i.c.ItemLabelProvider eVar) {
        this.d.c(eVar);
    }

    public void a(ArrayList<com.tsf.shell.f.i.c.ItemLabelProvider> arrayList) {
        this.d.a(arrayList);
    }
}
