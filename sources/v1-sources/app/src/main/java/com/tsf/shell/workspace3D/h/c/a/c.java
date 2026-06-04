package com.tsf.shell.workspace3D.h.c.a;

import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class c extends u {
    final /* synthetic */ a a;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a x;
    private final /* synthetic */ float y;

    c(a aVar, com.tsf.shell.workspace3D.h.a aVar2, float f) {
        this.a = aVar;
        this.x = aVar2;
        this.y = f;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.x.M().y = this.y + ((50.0f - this.y) * f);
    }
}
