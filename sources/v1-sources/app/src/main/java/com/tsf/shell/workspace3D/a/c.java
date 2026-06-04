package com.tsf.shell.workspace3D.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public class c extends l {
    private com.tsf.shell.workspace3D.h.l a;
    private final float c;
    private final float d;
    private final int e;
    private final int f;
    private int g;
    private float h;
    private float i;

    public c(r rVar) {
        super(rVar);
        this.c = 30.0f * com.censivn.C3DEngine.a.a;
        this.d = 15.0f * com.censivn.C3DEngine.a.a;
        this.e = 0;
        this.f = 1;
        this.g = 0;
        this.a = bf.j();
    }

    @Override // com.censivn.C3DEngine.b.l
    public void a(MotionEvent motionEvent) {
        if (this.a.j() == 1 || this.a.j() == 3) {
            this.a.s();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        switch (this.g) {
            case 1:
                this.a.s();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case 1:
                this.a.s();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        com.tsf.shell.action.c.a();
        if (this.a.j() == 2) {
            this.g = 0;
        } else {
            this.g = 1;
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case 0:
                if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.c) {
                    this.g = 1;
                    this.a.r();
                    break;
                } else {
                    return;
                }
            case 1:
                break;
            default:
                return;
        }
        this.a.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
    }
}
