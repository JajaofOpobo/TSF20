package com.tsf.shell.widget.alarm;

import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;

/* loaded from: classes.dex */
class al extends VTweenParam {
    boolean a = false;
    final /* synthetic */ ak b;
    private VObject3d c;

    public al(ak akVar, VObject3d vObject3d) {
        this.b = akVar;
        this.c = vObject3d;
        setEase(300);
        VTween.killTween(akVar);
        VTween.to(akVar, 2000, this);
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onComplete() {
    }

    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
    public void onUpdate(float f) {
        if (f > 0.5d && !this.a) {
            this.c.setZOrderOnTop();
            this.a = true;
        }
        float f2 = 1.0f - f;
        float sin = (float) Math.sin(f2 * 3.141592653589793d);
        this.b.position().spZ(((float) Math.cos(f2 * 3.141592653589793d)) * 80.0f);
        this.b.position().spY((sin * 80.0f) + 175.0f);
    }
}
