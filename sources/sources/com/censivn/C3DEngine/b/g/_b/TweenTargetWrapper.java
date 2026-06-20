package com.censivn.C3DEngine.b.g._b;

import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.b.g.a.AbstractTween;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TweenTargetWrapper implements ITweenTarget {
    private c a;
    private VValueTweenTarget b;

    public VValueTweenTarget a() {
        return this.b;
    }

    public void a(VValueTweenTarget vValueTweenTarget) {
        this.b = vValueTweenTarget;
    }

    @Override // com.censivn.C3DEngine.b.g._b.ITweenTarget
    public c getTweenChild() {
        return this.a;
    }

    @Override // com.censivn.C3DEngine.b.g._b.ITweenTarget
    public void setTweenChild(c cVar) {
        this.a = cVar;
    }
}
