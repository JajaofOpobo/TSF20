package com.tsf.shell.workspace3D.j.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
class j extends com.censivn.C3DEngine.b.l {
    private float a;
    final /* synthetic */ a c;
    private float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, r rVar) {
        super(rVar);
        this.c = aVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        float f;
        float f2;
        f = this.c.g;
        this.a = f;
        f2 = this.c.h;
        this.d = f2;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        com.censivn.C3DEngine.e.b.a aVar;
        float f4;
        com.censivn.C3DEngine.e.b.a aVar2;
        com.censivn.C3DEngine.e.b.a aVar3;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        v vVar;
        float f10;
        com.censivn.C3DEngine.e.b.a aVar4;
        v unused;
        this.c.g = (this.a + motionEvent2.getX()) - motionEvent.getX();
        this.c.h = this.d - (motionEvent2.getY() - motionEvent.getY());
        f3 = this.c.g;
        aVar = this.c.b;
        if (f3 - (aVar.n_() / 2.0f) >= com.censivn.C3DEngine.a.e) {
            f4 = this.c.g;
            aVar2 = this.c.b;
            if (f4 + (aVar2.n_() / 2.0f) > com.censivn.C3DEngine.a.f) {
                a aVar5 = this.c;
                float f11 = com.censivn.C3DEngine.a.f;
                aVar3 = this.c.b;
                aVar5.g = f11 - (aVar3.n_() / 2.0f);
            }
        } else {
            a aVar6 = this.c;
            float f12 = com.censivn.C3DEngine.a.e;
            aVar4 = this.c.b;
            aVar6.g = f12 + (aVar4.n_() / 2.0f);
        }
        f5 = this.c.h;
        f6 = this.c.p;
        if (f5 + (f6 * 2.8f) <= com.censivn.C3DEngine.a.g) {
            f7 = this.c.h;
            f8 = this.c.p;
            if (f7 - (f8 * 2.8f) < com.censivn.C3DEngine.a.h) {
                a aVar7 = this.c;
                float f13 = com.censivn.C3DEngine.a.h;
                f9 = this.c.p;
                aVar7.h = f13 + (f9 * 2.8f);
            }
        } else {
            a aVar8 = this.c;
            float f14 = com.censivn.C3DEngine.a.g;
            f10 = this.c.p;
            aVar8.h = f14 - (f10 * 2.8f);
        }
        unused = this.c.a;
        v.u();
        vVar = this.c.a;
        vVar.a_(true);
    }
}
