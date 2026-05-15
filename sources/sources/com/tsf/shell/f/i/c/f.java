package com.tsf.shell.f.i.c;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.utils.q;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends e {
    public k b;
    private ApplicationInfo f;
    private AppWidgetProviderInfo g;
    public Bundle a = null;
    private ComponentName c = null;
    private int d = 0;
    private int e = 0;
    private TextureElement h = new TextureElement(0, false);

    public f() {
        a(40);
    }

    public void a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        a(str);
        this.f = applicationInfo;
        this.g = appWidgetProviderInfo;
        this.b = new k(0.0f, 0.0f, false);
        this.b.textures().addElement(this.h);
    }

    public void d(int i) {
        this.e = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void a(ComponentName componentName) {
        this.c = componentName;
    }

    public ComponentName c() {
        return this.c;
    }

    @SuppressLint({"NewApi"})
    public Bitmap a(int i, int i2) {
        Bitmap bitmapA = null;
        if (Build.VERSION.SDK_INT < 11 || this.g.previewImage == 0) {
            if (this.g.icon != 0) {
                bitmapA = x.a(this.g.provider.getPackageName(), this.g.icon);
            }
        } else {
            bitmapA = x.a(this.g.provider.getPackageName(), this.g.previewImage);
        }
        if (bitmapA == null) {
            bitmapA = x.a(b.d.sym_def_app_icon);
        }
        return q.c(bitmapA, i, i2);
    }

    @Override // com.tsf.shell.f.i.c.e
    public i a(int i, int i2, boolean z) {
        if (this.h.id == 0) {
            Bitmap bitmapA = a(i, i2);
            com.censivn.C3DEngine.a.g().a(this.h, bitmapA);
            bitmapA.recycle();
        }
        if (this.b.b() != this.h.width) {
            this.b.a(this.h.width);
        }
        if (this.b.c() != this.h.height) {
            this.b.b(this.h.height);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f.i.c.e
    public void a() {
        super.a();
        this.a = null;
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.tsf.shell.f.i.c.e
    public void b() {
        if (this.h.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.h);
        }
    }

    @Override // com.tsf.shell.f.i.c.e
    public void g() {
    }

    @Override // com.tsf.shell.f.i.c.e
    public void h() {
    }

    @Override // com.tsf.shell.f.i.c.e
    public void e() {
    }

    @Override // com.tsf.shell.f.i.c.e
    public void f() {
    }
}
