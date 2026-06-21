package com.censivn.C3DEngine.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;

/* loaded from: classes.dex */
public final class e {
    protected float a;
    protected float b;
    protected float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private PointBufferManager h;
    private com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint i;

    public final void a(int i, PointBufferManager pointBufferManager) {
        this.g = i;
        this.h = pointBufferManager;
        Number3d asNumber3dPX = pointBufferManager.getAsNumber3dPX(i);
        this.a = asNumber3dPX.x;
        this.b = asNumber3dPX.y;
        this.c = asNumber3dPX.z;
    }

    public final void a(float f, float f2, float f3) {
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final void b(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.h.pxX(this.g);
    }

    public final float b() {
        return this.h.pxY(this.g);
    }

    public final float c() {
        return this.h.pxZ(this.g);
    }

    public final void a(float f) {
        this.h.pxX(this.g, f);
    }

    public final void b(float f) {
        this.h.pxY(this.g, f);
    }

    public final void c(float f) {
        this.h.pxZ(this.g, f);
    }

    public final void d() {
        a(this.a);
        b(this.b);
        c(this.c);
    }

    public final void e() {
        this.a = a();
        this.b = b();
        this.c = c();
    }

    public final void a(com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar) {
        this.i = bVar;
    }

    public final com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint f() {
        return this.i;
    }
}
