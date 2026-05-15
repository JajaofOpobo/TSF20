package com.censivn.C3DEngine.api.element;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class Number3d {
    public float x;
    public float y;
    public float z;
    public static float cardinal = 0.017453292f;
    private static Number3d _temp = new Number3d();
    public static Number3d TEMPNUMBER3D = new Number3d();
    public static Number3d TEMPNUMBER3D2 = new Number3d();
    public static Number3d TEMPNUMBER3D3 = new Number3d();
    public static Number3d TEMPNUMBER3D4 = new Number3d();

    public Number3d() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public Number3d(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public void setAll(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public void setAllFrom(Number3d number3d) {
        this.x = number3d.x;
        this.y = number3d.y;
        this.z = number3d.z;
    }

    public void normalize() {
        float fSqrt = (float) Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
        if (fSqrt != 0.0f && fSqrt != 1.0f) {
            float f = 1.0f / fSqrt;
            this.x *= f;
            this.y *= f;
            this.z = f * this.z;
        }
    }

    public void add(Number3d number3d) {
        this.x += number3d.x;
        this.y += number3d.y;
        this.z += number3d.z;
    }

    public void subtract(Number3d number3d) {
        this.x -= number3d.x;
        this.y -= number3d.y;
        this.z -= number3d.z;
    }

    public void multiply(Float f) {
        this.x *= f.floatValue();
        this.y *= f.floatValue();
        this.z *= f.floatValue();
    }

    public boolean compare(Number3d number3d) {
        return number3d.x == this.x && number3d.y == this.y && number3d.z == this.z;
    }

    public float length() {
        return (float) Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Number3d m4clone() {
        return new Number3d(this.x, this.y, this.z);
    }

    public void rotateDegressX(float f) {
        rotateX(cardinal * f);
    }

    public void rotateX(float f) {
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        _temp.setAll(this.x, this.y, this.z);
        this.y = (_temp.y * fCos) - (_temp.z * fSin);
        this.z = (fCos * _temp.z) + (fSin * _temp.y);
    }

    public void rotateDegressY(float f) {
        rotateY(cardinal * f);
    }

    public void rotateY(float f) {
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        _temp.setAll(this.x, this.y, this.z);
        this.x = (_temp.x * fCos) + (_temp.z * fSin);
        this.z = (fCos * _temp.z) + ((-fSin) * _temp.x);
    }

    public void rotateDegressZ(float f) {
        rotateZ(cardinal * f);
    }

    public void rotateZ(float f) {
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        _temp.setAll(this.x, this.y, this.z);
        this.x = (_temp.x * fCos) - (_temp.y * fSin);
        this.y = (fCos * _temp.y) + (fSin * _temp.x);
    }

    public void rotateAll(Number3d number3d) {
        if (number3d.y != 0.0f) {
            rotateY(number3d.y * cardinal);
        }
        if (number3d.x != 0.0f) {
            rotateX(number3d.x * cardinal);
        }
        if (number3d.z != 0.0f) {
            rotateZ(number3d.z * cardinal);
        }
    }

    public void rotateReverseAll(Number3d number3d) {
        rotateX((-number3d.x) * cardinal);
        rotateY((-number3d.y) * cardinal);
        rotateZ((-number3d.z) * cardinal);
    }

    public String toString() {
        return this.x + "," + this.y + "," + this.z;
    }

    public static Number3d add(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.x + number3d2.x, number3d.y + number3d2.y, number3d.z + number3d2.z);
    }

    public static Number3d subtract(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.x - number3d2.x, number3d.y - number3d2.y, number3d.z - number3d2.z);
    }

    public static Number3d multiply(Number3d number3d, Number3d number3d2) {
        return new Number3d(number3d.x * number3d2.x, number3d.y * number3d2.y, number3d.z * number3d2.z);
    }

    public static Number3d cross(Number3d number3d, Number3d number3d2) {
        return new Number3d((number3d2.y * number3d.z) - (number3d2.z * number3d.y), (number3d2.z * number3d.x) - (number3d2.x * number3d.z), (number3d2.x * number3d.y) - (number3d2.y * number3d.x));
    }

    public static float dot(Number3d number3d, Number3d number3d2) {
        return (number3d.x * number3d2.x) + (number3d.y * number3d2.y) + (number3d2.z * number3d.z);
    }

    public void reset() {
        this.z = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
    }
}
