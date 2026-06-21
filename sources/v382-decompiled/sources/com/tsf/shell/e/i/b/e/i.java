package com.tsf.shell.e.i.b.e;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i extends a implements com.tsf.shell.e.f.a.a.c {
    private com.tsf.shell.manager.a.i a;
    private boolean b;
    private boolean p;

    public i(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.a.i iVar, boolean z) {
        this(launcherShortcutAppInfo, com.tsf.shell.manager.o.b.a, iVar, z);
    }

    public i() {
        super(null, com.tsf.shell.manager.o.b.a);
        this.b = false;
    }

    public i(LauncherShortcutAppInfo launcherShortcutAppInfo, com.tsf.shell.manager.o.a aVar, com.tsf.shell.manager.a.i iVar, boolean z) {
        super(launcherShortcutAppInfo, aVar);
        this.b = false;
        this.a = iVar;
        if (launcherShortcutAppInfo != null) {
            a((ItemInfo) launcherShortcutAppInfo);
            launcherShortcutAppInfo.intent = iVar.a;
        }
        if (z) {
            com.tsf.shell.manager.bind.b.b.a(this);
        } else if (com.censivn.C3DEngine.a.i.l()) {
            k();
        } else {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.i.b.e.i.1
                @Override // java.lang.Runnable
                public void run() {
                    i.this.k();
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        super.onDrawChildEnd();
        if (this.b) {
            ((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.h()).a(this);
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.censivn.C3DEngine.b.f.l
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        if (this.b) {
            ((com.tsf.shell.e.d.b.a.e) com.tsf.shell.manager.a.v.f.h()).b(this);
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

    @Override // com.tsf.shell.e.i.c
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

    @Override // com.tsf.shell.e.i.c
    public String r() {
        return this.a != null ? this.a.e : "";
    }

    @Override // com.tsf.shell.e.f.a.a.c
    public String p_() {
        return r();
    }

    @Override // com.tsf.shell.e.i.c
    public long s() {
        if (this.a != null) {
            return this.a.c;
        }
        return 0L;
    }

    public static com.tsf.shell.manager.a.i a(LauncherShortcut3DInfo launcherShortcut3DInfo) {
        ResolveInfo resolveInfo = null;
        Intent intent = launcherShortcut3DInfo.intent;
        ComponentName component = intent.getComponent();
        com.tsf.shell.manager.a.i b = com.tsf.shell.manager.bind.a.c().b(component);
        if (b != null || (b = com.tsf.shell.manager.bind.a.c().a(component)) != null) {
            return b;
        }
        PackageManager packageManager = com.censivn.C3DEngine.a.d().getPackageManager();
        Intent intent2 = new Intent(intent.getAction(), (Uri) null);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setPackage(component.getPackageName());
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        if (queryIntentActivities != null) {
            ResolveInfo resolveInfo2 = null;
            for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                if (new ComponentName(resolveInfo3.activityInfo.packageName, resolveInfo3.activityInfo.name).equals(component)) {
                    resolveInfo2 = resolveInfo3;
                }
            }
            resolveInfo = resolveInfo2;
        }
        ResolveInfo resolveActivity = resolveInfo == null ? packageManager.resolveActivity(intent, 0) : resolveInfo;
        if (resolveActivity != null) {
            com.tsf.shell.manager.a.i iVar = new com.tsf.shell.manager.a.i(resolveActivity);
            com.tsf.shell.manager.bind.a.c().d(iVar);
            return iVar;
        }
        com.tsf.shell.manager.a.i iVar2 = new com.tsf.shell.manager.a.i(component, launcherShortcut3DInfo.title);
        com.tsf.shell.manager.bind.a.c().a(iVar2);
        return iVar2;
    }

    public i ba() {
        LauncherShortcutAppInfo launcherShortcutAppInfo = new LauncherShortcutAppInfo();
        launcherShortcutAppInfo.title = bd().e;
        i iVar = new i(launcherShortcutAppInfo, this.a, false);
        iVar.position().setAll(position().x, position().y, 0.0f);
        iVar.scale().setAll(1.0f, 1.0f, 1.0f);
        iVar.rotation().setAll(0.0f, 0.0f, 0.0f);
        return iVar;
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

    public com.tsf.shell.manager.a.i bd() {
        return this.a;
    }

    @Override // com.tsf.shell.e.i.b.e.b
    protected void k() {
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

    @Override // com.tsf.shell.e.i.c
    public void C() {
        super.C();
    }

    public void bg() {
        if (!be()) {
            com.tsf.shell.utils.a.a(bd().b.getPackageName());
        } else {
            com.tsf.shell.k.a(R.string.notic_uninstall_error);
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

    @Override // com.tsf.shell.e.i.b.e.b
    public void l() {
        super.l();
        if ((A() == null ? true : A().a((b) this)) && bd() != null) {
            bd().a();
        }
    }

    @Override // com.tsf.shell.e.i.b.e.b, com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void g() {
        super.g();
        aY();
    }

    @Override // com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void l_() {
        com.tsf.shell.g.a().a("WidgetShortcutApp");
        super.l_();
    }

    @Override // com.tsf.shell.e.i.e, com.tsf.shell.e.i.c
    public void c() {
        com.tsf.shell.g.a().b("WidgetShortcutApp");
        super.c();
    }

    @Override // com.tsf.shell.e.i.e
    public ArrayList a(ArrayList arrayList) {
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
