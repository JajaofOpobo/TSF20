package com.tsf.shell.e.f.a.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends com.tsf.shell.e.f.c {
    public m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(10, false));
        arrayList.add(new b(20, false));
        arrayList.add(new k(30, false));
        arrayList.add(new d(40, true));
        arrayList.add(new e(50, true));
        arrayList.add(new a(60, true));
        arrayList.add(new f(70, true));
        arrayList.add(new h(80, true));
        arrayList.add(new j(90, true));
        arrayList.add(new g(100, true));
        a(arrayList);
    }

    public void a(int i, int i2, int i3, int i4, ArrayList arrayList) {
        int i5 = i();
        for (int i6 = 0; i6 < i5; i6++) {
            ((l) a(i6)).a(i, i2, i3, i4, arrayList);
        }
    }

    @Override // com.tsf.shell.e.f.c
    public void f() {
        super.f();
    }

    @Override // com.tsf.shell.e.f.c
    public void a(l lVar) {
    }

    @Override // com.tsf.shell.e.f.c
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.g.j(z);
        com.tsf.shell.manager.b.g.h(str);
    }

    @Override // com.tsf.shell.e.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.g.G();
    }

    @Override // com.tsf.shell.e.f.c
    public String c() {
        return com.tsf.shell.manager.b.g.H();
    }
}
