package com.censivn.C3DEngine.p031b.p041g.p043b;

import com.censivn.C3DEngine.api.tween.TweenTarget.VValueTweenTarget;
import com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c;
/* renamed from: com.censivn.C3DEngine.b.g.b.b */
/* loaded from: classes.dex */
public class C1013b implements InterfaceC1012a {

    /* renamed from: a */
    private AbstractC1009c f3008a;

    /* renamed from: b */
    private VValueTweenTarget f3009b;

    /* renamed from: a */
    public VValueTweenTarget m10330a() {
        return this.f3009b;
    }

    /* renamed from: a */
    public void m10329a(VValueTweenTarget vValueTweenTarget) {
        this.f3009b = vValueTweenTarget;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a
    public AbstractC1009c getTweenChild() {
        return this.f3008a;
    }

    @Override // com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a
    public void setTweenChild(AbstractC1009c abstractC1009c) {
        this.f3008a = abstractC1009c;
    }
}
