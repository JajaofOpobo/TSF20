package com.tsf.shell.workspace3D.j;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class ak extends com.censivn.C3DEngine.b.l {
    private float a;
    public Runnable c;
    public boolean d;
    final /* synthetic */ n e;
    private float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(n nVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.e = nVar;
        this.d = true;
    }

    @Override // com.censivn.C3DEngine.b.l
    public void e(MotionEvent motionEvent) {
        float f;
        float f2;
        f = this.e.h;
        this.a = f;
        f2 = this.e.i;
        this.f = f2;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        com.censivn.C3DEngine.e.b.a aVar;
        float f4;
        com.censivn.C3DEngine.e.b.a aVar2;
        com.censivn.C3DEngine.e.b.a aVar3;
        float f5;
        com.censivn.C3DEngine.e.b.a aVar4;
        float f6;
        com.censivn.C3DEngine.e.b.a aVar5;
        com.censivn.C3DEngine.e.b.a aVar6;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.e.b.a aVar7;
        com.censivn.C3DEngine.e.b.a aVar8;
        com.censivn.C3DEngine.b.v unused;
        this.e.h = (this.a + motionEvent2.getX()) - motionEvent.getX();
        this.e.i = this.f - (motionEvent2.getY() - motionEvent.getY());
        f3 = this.e.h;
        aVar = this.e.c;
        if (f3 - (aVar.n_() / 2.0f) >= com.censivn.C3DEngine.a.e) {
            f4 = this.e.h;
            aVar2 = this.e.c;
            if (f4 + (aVar2.n_() / 2.0f) > com.censivn.C3DEngine.a.f) {
                n nVar = this.e;
                float f7 = com.censivn.C3DEngine.a.f;
                aVar3 = this.e.c;
                nVar.h = f7 - (aVar3.n_() / 2.0f);
            }
        } else {
            n nVar2 = this.e;
            float f8 = com.censivn.C3DEngine.a.e;
            aVar8 = this.e.c;
            nVar2.h = f8 + (aVar8.n_() / 2.0f);
        }
        f5 = this.e.i;
        aVar4 = this.e.c;
        if (f5 + (aVar4.o_() / 2.0f) <= com.censivn.C3DEngine.a.g) {
            f6 = this.e.i;
            aVar5 = this.e.c;
            if (f6 - (aVar5.o_() / 2.0f) < com.censivn.C3DEngine.a.h) {
                n nVar3 = this.e;
                float f9 = com.censivn.C3DEngine.a.h;
                aVar6 = this.e.c;
                nVar3.i = f9 + (aVar6.o_() / 2.0f);
            }
        } else {
            n nVar4 = this.e;
            float f10 = com.censivn.C3DEngine.a.g;
            aVar7 = this.e.c;
            nVar4.i = f10 - (aVar7.o_() / 2.0f);
        }
        vVar = this.e.a;
        vVar.a_(true);
        unused = this.e.a;
        com.censivn.C3DEngine.b.v.u();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.c != null) {
            com.tsf.shell.g.h.a();
        }
        if (this.d) {
            this.e.a(this.c);
        } else if (this.c != null) {
            this.c.run();
        }
    }
}
