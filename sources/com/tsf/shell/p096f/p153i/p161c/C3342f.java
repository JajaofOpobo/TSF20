package com.tsf.shell.p096f.p153i.p161c;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.i.c.f */
/* loaded from: classes.dex */
public class C3342f extends AbstractC3341e {

    /* renamed from: b */
    public C0981k f11045b;

    /* renamed from: f */
    private ApplicationInfo f11049f;

    /* renamed from: g */
    private AppWidgetProviderInfo f11050g;

    /* renamed from: a */
    public Bundle f11044a = null;

    /* renamed from: c */
    private ComponentName f11046c = null;

    /* renamed from: d */
    private int f11047d = 0;

    /* renamed from: e */
    private int f11048e = 0;

    /* renamed from: h */
    private TextureElement f11051h = new TextureElement(0, false);

    public C3342f() {
        m2810a(40);
    }

    /* renamed from: a */
    public void m2803a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        m2809a(str);
        this.f11049f = applicationInfo;
        this.f11050g = appWidgetProviderInfo;
        this.f11045b = new C0981k(0.0f, 0.0f, false);
        this.f11045b.textures().addElement(this.f11051h);
    }

    /* renamed from: d */
    public void m2801d(int i) {
        this.f11048e = i;
    }

    /* renamed from: e */
    public void m2800e(int i) {
        this.f11047d = i;
    }

    /* renamed from: a */
    public void m2804a(ComponentName componentName) {
        this.f11046c = componentName;
    }

    /* renamed from: c */
    public ComponentName m2802c() {
        return this.f11046c;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Bitmap m2805a(int i, int i2) {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT < 11 || this.f11050g.previewImage == 0) {
            if (this.f11050g.icon != 0) {
                bitmap = C4189x.m596a(this.f11050g.provider.getPackageName(), this.f11050g.icon);
            }
        } else {
            bitmap = C4189x.m596a(this.f11050g.provider.getPackageName(), this.f11050g.previewImage);
        }
        if (bitmap == null) {
            bitmap = C4189x.m609a(C1306b.C1310d.sym_def_app_icon);
        }
        return C4181q.m636c(bitmap, i, i2);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: a */
    public C0975i mo1624a(int i, int i2, boolean z) {
        if (this.f11051h.f2529id == 0) {
            Bitmap m2805a = m2805a(i, i2);
            C0853a.m10853g().m10540a(this.f11051h, m2805a);
            m2805a.recycle();
        }
        if (this.f11045b.mo10366b() != this.f11051h.width) {
            this.f11045b.mo10368a(this.f11051h.width);
        }
        if (this.f11045b.mo10365c() != this.f11051h.height) {
            this.f11045b.mo5215b(this.f11051h.height);
        }
        return this.f11045b;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: a */
    public void mo1625a() {
        super.mo1625a();
        this.f11044a = null;
        this.f11046c = null;
        this.f11049f = null;
        this.f11050g = null;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
        if (this.f11051h.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f11051h);
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: g */
    public void mo2791g() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: h */
    public void mo2790h() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: e */
    public void mo2793e() {
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: f */
    public void mo2792f() {
    }
}
