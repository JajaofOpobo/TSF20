package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class ad implements Runnable {
    final /* synthetic */ ab a;
    private final /* synthetic */ float[] b;
    private final /* synthetic */ a c;
    private final /* synthetic */ MotionEvent d;

    ad(ab abVar, float[] fArr, a aVar, MotionEvent motionEvent) {
        this.a = abVar;
        this.b = fArr;
        this.c = aVar;
        this.d = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        a aVar;
        float f2;
        float f3;
        float f4;
        a aVar2;
        Number3d number3d;
        a aVar3;
        float f5;
        a aVar4;
        Number3d number3d2;
        com.censivn.C3DEngine.e.b bVar;
        a aVar5;
        float f6;
        a aVar6;
        Number3d number3d3;
        float f7 = this.b[1];
        f = this.a.t;
        float f8 = f7 - f;
        if (f8 > 50.0f) {
            aVar5 = this.a.x;
            Number3d M = aVar5.M();
            f6 = this.a.p;
            M.x = f6;
            aVar6 = this.a.x;
            PositionNumber3d L = aVar6.L();
            number3d3 = this.a.y;
            L.z = number3d3.z;
            ab.a(this.a, this.b[0], this.b[1], this.c);
        } else if (f8 < -50.0f) {
            aVar3 = this.a.x;
            Number3d M2 = aVar3.M();
            f5 = this.a.q;
            M2.x = f5;
            aVar4 = this.a.x;
            PositionNumber3d L2 = aVar4.L();
            number3d2 = this.a.y;
            L2.z = number3d2.z - ((f8 + 50.0f) / 2.0f);
        } else {
            aVar = this.a.x;
            Number3d M3 = aVar.M();
            f2 = this.a.q;
            f3 = this.a.p;
            f4 = this.a.q;
            M3.x = (((f8 + 50.0f) / 100.0f) * (f3 - f4)) + f2;
            aVar2 = this.a.x;
            PositionNumber3d L3 = aVar2.L();
            number3d = this.a.y;
            L3.z = number3d.z;
            ab.a(this.a, this.b[0], this.b[1], this.c);
        }
        if (this.c.aG() != -1 && !this.c.o() && this.a.a.l > 2) {
            float[] a = com.censivn.C3DEngine.h.a.a(this.d);
            bVar = this.a.G;
            if (bVar.b(a[0], a[1])) {
                ab.a(this.a, this.c);
            } else {
                this.a.c(this.c);
            }
        }
    }
}
