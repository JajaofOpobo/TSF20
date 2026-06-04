package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class o extends com.censivn.C3DEngine.b.l {
    boolean a;
    float c;
    boolean d;
    final /* synthetic */ n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(n nVar, r rVar) {
        super(rVar);
        this.e = nVar;
        this.a = true;
        this.c = 0.0f;
        this.d = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        v vVar;
        v vVar2;
        v unused;
        if (this.a) {
            this.e.H = true;
            this.e.G = false;
            vVar = this.e.B;
            vVar.a_(true);
            unused = this.e.B;
            v.u();
            vVar2 = this.e.B;
            this.c = vVar2.L().x;
            this.a = false;
        }
        this.e.F = this.c + (motionEvent2.getX() - motionEvent.getX());
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        float f;
        v vVar;
        v vVar2;
        f = this.e.F;
        vVar = this.e.B;
        if (Math.abs(f - vVar.L().x) < 50.0f) {
            this.d = false;
        } else {
            this.d = true;
        }
        n nVar = this.e;
        vVar2 = this.e.B;
        nVar.F = vVar2.L().x;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.e.H = false;
        this.a = true;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        n nVar = this.e;
        f3 = nVar.F;
        nVar.F = f3 + (f / 5.0f);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        v vVar;
        if (!this.d) {
            float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
            vVar = this.e.B;
            r b = vVar.b(a[0], a[1], true);
            if (b != null) {
                this.e.b(b, b.t());
            }
        }
    }
}
