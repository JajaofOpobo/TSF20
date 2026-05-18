package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Transform {
    public static final int COL1_X = 2;
    public static final int COL1_Y = 3;
    public static final int COL2_X = 4;
    public static final int COL2_Y = 5;
    public static final int POS_X = 0;
    public static final int POS_Y = 1;
    private Vector2 position;
    public float[] vals;

    public Transform() {
        this.vals = new float[6];
        this.position = new Vector2();
    }

    public Transform(Vector2 vector2, float f) {
        this.vals = new float[6];
        this.position = new Vector2();
        setPosition(vector2);
        setRotation(f);
    }

    public Vector2 mul(Vector2 vector2) {
        float f = this.vals[0] + (this.vals[2] * vector2.x) + (this.vals[4] * vector2.y);
        float f2 = this.vals[1] + (this.vals[3] * vector2.x) + (this.vals[5] * vector2.y);
        vector2.x = f;
        vector2.y = f2;
        return vector2;
    }

    public Vector2 getPosition() {
        return this.position.set(this.vals[0], this.vals[1]);
    }

    public void setRotation(float f) {
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        this.vals[2] = fCos;
        this.vals[4] = -fSin;
        this.vals[3] = fSin;
        this.vals[5] = fCos;
    }

    public void setPosition(Vector2 vector2) {
        this.vals[0] = vector2.x;
        this.vals[1] = vector2.y;
    }
}
