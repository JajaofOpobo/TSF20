package com.tsf.shell.e.d.c;

import com.tsf.shell.e.d.c.a.b;
import com.tsf.shell.e.d.c.a.d;
import com.tsf.shell.e.d.c.a.e;
import com.tsf.shell.e.f.c;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends c {
    private com.tsf.shell.e.e.f.a a;

    public a() {
        ArrayList arrayList = new ArrayList();
        this.a = new com.tsf.shell.e.e.f.a();
        arrayList.add(new e(0, true, false));
        arrayList.add(new e(1, false, false));
        arrayList.add(new com.tsf.shell.e.d.c.a.a(10, true, true));
        arrayList.add(new com.tsf.shell.e.d.c.a.a(11, false, true));
        arrayList.add(new b(20, true, true));
        arrayList.add(new b(21, false, true));
        a(arrayList);
    }

    public void a() {
    }

    public com.tsf.shell.e.e.f.a d() {
        return this.a;
    }

    public boolean e() {
        if (this.a == null) {
            return false;
        }
        return this.a.a();
    }

    @Override // com.tsf.shell.e.f.c
    public void a(d dVar) {
    }

    @Override // com.tsf.shell.e.f.c
    public void a(boolean z, String str) {
        g.h(z);
        g.e(str);
    }

    @Override // com.tsf.shell.e.f.c
    public boolean b() {
        return g.B();
    }

    @Override // com.tsf.shell.e.f.c
    public String c() {
        return g.C();
    }
}
