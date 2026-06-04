package com.tsf.shell.workspace3D.h.a;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class aj extends com.tsf.shell.workspace3D.k.o {
    final /* synthetic */ x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(x xVar, com.censivn.C3DEngine.b.v vVar) {
        super(vVar, 2);
        this.a = xVar;
    }

    @Override // com.tsf.shell.workspace3D.k.o
    public final void a() {
        ArrayList arrayList;
        if (!this.c) {
            a(this);
            this.c = true;
            com.tsf.shell.aq.a(this);
            arrayList = this.a.ak;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tsf.shell.workspace3D.k.ah) it.next()).bx();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.k.o
    public final void b() {
        ArrayList arrayList;
        if (this.c) {
            b(this);
            com.tsf.shell.aq.b(this);
            arrayList = this.a.ak;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tsf.shell.workspace3D.k.ah) it.next()).by();
            }
            this.c = false;
            this.b.clear();
        }
    }
}
