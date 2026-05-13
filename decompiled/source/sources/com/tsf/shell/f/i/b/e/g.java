package com.tsf.shell.f.i.b.e;

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
import com.tsf.shell.f.f.a.a.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g extends a implements b.a {
    private com.tsf.shell.manager.a.f a;
    private boolean b;
    private boolean p;

    public g(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.a.f fVar, boolean z) {
        this(launcherShortcutAppInfo, com.tsf.shell.manager.o.b.a, fVar, z);
    }

    public g() {
        super(null, com.tsf.shell.manager.o.b.a);
        this.b = false;
    }

    public g(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.o.a aVar, com.tsf.shell.manager.a.f fVar, boolean z) {
        super(launcherShortcutAppInfo, aVar);
        this.b = false;
        this.a = fVar;
        if (launcherShortcutAppInfo != null) {
            a((ItemInfo) launcherShortcutAppInfo);
            launcherShortcutAppInfo.intent = fVar.a;
        }
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.e.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.i.b.e.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        super.onDrawChildEnd();
        if (this.b) {
            com.tsf.shell.manager.a.v.f.h().a(this);
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.censivn.C3DEngine.b.f.j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.b) {
            com.tsf.shell.manager.a.v.f.h().b(this);
        }
    }

    public void aX() {
        if (!this.b) {
            this.b = true;
            com.tsf.shell.manager.a.v.f.a((b) this);
        }
    }

    public void aY() {
        if (this.b) {
            this.b = false;
            com.tsf.shell.manager.a.v.f.b(this);
        }
    }

    @Override // com.tsf.shell.f.i.b
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

    public TextureElement aZ() {
        aA();
        return this.a.b();
    }

    @Override // com.tsf.shell.f.i.b
    public String r() {
        return this.a != null ? this.a.e : "";
    }

    @Override // com.tsf.shell.f.f.a.a.b.a
    public String r_() {
        return r();
    }

    @Override // com.tsf.shell.f.i.b
    public long s() {
        if (this.a != null) {
            return this.a.c;
        }
        return 0L;
    }

    public static com.tsf.shell.manager.a.f a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveInfo2 = null;
        Intent intent = launcherShortcut3DInfo.intent;
        ComponentName component = intent.getComponent();
        com.tsf.shell.manager.a.f b = com.tsf.shell.manager.bind.a.c().b(component);
        if (b == null) {
            com.tsf.shell.manager.a.f a = com.tsf.shell.manager.bind.a.c().a(component);
            if (a == null) {
                PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
                Intent intent2 = new Intent(intent.getAction(), (Uri) null);
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setPackage(component.getPackageName());
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                        if (!new ComponentName(resolveInfo3.activityInfo.packageName, resolveInfo3.activityInfo.name).equals(component)) {
                            resolveInfo3 = resolveInfo2;
                        }
                        resolveInfo2 = resolveInfo3;
                    }
                    resolveInfo = resolveInfo2;
                } else {
                    resolveInfo = null;
                }
                ResolveInfo resolveActivity = resolveInfo == null ? packageManager.resolveActivity(intent, 0) : resolveInfo;
                if (resolveActivity != null) {
                    com.tsf.shell.manager.a.f fVar = new com.tsf.shell.manager.a.f(resolveActivity);
                    com.tsf.shell.manager.bind.a.c().d(fVar);
                    return fVar;
                }
                com.tsf.shell.manager.a.f fVar2 = new com.tsf.shell.manager.a.f(component, launcherShortcut3DInfo.title);
                com.tsf.shell.manager.bind.a.c().a(fVar2);
                return fVar2;
            }
            return a;
        }
        return b;
    }

    public g ba() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        g gVar = new g(launcherShortcutAppInfo, this.a, false);
        gVar.position().setAll(position().x, position().y, 0.0f);
        gVar.scale().setAll(1.0f, 1.0f, 1.0f);
        gVar.rotation().setAll(0.0f, 0.0f, 0.0f);
        return gVar;
    }

    public LauncherShortcutAppInfo bb() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        launcherShortcutAppInfo.intent = this.a.a;
        return launcherShortcutAppInfo;
    }

    public LauncherShortcutAppInfo bc() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        launcherShortcutAppInfo.intent = this.a.a;
        launcherShortcutAppInfo.onUpdateName(launcherShortcutAppInfo.title, true);
        return launcherShortcutAppInfo;
    }

    public com.tsf.shell.manager.a.f bd() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.f.i.b.e.b
    public void k() {
        this.k.textures().clear();
        this.k.textures().addElement(LauncherShortcutAppInfo.getTexture(K() == null ? null : (LauncherShortcutAppInfo) K(), this.n, this.a));
        this.k.visible(true);
    }

    public boolean be() {
        if (this.a == null) {
            return true;
        }
        return this.a.c();
    }

    public boolean bf() {
        if (this.a == null) {
            return true;
        }
        return this.a.g;
    }

    @Override // com.tsf.shell.f.i.b
    public void C() {
        super.C();
    }

    public void bg() {
        if (!be()) {
            com.tsf.shell.utils.a.a(bd().b.getPackageName());
        } else {
            com.tsf.shell.e.a(b.i.notic_uninstall_error);
        }
    }

    public void bh() {
        com.tsf.shell.utils.a.a(com.censivn.C3DEngine.a.d(), bd().b.getPackageName());
    }

    public void aV() {
        if (bd() != null) {
            bd().a();
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b
    public void l() {
        super.l();
        if ((A() == null ? true : A().a((b) this)) && bd() != null) {
            bd().a();
        }
    }

    @Override // com.tsf.shell.f.i.b.e.b, com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void g() {
        super.g();
        aY();
    }

    @Override // com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void n_() {
        com.tsf.shell.d.a().a("WidgetShortcutApp");
        super.n_();
    }

    @Override // com.tsf.shell.f.i.c, com.tsf.shell.f.i.b
    public void c() {
        com.tsf.shell.d.a().b("WidgetShortcutApp");
        super.c();
    }

    @Override // com.tsf.shell.f.i.c
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
