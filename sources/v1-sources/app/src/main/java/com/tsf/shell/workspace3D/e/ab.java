package com.tsf.shell.workspace3D.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class ab extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ p a;
    private float c;
    private boolean d;
    private float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(p pVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = pVar;
        this.d = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.e.a.a aVar;
        aVar = this.a.ag;
        aVar.b();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        cg cgVar;
        float f;
        float f2;
        this.d = false;
        cgVar = this.a.W;
        this.c = cgVar.k();
        com.tsf.shell.workspace3D.e.b.a aVar = p.p;
        f = this.a.x;
        f2 = this.a.y;
        this.e = aVar.a(f, f2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        cg cgVar;
        cg cgVar2;
        cg unused;
        z = this.a.aD;
        if (!z) {
            cgVar = this.a.W;
            boolean z2 = cgVar.M().z % 180.0f == 0.0f;
            if (this.d) {
                float a = p.p.a(this.c, motionEvent, motionEvent2);
                if (a > this.e) {
                    a = this.e;
                }
                if (a < p.c * com.censivn.C3DEngine.a.b) {
                    a = p.c * com.censivn.C3DEngine.a.b;
                }
                this.a.az = a;
                this.a.C = false;
                cgVar2 = this.a.W;
                cgVar2.a_(true);
                unused = this.a.W;
                cg.u();
                return;
            }
            if (z2) {
                if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > 20.0f) {
                    this.d = true;
                }
            } else if (Math.abs(motionEvent2.getY() - motionEvent.getY()) > 20.0f) {
                this.d = true;
            }
        }
    }
}
