package com.tsf.shell.widget.cubeclock;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.shell.VInformation;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CubeClockFace extends VWidgetContainer {
    public class Context 
    public class VTextureManager 
    public class VObjectManager 
    public class VMessageQueueManager 
    public n e;
    public b f;
    public p g;
    public k h;
    public int i;
    public q j;
    public s k;
    public com.tsf.shell.widget.cubeclock.a.CubeClockDefaultFace l;
    public c m;
    public float n;
    public float o;
    public float p;
    public com.tsf.shell.widget.cubeclock.CubeClockWidgetFacerovider.a q;

    public c(Context context, int i) {
        super(i);
        this.n = 1.3333334f;
        this.o = VInformation.Scale();
        this.p = this.o / this.n;
        this.m = this;
        this.i = i;
        this.a = context;
        this.b = getTextureManager();
        this.c = getObjectManager();
        this.c.addObject(this);
        this.d = new VMessageQueueManager(i);
        lockView(true);
        setUserRotation(false);
        interceptMouseEventVerticalScroll(true);
        a(false);
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        CubeClockEmpty.a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.q = new com.tsf.shell.widget.cubeclock.CubeClockWidgetFacerovider.a(this);
        this.q.a(str);
        a(this.q);
    }

    private void a(com.tsf.shell.widget.cubeclock.CubeClockWidgetFacerovider.a aVar) {
        this.e = new CubeClockWeatherFace(this);
        this.f = new CubeClockDigitFace(this);
        this.k = new CubeClockMusicFace(this);
        this.g = new CubeClockWidgetFace(this);
        this.l = new com.tsf.shell.widget.cubeclock.a.CubeClockDefaultFace(this);
        addChild(this.l);
        this.j = new CubeClockTouchHandler(this);
        this.h = new CubeClockRenderer(this);
        this.c.addObject(this.l);
        addChild(this.h);
        this.j.c(this.h.a == 0 ? 1000 : 60000);
    }

    public void a(boolean z) {
        if (z) {
            setAABBPX((-280.0f) * this.p, this.p * (-240.0f), 0.0f, 280.0f * this.p, 70.0f * this.p, 0.0f);
        } else {
            setAABBPX((-280.0f) * this.p, this.p * (-70.0f), 0.0f, 280.0f * this.p, 70.0f * this.p, 0.0f);
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        this.j.a();
        this.d.pause();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        this.j.b();
        this.d.resume();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        this.j.c();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onKillFocus() {
        CubeClockEmpty.a("onKillFocus");
        this.l.d();
    }
}
