package com.tsf.shell.manager.m;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.SelectionFrameLayoutItem;
import com.tsf.shell.f.i.MultiSelectController;
import com.tsf.shell.f.i.b.e.DrawerItemButton;
import com.tsf.shell.g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SideMenuManager implements e.a, a.InterfaceC0113a {
    public static class a extends com.tsf.shell.manager.f.WorkspaceScene.a {
        public void a() {
        }
    }

    public static float a = com.censivn.C3DEngine.b.b.A.a(300.0f);
    public static float b = com.censivn.C3DEngine.b.b.A.a(190.0f);
    private j c;
    private AddItemButton d;
    private DragSortContainer e;
    private SideMenuIndicator f;
    private com.tsf.shell.f.i.b.e.DrawerShortcutItemBase h;
    private b.a i;
    private com.tsf.shell.f.i.MultiSelectController j;
    private float m;
    private Runnable r;
    private boolean g = false;
    private int k = 1;
    private boolean l = true;
    private float n = 0.5f;
    private float o = 0.5f;
    private boolean p = false;
    private boolean q = false;
    private boolean s = false;

    public float a() {
        return this.n;
    }

    public float c() {
        return this.o;
    }

    public void a(float f) {
        this.n = f;
        f();
    }

    public void b(float f) {
        this.o = f;
        f();
    }

    public int d() {
        return this.k;
    }

    public void a(boolean z) {
        this.l = z;
    }

    public void b(boolean z) {
        this.l = false;
        if (!this.g) {
            this.q = true;
            this.f.mouseEnabled(false);
            if (z) {
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.SideMenuManager.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        b.this.f.visible(false);
                        b.this.f.c();
                    }
                };
                dVar.f(r());
                com.censivn.C3DEngine.b.g.c.a(this.f);
                com.censivn.C3DEngine.b.g.c.a(this.f, 600, dVar);
                return;
            }
            this.f.position().x = r();
            this.f.visible(false);
        }
    }

    public void a(i iVar) {
        if (this.l && !b(iVar)) {
            this.f.d_();
        }
    }

    public void e() {
        this.f.b();
    }

    public void a(int i, boolean z) {
        this.k = i == 0 ? 0 : 1;
        g();
        if (z) {
            com.tsf.shell.manager.b.ConfigManager.b(this.k);
        }
    }

    public void f() {
        this.m = com.censivn.C3DEngine.b.b.A.O ? this.n : this.o;
        this.f.position().y = (com.censivn.C3DEngine.b.b.A.B - b) - (((com.censivn.C3DEngine.b.b.A.B - com.censivn.C3DEngine.b.b.A.C) - (2.0f * b)) * this.m);
    }

    public void g() {
        this.f.position().x = r();
        this.f.a(q(), false);
        this.d.position().x = s();
    }

    public void h() {
        com.tsf.shell.manager.b.ConfigManager.c(this.n);
        com.tsf.shell.manager.b.ConfigManager.d(this.o);
    }

    public void a(j jVar) {
        this.n = com.tsf.shell.manager.b.ConfigManager.j();
        this.n = this.n > 1.0f ? 0.4f : this.n;
        this.n = this.n < 0.0f ? 0.4f : this.n;
        this.o = com.tsf.shell.manager.b.ConfigManager.k();
        this.o = this.o > 1.0f ? 0.4f : this.o;
        this.o = this.o >= 0.0f ? this.o : 0.4f;
        this.k = com.tsf.shell.manager.b.ConfigManager.i() == 0 ? 0 : 1;
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.j = new com.tsf.shell.f.i.MultiSelectController(this, this) { // from class: com.tsf.shell.manager.m.SideMenuManager.3
            @Override // com.tsf.shell.f.i.MultiSelectController
            public void a(com.tsf.shell.f.i.PageItem bVar) {
            }
        };
        this.h = new h();
        this.c = new j();
        this.e = new a(this) { // from class: com.tsf.shell.manager.m.SideMenuManager.4
            @Override // com.censivn.C3DEngine.b.b.A.c, com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
            public void addChild(i iVar) {
                super.a(iVar, true);
            }
        };
        this.e.a(com.censivn.C3DEngine.b.b.A.a(60.0f));
        this.e.b(com.censivn.C3DEngine.b.b.A.a(10.0f));
        this.d = new c(this, this.e);
        this.e.a((com.censivn.C3DEngine.b.b.A.e) this.d);
        this.d.visible(false);
        this.d.a(this.e);
        jVar.addChild(this.c);
        this.f = new d(this) { // from class: com.tsf.shell.manager.m.SideMenuManager.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tsf.shell.manager.m.SideMenuIndicator, com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean a(f fVar, float f, float f2) {
                return b.this.b((i) fVar);
            }

            @Override // com.tsf.shell.manager.m.SideMenuIndicator, com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public void a(f fVar) {
                if (!b.this.g) {
                    com.tsf.shell.manager.app.StateHub.b().c();
                    com.tsf.shell.manager.app.WidgetAnimator.c();
                    b.this.c(false);
                    b.this.e.a(fVar);
                    b();
                }
            }

            @Override // com.tsf.shell.manager.m.SideMenuIndicator, com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
            public boolean b(f fVar) {
                return fVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase;
            }
        };
        this.c.addChild(this.f);
        this.c.addChild(this.d);
        this.i = new b.a() { // from class: com.tsf.shell.manager.m.SideMenuManager.6
            @Override // com.tsf.shell.manager.f.WorkspaceScene.a
            public void a() {
                if (!b.this.e.v()) {
                    b.this.t();
                }
            }
        };
        p();
        g();
        if (!com.tsf.shell.manager.b.ConfigManager.h()) {
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(i iVar) {
        boolean z;
        if (this.q) {
            return true;
        }
        if (!this.l) {
            z = false;
        } else if (iVar instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) {
            Iterator<com.tsf.shell.f.i.ShortcutItem> it = ((com.tsf.shell.f.i.b.e.DrawerShortcutItemBase) iVar).av().iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof com.tsf.shell.f.i.b.e.DrawerShortcutItemBase)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public void i() {
        if (this.l && !this.q) {
            this.q = true;
            this.f.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.SideMenuManager.7
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.f.visible(false);
                }
            };
            if (this.k == 0) {
                dVar.f(com.censivn.C3DEngine.b.b.A.z - com.censivn.C3DEngine.b.b.A.a(30.0f));
            } else {
                dVar.f(com.censivn.C3DEngine.b.b.A.A + com.censivn.C3DEngine.b.b.A.a(30.0f));
            }
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 350, dVar);
        }
    }

    public void j() {
        if (this.l && this.q) {
            this.q = false;
            this.f.visible(true);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.SideMenuManager.8
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.f.mouseEnabled(true);
                }
            };
            dVar.f(r());
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 350, dVar);
        }
    }

    public j k() {
        return this.c;
    }

    @Override // com.tsf.shell.f.i.a.InterfaceC0113a
    public ArrayList<i> b() {
        return this.e.children();
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, boolean z) {
        bVar.a(this.j);
        if (z) {
            bVar.K().onUpdateContainer(-5);
        }
    }

    private void p() {
        this.f.position().x = r();
        this.d.setAABBPX((-a) / 2.0f, -com.censivn.C3DEngine.b.b.A.E, 0.0f, a / 2.0f, 0.0f, 0.0f);
        this.d.position().y = com.censivn.C3DEngine.b.b.A.B;
        this.d.position().x = s();
        this.d.h();
        f();
    }

    private int q() {
        return this.g ? this.k == 0 ? 180 : 0 : this.k == 0 ? 0 : 180;
    }

    private float r() {
        if (this.g) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.A.z + a;
            }
            return com.censivn.C3DEngine.b.b.A.A - a;
        }
        if (this.l) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.A.z + com.censivn.C3DEngine.b.b.A.a(30.0f);
            }
            return com.censivn.C3DEngine.b.b.A.A - com.censivn.C3DEngine.b.b.A.a(30.0f);
        }
        if (this.k == 0) {
            return com.censivn.C3DEngine.b.b.A.z - com.censivn.C3DEngine.b.b.A.a(60.0f);
        }
        return com.censivn.C3DEngine.b.b.A.A + com.censivn.C3DEngine.b.b.A.a(60.0f);
    }

    private float s() {
        if (this.g) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.A.z + (a / 2.0f);
            }
            return com.censivn.C3DEngine.b.b.A.A - (a / 2.0f);
        }
        if (this.k == 0) {
            return com.censivn.C3DEngine.b.b.A.z - (a / 2.0f);
        }
        return com.censivn.C3DEngine.b.b.A.A + (a / 2.0f);
    }

    public void l() {
        if (this.g) {
            t();
        } else {
            c(true);
        }
    }

    public boolean m() {
        return this.p;
    }

    public void c(boolean z) {
        if (!com.tsf.shell.manager.app.StateHub.s().a()) {
            this.p = !z;
            if (z) {
            }
            if (!this.g) {
                this.g = true;
                com.tsf.shell.manager.app.DataCoordinator.a(this.i, ItemInfo.APP_INTENT, (Runnable) null);
                com.tsf.shell.manager.app.ServiceFactory.k();
                this.f.visible(true);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.f(r());
                dVar.a(com.censivn.C3DEngine.b.g.a.e);
                com.censivn.C3DEngine.b.g.c.a(this.f);
                com.censivn.C3DEngine.b.g.c.a(this.f, 500, dVar);
                this.f.a(q(), true);
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.f(s());
                dVar2.a(com.censivn.C3DEngine.b.g.a.a);
                com.censivn.C3DEngine.b.g.c.a(this.d);
                com.censivn.C3DEngine.b.g.c.a(this.d, 500, dVar2);
                this.d.visible(true);
                this.d.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        a((Runnable) null);
    }

    public void a(Runnable runnable) {
        if (this.g) {
            this.g = false;
            com.tsf.shell.manager.app.DataCoordinator.a(runnable, true);
            com.tsf.shell.manager.app.ServiceFactory.i();
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.SideMenuManager.9
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    if (!b.this.l) {
                        b.this.f.visible(false);
                    }
                    if (b.this.d != null) {
                        b.this.d.k();
                    }
                }
            };
            dVar.f(r());
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, 500, dVar);
            this.f.a(q(), true);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.m.SideMenuManager.10
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    b.this.d.visible(false);
                }
            };
            dVar2.f(s());
            com.censivn.C3DEngine.b.g.c.a(this.d);
            com.censivn.C3DEngine.b.g.c.a(this.d, 300, dVar2);
        }
    }

    public void a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = com.tsf.shell.utils.ItemInfoListSorter.a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVarA = com.tsf.shell.manager.l.ShortcutManager.a(it.next(), true);
            a((com.tsf.shell.f.i.PageItem) bVarA, false);
            this.e.addChild(bVarA);
        }
        this.e.a();
    }

    public static String n() {
        Cursor cursorQuery = com.censivn.C3DEngine.A.d().getContentResolver().query(g.C0121g.a, null, null, null, null);
        String string = "";
        while (cursorQuery.moveToNext()) {
            string = cursorQuery.getString(cursorQuery.getColumnIndex("child"));
        }
        if (string == null) {
            string = "";
        }
        cursorQuery.close();
        return string;
    }

    public void o() {
        if (this.r == null) {
            u();
        }
        if (!this.s) {
            this.s = true;
            com.censivn.C3DEngine.A.a().c(this.r);
        }
    }

    private void u() {
        this.r = new Runnable() { // from class: com.tsf.shell.manager.m.SideMenuManager.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.s = false;
                final String str = "";
                for (i iVar : b.this.e.children()) {
                    str = iVar instanceof com.tsf.shell.f.i.PageItem ? str + ((com.tsf.shell.f.i.PageItem) iVar).K().id + "," : str;
                }
                com.censivn.C3DEngine.A.a().d(new Runnable() { // from class: com.tsf.shell.manager.m.SideMenuManager.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.A.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str);
                        contentResolver.update(ContentUris.withAppendedId(g.C0121g.a, 1L), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        p();
    }
}
