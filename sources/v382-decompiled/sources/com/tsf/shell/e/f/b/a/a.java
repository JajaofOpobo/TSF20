package com.tsf.shell.e.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends d {
    private boolean b;
    private boolean c;

    public a(int i, boolean z, boolean z2, boolean z3) {
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
        float a = com.censivn.C3DEngine.b.b.a.a(300.0f);
        int i = 0;
        while (i < arrayList.size()) {
            j jVar = (j) arrayList.get(i);
            Number3d number3d = (Number3d) m.E.get(i);
            w.a(jVar);
            if (jVar instanceof com.tsf.shell.e.i.c) {
                x xVar3 = new x();
                if (z) {
                    xVar3.f(0.0f);
                    xVar3.h(number3d.y + a);
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
                    jVar.position().y = 0.0f + a;
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
        float a = com.censivn.C3DEngine.b.b.a.a(0.0f);
        x xVar = null;
        int i = 0;
        while (i < aVar.a()) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            x xVar2 = new x();
            xVar2.h(((Number3d) com.tsf.shell.e.d.e.a.a.get(i)).y + a);
            xVar2.f(0.0f);
            if (this.c) {
                xVar2.d(a(50));
                xVar2.e(a(180));
                xVar2.c(a(50));
            }
            w.a(a2);
            w.a(a2, 700, xVar2);
            i++;
            xVar = xVar2;
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
