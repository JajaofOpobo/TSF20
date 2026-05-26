package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.action.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    private boolean a;
    private n.c b;

    public a(j jVar) {
        super(jVar);
        this.a = true;
    }

    public void a(n.c cVar) {
        this.b = cVar;
    }

    public void a(boolean z) {
        this.a = z;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void h(MotionEvent motionEvent) {
        f.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            com.tsf.shell.manager.a.h.s().a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            com.tsf.shell.manager.a.h.s().d(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.a.h.s().d(motionEvent);
        }
        if (this.a) {
            com.tsf.shell.manager.a.f.c().sendWallpaperCommand(Home.b().l().getWindowToken(), "android.wallpaper.tap", (int) motionEvent.getX(), (int) motionEvent.getY(), 0, null);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void i(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.a.h.s().b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void j(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.a.h.s().c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        if (this.a && !this.b.a()) {
            com.tsf.shell.manager.a.o.n();
        } else {
            com.tsf.shell.manager.a.o.n();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        f.a(motionEvent);
    }
}
