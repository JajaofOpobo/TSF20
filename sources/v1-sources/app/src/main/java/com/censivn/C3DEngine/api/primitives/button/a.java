package com.censivn.C3DEngine.api.primitives.button;

/* loaded from: classes.dex */
final class a extends com.censivn.C3DEngine.e.a.a {
    final /* synthetic */ VButton a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(VButton vButton, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = vButton;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void k_() {
        super.k_();
        this.a.mThis.onFocus();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void l_() {
        super.l_();
        this.a.mThis.onKillFocus();
    }

    @Override // com.censivn.C3DEngine.e.a.a, com.censivn.C3DEngine.b.r
    public final void c() {
        super.c();
        this.a.mThis.onDrawStart();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        super.m_();
        this.a.mThis.onDrawEnd();
    }
}
