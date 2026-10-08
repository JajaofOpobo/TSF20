package com.censivn.C3DEngine.g;

/* loaded from: classes.dex */
final class t implements Runnable {
    private final /* synthetic */ com.censivn.C3DEngine.g.a_inner.c a;

    t(com.censivn.C3DEngine.g.a_inner.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a instanceof com.censivn.C3DEngine.g.a_inner.b) {
            ((com.censivn.C3DEngine.g.a_inner.b) this.a).b();
        } else if (this.a instanceof com.censivn.C3DEngine.g.a_inner.a) {
            ((com.censivn.C3DEngine.g.a_inner.a) this.a).b();
        }
        s.a(this.a);
    }
}
