package com.tsf.shell.widget.p200a;

import android.content.Context;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.tsf.shell.widget.p200a.p201a.C4200b;
/* renamed from: com.tsf.shell.widget.a.e */
/* loaded from: classes.dex */
public class C4216e extends VWidgetContainer implements C4200b.InterfaceC4203a {

    /* renamed from: a */
    private Context f13632a;

    /* renamed from: b */
    private VTextureManager f13633b;

    /* renamed from: c */
    private C4200b f13634c;

    /* renamed from: d */
    private C4192a f13635d;

    /* renamed from: e */
    private C4214c f13636e;

    public C4216e(Context context, int i) {
        super(i);
        C4218f.m501a("====CircleWidget Create===");
        this.f13632a = context;
        this.f13633b = getTextureManager();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        C4218f.m501a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.f13636e = new C4214c();
        this.f13636e.m516a(str);
        m505a(this.f13636e);
    }

    /* renamed from: a */
    public void m505a(C4214c c4214c) {
        this.f13635d = new C4192a(this.f13633b, c4214c);
        this.f13634c = new C4200b(this.f13632a, this.f13635d);
        this.f13634c.m555a(this);
        this.f13635d.setMouseEventListener(new C0937a(this.f13635d) { // from class: com.tsf.shell.widget.a.e.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C4216e.this.f13634c.m10506d();
            }
        });
        ((C0980j) getVirtualTarget()).addChild(this.f13635d);
        calAABB();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        this.f13635d.m573b();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        this.f13635d.m569c();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        this.f13635d.m566d();
    }

    @Override // com.tsf.shell.widget.p200a.p201a.C4200b.InterfaceC4203a
    /* renamed from: a */
    public void mo506a() {
        getLauncherInfo().onUpdateConfig(this.f13636e.m517a());
        this.f13635d.m564e();
    }

    @Override // com.tsf.shell.widget.p200a.p201a.C4200b.InterfaceC4203a
    /* renamed from: b */
    public void mo503b() {
        this.f13635d.m569c();
    }
}
