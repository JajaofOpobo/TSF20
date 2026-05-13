package com.censivn.C3DEngine.api.element;
/* loaded from: classes.dex */
public class Number3d {

    /* renamed from: x */
    public float f2526x;

    /* renamed from: y */
    public float f2527y;

    /* renamed from: z */
    public float f2528z;
    public static float cardinal = 0.017453292f;
    private static Number3d _temp = new Number3d();
    public static Number3d TEMPNUMBER3D = new Number3d();
    public static Number3d TEMPNUMBER3D2 = new Number3d();
    public static Number3d TEMPNUMBER3D3 = new Number3d();
    public static Number3d TEMPNUMBER3D4 = new Number3d();

    public Number3d() {
        this.f2526x = 0.0f;
        this.f2527y = 0.0f;
        this.f2528z = 0.0f;
    }

    public Number3d(float f, float f2, float f3) {
        this.f2526x = f;
        this.f2527y = f2;
        this.f2528z = f3;
    }

    public void setAll(float f, float f2, float f3) {
        this.f2526x = f;
        this.f2527y = f2;
        this.f2528z = f3;
    }

    public void setAllFrom(Number3d number3d) {
        this.f2526x = number3d.f2526x;
        this.f2527y = number3d.f2527y;
        this.f2528z = number3d.f2528z;
    }

    public void normalize() {
        float sqrt = (float) Math.sqrt((this.f2526x * this.f2526x) + (this.f2527y * this.f2527y) + (this.f2528z * this.f2528z));
        if (sqrt != 0.0f && sqrt != 1.0f) {
            float f = 1.0f / sqrt;
            this.f2526x *= f;
            this.f2527y *= f;
            this.f2528z = f * this.f2528z;
        }
    }

    public void add(Number3d number3d) {
        this.f2526x += number3d.f2526x;
        this.f2527y += number3d.f2527y;
        this.f2528z += number3d.f2528z;
    }

    public void subtract(Number3d number3d) {
        this.f2526x -= number3d.f2526x;
        this.f2527y -= number3d.f2527y;
        this.f2528z -= number3d.f2528z;
    }

    public void multiply(Float f) {
        this.f2526x *= f.floatValue();
        this.f2527y *= f.floatValue();
        this.f2528z *= f.floatValue();
    }

    public boolean compare(Number3d number3d) {
        return number3d.f2526x == this.f2526x && number3d.f2527y == this.f2527y && number3d.f2528z == this.f2528z;
    }

    public float length() {
        return (float) Math.sqrt((this.f2526x * this.f2526x) + (this.f2527y * this.f2527y) + (this.f2528z * this.f2528z));
    }

    /* renamed from: clone */
    public Number3d m13946clone() {
        return new Number3d(this.f2526x, this.f2527y, this.f2528z);
    }

    public void rotateDegressX(float f) {
        rotateX(cardinal * f);
    }

    public void rotateX(float f) {
        float cos = (float) Math.cos(f);
        float sin = (float) Math.sin(f);
        _temp.setAll(this.f2526x, this.f2527y, this.f2528z);
        this.f2527y = (_temp.f2527y * cos) - (_temp.f2528z * sin);
        this.f2528z = (cos * _temp.f2528z) + (sin * _temp.f2527y);
    }

    public void rotateDegressY(float f) {
        rotateY(cardinal * f);
    }

    public void rotateY(float f) {
        float cos = (float) Math.cos(f);
        float sin = (float) Math.sin(f);
        _temp.setAll(this.f2526x, this.f2527y, this.f2528z);
        this.f2526x = (_temp.f2526x * cos) + (_temp.f2528z * sin);
        this.f2528z = (cos * _temp.f2528z) + ((-sin) * _temp.f2526x);
    }

    public void rotateDegressZ(float f) {
        rotateZ(cardinal * f);
    }

    public void rotateZ(float f) {
        float cos = (float) Math.cos(f);
        float sin = (float) Math.sin(f);
        _temp.setAll(this.f2526x, this.f2527y, this.f2528z);
        this.f2526x = (_temp.f2526x * cos) - (_temp.f2527y * sin);
        this.f2527y = (cos * _temp.f2527y) + (sin * _temp.f2526x);
    }

    public void rotateAll(Number3d number3d) {
        if (number3d.f2527y != 0.0f) {
            rotateY(number3d.f2527y * cardinal);
        }
        if (number3d.f2526x != 0.0f) {
            rotateX(number3d.f2526x * cardinal);
        }
        if (number3d.f2528z != 0.0f) {
            rotateZ(number3d.f2528z * cardinal);
        }
    }

    public void rotateReverseAll(Number3d number3d) {
        rotateX((-number3d.f2526x) * cardinal);
        rotateY((-number3d.f2527y) * cardinal);
        rotateZ((-number3d.f2528z) * cardinal);
    }

    public String toString() {
        return this.f2526x + "," + this.f2527y + "," + this.f2528z;
    }

    public static Number3d add(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.f2526x + number3d2.f2526x, number3d.f2527y + number3d2.f2527y, number3d.f2528z + number3d2.f2528z);
    }

    public static Number3d subtract(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.f2526x - number3d2.f2526x, number3d.f2527y - number3d2.f2527y, number3d.f2528z - number3d2.f2528z);
    }

    public static Number3d multiply(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.f2526x * number3d2.f2526x, number3d.f2527y * number3d2.f2527y, number3d.f2528z * number3d2.f2528z);
    }

    public static Number3d cross(Number3d number3d, Number3d number3d2) {
        return new Number3d((number3d2.f2527y * number3d.f2528z) - (number3d2.f2528z * number3d.f2527y), (number3d2.f2528z * number3d.f2526x) - (number3d2.f2526x * number3d.f2528z), (number3d2.f2526x * number3d.f2527y) - (number3d2.f2527y * number3d.f2526x));
    }

    public static float dot(Number3d number3d, Number3d number3d2) {
        return (number3d.f2526x * number3d2.f2526x) + (number3d.f2527y * number3d2.f2527y) + (number3d2.f2528z * number3d.f2528z);
    }

    public void reset() {
        this.f2528z = 0.0f;
        this.f2527y = 0.0f;
        this.f2526x = 0.0f;
    }
}
