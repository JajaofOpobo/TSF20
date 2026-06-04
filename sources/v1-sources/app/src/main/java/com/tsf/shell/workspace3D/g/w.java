package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class w implements Runnable {
    final /* synthetic */ p a;
    private final /* synthetic */ MotionEvent b;

    w(p pVar, MotionEvent motionEvent) {
        this.a = pVar;
        this.b = motionEvent;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0053 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.censivn.C3DEngine.b.v vVar;
        com.tsf.shell.workspace3D.k.j jVar;
        com.censivn.C3DEngine.b.v vVar2;
        ArrayList arrayList;
        com.tsf.shell.workspace3D.k.c.b.c cVar;
        com.censivn.C3DEngine.b.v vVar3;
        int i;
        int i2;
        com.censivn.C3DEngine.b.v vVar4;
        com.censivn.C3DEngine.b.v vVar5;
        ArrayList arrayList2;
        p.i(this.a);
        this.a.p = false;
        vVar = this.a.f;
        vVar.a_(true);
        jVar = this.a.e;
        vVar2 = this.a.f;
        jVar.d(vVar2);
        arrayList = this.a.i;
        arrayList.clear();
        p pVar = this.a;
        cVar = this.a.c;
        pVar.d = cVar.j();
        p pVar2 = this.a;
        vVar3 = this.a.d;
        pVar2.j = vVar3.aB();
        for (int i3 = 0; i3 < i; i3++) {
            arrayList2 = this.a.i;
            arrayList2.add(new float[]{0.0f, 0.0f});
        }
        p pVar3 = this.a;
        i2 = this.a.j;
        pVar3.k = i2;
        vVar4 = this.a.d;
        Number3d c = vVar4.c(new Number3d(0.0f, 0.0f, 0.0f));
        this.a.l = (int) (com.censivn.C3DEngine.a.n + c.x);
        this.a.m = (int) (com.censivn.C3DEngine.a.o - c.y);
        this.a.n = this.b.getX();
        this.a.o = this.b.getY();
        vVar5 = this.a.d;
        Iterator it = vVar5.aD().iterator();
        while (it.hasNext()) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) ((com.censivn.C3DEngine.b.r) it.next());
            abVar.b(255.0f);
            abVar.a((Boolean) true);
            abVar.j(1.0f);
            abVar.e(true);
        }
        this.a.a = true;
    }
}
