package com.censivn.C3DEngine.api.effects.core;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class Vector3 {
    public static Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);
    public float x;
    public float y;
    public float z;

    public Vector3(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Vector3 m0clone() {
        return new Vector3(this.x, this.y, this.z);
    }

    public Boolean equals(Vector3 vector3) {
        return Boolean.valueOf(this.x == vector3.x && this.y == vector3.y && this.z == vector3.z);
    }

    public void zero() {
        this.z = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
    }

    public Vector3 negate() {
        return new Vector3(-this.x, -this.y, -this.z);
    }

    public Vector3 add(Vector3 vector3) {
        return new Vector3(this.x + vector3.x, this.y + vector3.y, this.z + vector3.z);
    }

    public Vector3 subtract(Vector3 vector3) {
        return new Vector3(this.x - vector3.x, this.y - vector3.y, this.z - vector3.z);
    }

    public Vector3 multiplyScalar(float f) {
        return new Vector3(this.x * f, this.y * f, this.z * f);
    }

    public Vector3 multiply(Vector3 vector3) {
        return new Vector3(this.x * vector3.x, this.y * vector3.y, this.z * vector3.z);
    }

    public Vector3 divide(float f) {
        float f2 = 1.0f / f;
        return new Vector3(this.x * f2, this.y * f2, f2 * this.z);
    }

    public void normalize() {
        float f = (this.x * this.x) + (this.y * this.y) + (this.z * this.z);
        if (f > 0.0f) {
            float fSqrt = (float) (1.0d / Math.sqrt(f));
            this.x *= fSqrt;
            this.y *= fSqrt;
            this.z = fSqrt * this.z;
        }
    }

    public float getMagnitude() {
        return (float) Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public void setMagnitude(float f) {
        normalize();
        this.x *= f;
        this.y *= f;
        this.z *= f;
    }

    public String toString() {
        return "[" + this.x + " , " + this.y + " , " + this.z + "]";
    }

    public static Vector3 sum(Vector3 vector3, Vector3 vector32) {
        return vector3.add(vector32);
    }

    public static float dot(Vector3 vector3, Vector3 vector32) {
        return (vector3.x * vector32.x) + (vector3.y * vector32.y) + (vector3.z * vector32.z);
    }

    public static Vector3 cross(Vector3 vector3, Vector3 vector32) {
        return new Vector3((vector3.y * vector32.z) - (vector3.z * vector32.y), (vector3.z * vector32.x) - (vector3.x * vector32.z), (vector3.x * vector32.y) - (vector3.y * vector32.x));
    }

    public static float distance(Vector3 vector3, Vector3 vector32) {
        float f = vector3.x - vector32.x;
        float f2 = vector3.y - vector32.y;
        float f3 = vector3.z - vector32.z;
        return (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }
}
