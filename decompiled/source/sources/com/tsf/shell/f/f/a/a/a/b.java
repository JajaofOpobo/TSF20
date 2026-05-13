package com.tsf.shell.f.f.a.a.a;

import com.tsf.shell.f.f.a.a.b;
import com.tsf.shell.f.i.b.e.g;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends c {
    private com.tsf.shell.f.f.a.a.b.c a;

    public b(com.tsf.shell.f.f.a.a.c cVar) {
        super(cVar);
        this.a = new com.tsf.shell.f.f.a.a.b.c(this);
        a((com.tsf.shell.f.f.a.a.b.b) this.a);
    }

    public void a(b.c cVar) {
        this.a.a(cVar.a());
        ArrayList<b.a> b = cVar.b();
        ArrayList<g> arrayList = new ArrayList<>();
        Iterator<b.a> it = b.iterator();
        while (it.hasNext()) {
            b.a next = it.next();
            if (next instanceof g) {
                g gVar = (g) next;
                gVar.g(1.0f);
                gVar.visible(true);
                gVar.scale().setAll(1.0f, 1.0f, 1.0f);
                gVar.rotation().setAll(0.0f, 0.0f, 0.0f);
                gVar.position().z = 0.0f;
                gVar.alpha(255.0f);
                arrayList.add(gVar);
            }
        }
        j();
        a(arrayList);
    }

    public String g() {
        return this.a.e();
    }

    @Override // com.tsf.shell.f.f.a.a.a.c
    public void f() {
        this.a.a();
        super.f();
    }
}
