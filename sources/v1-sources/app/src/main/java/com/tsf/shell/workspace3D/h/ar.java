package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class ar extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ aq a;

    ar(aq aqVar) {
        this.a = aqVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.a.a.c.l) {
                a aVar = (a) this.a.a.c.i.get(i2);
                if (aVar != this.a.a.c.k) {
                    aVar.aS().b((int) (255.0f - (255.0f * f)));
                }
                aVar.g(aVar.aL() * (1.0f - f));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.a.a.v = true;
        this.a.a.y = false;
        ao.n(this.a.a);
    }
}
