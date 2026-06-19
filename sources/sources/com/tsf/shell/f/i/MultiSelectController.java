package com.tsf.shell.f.i;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MultiSelectController implements com.censivn.C3DEngine.b.c.b.a {
    private com.tsf.shell.f.i.a.WallpaperTouchHandler a;
    protected InterfaceC0113a d;
    public class Object 
    protected boolean c = false;
    protected ArrayList<C> b = new ArrayList<>();

    /* JADX INFO: renamed from: com.tsf.shell.f.i.MultiSelectController$a, reason: collision with other inner class name */
    public interface InterfaceC0113a {
        ArrayList<i> b();
    }

    public A(Object obj, InterfaceC0113a interfaceC0113a) {
        this.e = obj;
        this.d = interfaceC0113a;
    }

    public class Object 
        return this.e;
    }

    public void c() {
        this.b.clear();
    }

    public void a(i iVar) {
        if (iVar instanceof C) {
            C cVar = (ShortcutItem) iVar;
            if (this.c) {
                cVar.am();
            }
        }
    }

    public boolean d() {
        if (this.c) {
            g();
            return false;
        }
        f();
        return true;
    }

    public boolean e() {
        return this.c;
    }

    public void f() {
        if (com.tsf.shell.manager.app.FeatureConfig.a() && !this.c) {
            this.c = true;
            com.censivn.C3DEngine.b.c.b.a(this);
            for (i iVar : this.d.b()) {
                if (iVar instanceof C) {
                    ((ShortcutItem) iVar).am();
                }
            }
            j();
            h();
        }
    }

    private void j() {
        this.a = com.tsf.shell.manager.app.Notifier.a(this.a, String.format(x.c(com.tsf.b.i.text_multi_select_title), Integer.valueOf(this.b.size())));
    }

    private void k() {
        com.tsf.shell.manager.app.Notifier.b(this.a);
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            g();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void g() {
        if (this.c) {
            k();
            this.c = false;
            com.censivn.C3DEngine.b.c.b.b(this);
            for (i iVar : this.d.b()) {
                if (iVar instanceof C) {
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

    public void a(C cVar) {
        this.b.add(cVar);
        j();
    }

    public void b(C cVar) {
        this.b.remove(cVar);
        j();
    }

    public ArrayList<C> i() {
        return this.b;
    }

    public void c(B bVar) {
    }

    public void b(B bVar) {
    }

    public void a(B bVar) {
    }

    public boolean a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
        return true;
    }
}
