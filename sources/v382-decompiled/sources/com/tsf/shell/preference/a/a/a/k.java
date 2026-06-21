package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.o;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k extends j {
    private ArrayList a;
    private com.censivn.C3DEngine.b.b.c b;

    public k(String str, float f) {
        super(str, f);
        this.a = new ArrayList();
        e().removeFromParent();
        this.b = new com.censivn.C3DEngine.b.b.c();
        this.b.setLayoutParams(new com.censivn.C3DEngine.b.b.b());
        this.b.mouseEnabled(false);
        addChild(this.b);
    }

    public void a(String str) {
        o oVar = new o();
        oVar.a(str);
        oVar.b(1);
        oVar.d(38);
        oVar.a(true);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(0.0f);
        bVar.b = com.censivn.C3DEngine.b.b.a.a(15.0f);
        oVar.setLayoutParams(bVar);
        oVar.d(38);
        oVar.position().x = (-a()) / 2.0f;
        this.b.addChild(oVar);
        this.a.add(oVar);
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            oVar.position().x = (-i) / 2.0f;
            oVar.f(i);
            a(oVar);
        }
        this.b.d();
        com.censivn.C3DEngine.b.b.b layoutParams = this.b.getLayoutParams();
        layoutParams.h = this.b.minX();
        layoutParams.j = this.b.maxX();
        layoutParams.i = this.b.minY();
        layoutParams.k = this.b.maxY();
        super.c(i);
    }

    private void a(o oVar) {
        oVar.b();
        com.censivn.C3DEngine.b.b.b layoutParams = oVar.getLayoutParams();
        layoutParams.h = oVar.minX();
        layoutParams.j = oVar.maxX();
        layoutParams.i = oVar.minY();
        layoutParams.k = oVar.maxY();
    }

    @Override // com.tsf.shell.preference.a.a.a.j, com.censivn.C3DEngine.b.e.i
    public void g() {
        super.g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a();
        }
    }
}
