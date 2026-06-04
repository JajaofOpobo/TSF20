package com.censivn.C3DEngine.api.primitives;

/* loaded from: classes.dex */
final class a extends com.censivn.C3DEngine.e.a {
    final /* synthetic */ VBox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(VBox vBox, float f, float f2, float f3) {
        super(f, f2, f3);
        this.a = vBox;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void k_() {
        this.a.mThis.onFocus();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        this.a.mThis.onKillFocus();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        this.a.mThis.onDrawStart();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        this.a.mThis.onDrawEnd();
    }
}
