package com.tsf.shell.manager.r.b;

import com.tsf.b;
import com.tsf.shell.manager.r.b.c.WidgetPanelToggle;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetMenuPanel extends com.tsf.shell.f.e._g.MenuOverlay {
    public com.tsf.shell.manager.r.b.a.AppListPanel a;
    public WidgetPanelToggle b;
    public WidgetDecorationPanel c;
    public ShortcutsPanel d;
    public TogglePanel e;
    public boolean f;
    private C0144a g;

    /* JADX INFO: renamed from: com.tsf.shell.manager.r.b.WidgetMenuPanel$a, reason: collision with other inner class name */
    public static class C0144a {
        public void a() {
        }

        public void a(com.tsf.shell.f.i.b.e.b bVar) {
        }

        public com.tsf.shell.manager.o.ButtonMetrics b() {
            return null;
        }
    }

    public WidgetMenuPanel() {
        super(800.0f * com.censivn.C3DEngine.b.b.A.c);
        this.f = false;
        ArrayList<com.tsf.shell.f.e._g.a.b> arrayList = new ArrayList<>();
        this.e = new TogglePanel(this, x.c(b.i.group_toggle));
        this.a = new com.tsf.shell.manager.r.b.a.AppListPanel(this, x.c(b.i.group_applications));
        this.b = new WidgetPanelToggle(this, x.c(b.i.group_widgets));
        this.c = new WidgetDecorationPanel(this, x.c(b.i.widget_menu_decoration));
        this.d = new ShortcutsPanel(this, x.c(b.i.group_shortcuts));
        arrayList.add(this.e);
        arrayList.add(this.a);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        setMenuItems(arrayList);
    }

    @Override // com.tsf.shell.f.e._g.MenuOverlay
    public void show(int i) {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show(i);
    }

    @Override // com.tsf.shell.f.e._g.MenuOverlay
    public void show() {
        this.f = false;
        this.e.disable();
        this.c.enable();
        this.b.enable();
        super.show();
    }

    public void a(C0144a c0144a) {
        this.g = c0144a;
        this.f = true;
        this.e.enable();
        this.c.disable();
        this.b.disable();
        super.show();
    }

    public boolean a() {
        return this.f;
    }

    @Override // com.tsf.shell.f.e._g.MenuOverlay
    public void onHide() {
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    public C0144a b() {
        return this.g;
    }
}
