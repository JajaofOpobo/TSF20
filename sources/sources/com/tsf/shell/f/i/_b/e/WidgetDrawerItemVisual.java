package com.tsf.shell.f.i._b.e;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.f.f.a._a.DrawerSectionManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetDrawerItemVisual extends WidgetDrawerItemBase {
    private com.tsf.shell.manager.app.LauncherAppInfo a;
    private boolean b;
    private boolean p;

    public WidgetDrawerItemVisual(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.app.LauncherAppInfo fVar, boolean z) {
        this(launcherShortcutAppInfo, com.tsf.shell.manager.o.ButtonPresetManager.a, fVar, z);
    }

    public WidgetDrawerItemVisual() {
        super(null, com.tsf.shell.manager.o.ButtonPresetManager.a);
        this.b = false;
    }

    public WidgetDrawerItemVisual(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.o.ButtonMetrics aVar, com.tsf.shell.manager.app.LauncherAppInfo fVar, boolean z) {
        super(launcherShortcutAppInfo, aVar);
        this.b = false;
        this.a = fVar;
        if (launcherShortcutAppInfo != null) {
            a((ItemInfo) launcherShortcutAppInfo);
            launcherShortcutAppInfo.intent = fVar.a;
        }
        if (z) {
            com.tsf.shell.manager.bind.ShellBindController.DrawerSectionManager.a(this);
        } else if (com.censivn.C3DEngine.a.WidgetDrawerItemEffect.l()) {
            WidgetDrawerItemVisual();
        } else {
            com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildStart() {
        super.onDrawChildEnd();
        if (this.b) {
            com.tsf.shell.manager.app.v.StateAccessor.h().a(this);
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.b) {
            com.tsf.shell.manager.app.v.StateAccessor.h().b(this);
        }
    }

    public void aX() {
        if (!this.b) {
            this.b = true;
            com.tsf.shell.manager.app.v.StateAccessor.a((WidgetDrawerShortcutItemBase) this);
        }
    }

    public void aY() {
        if (this.b) {
            this.b = false;
            com.tsf.shell.manager.app.v.StateAccessor.b(this);
        }
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void a(ItemInfo itemInfo) {
        super.a(itemInfo);
        LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
        if (this.a != null) {
            launcherShortcutAppInfo.intent = this.a.a;
        }
        launcherShortcutAppInfo.setWidget(this);
    }

    public void b(ItemInfo itemInfo) {
        super.a(itemInfo);
        LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) itemInfo;
        if (this.a != null) {
            launcherShortcutAppInfo.intent = this.a.a;
            launcherShortcutAppInfo.title = this.a.e;
        }
        launcherShortcutAppInfo.setWidget(this);
    }

    public TextureElement aA() {
        aA();
        return this.WidgetDrawerItemBase.b();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public String c() {
        return this.a != null ? this.a.e : "";
    }

    @Override // com.tsf.shell.f.f.a._a.b.DrawerButtonElement
    public String c() {
        return r();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public long s() {
        if (this.a != null) {
            return this.a.c;
        }
        return 0L;
    }

    public static com.tsf.shell.manager.app.LauncherAppInfo a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveInfo2 = null;
        Intent intent = launcherShortcut3DInfo.intent;
        ComponentName component = intent.getComponent();
        com.tsf.shell.manager.app.LauncherAppInfo fVarB = com.tsf.shell.manager.bind.ShellBindContext.c().b(component);
        if (fVarB == null) {
            com.tsf.shell.manager.app.LauncherAppInfo fVarA = com.tsf.shell.manager.bind.ShellBindContext.c().a(component);
            if (fVarA == null) {
                PackageManager packageManager = com.censivn.C3DEngine.C3DEngine.d().getPackageManager();
                Intent intent2 = new Intent(intent.getAction(), (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setPackage(component.getPackageName());
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (listQueryIntentActivities != null) {
                    for (ResolveInfo resolveInfo3 : listQueryIntentActivities) {
                        if (!new ComponentName(resolveInfo3.activityInfo.packageName, resolveInfo3.activityInfo.name).equals(component)) {
                            resolveInfo3 = resolveInfo2;
                        }
                        resolveInfo2 = resolveInfo3;
                    }
                    resolveInfo = resolveInfo2;
                } else {
                    resolveInfo = null;
                }
                ResolveInfo resolveInfoResolveActivity = resolveInfo == null ? packageManager.resolveActivity(intent, 0) : resolveInfo;
                if (resolveInfoResolveActivity != null) {
                    com.tsf.shell.manager.app.LauncherAppInfo fVar = new com.tsf.shell.manager.app.LauncherAppInfo(resolveInfoResolveActivity);
                    com.tsf.shell.manager.bind.ShellBindContext.c().d(fVar);
                    return fVar;
                }
                com.tsf.shell.manager.app.LauncherAppInfo fVar2 = new com.tsf.shell.manager.app.LauncherAppInfo(component, launcherShortcut3DInfo.title);
                com.tsf.shell.manager.bind.ShellBindContext.c().a(fVar2);
                return fVar2;
            }
            return fVarA;
        }
        return fVarB;
    }

    public WidgetDrawerItemVisual ba() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        g gVar = new WidgetDrawerItemVisual(launcherShortcutAppInfo, this.a, false);
        gVar.position().setAll(position().x, position().y, 0.0f);
        gVar.scale().setAll(1.0f, 1.0f, 1.0f);
        gVar.rotation().setAll(0.0f, 0.0f, 0.0f);
        return gVar;
    }

    public LauncherShortcutAppInfo a() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        launcherShortcutAppInfo.intent = this.a.a;
        return launcherShortcutAppInfo;
    }

    public LauncherShortcutAppInfo b() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        launcherShortcutAppInfo.intent = this.a.a;
        launcherShortcutAppInfo.onUpdateName(launcherShortcutAppInfo.title, true);
        return launcherShortcutAppInfo;
    }

    public com.tsf.shell.manager.app.LauncherAppInfo bd() {
        return this.a;
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    protected void k() {
        this.k.textures().clear();
        this.k.textures().addElement(LauncherShortcutAppInfo.getTexture(K() == null ? null : (LauncherShortcutAppInfo) K(), this.n, this.a));
        this.k.visible(true);
    }

    public boolean be() {
        if (this.a == null) {
            return true;
        }
        return this.WidgetDrawerItemBase.c();
    }

    public boolean bf() {
        if (this.a == null) {
            return true;
        }
        return this.a.g;
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void C() {
        super.C();
    }

    public void bg() {
        if (!be()) {
            com.tsf.shell.utils.PackageManagerHelper.a(bd().DrawerSectionManager.getPackageName());
        } else {
            com.tsf.shell.WidgetDrawerItemEffect.a(WidgetDrawerShortcutItemBase.i.notic_uninstall_error);
        }
    }

    public void bh() {
        com.tsf.shell.utils.PackageManagerHelper.a(com.censivn.C3DEngine.C3DEngine.d(), bd().DrawerSectionManager.getPackageName());
    }

    public void aV() {
        if (bd() != null) {
            bd().a();
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase
    public void l() {
        super.l();
        if ((A() == null ? true : A().a((WidgetDrawerShortcutItemBase) this)) && bd() != null) {
            bd().a();
        }
    }

    @Override // com.tsf.shell.f.i._b.e.WidgetDrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void g() {
        super.g();
        aY();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void n_() {
        com.tsf.shell.WidgetDrawerItemAction.ShellDataParser().a("WidgetShortcutApp");
        super.n_();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem, com.tsf.shell.f.i.PageItem
    public void c() {
        com.tsf.shell.WidgetDrawerItemAction.ShellDataParser().b("WidgetShortcutApp");
        super.c();
    }

    @Override // com.tsf.shell.f.i.ShortcutItem
    public ArrayList<Integer> a(ArrayList<Integer> arrayList) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(3);
        if (rotation().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(5);
        return arrayList;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public boolean bi() {
        return this.p;
    }
}
