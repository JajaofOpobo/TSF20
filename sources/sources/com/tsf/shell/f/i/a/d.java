package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.tsf.shell.manager.action.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends c {
    private com.tsf.shell.f.i.b.e.b g;

    public d(com.tsf.shell.f.i.b.e.b bVar) {
        super(bVar);
        this.g = bVar;
    }

    @Override // com.tsf.shell.f.i.a.c, com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.g.aQ();
        f.a(motionEvent);
    }
}
