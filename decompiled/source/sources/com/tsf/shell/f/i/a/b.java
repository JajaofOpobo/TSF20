package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.action.f;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.d.a {
    public static n d;
    private final float a;
    private final float b;
    private final int e;
    private final int f;
    private int g;
    private float h;
    private float i;

    public b(i iVar) {
        super(iVar);
        this.a = 30.0f * com.censivn.C3DEngine.b.b.a.a;
        this.b = 15.0f * com.censivn.C3DEngine.b.b.a.a;
        this.e = 0;
        this.f = 1;
        this.g = 0;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (d.m() == 1 || d.m() == 3) {
            d.x();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        switch (this.g) {
            case 0:
            default:
                return;
            case 1:
                d.x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case 0:
            default:
                return;
            case 1:
                d.x();
                return;
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        f.a();
        if (d.m() == 2) {
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
                    d.w();
                    d.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                    return;
                }
                return;
            case 1:
                d.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                return;
            default:
                return;
        }
    }
}
