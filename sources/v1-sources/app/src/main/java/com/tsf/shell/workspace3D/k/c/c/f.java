package com.tsf.shell.workspace3D.k.c.c;

/* loaded from: classes.dex */
final class f extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(a aVar) {
        super(150.0f, 150.0f);
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        z = this.a.e;
        if (!z) {
            M().z += 25.0f;
        }
    }
}
