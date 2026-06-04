package com.tsf.shell.setting.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class e extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ d a;
    private float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = dVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        float f;
        int i;
        com.censivn.C3DEngine.b.v unused;
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        vVar = this.a.H;
        com.censivn.C3DEngine.b.r a2 = vVar.a(a[0], a[1], true);
        if (a2 != null) {
            vVar2 = this.a.H;
            vVar2.a_(true);
            unused = this.a.H;
            com.censivn.C3DEngine.b.v.u();
            d dVar = this.a;
            float parseInt = Integer.parseInt(a2.O());
            f = this.a.D;
            float f2 = parseInt * f;
            i = this.a.I;
            dVar.a = f2 * (-i);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        d dVar = this.a;
        f3 = this.a.a;
        i = this.a.I;
        dVar.a = (int) (f3 + ((f2 / 10.0f) * (-i)));
        f4 = this.a.a;
        f5 = this.a.D;
        int i2 = (int) (f4 / f5);
        d dVar2 = this.a;
        f6 = this.a.D;
        dVar2.a = (int) (i2 * f6);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        float f3;
        int i;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v unused;
        z = this.a.K;
        if (!z) {
            this.a.K = true;
            d dVar = this.a;
            vVar = this.a.H;
            float f4 = vVar.M().z;
            this.c = f4;
            dVar.a = f4;
            vVar2 = this.a.H;
            vVar2.a_(true);
            unused = this.a.H;
            com.censivn.C3DEngine.b.v.u();
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        d dVar2 = this.a;
        float f5 = this.c;
        f3 = this.a.J;
        float f6 = ((y * 180.0f) / f3) / 2.0f;
        i = this.a.I;
        dVar2.a = (int) ((f6 * (-i)) + f5);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        float f3;
        z = this.a.K;
        if (z) {
            this.a.K = false;
            f = this.a.a;
            f2 = this.a.D;
            int round = Math.round(f / f2);
            d dVar = this.a;
            f3 = this.a.D;
            dVar.a = round * f3;
        }
    }
}
