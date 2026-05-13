package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.JointDef;
/* loaded from: classes.dex */
public abstract class Joint {
    protected long addr;
    protected JointEdge jointEdgeA;
    protected JointEdge jointEdgeB;
    private final World world;
    private final float[] tmp = new float[2];
    private final Vector2 anchorA = new Vector2();
    private final Vector2 anchorB = new Vector2();
    private final Vector2 reactionForce = new Vector2();

    private native void jniGetAnchorA(long j, float[] fArr);

    private native void jniGetAnchorB(long j, float[] fArr);

    private native long jniGetBodyA(long j);

    private native long jniGetBodyB(long j);

    private native void jniGetReactionForce(long j, float f, float[] fArr);

    private native float jniGetReactionTorque(long j, float f);

    private native int jniGetType(long j);

    private native boolean jniIsActive(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public Joint(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    public JointDef.JointType getType() {
        int jniGetType = jniGetType(this.addr);
        return (jniGetType <= 0 || jniGetType >= JointDef.JointType.valueTypes.length) ? JointDef.JointType.Unknown : JointDef.JointType.valueTypes[jniGetType];
    }

    public Body getBodyA() {
        return this.world.bodies.get(jniGetBodyA(this.addr));
    }

    public Body getBodyB() {
        return this.world.bodies.get(jniGetBodyB(this.addr));
    }

    public Vector2 getAnchorA() {
        jniGetAnchorA(this.addr, this.tmp);
        this.anchorA.f2403x = this.tmp[0];
        this.anchorA.f2404y = this.tmp[1];
        return this.anchorA;
    }

    public Vector2 getAnchorB() {
        jniGetAnchorB(this.addr, this.tmp);
        this.anchorB.f2403x = this.tmp[0];
        this.anchorB.f2404y = this.tmp[1];
        return this.anchorB;
    }

    public Vector2 getReactionForce(float f) {
        jniGetReactionForce(this.addr, f, this.tmp);
        this.reactionForce.f2403x = this.tmp[0];
        this.reactionForce.f2404y = this.tmp[1];
        return this.reactionForce;
    }

    public float getReactionTorque(float f) {
        return jniGetReactionTorque(this.addr, f);
    }

    public boolean isActive() {
        return jniIsActive(this.addr);
    }
}
