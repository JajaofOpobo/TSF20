package com.censivn.C3DEngine.b;

import android.view.MotionEvent;
import android.view.View;
import com.tsf.shell.Home;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class n implements View.OnTouchListener {
    final /* synthetic */ m a;

    n(m mVar) {
        this.a = mVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        b bVar;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 0) {
            try {
                if (!bf.g()) {
                    return false;
                }
                float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
                r b = com.censivn.C3DEngine.a.d().b(a[0], a[1]);
                if (b == null || b.aw() == null) {
                    if (Home.d().f().a(motionEvent)) {
                        return false;
                    }
                }
            } catch (Exception e) {
            }
        }
        com.tsf.shell.action.c.b(obtain);
        z = this.a.h;
        if (z) {
            switch (obtain.getAction()) {
                case 2:
                    m.a(this.a, motionEvent);
                    bVar = this.a.b;
                    bVar.a(obtain);
                    break;
            }
            return false;
        }
        com.censivn.C3DEngine.a.a().c(new o(this, obtain));
        return true;
    }
}
