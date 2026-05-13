package com.tsf.shell.widget.cubeclock;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObjectManager;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.core.VWidgetContainer;
import com.censivn.C3DEngine.api.message.VMessageQueueManager;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.widget.cubeclock.p208a.C4374a;
import com.tsf.shell.widget.cubeclock.provider.C4399a;
/* renamed from: com.tsf.shell.widget.cubeclock.c */
/* loaded from: classes.dex */
public class C4382c extends VWidgetContainer {

    /* renamed from: a */
    public Context f14193a;

    /* renamed from: b */
    public VTextureManager f14194b;

    /* renamed from: c */
    public VObjectManager f14195c;

    /* renamed from: d */
    public VMessageQueueManager f14196d;

    /* renamed from: e */
    public C4394n f14197e;

    /* renamed from: f */
    public C4381b f14198f;

    /* renamed from: g */
    public C4397p f14199g;

    /* renamed from: h */
    public C4391k f14200h;

    /* renamed from: i */
    public int f14201i;

    /* renamed from: j */
    public C4401q f14202j;

    /* renamed from: k */
    public C4405s f14203k;

    /* renamed from: l */
    public C4374a f14204l;

    /* renamed from: m */
    public C4382c f14205m;

    /* renamed from: n */
    public float f14206n;

    /* renamed from: o */
    public float f14207o;

    /* renamed from: p */
    public float f14208p;

    /* renamed from: q */
    public C4399a f14209q;

    public C4382c(Context context, int i) {
        super(i);
        this.f14206n = 1.3333334f;
        this.f14207o = VInformation.Scale();
        this.f14208p = this.f14207o / this.f14206n;
        this.f14205m = this;
        this.f14201i = i;
        this.f14193a = context;
        this.f14194b = getTextureManager();
        this.f14195c = getObjectManager();
        this.f14195c.addObject(this);
        this.f14196d = new VMessageQueueManager(i);
        lockView(true);
        setUserRotation(false);
        interceptMouseEventVerticalScroll(true);
        m80a(false);
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onLoadAndInitComplete() {
        C4390j.m53a("====onLoadAndInitComplete===");
        String str = getLauncherInfo().config;
        this.f14209q = new C4399a(this);
        this.f14209q.m37a(str);
        m81a(this.f14209q);
    }

    /* renamed from: a */
    private void m81a(C4399a c4399a) {
        this.f14197e = new C4394n(this);
        this.f14198f = new C4381b(this);
        this.f14203k = new C4405s(this);
        this.f14199g = new C4397p(this);
        this.f14204l = new C4374a(this);
        addChild(this.f14204l);
        this.f14202j = new C4401q(this);
        this.f14200h = new C4391k(this);
        this.f14195c.addObject(this.f14204l);
        addChild(this.f14200h);
        this.f14202j.m28c(this.f14200h.f14243a == 0 ? 1000 : 60000);
    }

    /* renamed from: a */
    public void m80a(boolean z) {
        if (z) {
            setAABBPX((-280.0f) * this.f14208p, this.f14208p * (-240.0f), 0.0f, 280.0f * this.f14208p, 70.0f * this.f14208p, 0.0f);
        } else {
            setAABBPX((-280.0f) * this.f14208p, this.f14208p * (-70.0f), 0.0f, 280.0f * this.f14208p, 70.0f * this.f14208p, 0.0f);
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onPause() {
        this.f14202j.m35a();
        this.f14196d.pause();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onResume() {
        this.f14202j.m32b();
        this.f14196d.resume();
    }

    @Override // com.censivn.C3DEngine.api.core.VWidgetContainer
    public void onDestroy() {
        this.f14202j.m29c();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onKillFocus() {
        C4390j.m53a("onKillFocus");
        this.f14204l.m99d();
    }
}
