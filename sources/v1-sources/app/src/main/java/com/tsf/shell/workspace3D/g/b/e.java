package com.tsf.shell.workspace3D.g.b;

import android.view.MotionEvent;
import com.tsf.shell.workspace3D.k.z;

/* loaded from: classes.dex */
final class e extends k {
    final /* synthetic */ b a;

    e(b bVar) {
        this.a = bVar;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void c(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.o oVar;
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            oVar = this.a.J;
            if (oVar.d()) {
                ((z) e).bB();
            } else if (!com.tsf.shell.workspace3D.z.a) {
                ((z) e).bB();
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.o oVar;
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            oVar = this.a.J;
            if (oVar.d()) {
                ((z) e).bB();
            }
        }
    }
}
