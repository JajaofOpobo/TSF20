package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ l a;
    private final /* synthetic */ float b;
    private final /* synthetic */ float c;
    private final /* synthetic */ float d;
    private final /* synthetic */ float e;

    p(l lVar, float f, float f2, float f3, float f4) {
        this.a = lVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean z;
        Runnable runnable;
        Runnable runnable2;
        com.tsf.shell.workspace3D.d dVar;
        com.tsf.shell.workspace3D.d dVar2;
        com.tsf.shell.workspace3D.d dVar3;
        com.tsf.shell.workspace3D.d dVar4;
        i = this.a.r;
        if (i != 4) {
            i2 = this.a.r;
            if (i2 != 2) {
                com.tsf.shell.workspace3D.bf.q().b(this.b / com.censivn.C3DEngine.a.j);
                com.tsf.shell.workspace3D.h.c.a aVar = this.a.F;
                int i3 = this.a.l;
                float f = this.b;
                float f2 = this.c;
                float f3 = this.d;
                float f4 = this.e;
                z = this.a.L;
                a aVar2 = (a) this.a.i.get(aVar.a(i3, f, z));
                if (aVar2 != this.a.k) {
                    if (com.tsf.shell.a.t.p()) {
                        dVar = this.a.E;
                        if (!dVar.d()) {
                            dVar3 = this.a.E;
                            dVar3.b().L().y = com.censivn.C3DEngine.a.g - (38.0f * com.censivn.C3DEngine.a.a);
                            com.censivn.C3DEngine.b.v vVar = this.a.f;
                            dVar4 = this.a.E;
                            vVar.d(dVar4.b());
                        }
                        dVar2 = this.a.E;
                        dVar2.e();
                    }
                    this.a.c(aVar2);
                    this.a.P();
                    l lVar = this.a;
                    runnable = this.a.z;
                    lVar.J = runnable;
                    com.censivn.C3DEngine.b.w a = com.censivn.C3DEngine.a.a();
                    runnable2 = this.a.J;
                    a.b(runnable2, 1400L);
                }
            }
        }
    }
}
