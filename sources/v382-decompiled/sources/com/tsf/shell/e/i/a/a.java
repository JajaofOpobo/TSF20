package com.tsf.shell.e.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.Home;
import com.tsf.shell.e.f.v;
import com.tsf.shell.manager.action.h;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    private boolean a;
    private v b;

    public a(l lVar) {
        super(lVar);
        this.a = true;
    }

    public void a(v vVar) {
        this.b = vVar;
    }

    public void a(boolean z) {
        this.a = z;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void h(MotionEvent motionEvent) {
        h.b(motionEvent);
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
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        h.a(motionEvent);
    }
}
