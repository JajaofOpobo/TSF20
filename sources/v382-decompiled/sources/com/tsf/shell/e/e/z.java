package com.tsf.shell.e.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class z extends com.censivn.C3DEngine.b.d.a {
    private float a;
    private float b;
    private float d;
    private y e;
    private boolean f;
    private int g;
    private com.censivn.C3DEngine.b.f.j h;

    public z(com.censivn.C3DEngine.b.f.j jVar, y yVar, com.censivn.C3DEngine.b.f.j jVar2) {
        super(jVar);
        this.f = false;
        this.e = yVar;
        this.h = jVar2;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        com.tsf.shell.e.i.c cVar;
        com.tsf.shell.e.i.c cVar2;
        com.tsf.shell.e.i.c cVar3;
        com.tsf.shell.e.i.c cVar4;
        if (this.f) {
            z = x.c;
            if (z) {
                switch (this.g) {
                    case 0:
                        float y = motionEvent2.getY() - this.b;
                        y yVar = this.e;
                        float f = this.d - y;
                        cVar4 = x.d;
                        yVar.k(f / cVar4.maxY());
                        break;
                    case 1:
                        float y2 = this.b - motionEvent2.getY();
                        y yVar2 = this.e;
                        float f2 = this.d - y2;
                        cVar3 = x.d;
                        yVar2.k(f2 / Math.abs(cVar3.minY()));
                        break;
                    case 2:
                        float x = motionEvent2.getX() - this.a;
                        y yVar3 = this.e;
                        float f3 = this.d - x;
                        cVar2 = x.d;
                        yVar3.k(f3 / Math.abs(cVar2.minX()));
                        break;
                    case 3:
                        float x2 = this.a - motionEvent2.getX();
                        y yVar4 = this.e;
                        float f4 = this.d - x2;
                        cVar = x.d;
                        yVar4.k(f4 / cVar.maxX());
                        break;
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        boolean z;
        z = x.c;
        if (z) {
            this.f = true;
            this.e.j();
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
            this.g = this.e.a(this.h);
            switch (this.g) {
                case 0:
                    this.d = this.e.a();
                    break;
                case 1:
                    this.d = this.e.d();
                    break;
                case 2:
                    this.d = this.e.f();
                    break;
                case 3:
                    this.d = this.e.e();
                    break;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        boolean z;
        if (this.f) {
            this.f = false;
            z = x.c;
            if (z) {
                this.e.a(this.g);
            }
        }
    }
}
