package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
final class t implements Runnable {
    private final /* synthetic */ com.censivn.C3DEngine.g.a.c a;

    t(com.censivn.C3DEngine.g.a.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a instanceof com.censivn.C3DEngine.g.a.b) {
            ((com.censivn.C3DEngine.g.a.b) this.a).b();
        } else if (this.a instanceof com.censivn.C3DEngine.g.a.a) {
            ((com.censivn.C3DEngine.g.a.a) this.a).b();
        }
        s.a(this.a);
    }
}
