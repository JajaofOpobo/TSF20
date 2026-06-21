package com.badlogic.gdx.physics.box2d;

/* loaded from: classes.dex */
public abstract class Shape {
    protected long addr;

    public enum Type {
        Circle,
        Polygon;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] valuesCustom = values();
            int length = valuesCustom.length;
            Type[] typeArr = new Type[length];
            System.arraycopy(valuesCustom, 0, typeArr, 0, length);
            return typeArr;
        }
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
