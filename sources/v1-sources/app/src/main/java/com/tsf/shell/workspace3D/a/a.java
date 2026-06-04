package com.tsf.shell.workspace3D.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.b.w;
import com.tsf.shell.Home;
import com.tsf.shell.workspace3D.ShellWallpaperManager;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.h.ao;

/* loaded from: classes.dex */
public final class a extends l {
    private boolean a;
    private ao c;

    public a(v vVar) {
        super(vVar);
        this.a = true;
    }

    public final void a(ao aoVar) {
        this.c = aoVar;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        com.tsf.shell.action.c.b(8);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a && this.c.c()) {
            bf.j().o().a(f);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a && this.c.c()) {
            bf.j().o().b(motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        if (this.a && this.c.c()) {
            bf.j().o().j();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (this.a) {
            ShellWallpaperManager.a().d().sendWallpaperCommand(Home.d().f().getWindowToken(), "android.wallpaper.tap", (int) motionEvent.getX(), (int) motionEvent.getY(), 0, null);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void i(MotionEvent motionEvent) {
        if (this.a && this.c.c()) {
            bf.j().o();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void j(MotionEvent motionEvent) {
        if (this.a && this.c.c()) {
            bf.j().o().i();
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        if (this.a && !this.c.a()) {
            b bVar = new b(this, motionEvent);
            com.censivn.C3DEngine.a.a();
            w.a(bVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a(motionEvent);
    }
}
