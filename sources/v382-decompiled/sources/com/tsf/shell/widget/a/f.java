package com.tsf.shell.widget.a;

import android.content.Context;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;

/* loaded from: classes.dex */
public class f extends VWidgetContainer implements com.tsf.shell.widget.a.a.c {
    private Context a;
    private VTextureManager b;
    private com.tsf.shell.widget.a.a.b c;
    private a d;
    private d e;

    public f(Context context, int i) {
        super(i);
        g.a("====CircleWidget Create===");
        this.a = context;
        this.b = getTextureManager();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        g.a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.e = new d();
        this.e.a(str);
        a(this.e);
    }

    public void a(d dVar) {
        com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) getVirtualTarget();
        this.d = new a(this.b, dVar);
        this.c = new com.tsf.shell.widget.a.a.b(this.a, this.d);
        this.c.a(this);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.widget.a.f.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                f.this.c.d();
            }
        });
        lVar.addChild(this.d);
        calAABB();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        this.d.b();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        this.d.c();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        this.d.d();
    }

    @Override // com.tsf.shell.widget.a.a.c
    public void a() {
        getLauncherInfo().onUpdateConfig(this.e.a());
        this.d.e();
    }

    @Override // com.tsf.shell.widget.a.a.c
    public void b() {
        this.d.c();
    }
}
