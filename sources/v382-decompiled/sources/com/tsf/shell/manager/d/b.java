package com.tsf.shell.manager.d;

import android.view.MotionEvent;
import com.tsf.shell.e.e.g;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class b {
    private float[] a = {0.0f, 0.0f};
    private boolean b = false;

    public void a(final g gVar, MotionEvent motionEvent) {
        if (gVar.o()) {
            x.a(motionEvent, this.a);
            if (!this.b) {
                com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.manager.d.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        g a = gVar.a((int) b.this.a[0], (int) b.this.a[1]);
                        b.this.b = false;
                        if (a != null && b.this.a(a)) {
                            gVar.f(a);
                        } else {
                            gVar.p();
                        }
                    }
                });
                this.b = true;
            }
        }
    }

    public boolean a(g gVar) {
        return true;
    }
}
