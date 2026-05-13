package com.tsf.shell.p096f.p107d.p114d.p115a;

import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p107d.p114d.C2434b;
import com.tsf.shell.p096f.p107d.p114d.C2435c;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p153i.C3112b;
/* renamed from: com.tsf.shell.f.d.d.a.c */
/* loaded from: classes.dex */
public class C2433c implements InterfaceC2431a {

    /* renamed from: a */
    private int f8015a;

    /* renamed from: b */
    private C2435c f8016b;

    /* renamed from: c */
    private C2435c f8017c;

    /* renamed from: d */
    private Joint f8018d;

    /* renamed from: e */
    private C0980j f8019e;

    /* renamed from: f */
    private C2932g f8020f;

    /* renamed from: g */
    private float f8021g = 0.0f;

    /* renamed from: h */
    private float f8022h = 0.0f;

    /* renamed from: i */
    private float f8023i = 0.0f;

    public C2433c(int i) {
        this.f8015a = i;
        m5562e();
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: d */
    public int mo5563d() {
        return this.f8015a;
    }

    /* renamed from: e */
    private void m5562e() {
        this.f8019e = new C0980j();
        this.f8016b = new C2435c(C3359a.f11108v.f7770c.f8012b, 320.0f, 96.0f, 1, 1, true);
        this.f8016b.f8028a.setTransform(0.0f, 0.0f, 0.0f);
        this.f8017c = new C2435c(C3359a.f11108v.f7770c.f8012b, 128.0f, 64.0f, 1, 1, 100, 40, false);
        this.f8017c.position().f2526x = -137.0f;
        this.f8017c.position().f2527y = 0.0f;
        this.f8017c.f8028a.setTransform(this.f8017c.position().f2526x / C2434b.f8024a, this.f8017c.position().f2527y / C2434b.f8024a, 0.0f);
        this.f8017c.f8028a.setAngularDamping(3.0f);
        this.f8017c.f8028a.setLinearDamping(8.0f);
        RevoluteJointDef revoluteJointDef = new RevoluteJointDef();
        revoluteJointDef.bodyA = this.f8016b.f8028a;
        revoluteJointDef.bodyB = this.f8017c.f8028a;
        revoluteJointDef.localAnchorA.f2403x = (-133.0f) / C2434b.f8024a;
        revoluteJointDef.localAnchorA.f2404y = 22.0f / C2434b.f8024a;
        revoluteJointDef.localAnchorB.f2404y = 20.0f / C2434b.f8024a;
        revoluteJointDef.collideConnected = false;
        this.f8018d = C3359a.f11108v.f7770c.f8012b.f8025b.createJoint(revoluteJointDef);
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: a */
    public boolean mo5569a() {
        return this.f8017c.f8028a.isAwake();
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: a */
    public void mo5568a(C2932g c2932g) {
        if (c2932g.f9541g != 0.0f) {
            this.f8017c.f8028a.setAwake(true);
            this.f8016b.f8028a.setAwake(true);
            if (this.f8020f == null) {
                this.f8020f = c2932g;
                this.f8021g = 0.0f;
            } else if (this.f8020f != c2932g) {
                this.f8021g += this.f8020f.f9541g - c2932g.f9541g;
                this.f8020f = c2932g;
            }
            this.f8016b.f8028a.setTransform(((c2932g.f9541g + this.f8021g) * C0892a.f2553D) / C2434b.f8024a, 0.0f, 0.0f);
        }
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: a */
    public void mo5566a(boolean z) {
        if (!z) {
            if (this.f8022h != this.f8023i) {
                this.f8022h = (float) ((this.f8017c.f8028a.getAngle() * 180.0f) / 3.141592653589793d);
                this.f8023i += (this.f8022h - this.f8023i) * 0.15f;
                if (Math.abs(this.f8023i - this.f8022h) < 0.5f) {
                    mo5564c();
                    return;
                } else {
                    C0853a.m10855e().m10760j();
                    return;
                }
            }
            return;
        }
        this.f8022h = (float) ((this.f8017c.f8028a.getAngle() * 180.0f) / 3.141592653589793d);
        this.f8023i += (this.f8022h - this.f8023i) * 0.15f;
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: b */
    public void mo5565b() {
        mo5564c();
        C3359a.f11108v.f7770c.m5571g();
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: a */
    public void mo5567a(C3112b c3112b) {
        c3112b.m3512b(this.f8023i);
    }

    @Override // com.tsf.shell.p096f.p107d.p114d.p115a.InterfaceC2431a
    /* renamed from: c */
    public void mo5564c() {
        this.f8022h = 0.0f;
        this.f8023i = 0.0f;
        this.f8017c.f8028a.setTransform(this.f8017c.position().f2526x / C2434b.f8024a, this.f8017c.position().f2527y / C2434b.f8024a, 0.0f);
        this.f8016b.f8028a.setTransform(0.0f, 0.0f, 0.0f);
        this.f8017c.f8028a.setAwake(false);
        this.f8020f = null;
        this.f8021g = 0.0f;
    }
}
