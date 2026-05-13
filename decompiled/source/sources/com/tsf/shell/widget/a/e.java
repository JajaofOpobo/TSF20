package com.tsf.shell.widget.a;

import android.content.Context;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.tsf.shell.widget.a.a.b;
/* loaded from: classes.dex */
public class e extends VWidgetContainer implements b.a {
    private Context a;
    private VTextureManager b;
    private com.tsf.shell.widget.a.a.b c;
    private a d;
    private c e;

    public e(Context context, int i) {
        super(i);
        f.a("====CircleWidget Create===");
        this.a = context;
        this.b = getTextureManager();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        f.a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.e = new c();
        this.e.a(str);
        a(this.e);
    }

    public void a(c cVar) {
        this.d = new a(this.b, cVar);
        this.c = new com.tsf.shell.widget.a.a.b(this.a, this.d);
        this.c.a(this);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.widget.a.e.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                e.this.c.d();
            }
        });
        ((com.censivn.C3DEngine.b.f.j) getVirtualTarget()).addChild(this.d);
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

    @Override // com.tsf.shell.widget.a.a.b.a
    public void a() {
        getLauncherInfo().onUpdateConfig(this.e.a());
        this.d.e();
    }

    @Override // com.tsf.shell.widget.a.a.b.a
    public void b() {
        this.d.c();
    }
}
