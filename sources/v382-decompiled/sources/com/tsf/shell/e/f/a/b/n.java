package com.tsf.shell.e.f.a.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n extends l {
    private static int a = 1;
    private static int b = 2;
    private static int c = 3;
    private int d;
    private int e;
    private float f;
    private ArrayList g;
    private ArrayList h;
    private Number3d i;
    private o j;
    private ArrayList k;
    private boolean l;

    public abstract void a(int i, int i2, int i3, int i4, float f, ArrayList arrayList);

    public n(int i, int i2, boolean z) {
        super(i, i2, z);
        this.l = true;
        this.i = new Number3d();
        this.j = new o(this);
        this.k = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(int i, int i2, int i3, int i4, ArrayList arrayList) {
        this.d = i;
        this.h = arrayList;
        this.e = arrayList.size();
        this.f = this.d * 0.55f;
        a(i, i2, i3, i4, this.f, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.e.f.a.a aVar, int i) {
        aVar.b(i);
    }

    private void b(com.tsf.shell.e.f.a.a aVar, int i) {
        aVar.c(i);
    }

    private void a(com.tsf.shell.e.f.a.a aVar, boolean z) {
        aVar.b(z);
    }

    private int i(com.tsf.shell.e.f.a.a aVar) {
        return aVar.r();
    }

    private int j(com.tsf.shell.e.f.a.a aVar) {
        return aVar.s();
    }

    private boolean k(com.tsf.shell.e.f.a.a aVar) {
        return aVar.t();
    }

    public p a(int i) {
        p pVar;
        if (i < this.g.size()) {
            pVar = (p) this.g.get(i);
        } else {
            pVar = new p();
            this.g.add(pVar);
        }
        pVar.a();
        return pVar;
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar) {
        int numChildren = aVar.numChildren();
        aVar.renderChildren(true);
        for (int i = 0; i < numChildren; i++) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) aVar.getChildAt(i);
            Number3d number3d = (Number3d) this.h.get(i);
            cVar.position().x = number3d.x;
            cVar.position().y = number3d.y;
            cVar.position().z = number3d.z;
            cVar.rotation().x = 0.0f;
            cVar.rotation().y = 0.0f;
            cVar.rotation().z = 0.0f;
            cVar.doubleSidedEnabled(false);
        }
        aVar.position().z = 0.0f;
        aVar.rotation().y = 0.0f;
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar, float f) {
        float f2;
        float f3;
        float abs = Math.abs(f);
        int numChildren = aVar.numChildren();
        aVar.rotation().y = 180.0f * f;
        if (numChildren == 0) {
            return;
        }
        if (f == 0.0f && !aVar.f()) {
            m(aVar);
            return;
        }
        if (j(aVar) == b && !aVar.f()) {
            l(aVar);
        }
        if (abs < 0.2d && k(aVar)) {
            n(aVar);
        }
        for (int i = 0; i < numChildren; i++) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) aVar.getChildAt(i);
            if (abs > 0.8d) {
                f2 = (1.0f - abs) / 0.2f;
            } else {
                f2 = 1.0f;
            }
            float f4 = aVar.rotation().y + cVar.rotation().y;
            if (f4 < -180.0f) {
                f4 += 360.0f;
            } else if (f4 > 180.0f) {
                f4 -= 360.0f;
            }
            float abs2 = Math.abs(f4);
            this.i.reset();
            this.i.setAllFrom(cVar.position());
            this.i.rotateAll(aVar.rotation());
            cVar.setTag(Float.valueOf(this.i.z));
            if (abs2 > 90.0f) {
                f3 = (180.0f - abs2) / 90.0f;
            } else {
                f3 = 1.0f;
            }
            cVar.doubleSidedEnabled(true);
            cVar.alpha((int) (f2 * ((f3 * 0.5f) + 0.5f) * 255.0f));
        }
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void b(com.tsf.shell.e.f.a.a aVar) {
        aVar.renderChildren(false);
        a(aVar, c);
        b(aVar, b);
        a(aVar, false);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void c(com.tsf.shell.e.f.a.a aVar) {
        b(aVar, true);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void d(com.tsf.shell.e.f.a.a aVar) {
        a(aVar, true);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void e(com.tsf.shell.e.f.a.a aVar) {
        m(aVar);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void f(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.censivn.C3DEngine.b.f.l lVar) {
        Iterator it = lVar.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.l lVar2 = (com.censivn.C3DEngine.b.f.l) ((com.censivn.C3DEngine.b.f.j) it.next());
            if (lVar2.visible()) {
                ArrayList children = lVar2.children();
                int size = children.size() - 1;
                while (true) {
                    int i = size;
                    if (i > -1) {
                        this.k.add((com.censivn.C3DEngine.b.f.j) children.get(i));
                        size = i - 1;
                    }
                }
            }
        }
        if (!this.l) {
            Collections.sort(this.k, this.j);
        }
        com.censivn.C3DEngine.b.f.l aA = com.tsf.shell.manager.a.h.t().aA();
        MatrixStack.glPushMatrix();
        MatrixStack.glTranslatef(0.0f, 0.0f, -this.f);
        MatrixStack.glRotatef(aA.rotation().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glTranslatef(0.0f, 0.0f, this.f);
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it2.next();
            com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) jVar.parent();
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(jVar2.position().x, jVar2.position().y, jVar2.position().z);
            MatrixStack.glRotatef(jVar2.rotation().y, 0.0f, 1.0f, 0.0f);
            if (jVar.visible()) {
                com.censivn.C3DEngine.b.f.l lVar3 = (com.censivn.C3DEngine.b.f.l) jVar;
                MatrixStack.glPushMatrix();
                lVar3.onDrawStart();
                lVar3.drawShader();
                MatrixStack.glTranslatef(lVar3.position().x, lVar3.position().y, lVar3.position().z);
                MatrixStack.glRotatef(lVar3.rotation().y, 0.0f, 1.0f, 0.0f);
                MatrixStack.glRotatef(lVar3.rotation().x, 1.0f, 0.0f, 0.0f);
                MatrixStack.glRotatef(lVar3.rotation().z, 0.0f, 0.0f, 1.0f);
                MatrixStack.glScalef(lVar3.scale().x, lVar3.scale().y, lVar3.scale().z);
                com.censivn.C3DEngine.a.g.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
                System.arraycopy(MatrixStack.rMVPMatrix, 0, lVar3.AABB_MATRIX, 0, 16);
                GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
                lVar3.drawElement();
                MatrixStack.glColor(lVar3.alpha(), lVar3.getDefaultColor());
                lVar3.onDrawChildStart();
                if (lVar3.renderChildren()) {
                    int numChildren = lVar3.numChildren();
                    for (int i2 = 0; i2 < numChildren; i2++) {
                        lVar3.getChildAt(i2).dispatchDraw();
                    }
                }
                lVar3.onDrawChildEnd();
                lVar3.onDrawEnd();
                MatrixStack.glPopMatrix();
            }
            MatrixStack.glPopMatrix();
        }
        MatrixStack.glPopMatrix();
        this.k.clear();
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void g(com.tsf.shell.e.f.a.a aVar) {
        if (i(aVar) != c) {
            int numChildren = aVar.numChildren();
            for (int i = 0; i < numChildren; i++) {
                w.b((com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i));
            }
            w.b(aVar);
        }
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void h(com.tsf.shell.e.f.a.a aVar) {
        if (i(aVar) != c) {
            int numChildren = aVar.numChildren();
            for (int i = 0; i < numChildren; i++) {
                w.c((com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i));
            }
            w.c(aVar);
        }
    }

    private void b(final com.tsf.shell.e.f.a.a aVar, boolean z) {
        Object obj;
        Object obj2;
        this.l = false;
        a(aVar, false);
        int numChildren = aVar.numChildren();
        if (numChildren == 0) {
            return;
        }
        if ((aVar.getChildAt(0).rotation().x != ((p) this.g.get(0)).e || aVar.getChildAt(0).rotation().y != ((p) this.g.get(0)).d || aVar.getChildAt(0).rotation().z != ((p) this.g.get(0)).f || i(aVar) == b) && i(aVar) != a) {
            if (z) {
                a(aVar, a);
                b(aVar, a);
                for (int i = 0; i < numChildren; i++) {
                    com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i);
                    if (i >= this.e) {
                        obj2 = this.g.get(this.e - 1);
                    } else {
                        obj2 = this.g.get(i);
                    }
                    p pVar = (p) obj2;
                    x xVar = new x();
                    xVar.f(pVar.a);
                    xVar.h(pVar.b);
                    xVar.j(pVar.c);
                    xVar.c(pVar.e);
                    xVar.d(pVar.d);
                    xVar.e(pVar.f);
                    w.a(lVar);
                    w.a(lVar, 250, xVar);
                }
                x xVar2 = new x() { // from class: com.tsf.shell.e.f.a.b.n.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        n.this.a(aVar, n.c);
                    }
                };
                xVar2.j(-this.f);
                w.a(aVar);
                w.a(aVar, 250, xVar2);
                return;
            }
            for (int i2 = 0; i2 < numChildren; i2++) {
                com.censivn.C3DEngine.b.f.l lVar2 = (com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i2);
                if (i2 >= this.e) {
                    obj = this.g.get(this.e - 1);
                } else {
                    obj = this.g.get(i2);
                }
                p pVar2 = (p) obj;
                w.a(lVar2);
                lVar2.position().x = pVar2.a;
                lVar2.position().y = pVar2.b;
                lVar2.position().z = pVar2.c;
                lVar2.rotation().x = pVar2.e;
                lVar2.rotation().y = pVar2.d;
                lVar2.rotation().z = pVar2.f;
            }
            x xVar3 = new x() { // from class: com.tsf.shell.e.f.a.b.n.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    n.this.a(aVar, n.c);
                }
            };
            xVar3.j(-this.f);
            w.a(aVar);
            w.a(aVar, 250, xVar3);
        }
    }

    private void l(com.tsf.shell.e.f.a.a aVar) {
        Object obj;
        this.l = false;
        a(aVar, c);
        b(aVar, a);
        int numChildren = aVar.numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i);
            if (i >= this.e) {
                obj = this.g.get(this.e - 1);
            } else {
                obj = this.g.get(i);
            }
            p pVar = (p) obj;
            lVar.position().x = pVar.a;
            lVar.position().y = pVar.b;
            lVar.position().z = pVar.c;
            lVar.rotation().x = pVar.e;
            lVar.rotation().y = pVar.d;
            lVar.rotation().z = pVar.f;
        }
        aVar.position().z = -this.f;
    }

    private void m(com.tsf.shell.e.f.a.a aVar) {
        Object obj;
        this.l = true;
        a(aVar, c);
        b(aVar, b);
        int numChildren = aVar.numChildren();
        if (numChildren != 0) {
            for (int i = 0; i < numChildren; i++) {
                com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) aVar.getChildAt(i);
                if (i >= this.e) {
                    obj = this.h.get(this.e - 1);
                } else {
                    obj = this.h.get(i);
                }
                Number3d number3d = (Number3d) obj;
                cVar.position().x = number3d.x;
                cVar.position().y = number3d.y;
                cVar.position().z = number3d.z;
                cVar.rotation().x = 0.0f;
                cVar.rotation().y = 0.0f;
                cVar.rotation().z = 0.0f;
                cVar.scale().x = 1.0f;
                cVar.scale().y = 1.0f;
                cVar.scale().z = 1.0f;
                cVar.alpha(255.0f);
                w.a(cVar);
            }
            aVar.position().z = 0.0f;
            w.a(aVar);
        }
    }

    private void n(final com.tsf.shell.e.f.a.a aVar) {
        Object obj;
        a(aVar, false);
        int numChildren = aVar.numChildren();
        if ((aVar.getChildAt(0).rotation().x != 0.0f || aVar.getChildAt(0).rotation().y != 0.0f || aVar.getChildAt(0).rotation().z != 0.0f || i(aVar) == a) && i(aVar) != b) {
            a(aVar, b);
            b(aVar, b);
            for (int i = 0; i < numChildren; i++) {
                com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) aVar.getChildAt(i);
                if (i >= this.e) {
                    obj = this.h.get(this.e - 1);
                } else {
                    obj = this.h.get(i);
                }
                Number3d number3d = (Number3d) obj;
                x xVar = new x();
                xVar.f(number3d.x);
                xVar.h(number3d.y);
                xVar.j(number3d.z);
                xVar.c(0.0f);
                xVar.d(0.0f);
                xVar.e(0.0f);
                w.a(lVar);
                w.a(lVar, 250, xVar);
            }
            x xVar2 = new x() { // from class: com.tsf.shell.e.f.a.b.n.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    n.this.a(aVar, n.c);
                    n.this.l = true;
                }
            };
            xVar2.j(0.0f);
            w.a(aVar);
            w.a(aVar, 250, xVar2);
        }
    }
}
