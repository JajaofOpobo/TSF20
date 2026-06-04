package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class z extends com.censivn.C3DEngine.b.l {
    boolean a;
    boolean c;
    final /* synthetic */ l d;
    private a e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l lVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.d = lVar;
        this.a = false;
        this.c = false;
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        ab abVar;
        if (!this.g && this.e.aG() != -1) {
            abVar = this.d.v;
            abVar.a(this.e, motionEvent);
            this.g = true;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        ab abVar;
        if (this.g) {
            abVar = this.d.v;
            abVar.a(this.e, motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        ab abVar;
        abVar = this.d.v;
        abVar.a(this.e);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        ab abVar;
        ab abVar2;
        if (this.g) {
            this.g = false;
            abVar2 = this.d.v;
            abVar2.b(this.e, motionEvent);
        }
        abVar = this.d.v;
        abVar.e();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.a = false;
        this.c = false;
        this.f = true;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ab abVar;
        ab abVar2;
        if (this.f) {
            this.f = false;
            if (Math.abs(f) > Math.abs(f2)) {
                this.c = true;
                abVar2 = this.d.v;
                abVar2.d();
            } else {
                com.censivn.C3DEngine.a.a().b(new aa(this, motionEvent2));
            }
        }
        if (this.c) {
            float x = motionEvent2.getX() - motionEvent.getX();
            abVar = this.d.v;
            abVar.b(x);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ab abVar;
        if (this.c && Math.abs(f) > 250.0f) {
            abVar = this.d.v;
            abVar.a(f / 2.0f);
        }
    }
}
