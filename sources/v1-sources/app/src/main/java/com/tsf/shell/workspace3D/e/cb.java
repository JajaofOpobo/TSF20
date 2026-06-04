package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
final class cb extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ by a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;
    private final /* synthetic */ Runnable z;

    cb(by byVar, float f, float f2, Runnable runnable) {
        this.a = byVar;
        this.x = f;
        this.y = f2;
        this.z = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.a.h(this.x + ((this.y - this.x) * f));
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.z != null) {
            this.z.run();
        }
    }
}
