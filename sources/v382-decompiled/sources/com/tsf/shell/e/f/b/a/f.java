package com.tsf.shell.e.f.b.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends d {
    private boolean b;
    private boolean c;

    public f(int i, boolean z, boolean z2, boolean z3) {
        super(i, z3);
        this.b = z;
        this.c = z2;
    }

    @Override // com.tsf.shell.e.f.b.a.d
    public void a(ArrayList arrayList, boolean z, Runnable runnable) {
        a(arrayList, z, this.b, runnable);
    }

    @Override // com.tsf.shell.e.f.b.a.d
    public void b(ArrayList arrayList, boolean z, Runnable runnable) {
        Iterator it = arrayList.iterator();
        x xVar = null;
        while (it.hasNext()) {
            j jVar = (j) it.next();
            w.a(jVar);
            if (jVar instanceof com.tsf.shell.e.i.c) {
                x xVar2 = new x();
                if (z) {
                    xVar2.f(0.0f);
                    xVar2.h(0.0f);
                    xVar2.l(0.0f);
                    xVar2.m(0.0f);
                    xVar2.a(0);
                    if (this.c) {
                        xVar2.d(a(50));
                        xVar2.e(a(180));
                        xVar2.c(a(50));
                    }
                    w.a(jVar, 600, xVar2);
                    xVar = xVar2;
                } else {
                    jVar.position().x = 0.0f;
                    jVar.position().y = 0.0f;
                    jVar.scale().x = 0.0f;
                    jVar.scale().y = 0.0f;
                    jVar.alpha(0.0f);
                    if (this.c) {
                        jVar.rotation().x = a(50);
                        jVar.rotation().y = a(180);
                        jVar.rotation().z = a(50);
                    }
                }
            }
        }
        if (xVar != null) {
            xVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.e.f.b.a.d, com.tsf.shell.e.d.e.b
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar = null;
        for (int i = 0; i < aVar.a(); i++) {
            com.censivn.C3DEngine.b.f.a.b a = aVar.a(i);
            xVar = new x();
            xVar.h(0.0f);
            xVar.f(0.0f);
            xVar.l(0.0f);
            xVar.m(0.0f);
            if (this.c) {
                xVar.d(a(50));
                xVar.e(a(180));
                xVar.c(a(50));
            }
            w.a(a);
            w.a(a, 700, xVar);
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
