package com.tsf.shell.workspace3D.g;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class r extends com.tsf.shell.workspace3D.d.a {
    final /* synthetic */ p a;

    r(p pVar) {
        this.a = pVar;
    }

    @Override // com.tsf.shell.workspace3D.d.a, com.tsf.shell.at
    public final void a(int i) {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        if (i == 4) {
            bVar = p.g;
            if (bVar.P() != null) {
                bVar2 = p.g;
                if (bVar2.au()) {
                    bVar3 = p.g;
                    if (bVar3.I() == 255.0f) {
                        this.a.b();
                    }
                }
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.d.a, com.tsf.shell.at
    public final void a(int i, KeyEvent keyEvent) {
    }
}
