package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.Home;
import com.tsf.shell.f.f.PageTouchHandler;
import com.tsf.shell.manager.action.GestureHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperTouchHandler extends com.censivn.C3DEngine.b.d.MouseEventListener {
    private boolean a;
    private PageTouchHandler.C b;

    public WallpaperTouchHandler(BaseRenderable jVar) {
        super(jVar);
        this.a = true;
    }

    public void a(PageTouchHandler.C cVar) {
        this.b = cVar;
    }

    public void a(boolean z) {
        this.a = z;
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void h(MotionEvent motionEvent) {
        f.b(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            com.tsf.shell.manager.app.StateHub.s().a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            com.tsf.shell.manager.app.StateHub.s().d(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void f(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.app.StateHub.s().d(motionEvent);
        }
        if (this.a) {
            com.tsf.shell.manager.app.LauncherAppInfo.c().sendWallpaperCommand(Home.b().l().getWindowToken(), "android.wallpaper.tap", (int) motionEvent.getX(), (int) motionEvent.getY(), 0, null);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void i(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.app.StateHub.s().b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void j(MotionEvent motionEvent) {
        if (this.a) {
            com.tsf.shell.manager.app.StateHub.s().c(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void c(MotionEvent motionEvent) {
        if (this.a && !this.b.a()) {
            com.tsf.shell.manager.app.ServiceFactory.n();
        } else {
            com.tsf.shell.manager.app.ServiceFactory.n();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.MouseEventListener
    public void e(MotionEvent motionEvent) {
        f.a(motionEvent);
    }
}
