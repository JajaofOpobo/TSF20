package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class s extends com.tsf.shell.workspace3D.h.c.a {
    final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(l lVar, l lVar2) {
        super(lVar2);
        this.a = lVar;
    }

    @Override // com.tsf.shell.workspace3D.h.c.a
    public final void a() {
        l lVar;
        com.tsf.shell.workspace3D.bf.s().y();
        lVar = this.a.d;
        com.tsf.shell.aq.a(lVar);
    }

    @Override // com.tsf.shell.workspace3D.h.c.a
    public final void b() {
        Runnable runnable;
        Runnable runnable2;
        this.a.r = 1;
        this.a.g.a_(false);
        runnable = this.a.B;
        if (runnable != null) {
            runnable2 = this.a.B;
            runnable2.run();
            this.a.B = null;
        }
    }

    @Override // com.tsf.shell.workspace3D.h.c.a
    public final void c() {
        l.s(this.a);
    }
}
