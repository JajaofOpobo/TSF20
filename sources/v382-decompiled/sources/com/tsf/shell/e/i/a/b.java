package com.tsf.shell.e.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.e.f.r;
import com.tsf.shell.manager.action.h;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.d.a {
    public static r b;
    private final float a;
    private final float d;
    private final int e;
    private final int f;
    private int g;
    private float h;
    private float i;

    public b(j jVar) {
        super(jVar);
        this.a = 30.0f * com.censivn.C3DEngine.b.b.a.a;
        this.d = 15.0f * com.censivn.C3DEngine.b.b.a.a;
        this.e = 0;
        this.f = 1;
        this.g = 0;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (b.m() == 1 || b.m() == 3) {
            b.x();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        switch (this.g) {
            case 1:
                b.x();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case 1:
                b.x();
                break;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        h.a();
        if (b.m() == 2) {
            this.g = 0;
        } else {
            this.g = 1;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case 0:
                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > this.a) {
                    this.g = 1;
                    b.w();
                    b.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                    break;
                }
                break;
            case 1:
                b.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                break;
        }
    }
}
