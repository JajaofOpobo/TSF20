package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class d extends com.censivn.C3DEngine.b.l {
    boolean a;
    final /* synthetic */ b c;
    private float d;
    private float e;
    private float f;
    private float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(b bVar, r rVar) {
        super(rVar);
        this.c = bVar;
        this.a = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.a = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        Number3d number3d;
        Number3d number3d2;
        Number3d number3d3;
        Number3d number3d4;
        Number3d number3d5;
        Number3d number3d6;
        Number3d number3d7;
        Number3d number3d8;
        Number3d number3d9;
        Number3d number3d10;
        Number3d number3d11;
        Number3d number3d12;
        v vVar;
        v vVar2;
        if (!this.a) {
            if (com.censivn.C3DEngine.h.a.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 10.0f) {
                this.f = motionEvent2.getX();
                this.g = motionEvent2.getY();
                vVar = this.c.a;
                this.d = vVar.L().x;
                vVar2 = this.c.a;
                this.e = vVar2.L().y;
                this.a = true;
                return;
            }
            return;
        }
        float x = (int) (this.d + (motionEvent2.getX() - this.f));
        float y = (int) (this.e - (motionEvent2.getY() - this.g));
        number3d = this.c.ah;
        if (number3d.x + x <= com.censivn.C3DEngine.a.f) {
            number3d2 = this.c.ag;
            if (number3d2.x + x < com.censivn.C3DEngine.a.e) {
                float f = this.d;
                float f2 = com.censivn.C3DEngine.a.e;
                number3d3 = this.c.ag;
                this.d = (f2 - (x + number3d3.x)) + f;
                float f3 = com.censivn.C3DEngine.a.e;
                number3d4 = this.c.ag;
                x = (int) (f3 - number3d4.x);
            }
        } else {
            float f4 = this.d;
            number3d11 = this.c.ah;
            this.d = f4 - ((x + number3d11.x) - com.censivn.C3DEngine.a.f);
            float f5 = com.censivn.C3DEngine.a.f;
            number3d12 = this.c.ah;
            x = (int) (f5 - number3d12.x);
        }
        number3d5 = this.c.ag;
        if (number3d5.y + y <= com.censivn.C3DEngine.a.g) {
            number3d6 = this.c.ah;
            if (number3d6.y + y < com.censivn.C3DEngine.a.h) {
                float f6 = this.e;
                float f7 = com.censivn.C3DEngine.a.h;
                number3d7 = this.c.ah;
                this.e = (f7 - (y + number3d7.y)) + f6;
                float f8 = com.censivn.C3DEngine.a.h;
                number3d8 = this.c.ah;
                y = (int) (f8 - number3d8.y);
            }
        } else {
            float f9 = this.e;
            number3d9 = this.c.ag;
            this.e = f9 - ((y + number3d9.y) - com.censivn.C3DEngine.a.g);
            float f10 = com.censivn.C3DEngine.a.g;
            number3d10 = this.c.ag;
            y = (int) (f10 - number3d10.y);
        }
        this.c.an = false;
        this.c.M = x;
        this.c.N = y;
    }
}
