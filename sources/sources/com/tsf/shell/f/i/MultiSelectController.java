package com.tsf.shell.f.i;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.c.KeyboardHandler;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.f.i.PageItem;
import com.tsf.shell.f.i.ShortcutItem;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MultiSelectController implements com.censivn.C3DEngine.b.c.KeyboardHandler.a {
    protected InterfaceC0113a d;
    public Object a;
    private Object e;
    protected boolean c = false;
    protected ArrayList<ShortcutItem> b = new ArrayList<>();

    /* JADX INFO: renamed from: com.tsf.shell.f.i.MultiSelectController$a, reason: collision with other inner class name */
    public interface InterfaceC0113a {
        ArrayList<IRenderable> b();
    }

    public MultiSelectController(Object obj, InterfaceC0113a interfaceC0113a) {
        this.e = obj;
        this.d = interfaceC0113a;
    }

    public Object c() {
        return this.e;
    }

    public void a(IRenderable iVar) {
        if (iVar instanceof ShortcutItem) {
            ShortcutItem cVar = (ShortcutItem) iVar;
            if (this.c) {
                cVar.am();
            }
        }
    }

    public boolean d() {
        if (this.c) {
            a();
            return false;
        }
        a();
        return true;
    }

    public boolean e() {
        return this.c;
    }

    public void f() {
        if (com.tsf.shell.manager.app.FeatureConfig.a() && !this.c) {
            this.c = true;
            com.censivn.C3DEngine.b.c.KeyboardHandler.a(this);
            for (i iVar : this.d.b()) {
                if (iVar instanceof ShortcutItem) {
                    ((ShortcutItem) iVar).am();
                }
            }
            a();
            a();
        }
    }

    private void j() {
        this.a = com.tsf.shell.manager.app.Notifier.a((Object) this.a, String.format(x.c(com.tsf.b.i.text_multi_select_title), Integer.valueOf(this.b.size())));
    }

    private void k() {
        com.tsf.shell.manager.app.Notifier.b(this.a);
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            a();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.KeyboardHandler.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void g() {
        if (this.c) {
            InterfaceC0113a();
            this.c = false;
            com.censivn.C3DEngine.b.c.KeyboardHandler.b(this);
            for (i iVar : this.d.b()) {
                if (iVar instanceof ShortcutItem) {
                    ((ShortcutItem) iVar).an();
                }
            }
            a();
            this.b.clear();
        }
    }

    public void h() {
    }

    public void a() {
    }

    public void a(ShortcutItem cVar) {
        this.b.add(cVar);
        a();
    }

    public void b(ShortcutItem cVar) {
        this.b.remove(cVar);
        a();
    }

    public ArrayList<ShortcutItem> i() {
        return this.b;
    }

    public void c(PageItem bVar) {
    }

    public void b(PageItem bVar) {
    }

    public void a(PageItem bVar) {
    }

    public boolean a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        return true;
    }
}
