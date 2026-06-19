package com.tsf.shell.f._d.c;

import com.tsf.shell.f._d.c.a.b;
import com.tsf.shell.f._d.c.a.d;
import com.tsf.shell.f._d.c.a.e;
import com.tsf.shell.f.f.TransitionManager;
import com.tsf.shell.f.f.TransitionRenderer;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class A extends c<d> {
    private com.tsf.shell.f.e.f.EditModeController a;

    public A() {
        ArrayList<LauncherAppInfo> arrayList = new ArrayList<>();
        this.a = new com.tsf.shell.f.e.f.EditModeController();
        arrayList.add(new e(0, true, false));
        arrayList.add(new e(1, false, false));
        arrayList.add(new com.tsf.shell.f._d.c.a.a(10, true, true));
        arrayList.add(new com.tsf.shell.f._d.c.a.a(11, false, true));
        arrayList.add(new b(20, true, true));
        arrayList.add(new b(21, false, true));
        a(arrayList);
    }

    public void a() {
    }

    public com.tsf.shell.f.e.f.EditModeController d() {
        return this.a;
    }

    public boolean e() {
        if (this.a == null) {
            return false;
        }
        return this.a.a();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(d dVar) {
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.ConfigManager.h(z);
        com.tsf.shell.manager.b.ConfigManager.e(str);
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public boolean b() {
        return com.tsf.shell.manager.b.ConfigManager.B();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public String c() {
        return com.tsf.shell.manager.b.ConfigManager.C();
    }
}
