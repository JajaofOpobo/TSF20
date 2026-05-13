package com.censivn.C3DEngine.api.tween.TweenTarget;

import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
/* loaded from: classes.dex */
public class VValueTweenTarget implements VTweenTarget {
    private C1013b vTarget = new C1013b();

    public VValueTweenTarget() {
        this.vTarget.m10329a(this);
    }

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }
}
