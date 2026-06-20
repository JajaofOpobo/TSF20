package com.tsf.shell.widget.a;

import android.content.Context;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.tsf.shell.widget.a.a.WidgetVisualState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetContainer extends VWidgetContainer implements WidgetConfig.a {
    private Context a;
    private VTextureManager b;
    private com.tsf.shell.widget.a.a.WidgetVisualState c;
    private A d;
    private c e;

    public WidgetContainer(Context context, int i) {
        super(i);
        WidgetEvent.a("====CircleWidget Create===");
        this.a = context;
        this.b = getTextureManager();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        WidgetEvent.a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.e = new WidgetState();
        this.e.a(str);
        a(this.e);
    }

    public void a(c cVar) {
        com.censivn.C3DEngine.b.f.BaseRenderable jVar = (com.censivn.C3DEngine.b.f.BaseRenderable) getVirtualTarget();
        this.d = new WidgetPanelBase(this.b, cVar);
        this.c = new com.tsf.shell.widget.a.a.WidgetVisualState(this.a, this.d);
        this.c.a(this);
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.d) { // from class: com.tsf.shell.widget.a.WidgetContainer.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                e.this.c.d();
            }
        });
        jVar.addChild(this.d);
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

    @Override // com.tsf.shell.widget.a.a.WidgetVisualState.a
    public void a() {
        getLauncherInfo().onUpdateConfig(this.e.a());
        this.d.e();
    }

    @Override // com.tsf.shell.widget.a.a.WidgetVisualState.a
    public void b() {
        this.d.c();
    }
}
