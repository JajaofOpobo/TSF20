package com.tsf.shell.f.d.c;

import com.tsf.shell.f.d.c.a.b;
import com.tsf.shell.f.d.c.a.d;
import com.tsf.shell.f.d.c.a.e;
import com.tsf.shell.f.f.c;
import com.tsf.shell.f.f.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends c<d> {
    private com.tsf.shell.f.e.f.a a;

    public a() {
        ArrayList<f> arrayList = new ArrayList<>();
        this.a = new com.tsf.shell.f.e.f.a();
        arrayList.add(new e(0, true, false));
        arrayList.add(new e(1, false, false));
        arrayList.add(new com.tsf.shell.f.d.c.a.a(10, true, true));
        arrayList.add(new com.tsf.shell.f.d.c.a.a(11, false, true));
        arrayList.add(new b(20, true, true));
        arrayList.add(new b(21, false, true));
        a(arrayList);
    }

    public void a() {
    }

    public com.tsf.shell.f.e.f.a d() {
        return this.a;
    }

    public boolean e() {
        if (this.a == null) {
            return false;
        }
        return this.a.a();
    }

    @Override // com.tsf.shell.f.f.c
    public void a(d dVar) {
    }

    @Override // com.tsf.shell.f.f.c
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.e.h(z);
        com.tsf.shell.manager.b.e.e(str);
    }

    @Override // com.tsf.shell.f.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.e.B();
    }

    @Override // com.tsf.shell.f.f.c
    public String c() {
        return com.tsf.shell.manager.b.e.C();
    }
}
