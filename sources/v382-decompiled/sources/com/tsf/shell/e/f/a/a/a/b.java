package com.tsf.shell.e.f.a.a.a;

import com.tsf.shell.e.f.a.a.e;
import com.tsf.shell.e.f.a.a.f;
import com.tsf.shell.e.i.b.e.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends c {
    private com.tsf.shell.e.f.a.a.b.c a;

    public b(f fVar) {
        super(fVar);
        this.a = new com.tsf.shell.e.f.a.a.b.c(this);
        a((com.tsf.shell.e.f.a.a.b.b) this.a);
    }

    public void a(e eVar) {
        this.a.a(eVar.a());
        ArrayList b = eVar.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.f.a.a.c cVar = (com.tsf.shell.e.f.a.a.c) it.next();
            if (cVar instanceof i) {
                i iVar = (i) cVar;
                iVar.g(1.0f);
                iVar.visible(true);
                iVar.scale().setAll(1.0f, 1.0f, 1.0f);
                iVar.rotation().setAll(0.0f, 0.0f, 0.0f);
                iVar.position().z = 0.0f;
                iVar.alpha(255.0f);
                arrayList.add(iVar);
            }
        }
        j();
        a(arrayList);
    }

    public String g() {
        return this.a.e();
    }

    @Override // com.tsf.shell.e.f.a.a.a.c
    public void f() {
        this.a.a();
        super.f();
    }
}
