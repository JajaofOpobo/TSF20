package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
/* loaded from: classes.dex */
public class Contact {
    protected long addr;
    protected World world;
    protected final WorldManifold worldManifold = new WorldManifold();
    private final float[] tmp = new float[6];

    private native long jniGetFixtureA(long j);

    private native long jniGetFixtureB(long j);

    private native int jniGetWorldManifold(long j, float[] fArr);

    private native boolean jniIsEnabled(long j);

    private native boolean jniIsTouching(long j);

    private native void jniSetEnabled(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public Contact(World world, long j) {
        this.addr = j;
        this.world = world;
    }

    public WorldManifold getWorldManifold() {
        int jniGetWorldManifold = jniGetWorldManifold(this.addr, this.tmp);
        this.worldManifold.numContactPoints = jniGetWorldManifold;
        this.worldManifold.normal.set(this.tmp[0], this.tmp[1]);
        for (int i = 0; i < jniGetWorldManifold; i++) {
            Vector2 vector2 = this.worldManifold.points[i];
            vector2.f2403x = this.tmp[(i * 2) + 2];
            vector2.f2404y = this.tmp[(i * 2) + 2 + 1];
        }
        return this.worldManifold;
    }

    public boolean isTouching() {
        return jniIsTouching(this.addr);
    }

    public void setEnabled(boolean z) {
        jniSetEnabled(this.addr, z);
    }

    public boolean isEnabled() {
        return jniIsEnabled(this.addr);
    }

    public Fixture getFixtureA() {
        return this.world.fixtures.get(jniGetFixtureA(this.addr));
    }

    public Fixture getFixtureB() {
        return this.world.fixtures.get(jniGetFixtureB(this.addr));
    }
}
