package com.tsf.shell.manager.m;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.e.g;
import com.tsf.shell.manager.r.c.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.b.a.c {
    private com.tsf.shell.e.i.b.e.b a;
    private com.censivn.C3DEngine.b.b.a.e b;
    private float d;
    private c e;
    private b f;
    private int c = 0;
    private boolean g = true;

    public a(c cVar) {
        this.e = cVar;
        e();
    }

    @Override // com.tsf.shell.e.e.f.e
    public j d() {
        return this.e.k();
    }

    @Override // com.tsf.shell.e.e.f.e
    public void a(final com.tsf.shell.e.i.e eVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.m.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.removeChild(eVar);
                a.this.e.o();
            }
        };
        if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            i.a(eVar, null, runnable);
        } else {
            i.a(eVar, runnable);
        }
    }

    public void a(com.censivn.C3DEngine.b.b.a.e eVar) {
        this.b = eVar;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        super.onDrawStart();
        if (this.c == 1) {
            this.b.a(this.d);
        } else if (this.c == 2) {
            this.b.b(this.d);
        }
    }

    public int c(float f) {
        float b = b();
        float c = c();
        int i = (int) (((f - b) + (c / 2.0f)) / (c + com.tsf.shell.manager.o.b.a.U));
        if (i < 0) {
            i = 0;
        }
        return i > numChildren() + (-1) ? numChildren() - 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(g gVar) {
        j jVar = (j) gVar;
        x xVar = new x();
        xVar.l(1.0f);
        xVar.m(1.0f);
        w.a(jVar);
        w.a(jVar, 300, xVar);
        this.f.a(jVar);
    }

    public void e() {
        this.d = com.censivn.C3DEngine.b.b.a.a(15.0f);
        this.a = new com.tsf.shell.e.i.b.e.j();
        ArrayList arrayList = new ArrayList();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(4);
        a(arrayList, arrayList2);
        b bVar = new b(this, this);
        this.f = bVar;
        setMouseEventListener(bVar);
    }
}
