package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class f extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(b bVar, r rVar) {
        super(rVar);
        this.a = bVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        v vVar;
        v vVar2;
        this.a.am = true;
        float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
        b bVar = this.a;
        float f = a[0];
        vVar = this.a.a;
        bVar.ak = (int) (f - vVar.L().x);
        b bVar2 = this.a;
        float f2 = a[1];
        vVar2 = this.a.a;
        bVar2.al = (int) (f2 - vVar2.L().y);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.a.am = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        v vVar;
        v vVar2;
        z = this.a.am;
        if (z) {
            float[] a = com.censivn.C3DEngine.h.a.a(motionEvent2);
            b bVar = this.a;
            float f = a[0];
            vVar = this.a.a;
            bVar.ak = (int) (f - vVar.L().x);
            b bVar2 = this.a;
            float f2 = a[1];
            vVar2 = this.a.a;
            bVar2.al = (int) (f2 - vVar2.L().y);
        }
    }
}
