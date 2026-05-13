package com.censivn.C3DEngine.b.f.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.primitives.button.VButtonItem;
import com.censivn.C3DEngine.b.g.a.c;
/* loaded from: classes.dex */
public class b implements com.censivn.C3DEngine.b.g.b.a {
    public float A;
    public float B;
    public Number3d D;
    public Number3d E;
    public Number3d F;
    public Number3d G;
    public int J;
    private a K;
    private VButtonItem L;
    private c M;
    private float N;
    private float O;
    private Object R;
    public int a;
    public int b;
    public int c;
    public int d;
    public com.censivn.C3DEngine.b.d.a l;
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
    private float P = 0.0f;
    private float Q = 0.0f;
    public boolean x = false;
    public Number3d C = new Number3d(1.0f, 1.0f, 1.0f);
    public Color4 H = new Color4(255, 255, 255, 255);
    public float I = 255.0f;

    public b(a aVar) {
        this.K = aVar;
    }

    public void a(Object obj) {
        this.R = obj;
    }

    public Object a() {
        return this.R;
    }

    public VButtonItem b() {
        if (this.L == null) {
            this.L = new VButtonItem(this);
        }
        return this.L;
    }

    public float c() {
        return this.I;
    }

    public void a(float f) {
        this.I = f;
    }

    public void a(boolean z) {
        this.x = z;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.y = f;
        this.z = f2;
        this.A = f + f3;
        this.B = f2 + f4;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public boolean d() {
        return this.i;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public boolean e() {
        return this.j;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
    }

    public void b(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = this.K.b * i3;
        this.O = this.K.b * i4;
    }

    public void c(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = this.K.b * i3 * com.censivn.C3DEngine.b.b.a.a;
        this.O = this.K.b * i4 * com.censivn.C3DEngine.b.b.a.a;
    }

    public void d(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = this.K.b * i3 * com.censivn.C3DEngine.b.b.a.b;
        this.O = this.K.b * i4 * com.censivn.C3DEngine.b.b.a.b;
    }

    public void a(int i, int i2, int i3, int i4, float f, float f2) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = f;
        this.O = f2;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = i5;
        this.O = i6;
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.h = i2;
        this.e = i3;
        this.f = i4;
        this.N = i5 * com.censivn.C3DEngine.b.b.a.a;
        this.O = i6 * com.censivn.C3DEngine.b.b.a.a;
    }

    public void a(int i, int i2) {
        this.g = i;
        this.h = i2;
        g();
    }

    public void b(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.N = this.K.b * i;
        this.O = this.K.b * i2;
    }

    public void c(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.N = this.K.b * i * com.censivn.C3DEngine.b.b.a.a;
        this.O = this.K.b * i2 * com.censivn.C3DEngine.b.b.a.a;
    }

    public void d(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.N = this.K.b * i * com.censivn.C3DEngine.b.b.a.b;
        this.O = this.K.b * i2 * com.censivn.C3DEngine.b.b.a.b;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.N = this.K.b * i * com.censivn.C3DEngine.b.b.a.c;
        this.O = this.K.b * i2 * com.censivn.C3DEngine.b.b.a.c;
    }

    public void f(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.K.a(this);
    }

    public void f() {
        this.K.b(this);
    }

    public void g() {
        this.K.a(this);
    }

    public void h() {
        f();
        g();
    }

    public void a(com.censivn.C3DEngine.b.d.a aVar) {
        this.l = aVar;
    }

    public PositionNumber3d i() {
        return this.m;
    }

    public Number3d j() {
        return this.n;
    }

    public Number3d k() {
        return this.o;
    }

    public boolean l() {
        return this.k;
    }

    public void a(Boolean bool) {
        if (bool.booleanValue() != this.k) {
            this.k = bool.booleanValue();
            this.K.b(this);
        }
    }

    public void b(float f) {
        this.N = f;
    }

    public void c(float f) {
        this.N = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public float m() {
        return this.N;
    }

    public float n() {
        return this.N / com.censivn.C3DEngine.b.b.a.a;
    }

    public void d(float f) {
        this.O = f;
    }

    public void e(float f) {
        this.O = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public float o() {
        return this.O;
    }

    public float p() {
        return this.O / com.censivn.C3DEngine.b.b.a.a;
    }

    public void a(int i) {
        this.P = i;
    }

    public void b(int i) {
        this.P = i * com.censivn.C3DEngine.b.b.a.a;
    }

    public float q() {
        return this.P;
    }

    public float r() {
        return this.P / com.censivn.C3DEngine.b.b.a.a;
    }

    public void c(int i) {
        this.Q = i;
    }

    public void d(int i) {
        this.Q = i * com.censivn.C3DEngine.b.b.a.a;
    }

    public float s() {
        return this.Q;
    }

    public float t() {
        return this.Q / com.censivn.C3DEngine.b.b.a.a;
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public c getTweenChild() {
        return this.M;
    }

    @Override // com.censivn.C3DEngine.b.g.b.a
    public void setTweenChild(c cVar) {
        this.M = cVar;
    }
}
