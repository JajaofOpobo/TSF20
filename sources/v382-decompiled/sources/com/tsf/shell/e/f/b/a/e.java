package com.tsf.shell.e.f.b.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends d {
    private boolean b;
    private boolean c;

    public e(int i, boolean z, boolean z2, boolean z3) {
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
        x xVar;
        x xVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            j jVar = (j) arrayList.get(i);
            w.a(jVar);
            if (jVar instanceof com.tsf.shell.e.i.c) {
                x xVar3 = new x();
                if (z) {
                    xVar3.f(0.0f);
                    xVar3.h(com.censivn.C3DEngine.b.b.a.B);
                    xVar3.a(0);
                    if (this.c) {
                        xVar3.d(a(50));
                        xVar3.e(a(180));
                        xVar3.c(a(50));
                    }
                    w.a(jVar, 600, xVar3);
                    xVar = xVar3;
                    i++;
                    xVar2 = xVar;
                } else {
                    jVar.position().x = 0.0f;
                    jVar.position().y = com.censivn.C3DEngine.b.b.a.B;
                    jVar.alpha(0.0f);
                    if (this.c) {
                        jVar.rotation().x = a(50);
                        jVar.rotation().y = a(180);
                        jVar.rotation().z = a(50);
                    }
                }
            }
            xVar = xVar2;
            i++;
            xVar2 = xVar;
        }
        if (xVar2 != null) {
            xVar2.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.e.f.b.a.d, com.tsf.shell.e.d.e.b
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar = null;
        float a = com.censivn.C3DEngine.b.b.a.a(50.0f);
        for (int i = 0; i < aVar.a(); i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            xVar = new x();
            xVar.h(a);
            xVar.f(0.0f);
            if (this.c) {
                xVar.d(a(50));
                xVar.e(a(180));
                xVar.c(a(50));
            }
            w.a(a2);
            w.a(a2, 700, xVar);
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
