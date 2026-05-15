package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l extends com.tsf.shell.f.f.c<k> {
    public l() {
        ArrayList<com.tsf.shell.f.f.f> arrayList = new ArrayList<>();
        arrayList.add(new c(10, false));
        arrayList.add(new b(20, false));
        arrayList.add(new j(30, false));
        arrayList.add(new d(40, true));
        arrayList.add(new e(50, true));
        arrayList.add(new a(60, true));
        arrayList.add(new f(70, true));
        arrayList.add(new h(80, true));
        arrayList.add(new i(90, true));
        arrayList.add(new g(100, true));
        a(arrayList);
    }

    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5 = i();
        for (int i6 = 0; i6 < i5; i6++) {
            a(i6).a(i, i2, i3, i4, arrayList);
        }
    }

    @Override // com.tsf.shell.f.f.c
    public void f() {
        super.f();
    }

    @Override // com.tsf.shell.f.f.c
    public void a(k kVar) {
    }

    @Override // com.tsf.shell.f.f.c
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.e.j(z);
        com.tsf.shell.manager.b.e.h(str);
    }

    @Override // com.tsf.shell.f.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.e.G();
    }

    @Override // com.tsf.shell.f.f.c
    public String c() {
        return com.tsf.shell.manager.b.e.H();
    }
}
