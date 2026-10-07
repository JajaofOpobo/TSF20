package com.censivn.C3DEngine.g.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.e.a.c;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
public class a extends u {
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

    public a(r rVar, int i, float f) {
        this.a = rVar.L();
        this.x = 3.141592653589793d * i;
        this.E = f;
        this.A = rVar.L().x;
        this.B = rVar.L().y;
    }

    public a(c cVar, int i, float f) {
        this.a = cVar.m;
        this.x = 3.141592653589793d * i;
        this.E = f;
        this.A = cVar.m.x;
        this.B = cVar.m.y;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void f(float f) {
        this.m = f;
        e();
    }

    public final void a(boolean z) {
        this.F = z;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void h(float f) {
        this.n = f;
        e();
    }

    private void e() {
        this.C = com.censivn.C3DEngine.h.a.b(this.A, this.B, this.m, this.n);
        this.D = com.censivn.C3DEngine.h.a.d(this.A, this.B, this.m, this.n);
    }

    public final void b(boolean z) {
        this.y = z;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
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
