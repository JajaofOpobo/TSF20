package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Manifold {
    long addr;
    final World world;
    final ManifoldPoint[] points = {new ManifoldPoint(), new ManifoldPoint()};
    final Vector2 localNormal = new Vector2();
    final Vector2 localPoint = new Vector2();
    final int[] tmpInt = new int[2];
    final float[] tmpFloat = new float[4];

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

    protected Manifold(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    public ManifoldType getType() {
        int iJniGetType = jniGetType(this.addr);
        return iJniGetType == 0 ? ManifoldType.Circle : iJniGetType == 1 ? ManifoldType.FaceA : iJniGetType == 2 ? ManifoldType.FaceB : ManifoldType.Circle;
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
        int iJniGetPointCount = jniGetPointCount(this.addr);
        for (int i = 0; i < iJniGetPointCount; i++) {
            int iJniGetPoint = jniGetPoint(this.addr, this.tmpFloat, i);
            ManifoldPoint manifoldPoint = this.points[i];
            manifoldPoint.contactID = iJniGetPoint;
            manifoldPoint.localPoint.set(this.tmpFloat[0], this.tmpFloat[1]);
            manifoldPoint.normalImpulse = this.tmpFloat[2];
            manifoldPoint.tangentImpulse = this.tmpFloat[3];
        }
        return this.points;
    }

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
