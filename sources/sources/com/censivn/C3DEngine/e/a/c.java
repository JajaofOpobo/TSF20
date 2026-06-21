package com.censivn.C3DEngine.e.AbstractModelParser;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.b.l;

/* loaded from: classes.dex */
public final class c implements com.censivn.C3DEngine.g.b.a {
    public float A;
    public float B;
    public Number3d D;
    public Number3d E;
    public Number3d F;
    public Number3d G;
    public int H;
    private a I;
    private VButtonItem J;
    private com.censivn.C3DEngine.g.a.c K;
    private float L;
    private float M;
    public int a;
    public int b;
    public int c;
    public int d;
    public l l;
    public float y;
    public float z;
    public int e = 1;
    public int f = 1;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public PositionNumber3d m = new PositionNumber3d();
    public Number3d n = new Number3d();
    public Number3d o = new Number3d(1.0f, 1.0f, 1.0f);
    public Number3d p = new Number3d();
    public Number3d q = new Number3d();
    public Number3d r = new Number3d();
    public Number3d s = new Number3d();
    public Number3d t = new Number3d();
    public Number3d u = new Number3d();
    public Number3d v = new Number3d();
    public Number3d w = new Number3d();
    private float N = 0.0f;
    private float O = 0.0f;
    public boolean x = false;
    public Number3d C = new Number3d(1.0f, 1.0f, 1.0f);

    public c(a aVar) {
        this.I = aVar;
    }

    public final VButtonItem a() {
        if (this.J == null) {
            this.J = new VButtonItem(this);
        }
        return this.J;
    }

    public final void a(float f, float f2, float f3) {
        this.y = 0.0f;
        this.z = f;
        this.A = f2;
        this.B = f3;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.L = this.I.A * i3;
        this.M = this.I.A * i4;
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.L = this.I.A * i3 * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
        this.M = this.I.A * i4 * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void a(int i, int i2, int i3) {
        this.g = 0;
        this.h = i;
        this.e = i2;
        this.f = i3;
        this.L = this.I.A * i2 * com.censivn.C3DEngine.a.GestureDetector;
        this.M = this.I.A * i3 * com.censivn.C3DEngine.a.GestureDetector;
    }

    public final void a(float f, float f2) {
        this.g = 0;
        this.h = 0;
        this.e = 1;
        this.f = 1;
        this.L = f;
        this.M = f2;
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.L = i5;
        this.M = i6;
    }

    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.L = i5 * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
        this.M = i6 * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void a(int i, int i2) {
        this.g = i;
        this.h = i2;
        d();
    }

    public final void b(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.L = this.I.A * i;
        this.M = this.I.A * i2;
    }

    public final void c(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.L = this.I.A * i * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
        this.M = this.I.A * i2 * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void b() {
        this.e = 1;
        this.f = 1;
        this.L = this.I.A * 1 * com.censivn.C3DEngine.a.GestureDetector;
        this.M = this.I.A * 1 * com.censivn.C3DEngine.a.GestureDetector;
    }

    public final void d(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.I.a(this);
    }

    public final void c() {
        this.I.b(this);
    }

    public final void d() {
        this.I.a(this);
    }

    public final void e() {
        c();
        d();
    }

    public final void a(Boolean bool) {
        if (bool.booleanValue() != this.k) {
            this.k = bool.booleanValue();
            this.I.b(this);
        }
    }

    public final void a(float f) {
        this.L = f;
    }

    public final void b(float f) {
        this.L = com.censivn.C3DEngine.a.GLSurfaceViewWrapper * f;
    }

    public final float f() {
        return this.L;
    }

    public final float g() {
        return this.L / com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void c(float f) {
        this.M = f;
    }

    public final void d(float f) {
        this.M = com.censivn.C3DEngine.a.GLSurfaceViewWrapper * f;
    }

    public final float h() {
        return this.M;
    }

    public final float i() {
        return this.M / com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void a(int i) {
        this.N = i;
    }

    public final void b(int i) {
        this.N = i * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final float j() {
        return this.N;
    }

    public final float k() {
        return this.N / com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final void c(int i) {
        this.O = i;
    }

    public final void d(int i) {
        this.O = i * com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    public final float l() {
        return this.O;
    }

    public final float m() {
        return this.O / com.censivn.C3DEngine.a.GLSurfaceViewWrapper;
    }

    @Override // com.censivn.C3DEngine.g.b.a
    public final com.censivn.C3DEngine.g.a.c ay() {
        return this.K;
    }

    @Override // com.censivn.C3DEngine.g.b.a
    public final void a(com.censivn.C3DEngine.g.a.c cVar) {
        this.K = cVar;
    }
}
