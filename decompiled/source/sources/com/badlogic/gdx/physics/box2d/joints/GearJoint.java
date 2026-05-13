package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
/* loaded from: classes.dex */
public class GearJoint extends Joint {
    private native float jniGetRatio(long j);

    private native void jniSetRatio(long j, float f);

    public GearJoint(World world, long j) {
        super(world, j);
    }

    public void setRatio(float f) {
        jniSetRatio(this.addr, f);
    }

    public float getRatio() {
        return jniGetRatio(this.addr);
    }
}
