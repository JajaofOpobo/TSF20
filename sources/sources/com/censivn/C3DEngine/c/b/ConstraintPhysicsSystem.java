package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.c.a.BaseParticle;
import com.censivn.C3DEngine.c.a.ParticleData;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ConstraintPhysicsSystem extends BaseParticle implements IPhysicsSystem {
    public float c;
    public Vector3 b = new Vector3(0.0f, 1.0f, 0.0f);
    public Vector3 d = new Vector3(0.0f, 0.0f, 0.0f);

    public ConstraintPhysicsSystem(float f) {
        this.c = f;
    }

    @Override // com.censivn.C3DEngine.c.IPhysicsSystem
    public void a() {
        this.b.normalize();
        Vector3 vector3 = new Vector3(this.a.f() / 2.0f, this.a.g() / 2.0f, this.a.h() / 2.0f);
        float f = -Vector3.dot(this.b, this.d);
        int size = this.a.a().size();
        for (int i = 0; i < size; i++) {
            ParticleData eVar = this.a.a().get(i);
            a(eVar, ((Vector3.dot(new Vector3(eVar.a(), eVar.b(), eVar.c()), this.b) + f) / vector3.getMagnitude()) * this.c);
        }
    }

    private void a(ParticleData eVar, float f) {
        com.censivn.C3DEngine.c.a.ParticleTransform bVarB = com.censivn.C3DEngine.c.a.ParticleTransform.b(com.censivn.C3DEngine.c.a.ParticleTransform.a(this.b.x, this.b.y, this.b.z, f), com.censivn.C3DEngine.c.a.ParticleTransform.a(eVar.a(), eVar.b(), eVar.c()));
        eVar.a(bVarB.d);
        eVar.b(bVarB.h);
        eVar.c(bVarB.l);
    }
}
