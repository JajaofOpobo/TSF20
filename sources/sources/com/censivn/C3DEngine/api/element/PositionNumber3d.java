package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.b.b.ScreenConstants;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PositionNumber3d extends Number3d {
    public PositionNumber3d() {
    }

    public PositionNumber3d(float f, float f2, float f3) {
        super(f, f2, f3);
    }

    public void spAll(float f, float f2, float f3) {
        this.x = A.a * f;
        this.y = A.a * f2;
        this.z = A.a * f3;
    }

    public float spX() {
        return this.x / A.a;
    }

    public void spX(float f) {
        this.x = A.a * f;
    }

    public float spY() {
        return this.y / A.a;
    }

    public void spY(float f) {
        this.y = A.a * f;
    }

    public float spZ() {
        return this.z / A.a;
    }

    public void spZ(float f) {
        this.z = A.a * f;
    }

    public float pxX() {
        return this.x;
    }

    public void pxX(float f) {
        this.x = f;
    }

    public float pxY() {
        return this.y;
    }

    public void pxY(float f) {
        this.y = f;
    }

    public float pxZ() {
        return this.z;
    }

    public void pxZ(float f) {
        this.z = f;
    }
}
