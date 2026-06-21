package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* loaded from: classes.dex */
class p extends VTweenParam {
    final /* synthetic */ n a;
    private VRectangle b;
    private com.tsf.shell.widget.alarm.b.e c;
    private com.tsf.shell.widget.alarm.b.f d;
    private boolean e;

    public p(n nVar, VRectangle vRectangle, com.tsf.shell.widget.alarm.b.f fVar, int i) {
        this(nVar, vRectangle, null, fVar, i, false);
    }

    public p(n nVar, VRectangle vRectangle, com.tsf.shell.widget.alarm.b.e eVar, com.tsf.shell.widget.alarm.b.f fVar, int i, boolean z) {
        this.a = nVar;
        setTimeout(i);
        setScaleX(0.0f);
        setScaleY(0.0f);
        setScaleZ(0.0f);
        this.b = vRectangle;
        this.c = eVar;
        this.d = fVar;
        this.e = z;
        VTween.killTween(vRectangle);
        VTween.to(vRectangle, 100, this);
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onComplete() {
        if (this.c != null) {
            this.b.textures().removeAll();
            this.b.textures().addElement(this.c.g());
        }
        this.d.a(this.b);
        this.b.updateUvsVBO();
        new o(this.a, this.b, this.c, this.e);
    }
}
