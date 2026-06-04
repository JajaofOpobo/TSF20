package com.tsf.shell.workspace3D.k.c.b;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ai extends com.tsf.shell.workspace3D.g.c.o {
    private static boolean G = false;
    private static boolean H = false;
    private static float I = 5.0f;
    private static float J = 0.0f;
    private float M;
    private float N;
    private float O;
    private float P;
    private c a;
    private boolean C = true;
    private boolean D = false;
    private boolean K = true;
    private boolean L = true;
    private boolean Q = false;
    private ArrayList A = new ArrayList();
    private ArrayList B = new ArrayList();
    private com.tsf.shell.workspace3D.k.ab E = new com.tsf.shell.workspace3D.k.ab();

    public ai(c cVar) {
        this.a = cVar;
        this.E.a((com.censivn.C3DEngine.d.b) this);
        this.E.a(R());
        aJ();
    }

    @Override // com.tsf.shell.workspace3D.g.c.o
    public final void a(com.tsf.shell.workspace3D.k.z zVar) {
        if (zVar instanceof com.tsf.shell.workspace3D.k.ab) {
            zVar.e(false);
            this.a.a((com.tsf.shell.workspace3D.k.ab) zVar);
            bf.l().a((com.tsf.shell.workspace3D.k.j) zVar);
        }
    }

    public final void i() {
        aJ();
        aK();
        aS();
        int aB = aB();
        for (int i = 0; i < aB; i++) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.z.get(i);
            al alVar = (al) this.A.get(i);
            a(alVar, abVar, (aB - i) - 1);
            if (this.D) {
                abVar.L().setAll(alVar.a, alVar.b, 0.0f);
                abVar.M().z = alVar.c;
                abVar.N().setAll(alVar.d, alVar.d, 0.0f);
                abVar.b(alVar.r);
                if (alVar.r == 0.0f) {
                    abVar.a((Boolean) false);
                }
                abVar.j(alVar.e);
            }
        }
    }

    public static int a(float f, float f2) {
        if (ao.W.b(f, f2)) {
            return -3;
        }
        if (ao.X.b(f, f2)) {
            return -4;
        }
        return -1;
    }

    public static void j() {
        I = 5.0f;
    }

    public static void h(boolean z) {
        ao.W.h(z);
    }

    public static void i(boolean z) {
        ao.X.h(z);
    }

    private void aH() {
        ao.W.h(false);
        if (G) {
            G = false;
            aj ajVar = new aj(this);
            ajVar.a(0);
            com.censivn.C3DEngine.g.s.a(ao.W);
            com.censivn.C3DEngine.g.s.a(ao.W, 250, ajVar);
        }
    }

    private void aI() {
        ao.X.h(false);
        if (H) {
            H = false;
            ak akVar = new ak(this);
            akVar.a(0);
            com.censivn.C3DEngine.g.s.a(ao.X);
            com.censivn.C3DEngine.g.s.a(ao.X, 250, akVar);
        }
    }

    public final void k() {
        this.D = true;
        aJ();
    }

    public final void l() {
        this.D = false;
        float f = this.O - c.d.x;
        int aB = aB();
        for (int i = 0; i < aB; i++) {
            com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.z.get(i);
            if (!abVar.G) {
                abVar.L().y += f;
            }
        }
    }

    public final void m() {
        aJ();
    }

    private void aJ() {
        float f = c.d.D.childContainerY;
        this.P = f;
        this.O = f;
    }

    private void aK() {
        if (aB() == 0 || aB() <= c.d.c) {
            this.N = c.d.x;
        } else {
            this.N = c.d.x + (((((aB() - 1) / c.d.a) - c.d.b) + 1) * c.d.j);
        }
        this.K = false;
        a_(true);
        com.censivn.C3DEngine.a.d().g();
    }

    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.L) {
            this.L = false;
            float f = this.O;
            this.P = f;
            this.M = f;
            this.K = false;
            a_(true);
            com.censivn.C3DEngine.a.d().g();
        }
        this.P = this.M - (motionEvent2.getY() - motionEvent.getY());
    }

    public final void g(float f) {
        this.P -= f / 6.0f;
        n();
        this.L = true;
    }

    public final void n() {
        float f = (this.P - c.d.x) % c.d.j;
        float abs = Math.abs(f) / c.d.j;
        this.P -= f;
        if (abs > 0.5d) {
            if (f > 0.0f) {
                this.P += c.d.j;
            } else {
                this.P -= c.d.j;
            }
        }
        this.K = false;
        a_(true);
    }

    public final void o() {
        this.P = this.N;
        this.K = false;
        a_(true);
        J = 0.3f;
    }

    public final float p() {
        return this.P - c.d.x;
    }

    public final float q() {
        return this.O - c.d.x;
    }

    @Override // com.tsf.shell.workspace3D.g.c.o
    public final float aM() {
        return q();
    }

    public final void a(com.tsf.shell.workspace3D.k.ab abVar) {
        abVar.a((com.censivn.C3DEngine.d.b) null);
        this.E.L().setAllFrom(abVar.L());
        this.E.M().setAllFrom(abVar.M());
        this.E.N().setAllFrom(abVar.N());
        this.E.h(abVar.bI());
        int indexOf = aD().indexOf(abVar);
        if (indexOf != -1) {
            aD().set(indexOf, this.E);
        }
    }

    public final int b(com.tsf.shell.workspace3D.k.ab abVar) {
        abVar.h(this.E.bI());
        int indexOf = aD().indexOf(this.E);
        if (indexOf != -1) {
            abVar.a((com.censivn.C3DEngine.d.b) this);
            aD().set(indexOf, abVar);
            ((al) this.A.get(indexOf)).q = false;
            this.C = false;
            a_(true);
            com.censivn.C3DEngine.a.d().g();
        }
        return indexOf;
    }

    public final void aG() {
        e(this.E);
    }

    public final int g(com.censivn.C3DEngine.b.r rVar) {
        if (aD().indexOf(rVar) == -1) {
            return -1;
        }
        return (aB() - r1) - 1;
    }

    public final boolean a(int i, int i2) {
        int i3;
        int i4;
        int size = this.z.size();
        this.A.get((size - i2) - 1);
        if (((com.tsf.shell.workspace3D.k.ab) this.z.get((size - i2) - 1)).G) {
            return false;
        }
        aD().remove(this.E);
        aD().add((size - i2) - 1, this.E);
        if (i > i2) {
            i3 = i2;
            i4 = i;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i3 > size - 1) {
            i3 = size - 1;
        }
        int i5 = i4 > size + (-1) ? size - 1 : i4;
        while (i3 < i5 + 1) {
            ((al) this.A.get((size - i3) - 1)).q = false;
            i3++;
        }
        this.C = false;
        a_(true);
        com.censivn.C3DEngine.a.d().g();
        return true;
    }

    private void aL() {
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((al) this.A.get(i)).q = false;
        }
        this.C = false;
        a_(true);
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void g() {
        if (this.D) {
            MatrixStack.glTranslatef(L().x, this.O, L().z);
        } else {
            MatrixStack.glTranslatef(L().x, L().y, L().z);
        }
        com.censivn.C3DEngine.b.k.a(MatrixStack.rMVPMatrix, MatrixStack.rSceneMatrix, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.j, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.tsf.shell.workspace3D.g.c.o, com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public final void f() {
        if (this.D) {
            if (A()) {
                c();
                MatrixStack.glPushMatrix();
                e();
                aE();
                int size = this.z.size();
                for (int i = 0; i < size; i++) {
                    com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) this.z.get(i);
                    this.A.get(i);
                    if (!abVar.G && abVar.bI() && !i(abVar)) {
                        a((com.censivn.C3DEngine.b.r) abVar);
                        abVar.f();
                        b((com.censivn.C3DEngine.b.r) abVar);
                    }
                }
                int size2 = this.F.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    com.tsf.shell.workspace3D.g.c.q qVar = (com.tsf.shell.workspace3D.g.c.q) this.F.get(i2);
                    a(qVar.b);
                    qVar.b.f();
                    b(qVar.b);
                    if (this.z.contains(qVar.a)) {
                        a(qVar.a);
                        qVar.a.f();
                        b(qVar.a);
                    }
                }
                MatrixStack.glPopMatrix();
                MatrixStack.glPushMatrix();
                boolean z = this.D;
                this.D = false;
                g();
                this.D = z;
                for (int i3 = 0; i3 < size; i3++) {
                    com.tsf.shell.workspace3D.k.ab abVar2 = (com.tsf.shell.workspace3D.k.ab) this.z.get(i3);
                    this.A.get(i3);
                    if (abVar2.G && abVar2.bI() && !i(abVar2)) {
                        a((com.censivn.C3DEngine.b.r) abVar2);
                        abVar2.f();
                        b((com.censivn.C3DEngine.b.r) abVar2);
                    }
                }
                MatrixStack.glPopMatrix();
                ao.W.f();
                ao.X.f();
                m_();
                return;
            }
            return;
        }
        super.f();
    }

    private void a(com.tsf.shell.workspace3D.k.ab abVar, al alVar, float f) {
        if (abVar.G) {
            abVar.e(true);
            abVar.G = false;
            abVar.L().y -= f;
            alVar.a = alVar.g;
            alVar.b = alVar.h;
            alVar.r = 255.0f;
            alVar.c = 0.0f;
            alVar.d = 1.0f;
            alVar.e = 1.0f;
            alVar.q = false;
            this.C = false;
        }
    }

    public final void j(boolean z) {
        this.Q = z;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        float f;
        if (this.D) {
            if (!this.K || !this.L) {
                if (J == 0.0f) {
                    f = this.L ? 0.1f : 0.3f;
                } else {
                    f = J;
                }
                this.O = (f * (this.P - this.O)) + this.O;
                float f2 = (c.d.r - c.d.o) - (((this.O - c.d.x) / (this.N - c.d.x)) * c.d.t);
                c.d.P.L().y = f2;
                if (c.d.o + f2 > c.d.r) {
                    float f3 = (f2 + c.d.o) - c.d.r;
                    if (f3 < c.d.o) {
                        c.d.P.i(c.d.o - f3);
                        c.d.P.j(c.d.o);
                    } else {
                        c.d.P.i(0.0f);
                        float f4 = c.d.n - f3;
                        if (f4 < c.d.p) {
                            f4 = c.d.p;
                        }
                        c.d.P.j(f4);
                        c.d.P.L().y = c.d.r;
                    }
                } else if (f2 - c.d.o < c.d.s) {
                    float f5 = c.d.s - (f2 - c.d.o);
                    if (f5 < c.d.o) {
                        c.d.P.j(c.d.o - f5);
                        c.d.P.i(c.d.o);
                    } else {
                        c.d.P.j(0.0f);
                        float f6 = c.d.n - f5;
                        if (f6 < c.d.p) {
                            f6 = c.d.p;
                        }
                        c.d.P.i(f6);
                        c.d.P.L().y = c.d.s;
                    }
                }
                c.d.c();
                if (this.L) {
                    if (this.P < c.d.x) {
                        this.P += (c.d.x - this.P) * 0.1f;
                        if (Math.abs(this.P - c.d.x) < 0.2f) {
                            this.P = c.d.x;
                        }
                    } else if (this.P > this.N) {
                        this.P += (this.N - this.P) * 0.1f;
                        if (Math.abs(this.P - this.N) < 0.2f) {
                            this.P = this.N;
                        }
                    } else if (Math.abs(this.P - this.O) < 0.2f) {
                        this.O = this.P;
                        this.K = true;
                        J = 0.0f;
                        c.d.d();
                    }
                }
                float f7 = this.O - c.d.x;
                int size = aD().size();
                int i = c.d.a;
                for (int i2 = 0; i2 < size; i2++) {
                    com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) aD().get((size - 1) - i2);
                    al alVar = (al) this.A.get((size - 1) - i2);
                    if (alVar.h + abVar.k[1] + f7 > c.d.u) {
                        float f8 = ((alVar.h + abVar.k[1]) + f7) - c.d.u;
                        if (f8 >= abVar.k[1]) {
                            alVar.d = 0.0f;
                        } else {
                            alVar.d = (abVar.k[1] - f8) / abVar.k[1];
                        }
                        abVar.N().x = alVar.d;
                        abVar.N().y = alVar.d;
                        if (alVar.d == 0.0f || alVar.r == 0.0f) {
                            abVar.a((Boolean) false);
                        } else {
                            abVar.a((Boolean) true);
                        }
                        a(abVar, alVar, f7);
                    } else if (alVar.h + f7 < c.d.v) {
                        float f9 = c.d.v - (alVar.h + f7);
                        int i3 = i2 % i;
                        float f10 = f9 / c.d.j;
                        if (!abVar.G) {
                            abVar.e(false);
                            abVar.G = true;
                            abVar.L().y += f7;
                            ArrayList arrayList = c.d.D.sampleList;
                            int size2 = i3 > arrayList.size() + (-1) ? arrayList.size() - 1 : i3;
                            alVar.f = ((c.d.a - i3) - 1) * (0.5f / (c.d.a - 1));
                            Number3d number3d = ((SystemFolderTheme.SystemFolderChild) arrayList.get(size2)).position;
                            Number3d number3d2 = ((SystemFolderTheme.SystemFolderChild) arrayList.get(size2)).rotation;
                            Number3d number3d3 = ((SystemFolderTheme.SystemFolderChild) arrayList.get(size2)).scale;
                            alVar.i = number3d.x;
                            alVar.j = number3d.y;
                            alVar.k = number3d2.z;
                            alVar.l = number3d3.x;
                            float f11 = abVar.L().x;
                            alVar.a = f11;
                            alVar.m = f11;
                            float f12 = c.d.w;
                            alVar.b = f12;
                            alVar.n = f12;
                            alVar.c = 0.0f;
                            alVar.o = 0.0f;
                            alVar.d = 1.0f;
                            alVar.p = 1.0f;
                            alVar.q = false;
                            this.C = false;
                        }
                        if (f10 <= 1.0f) {
                            if (f10 >= alVar.f) {
                                float f13 = (f10 - alVar.f) / 0.5f;
                                if (f13 > 1.0f) {
                                    f13 = 1.0f;
                                }
                                alVar.a = alVar.m + ((alVar.i - alVar.m) * f13);
                                alVar.b = (alVar.n + ((alVar.j - alVar.n) * f13)) - ((1.0f - f13) * f9);
                                alVar.c = alVar.o + ((alVar.k - alVar.o) * f13);
                                alVar.d = alVar.p + ((alVar.l - alVar.p) * f13);
                                alVar.e = 1.0f - f13;
                                alVar.q = false;
                                this.C = false;
                            } else {
                                alVar.a = alVar.m;
                                alVar.b = alVar.n - f9;
                                alVar.c = alVar.o;
                                alVar.d = alVar.p;
                                alVar.e = 1.0f;
                                alVar.q = false;
                                this.C = false;
                            }
                            if (alVar.r != 255.0f) {
                                alVar.r = 255.0f;
                                alVar.q = false;
                                this.C = false;
                            }
                        } else if (f10 <= 2.0f) {
                            alVar.a = alVar.i;
                            alVar.b = alVar.j;
                            alVar.c = alVar.k;
                            alVar.d = alVar.l;
                            alVar.e = 0.0f;
                            alVar.r = (2.0f - f10) * 255.0f;
                            alVar.q = false;
                            this.C = false;
                        } else if (alVar.r != 0.0f) {
                            alVar.r = 0.0f;
                            alVar.e = 0.0f;
                            alVar.q = false;
                            this.C = false;
                        }
                    } else {
                        a(abVar, alVar, f7);
                        abVar.a((Boolean) true);
                        alVar.d = 1.0f;
                        abVar.N().x = alVar.d;
                        abVar.N().y = alVar.d;
                    }
                }
            }
            if (this.Q) {
                if (this.O < this.N) {
                    if (!H) {
                        ao.X.a((Boolean) true);
                        H = true;
                        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
                        uVar.a(255);
                        com.censivn.C3DEngine.g.s.a(ao.X);
                        com.censivn.C3DEngine.g.s.a(ao.X, 250, uVar);
                    }
                    if (ao.X.k()) {
                        this.P += I;
                        I += 0.5f;
                        if (this.P > this.N) {
                            this.P = this.N;
                        }
                        this.K = false;
                        a_(true);
                        com.censivn.C3DEngine.a.d().g();
                    }
                } else {
                    aI();
                }
                if (this.O > c.d.x) {
                    if (!G) {
                        G = true;
                        ao.W.a((Boolean) true);
                        com.censivn.C3DEngine.g.u uVar2 = new com.censivn.C3DEngine.g.u();
                        uVar2.a(255);
                        com.censivn.C3DEngine.g.s.a(ao.W);
                        com.censivn.C3DEngine.g.s.a(ao.W, 250, uVar2);
                    }
                    if (ao.W.k()) {
                        this.P -= I;
                        I += 0.5f;
                        if (this.P < c.d.x) {
                            this.P = c.d.x;
                        }
                        this.K = false;
                        a_(true);
                        com.censivn.C3DEngine.a.d().g();
                    }
                } else {
                    aH();
                }
            } else {
                if (G || H) {
                    n();
                }
                aH();
                aI();
            }
            if (!this.C) {
                this.C = true;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= aD().size()) {
                        break;
                    }
                    com.tsf.shell.workspace3D.k.ab abVar2 = (com.tsf.shell.workspace3D.k.ab) aD().get(i5);
                    al alVar2 = (al) this.A.get(i5);
                    if (!alVar2.q) {
                        float f14 = alVar2.a;
                        float f15 = alVar2.b;
                        abVar2.L().x += (f14 - abVar2.L().x) * 0.15f;
                        abVar2.L().y += (f15 - abVar2.L().y) * 0.15f;
                        abVar2.M().z += (alVar2.c - abVar2.M().z) * 0.15f;
                        Number3d N = abVar2.N();
                        Number3d N2 = abVar2.N();
                        float f16 = N2.y + ((alVar2.d - abVar2.N().x) * 0.15f);
                        N2.y = f16;
                        N.x = f16;
                        float bK = abVar2.bK();
                        abVar2.j(bK + ((alVar2.e - bK) * 0.15f));
                        float I2 = abVar2.I();
                        abVar2.b(I2 + ((alVar2.r - I2) * 0.15f));
                        if (Math.abs(abVar2.bK() - alVar2.e) < 0.2f && Math.abs(abVar2.I() - alVar2.r) < 0.2f && Math.abs(abVar2.L().x - f14) < 0.2f && Math.abs(abVar2.L().y - f15) < 0.2f && Math.abs(abVar2.N().x - alVar2.d) < 0.01f && Math.abs(abVar2.M().z - alVar2.c) < 0.2f) {
                            abVar2.L().x = f14;
                            abVar2.L().y = f15;
                            abVar2.M().z = alVar2.c;
                            Number3d N3 = abVar2.N();
                            Number3d N4 = abVar2.N();
                            float f17 = alVar2.d;
                            N4.y = f17;
                            N3.x = f17;
                            alVar2.q = true;
                            abVar2.b(alVar2.r);
                            abVar2.j(alVar2.e);
                        }
                        if (abVar2.I() == 0.0f || (abVar2.N().x == 0.0f && abVar2.N().y == 0.0f)) {
                            abVar2.a((Boolean) false);
                        } else {
                            abVar2.a((Boolean) true);
                        }
                    }
                    this.C = alVar2.q && this.C;
                    i4 = i5 + 1;
                }
            }
            if (this.C && this.K && this.L) {
                e(true);
                a_(false);
            }
        }
    }

    private void a(al alVar, com.censivn.C3DEngine.b.r rVar) {
        a(alVar, rVar, this.A.size() - 1);
    }

    private void a(al alVar, com.censivn.C3DEngine.b.r rVar, int i) {
        SystemFolderTheme.SystemFolderChild systemFolderChild;
        int i2 = c.d.c;
        ArrayList arrayList = c.d.D.sampleList;
        Number3d a = this.a.a(i);
        float f = a.x;
        alVar.i = f;
        alVar.g = f;
        alVar.a = f;
        float f2 = a.y;
        alVar.j = f2;
        alVar.h = f2;
        alVar.b = f2;
        alVar.p = 1.0f;
        alVar.l = 1.0f;
        alVar.d = 1.0f;
        alVar.o = 0.0f;
        alVar.k = 0.0f;
        alVar.c = 0.0f;
        alVar.r = 255.0f;
        alVar.e = 1.0f;
        alVar.q = true;
        com.tsf.shell.workspace3D.k.ab abVar = (com.tsf.shell.workspace3D.k.ab) rVar;
        if (i > i2 - 1 && abVar.bI()) {
            int i3 = i - i2;
            if (i3 < arrayList.size()) {
                systemFolderChild = (SystemFolderTheme.SystemFolderChild) arrayList.get(i3);
            } else {
                systemFolderChild = (SystemFolderTheme.SystemFolderChild) arrayList.get(i3 % arrayList.size());
                alVar.r = 0.0f;
            }
            alVar.f = ((c.d.a - (i % c.d.a)) - 1) * (0.5f / (c.d.a - 1));
            alVar.m = alVar.g;
            alVar.n = c.d.w;
            alVar.o = 0.0f;
            alVar.p = 1.0f;
            float f3 = systemFolderChild.position.x;
            alVar.a = f3;
            alVar.i = f3;
            float f4 = systemFolderChild.position.y;
            alVar.b = f4;
            alVar.j = f4;
            float f5 = systemFolderChild.scale.x;
            alVar.d = f5;
            alVar.l = f5;
            float f6 = systemFolderChild.rotation.z;
            alVar.k = f6;
            alVar.c = f6;
            alVar.e = 0.0f;
            abVar.e(false);
        }
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final void d(com.censivn.C3DEngine.b.r rVar) {
        al aT = aT();
        this.A.add(0, aT);
        super.d(rVar);
        a(aT, rVar);
        aK();
        aS();
    }

    @Override // com.censivn.C3DEngine.b.v
    public final void a(com.censivn.C3DEngine.b.r rVar, int i) {
        al aT = aT();
        this.A.add(0, aT);
        super.a(rVar, i);
        a(aT, d(0));
        aK();
        aL();
        aS();
    }

    private void aS() {
        if (this.D) {
            c.d.a(aB());
        }
    }

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.d.b
    public final boolean e(com.censivn.C3DEngine.b.r rVar) {
        boolean e = super.e(rVar);
        if (e) {
            a((al) this.A.remove(0));
            aK();
            aL();
            aS();
        }
        return e;
    }

    @Override // com.censivn.C3DEngine.b.v
    public final com.censivn.C3DEngine.b.r c(int i) {
        com.censivn.C3DEngine.b.r c = super.c(i);
        if (c != null) {
            a((al) this.A.remove(0));
            aK();
            aL();
            aS();
        }
        return c;
    }

    private al aT() {
        if (this.B.isEmpty()) {
            return new al(this);
        }
        al alVar = (al) this.B.remove(0);
        alVar.a = 0.0f;
        alVar.b = 0.0f;
        alVar.d = 1.0f;
        alVar.r = 255.0f;
        alVar.q = false;
        return alVar;
    }

    private void a(al alVar) {
        this.B.add(alVar);
    }
}
