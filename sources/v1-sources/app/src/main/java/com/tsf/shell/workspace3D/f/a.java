package com.tsf.shell.workspace3D.f;

import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends v {
    private com.censivn.C3DEngine.e.b A;
    private com.censivn.C3DEngine.e.b B;
    private com.censivn.C3DEngine.e.b C;
    private com.censivn.C3DEngine.c.a D;
    private com.censivn.C3DEngine.c.b.WavePhysicsSystem E;
    private int F;
    private int G;
    private float H;
    private boolean I;
    private boolean J;
    private float K;
    private int L;
    private int M;
    private boolean N;
    private int O;
    public int a;

    static /* synthetic */ void b(a aVar) {
        if (aVar.C.A()) {
            aVar.C.a((Boolean) false);
        }
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        int i = 0;
        if (this.H != -1.0f) {
            this.K = (float) (this.K + ((this.H - this.A.L().x) * 0.1d));
            this.A.L().x = (int) this.K;
            this.B.L().x = this.A.L().x;
            if (!this.N) {
                if (this.K < 1.0f) {
                    this.A.L().x = 0.0f;
                    this.H = -1.0f;
                    s.a(this.C);
                    b bVar = new b(this);
                    bVar.f(-50.0f);
                    s.a(this.C, ThemeShellDescription.PAGE_PREVIEW_SELECT, bVar);
                } else if (this.K > this.a - 1) {
                    this.A.e(true);
                    this.A.L().x = this.a;
                    this.H = -1.0f;
                } else {
                    this.A.e(false);
                }
            }
        }
        if (this.C.A()) {
            if (this.I) {
                this.J = true;
                return;
            }
            if (this.J) {
                this.J = false;
            }
            this.E.c((float) ((Math.cos(1.0d) * 2.0d) - (Math.random() * 2.0d)));
            this.D.a();
            ArrayList b = this.E.b();
            float f = this.A.L().x;
            while (true) {
                int i2 = i;
                if (i2 >= this.G + 1) {
                    return;
                }
                com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar2 = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) b.get(this.M - i2);
                bVar2.a((((this.L * i2) + f) - this.F) + this.O + 1.0f);
                bVar2.c(0.0f);
                i = i2 + 1;
            }
        }
    }
}
