package com.censivn.C3DEngine.b.g.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class a extends x {
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private Number3d a;
    private double x;
    private boolean y = false;
    private Number3d z = new Number3d();
    private boolean F = true;

    public a(j jVar, int i, float f) {
        this.a = jVar.position();
        this.x = 3.141592653589793d * i;
        this.E = f;
        this.A = jVar.position().x;
        this.B = jVar.position().y;
    }

    @Override // com.censivn.C3DEngine.b.g.x
    public void f(float f) {
        this.m = f;
        h();
    }

    public void a(boolean z) {
        this.F = z;
    }

    @Override // com.censivn.C3DEngine.b.g.x
    public void h(float f) {
        this.n = f;
        h();
    }

    private void h() {
        this.C = com.tsf.shell.utils.x.b(this.A, this.B, this.m, this.n);
        this.D = com.tsf.shell.utils.x.d(this.A, this.B, this.m, this.n);
    }

    public void b(boolean z) {
        this.y = z;
    }

    @Override // com.censivn.C3DEngine.b.g.x
    public void a(float f) {
        this.z.x = this.C * f;
        if (this.F) {
            this.z.y = ((float) Math.sin(this.x * f)) * this.E * (1.0f - f);
        } else {
            this.z.y = ((float) Math.sin(this.x * f)) * this.E * f;
        }
        if (this.y) {
            this.z.y = -this.z.y;
        }
        this.z.rotateDegressZ(this.D);
        this.a.x = this.z.x + this.A;
        this.a.y = this.z.y + this.B;
    }
}
