package com.censivn.C3DEngine.api.tween.TweenTarget;

import com.censivn.C3DEngine.b.g.b.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VValueTweenTarget implements VTweenTarget {
    private b vTarget = new b();

    public VValueTweenTarget() {
        this.vTarget.a(this);
    }

    @Override // com.censivn.C3DEngine.api.tween.TweenTarget.VTweenTarget
    public Object getVirtualTarget() {
        return this.vTarget;
    }
}
