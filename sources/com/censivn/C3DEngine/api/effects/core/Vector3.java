package com.censivn.C3DEngine.api.effects.core;
/* loaded from: classes.dex */
public final class Vector3 {
    public static Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);

    /* renamed from: x */
    public float f2519x;

    /* renamed from: y */
    public float f2520y;

    /* renamed from: z */
    public float f2521z;

    public Vector3(float f, float f2, float f3) {
        this.f2519x = f;
        this.f2520y = f2;
        this.f2521z = f3;
    }

    /* renamed from: clone */
    public Vector3 m13942clone() {
        return new Vector3(this.f2519x, this.f2520y, this.f2521z);
    }

    public Boolean equals(Vector3 vector3) {
        return Boolean.valueOf(this.f2519x == vector3.f2519x && this.f2520y == vector3.f2520y && this.f2521z == vector3.f2521z);
    }

    public void zero() {
        this.f2521z = 0.0f;
        this.f2520y = 0.0f;
        this.f2519x = 0.0f;
    }

    public Vector3 negate() {
        return new Vector3(-this.f2519x, -this.f2520y, -this.f2521z);
    }

    public Vector3 add(Vector3 vector3) {
        return new Vector3(this.f2519x + vector3.f2519x, this.f2520y + vector3.f2520y, this.f2521z + vector3.f2521z);
    }

    public Vector3 subtract(Vector3 vector3) {
        return new Vector3(this.f2519x - vector3.f2519x, this.f2520y - vector3.f2520y, this.f2521z - vector3.f2521z);
    }

    public Vector3 multiplyScalar(float f) {
        return new Vector3(this.f2519x * f, this.f2520y * f, this.f2521z * f);
    }

    public Vector3 multiply(Vector3 vector3) {
        return new Vector3(this.f2519x * vector3.f2519x, this.f2520y * vector3.f2520y, this.f2521z * vector3.f2521z);
    }

    public Vector3 divide(float f) {
        float f2 = 1.0f / f;
        return new Vector3(this.f2519x * f2, this.f2520y * f2, f2 * this.f2521z);
    }

    public void normalize() {
        float f = (this.f2519x * this.f2519x) + (this.f2520y * this.f2520y) + (this.f2521z * this.f2521z);
        if (f > 0.0f) {
            float sqrt = (float) (1.0d / Math.sqrt(f));
            this.f2519x *= sqrt;
            this.f2520y *= sqrt;
            this.f2521z = sqrt * this.f2521z;
        }
    }

    public float getMagnitude() {
        return (float) Math.sqrt((this.f2519x * this.f2519x) + (this.f2520y * this.f2520y) + (this.f2521z * this.f2521z));
    }

    public void setMagnitude(float f) {
        normalize();
        this.f2519x *= f;
        this.f2520y *= f;
        this.f2521z *= f;
    }

    public String toString() {
        return "[" + this.f2519x + " , " + this.f2520y + " , " + this.f2521z + "]";
    }

    public static Vector3 sum(Vector3 vector3, Vector3 vector32) {
        return vector3.add(vector32);
    }

    public static float dot(Vector3 vector3, Vector3 vector32) {
        return (vector3.f2519x * vector32.f2519x) + (vector3.f2520y * vector32.f2520y) + (vector3.f2521z * vector32.f2521z);
    }

    public static Vector3 cross(Vector3 vector3, Vector3 vector32) {
        return new Vector3((vector3.f2520y * vector32.f2521z) - (vector3.f2521z * vector32.f2520y), (vector3.f2521z * vector32.f2519x) - (vector3.f2519x * vector32.f2521z), (vector3.f2519x * vector32.f2520y) - (vector3.f2520y * vector32.f2519x));
    }

    public static float distance(Vector3 vector3, Vector3 vector32) {
        float f = vector3.f2519x - vector32.f2519x;
        float f2 = vector3.f2520y - vector32.f2520y;
        float f3 = vector3.f2521z - vector32.f2521z;
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }
}
