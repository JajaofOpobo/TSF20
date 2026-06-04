package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class bi extends com.censivn.C3DEngine.b.l {
    boolean a;
    boolean c;
    float d;
    float e;
    final /* synthetic */ ba f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(ba baVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.f = baVar;
        this.a = false;
        this.c = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        com.censivn.C3DEngine.g.b.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        com.censivn.C3DEngine.e.b bVar4;
        com.censivn.C3DEngine.e.b unused;
        bVar = this.f.s;
        com.censivn.C3DEngine.g.s.a(bVar);
        this.f.u = false;
        ba baVar = this.f;
        bVar2 = this.f.c;
        float f = bVar2.L().x;
        this.d = f;
        baVar.v = f;
        ba baVar2 = this.f;
        bVar3 = this.f.c;
        float f2 = bVar3.L().y;
        this.e = f2;
        baVar2.w = f2;
        bVar4 = this.f.c;
        bVar4.a_(true);
        unused = this.f.c;
        com.censivn.C3DEngine.e.b.u();
        this.f.x = true;
        com.tsf.shell.g.h.a();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        this.f.x = false;
        this.f.k();
        if (com.censivn.C3DEngine.a.q) {
            f3 = this.f.v;
            f4 = this.f.w;
            com.tsf.shell.a.t.c(f3, f4);
        } else {
            f = this.f.v;
            f2 = this.f.w;
            com.tsf.shell.a.t.d(f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.a = true;
        this.c = false;
        this.f.i();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        z = this.f.x;
        if (z) {
            this.f.v = this.d + (motionEvent2.getX() - motionEvent.getX());
            this.f.w = this.e - (motionEvent2.getY() - motionEvent.getY());
        }
        if (this.c) {
            this.f.l = motionEvent2.getX() - motionEvent.getX();
            this.f.m = motionEvent2.getY() - motionEvent.getY();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        l lVar;
        lVar = this.f.e;
        lVar.o().f();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        l lVar;
        if (this.a) {
            this.a = false;
            com.censivn.C3DEngine.a.a().c(new bj(this));
        }
        if (this.c) {
            lVar = this.f.e;
            lVar.o().a(motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        l lVar;
        if (this.c) {
            lVar = this.f.e;
            lVar.o().a(motionEvent);
        }
        this.f.y = false;
        ba.w(this.f);
        this.f.l = 0.0f;
        this.f.m = 0.0f;
        this.f.j();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        l lVar;
        if (this.c) {
            lVar = this.f.e;
            lVar.o().a(motionEvent, motionEvent2, f, f2);
        }
    }
}
