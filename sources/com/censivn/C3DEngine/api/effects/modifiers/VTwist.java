package com.censivn.C3DEngine.api.effects.modifiers;

import com.censivn.C3DEngine.api.effects.VIEffects;
import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.p052c.p055b.C1081c;
/* loaded from: classes.dex */
public class VTwist implements VIEffects {
    private C1081c vTarget;

    public VTwist(float f) {
        this.vTarget = new C1081c(f);
    }

    @Override // com.censivn.C3DEngine.api.effects.VIEffects
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void apply() {
        this.vTarget.mo9901a();
    }

    public void setAngle(float f) {
        this.vTarget.f3425c = f;
    }

    public float getAngle() {
        return this.vTarget.f3425c;
    }

    public void setVector(Vector3 vector3) {
        this.vTarget.f3424b = vector3;
    }

    public Vector3 getVector() {
        return this.vTarget.f3424b;
    }

    public void setCenter(Vector3 vector3) {
        this.vTarget.f3426d = vector3;
    }

    public Vector3 getCenter() {
        return this.vTarget.f3426d;
    }
}
