package com.tsf.shell.f.c.a;

import android.util.Log;
import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.n;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    private boolean a;
    private n b;
    private final int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private f j;
    private b k;

    public a(i iVar, f fVar) {
        super(iVar);
        this.a = false;
        this.d = (int) (30.0f * com.censivn.C3DEngine.b.b.a.a);
        this.e = 0;
        this.j = fVar;
        this.k = this.j.g();
        this.b = com.tsf.shell.manager.a.h;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        w.b();
        if (this.j.r()) {
            this.j.u();
        } else {
            this.j.t();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void h(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        w.a();
        this.a = true;
        this.j.o();
        this.h = this.j.h().position().x;
        this.i = this.j.h().position().y;
        this.j.l();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        this.a = false;
        switch (this.e) {
            case 0:
            case 3:
            default:
                return;
            case 1:
                this.b.x();
                return;
            case 2:
                this.k.c();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void d(MotionEvent motionEvent) {
        this.a = false;
        this.j.q();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a = false;
        switch (this.e) {
            case 0:
            case 3:
            default:
                return;
            case 1:
                this.b.x();
                return;
            case 2:
                this.k.c();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        com.censivn.C3DEngine.a.b.d = 1000;
        com.censivn.C3DEngine.a.b.c = this.d * this.d;
        this.f = motionEvent.getX();
        this.g = motionEvent.getY();
        com.tsf.shell.manager.action.f.a();
        if (this.b.m() == 2) {
            this.e = 0;
        } else {
            this.b.w();
            this.e = 1;
        }
        this.j.j();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        this.j.l();
        switch (this.e) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                this.e = 0;
                return;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.a) {
            this.j.a((int) (this.h + (motionEvent2.getX() - motionEvent.getX())), (int) (this.i - (motionEvent2.getY() - motionEvent.getY())));
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Log.w("ddddddd", "ddddddd:" + this.e);
        switch (this.e) {
            case 0:
                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.d) {
                    this.e = com.tsf.shell.manager.a.g.b.a((x.d(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) + 90.0f) * (-1.0f));
                    switch (this.e) {
                        case 1:
                            this.b.w();
                            this.b.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                            this.j.k();
                            return;
                        case 2:
                            if (this.k.a(motionEvent2.getX(), motionEvent2.getY())) {
                                this.k.b(motionEvent2.getX(), motionEvent2.getY());
                            } else {
                                this.b.w();
                                this.e = 1;
                                this.b.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                            }
                            this.j.k();
                            return;
                        case 3:
                            this.j.k();
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                this.b.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                return;
            case 2:
                this.k.b(motionEvent2.getX(), motionEvent2.getY());
                return;
            case 3:
            default:
                return;
        }
    }
}
