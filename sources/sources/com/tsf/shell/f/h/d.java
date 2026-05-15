package com.tsf.shell.f.h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.n;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.censivn.C3DEngine.b.d.a {
    private b a;
    private boolean b;
    private n d;
    private final int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private float j;

    public d(b bVar, i iVar) {
        super(iVar);
        this.b = false;
        this.e = (int) (30.0f * com.censivn.C3DEngine.b.b.a.a);
        this.f = 0;
        this.a = bVar;
        this.d = com.tsf.shell.manager.a.h;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        w.b();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void h(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        w.a();
        this.b = true;
        this.i = this.a.b().position().x;
        this.j = this.a.b().position().y;
        this.a.p();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        this.b = false;
        switch (this.f) {
            case 1:
                this.d.x();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void d(MotionEvent motionEvent) {
        this.b = false;
        this.a.q();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.b = false;
        switch (this.f) {
            case 1:
                this.d.x();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        com.censivn.C3DEngine.a.b.d = 500;
        com.censivn.C3DEngine.a.b.c = this.e * this.e;
        this.g = motionEvent.getX();
        this.h = motionEvent.getY();
        com.tsf.shell.manager.action.f.a();
        if (this.d.m() == 2) {
            this.f = 0;
        } else {
            this.d.w();
            this.f = 1;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        switch (this.f) {
        }
        this.f = 0;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.b) {
            this.a.a(this.i + (motionEvent2.getX() - motionEvent.getX()), this.j - (motionEvent2.getY() - motionEvent.getY()));
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.f) {
            case 0:
                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.e) {
                    this.f = 1;
                    switch (this.f) {
                        case 1:
                            this.d.w();
                            this.d.a(motionEvent2.getX(), motionEvent2.getY(), this.g, this.h);
                    }
                }
                break;
            case 1:
                this.d.a(motionEvent2.getX(), motionEvent2.getY(), this.g, this.h);
                break;
        }
    }
}
