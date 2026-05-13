package com.badlogic.gdx.math;
/* loaded from: classes.dex */
public final class Vector2 {
    private static final Vector2 tmp = new Vector2();

    /* renamed from: x */
    public float f2403x;

    /* renamed from: y */
    public float f2404y;

    public Vector2() {
    }

    public Vector2(float f, float f2) {
        this.f2403x = f;
        this.f2404y = f2;
    }

    public Vector2(Vector2 vector2) {
        set(vector2);
    }

    public Vector2 cpy() {
        return new Vector2(this);
    }

    public float len() {
        return (float) Math.sqrt((this.f2403x * this.f2403x) + (this.f2404y * this.f2404y));
    }

    public float len2() {
        return (this.f2403x * this.f2403x) + (this.f2404y * this.f2404y);
    }

    public Vector2 set(Vector2 vector2) {
        this.f2403x = vector2.f2403x;
        this.f2404y = vector2.f2404y;
        return this;
    }

    public Vector2 set(float f, float f2) {
        this.f2403x = f;
        this.f2404y = f2;
        return this;
    }

    public Vector2 sub(Vector2 vector2) {
        this.f2403x -= vector2.f2403x;
        this.f2404y -= vector2.f2404y;
        return this;
    }

    public Vector2 nor() {
        float len = len();
        if (len != 0.0f) {
            this.f2403x /= len;
            this.f2404y /= len;
        }
        return this;
    }

    public Vector2 add(Vector2 vector2) {
        this.f2403x += vector2.f2403x;
        this.f2404y += vector2.f2404y;
        return this;
    }

    public Vector2 add(float f, float f2) {
        this.f2403x += f;
        this.f2404y += f2;
        return this;
    }

    public float dot(Vector2 vector2) {
        return (this.f2403x * vector2.f2403x) + (this.f2404y * vector2.f2404y);
    }

    public Vector2 mul(float f) {
        this.f2403x *= f;
        this.f2404y *= f;
        return this;
    }

    public float dst(Vector2 vector2) {
        float f = vector2.f2403x - this.f2403x;
        float f2 = vector2.f2404y - this.f2404y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float dst(float f, float f2) {
        float f3 = f - this.f2403x;
        float f4 = f2 - this.f2404y;
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }

    public float dst2(Vector2 vector2) {
        float f = vector2.f2403x - this.f2403x;
        float f2 = vector2.f2404y - this.f2404y;
        return (f * f) + (f2 * f2);
    }

    public String toString() {
        return "[" + this.f2403x + ":" + this.f2404y + "]";
    }

    public Vector2 sub(float f, float f2) {
        this.f2403x -= f;
        this.f2404y -= f2;
        return this;
    }

    public Vector2 tmp() {
        return tmp.set(this);
    }

    public float cross(Vector2 vector2) {
        return (this.f2403x * vector2.f2404y) - (vector2.f2403x * this.f2404y);
    }

    public float lenManhattan() {
        return Math.abs(this.f2403x) + Math.abs(this.f2404y);
    }
}
