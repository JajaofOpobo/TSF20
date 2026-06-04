package com.tsf.shell.workspace3D.k;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.workspace3D.be;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends com.censivn.C3DEngine.b.v implements com.tsf.shell.workspace3D.g.g {
    private com.tsf.shell.workspace3D.h.a A;
    private com.tsf.shell.workspace3D.g.g G;
    private int I;
    private com.tsf.shell.workspace3D.h.d.a K;
    protected com.censivn.C3DEngine.e.b.a N;
    private int O;
    private o Q;
    private boolean R;
    private LauncherItem3DInfo a;
    private boolean B = true;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = true;
    private boolean H = false;
    public boolean L = false;
    public float M = 1.0f;
    private float J = 1.0f;
    private boolean P = true;
    private boolean S = true;
    private float T = 0.4f;
    private float U = 1.6f;
    private boolean V = false;

    @Override // com.censivn.C3DEngine.b.v, com.censivn.C3DEngine.b.r
    public void H() {
        super.H();
    }

    public final void g(float f) {
        this.J = f;
    }

    public final float aN() {
        return this.J;
    }

    public final float aO() {
        return this.l[0] - this.k[0];
    }

    public final float aP() {
        return this.k[1] - this.m[1];
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void Z() {
        MatrixStack.glTranslatef(L().x, L().y, L().z);
        MatrixStack.glRotatef(M().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(M().y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(M().z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(N().x * this.J, N().y * this.J, N().y * this.J);
        com.censivn.C3DEngine.b.k.a(MatrixStack.rMVPMatrix, MatrixStack.rSceneMatrix, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.j, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    @Override // com.censivn.C3DEngine.b.r
    public void g() {
        MatrixStack.glTranslatef(L().x, L().y, L().z);
        MatrixStack.glRotatef(M().x, 1.0f, 0.0f, 0.0f);
        MatrixStack.glRotatef(M().y, 0.0f, 1.0f, 0.0f);
        MatrixStack.glRotatef(M().z, 0.0f, 0.0f, 1.0f);
        MatrixStack.glScalef(N().x * this.J, N().y * this.J, N().y * this.J);
        com.censivn.C3DEngine.b.k.a(MatrixStack.rMVPMatrix, MatrixStack.rSceneMatrix, MatrixStack.matrix, MatrixStack.topIndex);
        System.arraycopy(MatrixStack.rMVPMatrix, 0, this.j, 0, 16);
        GLES20.glUniformMatrix4fv(ShaderManager.CURRENT_SHADER.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public final void j(boolean z) {
        this.P = z;
    }

    public final boolean aQ() {
        return this.P;
    }

    public void f(int i) {
        if (this.P) {
            com.tsf.shell.workspace3D.h.d.i.b.a(this, i);
        }
    }

    public void aR() {
        if (this.P && this.K != null) {
            this.K.a(this);
        }
    }

    public final void a(com.tsf.shell.workspace3D.h.d.a aVar) {
        this.K = aVar;
    }

    public final void g(int i) {
        this.O = i;
    }

    public final int aS() {
        return this.O;
    }

    public final com.tsf.shell.workspace3D.h.d.a aT() {
        return this.K;
    }

    public static void aU() {
    }

    public void a(float f, float f2) {
    }

    public final o aV() {
        return this.Q;
    }

    public final void a(o oVar) {
        this.Q = oVar;
    }

    public final void aW() {
        this.Q = null;
    }

    @Override // com.censivn.C3DEngine.b.r
    public void l_() {
        super.l_();
        if (this.R) {
            com.tsf.shell.workspace3D.g.a.b();
        }
    }

    public void aX() {
        if (this.Q != null) {
            this.Q.a(this);
        }
    }

    public final void k(boolean z) {
        this.R = z;
    }

    public final boolean aY() {
        return this.R;
    }

    public void h_() {
        com.censivn.C3DEngine.a.a().b(new k(this, this));
    }

    public void aM() {
        com.censivn.C3DEngine.a.a().b(new l(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if ((r0 - M().z) > (M().z - r1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if ((M().z - r0) <= (r1 - M().z)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void aZ() {
        int i;
        int i2;
        if (M().z % 360.0f != 0.0f) {
            int abs = Math.abs(((int) M().z) / 360);
            if (M().z > 0.0f) {
                i = abs * 360;
                i2 = (abs + 1) * 360;
            } else {
                i = (-abs) * 360;
                i2 = (-(abs + 1)) * 360;
            }
            m mVar = new m(this, this);
            mVar.e(i);
            com.censivn.C3DEngine.g.s.a(this, 250, mVar);
        }
    }

    public final void ba() {
        com.tsf.shell.workspace3D.g.a.a(this);
    }

    public final void bb() {
        if (this.R) {
            com.tsf.shell.workspace3D.g.a.b();
        }
    }

    public void a(com.tsf.shell.workspace3D.h.a aVar) {
        this.A = aVar;
        this.Q = aVar.k();
    }

    public final com.tsf.shell.workspace3D.h.a bc() {
        return this.A;
    }

    public final void h(int i) {
        this.I = i;
    }

    public final int bd() {
        return this.I;
    }

    public final void a(LauncherItem3DInfo launcherItem3DInfo) {
        this.a = launcherItem3DInfo;
    }

    public final LauncherItem3DInfo be() {
        return this.a;
    }

    public final boolean bf() {
        return this.H;
    }

    public final void l(boolean z) {
        this.B = z;
    }

    public final boolean bg() {
        return this.B;
    }

    public final void m(boolean z) {
        this.C = z;
    }

    public final boolean bh() {
        return this.C;
    }

    public final void n(boolean z) {
        this.D = z;
    }

    public final boolean bi() {
        return this.D;
    }

    public final boolean bj() {
        return this.S;
    }

    public final void o(boolean z) {
        this.S = z;
    }

    public final void h(float f) {
        this.T = f;
    }

    public final void i(float f) {
        this.U = f;
    }

    public final float bk() {
        return this.T;
    }

    public final float bl() {
        return this.U;
    }

    public final void bm() {
        this.V = true;
    }

    public void bn() {
        this.V = false;
        a((Runnable) null);
    }

    public final boolean bo() {
        return this.V;
    }

    public final void bp() {
        if (this.S) {
            com.tsf.shell.workspace3D.g.aj.a(this);
        }
    }

    public void bq() {
        if (this.S) {
            com.tsf.shell.workspace3D.g.aj.i();
        }
        if (this.R) {
            com.tsf.shell.workspace3D.g.a.b();
        }
    }

    public void br() {
    }

    public void a_() {
        a_(true);
        bp();
    }

    public void aI() {
        if (this.S) {
            com.tsf.shell.workspace3D.g.aj.i();
        }
    }

    public void o() {
    }

    public void b_() {
        a_(false);
        a((Runnable) null);
    }

    public void i_() {
        LauncherItem3DInfo launcherItem3DInfo = this.a;
        if (com.censivn.C3DEngine.a.q) {
            L().x = launcherItem3DInfo.cellX;
            L().y = launcherItem3DInfo.cellY;
            M().z = launcherItem3DInfo.rotation;
            this.J = launcherItem3DInfo.scale;
        } else {
            L().x = launcherItem3DInfo.cellXH;
            L().y = launcherItem3DInfo.cellYH;
            M().z = launcherItem3DInfo.rotationH;
            this.J = launcherItem3DInfo.scaleH;
        }
        float[] a = be.a(this);
        L().x = a[0];
        L().y = a[1];
    }

    public final void bs() {
        a((Runnable) null);
    }

    public final void a(Runnable runnable) {
        bf.l().a(this.a, runnable);
    }

    public void c_() {
        bb();
    }

    public void d_() {
    }

    public void e_() {
        this.H = true;
        bb();
    }

    public void n() {
        if (this.Q != null) {
            this.Q.b(this);
        }
    }

    public void p() {
    }

    public void q() {
    }

    public final void bt() {
        this.E = true;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean l() {
        return this.E;
    }

    public final void bu() {
        this.F = true;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final boolean k() {
        return this.F;
    }

    public int i() {
        return 0;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final com.tsf.shell.workspace3D.g.g j() {
        return this.G;
    }

    public boolean a(com.tsf.shell.workspace3D.g.g gVar, float f, float f2) {
        return false;
    }

    public void a(com.tsf.shell.workspace3D.g.g gVar) {
    }

    public boolean d(com.tsf.shell.workspace3D.g.g gVar) {
        return true;
    }

    public void c(com.tsf.shell.workspace3D.g.g gVar) {
    }

    public void b(com.tsf.shell.workspace3D.g.g gVar) {
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void e(com.tsf.shell.workspace3D.g.g gVar) {
        if (this.G != gVar) {
            m();
            gVar.b(this);
        }
        this.G = gVar;
        this.G.a(this);
    }

    public boolean f(com.tsf.shell.workspace3D.g.g gVar) {
        e(gVar);
        boolean d = gVar.d(this);
        this.G = null;
        return d;
    }

    @Override // com.tsf.shell.workspace3D.g.g
    public final void m() {
        if (this.G != null) {
            this.G.c(this);
            this.G = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.workspace3D.g.g
    public final com.tsf.shell.workspace3D.g.g a(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList a = bf.o().a();
        for (int size = a.size() - 1; size >= 0; size--) {
            com.tsf.shell.workspace3D.g.g gVar = (com.tsf.shell.workspace3D.g.g) a.get(size);
            if (gVar.l()) {
                if (gVar.i() == 0) {
                    f3 = i2;
                    f4 = i;
                } else {
                    float f5 = L().x;
                    f3 = L().y;
                    f4 = f5;
                }
                if (((com.censivn.C3DEngine.b.r) gVar).b(f4, f3) && !gVar.a(this, f4, f3)) {
                    return gVar;
                }
            }
        }
        if (bf.j().j() == 2) {
            Iterator it = bf.j().A().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
                if (rVar instanceof j) {
                    j jVar = (j) rVar;
                    if (jVar.E) {
                        if (jVar.i() == 0) {
                            f = i;
                            f2 = i2;
                        } else {
                            f = L().x;
                            f2 = L().y;
                        }
                        if (jVar.b(f, f2) && !jVar.a(this, f, f2)) {
                            return jVar;
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
