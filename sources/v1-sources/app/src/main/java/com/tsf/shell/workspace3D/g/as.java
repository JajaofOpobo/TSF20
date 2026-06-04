package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;

/* loaded from: classes.dex */
final class as extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ar a;
    private float c;
    private float d;
    private float e;
    private float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ar arVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = arVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.a aVar;
        com.tsf.shell.workspace3D.k.a aVar2;
        ao aoVar;
        ao aoVar2;
        ao aoVar3;
        ao unused;
        aVar = ao.B;
        this.c = aVar.L().x;
        aVar2 = ao.B;
        this.d = aVar2.L().y;
        aoVar = this.a.G;
        this.e = aoVar.L().x;
        aoVar2 = this.a.G;
        this.f = aoVar2.L().y;
        aoVar3 = this.a.G;
        aoVar3.a_(true);
        unused = this.a.G;
        ao.u();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.tsf.shell.workspace3D.k.a aVar;
        com.tsf.shell.workspace3D.k.a aVar2;
        com.tsf.shell.workspace3D.k.a aVar3;
        com.tsf.shell.workspace3D.k.a aVar4;
        com.tsf.shell.workspace3D.k.a aVar5;
        com.tsf.shell.workspace3D.k.a aVar6;
        com.tsf.shell.workspace3D.k.a aVar7;
        ao aoVar;
        com.tsf.shell.workspace3D.k.a aVar8;
        ao aoVar2;
        com.tsf.shell.workspace3D.k.a aVar9;
        com.tsf.shell.workspace3D.k.a aVar10;
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        float f3 = this.c + x;
        aVar = ao.B;
        if (f3 + (aVar.A.n_() / 2.0f) > com.censivn.C3DEngine.a.f) {
            float f4 = com.censivn.C3DEngine.a.f;
            aVar10 = ao.B;
            x = (f4 - (aVar10.A.n_() / 2.0f)) - this.c;
        } else {
            float f5 = this.c + x;
            aVar2 = ao.B;
            if (f5 - (aVar2.A.n_() / 2.0f) < com.censivn.C3DEngine.a.e) {
                float f6 = com.censivn.C3DEngine.a.e;
                aVar3 = ao.B;
                x = (f6 + (aVar3.A.n_() / 2.0f)) - this.c;
            }
        }
        float f7 = this.d - y;
        aVar4 = ao.B;
        if (f7 + (aVar4.A.o_() / 2.0f) > com.censivn.C3DEngine.a.g) {
            float f8 = -com.censivn.C3DEngine.a.g;
            aVar9 = ao.B;
            y = f8 + (aVar9.A.o_() / 2.0f) + this.d;
        } else {
            float f9 = this.d - y;
            aVar5 = ao.B;
            if (f9 - (aVar5.A.o_() / 2.0f) < com.censivn.C3DEngine.a.h) {
                float f10 = -com.censivn.C3DEngine.a.h;
                aVar6 = ao.B;
                y = (f10 - (aVar6.A.o_() / 2.0f)) + this.d;
            }
        }
        aVar7 = ao.B;
        aVar7.L().x = this.c + x;
        aoVar = this.a.G;
        aoVar.L().x = x + this.e;
        aVar8 = ao.B;
        aVar8.L().y = this.d - y;
        aoVar2 = this.a.G;
        aoVar2.L().y = this.f - y;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        ao aoVar;
        com.tsf.shell.workspace3D.k.a aVar;
        com.tsf.shell.workspace3D.k.a aVar2;
        com.tsf.shell.workspace3D.k.a aVar3;
        com.tsf.shell.workspace3D.k.a aVar4;
        com.tsf.shell.workspace3D.k.a aVar5;
        com.tsf.shell.workspace3D.k.a aVar6;
        com.tsf.shell.workspace3D.k.a aVar7;
        aoVar = this.a.G;
        aoVar.a_(false);
        aVar = ao.B;
        com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) aVar.C.getLayoutParams();
        aVar2 = ao.B;
        float f = aVar2.L().x;
        aVar3 = ao.B;
        int n_ = (int) ((f - (aVar3.A.n_() / 2.0f)) + com.censivn.C3DEngine.a.n);
        aVar4 = ao.B;
        float f2 = (-aVar4.L().y) + com.censivn.C3DEngine.a.o;
        aVar5 = ao.B;
        int[] iArr = {n_, (int) (f2 - (aVar5.A.o_() / 2.0f)), lVar.d, lVar.e};
        aVar6 = ao.B;
        LauncherItem3DInfo be = aVar6.be();
        if (com.censivn.C3DEngine.a.q) {
            int i = iArr[0];
            lVar.a = i;
            be.cellX = i;
            int i2 = iArr[1];
            lVar.b = i2;
            be.cellY = i2;
        } else {
            int i3 = iArr[0];
            lVar.a = i3;
            be.cellXH = i3;
            int i4 = iArr[1];
            lVar.b = i4;
            be.cellYH = i4;
        }
        aVar7 = ao.B;
        at atVar = new at(this, aVar7);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(atVar);
    }
}
