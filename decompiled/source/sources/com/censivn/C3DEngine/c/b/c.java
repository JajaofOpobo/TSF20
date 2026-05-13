package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.c.a.d;
import com.censivn.C3DEngine.c.a.e;
/* loaded from: classes.dex */
public class c extends d implements com.censivn.C3DEngine.c.b {
    public float c;
    public Vector3 b = new Vector3(0.0f, 1.0f, 0.0f);
    public Vector3 d = new Vector3(0.0f, 0.0f, 0.0f);

    public c(float f) {
        this.c = f;
    }

    @Override // com.censivn.C3DEngine.c.b
    public void a() {
        this.b.normalize();
        Vector3 vector3 = new Vector3(this.a.f() / 2.0f, this.a.g() / 2.0f, this.a.h() / 2.0f);
        float f = -Vector3.dot(this.b, this.d);
        int size = this.a.a().size();
        for (int i = 0; i < size; i++) {
            e eVar = this.a.a().get(i);
            a(eVar, ((Vector3.dot(new Vector3(eVar.a(), eVar.b(), eVar.c()), this.b) + f) / vector3.getMagnitude()) * this.c);
        }
    }

    private void a(e eVar, float f) {
        com.censivn.C3DEngine.c.a.b b = com.censivn.C3DEngine.c.a.b.b(com.censivn.C3DEngine.c.a.b.a(this.b.x, this.b.y, this.b.z, f), com.censivn.C3DEngine.c.a.b.a(eVar.a(), eVar.b(), eVar.c()));
        eVar.a(b.d);
        eVar.b(b.h);
        eVar.c(b.l);
    }
}
