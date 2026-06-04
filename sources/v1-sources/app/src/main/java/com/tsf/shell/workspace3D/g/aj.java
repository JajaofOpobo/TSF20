package com.tsf.shell.workspace3D.g;

import android.view.KeyEvent;
import com.tsf.shell.bd;
import com.tsf.shell.bj;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class aj extends com.censivn.C3DEngine.b.v implements com.tsf.shell.at, bj {
    private static al A;
    private static boolean B = false;
    private static com.tsf.shell.workspace3D.k.j C;
    private static Runnable D;
    private static aj a;

    public static void i() {
        if (B) {
            com.censivn.C3DEngine.a.a().c(D);
        }
    }

    public static void j() {
        a.l();
    }

    public static void k() {
        a = new aj();
        D = new ak();
        A = new al(new com.censivn.C3DEngine.e.b.b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f));
        a.d(A);
    }

    public static void a(com.tsf.shell.workspace3D.k.j jVar) {
        B = true;
        C = jVar;
        jVar.bm();
        a.Q();
        a.M().z = jVar.M().z;
        a.L().setAllFrom(jVar.L());
        bf.m().a(a);
        aj ajVar = a;
        A.a(Math.abs(jVar.k[0] * jVar.aN()), Math.abs(jVar.l[0] * jVar.aN()), Math.abs(jVar.m[1] * jVar.aN()), Math.abs(jVar.k[1] * jVar.aN()));
        aj ajVar2 = a;
        A.az();
        aj ajVar3 = a;
        al alVar = A;
        com.tsf.shell.aq.a(a);
        bd.a(a);
    }

    @Override // com.tsf.shell.bj
    public final void b_(int i, int i2, int i3, int i4) {
        l();
    }

    @Override // com.tsf.shell.bj
    public final void b(int i) {
    }

    @Override // com.tsf.shell.bj
    public final void p_() {
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            l();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void l() {
        if (B) {
            A.p();
            C.bn();
            C = null;
            a.Q();
            com.tsf.shell.aq.b(this);
            bd.b(a);
            B = false;
        }
    }
}
