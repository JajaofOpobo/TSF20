package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
/* loaded from: classes.dex */
public class FrictionJoint extends Joint {
    private native float jniGetMaxForce(long j);

    private native float jniGetMaxTorque(long j);

    private native void jniSetMaxForce(long j, float f);

    private native void jniSetMaxTorque(long j, float f);

    public FrictionJoint(World world, long j) {
        super(world, j);
    }

    public void setMaxForce(float f) {
        jniSetMaxForce(this.addr, f);
    }

    public float getMaxForce() {
        return jniGetMaxForce(this.addr);
    }

    public void setMaxTorque(float f) {
        jniSetMaxTorque(this.addr, f);
    }

    public float getMaxTorque() {
        return jniGetMaxTorque(this.addr);
    }
}
