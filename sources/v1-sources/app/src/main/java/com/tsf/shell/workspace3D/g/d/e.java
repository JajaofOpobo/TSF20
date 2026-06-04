package com.tsf.shell.workspace3D.g.d;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class e extends com.censivn.C3DEngine.b.l {
    boolean a;
    final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.c = dVar;
        this.a = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        o oVar;
        o oVar2;
        o oVar3;
        oVar = this.c.I;
        if (oVar != null) {
            oVar2 = this.c.I;
            if (oVar2 instanceof k) {
                oVar3 = this.c.I;
                k kVar = (k) oVar3;
                if (kVar.m() != null && kVar.m().k) {
                    d.d(this.c);
                    this.c.j();
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.c.l()) {
            float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
            com.censivn.C3DEngine.b.r b = this.c.E.b(a[0], a[1], true);
            if (b.P() instanceof k) {
                k kVar = (k) b.P();
                if (kVar.m().k) {
                    this.c.b(kVar);
                } else {
                    this.c.m();
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        if (!this.c.l()) {
            d.a(this.c, motionEvent);
            this.a = false;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        d dVar;
        d dVar2;
        if (!this.c.l()) {
            this.a = false;
            switch (d.b(this.c, motionEvent)) {
                case 1:
                    dVar2 = this.c.X;
                    dVar2.k();
                    break;
                case 2:
                    dVar = this.c.Y;
                    dVar.k();
                    break;
                default:
                    this.c.k();
                    break;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!this.c.l()) {
            if (this.a) {
                d.a(this.c, motionEvent2);
            } else if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 30.0f) {
                this.a = true;
                this.c.a(motionEvent2);
            }
        }
    }
}
