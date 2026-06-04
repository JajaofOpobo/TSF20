package com.tsf.shell.workspace3D.e;

import android.view.MotionEvent;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class a extends com.censivn.C3DEngine.b.l {
    private boolean a;
    private com.tsf.shell.workspace3D.h.l c;
    private final int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private p j;
    private e k;

    public a(com.censivn.C3DEngine.b.r rVar, p pVar) {
        super(rVar);
        this.a = false;
        this.d = (int) (30.0f * com.censivn.C3DEngine.a.a);
        this.e = 0;
        this.j = pVar;
        this.k = this.j.h();
        this.c = com.tsf.shell.workspace3D.bf.j();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.j.u()) {
            this.j.w();
        } else {
            this.j.x();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        com.tsf.shell.g.h.a();
        this.a = true;
        this.j.s();
        this.h = this.j.i().L().x;
        this.i = this.j.i().L().y;
        this.j.m();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        this.a = false;
        switch (this.e) {
            case 1:
                this.c.s();
                break;
            case 2:
                this.k.n();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        this.a = false;
        this.j.t();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a = false;
        switch (this.e) {
            case 1:
                this.c.s();
                break;
            case 2:
                this.k.n();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.censivn.C3DEngine.b.b.d = ThemeShellDescription.PICKER_MENU;
        com.censivn.C3DEngine.b.b.c = this.d * this.d;
        this.f = motionEvent.getX();
        this.g = motionEvent.getY();
        com.tsf.shell.action.c.a();
        if (this.c.j() == 2) {
            this.e = 0;
        } else {
            this.c.r();
            this.e = 1;
        }
        this.j.k();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.j.m();
        int i = this.e;
        this.e = 0;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.a) {
            this.j.a((int) (this.h + (motionEvent2.getX() - motionEvent.getX())), (int) (this.i - (motionEvent2.getY() - motionEvent.getY())));
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.e) {
            case 0:
                if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.d) {
                    this.e = com.tsf.shell.workspace3D.bf.s().a((com.censivn.C3DEngine.h.a.d(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) + 90.0f) * (-1.0f));
                    switch (this.e) {
                        case 1:
                            this.c.r();
                            this.c.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                            this.j.l();
                            break;
                        case 2:
                            if (this.k.a(motionEvent2.getX(), motionEvent2.getY())) {
                                this.k.c(motionEvent2.getX(), motionEvent2.getY());
                            } else {
                                this.c.r();
                                this.c.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                            }
                            this.j.l();
                            break;
                        case 3:
                            this.j.l();
                            break;
                    }
                }
                break;
            case 1:
                this.c.a(motionEvent2.getX(), motionEvent2.getY(), this.f, this.g);
                break;
            case 2:
                this.k.c(motionEvent2.getX(), motionEvent2.getY());
                break;
        }
    }
}
