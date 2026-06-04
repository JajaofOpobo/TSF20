package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class ai implements Runnable {
    final /* synthetic */ p a;

    ai(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        boolean z;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        com.censivn.C3DEngine.e.b bVar4;
        com.censivn.C3DEngine.e.b bVar5;
        com.censivn.C3DEngine.g.u uVar;
        com.censivn.C3DEngine.e.b bVar6;
        com.censivn.C3DEngine.e.b bVar7;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.e.b bVar8;
        bVar = this.a.V;
        if (bVar.P() == null) {
            vVar = this.a.w;
            bVar8 = this.a.V;
            vVar.a(bVar8, 0);
        }
        z = this.a.an;
        if (!z) {
            bVar6 = this.a.V;
            bVar6.M().z = 90.0f;
            bVar7 = this.a.V;
            bVar7.a_(com.censivn.C3DEngine.a.m * 2);
        } else {
            bVar2 = this.a.V;
            bVar2.M().z = 0.0f;
            bVar3 = this.a.V;
            bVar3.a_(com.censivn.C3DEngine.a.l * 2);
        }
        bVar4 = this.a.V;
        com.censivn.C3DEngine.g.s.a(bVar4);
        bVar5 = this.a.V;
        uVar = this.a.S;
        com.censivn.C3DEngine.g.s.a(bVar5, 400, uVar);
    }
}
