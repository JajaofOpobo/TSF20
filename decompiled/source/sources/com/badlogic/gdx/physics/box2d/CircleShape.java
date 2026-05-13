package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Shape;
/* loaded from: classes.dex */
public class CircleShape extends Shape {
    private final Vector2 position;
    private final float[] tmp;

    private native void jniGetPosition(long j, float[] fArr);

    private native void jniSetPosition(long j, float f, float f2);

    private native long newCircleShape();

    public CircleShape() {
        this.tmp = new float[2];
        this.position = new Vector2();
        this.addr = newCircleShape();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CircleShape(long j) {
        this.tmp = new float[2];
        this.position = new Vector2();
        this.addr = j;
    }

    @Override // com.badlogic.gdx.physics.box2d.Shape
    public Shape.Type getType() {
        return Shape.Type.Circle;
    }

    public Vector2 getPosition() {
        jniGetPosition(this.addr, this.tmp);
        this.position.x = this.tmp[0];
        this.position.y = this.tmp[1];
        return this.position;
    }

    public void setPosition(Vector2 vector2) {
        jniSetPosition(this.addr, vector2.x, vector2.y);
    }
}
