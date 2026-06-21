package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends l {
    private l a;
    private ArrayList b;
    private e d;
    private Number3d c = new Number3d();
    private int f = com.censivn.C3DEngine.b.b.a.B;
    private int g = com.censivn.C3DEngine.b.b.a.C;
    private int h = com.censivn.C3DEngine.b.b.a.z;
    private int i = com.censivn.C3DEngine.b.b.a.A;
    private boolean j = false;
    private a e = new a(this);

    public boolean a(boolean z) {
        return true;
    }

    public f() {
        setMouseEventListener(this.e);
        this.a = new l();
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        this.d.e();
    }

    public void a(e eVar) {
        this.d = eVar;
        this.e.a(this);
    }

    public e a() {
        return this.d;
    }

    public l b() {
        return this.a;
    }

    public void a(int i, int i2, int i3, int i4) {
        setAABBPX(i, i2, 0.0f, i3, i4, 0.0f);
    }

    public void a(ArrayList arrayList) {
        this.b = arrayList;
    }

    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.children().iterator();
        while (it.hasNext()) {
            arrayList.add((com.censivn.C3DEngine.b.f.j) it.next());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        if (this.b != null) {
            this.b.clear();
        }
        this.d = null;
        this.c = null;
        super.destroy();
    }

    public void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        int i2 = i;
        while (it.hasNext()) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
            cVar.mouseEnabled(false);
            cVar.removeFromParent();
            this.a.addChildAt(cVar, i2);
            cVar.a(i2);
            i2++;
            this.d.e(cVar);
        }
        b(i);
    }

    public void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((com.tsf.shell.e.i.c) it.next());
        }
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        cVar.mouseEnabled(false);
        if (cVar.parent() != null) {
            this.a.globalToLocal(cVar.position());
            cVar.removeFromParent();
        }
        this.a.addChild(cVar);
        cVar.a(this.a.numChildren() - 1);
    }

    public int b(com.tsf.shell.e.i.c cVar) {
        int J = cVar.J();
        this.a.removeChild(cVar);
        b(J);
        return J;
    }

    public Number3d a(int i) {
        return (Number3d) this.b.get(i);
    }

    public boolean a(com.tsf.shell.e.i.c cVar, float f, float f2) {
        return a(cVar, f, f2, false, false);
    }

    public boolean a(com.tsf.shell.e.i.c cVar, float f, float f2, boolean z, boolean z2) {
        int i = com.tsf.shell.manager.o.b.a.L;
        int i2 = com.tsf.shell.manager.o.b.a.N;
        int i3 = com.tsf.shell.manager.o.b.a.M;
        int i4 = com.tsf.shell.manager.o.b.a.O;
        int J = cVar.J();
        float[] b = x.b(f, f2);
        float f3 = b[0];
        float f4 = b[1];
        float f5 = f3 - this.c.x;
        float f6 = f4 - this.c.y;
        if (this.j) {
            if (!z) {
                if (f3 > this.i) {
                    return this.d.a(5);
                }
                if (f3 < this.h) {
                    return this.d.a(-4);
                }
            }
            if (!z2) {
                if (f4 > this.f) {
                    return this.d.a(-2);
                }
                if (f4 < this.g) {
                    return this.d.a(-3);
                }
            }
        }
        int numChildren = this.a.numChildren() + 1;
        for (int i5 = 0; i5 < numChildren; i5++) {
            Number3d number3d = (Number3d) this.b.get(i5);
            if (f5 > i + number3d.x && f5 < i3 + number3d.x && f6 > i2 + number3d.y) {
                if (f6 < number3d.y + i4 && J != i5) {
                    a(cVar, i5);
                    return false;
                }
            }
        }
        this.d.a(-1);
        return false;
    }

    public void a(com.tsf.shell.e.i.c cVar, int i) {
        int J = cVar.J();
        int min = Math.min(J, i);
        int abs = Math.abs(J - i);
        cVar.a(i);
        int i2 = J > i ? 1 : 0;
        for (int i3 = min; i3 < min + abs; i3++) {
            com.tsf.shell.e.i.c cVar2 = (com.tsf.shell.e.i.c) this.a.children().get(i3);
            cVar2.a(i3 + i2);
            f(cVar2);
        }
    }

    void d() {
    }

    void a(int i, com.censivn.C3DEngine.b.f.j jVar) {
        int size = this.a.children().size();
        while (i < size) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.a.children().get(i);
            cVar.a(i);
            if (jVar != cVar) {
                f(cVar);
            }
            i++;
        }
    }

    void b(int i) {
        int size = this.a.children().size();
        while (i < size) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) this.a.children().get(i);
            cVar.a(i);
            f(cVar);
            i++;
        }
    }

    private void f(com.tsf.shell.e.i.c cVar) {
        Number3d a = a(cVar.J());
        this.d.a(cVar, a);
        if (cVar.visible()) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.f(a.x);
            xVar.h(a.y);
            w.a(cVar);
            w.a(cVar, 300, xVar);
            return;
        }
        cVar.position().x = a.x;
        cVar.position().y = a.y;
    }

    public void c(com.tsf.shell.e.i.c cVar) {
        e();
        this.d.b(cVar);
    }

    public void e() {
        this.c.x = 0.0f;
        this.c.y = 0.0f;
        this.c.z = 0.0f;
        this.a.localToGlobal(this.c);
    }

    public void c(MotionEvent motionEvent) {
    }

    public void b(MotionEvent motionEvent) {
    }

    public void d(MotionEvent motionEvent) {
    }

    public void a(MotionEvent motionEvent) {
    }

    public void d(com.tsf.shell.e.i.c cVar) {
        this.d.c(cVar);
    }

    public boolean e(com.tsf.shell.e.i.c cVar) {
        b(cVar);
        this.d.d(cVar);
        return true;
    }

    public com.tsf.shell.e.i.c e(MotionEvent motionEvent) {
        float[] a = x.a(motionEvent);
        float f = a[0];
        float f2 = a[1];
        Iterator it = this.a.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar.calTouchCollision(f, f2)) {
                return (com.tsf.shell.e.i.c) jVar;
            }
        }
        return null;
    }
}
