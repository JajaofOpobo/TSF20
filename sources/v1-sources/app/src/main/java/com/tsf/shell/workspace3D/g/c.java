package com.tsf.shell.workspace3D.g;

/* loaded from: classes.dex */
final class c extends com.censivn.C3DEngine.e.b {
    private final /* synthetic */ com.censivn.C3DEngine.e.b C;
    private final /* synthetic */ com.censivn.C3DEngine.e.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(float f, com.censivn.C3DEngine.e.b bVar, com.censivn.C3DEngine.e.b bVar2) {
        super(f, 16.0f, (byte) 0);
        this.a = bVar;
        this.C = bVar2;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        com.tsf.shell.workspace3D.k.j jVar;
        float f = com.censivn.C3DEngine.a.l / 2;
        jVar = a.j;
        float f2 = jVar.L().x;
        this.a.L().x += 5.0f;
        this.C.L().x -= 5.0f;
        if (this.a.L().x > f) {
            this.a.L().x = f2;
        }
        if (this.C.L().x < (-f)) {
            this.C.L().x = f2;
        }
    }
}
