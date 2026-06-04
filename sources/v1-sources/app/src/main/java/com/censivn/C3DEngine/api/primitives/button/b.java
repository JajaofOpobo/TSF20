package com.censivn.C3DEngine.api.primitives.button;

/* loaded from: classes.dex */
final class b extends com.censivn.C3DEngine.e.a.a {
    final /* synthetic */ VButton a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(VButton vButton, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.a = vButton;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void k_() {
        this.a.mThis.onFocus();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        this.a.mThis.onKillFocus();
    }

    @Override // com.censivn.C3DEngine.e.a.a, com.censivn.C3DEngine.b.r
    public final void c() {
        this.a.mThis.onDrawStart();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        this.a.mThis.onDrawEnd();
    }
}
