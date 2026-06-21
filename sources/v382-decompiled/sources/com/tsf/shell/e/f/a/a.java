package com.tsf.shell.e.f.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends d {
    private b b;
    private a c;
    private a d;
    private int e;
    private com.tsf.shell.e.f.a.b.l f;
    public float a = 0.0f;
    private boolean g = false;
    private boolean h = false;

    public void a() {
        Iterator it = children().iterator();
        int i = 0;
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                Number3d number3d = (Number3d) m.E.get(i);
                jVar.position().x = number3d.x;
                jVar.position().y = number3d.y;
                jVar.rotation().x = 0.0f;
                jVar.rotation().y = 0.0f;
                jVar.rotation().z = 0.0f;
                jVar.scale().x = 1.0f;
                jVar.scale().y = 1.0f;
                i++;
            }
        }
    }

    public a(com.tsf.shell.e.f.a.b.l lVar, b bVar) {
        this.b = bVar;
        a(lVar);
    }

    public void a(com.tsf.shell.e.f.a.b.l lVar) {
        if (this.f != null) {
            this.f.a(this);
        }
        this.f = lVar;
        this.f.b(this);
    }

    public com.tsf.shell.e.f.a.b.l b() {
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
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

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        super.addChild(jVar);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public void addChild(com.censivn.C3DEngine.b.f.j jVar) {
        a(jVar, numChildren(), true);
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void addChildAt(com.censivn.C3DEngine.b.f.j jVar, int i) {
        a(jVar, i, true);
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar, int i, boolean z) {
        boolean z2;
        this.b.h_();
        int numChildren = numChildren();
        if (numChildren == m.m) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) children().get(numChildren - 1);
            if (this.g && com.tsf.shell.manager.a.h.n().t() == -1 && !com.tsf.shell.manager.a.h.t().aq()) {
                final com.censivn.C3DEngine.b.f.j a = com.tsf.shell.manager.a.h.t().a(cVar);
                a.removeFromParent();
                com.tsf.shell.manager.a.h.t().addChild(a);
                x xVar = new x() { // from class: com.tsf.shell.e.f.a.a.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        com.tsf.shell.manager.a.h.t().e(a);
                    }
                };
                xVar.f(com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.manager.o.b.a.T);
                w.a(a);
                w.a(a, VEasing.Linear.easeNone, xVar);
            }
            children().remove(cVar);
            if (this.d != null && this.d.e() != 0) {
                this.d.addChildAt(cVar, 0);
            } else {
                this.b.g_().addChildAt(cVar, 0);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (i >= numChildren) {
            i = z2 ? numChildren - 1 : numChildren;
        }
        super.addChildAt(jVar, i);
        a(i, z);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
    public boolean removeChild(com.censivn.C3DEngine.b.f.j jVar) {
        this.b.h_();
        int childIndexOf = getChildIndexOf(jVar);
        boolean removeChild = super.removeChild(jVar);
        if (numChildren() == 0) {
            this.b.a(this, this.c, this.d);
        } else {
            if (this.d != null && this.d.e() != 0) {
                com.tsf.shell.e.i.c c = this.d.c();
                this.d.removeChild(c);
                super.addChild(c);
                c.position().y = ((Number3d) m.E.get(numChildren() - 1)).y;
                c.position().x = com.censivn.C3DEngine.b.b.a.A + com.tsf.shell.manager.o.b.a.T;
            }
            a(childIndexOf, true);
        }
        return removeChild;
    }

    public com.tsf.shell.e.i.c c() {
        return (com.tsf.shell.e.i.c) getChildAt(0);
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
        int i = (int) ((f - ((Number3d) m.E.get(0)).x) / m.n);
        int i2 = -((int) ((f2 - ((Number3d) m.E.get(0)).y) / m.o));
        if (i >= 0 && i <= m.p - 1 && i2 >= 0 && i2 <= m.q - 1) {
            int i3 = (i2 * m.p) + i;
            int i4 = m.m;
            return i3 <= i4 ? i3 : i4;
        }
        return -1;
    }

    public void a(ArrayList arrayList) {
        children().clear();
        int e = m.m * e();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = e; i2 < m.m + e; i2++) {
            if (i2 < size) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) arrayList.get(i2);
                jVar.parent(this);
                children().add(jVar);
                b((com.tsf.shell.e.i.c) jVar, i, false);
                i++;
            }
        }
    }

    public void a(ArrayList arrayList, Runnable runnable) {
        Iterator it = children().iterator();
        x xVar = null;
        while (it.hasNext()) {
            final com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar instanceof com.tsf.shell.e.i.c) {
                xVar = new x() { // from class: com.tsf.shell.e.f.a.a.2
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        a.this.children().remove(jVar);
                    }
                };
                xVar.f(jVar.position().x + com.censivn.C3DEngine.b.b.a.D);
                w.a(jVar);
                w.a(jVar, 500, xVar);
            }
        }
        int numChildren = numChildren();
        int i = 0;
        while (i < numChildren) {
            com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) arrayList.get((m.m * e()) + i);
            Number3d number3d = (Number3d) m.E.get(i);
            x xVar2 = new x();
            xVar2.f(number3d.x);
            xVar2.h(number3d.y);
            if (!children().contains(jVar2)) {
                ((a) jVar2.parent()).children().remove(jVar2);
                jVar2.parent(null);
                a(jVar2);
                jVar2.position().x = number3d.x + com.censivn.C3DEngine.b.b.a.D;
                jVar2.position().y = number3d.y;
            }
            w.a(jVar2);
            w.a(jVar2, 500, xVar2);
            i++;
            xVar = xVar2;
        }
        if (xVar != null) {
            xVar.a(runnable);
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

    @Override // com.censivn.C3DEngine.b.f.j
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
        int numChildren = numChildren();
        while (i < numChildren) {
            b(getChildAt(i), i, z);
            i++;
        }
    }

    private void b(com.censivn.C3DEngine.b.f.j jVar, int i, boolean z) {
        if (this.g && z) {
            jVar.setAnimationObjectState(true);
            return;
        }
        Number3d number3d = (Number3d) m.E.get(i);
        jVar.position().x = number3d.x;
        jVar.position().y = number3d.y;
        jVar.scale().setAll(1.0f, 1.0f, 1.0f);
        jVar.setAnimationObjectState(false);
    }

    public void q() {
        Number3d number3d;
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.censivn.C3DEngine.b.f.j childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = m.E.size();
                if (i > size - 1) {
                    number3d = (Number3d) m.E.get(size - 1);
                } else {
                    number3d = (Number3d) m.E.get(i);
                }
                childAt.position().x = number3d.x;
                childAt.position().y = number3d.y;
                childAt.setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        Number3d number3d;
        int numChildren = numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.censivn.C3DEngine.b.f.j childAt = getChildAt(i);
            if (childAt.getAnimationObjectState()) {
                int size = m.E.size();
                if (i > size - 1) {
                    number3d = (Number3d) m.E.get(size - 1);
                } else {
                    number3d = (Number3d) m.E.get(i);
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

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (visible()) {
            onDrawStart();
            MatrixStack.glPushMatrix();
            draw();
            MatrixStack.glColor(alpha(), getDefaultColor());
            onDrawChildStart();
            if (renderChildren()) {
                int numChildren = numChildren();
                while (true) {
                    numChildren--;
                    if (numChildren <= -1) {
                        break;
                    }
                    com.censivn.C3DEngine.b.f.j childAt = getChildAt(numChildren);
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
