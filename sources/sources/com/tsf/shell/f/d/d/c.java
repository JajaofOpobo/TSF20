package com.tsf.shell.f.d.d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends k {
    public Body a;
    public b d;
    private float e;
    private float f;

    public c(b bVar, float f, float f2, int i, int i2, boolean z) {
        super(f, f2, i, i2);
        this.f = 57.29578f;
        this.d = bVar;
        this.e = b.a;
        this.e = b.a;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.a = d.a(this.d.b, (-f3) / this.e, (-f4) / this.e, f3 / this.e, f4 / this.e, 0.0f, 0.3f, z);
        this.a.setSleepingAllowed(true);
        this.a.setAngularVelocity(0.017453292f);
    }

    public c(b bVar, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        super(f, f2, i, i2);
        this.f = 57.29578f;
        this.d = bVar;
        this.e = b.a;
        this.e = b.a;
        float f3 = i3 / 2;
        float f4 = i4 / 2;
        this.a = d.a(this.d.b, (-f3) / this.e, (-f4) / this.e, f3 / this.e, f4 / this.e, 0.0f, 0.3f, z);
        this.a.setSleepingAllowed(true);
        this.a.setAngularVelocity(0.017453292f);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawEnd() {
        Vector2 position = this.a.getPosition();
        position().x = position.x * this.e;
        position().y = position.y * this.e;
        rotation().z = this.a.getAngle() * this.f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        if (this.d.b != null) {
            this.d.b.destroyBody(this.a);
        }
        super.destroy();
    }
}
