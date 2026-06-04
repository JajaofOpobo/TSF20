package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.R;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class aj extends am {
    final /* synthetic */ ai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ai aiVar) {
        super(aiVar);
        this.a = aiVar;
    }

    @Override // com.tsf.shell.workspace3D.k.b.am
    public final void a(com.tsf.shell.workspace3D.k.j jVar, float f, float f2) {
        com.tsf.shell.workspace3D.k.al alVar = (com.tsf.shell.workspace3D.k.al) jVar;
        com.tsf.shell.workspace3D.k.s bv = alVar.bv();
        if (bv.k != null) {
            bv.k.a();
            return;
        }
        LauncherItem3DInfo a = this.a.a(alVar, bf.j().z(), f, f2, f, f2, 1.0f, 1.0f);
        if (a != null) {
            if (a.screen == -1) {
                com.tsf.shell.workspace3D.h.a l = bf.j().l();
                a.screen = l.aG();
                bf.j().a(l, null, new ak(this, alVar, a));
                return;
            }
            this.a.a(alVar, a);
        }
    }

    @Override // com.tsf.shell.workspace3D.k.b.am
    public final void a(com.tsf.shell.workspace3D.k.al alVar) {
        com.tsf.shell.workspace3D.k.s bv = alVar.bv();
        if (bv.k != null) {
            bv.k.a();
        } else {
            com.tsf.shell.au.a(R.string.notic_drag_to_desktop);
        }
    }
}
