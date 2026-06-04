package com.censivn.C3DEngine.api.tween;

import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class a extends u {
    final /* synthetic */ VTweenParam a;

    a(VTweenParam vTweenParam) {
        this.a = vTweenParam;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        VTweenParam vTweenParam;
        vTweenParam = this.a.mThis;
        vTweenParam.onComplete();
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        VTweenParam vTweenParam;
        vTweenParam = this.a.mThis;
        vTweenParam.onUpdate(f);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void b(float f) {
        VTweenParam vTweenParam;
        vTweenParam = this.a.mThis;
        vTweenParam.onProgress(f);
    }
}
