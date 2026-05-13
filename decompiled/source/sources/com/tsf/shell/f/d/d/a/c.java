package com.tsf.shell.f.d.d.a;

import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.f.g;
/* loaded from: classes.dex */
public class c implements a {
    private int a;
    private com.tsf.shell.f.d.d.c b;
    private com.tsf.shell.f.d.d.c c;
    private Joint d;
    private j e;
    private g f;
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 0.0f;

    public c(int i) {
        this.a = i;
        e();
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public int d() {
        return this.a;
    }

    private void e() {
        this.e = new j();
        this.b = new com.tsf.shell.f.d.d.c(com.tsf.shell.manager.a.v.c.b, 320.0f, 96.0f, 1, 1, true);
        this.b.a.setTransform(0.0f, 0.0f, 0.0f);
        this.c = new com.tsf.shell.f.d.d.c(com.tsf.shell.manager.a.v.c.b, 128.0f, 64.0f, 1, 1, 100, 40, false);
        this.c.position().x = -137.0f;
        this.c.position().y = 0.0f;
        this.c.a.setTransform(this.c.position().x / com.tsf.shell.f.d.d.b.a, this.c.position().y / com.tsf.shell.f.d.d.b.a, 0.0f);
        this.c.a.setAngularDamping(3.0f);
        this.c.a.setLinearDamping(8.0f);
        RevoluteJointDef revoluteJointDef = new RevoluteJointDef();
        revoluteJointDef.bodyA = this.b.a;
        revoluteJointDef.bodyB = this.c.a;
        revoluteJointDef.localAnchorA.x = (-133.0f) / com.tsf.shell.f.d.d.b.a;
        revoluteJointDef.localAnchorA.y = 22.0f / com.tsf.shell.f.d.d.b.a;
        revoluteJointDef.localAnchorB.y = 20.0f / com.tsf.shell.f.d.d.b.a;
        revoluteJointDef.collideConnected = false;
        this.d = com.tsf.shell.manager.a.v.c.b.b.createJoint(revoluteJointDef);
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public boolean a() {
        return this.c.a.isAwake();
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public void a(g gVar) {
        if (gVar.g != 0.0f) {
            this.c.a.setAwake(true);
            this.b.a.setAwake(true);
            if (this.f == null) {
                this.f = gVar;
                this.g = 0.0f;
            } else if (this.f != gVar) {
                this.g += this.f.g - gVar.g;
                this.f = gVar;
            }
            this.b.a.setTransform(((gVar.g + this.g) * com.censivn.C3DEngine.b.b.a.D) / com.tsf.shell.f.d.d.b.a, 0.0f, 0.0f);
        }
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public void a(boolean z) {
        if (!z) {
            if (this.h != this.i) {
                this.h = (float) ((this.c.a.getAngle() * 180.0f) / 3.141592653589793d);
                this.i += (this.h - this.i) * 0.15f;
                if (Math.abs(this.i - this.h) < 0.5f) {
                    c();
                    return;
                } else {
                    com.censivn.C3DEngine.a.e().j();
                    return;
                }
            }
            return;
        }
        this.h = (float) ((this.c.a.getAngle() * 180.0f) / 3.141592653589793d);
        this.i += (this.h - this.i) * 0.15f;
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public void b() {
        c();
        com.tsf.shell.manager.a.v.c.g();
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public void a(com.tsf.shell.f.i.b bVar) {
        bVar.b(this.i);
    }

    @Override // com.tsf.shell.f.d.d.a.a
    public void c() {
        this.h = 0.0f;
        this.i = 0.0f;
        this.c.a.setTransform(this.c.position().x / com.tsf.shell.f.d.d.b.a, this.c.position().y / com.tsf.shell.f.d.d.b.a, 0.0f);
        this.b.a.setTransform(0.0f, 0.0f, 0.0f);
        this.c.a.setAwake(false);
        this.f = null;
        this.g = 0.0f;
    }
}
