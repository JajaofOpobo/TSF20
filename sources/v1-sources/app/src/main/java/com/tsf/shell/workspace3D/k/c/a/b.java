package com.tsf.shell.workspace3D.k.c.a;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class b extends h {
    private int D;
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(aVar);
        this.a = aVar;
        this.D = 0;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void i_() {
        super.i_();
        this.a.j = L().y;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void bn() {
        super.bn();
        this.a.d();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a(float f, float f2) {
        super.a(f, f2);
        this.a.d();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void f(int i) {
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aR() {
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        h hVar;
        com.censivn.C3DEngine.e.b bVar4;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        com.censivn.C3DEngine.e.b bVar5;
        int i7;
        int i8;
        com.censivn.C3DEngine.e.b bVar6;
        float f;
        double d;
        bVar = this.a.g;
        if (bVar != null && this.B != null) {
            if (com.tsf.shell.workspace3D.k.b.a.a) {
                bVar4 = this.a.g;
                bVar4.a_(true);
                z = this.a.h;
                if (!z) {
                    z2 = this.a.i;
                    if (!z2 && !bo()) {
                        if (this.B.f) {
                            if (this.B.n != 0.0f) {
                                PositionNumber3d L = L();
                                f = this.a.j;
                                d = a.k;
                                L.y = f + (((float) Math.sin(d * this.D)) * this.B.n * com.censivn.C3DEngine.a.b);
                                this.D++;
                            }
                            z4 = this.a.l;
                            if (z4) {
                                L().x += this.B.e;
                                if (!this.B.m) {
                                    i7 = this.a.b;
                                } else {
                                    i7 = this.a.c;
                                }
                                if (L().x > i7) {
                                    if (this.B.m) {
                                        a aVar = this.a;
                                        bVar6 = this.a.g;
                                        a.a(bVar6);
                                        this.a.l = false;
                                        return;
                                    }
                                    PositionNumber3d L2 = L();
                                    i8 = this.a.d;
                                    L2.x = i8;
                                    return;
                                }
                                return;
                            }
                            L().x -= this.B.e;
                            if (!this.B.m) {
                                i5 = this.a.d;
                            } else {
                                i5 = this.a.e;
                            }
                            if (L().x < i5) {
                                if (this.B.m) {
                                    a aVar2 = this.a;
                                    bVar5 = this.a.g;
                                    a.a(bVar5);
                                    this.a.l = true;
                                    return;
                                }
                                PositionNumber3d L3 = L();
                                i6 = this.a.b;
                                L3.x = i6;
                                return;
                            }
                            return;
                        }
                        z3 = this.a.l;
                        if (z3) {
                            L().y += this.B.e;
                            float f2 = L().y;
                            i3 = this.a.b;
                            if (f2 > i3) {
                                PositionNumber3d L4 = L();
                                i4 = this.a.d;
                                L4.y = i4;
                                return;
                            }
                            return;
                        }
                        L().y -= this.B.e;
                        float f3 = L().y;
                        i = this.a.d;
                        if (f3 < i) {
                            PositionNumber3d L5 = L();
                            i2 = this.a.b;
                            L5.y = i2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            bVar2 = this.a.g;
            if (bVar2.w()) {
                bVar3 = this.a.g;
                bVar3.a_(false);
                hVar = this.a.f;
                hVar.bs();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        if (!be().isRecreate) {
            this.a.a();
        } else if (!a.l(this.a)) {
            bf.l().a((com.tsf.shell.workspace3D.k.j) this);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void a_() {
        this.a.h = true;
        super.a_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void o() {
        super.o();
        this.a.h = false;
        this.a.j = L().y;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void b_() {
        super.b_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void p() {
        super.p();
        this.a.i = true;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void q() {
        super.q();
        this.a.i = false;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void n() {
        i iVar;
        h hVar;
        super.n();
        iVar = a.a;
        hVar = this.a.f;
        iVar.b(hVar);
        this.a.f = null;
        this.a.g = null;
    }
}
