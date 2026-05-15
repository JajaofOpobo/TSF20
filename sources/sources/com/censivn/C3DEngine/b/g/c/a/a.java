package com.censivn.C3DEngine.b.g.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends d {
    private float C;
    private float D;
    private float E;
    private Number3d a;
    private double b;
    private float e;
    private float f;
    private boolean c = false;
    private Number3d d = new Number3d();
    private boolean F = true;

    public a(i iVar, int i, float f) {
        this.a = iVar.position();
        this.b = 3.141592653589793d * ((double) i);
        this.E = f;
        this.e = iVar.position().x;
        this.f = iVar.position().y;
    }

    @Override // com.censivn.C3DEngine.b.g.d
    public void f(float f) {
        this.r = f;
        h();
    }

    public void a(boolean z) {
        this.F = z;
    }

    @Override // com.censivn.C3DEngine.b.g.d
    public void h(float f) {
        this.s = f;
        h();
    }

    private void h() {
        this.C = x.b(this.e, this.f, this.r, this.s);
        this.D = x.d(this.e, this.f, this.r, this.s);
    }

    public void b(boolean z) {
        this.c = z;
    }

    @Override // com.censivn.C3DEngine.b.g.d
    public void a(float f) {
        this.d.x = this.C * f;
        if (this.F) {
            this.d.y = ((float) Math.sin(this.b * ((double) f))) * this.E * (1.0f - f);
        } else {
            this.d.y = ((float) Math.sin(this.b * ((double) f))) * this.E * f;
        }
        if (this.c) {
            this.d.y = -this.d.y;
        }
        this.d.rotateDegressZ(this.D);
        this.a.x = this.d.x + this.e;
        this.a.y = this.d.y + this.f;
    }
}
