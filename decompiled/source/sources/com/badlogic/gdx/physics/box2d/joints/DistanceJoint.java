package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
/* loaded from: classes.dex */
public class DistanceJoint extends Joint {
    private native float jniGetDampingRatio(long j);

    private native float jniGetFrequency(long j);

    private native float jniGetLength(long j);

    private native void jniSetDampingRatio(long j, float f);

    private native void jniSetFrequency(long j, float f);

    private native void jniSetLength(long j, float f);

    public DistanceJoint(World world, long j) {
        super(world, j);
    }

    public void setLength(float f) {
        jniSetLength(this.addr, f);
    }

    public float getLength() {
        return jniGetLength(this.addr);
    }

    public void setFrequency(float f) {
        jniSetFrequency(this.addr, f);
    }

    public float getFrequency() {
        return jniGetFrequency(this.addr);
    }

    public void setDampingRatio(float f) {
        jniSetDampingRatio(this.addr, f);
    }

    public float getDampingRatio() {
        return jniGetDampingRatio(this.addr);
    }
}
