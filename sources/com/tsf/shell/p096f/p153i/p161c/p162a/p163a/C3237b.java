package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import android.content.Context;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j;
import java.util.Date;
/* renamed from: com.tsf.shell.f.i.c.a.a.b */
/* loaded from: classes.dex */
public class C3237b extends AbstractC3322j {

    /* renamed from: a */
    public static C3237b f10578a;

    /* renamed from: b */
    private VObject3dContainer f10579b;

    /* renamed from: c */
    private C3244d f10580c;

    /* renamed from: d */
    private TextureElement f10581d;

    /* renamed from: e */
    private TextureElement f10582e;

    /* renamed from: f */
    private TextureElement f10583f;

    /* renamed from: g */
    private TextureElement f10584g;

    /* renamed from: h */
    private TextureElement f10585h;

    /* renamed from: m */
    private TextureElement f10586m;

    /* renamed from: n */
    private TextureElement f10587n;

    /* renamed from: o */
    private TextureElement f10588o;

    /* renamed from: p */
    private TextureElement f10589p;

    public C3237b(VTextureManager vTextureManager, Context context) {
        super(vTextureManager, context);
        C3236a.f10576c = context;
        C3236a.f10574a = VInformation.engineDensity();
        C3236a.f10575b = VInformation.Scale();
        C3236a.f10577d = vTextureManager;
        f10578a = this;
        this.f10579b = new VObject3dContainer();
        this.f10580c = new C3244d(this.f10579b);
        this.f10579b.addChild(this.f10580c);
        setAnimationObjectState(true);
        addChild(this.f10579b);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: b */
    public void mo2833b() {
        this.f10580c.m3022a();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: c */
    public void mo2832c() {
        this.f10580c.m3015b();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: a */
    public void mo2834a(boolean z) {
        if (!this.f10963l) {
            this.f10963l = true;
            mo2854a(C1306b.C1310d.widget_preview_calendar_main_bg, this.f10580c.f10649d);
            mo2854a(C1306b.C1310d.widget_preview_calendar_point, this.f10580c.f10648c.f10684a);
            mo2854a(C1306b.C1310d.widget_preview_calendar_photo1, this.f10580c.f10648c.f10685b);
            mo2854a(C1306b.C1310d.widget_preview_calendar_photo2, this.f10580c.f10648c.f10686c);
            mo2854a(C1306b.C1310d.widget_preview_calendar_photo3, this.f10580c.f10648c.f10687d);
            mo2854a(C1306b.C1310d.widget_preview_calendar_line, this.f10580c.f10653h);
            mo2854a(C1306b.C1310d.widget_preview_calendar_refresh, this.f10580c.f10654i);
            mo2854a(C1306b.C1310d.widget_preview_calendar_detil_bar, this.f10580c.f10650e);
            this.f10962k.add(new C3238a());
            m2851c(z);
        }
    }

    /* renamed from: com.tsf.shell.f.i.c.a.a.b$a */
    /* loaded from: classes.dex */
    class C3238a extends AbstractC3322j.C3323a {
        C3238a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j.C3323a, com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public Bitmap mo2846a(Void... voidArr) {
            return C3237b.this.m3044e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j.C3323a, com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3275c
        /* renamed from: a */
        public void mo2847a(Bitmap bitmap) {
            C3237b.this.m3045a(bitmap);
            C3237b.this.m2852a(this);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3321i
    /* renamed from: a */
    public void mo2836a(int i, TextureElement textureElement) {
        if (i == C1306b.C1310d.widget_preview_calendar_main_bg) {
            this.f10581d = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_point) {
            this.f10582e = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_photo1) {
            this.f10583f = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_photo2) {
            this.f10584g = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_photo3) {
            this.f10585h = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_line) {
            this.f10586m = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_refresh) {
            this.f10587n = textureElement;
        } else if (i == C1306b.C1310d.widget_preview_calendar_detil_bar) {
            this.f10588o = textureElement;
        }
    }

    /* renamed from: e */
    public Bitmap m3044e() {
        return C3251g.m3000a(this.f10960i, new Date());
    }

    /* renamed from: a */
    public void m3045a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f10589p = this.f10961j.createTexture(bitmap, true);
            this.f10580c.f10647b.textures().addElement(this.f10589p);
            this.f10580c.f10646a.m3036b().m3004a(this.f10589p);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.p162a.AbstractC3322j, com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k
    /* renamed from: d */
    public void mo2831d() {
        if (this.f10963l) {
            this.f10963l = false;
            this.f10961j.deleteTexture(this.f10581d);
            this.f10961j.deleteTexture(this.f10582e);
            this.f10961j.deleteTexture(this.f10583f);
            this.f10961j.deleteTexture(this.f10584g);
            this.f10961j.deleteTexture(this.f10585h);
            this.f10961j.deleteTexture(this.f10586m);
            this.f10961j.deleteTexture(this.f10587n);
            this.f10961j.deleteTexture(this.f10588o);
            this.f10961j.deleteTexture(this.f10589p);
            this.f10580c.m3012c();
        }
    }
}
