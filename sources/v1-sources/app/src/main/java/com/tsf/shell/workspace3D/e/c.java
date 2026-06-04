package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class c extends com.censivn.C3DEngine.e.b {
    private final /* synthetic */ com.censivn.C3DEngine.e.b C;
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, float f, float f2, com.censivn.C3DEngine.e.b bVar2) {
        super(f, f2, (byte) 0);
        this.a = bVar;
        this.C = bVar2;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        z().d();
        z().c(this.C.z().a(0).textureElement);
    }
}
