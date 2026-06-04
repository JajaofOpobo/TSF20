package com.tsf.shell.workspace3D.k.c.b;

import com.tsf.shell.theme.inside.widget.SystemFolderTheme;

/* loaded from: classes.dex */
final class z extends com.tsf.shell.workspace3D.k.o {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(c cVar, com.censivn.C3DEngine.b.v vVar) {
        super(vVar, 3);
        this.a = cVar;
    }

    @Override // com.tsf.shell.workspace3D.k.o
    public final void a(com.tsf.shell.workspace3D.k.j jVar) {
        super.a(jVar);
        if (jVar.A() && jVar.I() != 0.0f) {
            this.a.B();
        }
    }

    @Override // com.tsf.shell.workspace3D.k.o
    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        int i;
        c cVar;
        c cVar2;
        super.b(jVar);
        i = this.a.A;
        if (i == c.a) {
            this.a.a((com.tsf.shell.workspace3D.k.ab) jVar);
            return;
        }
        int g = this.a.h.g(jVar);
        this.a.c((com.tsf.shell.workspace3D.k.ab) jVar);
        if (g < c.d.R) {
            int s = this.a.s() > c.d.R ? c.d.R : this.a.s();
            for (int i2 = 0; i2 < s; i2++) {
                com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.a.h.aD().get((this.a.s() - i2) - 1);
                SystemFolderTheme.SystemFolderChild systemFolderChild = (SystemFolderTheme.SystemFolderChild) c.d.S.get(i2);
                c cVar3 = this.a;
                c.b(abVar, systemFolderChild);
                abVar.a((Boolean) true);
                abVar.b(255.0f);
            }
            af afVar = c.e;
            cVar = this.a.z;
            afVar.a(cVar);
            af afVar2 = c.e;
            cVar2 = this.a.z;
            af.c(cVar2);
        }
    }
}
