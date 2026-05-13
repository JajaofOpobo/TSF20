package com.tsf.shell.p096f.p107d.p114d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
/* renamed from: com.tsf.shell.f.d.d.c */
/* loaded from: classes.dex */
public class C2435c extends C0981k {

    /* renamed from: a */
    public Body f8028a;

    /* renamed from: d */
    public C2434b f8029d;

    /* renamed from: e */
    private float f8030e;

    /* renamed from: f */
    private float f8031f;

    public C2435c(C2434b c2434b, float f, float f2, int i, int i2, boolean z) {
        super(f, f2, i, i2);
        this.f8031f = 57.29578f;
        this.f8029d = c2434b;
        this.f8030e = C2434b.f8024a;
        this.f8030e = C2434b.f8024a;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.f8028a = C2436d.m5556a(this.f8029d.f8025b, (-f3) / this.f8030e, (-f4) / this.f8030e, f3 / this.f8030e, f4 / this.f8030e, 0.0f, 0.3f, z);
        this.f8028a.setSleepingAllowed(true);
        this.f8028a.setAngularVelocity(0.017453292f);
    }

    public C2435c(C2434b c2434b, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        super(f, f2, i, i2);
        this.f8031f = 57.29578f;
        this.f8029d = c2434b;
        this.f8030e = C2434b.f8024a;
        this.f8030e = C2434b.f8024a;
        float f3 = i3 / 2;
        float f4 = i4 / 2;
        this.f8028a = C2436d.m5556a(this.f8029d.f8025b, (-f3) / this.f8030e, (-f4) / this.f8030e, f3 / this.f8030e, f4 / this.f8030e, 0.0f, 0.3f, z);
        this.f8028a.setSleepingAllowed(true);
        this.f8028a.setAngularVelocity(0.017453292f);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawEnd() {
        Vector2 position = this.f8028a.getPosition();
        position().f2526x = position.f2403x * this.f8030e;
        position().f2527y = position.f2404y * this.f8030e;
        rotation().f2528z = this.f8028a.getAngle() * this.f8031f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void destroy() {
        if (this.f8029d.f8025b != null) {
            this.f8029d.f8025b.destroyBody(this.f8028a);
        }
        super.destroy();
    }
}
