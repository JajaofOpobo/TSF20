package com.tsf.shell.workspace3D.g;

import android.view.KeyEvent;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
public final class ao extends com.censivn.C3DEngine.b.v implements com.tsf.shell.at {
    private static ar A;
    private static com.tsf.shell.workspace3D.k.a B;
    private static com.tsf.shell.h.l C;
    private static boolean D = false;
    private static ao a;

    public static void i() {
        a.k();
    }

    public static void j() {
        a = new ao();
        A = new ar(new com.censivn.C3DEngine.e.b.b(15.0f, 17.0f, 15.0f, 17.0f, 32.0f, 32.0f), a);
        a.d(A);
    }

    public static void a(com.tsf.shell.workspace3D.k.a aVar) {
        D = true;
        B = aVar;
        com.tsf.shell.h.l lVar = (com.tsf.shell.h.l) aVar.C.getLayoutParams();
        C = lVar;
        int i = lVar.d;
        int i2 = lVar.e;
        int i3 = (lVar.a - (com.censivn.C3DEngine.a.l / 2)) + (i / 2);
        int i4 = ((com.censivn.C3DEngine.a.m / 2) - lVar.b) - (i2 / 2);
        a.Q();
        bf.m().a(a);
        a.L().x = i3;
        a.L().y = i4;
        ao aoVar = a;
        A.a(i, i2);
        ao aoVar2 = a;
        A.az();
        ao aoVar3 = a;
        ar arVar = A;
        ar.o();
        ao aoVar4 = a;
        A.a((-i) / 2, (-i2) / 2, i / 2, i2 / 2);
        com.tsf.shell.aq.a(a);
    }

    @Override // com.tsf.shell.at
    public final void a(int i) {
        if (i == 4) {
            k();
        }
    }

    @Override // com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }

    public final void k() {
        if (D) {
            ar arVar = A;
            ar.p();
            B = null;
            a.Q();
            com.tsf.shell.aq.b(this);
            D = false;
        }
    }
}
