package com.tsf.shell.e.d.b;

import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.e.d.b.a.d;
import com.tsf.shell.e.d.b.a.e;
import com.tsf.shell.e.d.b.a.f;
import com.tsf.shell.e.d.b.a.g;
import com.tsf.shell.e.f.c;
import com.tsf.shell.e.i.b.e.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends c {
    private ArrayList a = new ArrayList();

    public a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(0, false));
        arrayList.add(new g(50, -13421773, false));
        arrayList.add(new g(10, -49152, false));
        arrayList.add(new g(45, -16749095, true));
        arrayList.add(new g(40, -16742990, true));
        arrayList.add(new g(30, -8015360, true));
        arrayList.add(new g(20, -16640, true));
        arrayList.add(new g(60, -1118482, true));
        arrayList.add(new f(250, -13421773, true));
        arrayList.add(new f(VEasing.Back.easeIn, -49152, true));
        arrayList.add(new f(45, -16749095, true));
        arrayList.add(new f(230, -16742990, true));
        arrayList.add(new f(220, -8015360, true));
        arrayList.add(new f(20, -16640, true));
        arrayList.add(new f(260, -1118482, true));
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
            ((e) h()).a();
        }
    }

    @Override // com.tsf.shell.e.f.c
    public void a(e eVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f(0.0f);
        }
    }

    @Override // com.tsf.shell.e.f.c
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.g.f(str);
    }

    @Override // com.tsf.shell.e.f.c
    public boolean b() {
        return false;
    }

    @Override // com.tsf.shell.e.f.c
    public String c() {
        return com.tsf.shell.manager.b.g.D();
    }

    public void d() {
        ((e) h()).b();
    }

    public void e() {
        ((e) h()).c();
    }
}
