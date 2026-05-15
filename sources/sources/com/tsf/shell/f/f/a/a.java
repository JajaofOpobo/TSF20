package com.tsf.shell.f.f.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.tsf.shell.f.f.a.b.k;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends c {
    private InterfaceC0101a b;
    private a c;
    private a d;
    private int e;
    private k f;
    public float a = 0.0f;
    private boolean g = false;
    private boolean h = false;

    /* JADX INFO: renamed from: com.tsf.shell.f.f.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0101a {
        void a(a aVar);

        void a(a aVar, a aVar2, a aVar3);

        a i_();

        void j_();
    }

    public void a() {
        int i = 0;
        Iterator<i> it = children().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i next = it.next();
                if (next instanceof com.tsf.shell.f.i.b) {
                    Number3d number3d = h.E.get(i2);
                    next.position().x = number3d.x;
                    next.position().y = number3d.y;
                    next.rotation().x = 0.0f;
                    next.rotation().y = 0.0f;
                    next.rotation().z = 0.0f;
                    next.scale().x = 1.0f;
                    next.scale().y = 1.0f;
                    i = i2 + 1;
                } else {
                    i = i2;
                }
            } else {
                return;
            }
        }
    }

    public a(k kVar, InterfaceC0101a interfaceC0101a) {
        this.b = interfaceC0101a;
        a(kVar);
    }

    public void a(k kVar) {
        if (this.f != null) {
            this.f.a(this);
        }
        this.f = kVar;
        this.f.b(this);
    }

    public k b() {
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void destroy() {
        children().clear();
        this.b = null;
        this.c = null;
        this.d = null;
        this.f.a(this);
        this.f = null;
        this.h = true;
        removeFromParent();
        super.destroy();
    }

    public void a(boolean z) {
        if (super.visible() && !z) {
            a(0.0f);
        }
        super.visible(Boolean.valueOf(z));
    }

    public void a(i iVar) {
        super.addChild(iVar);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        a(iVar, numChildren(), true);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void addChildAt(i iVar, int i) {
        a(iVar, i, true);
    }

    public void a(i iVar, int i, boolean z) {
        boolean z2;
        this.b.j_();
        int iNumChildren = numChildren();
        if (iNumChildren == h.m) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) children().get(iNumChildren - 1);
            if (this.g && com.tsf.shell.manager.a.h.n().t() == -1 && !com.tsf.shell.manager.a.h.t().aq()) {
                final i iVarA = com.tsf.shell.manager.a.h.t().a(bVar);
                iVarA.removeFromParent();
                com.tsf.shell.manager.a.h.t().addChild(iVarA);
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.a.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        com.tsf.shell.manager.a.h.t().e(iVarA);
                    }
                };
                dVar.f(com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.manager.o.b.a.T);
                com.censivn.C3DEngine.b.g.c.a(iVarA);
                com.censivn.C3DEngine.b.g.c.a(iVarA, VEasing.Linear.easeNone, dVar);
            }
            children().remove(bVar);
            if (this.d != null && this.d.e() != 0) {
                this.d.addChildAt(bVar, 0);
            } else {
                this.b.i_().addChildAt(bVar, 0);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (i >= iNumChildren) {
            i = z2 ? iNumChildren - 1 : iNumChildren;
        }
        super.addChildAt(iVar, i);
        a(i, z);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        this.b.j_();
        int childIndexOf = getChildIndexOf(iVar);
        boolean zRemoveChild = super.removeChild(iVar);
        if (numChildren() == 0) {
            this.b.a(this, this.c, this.d);
        } else {
            if (this.d != null && this.d.e() != 0) {
                com.tsf.shell.f.i.b bVarC = this.d.c();
                this.d.removeChild(bVarC);
                super.addChild(bVarC);
                bVarC.position().y = h.E.get(numChildren() - 1).y;
                bVarC.position().x = com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.manager.o.b.a.T;
            }
            a(childIndexOf, true);
        }
        return zRemoveChild;
    }

    public com.tsf.shell.f.i.b c() {
        return (com.tsf.shell.f.i.b) getChildAt(0);
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public void b(a aVar) {
        this.d = aVar;
    }

    public a d() {
        return this.d;
    }

    public void a(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        return this.g;
    }

    public int a(float f, float f2) {
        int i = (int) ((f - h.E.get(0).x) / h.n);
        int i2 = -((int) ((f2 - h.E.get(0).y) / h.o));
        if (i >= 0 && i <= h.p - 1 && i2 >= 0 && i2 <= h.q - 1) {
            int i3 = (i2 * h.p) + i;
            int i4 = h.m;
            return i3 <= i4 ? i3 : i4;
        }
        return -1;
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        children().clear();
        int iE = h.m * e();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = iE; i2 < h.m + iE; i2++) {
            if (i2 < size) {
                com.tsf.shell.f.i.b bVar = arrayList.get(i2);
                bVar.parent(this);
                children().add(bVar);
                b(bVar, i, false);
                i++;
            }
        }
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar = null;
        for (final i iVar : children()) {
            if (iVar instanceof com.tsf.shell.f.i.b) {
                dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.a.2
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        a.this.children().remove(iVar);
                    }
                };
                dVar.f(iVar.position().x + com.censivn.C3DEngine.b.b.a.D);
                com.censivn.C3DEngine.b.g.c.a(iVar);
                com.censivn.C3DEngine.b.g.c.a(iVar, 500, dVar);
            }
            dVar = dVar;
        }
        int iNumChildren = numChildren();
        int i = 0;
        while (i < iNumChildren) {
            com.tsf.shell.f.i.b bVar = arrayList.get((h.m * e()) + i);
            Number3d number3d = h.E.get(i);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.f(number3d.x);
            dVar2.h(number3d.y);
            if (!children().contains(bVar)) {
                ((a) bVar.parent()).children().remove(bVar);
                bVar.parent(null);
                a(bVar);
                bVar.position().x = number3d.x + com.censivn.C3DEngine.b.b.a.D;
                bVar.position().y = number3d.y;
            }
            com.censivn.C3DEngine.b.g.c.a(bVar);
            com.censivn.C3DEngine.b.g.c.a(bVar, 500, dVar2);
            i++;
            dVar = dVar2;
        }
        if (dVar != null) {
            dVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void g() {
        this.f.g(this);
    }

    public void h() {
        this.f.h(this);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawEnd() {
        this.b.a(this);
    }

    public void a(float f) {
        this.a = f;
        if (this.f != null) {
            this.f.a(this, f);
        }
    }

    public void i() {
        if (this.d != null) {
            this.d.a(this.a + 1.0f);
        }
    }

    public void j() {
        if (this.c != null) {
            this.c.a(this.a - 1.0f);
        }
    }

    private void u() {
        if (this.d != null) {
            if (this.a < 0.0f) {
                this.d.a(this.a + 1.0f);
                this.d.a(true);
            } else {
                this.d.a(false);
            }
        }
    }

    private void v() {
        if (this.c != null) {
            if (this.a > 0.0f) {
                this.c.a(this.a - 1.0f);
                this.c.a(true);
            } else {
                this.c.a(false);
            }
        }
    }

    public void b(float f) {
        a(f);
        if (this.a < 0.0f) {
            if (this.d != null) {
                this.d.a(f + 1.0f);
                this.d.u();
                this.d.a(true);
            }
            if (this.c != null) {
                this.c.a(false);
                return;
            }
            return;
        }
        if (this.a > 0.0f) {
            if (this.c != null) {
                this.c.a(f - 1.0f);
                this.c.v();
                this.c.a(true);
            }
            if (this.d != null) {
                this.d.a(false);
                return;
            }
            return;
        }
        if (this.d != null) {
            this.d.a(false);
        }
        if (this.c != null) {
            this.c.a(false);
        }
    }

    public void k() {
        this.f.a(this, 0.0f);
        this.f.e(this);
    }

    public void l() {
        k();
    }

    public void m() {
        this.f.c(this);
    }

    public void n() {
        this.f.d(this);
    }

    public void o() {
        this.g = false;
        this.f.e(this);
    }

    public void p() {
        this.g = true;
        this.f.f(this);
    }

    private void a(int i, boolean z) {
        int iNumChildren = numChildren();
        while (i < iNumChildren) {
            b(getChildAt(i), i, z);
            i++;
        }
    }

    private void b(i iVar, int i, boolean z) {
        if (this.g && z) {
            iVar.setAnimationObjectState(true);
            return;
        }
        Number3d number3d = h.E.get(i);
        iVar.position().x = number3d.x;
        iVar.position().y = number3d.y;
        iVar.scale().setAll(1.0f, 1.0f, 1.0f);
        iVar.setAnimationObjectState(false);
    }

    public void q() {
        Number3d number3d;
        int iNumChildren = numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = h.E.size();
                if (i > size - 1) {
                    number3d = h.E.get(size - 1);
                } else {
                    number3d = h.E.get(i);
                }
                childAt.position().x = number3d.x;
                childAt.position().y = number3d.y;
                childAt.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        Number3d number3d;
        int iNumChildren = numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            i childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = h.E.size();
                if (i > size - 1) {
                    number3d = h.E.get(size - 1);
                } else {
                    number3d = h.E.get(i);
                }
                childAt.position().x += (number3d.x - childAt.position().x) * 0.11f;
                childAt.position().y += (number3d.y - childAt.position().y) * 0.11f;
                if (Math.abs(childAt.position().x - number3d.x) < 0.1f && Math.abs(childAt.position().y - number3d.y) < 0.1f) {
                    childAt.position().x = number3d.x;
                    childAt.position().y = number3d.y;
                    childAt.setAnimationObjectState(false);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int iNumChildren = numChildren();
                while (true) {
                    iNumChildren--;
                    if (iNumChildren <= -1) {
                        break;
                    }
                    i childAt = getChildAt(iNumChildren);
                    onDrawChildStart(childAt);
                    childAt.dispatchDraw();
                    onDrawChildEnd(childAt);
                }
            }
            onDrawChildEnd();
            MatrixStack.glPopMatrix();
            onDrawEnd();
        }
    }
}
