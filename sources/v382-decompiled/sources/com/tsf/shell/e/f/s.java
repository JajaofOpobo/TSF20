package com.tsf.shell.e.f;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class s extends com.censivn.C3DEngine.b.d.a {
    boolean a;
    boolean b;
    final /* synthetic */ r d;
    private g e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, com.censivn.C3DEngine.b.f.j jVar) {
        super(jVar);
        this.d = rVar;
        this.a = false;
        this.b = false;
    }

    public void a(g gVar) {
        this.e = gVar;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        t tVar;
        if (!this.g && this.e.t() != -1) {
            tVar = this.d.w;
            tVar.a(this.e, motionEvent);
            this.g = true;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        t tVar;
        if (this.g) {
            tVar = this.d.w;
            tVar.a(this.e, motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        t tVar;
        com.tsf.shell.utils.w.b();
        tVar = this.d.w;
        tVar.a(this.e);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        t tVar;
        t tVar2;
        if (this.g) {
            this.g = false;
            tVar2 = this.d.w;
            tVar2.b(this.e, motionEvent);
        }
        tVar = this.d.w;
        tVar.f();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.a = false;
        this.b = false;
        this.f = true;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
        t tVar;
        t tVar2;
        if (this.f) {
            this.f = false;
            if (Math.abs(f) > Math.abs(f2)) {
                this.b = true;
                tVar2 = this.d.w;
                tVar2.e();
            } else {
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.f.s.1
                    @Override // java.lang.Runnable
                    public void run() {
                        s.this.c(motionEvent2);
                    }
                });
            }
        }
        if (this.b) {
            float x = motionEvent2.getX() - motionEvent.getX();
            tVar = this.d.w;
            tVar.b(x);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        t tVar;
        if (this.b && Math.abs(f) > 250.0f) {
            tVar = this.d.w;
            tVar.a(f / 2.0f);
        }
    }
}
