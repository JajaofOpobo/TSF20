package com.tsf.shell.e.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.m;
import com.tsf.shell.e.f.g;
import com.tsf.shell.e.f.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends k implements com.tsf.shell.e.d.e.b {
    private com.tsf.shell.e.d.e.a b;

    public d(int i, boolean z) {
        super(i, 0, z);
    }

    protected float a(int i) {
        return (float) (i - ((i * 2) * Math.random()));
    }

    @Override // com.tsf.shell.e.f.p
    public void a(g gVar, float f) {
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a(g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        return false;
    }

    @Override // com.tsf.shell.e.f.p
    public void a(g gVar, boolean z) {
        if (gVar.t() == -1) {
            final m mVar = (m) gVar;
            mVar.aB();
            if (z) {
                mVar.c((Runnable) null, false);
                b(mVar.ap().children(), false, null);
            }
            mVar.b((Runnable) null, z);
            a(mVar.ap().children(), z, new Runnable() { // from class: com.tsf.shell.e.f.b.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    mVar.aO();
                }
            });
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void b(g gVar, boolean z) {
        if (gVar.t() == -1) {
            m mVar = (m) gVar;
            mVar.c((Runnable) null, true);
            b(mVar.ap().children(), z, null);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void b(g gVar, float f) {
        if (gVar.t() == -1) {
            gVar.dispatchDraw();
            return;
        }
        com.tsf.shell.e.f.m j = gVar.j();
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(400.0f) * f;
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.dispatchDraw();
    }

    public static void a(ArrayList arrayList, boolean z, boolean z2, Runnable runnable) {
        j jVar = arrayList.size() > 0 ? (j) arrayList.get((int) (Math.random() * arrayList.size())) : null;
        x xVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            j jVar2 = (j) arrayList.get(i);
            w.a(jVar2);
            if (jVar2 instanceof com.tsf.shell.e.i.c) {
                Number3d number3d = (Number3d) m.E.get(i);
                if (z) {
                    x xVar2 = new x();
                    if (z2) {
                        if (jVar2 == jVar) {
                            xVar2.b(350);
                            xVar = xVar2;
                        } else {
                            xVar2.b((int) (Math.random() * 300.0d));
                        }
                    }
                    xVar2.f(number3d.x);
                    xVar2.h(number3d.y);
                    xVar2.e(0.0f);
                    xVar2.l(1.0f);
                    xVar2.m(1.0f);
                    xVar2.c(0.0f);
                    xVar2.d(0.0f);
                    xVar2.a(255);
                    xVar2.a(com.censivn.C3DEngine.b.g.a.a);
                    w.a(jVar2, 450, xVar2);
                    if (!com.tsf.shell.manager.a.v.d.b().b()) {
                        xVar = xVar2;
                    }
                } else {
                    jVar2.position().x = number3d.x;
                    jVar2.position().y = number3d.y;
                    jVar2.rotation().x = 0.0f;
                    jVar2.rotation().y = 0.0f;
                    jVar2.rotation().z = 0.0f;
                    jVar2.scale().x = 1.0f;
                    jVar2.scale().y = 1.0f;
                    jVar2.alpha(255.0f);
                }
            }
        }
        if (xVar != null) {
            xVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(ArrayList arrayList, boolean z, Runnable runnable) {
    }

    public void b(ArrayList arrayList, boolean z, Runnable runnable) {
    }

    public j o() {
        if (this.b == null) {
            this.b = new com.tsf.shell.e.d.e.a(this) { // from class: com.tsf.shell.e.f.b.a.d.2
                @Override // com.tsf.shell.e.g.a.h, com.censivn.C3DEngine.b.f.l
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    com.tsf.shell.manager.i.a.a(d.this, com.censivn.C3DEngine.b.b.a.a(20.0f));
                }
            };
        }
        return this.b;
    }

    public boolean p() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[SYNTHETIC] */
    @Override // com.tsf.shell.e.d.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar;
        x xVar2;
        x xVar3 = null;
        com.censivn.C3DEngine.b.f.a.b a = aVar.a((int) (Math.random() * aVar.a()));
        int i = 0;
        while (true) {
            int i2 = i;
            xVar = xVar3;
            if (i2 >= aVar.a()) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i2);
            xVar3 = new x();
            if (p()) {
                if (a2 == a) {
                    xVar3.b(300);
                    xVar2 = xVar3;
                    Number3d number3d = (Number3d) com.tsf.shell.e.d.e.a.a.get(i2);
                    xVar3.f(number3d.x);
                    xVar3.h(number3d.y);
                    xVar3.l(1.0f);
                    xVar3.m(1.0f);
                    xVar3.d(0.0f);
                    xVar3.e(0.0f);
                    xVar3.c(0.0f);
                    xVar3.a(com.censivn.C3DEngine.b.g.a.a);
                    w.a(a2);
                    w.a(a2, 500, xVar3);
                    if (!p()) {
                        xVar3 = xVar2;
                    }
                    i = i2 + 1;
                } else {
                    xVar3.b((int) (Math.random() * 300.0d));
                }
            }
            xVar2 = xVar;
            Number3d number3d2 = (Number3d) com.tsf.shell.e.d.e.a.a.get(i2);
            xVar3.f(number3d2.x);
            xVar3.h(number3d2.y);
            xVar3.l(1.0f);
            xVar3.m(1.0f);
            xVar3.d(0.0f);
            xVar3.e(0.0f);
            xVar3.c(0.0f);
            xVar3.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(a2);
            w.a(a2, 500, xVar3);
            if (!p()) {
            }
            i = i2 + 1;
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
    }
}
