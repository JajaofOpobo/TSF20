package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Shape;
/* loaded from: classes.dex */
public class Fixture {
    protected final long addr;
    private final Body body;
    protected Shape shape;
    protected Object userData;
    private final short[] tmp = new short[3];
    private final Filter filter = new Filter();

    private native float jniGetDensity(long j);

    private native void jniGetFilterData(long j, short[] sArr);

    private native float jniGetFriction(long j);

    private native float jniGetRestitution(long j);

    private native long jniGetShape(long j);

    private native int jniGetType(long j);

    private native boolean jniIsSensor(long j);

    private native void jniSetDensity(long j, float f);

    private native void jniSetFilterData(long j, short s, short s2, short s3);

    private native void jniSetFriction(long j, float f);

    private native void jniSetRestitution(long j, float f);

    private native void jniSetSensor(long j, boolean z);

    private native boolean jniTestPoint(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    public Fixture(Body body, long j) {
        this.body = body;
        this.addr = j;
    }

    public Shape.Type getType() {
        return jniGetType(this.addr) == 0 ? Shape.Type.Circle : Shape.Type.Polygon;
    }

    public Shape getShape() {
        if (this.shape == null) {
            long jniGetShape = jniGetShape(this.addr);
            if (Shape.jniGetType(jniGetShape) == 0) {
                this.shape = new CircleShape(jniGetShape);
            } else {
                this.shape = new PolygonShape(jniGetShape);
            }
        }
        return this.shape;
    }

    public void setSensor(boolean z) {
        jniSetSensor(this.addr, z);
    }

    public boolean isSensor() {
        return jniIsSensor(this.addr);
    }

    public void setFilterData(Filter filter) {
        jniSetFilterData(this.addr, filter.categoryBits, filter.maskBits, filter.groupIndex);
    }

    public Filter getFilterData() {
        jniGetFilterData(this.addr, this.tmp);
        this.filter.maskBits = this.tmp[0];
        this.filter.categoryBits = this.tmp[1];
        this.filter.groupIndex = this.tmp[2];
        return this.filter;
    }

    public Body getBody() {
        return this.body;
    }

    public boolean testPoint(Vector2 vector2) {
        return jniTestPoint(this.addr, vector2.f2403x, vector2.f2404y);
    }

    public boolean testPoint(float f, float f2) {
        return jniTestPoint(this.addr, f, f2);
    }

    public void setDensity(float f) {
        jniSetDensity(this.addr, f);
    }

    public float getDensity() {
        return jniGetDensity(this.addr);
    }

    public float getFriction() {
        return jniGetFriction(this.addr);
    }

    public void setFriction(float f) {
        jniSetFriction(this.addr, f);
    }

    public float getRestitution() {
        return jniGetRestitution(this.addr);
    }

    public void setRestitution(float f) {
        jniSetRestitution(this.addr, f);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public Object getUserData() {
        return this.userData;
    }
}
