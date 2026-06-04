package com.tsf.shell.workspace3D.k.c.b;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ac extends com.tsf.shell.workspace3D.k.z implements com.tsf.shell.workspace3D.g.x {
    final /* synthetic */ c C;
    private c D;
    private boolean a = false;

    public ac(c cVar, c cVar2) {
        this.C = cVar;
        this.D = cVar2;
        o(false);
        n(true);
        ((com.tsf.shell.workspace3D.k.j) this).M = 1.2f;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void b(float f) {
        this.D.l().b(f);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final float I() {
        return this.D.l().I();
    }

    @Override // com.tsf.shell.workspace3D.k.j, com.tsf.shell.workspace3D.g.g
    public final int i() {
        return 1;
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final boolean a() {
        return this.a;
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // com.tsf.shell.workspace3D.g.x
    public final boolean b() {
        return this.C.g.au();
    }

    public final c aH() {
        return this.D;
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void b_() {
        super.b_();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void f(int i) {
        com.tsf.shell.workspace3D.h.d.i.b.a(this, i);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aR() {
        if (aT() != null) {
            aT().a(this);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.z
    public final ArrayList a(ArrayList arrayList) {
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(4);
        if (M().z != 0.0f) {
            arrayList.add(6);
        }
        return arrayList;
    }
}
