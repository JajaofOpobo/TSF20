package com.censivn.C3DEngine.api.primitives;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.b.r;

/* loaded from: classes.dex */
final class b extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ VRectangle a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(VRectangle vRectangle, float f, float f2, int i, int i2, boolean z, boolean z2) {
        super(f, f2, i, i2, z, z2);
        this.a = vRectangle;
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
