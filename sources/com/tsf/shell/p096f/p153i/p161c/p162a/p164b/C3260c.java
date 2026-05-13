package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3296e;
/* renamed from: com.tsf.shell.f.i.c.a.b.c */
/* loaded from: classes.dex */
public class C3260c extends AbstractC3322j {

    /* renamed from: c */
    public static Context f10740c;

    /* renamed from: d */
    public static VTextureManager f10741d;

    /* renamed from: e */
    public static C3271m f10742e;

    /* renamed from: f */
    public static C3269k f10743f;

    /* renamed from: g */
    public static C3273o f10744g;

    /* renamed from: h */
    public static C3270l f10745h;

    /* renamed from: a */
    public final int f10746a;

    /* renamed from: b */
    public final int f10747b;

    /* renamed from: m */
    public TextureElement f10748m;

    /* renamed from: n */
    long f10749n;

    /* renamed from: o */
    private C3266h f10750o;

    /* renamed from: p */
    private C3266h f10751p;

    public C3260c(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        this.f10746a = -13521439;
        this.f10747b = -13421773;
        this.f10749n = 0L;
        f10740c = context;
        f10741d = vTextureManager;
        m2976e();
    }

    /* renamed from: e */
    private void m2976e() {
        f10743f = new C3269k();
        f10744g = new C3273o();
        f10742e = new C3271m();
        f10745h = new C3270l();
        this.f10751p = new C3266h(VInformation.Scale());
        this.f10751p.position().f2527y = 80.0f;
        this.f10751p.scale().setAll(0.8f, 0.8f, 0.8f);
        this.f10751p.m2965a(-13521439);
        addChild(this.f10751p);
        this.f10750o = new C3266h(VInformation.Scale());
        this.f10750o.position().f2527y = -70.0f;
        this.f10750o.m2961b(0);
        this.f10750o.m2965a(-13421773);
        addChild(this.f10750o);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f10749n > 1000) {
            this.f10749n = currentTimeMillis;
            this.f10750o.m2964a(currentTimeMillis, true);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_cubeclock_shadow, new VObject3d[0]);
            this.f10962k.add(new C3261a(f10743f));
            this.f10962k.add(new C3261a(f10744g));
            this.f10962k.add(new C3261a(f10742e));
            this.f10962k.add(new C3261a(f10745h));
            m2851c(z);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_cubeclock_shadow) {
            this.f10748m = textureElement;
        }
    }

    /* renamed from: com.tsf.shell.f.i.c.a.b.c$a */
    /* loaded from: classes.dex */
    class C3261a extends AbstractC3322j.C3323a {

        /* renamed from: h */
        private AbstractC3263e f10753h;

        public C3261a(AbstractC3263e abstractC3263e) {
            super();
            this.f10753h = abstractC3263e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j.C3323a, com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public Bitmap mo2846a(Void... voidArr) {
            return this.f10753h.mo2950a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j.C3323a, com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public void mo2847a(Bitmap bitmap) {
            this.f10753h.mo2948a(bitmap);
            C3260c.this.m2852a(this);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j
    /* renamed from: f */
    public void mo2850f() {
        C3296e.m2908a("-----------onTaskMissionFinish");
        this.f10750o.m2963a(this.f10748m, f10743f, f10744g, f10742e);
        this.f10751p.m2963a(this.f10748m, f10743f, f10744g, f10742e);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            f10741d.deleteTexture(this.f10748m);
            f10743f.mo2947b();
            f10744g.mo2947b();
            f10742e.mo2947b();
            f10745h.mo2947b();
            this.f10750o.m2966a();
            this.f10751p.m2966a();
        }
    }
}
