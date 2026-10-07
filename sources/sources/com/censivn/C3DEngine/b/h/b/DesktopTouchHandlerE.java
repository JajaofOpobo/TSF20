package com.censivn.C3DEngine.b.h.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DesktopTouchHandlerE extends BaseRenderable {
    private BaseRenderable a;
    private ArrayList<Number3d> b;
    private DesktopTouchHandlerD d;
    private Number3d c = new Number3d();
    private int f = com.censivn.C3DEngine.b.b.ScreenConstants.B;
    private int g = com.censivn.C3DEngine.b.b.ScreenConstants.C;
    private int h = com.censivn.C3DEngine.b.b.ScreenConstants.z;
    private int i = com.censivn.C3DEngine.b.b.ScreenConstants.A;
    private boolean j = false;
    private DesktopTouchHandler e = new DesktopTouchHandler(this);

    public boolean a(boolean z) {
        return true;
    }

    public DesktopTouchHandlerE() {
        setMouseEventListener(this.e);
        this.a = new BaseRenderable();
        addChild(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        this.DesktopTouchHandlerD.e();
    }

    public void a(DesktopTouchHandlerD dVar) {
        this.d = dVar;
        this.DesktopTouchHandlerE.a(this);
    }

    public DesktopTouchHandlerD a() {
        return this.d;
    }

    public BaseRenderable b() {
        return this.a;
    }

    public void a(int i, int i2, int i3, int i4) {
        setAABBPX(i, i2, 0.0f, i3, i4, 0.0f);
    }

    public void a(ArrayList<Number3d> arrayList) {
        this.b = arrayList;
    }

    public ArrayList<IRenderable> c() {
        ArrayList<IRenderable> arrayList = new ArrayList<>();
        Iterator<IRenderable> it = this.DesktopTouchHandler.children().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderable
    public void destroy() {
        if (this.b != null) {
            this.DesktopTouchHandlerB.clear();
        }
        this.d = null;
        this.c = null;
        super.destroy();
    }

    public void a(ArrayList<com.tsf.shell.f.i.PageItem> arrayList, int i) {
        int i2 = i;
        for (com.tsf.shell.f.i.PageItem bVar : arrayList) {
            bVar.mouseEnabled(false);
            bVar.removeFromParent();
            this.DesktopTouchHandler.addChildAt(bVar, i2);
            bVar.a(i2);
            i2++;
            this.DesktopTouchHandlerD.e(bVar);
        }
        b(i);
    }

    public void b(ArrayList<com.tsf.shell.f.i.PageItem> arrayList) {
        Iterator<com.tsf.shell.f.i.PageItem> it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void a(com.tsf.shell.f.i.PageItem bVar) {
        bVar.mouseEnabled(false);
        if (bVar.parent() != null) {
            this.DesktopTouchHandler.globalToLocal(bVar.position());
            bVar.removeFromParent();
        }
        this.DesktopTouchHandler.addChild(bVar);
        bVar.a(this.DesktopTouchHandler.numChildren() - 1);
    }

    public int b(com.tsf.shell.f.i.PageItem bVar) {
        int iJ = bVar.J();
        this.DesktopTouchHandler.removeChild(bVar);
        b(iJ);
        return iJ;
    }

    public Number3d a(int i) {
        return this.DesktopTouchHandlerB.get(i);
    }

    public boolean a(com.tsf.shell.f.i.PageItem bVar, float f, float f2) {
        return a(bVar, DesktopTouchHandlerF, f2, false, false);
    }

    public boolean a(com.tsf.shell.f.i.PageItem bVar, float f, float f2, boolean z, boolean z2) {
        int i = com.tsf.shell.manager.o.b.a.L;
        int i2 = com.tsf.shell.manager.o.b.a.N;
        int i3 = com.tsf.shell.manager.o.b.a.M;
        int i4 = com.tsf.shell.manager.o.b.a.O;
        int iJ = bVar.J();
        float[] fArrB = GraphicsEngineBridge.b(f, f2);
        float f3 = fArrB[0];
        float f4 = fArrB[1];
        float f5 = f3 - this.c.x;
        float f6 = f4 - this.c.y;
        if (this.j) {
            if (!z) {
                if (f3 > this.i) {
                    return this.DesktopTouchHandlerD.a(5);
                }
                if (f3 < this.h) {
                    return this.DesktopTouchHandlerD.a(-4);
                }
            }
            if (!z2) {
                if (f4 > this.f) {
                    return this.DesktopTouchHandlerD.a(-2);
                }
                if (f4 < this.g) {
                    return this.DesktopTouchHandlerD.a(-3);
                }
            }
        }
        int iNumChildren = this.DesktopTouchHandler.numChildren() + 1;
        for (int i5 = 0; i5 < iNumChildren; i5++) {
            Number3d number3d = this.DesktopTouchHandlerB.get(i5);
            if (f5 > i + number3d.x && f5 < i3 + number3d.x && f6 > i2 + number3d.y) {
                if (f6 < number3d.y + i4 && iJ != i5) {
                    a(bVar, i5);
                    return false;
                }
            }
        }
        this.DesktopTouchHandlerD.a(-1);
        return false;
    }

    public void a(com.tsf.shell.f.i.PageItem bVar, int i) {
        int iJ = bVar.J();
        int iMin = Math.min(iJ, i);
        int iAbs = Math.abs(iJ - i);
        bVar.a(i);
        int i2 = iJ > i ? 1 : 0;
        for (int i3 = iMin; i3 < iMin + iAbs; i3++) {
            com.tsf.shell.f.i.PageItem bVar2 = (com.tsf.shell.f.i.PageItem) this.DesktopTouchHandler.children().get(i3);
            bVar2.a(i3 + i2);
            f(bVar2);
        }
    }

    void d() {
    }

    void a(int i, i iVar) {
        int size = this.DesktopTouchHandler.children().size();
        while (i < size) {
            com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) this.DesktopTouchHandler.children().get(i);
            bVar.a(i);
            if (iVar != bVar) {
                f(bVar);
            }
            i++;
        }
    }

    void b(int i) {
        int size = this.DesktopTouchHandler.children().size();
        while (i < size) {
            com.tsf.shell.f.i.PageItem bVar = (com.tsf.shell.f.i.PageItem) this.DesktopTouchHandler.children().get(i);
            bVar.a(i);
            f(bVar);
            i++;
        }
    }

    private void f(com.tsf.shell.f.i.PageItem bVar) {
        Number3d number3dA = a(bVar.J());
        this.DesktopTouchHandlerD.a(bVar, number3dA);
        if (bVar.visible()) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.DesktopTouchHandlerG.TweenParams();
            dVar.f(number3dA.x);
            dVar.h(number3dA.y);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVar);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVar, 300, dVar);
            return;
        }
        bVar.position().x = number3dA.x;
        bVar.position().y = number3dA.y;
    }

    public void c(com.tsf.shell.f.i.PageItem bVar) {
        e();
        this.DesktopTouchHandlerD.b(bVar);
    }

    public void e() {
        this.c.x = 0.0f;
        this.c.y = 0.0f;
        this.c.z = 0.0f;
        this.DesktopTouchHandler.localToGlobal(this.c);
    }

    public void c(MotionEvent motionEvent) {
    }

    public void b(MotionEvent motionEvent) {
    }

    public void d(MotionEvent motionEvent) {
    }

    public void a(MotionEvent motionEvent) {
    }

    public void d(com.tsf.shell.f.i.PageItem bVar) {
        this.DesktopTouchHandlerD.c(bVar);
    }

    public boolean e(com.tsf.shell.f.i.PageItem bVar) {
        b(bVar);
        this.DesktopTouchHandlerD.d(bVar);
        return true;
    }

    public com.tsf.shell.f.i.PageItem e(MotionEvent motionEvent) {
        float[] fArrA = GraphicsEngineBridge.a(motionEvent);
        float f = fArrA[0];
        float f2 = fArrA[1];
        for (i iVar : this.DesktopTouchHandler.children()) {
            if (iVar.calTouchCollision(f, f2)) {
                return (com.tsf.shell.f.i.PageItem) iVar;
            }
        }
        return null;
    }
}
