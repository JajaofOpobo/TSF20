package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.primitives.VRectangle;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* loaded from: classes.dex */
class o extends VTweenParam {
    final /* synthetic */ n a;
    private com.tsf.shell.widget.alarm.b.e b;
    private boolean c;

    public o(n nVar, VRectangle vRectangle, com.tsf.shell.widget.alarm.b.e eVar, boolean z) {
        this.a = nVar;
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
        if (this.c && this.b != null) {
            this.b.i();
        }
    }
}
