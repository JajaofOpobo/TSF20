package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.message.RenderRunnable;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class j extends RenderRunnable {
    final /* synthetic */ e a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.c.b.c b;
    private final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e eVar, com.tsf.shell.workspace3D.k.c.b.c cVar, ArrayList arrayList) {
        super(2, 1);
        this.a = eVar;
        this.b = cVar;
        this.c = arrayList;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.b.a(this.c);
    }
}
