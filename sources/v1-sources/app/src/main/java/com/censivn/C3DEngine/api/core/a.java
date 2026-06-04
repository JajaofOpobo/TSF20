package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class a extends v {
    final /* synthetic */ VObject3dContainer a;

    a(VObject3dContainer vObject3dContainer) {
        this.a = vObject3dContainer;
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

    @Override // com.censivn.C3DEngine.b.r
    public final void e() {
        this.a.mThis.draw();
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void f() {
        this.a.mThis.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void g() {
        this.a.mThis.drawMVPMatrix();
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void a(r rVar) {
        ((VObject3dContainer) this.a.mThis).onDrawChildStart(rVar.r());
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void b(r rVar) {
        ((VObject3dContainer) this.a.mThis).onDrawChildEnd(rVar.r());
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void h() {
        this.a.mThis.drawElement();
    }
}
