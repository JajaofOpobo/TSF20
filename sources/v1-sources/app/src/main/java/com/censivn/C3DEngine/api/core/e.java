package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.b.z;
import com.tsf.shell.workspace3D.k.j;

/* loaded from: classes.dex */
final class e extends j {
    final /* synthetic */ VWidgetContainer a;

    e(VWidgetContainer vWidgetContainer) {
        this.a = vWidgetContainer;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a(float f, float f2) {
        VWidgetContainer vWidgetContainer;
        super.a(f, f2);
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onChangeSceneSize(f, f2);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a_() {
        VWidgetContainer vWidgetContainer;
        super.a_();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDragStart();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void b_() {
        VWidgetContainer vWidgetContainer;
        super.b_();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDragEnd();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void c_() {
        VWidgetContainer vWidgetContainer;
        super.c_();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onChoicePageStart();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void d_() {
        VWidgetContainer vWidgetContainer;
        super.d_();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onChoicePageEnd();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void e_() {
        VWidgetContainer vWidgetContainer;
        super.e_();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onRemoveStart();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void n() {
        VWidgetContainer vWidgetContainer;
        VTextureManager vTextureManager;
        VObjectManager vObjectManager;
        super.n();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDestroy();
        vTextureManager = this.a.mVTextureManager;
        vTextureManager.destroy();
        vObjectManager = this.a.mVObjectManager;
        vObjectManager.destroy();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void o() {
        VWidgetContainer vWidgetContainer;
        super.o();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDragRelease();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void p() {
        VWidgetContainer vWidgetContainer;
        super.p();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onPause();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void q() {
        VWidgetContainer vWidgetContainer;
        super.q();
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onResume();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void k_() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onFocus();
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.censivn.C3DEngine.b.r
    public final void l_() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onKillFocus();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        VWidgetContainer vWidgetContainer;
        float f;
        float f2;
        z = this.a.needLockView;
        if (z) {
            this.a.isLockdView = true;
            z d = com.censivn.C3DEngine.a.d();
            float f3 = L().x;
            f = this.a.mLockViewOffsetX;
            float f4 = f3 + f;
            float f5 = L().y;
            f2 = this.a.mLockViewOffsetY;
            d.a(f4, f5 + f2);
        }
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDrawStart();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        boolean z;
        VWidgetContainer vWidgetContainer;
        z = this.a.isLockdView;
        if (z) {
            this.a.isLockdView = false;
            com.censivn.C3DEngine.a.d().b();
        }
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.onDrawEnd();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void e() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.draw();
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void f() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.dispatchDraw();
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.censivn.C3DEngine.b.r
    public final void g() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.drawMVPMatrix();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void h() {
        VWidgetContainer vWidgetContainer;
        vWidgetContainer = this.a.mThis;
        vWidgetContainer.drawElement();
    }
}
