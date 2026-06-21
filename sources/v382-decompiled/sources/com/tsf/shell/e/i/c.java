package com.tsf.shell.e.i;

import android.content.ContentValues;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.e.e.g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends l implements g {
    private ItemInfo a;
    protected com.censivn.C3DEngine.b.f.b.a e;
    private g j;
    private int m;
    private a q;
    private boolean r;
    private boolean b = true;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    private boolean k = false;
    public boolean c = false;
    public float d = 1.0f;
    private boolean l = false;
    private boolean n = false;
    private float o = 1.0f;
    private float p = 0.0f;
    private boolean s = true;
    private float t = 0.4f;
    private float u = 1.6f;
    private boolean v = false;
    private boolean w = true;
    private boolean x = false;
    private boolean y = false;

    public c(ItemInfo itemInfo) {
        this.a = itemInfo;
        if (itemInfo != null) {
            itemInfo.setWidget(this);
        }
    }

    public String r() {
        return "";
    }

    public long s() {
        return 0L;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void parent(com.censivn.C3DEngine.b.f.g gVar) {
        super.parent(gVar);
        b(0.0f);
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void destroy() {
        super.destroy();
        this.n = true;
    }

    public boolean t() {
        return this.n;
    }

    public void a(float f) {
        this.o = f;
    }

    public float u() {
        return this.o;
    }

    public float v() {
        return maxX() - minX();
    }

    public float w() {
        return maxY() - minY();
    }

    public void b(float f) {
        this.p = f;
    }

    public float x() {
        return this.p;
    }

    public void y() {
        this.p = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void superDrawMVPMatrix() {
        MatrixStack.glTranslatef(position().x, position().y, position().z);
        MatrixStack.glRotatef(rotation().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().z + this.p, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(scale().x * this.o, scale().y * this.o, scale().y * this.o);
        com.censivn.C3DEngine.a.g.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void drawMVPMatrix() {
        MatrixStack.glTranslatef(position().x, position().y, position().z);
        MatrixStack.glRotatef(rotation().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(rotation().y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(rotation().z + this.p, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(scale().x * this.o, scale().y * this.o, scale().y * this.o);
        com.censivn.C3DEngine.a.g.a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.AABB_MATRIX, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public com.tsf.shell.e.f.g z() {
        if (A() != null && (A().b() instanceof com.tsf.shell.e.f.g)) {
            return (com.tsf.shell.e.f.g) A().b();
        }
        return null;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public boolean calTouchCollision(float f, float f2) {
        if (!(this instanceof com.tsf.shell.e.i.b.e.b) && com.tsf.shell.manager.a.h.s().a()) {
            return false;
        }
        if (z() != null) {
            if (z() == null || Math.abs(r1.g) <= 0.03d) {
                return super.calTouchCollision(f, f2);
            }
            return false;
        }
        return super.calTouchCollision(f, f2);
    }

    public void a(float f, float f2) {
    }

    public a A() {
        return this.q;
    }

    public void a(a aVar) {
        this.q = aVar;
    }

    public void B() {
        this.q = null;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onKillFocus() {
        super.onKillFocus();
        if (this.r) {
            com.tsf.shell.e.e.a.b();
        }
    }

    public void C() {
        if (this.q != null) {
            this.q.b(this);
        }
    }

    public void c(boolean z) {
        this.r = z;
    }

    public void c(float f) {
        this.d = f;
    }

    public boolean D() {
        return this.r;
    }

    public void E() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.e == null) {
                    c.this.e = com.tsf.shell.e.e.c.a((int) ((-this.minX()) + this.maxX() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)), (int) ((-this.minY()) + this.maxY() + (com.censivn.C3DEngine.b.b.a.b * 10.0f)));
                    c.this.e.useVBO(false);
                    c.this.e.textures().addElement(com.tsf.shell.e.e.c.h);
                    c.this.e.position().y = (this.minY() + this.maxY()) / 2.0f;
                    this.addChild(c.this.e);
                }
            }
        });
    }

    public void F() {
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.i.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.e != null) {
                    c.this.e.textures().removeAll();
                    c.this.e.removeFromParent();
                    c.this.e.destroy();
                    c.this.e = null;
                }
            }
        });
    }

    public void G() {
        d(true);
    }

    public void d(final boolean z) {
        int i;
        if (rotation().z % 360.0f != 0.0f) {
            int abs = Math.abs(((int) rotation().z) / 360);
            if (rotation().z > 0.0f) {
                int i2 = abs * 360;
                i = (abs + 1) * 360;
                if (rotation().z - i2 <= i - rotation().z) {
                    i = i2;
                }
            } else {
                int i3 = (-abs) * 360;
                i = (-(abs + 1)) * 360;
                if (i3 - rotation().z <= rotation().z - i) {
                    i = i3;
                }
            }
            x xVar = new x() { // from class: com.tsf.shell.e.i.c.3
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    this.rotation().z = 0.0f;
                    if (z) {
                        c.this.ad();
                    }
                }
            };
            xVar.e(i);
            w.a(this, 250, xVar);
        }
    }

    public void H() {
        com.tsf.shell.e.e.a.a(this);
    }

    public void I() {
        if (this.r) {
            com.tsf.shell.e.e.a.b();
        }
    }

    public void a(int i) {
        this.m = i;
    }

    public int J() {
        return this.m;
    }

    public void a(ItemInfo itemInfo) {
        this.a = itemInfo;
    }

    public ItemInfo K() {
        return this.a;
    }

    public boolean L() {
        return this.k;
    }

    public void e(boolean z) {
        this.b = z;
    }

    public boolean M() {
        return this.b;
    }

    public void N() {
        this.l = true;
    }

    public boolean O() {
        return this.l;
    }

    public void P() {
        this.l = false;
    }

    public void f(boolean z) {
        this.f = z;
    }

    public boolean Q() {
        return this.f;
    }

    public void g(boolean z) {
        this.g = z;
    }

    public boolean R() {
        return this.g;
    }

    public void h(boolean z) {
        this.w = z;
    }

    public boolean S() {
        return this.w;
    }

    public boolean T() {
        return this.s;
    }

    public void i(boolean z) {
        this.s = z;
    }

    public void d(float f) {
        this.t = f;
    }

    public void e(float f) {
        this.u = f;
    }

    public float U() {
        return this.t;
    }

    public float V() {
        return this.u;
    }

    public void W() {
        this.v = true;
    }

    public void X() {
        this.v = false;
        ad();
    }

    public boolean Y() {
        return this.v;
    }

    public void Z() {
        if (T()) {
            com.tsf.shell.e.e.x.a(this);
        }
    }

    public void aa() {
        if (T()) {
            com.tsf.shell.e.e.x.a();
        }
        if (this.r) {
            com.tsf.shell.e.e.a.b();
        }
    }

    public void a_() {
    }

    public void l_() {
        this.y = true;
        setAnimationObjectState(true);
        Z();
        com.tsf.shell.a.a.a("WidgetContainer", "onDragStart");
    }

    public void ab() {
        if (T()) {
            com.tsf.shell.e.e.x.a();
        }
    }

    public void k_() {
        this.y = false;
        com.tsf.shell.a.a.a("WidgetContainer", "onDragRelease");
    }

    public void c() {
        this.y = false;
        setAnimationObjectState(false);
        if (!this.x) {
            ad();
        }
        com.tsf.shell.a.a.a("WidgetContainer", "onDragEnd");
    }

    public boolean ac() {
        ItemInfo K = K();
        if (com.censivn.C3DEngine.b.b.a.O) {
            position().x = K.cellX;
            position().y = K.cellY;
            rotation().z = K.rotation;
            a(K.scale);
        } else {
            position().x = K.cellXH;
            position().y = K.cellYH;
            rotation().z = K.rotationH;
            a(K.scaleH);
        }
        float[] a = com.tsf.shell.manager.r.a.a(this, position().x, position().y);
        if (a[0] == position().x && a[1] == position().y) {
            return false;
        }
        position().x = a[0];
        position().y = a[1];
        return true;
    }

    public void ad() {
        if (K() != null) {
            ContentValues contentValues = new ContentValues();
            K().onUpdateLayoutInformation(contentValues, this);
            com.tsf.shell.manager.bind.d.a(contentValues, K(), (Runnable) null);
        }
    }

    public void a(ContentValues contentValues) {
        if (K() != null) {
            com.tsf.shell.manager.bind.d.a(contentValues, K(), (Runnable) null);
        }
    }

    public void d_() {
        this.x = true;
        I();
        com.tsf.shell.a.a.a("WidgetContainer", "onChoicePageStart");
    }

    public void m_() {
        this.x = false;
        if (!this.y) {
            ad();
        }
        com.tsf.shell.a.a.a("WidgetContainer", "onChoicePageEnd");
    }

    public void n_() {
        this.k = true;
        I();
    }

    public void g() {
        if (A() != null) {
            A().c(this);
        }
        com.tsf.shell.a.a.a("WidgetContainer", "onDestroy");
    }

    public void ae() {
    }

    public void o_() {
    }

    public void j() {
    }

    public void j(boolean z) {
        this.h = z;
    }

    @Override // com.tsf.shell.e.e.g
    public boolean a() {
        return this.h;
    }

    public void k(boolean z) {
        this.i = z;
    }

    @Override // com.tsf.shell.e.e.g
    public boolean o() {
        return this.i;
    }

    public int m() {
        return 0;
    }

    @Override // com.tsf.shell.e.e.g
    public g n() {
        return this.j;
    }

    public boolean a(g gVar, float f, float f2) {
        return false;
    }

    public void c(g gVar) {
    }

    public void e(g gVar) {
    }

    public boolean b(g gVar) {
        return true;
    }

    public void d(g gVar) {
    }

    public void a(g gVar) {
    }

    @Override // com.tsf.shell.e.e.g
    public void f(g gVar) {
        if (this.j != gVar) {
            p();
            gVar.a(this);
        }
        this.j = gVar;
        this.j.c(this);
    }

    @Override // com.tsf.shell.e.e.g
    public boolean h(g gVar) {
        if (gVar == null) {
            return false;
        }
        return gVar.b(this);
    }

    public void g(g gVar) {
        f(gVar);
        gVar.e(this);
        this.j = null;
    }

    public void af() {
    }

    @Override // com.tsf.shell.e.e.g
    public void p() {
        if (this.j != null) {
            this.j.d(this);
            this.j = null;
            af();
        }
    }

    @Override // com.tsf.shell.e.e.g
    public g a(int i, int i2) {
        return a(i, i2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g a(int i, int i2, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList a = com.tsf.shell.manager.a.k.a();
        int size = a.size() - 1;
        while (true) {
            int i3 = size;
            if (i3 > -1) {
                g gVar = (g) a.get(i3);
                if (gVar.a()) {
                    if (gVar.m() == 0) {
                        f3 = i;
                        f4 = i2;
                    } else {
                        f3 = position().x;
                        f4 = position().y;
                    }
                    if (((j) gVar).calTouchCollision(f3, f4) && !gVar.a(this, f3, f4)) {
                        return gVar;
                    }
                }
                size = i3 - 1;
            } else {
                if (z && com.tsf.shell.manager.a.h.m() == 2 && !com.tsf.shell.manager.a.h.n().ad()) {
                    Iterator it = com.tsf.shell.manager.a.h.G().iterator();
                    while (it.hasNext()) {
                        j jVar = (j) it.next();
                        if ((jVar instanceof c) && jVar != this) {
                            c cVar = (c) jVar;
                            if (cVar.a()) {
                                if (cVar.m() == 0) {
                                    f = i;
                                    f2 = i2;
                                } else {
                                    f = position().x;
                                    f2 = position().y;
                                }
                                if (cVar.calTouchCollision(f, f2) && !cVar.a(this, f, f2)) {
                                    return cVar;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }
}
