package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Body {
    protected final long addr;
    private Object userData;
    private final World world;
    private final float[] tmp = new float[4];
    private ArrayList<Fixture> fixtures = new ArrayList<>(2);
    protected ArrayList<JointEdge> joints = new ArrayList<>(2);
    private final Transform transform = new Transform();
    private final Vector2 position = new Vector2();
    private final Vector2 worldCenter = new Vector2();
    private final Vector2 localCenter = new Vector2();
    private final Vector2 linearVelocity = new Vector2();
    private final MassData massData = new MassData();
    private final Vector2 localPoint = new Vector2();
    private final Vector2 worldVector = new Vector2();
    public final Vector2 localPoint2 = new Vector2();
    public final Vector2 localVector = new Vector2();
    public final Vector2 linVelWorld = new Vector2();
    public final Vector2 linVelLoc = new Vector2();

    private native void jniApplyAngularImpulse(long j, float f);

    private native void jniApplyForce(long j, float f, float f2, float f3, float f4);

    private native void jniApplyLinearImpulse(long j, float f, float f2, float f3, float f4);

    private native void jniApplyTorque(long j, float f);

    private native long jniCreateFixture(long j, long j2, float f);

    private native long jniCreateFixture(long j, long j2, float f, float f2, float f3, boolean z, short s, short s2, short s3);

    private native void jniDestroyFixture(long j, long j2);

    private native float jniGetAngle(long j);

    private native float jniGetAngularDamping(long j);

    private native float jniGetAngularVelocity(long j);

    private native float jniGetInertia(long j);

    private native float jniGetLinearDamping(long j);

    private native void jniGetLinearVelocity(long j, float[] fArr);

    private native void jniGetLinearVelocityFromLocalPoint(long j, float f, float f2, float[] fArr);

    private native void jniGetLinearVelocityFromWorldPoint(long j, float f, float f2, float[] fArr);

    private native void jniGetLocalCenter(long j, float[] fArr);

    private native void jniGetLocalPoint(long j, float f, float f2, float[] fArr);

    private native void jniGetLocalVector(long j, float f, float f2, float[] fArr);

    private native float jniGetMass(long j);

    private native void jniGetMassData(long j, float[] fArr);

    private native void jniGetPosition(long j, float[] fArr);

    private native void jniGetTransform(long j, float[] fArr);

    private native int jniGetType(long j);

    private native void jniGetWorldCenter(long j, float[] fArr);

    private native void jniGetWorldPoint(long j, float f, float f2, float[] fArr);

    private native void jniGetWorldVector(long j, float f, float f2, float[] fArr);

    private native boolean jniIsActive(long j);

    private native boolean jniIsAwake(long j);

    private native boolean jniIsBullet(long j);

    private native boolean jniIsFixedRotation(long j);

    private native boolean jniIsSleepingAllowed(long j);

    private native void jniResetMassData(long j);

    private native void jniSetActive(long j, boolean z);

    private native void jniSetAngularDamping(long j, float f);

    private native void jniSetAngularVelocity(long j, float f);

    private native void jniSetAwake(long j, boolean z);

    private native void jniSetBullet(long j, boolean z);

    private native void jniSetFixedRotation(long j, boolean z);

    private native void jniSetLinearDamping(long j, float f);

    private native void jniSetLinearVelocity(long j, float f, float f2);

    private native void jniSetMassData(long j, float f, float f2, float f3, float f4);

    private native void jniSetSleepingAllowed(long j, boolean z);

    private native void jniSetTransform(long j, float f, float f2, float f3);

    private native void jniSetType(long j, int i);

    protected Body(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    public Fixture createFixture(FixtureDef fixtureDef) {
        Fixture fixture = new Fixture(this, jniCreateFixture(this.addr, fixtureDef.shape.addr, fixtureDef.friction, fixtureDef.restitution, fixtureDef.density, fixtureDef.isSensor, fixtureDef.filter.categoryBits, fixtureDef.filter.maskBits, fixtureDef.filter.groupIndex));
        this.world.fixtures.put(fixture.addr, fixture);
        this.fixtures.add(fixture);
        return fixture;
    }

    public Fixture createFixture(Shape shape, float f) {
        Fixture fixture = new Fixture(this, jniCreateFixture(this.addr, shape.addr, f));
        this.world.fixtures.put(fixture.addr, fixture);
        this.fixtures.add(fixture);
        return fixture;
    }

    public void destroyFixture(Fixture fixture) {
        jniDestroyFixture(this.addr, fixture.addr);
        this.world.fixtures.remove(fixture.addr);
        this.fixtures.remove(fixture);
    }

    public void setTransform(Vector2 vector2, float f) {
        jniSetTransform(this.addr, vector2.x, vector2.y, f);
    }

    public void setTransform(float f, float f2, float f3) {
        jniSetTransform(this.addr, f, f2, f3);
    }

    public Transform getTransform() {
        jniGetTransform(this.addr, this.transform.vals);
        return this.transform;
    }

    public Vector2 getPosition() {
        jniGetPosition(this.addr, this.tmp);
        this.position.x = this.tmp[0];
        this.position.y = this.tmp[1];
        return this.position;
    }

    public float getAngle() {
        return jniGetAngle(this.addr);
    }

    public Vector2 getWorldCenter() {
        jniGetWorldCenter(this.addr, this.tmp);
        this.worldCenter.x = this.tmp[0];
        this.worldCenter.y = this.tmp[1];
        return this.worldCenter;
    }

    public Vector2 getLocalCenter() {
        jniGetLocalCenter(this.addr, this.tmp);
        this.localCenter.x = this.tmp[0];
        this.localCenter.y = this.tmp[1];
        return this.localCenter;
    }

    public void setLinearVelocity(Vector2 vector2) {
        jniSetLinearVelocity(this.addr, vector2.x, vector2.y);
    }

    public void setLinearVelocity(float f, float f2) {
        jniSetLinearVelocity(this.addr, f, f2);
    }

    public Vector2 getLinearVelocity() {
        jniGetLinearVelocity(this.addr, this.tmp);
        this.linearVelocity.x = this.tmp[0];
        this.linearVelocity.y = this.tmp[1];
        return this.linearVelocity;
    }

    public void setAngularVelocity(float f) {
        jniSetAngularVelocity(this.addr, f);
    }

    public float getAngularVelocity() {
        return jniGetAngularVelocity(this.addr);
    }

    public void applyForce(Vector2 vector2, Vector2 vector22) {
        jniApplyForce(this.addr, vector2.x, vector2.y, vector22.x, vector22.y);
    }

    public void applyForce(float f, float f2, float f3, float f4) {
        jniApplyForce(this.addr, f, f2, f3, f4);
    }

    public void applyTorque(float f) {
        jniApplyTorque(this.addr, f);
    }

    public void applyLinearImpulse(Vector2 vector2, Vector2 vector22) {
        jniApplyLinearImpulse(this.addr, vector2.x, vector2.y, vector22.x, vector22.y);
    }

    public void applyLinearImpulse(float f, float f2, float f3, float f4) {
        jniApplyLinearImpulse(this.addr, f, f2, f3, f4);
    }

    public void applyAngularImpulse(float f) {
        jniApplyAngularImpulse(this.addr, f);
    }

    public float getMass() {
        return jniGetMass(this.addr);
    }

    public float getInertia() {
        return jniGetInertia(this.addr);
    }

    public MassData getMassData() {
        jniGetMassData(this.addr, this.tmp);
        this.massData.mass = this.tmp[0];
        this.massData.center.x = this.tmp[1];
        this.massData.center.y = this.tmp[2];
        this.massData.I = this.tmp[3];
        return this.massData;
    }

    public void setMassData(MassData massData) {
        jniSetMassData(this.addr, massData.mass, massData.center.x, massData.center.y, massData.I);
    }

    public void resetMassData() {
        jniResetMassData(this.addr);
    }

    public Vector2 getWorldPoint(Vector2 vector2) {
        jniGetWorldPoint(this.addr, vector2.x, vector2.y, this.tmp);
        this.localPoint.x = this.tmp[0];
        this.localPoint.y = this.tmp[1];
        return this.localPoint;
    }

    public Vector2 getWorldVector(Vector2 vector2) {
        jniGetWorldVector(this.addr, vector2.x, vector2.y, this.tmp);
        this.worldVector.x = this.tmp[0];
        this.worldVector.y = this.tmp[1];
        return this.worldVector;
    }

    public Vector2 getLocalPoint(Vector2 vector2) {
        jniGetLocalPoint(this.addr, vector2.x, vector2.y, this.tmp);
        this.localPoint2.x = this.tmp[0];
        this.localPoint2.y = this.tmp[1];
        return this.localPoint2;
    }

    public Vector2 getLocalVector(Vector2 vector2) {
        jniGetLocalVector(this.addr, vector2.x, vector2.y, this.tmp);
        this.localVector.x = this.tmp[0];
        this.localVector.y = this.tmp[1];
        return this.localVector;
    }

    public Vector2 getLinearVelocityFromWorldPoint(Vector2 vector2) {
        jniGetLinearVelocityFromWorldPoint(this.addr, vector2.x, vector2.y, this.tmp);
        this.linVelWorld.x = this.tmp[0];
        this.linVelWorld.y = this.tmp[1];
        return this.linVelWorld;
    }

    public Vector2 getLinearVelocityFromLocalPoint(Vector2 vector2) {
        jniGetLinearVelocityFromLocalPoint(this.addr, vector2.x, vector2.y, this.tmp);
        this.linVelLoc.x = this.tmp[0];
        this.linVelLoc.y = this.tmp[1];
        return this.linVelLoc;
    }

    public float getLinearDamping() {
        return jniGetLinearDamping(this.addr);
    }

    public void setLinearDamping(float f) {
        jniSetLinearDamping(this.addr, f);
    }

    public float getAngularDamping() {
        return jniGetAngularDamping(this.addr);
    }

    public void setAngularDamping(float f) {
        jniSetAngularDamping(this.addr, f);
    }

    public void setType(BodyDef.BodyType bodyType) {
        jniSetType(this.addr, bodyType.getValue());
    }

    public BodyDef.BodyType getType() {
        int iJniGetType = jniGetType(this.addr);
        return iJniGetType == 0 ? BodyDef.BodyType.StaticBody : iJniGetType == 1 ? BodyDef.BodyType.KinematicBody : iJniGetType == 2 ? BodyDef.BodyType.DynamicBody : BodyDef.BodyType.StaticBody;
    }

    public void setBullet(boolean z) {
        jniSetBullet(this.addr, z);
    }

    public boolean isBullet() {
        return jniIsBullet(this.addr);
    }

    public void setSleepingAllowed(boolean z) {
        jniSetSleepingAllowed(this.addr, z);
    }

    public boolean isSleepingAllowed() {
        return jniIsSleepingAllowed(this.addr);
    }

    public void setAwake(boolean z) {
        jniSetAwake(this.addr, z);
    }

    public boolean isAwake() {
        return jniIsAwake(this.addr);
    }

    public void setActive(boolean z) {
        jniSetActive(this.addr, z);
    }

    public boolean isActive() {
        return jniIsActive(this.addr);
    }

    public void setFixedRotation(boolean z) {
        jniSetFixedRotation(this.addr, z);
    }

    public boolean isFixedRotation() {
        return jniIsFixedRotation(this.addr);
    }

    public ArrayList<Fixture> getFixtureList() {
        return this.fixtures;
    }

    public ArrayList<JointEdge> getJointList() {
        return this.joints;
    }

    public World getWorld() {
        return this.world;
    }

    public Object getUserData() {
        return this.userData;
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }
}
