package com.tsf.shell.setting;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class m extends com.tsf.shell.workspace3D.g.b.k {
    final /* synthetic */ l a;

    m(l lVar) {
        this.a = lVar;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final boolean h(boolean z) {
        return com.tsf.shell.workspace3D.z.a();
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final boolean a(com.tsf.shell.workspace3D.k.j jVar) {
        return false;
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void b(com.tsf.shell.workspace3D.k.j jVar) {
        super.b(jVar);
        l.a(this.a);
    }

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.j e = e(motionEvent);
        if (e != null) {
            com.tsf.shell.g.h.a();
            e.aw().a(motionEvent);
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

    @Override // com.tsf.shell.workspace3D.g.b.k
    public final void b(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a();
    }
}
