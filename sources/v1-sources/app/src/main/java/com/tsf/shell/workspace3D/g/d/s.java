package com.tsf.shell.workspace3D.g.d;

import android.graphics.Rect;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.au;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ r a;
    private final /* synthetic */ r b;

    s(r rVar, r rVar2) {
        this.a = rVar;
        this.b = rVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.f != null && this.a.f.contains("tsf://")) {
                com.tsf.shell.action.r.a(this.a.f);
            } else {
                com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) this.b.a;
                Number3d.TEMPNUMBER3D4.reset();
                Number3d c = rVar.c(Number3d.TEMPNUMBER3D4);
                this.b.e.setSourceBounds(new Rect((int) (c.x + rVar.al()), (int) (c.y + rVar.am()), (int) (c.x + rVar.ao()), (int) (rVar.ap() + c.y)));
                Home.d().b(this.b.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            au.a(com.censivn.C3DEngine.a.c().getString(R.string.activity_not_found));
        }
    }
}
