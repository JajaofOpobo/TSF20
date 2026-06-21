package com.tsf.shell.e.i.a;

import android.view.MotionEvent;
import com.tsf.shell.manager.action.h;

/* loaded from: classes.dex */
public class d extends c {
    private com.tsf.shell.e.i.b.e.b g;

    public d(com.tsf.shell.e.i.b.e.b bVar) {
        super(bVar);
        this.g = bVar;
    }

    @Override // com.tsf.shell.e.i.a.c, com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.g.aQ();
        h.a(motionEvent);
    }
}
