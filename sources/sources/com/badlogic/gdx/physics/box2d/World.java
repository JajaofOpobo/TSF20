package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.JointDef;
import com.badlogic.gdx.physics.box2d.joints.DistanceJoint;
import com.badlogic.gdx.physics.box2d.joints.DistanceJointDef;
import com.badlogic.gdx.physics.box2d.joints.FrictionJoint;
import com.badlogic.gdx.physics.box2d.joints.FrictionJointDef;
import com.badlogic.gdx.physics.box2d.joints.GearJoint;
import com.badlogic.gdx.physics.box2d.joints.GearJointDef;
import com.badlogic.gdx.physics.box2d.joints.LineJoint;
import com.badlogic.gdx.physics.box2d.joints.LineJointDef;
import com.badlogic.gdx.physics.box2d.joints.MouseJoint;
import com.badlogic.gdx.physics.box2d.joints.MouseJointDef;
import com.badlogic.gdx.physics.box2d.joints.PrismaticJoint;
import com.badlogic.gdx.physics.box2d.joints.PrismaticJointDef;
import com.badlogic.gdx.physics.box2d.joints.PulleyJoint;
import com.badlogic.gdx.physics.box2d.joints.PulleyJointDef;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJoint;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.badlogic.gdx.physics.box2d.joints.WeldJoint;
import com.badlogic.gdx.physics.box2d.joints.WeldJointDef;
import com.badlogic.gdx.utils.LongMap;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class World {
    private final long addr;
    protected final LongMap<Body> bodies = new LongMap<>(100);
    protected final LongMap<Fixture> fixtures = new LongMap<>(100);
    protected final LongMap<Joint> joints = new LongMap<>(100);
    protected ContactFilter contactFilter = null;
    protected ContactListener contactListener = null;
    private RayCastCallback rayCastCallback = null;
    private Vector2 rayPoint = new Vector2();
    private Vector2 rayNormal = new Vector2();
    final float[] tmpGravity = new float[2];
    final Vector2 gravity = new Vector2();
    private QueryCallback queryCallback = null;
    private long[] contactAddrs = new long[VEasing.Back.easeIn];
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final ArrayList<Contact> freeContacts = new ArrayList<>();
    private final Contact contact = new Contact(this, 0);
    private final Manifold manifold = new Manifold(this, 0);
    private final ContactImpulse impulse = new ContactImpulse(this, 0);

    private native void jniClearForces(long j);

    private native long jniCreateBody(long j, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f9);

    private native long jniCreateDistanceJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7);

    private native long jniCreateFrictionJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6);

    private native long jniCreateGearJoint(long j, long j2, long j3, boolean z, long j4, long j5, float f);

    private native long jniCreateLineJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, boolean z2, float f7, float f8, boolean z3, float f9, float f10);

    private native long jniCreateMouseJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5);

    private native long jniCreatePrismaticJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, float f9, boolean z3, float f10, float f11);

    private native long jniCreatePulleyJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13);

    private native long jniCreateRevoluteJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5, boolean z2, float f6, float f7, boolean z3, float f8, float f9);

    private native long jniCreateWeldJoint(long j, long j2, long j3, boolean z, float f, float f2, float f3, float f4, float f5);

    private native void jniDestroyBody(long j, long j2);

    private native void jniDestroyJoint(long j, long j2);

    private native void jniDispose(long j);

    private native boolean jniGetAutoClearForces(long j);

    private native int jniGetBodyCount(long j);

    private native int jniGetContactCount(long j);

    private native void jniGetContactList(long j, long[] jArr);

    private native void jniGetGravity(long j, float[] fArr);

    private native int jniGetJointcount(long j);

    private native int jniGetProxyCount(long j);

    private native boolean jniIsLocked(long j);

    private native void jniQueryAABB(long j, float f, float f2, float f3, float f4);

    private native void jniRayCast(long j, float f, float f2, float f3, float f4);

    private native void jniSetAutoClearForces(long j, boolean z);

    private native void jniSetContiousPhysics(long j, boolean z);

    private native void jniSetGravity(long j, float f, float f2);

    private native void jniSetWarmStarting(long j, boolean z);

    private native void jniStep(long j, float f, int i, int i2);

    private native long newWorld(float f, float f2, boolean z);

    static {
        System.loadLibrary("andenginephysicsbox2dextension");
    }

    public void rayCast(RayCastCallback rayCastCallback, Vector2 vector2, Vector2 vector22) {
        this.rayCastCallback = rayCastCallback;
        jniRayCast(this.addr, vector2.x, vector2.y, vector22.x, vector22.y);
    }

    private float reportRayFixture(long j, float f, float f2, float f3, float f4, float f5) {
        if (this.rayCastCallback != null) {
            return this.rayCastCallback.reportRayFixture(this.fixtures.get(j), this.rayPoint.set(f, f2), this.rayNormal.set(f3, f4), f5);
        }
        return 0.0f;
    }

    public void destroy() {
        a.a("BOX2D API", "destroy world id:" + this.addr);
        destroyAllJoint();
        destroyAllBody();
        this.bodies.clear();
        this.fixtures.clear();
        this.joints.clear();
        this.contactFilter = null;
        this.contactListener = null;
    }

    public World(Vector2 vector2, boolean z) {
        this.addr = newWorld(vector2.x, vector2.y, z);
        a.a("BOX2D API", "new world id:" + this.addr);
        for (int i = 0; i < 200; i++) {
            this.freeContacts.add(new Contact(this, 0L));
        }
    }

    public void setDestructionListener(DestructionListener destructionListener) {
    }

    public void setContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
    }

    public void setContactListener(ContactListener contactListener) {
        this.contactListener = contactListener;
    }

    public Body createBody(BodyDef bodyDef) {
        Body body = new Body(this, jniCreateBody(this.addr, bodyDef.type.getValue(), bodyDef.position.x, bodyDef.position.y, bodyDef.angle, bodyDef.linearVelocity.x, bodyDef.linearVelocity.y, bodyDef.angularVelocity, bodyDef.linearDamping, bodyDef.angularDamping, bodyDef.allowSleep, bodyDef.awake, bodyDef.fixedRotation, bodyDef.bullet, bodyDef.active, bodyDef.inertiaScale));
        this.bodies.put(body.addr, body);
        a.a("BOX2D API", "createBody id:" + body.addr);
        return body;
    }

    public void destroyAllBody() {
        LongMap.Entries<Body> entries = this.bodies.entries();
        while (entries.hasNext()) {
            Body body = entries.next().value;
            for (int i = 0; i < body.getFixtureList().size(); i++) {
                this.fixtures.remove(body.getFixtureList().get(i).addr);
            }
            for (int i2 = 0; i2 < body.getJointList().size(); i2++) {
                this.joints.remove(body.getJointList().get(i2).joint.addr);
            }
            a.a("BOX2D API", "destroyBody id:" + body.addr);
            jniDestroyBody(this.addr, body.addr);
        }
        this.joints.clear();
    }

    public void destroyBody(Body body) {
        this.bodies.remove(body.addr);
        for (int i = 0; i < body.getFixtureList().size(); i++) {
            this.fixtures.remove(body.getFixtureList().get(i).addr);
        }
        for (int i2 = 0; i2 < body.getJointList().size(); i2++) {
            this.joints.remove(body.getJointList().get(i2).joint.addr);
        }
        a.a("BOX2D API", "destroyBody id:" + body.addr);
        jniDestroyBody(this.addr, body.addr);
    }

    public Joint createJoint(JointDef jointDef) {
        long jCreateProperJoint = createProperJoint(jointDef);
        Joint weldJoint = null;
        if (jointDef.type == JointDef.JointType.DistanceJoint) {
            weldJoint = new DistanceJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.FrictionJoint) {
            weldJoint = new FrictionJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.GearJoint) {
            weldJoint = new GearJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.LineJoint) {
            weldJoint = new LineJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.MouseJoint) {
            weldJoint = new MouseJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.PrismaticJoint) {
            weldJoint = new PrismaticJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.PulleyJoint) {
            weldJoint = new PulleyJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.RevoluteJoint) {
            weldJoint = new RevoluteJoint(this, jCreateProperJoint);
        }
        if (jointDef.type == JointDef.JointType.WeldJoint) {
            weldJoint = new WeldJoint(this, jCreateProperJoint);
        }
        if (weldJoint != null) {
            this.joints.put(weldJoint.addr, weldJoint);
        }
        JointEdge jointEdge = new JointEdge(jointDef.bodyB, weldJoint);
        JointEdge jointEdge2 = new JointEdge(jointDef.bodyA, weldJoint);
        weldJoint.jointEdgeA = jointEdge;
        weldJoint.jointEdgeB = jointEdge2;
        jointDef.bodyA.joints.add(jointEdge);
        jointDef.bodyB.joints.add(jointEdge2);
        a.a("BOX2D API", "createJoint id:" + weldJoint.addr);
        return weldJoint;
    }

    private long createProperJoint(JointDef jointDef) {
        if (jointDef.type == JointDef.JointType.DistanceJoint) {
            DistanceJointDef distanceJointDef = (DistanceJointDef) jointDef;
            return jniCreateDistanceJoint(this.addr, distanceJointDef.bodyA.addr, distanceJointDef.bodyB.addr, distanceJointDef.collideConnected, distanceJointDef.localAnchorA.x, distanceJointDef.localAnchorA.y, distanceJointDef.localAnchorB.x, distanceJointDef.localAnchorB.y, distanceJointDef.length, distanceJointDef.frequencyHz, distanceJointDef.dampingRatio);
        }
        if (jointDef.type == JointDef.JointType.FrictionJoint) {
            FrictionJointDef frictionJointDef = (FrictionJointDef) jointDef;
            return jniCreateFrictionJoint(this.addr, frictionJointDef.bodyA.addr, frictionJointDef.bodyB.addr, frictionJointDef.collideConnected, frictionJointDef.localAnchorA.x, frictionJointDef.localAnchorA.y, frictionJointDef.localAnchorB.x, frictionJointDef.localAnchorB.y, frictionJointDef.maxForce, frictionJointDef.maxTorque);
        }
        if (jointDef.type == JointDef.JointType.GearJoint) {
            GearJointDef gearJointDef = (GearJointDef) jointDef;
            return jniCreateGearJoint(this.addr, gearJointDef.bodyA.addr, gearJointDef.bodyB.addr, gearJointDef.collideConnected, gearJointDef.joint1.addr, gearJointDef.joint2.addr, gearJointDef.ratio);
        }
        if (jointDef.type == JointDef.JointType.LineJoint) {
            LineJointDef lineJointDef = (LineJointDef) jointDef;
            return jniCreateLineJoint(this.addr, lineJointDef.bodyA.addr, lineJointDef.bodyB.addr, lineJointDef.collideConnected, lineJointDef.localAnchorA.x, lineJointDef.localAnchorA.y, lineJointDef.localAnchorB.x, lineJointDef.localAnchorB.y, lineJointDef.localAxisA.x, lineJointDef.localAxisA.y, lineJointDef.enableLimit, lineJointDef.lowerTranslation, lineJointDef.upperTranslation, lineJointDef.enableMotor, lineJointDef.maxMotorForce, lineJointDef.motorSpeed);
        }
        if (jointDef.type == JointDef.JointType.MouseJoint) {
            MouseJointDef mouseJointDef = (MouseJointDef) jointDef;
            return jniCreateMouseJoint(this.addr, mouseJointDef.bodyA.addr, mouseJointDef.bodyB.addr, mouseJointDef.collideConnected, mouseJointDef.target.x, mouseJointDef.target.y, mouseJointDef.maxForce, mouseJointDef.frequencyHz, mouseJointDef.dampingRatio);
        }
        if (jointDef.type == JointDef.JointType.PrismaticJoint) {
            PrismaticJointDef prismaticJointDef = (PrismaticJointDef) jointDef;
            return jniCreatePrismaticJoint(this.addr, prismaticJointDef.bodyA.addr, prismaticJointDef.bodyB.addr, prismaticJointDef.collideConnected, prismaticJointDef.localAnchorA.x, prismaticJointDef.localAnchorA.y, prismaticJointDef.localAnchorB.x, prismaticJointDef.localAnchorB.y, prismaticJointDef.localAxis1.x, prismaticJointDef.localAxis1.y, prismaticJointDef.referenceAngle, prismaticJointDef.enableLimit, prismaticJointDef.lowerTranslation, prismaticJointDef.upperTranslation, prismaticJointDef.enableMotor, prismaticJointDef.maxMotorForce, prismaticJointDef.motorSpeed);
        }
        if (jointDef.type == JointDef.JointType.PulleyJoint) {
            PulleyJointDef pulleyJointDef = (PulleyJointDef) jointDef;
            return jniCreatePulleyJoint(this.addr, pulleyJointDef.bodyA.addr, pulleyJointDef.bodyB.addr, pulleyJointDef.collideConnected, pulleyJointDef.groundAnchorA.x, pulleyJointDef.groundAnchorA.y, pulleyJointDef.groundAnchorB.x, pulleyJointDef.groundAnchorB.y, pulleyJointDef.localAnchorA.x, pulleyJointDef.localAnchorA.y, pulleyJointDef.localAnchorB.x, pulleyJointDef.localAnchorB.y, pulleyJointDef.lengthA, pulleyJointDef.maxLengthA, pulleyJointDef.lengthB, pulleyJointDef.maxLengthB, pulleyJointDef.ratio);
        }
        if (jointDef.type == JointDef.JointType.RevoluteJoint) {
            RevoluteJointDef revoluteJointDef = (RevoluteJointDef) jointDef;
            return jniCreateRevoluteJoint(this.addr, revoluteJointDef.bodyA.addr, revoluteJointDef.bodyB.addr, revoluteJointDef.collideConnected, revoluteJointDef.localAnchorA.x, revoluteJointDef.localAnchorA.y, revoluteJointDef.localAnchorB.x, revoluteJointDef.localAnchorB.y, revoluteJointDef.referenceAngle, revoluteJointDef.enableLimit, revoluteJointDef.lowerAngle, revoluteJointDef.upperAngle, revoluteJointDef.enableMotor, revoluteJointDef.motorSpeed, revoluteJointDef.maxMotorTorque);
        }
        if (jointDef.type == JointDef.JointType.WeldJoint) {
            WeldJointDef weldJointDef = (WeldJointDef) jointDef;
            return jniCreateWeldJoint(this.addr, weldJointDef.bodyA.addr, weldJointDef.bodyB.addr, weldJointDef.collideConnected, weldJointDef.localAnchorA.x, weldJointDef.localAnchorA.y, weldJointDef.localAnchorB.x, weldJointDef.localAnchorB.y, weldJointDef.referenceAngle);
        }
        return 0L;
    }

    public void destroyAllJoint() {
        LongMap.Entries<Joint> entries = this.joints.entries();
        while (entries.hasNext()) {
            Joint joint = entries.next().value;
            joint.jointEdgeA.other.joints.remove(joint.jointEdgeB);
            joint.jointEdgeB.other.joints.remove(joint.jointEdgeA);
            a.a("BOX2D API", "destroyJoint id:" + joint.addr);
            jniDestroyJoint(this.addr, joint.addr);
        }
        this.joints.clear();
    }

    public void destroyJoint(Joint joint) {
        this.joints.remove(joint.addr);
        joint.jointEdgeA.other.joints.remove(joint.jointEdgeB);
        joint.jointEdgeB.other.joints.remove(joint.jointEdgeA);
        a.a("BOX2D API", "destroyJoint id:" + joint.addr);
        jniDestroyJoint(this.addr, joint.addr);
    }

    public void step(float f, int i, int i2) {
        jniStep(this.addr, f, i, i2);
    }

    public void clearForces() {
        jniClearForces(this.addr);
    }

    public void setWarmStarting(boolean z) {
        jniSetWarmStarting(this.addr, z);
    }

    public void setContinuousPhysics(boolean z) {
        jniSetContiousPhysics(this.addr, z);
    }

    public int getProxyCount() {
        return jniGetProxyCount(this.addr);
    }

    public int getBodyCount() {
        return jniGetBodyCount(this.addr);
    }

    public int getJointCount() {
        return jniGetJointcount(this.addr);
    }

    public int getContactCount() {
        return jniGetContactCount(this.addr);
    }

    public void setGravity(Vector2 vector2) {
        jniSetGravity(this.addr, vector2.x, vector2.y);
    }

    public Vector2 getGravity() {
        jniGetGravity(this.addr, this.tmpGravity);
        this.gravity.x = this.tmpGravity[0];
        this.gravity.y = this.tmpGravity[1];
        return this.gravity;
    }

    public boolean isLocked() {
        return jniIsLocked(this.addr);
    }

    public void setAutoClearForces(boolean z) {
        jniSetAutoClearForces(this.addr, z);
    }

    public boolean getAutoClearForces() {
        return jniGetAutoClearForces(this.addr);
    }

    public void QueryAABB(QueryCallback queryCallback, float f, float f2, float f3, float f4) {
        this.queryCallback = queryCallback;
        jniQueryAABB(this.addr, f, f2, f3, f4);
    }

    public List<Contact> getContactList() {
        int contactCount = getContactCount();
        if (contactCount > this.contactAddrs.length) {
            this.contactAddrs = new long[contactCount];
        }
        if (contactCount > this.freeContacts.size()) {
            int size = this.freeContacts.size();
            for (int i = 0; i < contactCount - size; i++) {
                this.freeContacts.add(new Contact(this, 0L));
            }
        }
        jniGetContactList(this.addr, this.contactAddrs);
        this.contacts.clear();
        for (int i2 = 0; i2 < contactCount; i2++) {
            Contact contact = this.freeContacts.get(i2);
            contact.addr = this.contactAddrs[i2];
            this.contacts.add(contact);
        }
        return this.contacts;
    }

    public Iterator<Body> getBodies() {
        return this.bodies.values();
    }

    public Iterator<Joint> getJoints() {
        return this.joints.values();
    }

    public void dispose() {
        jniDispose(this.addr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean contactFilter(long r8, long r10) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            com.badlogic.gdx.physics.box2d.ContactFilter r0 = r7.contactFilter
            if (r0 == 0) goto L1d
            com.badlogic.gdx.physics.box2d.ContactFilter r2 = r7.contactFilter
            com.badlogic.gdx.utils.LongMap<com.badlogic.gdx.physics.box2d.Fixture> r0 = r7.fixtures
            java.lang.Object r0 = r0.get(r8)
            com.badlogic.gdx.physics.box2d.Fixture r0 = (com.badlogic.gdx.physics.box2d.Fixture) r0
            com.badlogic.gdx.utils.LongMap<com.badlogic.gdx.physics.box2d.Fixture> r1 = r7.fixtures
            java.lang.Object r1 = r1.get(r10)
            com.badlogic.gdx.physics.box2d.Fixture r1 = (com.badlogic.gdx.physics.box2d.Fixture) r1
            boolean r0 = r2.shouldCollide(r0, r1)
        L1c:
            return r0
        L1d:
            com.badlogic.gdx.utils.LongMap<com.badlogic.gdx.physics.box2d.Fixture> r0 = r7.fixtures
            java.lang.Object r0 = r0.get(r8)
            com.badlogic.gdx.physics.box2d.Fixture r0 = (com.badlogic.gdx.physics.box2d.Fixture) r0
            com.badlogic.gdx.physics.box2d.Filter r3 = r0.getFilterData()
            com.badlogic.gdx.utils.LongMap<com.badlogic.gdx.physics.box2d.Fixture> r0 = r7.fixtures
            java.lang.Object r0 = r0.get(r10)
            com.badlogic.gdx.physics.box2d.Fixture r0 = (com.badlogic.gdx.physics.box2d.Fixture) r0
            com.badlogic.gdx.physics.box2d.Filter r0 = r0.getFilterData()
            short r4 = r3.groupIndex
            short r5 = r0.groupIndex
            if (r4 != r5) goto L47
            short r4 = r3.groupIndex
            if (r4 == 0) goto L47
            short r0 = r3.groupIndex
            if (r0 <= 0) goto L45
            r0 = r1
            goto L1c
        L45:
            r0 = r2
            goto L1c
        L47:
            short r4 = r3.maskBits
            short r5 = r0.categoryBits
            r4 = r4 & r5
            if (r4 == 0) goto L57
            short r3 = r3.categoryBits
            short r0 = r0.maskBits
            r0 = r0 & r3
            if (r0 == 0) goto L57
        L55:
            r0 = r1
            goto L1c
        L57:
            r1 = r2
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.physics.box2d.World.contactFilter(long, long):boolean");
    }

    private void beginContact(long j) {
        this.contact.addr = j;
        if (this.contactListener != null) {
            this.contactListener.beginContact(this.contact);
        }
    }

    private void endContact(long j) {
        this.contact.addr = j;
        if (this.contactListener != null) {
            this.contactListener.endContact(this.contact);
        }
    }

    private void preSolve(long j, long j2) {
        this.contact.addr = j;
        this.manifold.addr = j2;
        if (this.contactListener != null) {
            this.contactListener.preSolve(this.contact, this.manifold);
        }
    }

    private void postSolve(long j, long j2) {
        this.contact.addr = j;
        this.impulse.addr = j2;
        if (this.contactListener != null) {
            this.contactListener.postSolve(this.contact, this.impulse);
        }
    }

    private boolean reportFixture(long j) {
        if (this.queryCallback != null) {
            return this.queryCallback.reportFixture(this.fixtures.get(j));
        }
        return false;
    }
}
