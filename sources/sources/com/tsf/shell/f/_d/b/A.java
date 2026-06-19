package com.tsf.shell.f._d.b;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.f._d.b.a.d;
import com.tsf.shell.f._d.b.a.e;
import com.tsf.shell.f.f.TransitionManager;
import com.tsf.shell.f.f.TransitionRenderer;
import com.tsf.shell.f.i.b.e.DrawerShortcutItemBase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class A extends c<d> {
    private ArrayList<b> a = new ArrayList<>();

    public A() {
        ArrayList<LauncherAppInfo> arrayList = new ArrayList<>();
        arrayList.add(new com.tsf.shell.f._d.b.a.c(0, false));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(50, -13421773, false));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(10, -49152, false));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(45, -16749095, true));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(40, -16742990, true));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(30, -8015360, true));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(20, -16640, true));
        arrayList.add(new com.tsf.shell.f._d.b.a.f(60, -1118482, true));
        arrayList.add(new e(250, -13421773, true));
        arrayList.add(new e(VEasing.Back.easeIn, -49152, true));
        arrayList.add(new e(45, -16749095, true));
        arrayList.add(new e(230, -16742990, true));
        arrayList.add(new e(220, -8015360, true));
        arrayList.add(new e(20, -16640, true));
        arrayList.add(new e(260, -1118482, true));
        a(arrayList);
    }

    public void a() {
    }

    public void a(b bVar) {
        if (!this.a.contains(bVar)) {
            this.a.add(bVar);
        }
    }

    public void b(b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            h().a();
        }
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(d dVar) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f(0.0f);
        }
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.ConfigManager.f(str);
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public boolean b() {
        return false;
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public String c() {
        return com.tsf.shell.manager.b.ConfigManager.D();
    }

    public void d() {
        h().b();
    }

    public void e() {
        h().c();
    }
}
