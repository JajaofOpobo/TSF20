package com.tsf.shell.workspace3D.a;

import android.view.MotionEvent;
import com.tsf.shell.workspace3D.k.ab;

/* loaded from: classes.dex */
public final class g extends d {
    private ab f;

    public g(ab abVar) {
        super(abVar);
        this.f = abVar;
    }

    @Override // com.tsf.shell.workspace3D.a.d, com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.f.aR();
        this.f.bO();
        com.tsf.shell.action.c.a(motionEvent);
    }
}
