package com.tsf.shell.f.f.a.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class m extends k {
    private static int a = 1;
    private static int b = 2;
    private static int c = 3;
    private int d;
    private int e;
    private float f;
    private ArrayList<b> g;
    private ArrayList<Number3d> h;
    private Number3d i;
    private a j;
    private ArrayList<com.censivn.C3DEngine.b.f.i> k;
    private boolean l;

    public abstract void a(int i, int i2, int i3, int i4, float f, ArrayList<Number3d> arrayList);

    public m(int i, int i2, boolean z) {
        super(i, i2, z);
        this.l = true;
        this.i = new Number3d();
        this.j = new a();
        this.k = new ArrayList<>();
        this.g = new ArrayList<>();
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        this.d = i;
        this.h = arrayList;
        this.e = arrayList.size();
        this.f = this.d * 0.55f;
        a(i, i2, i3, i4, this.f, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.shell.f.f.a.a aVar, int i) {
        aVar.b(i);
    }

    private void b(com.tsf.shell.f.f.a.a aVar, int i) {
        aVar.c(i);
    }

    private void a(com.tsf.shell.f.f.a.a aVar, boolean z) {
        aVar.b(z);
    }

    private int i(com.tsf.shell.f.f.a.a aVar) {
        return aVar.r();
    }

    private int j(com.tsf.shell.f.f.a.a aVar) {
        return aVar.s();
    }

    private boolean k(com.tsf.shell.f.f.a.a aVar) {
        return aVar.t();
    }

    public b a(int i) {
        b bVar;
        if (i < this.g.size()) {
            bVar = this.g.get(i);
        } else {
            bVar = new b();
            this.g.add(bVar);
        }
        bVar.a();
        return bVar;
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.tsf.shell.f.f.a.a aVar) {
        int iNumChildren = aVar.numChildren();
        aVar.renderChildren(true);
        for (int i = 0; i < iNumChildren; i++) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) aVar.getChildAt(i);
            Number3d number3d = this.h.get(i);
            bVar.position().x = number3d.x;
            bVar.position().y = number3d.y;
            bVar.position().z = number3d.z;
            bVar.rotation().x = 0.0f;
            bVar.rotation().y = 0.0f;
            bVar.rotation().z = 0.0f;
            bVar.doubleSidedEnabled(false);
        }
        aVar.position().z = 0.0f;
        aVar.rotation().y = 0.0f;
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.tsf.shell.f.f.a.a aVar, float f) {
        float f2;
        float f3;
        float fAbs = Math.abs(f);
        int iNumChildren = aVar.numChildren();
        aVar.rotation().y = 180.0f * f;
        if (iNumChildren == 0) {
            return;
        }
        if (f == 0.0f && !aVar.f()) {
            m(aVar);
            return;
        }
        if (j(aVar) == b && !aVar.f()) {
            l(aVar);
        }
        if (fAbs < 0.2d && k(aVar)) {
            n(aVar);
        }
        for (int i = 0; i < iNumChildren; i++) {
            com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) aVar.getChildAt(i);
            if (fAbs > 0.8d) {
                f2 = (1.0f - fAbs) / 0.2f;
            } else {
                f2 = 1.0f;
            }
            float f4 = aVar.rotation().y + bVar.rotation().y;
            if (f4 < -180.0f) {
                f4 += 360.0f;
            } else if (f4 > 180.0f) {
                f4 -= 360.0f;
            }
            float fAbs2 = Math.abs(f4);
            this.i.reset();
            this.i.setAllFrom(bVar.position());
            this.i.rotateAll(aVar.rotation());
            bVar.setTag(Float.valueOf(this.i.z));
            if (fAbs2 > 90.0f) {
                f3 = (180.0f - fAbs2) / 90.0f;
            } else {
                f3 = 1.0f;
            }
            bVar.doubleSidedEnabled(true);
            bVar.alpha((int) (f2 * ((f3 * 0.5f) + 0.5f) * 255.0f));
        }
    }

    public class a implements Comparator<com.censivn.C3DEngine.b.f.i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.censivn.C3DEngine.b.f.i iVar, com.censivn.C3DEngine.b.f.i iVar2) {
            if (iVar.getTag() == null || iVar2.getTag() == null) {
                return 0;
            }
            float fFloatValue = ((Float) iVar.getTag()).floatValue();
            float fFloatValue2 = ((Float) iVar2.getTag()).floatValue();
            if (fFloatValue == fFloatValue2) {
                return 0;
            }
            return fFloatValue > fFloatValue2 ? 1 : -1;
        }
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void b(com.tsf.shell.f.f.a.a aVar) {
        aVar.renderChildren(false);
        a(aVar, c);
        b(aVar, b);
        a(aVar, false);
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void c(com.tsf.shell.f.f.a.a aVar) {
        b(aVar, true);
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void d(com.tsf.shell.f.f.a.a aVar) {
        a(aVar, true);
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void e(com.tsf.shell.f.f.a.a aVar) {
        m(aVar);
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void f(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        Iterator<com.censivn.C3DEngine.b.f.i> it = jVar.children().iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) it.next();
            if (jVar2.visible()) {
                ArrayList<com.censivn.C3DEngine.b.f.i> arrayListChildren = jVar2.children();
                int size = arrayListChildren.size() - 1;
                while (true) {
                    int i = size;
                    if (i > -1) {
                        this.k.add(arrayListChildren.get(i));
                        size = i - 1;
                    }
                }
            }
        }
        if (!this.l) {
            Collections.sort(this.k, this.j);
        }
        com.censivn.C3DEngine.b.f.j jVarAA = com.tsf.shell.manager.a.h.t().aA();
        MatrixStack.glPushMatrix();
        MatrixStack.glTranslatef(0.0f, 0.0f, -this.f);
        MatrixStack.glRotatef(jVarAA.rotation().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glTranslatef(0.0f, 0.0f, this.f);
        for (com.censivn.C3DEngine.b.f.i iVar : this.k) {
            com.censivn.C3DEngine.b.f.i iVar2 = (com.censivn.C3DEngine.b.f.i) iVar.parent();
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(iVar2.position().x, iVar2.position().y, iVar2.position().z);
            MatrixStack.glRotatef(iVar2.rotation().y, 0.0f, 1.0f, 0.0f);
            if (iVar.visible()) {
                com.censivn.C3DEngine.b.f.j jVar3 = (com.censivn.C3DEngine.b.f.j) iVar;
                MatrixStack.glPushMatrix();
                jVar3.onDrawStart();
                jVar3.drawShader();
                MatrixStack.glTranslatef(jVar3.position().x, jVar3.position().y, jVar3.position().z);
                MatrixStack.glRotatef(jVar3.rotation().y, 0.0f, 1.0f, 0.0f);
                MatrixStack.glRotatef(jVar3.rotation().x, 1.0f, 0.0f, 0.0f);
                MatrixStack.glRotatef(jVar3.rotation().z, 0.0f, 0.0f, 1.0f);
                MatrixStack.glScalef(jVar3.scale().x, jVar3.scale().y, jVar3.scale().z);
                com.censivn.C3DEngine.a.c.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
                System.arraycopy(MatrixStack.rMVPMatrix, 0, jVar3.AABB_MATRIX, 0, 16);
                GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
                jVar3.drawElement();
                MatrixStack.glColor(jVar3.alpha(), jVar3.getDefaultColor());
                jVar3.onDrawChildStart();
                if (jVar3.renderChildren()) {
                    int iNumChildren = jVar3.numChildren();
                    for (int i2 = 0; i2 < iNumChildren; i2++) {
                        jVar3.getChildAt(i2).dispatchDraw();
                    }
                }
                jVar3.onDrawChildEnd();
                jVar3.onDrawEnd();
                MatrixStack.glPopMatrix();
            }
            MatrixStack.glPopMatrix();
        }
        MatrixStack.glPopMatrix();
        this.k.clear();
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void g(com.tsf.shell.f.f.a.a aVar) {
        if (i(aVar) != c) {
            int iNumChildren = aVar.numChildren();
            for (int i = 0; i < iNumChildren; i++) {
                com.censivn.C3DEngine.b.g.c.b((com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i));
            }
            com.censivn.C3DEngine.b.g.c.b(aVar);
        }
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void h(com.tsf.shell.f.f.a.a aVar) {
        if (i(aVar) != c) {
            int iNumChildren = aVar.numChildren();
            for (int i = 0; i < iNumChildren; i++) {
                com.censivn.C3DEngine.b.g.c.c((com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i));
            }
            com.censivn.C3DEngine.b.g.c.c(aVar);
        }
    }

    private void b(final com.tsf.shell.f.f.a.a aVar, boolean z) {
        b bVar;
        b bVar2;
        this.l = false;
        a(aVar, false);
        int iNumChildren = aVar.numChildren();
        if (iNumChildren == 0) {
            return;
        }
        if ((aVar.getChildAt(0).rotation().x != this.g.get(0).e || aVar.getChildAt(0).rotation().y != this.g.get(0).d || aVar.getChildAt(0).rotation().z != this.g.get(0).f || i(aVar) == b) && i(aVar) != a) {
            if (z) {
                a(aVar, a);
                b(aVar, a);
                for (int i = 0; i < iNumChildren; i++) {
                    com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i);
                    if (i >= this.e) {
                        bVar2 = this.g.get(this.e - 1);
                    } else {
                        bVar2 = this.g.get(i);
                    }
                    b bVar3 = bVar2;
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                    dVar.f(bVar3.a);
                    dVar.h(bVar3.b);
                    dVar.j(bVar3.c);
                    dVar.c(bVar3.e);
                    dVar.d(bVar3.d);
                    dVar.e(bVar3.f);
                    com.censivn.C3DEngine.b.g.c.a(jVar);
                    com.censivn.C3DEngine.b.g.c.a(jVar, 250, dVar);
                }
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.b.m.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        m.this.a(aVar, m.c);
                    }
                };
                dVar2.j(-this.f);
                com.censivn.C3DEngine.b.g.c.a(aVar);
                com.censivn.C3DEngine.b.g.c.a(aVar, 250, dVar2);
                return;
            }
            for (int i2 = 0; i2 < iNumChildren; i2++) {
                com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i2);
                if (i2 >= this.e) {
                    bVar = this.g.get(this.e - 1);
                } else {
                    bVar = this.g.get(i2);
                }
                b bVar4 = bVar;
                com.censivn.C3DEngine.b.g.c.a(jVar2);
                jVar2.position().x = bVar4.a;
                jVar2.position().y = bVar4.b;
                jVar2.position().z = bVar4.c;
                jVar2.rotation().x = bVar4.e;
                jVar2.rotation().y = bVar4.d;
                jVar2.rotation().z = bVar4.f;
            }
            com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.b.m.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    m.this.a(aVar, m.c);
                }
            };
            dVar3.j(-this.f);
            com.censivn.C3DEngine.b.g.c.a(aVar);
            com.censivn.C3DEngine.b.g.c.a(aVar, 250, dVar3);
        }
    }

    private void l(com.tsf.shell.f.f.a.a aVar) {
        b bVar;
        this.l = false;
        a(aVar, c);
        b(aVar, a);
        int iNumChildren = aVar.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i);
            if (i >= this.e) {
                bVar = this.g.get(this.e - 1);
            } else {
                bVar = this.g.get(i);
            }
            b bVar2 = bVar;
            jVar.position().x = bVar2.a;
            jVar.position().y = bVar2.b;
            jVar.position().z = bVar2.c;
            jVar.rotation().x = bVar2.e;
            jVar.rotation().y = bVar2.d;
            jVar.rotation().z = bVar2.f;
        }
        aVar.position().z = -this.f;
    }

    private void m(com.tsf.shell.f.f.a.a aVar) {
        Number3d number3d;
        this.l = true;
        a(aVar, c);
        b(aVar, b);
        int iNumChildren = aVar.numChildren();
        if (iNumChildren != 0) {
            for (int i = 0; i < iNumChildren; i++) {
                com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) aVar.getChildAt(i);
                if (i >= this.e) {
                    number3d = this.h.get(this.e - 1);
                } else {
                    number3d = this.h.get(i);
                }
                Number3d number3d2 = number3d;
                bVar.position().x = number3d2.x;
                bVar.position().y = number3d2.y;
                bVar.position().z = number3d2.z;
                bVar.rotation().x = 0.0f;
                bVar.rotation().y = 0.0f;
                bVar.rotation().z = 0.0f;
                bVar.scale().x = 1.0f;
                bVar.scale().y = 1.0f;
                bVar.scale().z = 1.0f;
                bVar.alpha(255.0f);
                com.censivn.C3DEngine.b.g.c.a(bVar);
            }
            aVar.position().z = 0.0f;
            com.censivn.C3DEngine.b.g.c.a(aVar);
        }
    }

    private void n(final com.tsf.shell.f.f.a.a aVar) {
        Number3d number3d;
        a(aVar, false);
        int iNumChildren = aVar.numChildren();
        if ((aVar.getChildAt(0).rotation().x != 0.0f || aVar.getChildAt(0).rotation().y != 0.0f || aVar.getChildAt(0).rotation().z != 0.0f || i(aVar) == a) && i(aVar) != b) {
            a(aVar, b);
            b(aVar, b);
            for (int i = 0; i < iNumChildren; i++) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) aVar.getChildAt(i);
                if (i >= this.e) {
                    number3d = this.h.get(this.e - 1);
                } else {
                    number3d = this.h.get(i);
                }
                Number3d number3d2 = number3d;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.f(number3d2.x);
                dVar.h(number3d2.y);
                dVar.j(number3d2.z);
                dVar.c(0.0f);
                dVar.d(0.0f);
                dVar.e(0.0f);
                com.censivn.C3DEngine.b.g.c.a(jVar);
                com.censivn.C3DEngine.b.g.c.a(jVar, 250, dVar);
            }
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.b.m.3
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    m.this.a(aVar, m.c);
                    m.this.l = true;
                }
            };
            dVar2.j(0.0f);
            com.censivn.C3DEngine.b.g.c.a(aVar);
            com.censivn.C3DEngine.b.g.c.a(aVar, 250, dVar2);
        }
    }

    public static class b {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;

        public void a() {
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.e = 0.0f;
            this.d = 0.0f;
            this.f = 0.0f;
        }
    }
}
