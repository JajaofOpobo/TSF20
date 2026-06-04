package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ i a;
    private final /* synthetic */ MotionEvent b;
    private final /* synthetic */ MotionEvent c;

    j(i iVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.a = iVar;
        this.b = motionEvent;
        this.c = motionEvent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.a.a aVar;
        boolean z;
        y yVar;
        float f;
        float f2;
        boolean z2;
        ArrayList arrayList;
        com.censivn.C3DEngine.b.r rVar;
        o oVar;
        ArrayList arrayList2;
        y yVar2;
        String str;
        y unused;
        aVar = i.d;
        if (aVar.a() <= 200) {
            z = this.a.k;
            if (z) {
                this.a.t = this.b.getX();
                this.a.u = this.b.getY();
                this.a.m = bf.j().A();
                this.a.k = false;
                i.a(this.a, this.b);
                k kVar = new k(this, this.b);
                com.censivn.C3DEngine.a.a();
                com.censivn.C3DEngine.b.w.a(kVar);
            }
            yVar = this.a.q;
            if (yVar != null) {
                yVar2 = this.a.q;
                if (yVar2.b()) {
                    unused = this.a.q;
                    y.a().a(this.b, this.c);
                    return;
                }
            }
            float x = this.b.getX();
            float y = this.b.getY();
            float x2 = this.c.getX();
            float y2 = this.c.getY();
            f = this.a.t;
            f2 = this.a.u;
            if (com.censivn.C3DEngine.h.a.b(f, f2, x2, y2) > 10.0f) {
                this.a.t = x2;
                this.a.u = y2;
                i iVar = this.a;
                i.a((float) Math.sqrt(Math.pow(this.b.getX() - this.c.getX(), 2.0d) + Math.pow(this.b.getY() - this.c.getY(), 2.0d)));
                i.a(this.a, this.b, this.c);
                l lVar = new l(this, this.c);
                com.censivn.C3DEngine.a.a();
                com.censivn.C3DEngine.b.w.a(lVar);
                z2 = this.a.p;
                if (!z2 || com.censivn.C3DEngine.h.a.b(x, y, x2, y2) >= 50.0f) {
                    arrayList = this.a.m;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.censivn.C3DEngine.b.r rVar2 = (com.censivn.C3DEngine.b.r) it.next();
                        if (rVar2 instanceof x) {
                            rVar = this.a.o;
                            if (rVar2 != rVar) {
                                x xVar = (x) rVar2;
                                if (!xVar.a() && xVar.b()) {
                                    i iVar2 = this.a;
                                    if (i.a(rVar2, x, y, x2, y2)) {
                                        xVar.a(true);
                                        oVar = this.a.n;
                                        oVar.a(xVar);
                                        this.a.p = true;
                                        arrayList2 = this.a.r;
                                        arrayList2.add(xVar);
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                this.a.b((MotionEvent) null);
                return;
            }
            return;
        }
        this.a.a((MotionEvent) null);
        this.a.l = true;
        str = i.j;
        com.tsf.shell.au.a(str);
    }
}
