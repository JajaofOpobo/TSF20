package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
class d extends com.tsf.shell.e.i.b.e.b {
    public l a;
    final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(null, com.tsf.shell.manager.o.b.a);
        this.b = cVar;
        this.a = new l();
        this.k.visible(true);
        this.k.removeFromParent();
        this.a.addChild(this.k);
        addChild(this.a);
    }

    @Override // com.tsf.shell.e.i.b.e.b
    public void k() {
    }
}
