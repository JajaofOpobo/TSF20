package com.tsf.shell.workspace3D.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import com.tsf.shell.workspace3D.g.b.n;

/* loaded from: classes.dex */
final class f extends l {
    boolean a;
    boolean c;
    l d;
    boolean e;
    float f;

    f(r rVar) {
        super(rVar);
        this.a = false;
        this.c = false;
        this.e = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        n nVar;
        this.e = true;
        this.a = false;
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        r b = this.b.b(a[0], a[1], true);
        if (b == null) {
            nVar = c.e;
            this.d = nVar.aw();
        } else {
            this.d = b.aw();
            this.d.e(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        v vVar;
        v vVar2;
        v unused;
        if (!this.a) {
            this.a = true;
            if (Math.abs(f) > Math.abs(f2)) {
                this.c = false;
            } else {
                this.c = true;
            }
        }
        if (this.c) {
            if (this.e) {
                this.e = false;
                vVar = c.a;
                this.f = vVar.L().y;
                c.k = true;
                c.h = false;
                vVar2 = c.a;
                vVar2.a_(true);
                unused = c.a;
                v.u();
            }
            c.i = this.f + (motionEvent.getY() - motionEvent2.getY());
            f3 = c.i;
            f4 = c.m;
            if (f3 <= f4 - (com.censivn.C3DEngine.a.b * 80.0f)) {
                f5 = c.i;
                f6 = c.n;
                if (f5 < f6 + (com.censivn.C3DEngine.a.b * 80.0f)) {
                    f7 = c.n;
                    c.i = f7 + (com.censivn.C3DEngine.a.b * 80.0f);
                    return;
                }
                return;
            }
            f8 = c.m;
            c.i = f8 - (com.censivn.C3DEngine.a.b * 80.0f);
            return;
        }
        if (this.d != null) {
            this.d.a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        v vVar;
        if (this.c) {
            c.k = false;
            vVar = c.a;
            vVar.a_(false);
        } else if (this.d != null) {
            this.d.f(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.c && this.d != null) {
            this.d.b(motionEvent, motionEvent2, f, f2);
        }
    }
}
