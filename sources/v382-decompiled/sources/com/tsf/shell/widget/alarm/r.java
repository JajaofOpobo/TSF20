package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* loaded from: classes.dex */
class r extends VTweenParam {
    final /* synthetic */ q a;
    private com.tsf.shell.widget.alarm.b.e b;
    private boolean c;

    public r(q qVar, VRectangle vRectangle, com.tsf.shell.widget.alarm.b.e eVar, boolean z) {
        this.a = qVar;
        this.b = eVar;
        this.c = z;
        setEase(VEasing.Circ.easeOut);
        setTimeout(0);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setScaleZ(1.0f);
        VTween.killTween(vRectangle);
        VTween.to(vRectangle, 500, this);
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onComplete() {
        if (this.c) {
            this.b.i();
        }
    }
}
