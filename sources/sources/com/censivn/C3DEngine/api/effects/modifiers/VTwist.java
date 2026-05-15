package com.censivn.C3DEngine.api.effects.modifiers;

import com.censivn.C3DEngine.api.effects.VIEffects;
import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.c.b.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VTwist implements VIEffects {
    private c vTarget;

    public VTwist(float f) {
        this.vTarget = new c(f);
    }

    @Override // com.censivn.C3DEngine.api.effects.VIEffects
    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void apply() {
        this.vTarget.a();
    }

    public void setAngle(float f) {
        this.vTarget.c = f;
    }

    public float getAngle() {
        return this.vTarget.c;
    }

    public void setVector(Vector3 vector3) {
        this.vTarget.b = vector3;
    }

    public Vector3 getVector() {
        return this.vTarget.b;
    }

    public void setCenter(Vector3 vector3) {
        this.vTarget.d = vector3;
    }

    public Vector3 getCenter() {
        return this.vTarget.d;
    }
}
