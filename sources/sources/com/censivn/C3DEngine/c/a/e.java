package com.censivn.C3DEngine.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PointBufferManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e {
    protected float a;
    protected float b;
    protected float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private PointBufferManager h;
    private com.censivn.C3DEngine.c.a.a.b i;

    public void a(int i, PointBufferManager pointBufferManager) {
        this.g = i;
        this.h = pointBufferManager;
        Number3d asNumber3dPX = pointBufferManager.getAsNumber3dPX(i);
        this.a = asNumber3dPX.x;
        this.b = asNumber3dPX.y;
        this.c = asNumber3dPX.z;
    }

    public void a(float f, float f2, float f3) {
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public void b(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public float a() {
        return this.h.pxX(this.g);
    }

    public float b() {
        return this.h.pxY(this.g);
    }

    public float c() {
        return this.h.pxZ(this.g);
    }

    public void a(float f) {
        this.h.pxX(this.g, f);
    }

    public void b(float f) {
        this.h.pxY(this.g, f);
    }

    public void c(float f) {
        this.h.pxZ(this.g, f);
    }

    public float a(int i) {
        switch (i) {
            case 1:
                return a();
            case 2:
                return b();
            case 3:
            default:
                return 0.0f;
            case 4:
                return c();
        }
    }

    public void a(int i, float f) {
        switch (i) {
            case 1:
                a(f);
                break;
            case 2:
                b(f);
                break;
            case 4:
                c(f);
                break;
        }
    }

    public float b(int i) {
        switch (i) {
            case 1:
                return this.d;
            case 2:
                return this.e;
            case 3:
            default:
                return -1.0f;
            case 4:
                return this.f;
        }
    }

    public void d() {
        a(this.a);
        b(this.b);
        c(this.c);
    }

    public void e() {
        this.a = a();
        this.b = b();
        this.c = c();
    }

    public void a(com.censivn.C3DEngine.c.a.a.b bVar) {
        this.i = bVar;
    }

    public com.censivn.C3DEngine.c.a.a.b f() {
        return this.i;
    }
}
