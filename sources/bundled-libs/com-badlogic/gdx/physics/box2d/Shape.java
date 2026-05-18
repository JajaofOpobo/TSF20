package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class Shape {
    protected long addr;

    public enum Type {
        Circle,
        Polygon
    }

    private native void jniDispose(long j);

    private native float jniGetRadius(long j);

    protected static native int jniGetType(long j);

    private native void jniSetRadius(long j, float f);

    public abstract Type getType();

    public float getRadius() {
        return jniGetRadius(this.addr);
    }

    public void setRadius(float f) {
        jniSetRadius(this.addr, f);
    }

    public void dispose() {
        jniDispose(this.addr);
    }
}
