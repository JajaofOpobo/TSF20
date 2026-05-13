package com.censivn.C3DEngine.api.element;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
/* loaded from: classes.dex */
public class PositionNumber3d extends Number3d {
    public PositionNumber3d() {
    }

    public PositionNumber3d(float f, float f2, float f3) {
        super(f, f2, f3);
    }

    public void spAll(float f, float f2, float f3) {
        this.f2526x = C0892a.f2565a * f;
        this.f2527y = C0892a.f2565a * f2;
        this.f2528z = C0892a.f2565a * f3;
    }

    public float spX() {
        return this.f2526x / C0892a.f2565a;
    }

    public void spX(float f) {
        this.f2526x = C0892a.f2565a * f;
    }

    public float spY() {
        return this.f2527y / C0892a.f2565a;
    }

    public void spY(float f) {
        this.f2527y = C0892a.f2565a * f;
    }

    public float spZ() {
        return this.f2528z / C0892a.f2565a;
    }

    public void spZ(float f) {
        this.f2528z = C0892a.f2565a * f;
    }

    public float pxX() {
        return this.f2526x;
    }

    public void pxX(float f) {
        this.f2526x = f;
    }

    public float pxY() {
        return this.f2527y;
    }

    public void pxY(float f) {
        this.f2527y = f;
    }

    public float pxZ() {
        return this.f2528z;
    }

    public void pxZ(float f) {
        this.f2528z = f;
    }
}
