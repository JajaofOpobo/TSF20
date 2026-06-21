package com.tsf.shell.e.e.e;

import com.tsf.shell.utils.w;

/* loaded from: classes.dex */
class b extends i {
    public int a;
    final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, float f, float f2, int i) {
        super(f, f2, false);
        this.d = aVar;
        this.a = i;
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void a(com.tsf.shell.e.e.g gVar) {
        c cVar;
        c cVar2;
        c cVar3;
        w.a();
        cVar = this.d.c;
        cVar.b = gVar;
        cVar2 = this.d.c;
        cVar2.c = this.a;
        com.censivn.C3DEngine.b.c.e a = com.censivn.C3DEngine.a.a();
        cVar3 = this.d.c;
        a.b(cVar3, 400L);
        this.d.d();
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public boolean b(com.tsf.shell.e.e.g gVar) {
        return false;
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void e(com.tsf.shell.e.e.g gVar) {
        c cVar;
        c cVar2;
        com.censivn.C3DEngine.b.c.e a = com.censivn.C3DEngine.a.a();
        cVar = this.d.c;
        a.g(cVar);
        cVar2 = this.d.c;
        cVar2.b = null;
        this.d.e();
    }

    @Override // com.tsf.shell.e.e.e.i, com.tsf.shell.e.e.g
    public void d(com.tsf.shell.e.e.g gVar) {
        c cVar;
        c cVar2;
        com.censivn.C3DEngine.b.c.e a = com.censivn.C3DEngine.a.a();
        cVar = this.d.c;
        a.g(cVar);
        cVar2 = this.d.c;
        cVar2.b = null;
        this.d.e();
    }
}
