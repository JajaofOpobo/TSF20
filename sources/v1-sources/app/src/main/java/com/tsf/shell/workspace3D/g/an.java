package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class an extends com.censivn.C3DEngine.b.l {
    private float a;
    private float c;
    private float d;
    private al e;
    private boolean f;
    private int g;
    private com.censivn.C3DEngine.b.r h;

    public an(com.censivn.C3DEngine.b.r rVar, al alVar, com.censivn.C3DEngine.b.r rVar2) {
        super(rVar);
        this.f = false;
        this.e = alVar;
        this.h = rVar2;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        com.tsf.shell.workspace3D.k.j jVar;
        com.tsf.shell.workspace3D.k.j jVar2;
        com.tsf.shell.workspace3D.k.j jVar3;
        com.tsf.shell.workspace3D.k.j jVar4;
        if (this.f) {
            switch (this.g) {
                case 0:
                    float y = motionEvent2.getY() - this.c;
                    al alVar = this.e;
                    float f = this.d - y;
                    jVar4 = aj.C;
                    alVar.q(f / jVar4.ap());
                    break;
                case 1:
                    float y2 = this.c - motionEvent2.getY();
                    al alVar2 = this.e;
                    float f2 = this.d - y2;
                    jVar3 = aj.C;
                    alVar2.q(f2 / Math.abs(jVar3.am()));
                    break;
                case 2:
                    float x = motionEvent2.getX() - this.a;
                    al alVar3 = this.e;
                    float f3 = this.d - x;
                    jVar2 = aj.C;
                    alVar3.q(f3 / Math.abs(jVar2.al()));
                    break;
                case 3:
                    float x2 = this.a - motionEvent2.getX();
                    al alVar4 = this.e;
                    float f4 = this.d - x2;
                    jVar = aj.C;
                    alVar4.q(f4 / jVar.ao());
                    break;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.f = true;
        this.e.q();
        this.a = motionEvent.getX();
        this.c = motionEvent.getY();
        this.g = this.e.g(this.h);
        switch (this.g) {
            case 0:
                this.d = this.e.k();
                break;
            case 1:
                this.d = this.e.l();
                break;
            case 2:
                this.d = this.e.n();
                break;
            case 3:
                this.d = this.e.m();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        boolean z;
        this.f = false;
        z = aj.B;
        if (z) {
            al alVar = this.e;
            int i = this.g;
            alVar.aG();
        }
    }
}
