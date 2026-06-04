package com.tsf.shell.workspace3D.k.b;

import android.view.MotionEvent;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ float[] b;
    private final /* synthetic */ MotionEvent c;
    private final /* synthetic */ MotionEvent d;

    h(g gVar, float[] fArr, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.a = gVar;
        this.b = fArr;
        this.c = motionEvent;
        this.d = motionEvent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        com.censivn.C3DEngine.b.v vVar4;
        com.tsf.shell.workspace3D.g.i iVar;
        com.tsf.shell.workspace3D.h.a k = bf.j().k();
        vVar = this.a.c.a;
        vVar.Q();
        vVar2 = this.a.c.a;
        k.g(vVar2);
        vVar3 = this.a.c.a;
        vVar3.L().x = this.b[0];
        vVar4 = this.a.c.a;
        vVar4.L().y = this.b[1];
        iVar = this.a.c.b;
        iVar.a(this.c, this.d);
    }
}
