package com.tsf.shell.manager.p187r.p193c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p161c.C3330b;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3234a;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3254b;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3293d;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3297f;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3304g;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3315h;
import com.tsf.shell.p096f.p153i.p161c.p162a.C3326m;
import com.tsf.shell.p096f.p153i.p161c.p162a.InterfaceC3324k;
import com.tsf.shell.p096f.p153i.p161c.p162a.p163a.C3237b;
import com.tsf.shell.p096f.p153i.p161c.p162a.p164b.C3260c;
import com.tsf.shell.p096f.p153i.p161c.p162a.p165c.C3290c;
import com.tsf.shell.utils.C4189x;
import com.tsf.shell.widget.alarm.C4333r;
/* renamed from: com.tsf.shell.manager.r.c.f */
/* loaded from: classes.dex */
public class C3730f {
    /* renamed from: a */
    public static C3343g m1629a(Context context, String str, String str2, String str3, C3377f c3377f) {
        C3343g m1627a = m1627a(str2, c3377f);
        m1626b(m1627a, context, str, str2, str3, c3377f);
        return m1627a;
    }

    /* renamed from: b */
    private static void m1626b(final C3343g c3343g, Context context, String str, String str2, String str3, C3377f c3377f) {
        if (!c3343g.f11056e) {
            c3343g.f11053b = str3;
            c3343g.f11052a = str2;
            c3343g.f11054c = str2;
            c3343g.f11055d = 5;
            c3343g.m2809a(str);
            try {
                c3343g.f11060i = context.getPackageManager().getPackageInfo(str2, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            int identifier = context.getResources().getIdentifier("singleTask", "bool", str2);
            if (identifier > 0) {
                c3343g.f11057f = context.getResources().getBoolean(identifier);
            } else {
                c3343g.f11057f = false;
            }
            int identifier2 = context.getResources().getIdentifier("minSdkVersion", "integer", str2);
            if (identifier2 > 0) {
                c3343g.f11059h = context.getResources().getInteger(identifier2);
            } else {
                c3343g.f11059h = 0;
            }
            if (str3.equals(C4333r.class.getName())) {
                c3343g.f11057f = true;
            }
            int identifier3 = context.getResources().getIdentifier("category", "string", str2);
            if (identifier3 > 0) {
                if (context.getResources().getString(identifier3).equals("tool")) {
                    c3343g.f11058g = 0;
                } else {
                    c3343g.f11058g = 1;
                }
            } else {
                c3343g.f11058g = 0;
            }
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.f.1
                @Override // java.lang.Runnable
                public void run() {
                    C3343g.this.m2787l();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1628a(C3343g c3343g, Context context, String str, String str2, String str3, C3377f c3377f) {
        m1626b(c3343g, context, str, str2, str3, c3377f);
    }

    /* renamed from: a */
    public static C3343g m1627a(String str, C3377f c3377f) {
        C3343g c3343g;
        if (str.equals("com.tsf.shell.widget.music")) {
            c3343g = new C3330b(0.42f, 0.0f, 0.0f) { // from class: com.tsf.shell.manager.r.c.f.5
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3315h(new VTextureManager(), C0853a.m10856d(), 0.6f, (-230.0f) * C0892a.f2567c);
                }
            };
        } else if (str.equals("com.tsf.shell.widget.message")) {
            c3343g = new C3330b(0.41f, 0.0f, (-40.0f) * C0892a.f2567c) { // from class: com.tsf.shell.manager.r.c.f.6
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3304g(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.alarm")) {
            c3343g = new C3330b(0.33f, 0.0f, C0892a.f2567c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.f.7
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3254b(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.calendar")) {
            c3343g = new C3330b(0.28f, 0.0f, C0892a.f2567c * (-15.0f)) { // from class: com.tsf.shell.manager.r.c.f.8
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3237b(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.cubeclock")) {
            c3343g = new C3330b(0.6f * C0892a.f2567c, 0.0f, 0.0f) { // from class: com.tsf.shell.manager.r.c.f.9
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3260c(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.weather")) {
            c3343g = new C3330b(0.5f, 0.0f, (-20.0f) * C0892a.f2567c) { // from class: com.tsf.shell.manager.r.c.f.10
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3326m(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.memo")) {
            c3343g = new C3330b(0.5f, 0.0f, (-10.0f) * C0892a.f2567c) { // from class: com.tsf.shell.manager.r.c.f.11
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3297f(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.gallery")) {
            c3343g = new C3330b(0.45f, 0.0f, 0.0f) { // from class: com.tsf.shell.manager.r.c.f.12
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3293d(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.adornment")) {
            c3343g = new C3330b(0.55f, 0.0f, (-50.0f) * C0892a.f2567c) { // from class: com.tsf.shell.manager.r.c.f.2
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3234a(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else if (str.equals("com.tsf.shell.widget.dotsclock")) {
            c3343g = new C3330b(0.45f, 0.0f, 0.0f) { // from class: com.tsf.shell.manager.r.c.f.3
                @Override // com.tsf.shell.p096f.p153i.p161c.C3330b
                /* renamed from: g_ */
                public InterfaceC3324k mo1621g_() {
                    return new C3290c(new VTextureManager(), C0853a.m10856d());
                }
            };
        } else {
            c3343g = new C3343g() { // from class: com.tsf.shell.manager.r.c.f.4

                /* renamed from: k */
                private C0981k f12281k;

                /* renamed from: l */
                private TextureElement f12282l = new TextureElement(0, false);

                @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
                /* renamed from: a */
                public C0975i mo1624a(int i, int i2, boolean z) {
                    if (this.f12281k == null) {
                        this.f12281k = new C0981k(C3566b.f11839a.f11750H, C3566b.f11839a.f11751I, false);
                        this.f12281k.textures().addElement(this.f12282l);
                    }
                    m1622p();
                    return this.f12281k;
                }

                @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
                /* renamed from: a */
                public void mo1625a() {
                    super.mo1625a();
                    if (this.f12281k != null) {
                        this.f12281k.destroy();
                    }
                    if (this.f12282l.f2529id != 0) {
                        C0853a.m10853g().m10543a(this.f12282l);
                    }
                }

                @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
                /* renamed from: b */
                public void mo1623b() {
                    if (this.f12282l.f2529id != 0) {
                        C0853a.m10853g().m10543a(this.f12282l);
                    }
                    super.mo1623b();
                }

                /* renamed from: p */
                private void m1622p() {
                    if (this.f12282l.f2529id == 0) {
                        Bitmap bitmap = null;
                        try {
                            Context m10856d = C0853a.m10856d();
                            String str2 = this.f11052a;
                            C0853a.m10856d();
                            C0853a.m10856d();
                            Context createPackageContext = m10856d.createPackageContext(str2, 3);
                            if (createPackageContext.getApplicationInfo() != null && createPackageContext.getApplicationInfo().icon != 0) {
                                bitmap = C4189x.m603a(createPackageContext.getResources(), createPackageContext.getApplicationInfo().icon, (int) this.f12281k.mo10366b(), (int) this.f12281k.mo10365c());
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                        }
                        if (bitmap == null) {
                            bitmap = C4189x.m607a(C1306b.C1310d.sym_def_app_icon, (int) this.f12281k.mo10366b(), (int) this.f12281k.mo10365c());
                        }
                        C0853a.m10853g().m10540a(this.f12282l, bitmap);
                        bitmap.recycle();
                    }
                }
            };
        }
        c3343g.f11052a = str;
        return c3343g;
    }
}
