package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
/* loaded from: classes.dex */
public class Manifold {
    long addr;
    final World world;
    final ManifoldPoint[] points = {new ManifoldPoint(), new ManifoldPoint()};
    final Vector2 localNormal = new Vector2();
    final Vector2 localPoint = new Vector2();
    final int[] tmpInt = new int[2];
    final float[] tmpFloat = new float[4];

    /* loaded from: classes.dex */
    public enum ManifoldType {
        Circle,
        FaceA,
        FaceB
    }

    private native void jniGetLocalNormal(long j, float[] fArr);

    private native void jniGetLocalPoint(long j, float[] fArr);

    private native int jniGetPoint(long j, float[] fArr, int i);

    private native int jniGetPointCount(long j);

    private native int jniGetType(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public Manifold(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    public ManifoldType getType() {
        int jniGetType = jniGetType(this.addr);
        return jniGetType == 0 ? ManifoldType.Circle : jniGetType == 1 ? ManifoldType.FaceA : jniGetType == 2 ? ManifoldType.FaceB : ManifoldType.Circle;
    }

    public int getPointCount() {
        return jniGetPointCount(this.addr);
    }

    public Vector2 getLocalNormal() {
        jniGetLocalNormal(this.addr, this.tmpFloat);
        this.localNormal.set(this.tmpFloat[0], this.tmpFloat[1]);
        return this.localNormal;
    }

    public Vector2 getLocalPoint() {
        jniGetLocalPoint(this.addr, this.tmpFloat);
        this.localPoint.set(this.tmpFloat[0], this.tmpFloat[1]);
        return this.localPoint;
    }

    public ManifoldPoint[] getPoints() {
        int jniGetPointCount = jniGetPointCount(this.addr);
        for (int i = 0; i < jniGetPointCount; i++) {
            int jniGetPoint = jniGetPoint(this.addr, this.tmpFloat, i);
            ManifoldPoint manifoldPoint = this.points[i];
            manifoldPoint.contactID = jniGetPoint;
            manifoldPoint.localPoint.set(this.tmpFloat[0], this.tmpFloat[1]);
            manifoldPoint.normalImpulse = this.tmpFloat[2];
            manifoldPoint.tangentImpulse = this.tmpFloat[3];
        }
        return this.points;
    }

    /* loaded from: classes.dex */
    public class ManifoldPoint {
        public float normalImpulse;
        public float tangentImpulse;
        public final Vector2 localPoint = new Vector2();
        public int contactID = 0;

        public ManifoldPoint() {
        }

        public String toString() {
            return "id: " + this.contactID + ", " + this.localPoint + ", " + this.normalImpulse + ", " + this.tangentImpulse;
        }
    }
}
