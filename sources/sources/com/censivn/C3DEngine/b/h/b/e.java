package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends j {
    private j a;
    private ArrayList<Number3d> b;
    private d d;
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

    public e() {
        setMouseEventListener(this.e);
        this.a = new j();
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        this.d.e();
    }

    public void a(d dVar) {
        this.d = dVar;
        this.e.a(this);
    }

    public d a() {
        return this.d;
    }

    public j b() {
        return this.a;
    }

    public void a(int i, int i2, int i3, int i4) {
        setAABBPX(i, i2, 0.0f, i3, i4, 0.0f);
    }

    public void a(ArrayList<Number3d> arrayList) {
        this.b = arrayList;
    }

    public ArrayList<i> c() {
        ArrayList<i> arrayList = new ArrayList<>();
        Iterator<i> it = this.a.children().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        if (this.b != null) {
            this.b.clear();
        }
        this.d = null;
        this.c = null;
        super.destroy();
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList, int i) {
        int i2 = i;
        for (com.tsf.shell.f.i.b bVar : arrayList) {
            bVar.mouseEnabled(false);
            bVar.removeFromParent();
            this.a.addChildAt(bVar, i2);
            bVar.a(i2);
            i2++;
            this.d.e(bVar);
        }
        b(i);
    }

    public void b(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        Iterator<com.tsf.shell.f.i.b> it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        bVar.mouseEnabled(false);
        if (bVar.parent() != null) {
            this.a.globalToLocal(bVar.position());
            bVar.removeFromParent();
        }
        this.a.addChild(bVar);
        bVar.a(this.a.numChildren() - 1);
    }

    public int b(com.tsf.shell.f.i.b bVar) {
        int iJ = bVar.J();
        this.a.removeChild(bVar);
        b(iJ);
        return iJ;
    }

    public Number3d a(int i) {
        return this.b.get(i);
    }

    public boolean a(com.tsf.shell.f.i.b bVar, float f, float f2) {
        return a(bVar, f, f2, false, false);
    }

    public boolean a(com.tsf.shell.f.i.b bVar, float f, float f2, boolean z, boolean z2) {
        int i = com.tsf.shell.manager.o.b.a.L;
        int i2 = com.tsf.shell.manager.o.b.a.N;
        int i3 = com.tsf.shell.manager.o.b.a.M;
        int i4 = com.tsf.shell.manager.o.b.a.O;
        int iJ = bVar.J();
        float[] fArrB = x.b(f, f2);
        float f3 = fArrB[0];
        float f4 = fArrB[1];
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
        int iNumChildren = this.a.numChildren() + 1;
        for (int i5 = 0; i5 < iNumChildren; i5++) {
            Number3d number3d = this.b.get(i5);
            if (f5 > i + number3d.x && f5 < i3 + number3d.x && f6 > i2 + number3d.y) {
                if (f6 < number3d.y + i4 && iJ != i5) {
                    a(bVar, i5);
                    return false;
                }
            }
        }
        this.d.a(-1);
        return false;
    }

    public void a(com.tsf.shell.f.i.b bVar, int i) {
        int iJ = bVar.J();
        int iMin = Math.min(iJ, i);
        int iAbs = Math.abs(iJ - i);
        bVar.a(i);
        int i2 = iJ > i ? 1 : 0;
        for (int i3 = iMin; i3 < iMin + iAbs; i3++) {
            com.tsf.shell.f.i.b bVar2 = (com.tsf.shell.f.i.b) this.a.children().get(i3);
            bVar2.a(i3 + i2);
            f(bVar2);
        }
    }

    void d() {
    }

    void a(int i, i iVar) {
        int size = this.a.children().size();
        while (i < size) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) this.a.children().get(i);
            bVar.a(i);
            if (iVar != bVar) {
                f(bVar);
            }
            i++;
        }
    }

    void b(int i) {
        int size = this.a.children().size();
        while (i < size) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) this.a.children().get(i);
            bVar.a(i);
            f(bVar);
            i++;
        }
    }

    private void f(com.tsf.shell.f.i.b bVar) {
        Number3d number3dA = a(bVar.J());
        this.d.a(bVar, number3dA);
        if (bVar.visible()) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.f(number3dA.x);
            dVar.h(number3dA.y);
            com.censivn.C3DEngine.b.g.c.a(bVar);
            com.censivn.C3DEngine.b.g.c.a(bVar, 300, dVar);
            return;
        }
        bVar.position().x = number3dA.x;
        bVar.position().y = number3dA.y;
    }

    public void c(com.tsf.shell.f.i.b bVar) {
        e();
        this.d.b(bVar);
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

    public void d(com.tsf.shell.f.i.b bVar) {
        this.d.c(bVar);
    }

    public boolean e(com.tsf.shell.f.i.b bVar) {
        b(bVar);
        this.d.d(bVar);
        return true;
    }

    public com.tsf.shell.f.i.b e(MotionEvent motionEvent) {
        float[] fArrA = x.a(motionEvent);
        float f = fArrA[0];
        float f2 = fArrA[1];
        for (i iVar : this.a.children()) {
            if (iVar.calTouchCollision(f, f2)) {
                return (com.tsf.shell.f.i.b) iVar;
            }
        }
        return null;
    }
}
