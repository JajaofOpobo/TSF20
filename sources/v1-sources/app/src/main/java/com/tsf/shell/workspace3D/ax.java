package com.tsf.shell.workspace3D;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class ax extends com.tsf.shell.workspace3D.g.b.k {
    final /* synthetic */ av A;
    boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(av avVar, com.tsf.shell.workspace3D.g.c.o oVar) {
        super(oVar);
        this.A = avVar;
        this.a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.censivn.C3DEngine.b.r
    public final com.censivn.C3DEngine.b.r b(float f, float f2, boolean z) {
        com.censivn.C3DEngine.b.r rVar;
        com.censivn.C3DEngine.b.r rVar2 = null;
        if (au() && (A() || (this instanceof com.censivn.C3DEngine.e.c))) {
            if (this instanceof com.censivn.C3DEngine.b.v) {
                if (!(this instanceof com.tsf.shell.workspace3D.g.c.o)) {
                    rVar = null;
                } else {
                    com.tsf.shell.workspace3D.g.c.o oVar = (com.tsf.shell.workspace3D.g.c.o) this;
                    for (int size = oVar.aQ().size() - 1; size >= 0; size--) {
                        com.censivn.C3DEngine.b.r b = ((com.tsf.shell.workspace3D.g.c.q) oVar.aQ().get(size)).a.b(f, f2, false);
                        if (b != null) {
                            return b;
                        }
                        rVar2 = ((com.tsf.shell.workspace3D.g.c.q) oVar.aQ().get(size)).b.b(f, f2, false);
                        if (rVar2 != null) {
                            return rVar2;
                        }
                    }
                    rVar = rVar2;
                }
                rVar2 = rVar;
                for (int size2 = aD().size() - 1; size2 >= 0; size2--) {
                    rVar2 = ((com.censivn.C3DEngine.b.r) aD().get(size2)).b(f, f2, false);
                    if (rVar2 != null) {
                        return rVar2;
                    }
                }
            }
            if (rVar2 == null && aw() != null && !av() && !z && b(f, f2)) {
                return this;
            }
        }
        return rVar2;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final boolean h(boolean z) {
        if (z) {
            return z.a();
        }
        return !z.a;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final boolean a(com.tsf.shell.workspace3D.k.j jVar) {
        com.tsf.shell.workspace3D.h.a k;
        boolean z;
        super.a(jVar);
        if (bf.j().k().aG() == -1) {
            com.tsf.shell.workspace3D.h.a l = bf.j().l();
            bf.m().a(jVar);
            k = l;
            z = true;
        } else {
            k = bf.j().k();
            z = false;
        }
        ay ayVar = new ay(this, jVar, k);
        if (z) {
            bf.j().a(k, null, ayVar);
        } else {
            ayVar.run();
        }
        return true;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        super.b(jVar);
        if (!this.a) {
            this.A.n();
        }
        this.a = false;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void b(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a();
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            ((com.tsf.shell.workspace3D.k.ab) e).bO();
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void c(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.o oVar;
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            oVar = this.A.p;
            if (oVar.d()) {
                ((com.tsf.shell.workspace3D.k.ab) e).bB();
            } else if (!z.a) {
                ((com.tsf.shell.workspace3D.k.ab) e).bB();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.o oVar;
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            oVar = this.A.p;
            if (oVar.d()) {
                ((com.tsf.shell.workspace3D.k.ab) e).bB();
            } else if (z.a) {
                ((com.tsf.shell.workspace3D.k.ab) e).bP();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void d(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.o oVar;
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            oVar = this.A.p;
            if (!oVar.d() && !z.a) {
                ((com.tsf.shell.workspace3D.k.ab) e).bP();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final int a(float f, float f2) {
        float f3 = f2 - d().y;
        int j_ = j_();
        for (int i = 0; i < j_; i++) {
            Number3d a = a(i);
            if (f3 > (-64.0f) + a.y && f3 < a.y + 64.0f) {
                return i;
            }
        }
        return j_ - 1;
    }
}
