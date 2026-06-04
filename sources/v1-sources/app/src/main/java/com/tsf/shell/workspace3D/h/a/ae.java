package com.tsf.shell.workspace3D.h.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ae extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ x a;
    private float c;
    private com.tsf.shell.workspace3D.k.ah d;
    private boolean e;
    private boolean f;
    private com.tsf.shell.workspace3D.a.g g;
    private boolean h;
    private float[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(x xVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = xVar;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = new float[]{0.0f, 0.0f};
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        com.tsf.shell.workspace3D.k.o oVar;
        j jVar;
        j jVar2;
        if (this.h && (this.b instanceof com.tsf.shell.workspace3D.k.ah)) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.b;
            z = this.a.aG;
            if (!z) {
                z2 = this.a.aH;
                if (!z2) {
                    oVar = this.a.E;
                    if (oVar.d()) {
                        ahVar.bB();
                        return;
                    }
                    if (com.tsf.shell.workspace3D.z.a) {
                        jVar = this.a.aA;
                        if (jVar != null) {
                            jVar2 = this.a.aA;
                            if (jVar2.a()) {
                                return;
                            }
                        }
                        ahVar.bP();
                        return;
                    }
                    return;
                }
                x.a(this.a, ahVar);
                return;
            }
            ahVar.bX();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void k(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        com.tsf.shell.workspace3D.k.o oVar;
        j jVar;
        j jVar2;
        if (this.h && (this.b instanceof com.tsf.shell.workspace3D.k.ah)) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.b;
            z = this.a.aG;
            if (!z) {
                z2 = this.a.aH;
                if (!z2 && !com.tsf.shell.workspace3D.z.a) {
                    oVar = this.a.E;
                    if (!oVar.d()) {
                        jVar = this.a.aA;
                        if (jVar != null) {
                            jVar2 = this.a.aA;
                            if (jVar2.a()) {
                                return;
                            }
                        }
                        ahVar.bP();
                    }
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        z = this.a.ah;
        if (z && !com.tsf.shell.workspace3D.z.a && (this.b instanceof com.tsf.shell.workspace3D.k.ah)) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.b;
            z2 = this.a.aG;
            if (!z2) {
                z3 = this.a.aH;
                if (!z3) {
                    ahVar.bB();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r3 != false) goto L13;
     */
    @Override // com.censivn.C3DEngine.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        bf.s().F();
        z = this.a.ah;
        if (z && com.tsf.shell.workspace3D.z.a() && (this.b instanceof com.tsf.shell.workspace3D.k.ah)) {
            com.censivn.C3DEngine.b.v vVar = (com.censivn.C3DEngine.b.v) this.b.P();
            this.d = ((com.tsf.shell.workspace3D.k.ah) this.b).cg();
            Number3d c = this.d.c(new Number3d(0.0f, 0.0f, 0.0f));
            z2 = this.a.aG;
            if (!z2) {
                z3 = this.a.aH;
            }
            this.a.br();
            this.e = true;
            vVar.d(this.d);
            c.z = 0.0f;
            this.d.L().setAllFrom(c);
            this.d.M().setAll(0.0f, 0.0f, 0.0f);
            this.d.a(bf.j().d(0));
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.b;
            if (ahVar.aV().d()) {
                ArrayList e = ahVar.aV().e();
                for (int i = 0; i < e.size(); i++) {
                    com.tsf.shell.workspace3D.k.ah ahVar2 = (com.tsf.shell.workspace3D.k.ah) e.get(i);
                    if (ahVar2 != this.b) {
                        com.tsf.shell.workspace3D.k.ah cg = ahVar2.cg();
                        cg.L().setAll(0.0f, 0.0f, 0.0f);
                        cg.M().setAll(0.0f, 0.0f, 0.0f);
                        this.d.a((com.tsf.shell.workspace3D.k.z) cg);
                        ((com.tsf.shell.workspace3D.a.d) this.d.aw()).a();
                    }
                }
                this.a.k().b();
            }
            this.g = (com.tsf.shell.workspace3D.a.g) this.d.aw();
            this.d.bv();
            this.g.c(motionEvent);
            bf.j().a(this.d);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        boolean z;
        bf.s().G();
        z = this.a.ah;
        if (z) {
            if (this.f) {
                if (this.g != null) {
                    this.g.d(motionEvent);
                }
            } else if (this.b instanceof com.tsf.shell.workspace3D.k.ah) {
                this.e = false;
                if (bf.j().z() == -1) {
                    if (this.d != null) {
                        bf.m().d();
                        this.d.H();
                        bf.j().s();
                        return;
                    }
                    return;
                }
                if (this.g != null) {
                    this.g.d(motionEvent);
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.e) {
            com.censivn.C3DEngine.h.a.a(motionEvent2, this.i);
            com.tsf.shell.workspace3D.g.g a = this.d.a((int) this.i[0], (int) this.i[1]);
            if (a == null || a != bf.s().h()) {
                if (this.g != null) {
                    this.g.a(motionEvent, motionEvent2);
                    return;
                }
                return;
            } else {
                this.f = true;
                this.e = false;
                if (this.g != null) {
                    this.g.a(false);
                }
                bf.j().y();
                return;
            }
        }
        if (this.f && this.g != null) {
            this.g.a(motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        boolean z;
        com.tsf.shell.action.c.a(motionEvent);
        z = this.a.ah;
        this.h = z;
        this.a.ag = false;
        this.f = false;
        if (this.b instanceof com.tsf.shell.workspace3D.k.ah) {
            com.tsf.shell.workspace3D.k.ah ahVar = (com.tsf.shell.workspace3D.k.ah) this.b;
            ((com.tsf.shell.workspace3D.k.ah) this.b).bO();
            if (ahVar.bQ()) {
                ahVar.bS();
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.censivn.C3DEngine.a.a().c(new af(this, motionEvent2, motionEvent));
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        boolean z;
        e eVar;
        e eVar2;
        e eVar3;
        z = this.a.ag;
        if (z) {
            this.a.ag = false;
            this.a.ay = 0.0f;
            eVar = this.a.ad;
            if (eVar.a <= 0.5d) {
                eVar2 = this.a.ad;
                if (eVar2.a < -0.5d) {
                    x.H(this.a);
                }
            } else {
                x.G(this.a);
            }
            eVar3 = this.a.ad;
            eVar3.aH();
            return;
        }
        x.l(this.a);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.a.az = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        e eVar;
        this.a.ag = false;
        this.a.ay = 0.0f;
        if (Math.abs(f) > 100.0f) {
            if (f < 0.0f) {
                x.H(this.a);
            } else {
                x.G(this.a);
            }
        }
        eVar = this.a.ad;
        eVar.aH();
    }
}
