package com.tsf.shell.workspace3D;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class n extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ j a;
    private float c;
    private boolean d;
    private boolean e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(j jVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = jVar;
        this.d = true;
        this.e = false;
        this.f = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        float f;
        z = this.a.w;
        if (z) {
            j jVar = this.a;
            f = this.a.x;
            j.a(jVar, f + (motionEvent.getY() - motionEvent2.getY()));
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.b.k kVar;
        j jVar;
        kVar = this.a.q;
        jVar = this.a.n;
        kVar.a(jVar);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.b.k kVar;
        this.f = false;
        com.censivn.C3DEngine.b.v vVar = this.a.e;
        com.censivn.C3DEngine.b.v.u();
        kVar = this.a.q;
        kVar.a(true);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        boolean z;
        com.censivn.C3DEngine.e.b bVar;
        com.tsf.shell.workspace3D.k.b.k kVar;
        z = this.a.w;
        if (!z) {
            j jVar = this.a;
            bVar = this.a.o;
            jVar.x = bVar.L().y;
            this.a.w = true;
            kVar = this.a.q;
            kVar.k();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        com.tsf.shell.workspace3D.k.b.k kVar;
        if (this.d) {
            this.d = false;
            if (Math.abs(f) > Math.abs(f2)) {
                this.f = true;
                this.c = this.a.e.L().x;
                com.censivn.C3DEngine.a.a().b(new o(this));
            } else {
                com.censivn.C3DEngine.a.a().b(new p(this, motionEvent2));
            }
        }
        if (this.f) {
            float x = this.c + (motionEvent2.getX() - motionEvent.getX());
            i = this.a.y;
            if (i == 0) {
                if (x > j.b) {
                    x = j.b;
                } else if (x < j.a) {
                    x = j.a;
                }
            } else if (x < j.b) {
                x = j.b;
            } else if (x > j.a) {
                x = j.a;
            }
            kVar = this.a.q;
            kVar.a(x);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        com.tsf.shell.workspace3D.k.b.k kVar;
        com.tsf.shell.workspace3D.k.b.k kVar2;
        com.tsf.shell.workspace3D.k.b.k kVar3;
        if (this.f) {
            this.e = true;
            i = this.a.y;
            if (i == 0) {
                if (f <= 0.0f) {
                    kVar3 = this.a.q;
                    kVar3.o();
                    return;
                }
            } else if (f > 0.0f) {
                kVar = this.a.q;
                kVar.o();
                return;
            }
            kVar2 = this.a.q;
            kVar2.n();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        int i;
        com.tsf.shell.workspace3D.k.b.k kVar;
        com.tsf.shell.workspace3D.k.b.k kVar2;
        com.tsf.shell.workspace3D.k.b.k kVar3;
        com.tsf.shell.workspace3D.k.b.k kVar4;
        i = this.a.y;
        if (i == 0) {
            if (this.a.e.L().x > (j.a + j.b) / 2) {
                kVar4 = this.a.q;
                kVar4.n();
                return;
            } else {
                kVar3 = this.a.q;
                kVar3.o();
                return;
            }
        }
        if (this.a.e.L().x < (j.a + j.b) / 2) {
            kVar2 = this.a.q;
            kVar2.n();
        } else {
            kVar = this.a.q;
            kVar.o();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.b.k kVar;
        boolean z;
        com.tsf.shell.workspace3D.k.b.k kVar2;
        j jVar;
        com.tsf.shell.workspace3D.k.b.k kVar3;
        com.tsf.shell.workspace3D.k.b.k kVar4;
        kVar = this.a.q;
        kVar.a(false);
        z = this.a.w;
        if (z) {
            this.a.w = false;
            kVar2 = this.a.q;
            if (kVar2.m()) {
                jVar = this.a.n;
                jVar.a(true);
            } else {
                kVar3 = this.a.q;
                kVar3.b(true);
                kVar4 = this.a.q;
                kVar4.q();
            }
        }
        this.d = true;
        this.e = false;
    }
}
