package com.censivn.C3DEngine.b.g.b;

import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.b.g.a.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b implements a {
    private c a;
    private VValueTweenTarget b;

    public VValueTweenTarget a() {
        return this.b;
    }

    public void a(VValueTweenTarget vValueTweenTarget) {
        this.b = vValueTweenTarget;
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public c getTweenChild() {
        return this.a;
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public void setTweenChild(c cVar) {
        this.a = cVar;
    }
}
