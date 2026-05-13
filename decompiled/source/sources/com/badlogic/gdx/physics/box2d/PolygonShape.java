package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Shape;
/* loaded from: classes.dex */
public class PolygonShape extends Shape {
    private static float[] verts = new float[2];

    private native void jniGetVertex(long j, int i, float[] fArr);

    private native int jniGetVertexCount(long j);

    private native void jniSet(long j, float[] fArr);

    private native void jniSetAsBox(long j, float f, float f2);

    private native void jniSetAsBox(long j, float f, float f2, float f3, float f4, float f5);

    private native void jniSetAsEdge(long j, float f, float f2, float f3, float f4);

    private native long newPolygonShape();

    public PolygonShape() {
        this.addr = newPolygonShape();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PolygonShape(long j) {
        this.addr = j;
    }

    @Override // com.badlogic.gdx.physics.box2d.Shape
    public Shape.Type getType() {
        return Shape.Type.Polygon;
    }

    public void set(Vector2[] vector2Arr) {
        int i = 0;
        float[] fArr = new float[vector2Arr.length * 2];
        int i2 = 0;
        while (i2 < vector2Arr.length * 2) {
            fArr[i2] = vector2Arr[i].x;
            fArr[i2 + 1] = vector2Arr[i].y;
            i2 += 2;
            i++;
        }
        jniSet(this.addr, fArr);
    }

    public void setAsBox(float f, float f2) {
        jniSetAsBox(this.addr, f, f2);
    }

    public void setAsBox(float f, float f2, Vector2 vector2, float f3) {
        jniSetAsBox(this.addr, f, f2, vector2.x, vector2.y, f3);
    }

    public void setAsEdge(Vector2 vector2, Vector2 vector22) {
        jniSetAsEdge(this.addr, vector2.x, vector2.y, vector22.x, vector22.y);
    }

    public int getVertexCount() {
        return jniGetVertexCount(this.addr);
    }

    public void getVertex(int i, Vector2 vector2) {
        jniGetVertex(this.addr, i, verts);
        vector2.x = verts[0];
        vector2.y = verts[1];
    }
}
