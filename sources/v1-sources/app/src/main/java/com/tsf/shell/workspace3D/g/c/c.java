package com.tsf.shell.workspace3D.g.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class c extends com.censivn.C3DEngine.b.l {
    boolean a;
    final /* synthetic */ a c;
    private final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar, com.censivn.C3DEngine.b.r rVar, j jVar) {
        super(rVar);
        this.c = aVar;
        this.d = jVar;
        this.a = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        v vVar;
        v unused;
        this.a = false;
        this.c.u = true;
        a.a(this.c, this.d);
        vVar = this.c.i;
        vVar.a_(true);
        unused = this.c.i;
        v.u();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        v vVar;
        int i;
        ArrayList arrayList;
        j jVar;
        int i2 = 0;
        this.c.u = false;
        if (!this.a) {
            a aVar = this.c;
            jVar = this.c.t;
            a.b(aVar, jVar);
        }
        a.a(this.c, (j) null);
        vVar = this.c.i;
        vVar.a_(false);
        while (true) {
            int i3 = i2;
            i = this.c.o;
            if (i3 < i) {
                arrayList = this.c.g;
                ((j) arrayList.get(i3)).a_(true);
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0053 */
    @Override // com.censivn.C3DEngine.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        v vVar;
        int i;
        ArrayList arrayList;
        float f;
        j jVar = null;
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent2);
        Number3d.TEMPNUMBER3D3.reset();
        Number3d.TEMPNUMBER3D.x = a[0];
        Number3d.TEMPNUMBER3D.y = a[1];
        vVar = this.c.i;
        vVar.d(Number3d.TEMPNUMBER3D);
        float d = com.censivn.C3DEngine.h.a.d(0.0f, 0.0f, Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y) - 90.0f;
        if (com.censivn.C3DEngine.h.a.b(0.0f, 0.0f, Number3d.TEMPNUMBER3D.x, Number3d.TEMPNUMBER3D.y) < com.censivn.C3DEngine.a.b * 350.0f) {
            float f2 = 2.1474836E9f;
            int i2 = 0;
            j jVar2 = null;
            while (i2 < i) {
                arrayList = this.c.g;
                j jVar3 = (j) arrayList.get(i2);
                float abs = Math.abs(d - jVar3.M().z);
                if (abs < f2) {
                    f = abs;
                } else {
                    jVar3 = jVar2;
                    f = f2;
                }
                i2++;
                f2 = f;
                jVar2 = jVar3;
            }
            if (f2 <= 30.0f) {
                jVar = jVar2;
            }
        }
        a.a(this.c, jVar);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        this.a = true;
        a.b(this.c, this.d);
    }
}
