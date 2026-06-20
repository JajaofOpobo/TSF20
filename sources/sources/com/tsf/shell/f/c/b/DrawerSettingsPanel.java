package com.tsf.shell.f.c.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.f.c.b.a.IDrawerSettingsCallback;
import com.tsf.shell.ShellGraphicsContext;
import com.tsf.shell.utils.ItemInfoListSorter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSettingsPanel implements com.censivn.C3DEngine.b.c.WindowManager.a {
    public static int a = 1;
    private BaseRenderable d;
    private com.tsf.shell.f.e.PageIndicatorStrip e;
    private com.tsf.shell.f.c.b.a.IDrawerSettingsCallback f;
    private com.censivn.C3DEngine.b.h.e.DockRenderer i;
    private A j;
    private A k;
    private Runnable l;
    private boolean m;
    private float b = 25.0f;
    private float c = 55.0f;
    private boolean g = true;
    private b h = new DrawerSettingsData();
    private float n = 0.0f;
    private boolean o = true;

    public DrawerSettingsPanel(boolean z) {
        this.m = false;
        this.m = z;
    }

    public BaseRenderable a() {
        return this.d;
    }

    public void b() {
        int i;
        boolean z;
        float f = 0.0f;
        this.b = com.censivn.C3DEngine.b.b.ScreenConstants.a(this.b);
        this.c = com.censivn.C3DEngine.b.b.ScreenConstants.a(this.c);
        com.tsf.shell.manager.app.ObserverManager.a(this);
        this.f = new com.tsf.shell.f.c.b.a.DrawerSettingsResult(this, this.m ? com.tsf.shell.manager.o.ButtonPresetManager.c : com.tsf.shell.manager.o.ButtonPresetManager.a);
        this.d = new BaseRenderable();
        this.i = new com.censivn.C3DEngine.b.h.e.DockRenderer(com.censivn.C3DEngine.b.b.ScreenConstants.D, f, com.censivn.C3DEngine.b.b.ScreenConstants.D, f, f) { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.1
            @Override // com.censivn.C3DEngine.b.h.e.DockRenderer
            public void a(int i2) {
                if (e.this.c(i2).c() == 0) {
                    e.this.i.g();
                }
            }

            @Override // com.censivn.C3DEngine.b.h.e.DockRenderer
            public void b(int i2) {
                e.this.d(i2);
                if (e.this.c(i2).c() != 0) {
                }
            }

            @Override // com.censivn.C3DEngine.b.h.e.DockRenderer
            public void a() {
                e.this.i.h();
            }
        };
        int i2 = 0;
        boolean z2 = true;
        int i3 = 1;
        while (i2 < 3) {
            if (i3 == 0) {
                a = i2;
            }
            A aVar = new DrawerSettingsItemType(this, this.b, this.c, i3) { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.2
                @Override // com.tsf.shell.f.c.b.DrawerSettingsItemType
                public void e() {
                }
            };
            if (i3 == 1) {
                z = false;
                i = 0;
            } else if (z2) {
                i = i3 - 2;
                z = z2;
            } else {
                i = i3 + 2;
                z = z2;
            }
            this.i.addChild(aVar);
            i2++;
            z2 = z;
            i3 = i;
        }
        this.i.e();
        this.i.a(a, false);
        this.k = (DrawerSettingsItemType) this.i.getChildAt(DrawerSettingsItemType);
        d(DrawerSettingsItemType);
        this.d.addChild(this.i);
        if (!this.m) {
            this.e = com.tsf.shell.manager.app.StateHub.h();
        } else {
            this.e = new com.tsf.shell.f.e.PageIndicatorStrip(false);
            this.e.a(5);
            this.e.b(2);
        }
        this.d.addChild(this.e);
        DrawerSettingsPanel();
        a.C0084a c0084aB = this.f.b();
        this.e.position().x = c0084aB.g;
        this.e.position().y = c0084aB.h;
        DrawerSettingsPanel();
        this.i.g();
        if (com.tsf.shell.manager.app.WidgetPanelController.c() != 0) {
            b(false);
        }
    }

    public void c() {
        this.e.b(this.m);
    }

    public void d() {
        this.e.a(this.m);
    }

    public boolean e() {
        return this.m;
    }

    public void f() {
        this.i.f();
    }

    private a b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < 3) {
                A aVar = (DrawerSettingsItemType) this.i.getChildAt(i3);
                if (aVar.c() != i) {
                    i2 = i3 + 1;
                } else {
                    return aVar;
                }
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a c(int i) {
        if (i < 3) {
            return (DrawerSettingsItemType) this.i.getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.j != null && !this.m) {
            com.tsf.shell.manager.app.StateManager.c(this.j);
        }
        this.j = (DrawerSettingsItemType) this.i.getChildAt(i);
        if (this.g && !this.m) {
            com.tsf.shell.manager.app.StateManager.b(this.j);
        }
    }

    private void p() {
        this.l = new Runnable() { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.i.a(1, true);
            }
        };
    }

    public void a(int i) {
        float f = (i / 100.0f) * (com.censivn.C3DEngine.b.b.ScreenConstants.D / 2.0f);
        if (this.n != f) {
            this.n = f;
            a(false);
        }
    }

    public void g() {
        a(true);
    }

    public void a(boolean z) {
        if (!this.m && z) {
            a(com.censivn.C3DEngine.b.b.ScreenConstants.O ? com.tsf.shell.manager.b.ConfigManager.t() : com.tsf.shell.manager.b.ConfigManager.u());
        }
        float f = com.censivn.C3DEngine.b.b.ScreenConstants.D - this.n;
        DrawerSettingsPanel().a(f, this.c, this.c, this.b);
        this.i.a(DrawerSettingsConfig);
        this.i.a((-f) / 2.0f, (-com.censivn.C3DEngine.b.b.ScreenConstants.g) / 2.0f, f / 2.0f, com.censivn.C3DEngine.b.b.ScreenConstants.g);
        a.C0084a c0084aB = this.f.b();
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
        if (this.g) {
            this.d.position().y = c0084aB.b;
        } else {
            this.d.position().y = c0084aB.d;
        }
        if (this.o) {
            this.i.position().y = c0084aB.f;
        } else {
            this.i.position().y = c0084aB.j;
        }
        Iterator<i> it = this.i.b().children().iterator();
        while (it.hasNext()) {
            A aVar = (DrawerSettingsItemType) it.next();
            DrawerSettingsPanel().a(aVar);
            aVar.g();
        }
        this.f.a(this.i.c());
    }

    public com.tsf.shell.f.c.b.a.IDrawerSettingsCallback h() {
        return this.f;
    }

    public static ArrayList<String> i() {
        ContentResolver contentResolver = com.censivn.C3DEngine.C3DEngine.d().getContentResolver();
        Cursor cursorQuery = contentResolver.query(g.d.a, null, null, null, null);
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("child"));
            if (string == null) {
                string = "";
            }
            arrayList.add(string);
            i++;
        }
        if (i < 3) {
            int i2 = 3 - i;
            for (int i3 = 0; i3 < i2; i3++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", "");
                contentResolver.insert(g.d.a, contentValues);
                arrayList.add("");
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public void a(ArrayList<ItemInfo> arrayList, ArrayList<String> arrayList2) {
        boolean z;
        int size = arrayList2.size();
        ArrayList<ItemInfo> arrayList3 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<ItemInfo> arrayListA = h.a(arrayList, arrayList2.get(i), ",", false);
            A aVarB = b(i);
            boolean z2 = false;
            for (ItemInfo itemInfo : arrayListA) {
                if (aVarB.a(1)) {
                    a(aVarB, itemInfo);
                    z = z2;
                } else {
                    arrayList3.add(itemInfo);
                    z = true;
                }
                z2 = z;
            }
            if (z2) {
                aVarB.i();
            }
        }
        arrayList3.addAll(arrayList);
        a(arrayList3);
        for (int i2 = 0; i2 < 3; i2++) {
            ((DrawerSettingsItemType) this.i.getChildAt(i2)).f();
        }
    }

    private void a(ArrayList<ItemInfo> arrayList) {
        com.tsf.shell.f.i.PageItem bVarA;
        A aVar = (DrawerSettingsItemType) this.i.getChildAt(this.i.numChildren() - 1);
        for (ItemInfo itemInfo : arrayList) {
            if (itemInfo.itemType == 1) {
                bVarA = com.tsf.shell.f.i.b.d.FolderShortcutItem.a((LauncherFolder3DInfo) itemInfo);
            } else {
                bVarA = com.tsf.shell.manager.l.ShortcutManager.a(itemInfo, true);
            }
            aVar.a(bVarA, false);
            aVar.addChild(bVarA);
            aVar.i();
        }
    }

    public void a(int i, com.tsf.shell.f.i.PageItem bVar) {
        A aVarC = c(i);
        aVarC.a(bVar, false);
        aVarC.addChild(bVar);
    }

    private void a(A aVar, ItemInfo itemInfo) {
        com.tsf.shell.f.i.PageItem bVarA;
        if (itemInfo.itemType == 1) {
            bVarA = com.tsf.shell.f.i.b.d.FolderShortcutItem.a((LauncherFolder3DInfo) itemInfo);
        } else {
            bVarA = com.tsf.shell.manager.l.ShortcutManager.a(itemInfo, true);
        }
        aVar.a(bVarA, false);
        aVar.addChild(bVarA);
    }

    public boolean j() {
        return this.o;
    }

    public void k() {
        if (this.m || com.tsf.shell.manager.app.WidgetPanelController.c() == 0) {
            if (this.o) {
                b(true);
            } else {
                c(true);
            }
        }
    }

    public a.C0084a l() {
        return this.f.b();
    }

    public void b(boolean z) {
        if (this.o) {
            this.o = false;
            a.C0084a c0084aL = l();
            float f = this.m ? 0.0f : com.censivn.C3DEngine.b.b.ScreenConstants.K;
            if (z) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.h(c0084aL.l);
                dVar.f(c0084aL.k);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, VEasing.Linear.easeNone, dVar);
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.4
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        e.this.i.visible(false);
                    }
                };
                dVar2.h(c0084aL.j - f);
                dVar2.f(c0084aL.i);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i, VEasing.Linear.easeNone, dVar2);
            } else {
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                this.i.position().x = c0084aL.i;
                this.i.position().y = c0084aL.j - f;
                this.e.position().x = c0084aL.k;
                this.e.position().y = c0084aL.l;
                this.i.visible(false);
            }
            if (!this.m) {
                com.tsf.shell.manager.b.ConfigManager.e(true);
                com.tsf.shell.manager.app.StateManager.c(this.j);
                com.tsf.shell.manager.app.StateHub.t().ar();
            }
        }
    }

    public void c(boolean z) {
        if (!this.o) {
            this.o = true;
            a.C0084a c0084aL = l();
            this.i.visible(true);
            if (z) {
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar.h(c0084aL.h);
                dVar.f(c0084aL.g);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e, VEasing.Linear.easeNone, dVar);
                com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
                dVar2.h(c0084aL.f);
                dVar2.f(c0084aL.e);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i, VEasing.Linear.easeNone, dVar2);
            } else {
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.i);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.e);
                this.i.position().x = c0084aL.e;
                this.i.position().y = c0084aL.f;
                this.e.position().x = c0084aL.g;
                this.e.position().y = c0084aL.h;
            }
            if (!this.m) {
                com.tsf.shell.manager.app.StateManager.b(this.j);
                com.tsf.shell.manager.b.ConfigManager.e(false);
                com.tsf.shell.manager.app.StateHub.t().ar();
            }
        }
    }

    public void m() {
        if (this.o && this.g) {
            if (!this.m) {
                com.tsf.shell.manager.app.StateManager.c(this.j);
            }
            this.g = false;
            this.d.mouseEnabled(false);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    e.this.d.visible(false);
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void c() {
                    e.this.d.visible(false);
                }
            };
            a.C0084a c0084aL = l();
            dVar.f(c0084aL.c);
            dVar.h(c0084aL.d);
            dVar.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, VEasing.Linear.easeNone, dVar);
        }
    }

    public void n() {
        if (this.o && !this.g) {
            this.g = true;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.c.b.DrawerSettingsPanel.6
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    e.this.d.mouseEnabled(true);
                    if (!e.this.m) {
                        com.tsf.shell.manager.app.StateManager.b(e.this.j);
                    }
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void c() {
                    e.this.d.mouseEnabled(true);
                    if (!e.this.m) {
                        com.tsf.shell.manager.app.StateManager.b(e.this.j);
                    }
                }
            };
            this.d.mouseEnabled(false);
            a.C0084a c0084aB = this.f.b();
            dVar.f(c0084aB.a);
            dVar.h(c0084aB.b);
            dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
            dVar.a(255);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 500, dVar);
            this.d.visible(true);
        }
    }

    public b a(i iVar) {
        b bVarA = null;
        for (int i = 0; i < 3 && (bVarA = ((DrawerSettingsItemType) this.i.getChildAt(i)).a(iVar)) == null; i++) {
        }
        a.C0084a c0084aB = this.f.b();
        float f = bVarA.a + c0084aB.a + c0084aB.e;
        float f2 = c0084aB.f + bVarA.b + c0084aB.b;
        this.h.a(bVarA);
        this.h.a = f;
        this.h.b = f2;
        return this.h;
    }

    @Override // com.censivn.C3DEngine.b.c.WindowManager.a
    public void a(int i, int i2, int i3, int i4) {
        DrawerSettingsPanel();
    }

    public void o() {
    }
}
