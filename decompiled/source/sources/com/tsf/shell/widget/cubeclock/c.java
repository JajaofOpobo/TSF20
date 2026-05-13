package com.tsf.shell.widget.cubeclock;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.shell.VInformation;
/* loaded from: classes.dex */
public class c extends VWidgetContainer {
    public Context a;
    public VTextureManager b;
    public VObjectManager c;
    public VMessageQueueManager d;
    public n e;
    public b f;
    public p g;
    public k h;
    public int i;
    public q j;
    public s k;
    public com.tsf.shell.widget.cubeclock.a.a l;
    public c m;
    public float n;
    public float o;
    public float p;
    public com.tsf.shell.widget.cubeclock.provider.a q;

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
        j.a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.q = new com.tsf.shell.widget.cubeclock.provider.a(this);
        this.q.a(str);
        a(this.q);
    }

    private void a(com.tsf.shell.widget.cubeclock.provider.a aVar) {
        this.e = new n(this);
        this.f = new b(this);
        this.k = new s(this);
        this.g = new p(this);
        this.l = new com.tsf.shell.widget.cubeclock.a.a(this);
        addChild(this.l);
        this.j = new q(this);
        this.h = new k(this);
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
        j.a("onKillFocus");
        this.l.d();
    }
}
