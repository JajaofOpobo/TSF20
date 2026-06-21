package com.tsf.shell.e.i.c;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.r;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class h extends g {
    public m b;
    private ApplicationInfo f;
    private AppWidgetProviderInfo g;
    public Bundle a = null;
    private ComponentName c = null;
    private int d = 0;
    private int e = 0;
    private TextureElement h = new TextureElement(0, false);

    public h() {
        a(40);
    }

    public void a(String str, ApplicationInfo applicationInfo, AppWidgetProviderInfo appWidgetProviderInfo) {
        a(str);
        this.f = applicationInfo;
        this.g = appWidgetProviderInfo;
        this.b = new m(0.0f, 0.0f, false);
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
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT < 11 || this.g.previewImage == 0) {
            if (this.g.icon != 0) {
                bitmap = x.a(this.g.provider.getPackageName(), this.g.icon);
            }
        } else {
            bitmap = x.a(this.g.provider.getPackageName(), this.g.previewImage);
        }
        if (bitmap == null) {
            bitmap = x.a(R.drawable.sym_def_app_icon);
        }
        return r.c(bitmap, i, i2);
    }

    @Override // com.tsf.shell.e.i.c.g
    public j a(int i, int i2, boolean z) {
        if (this.h.id == 0) {
            Bitmap a = a(i, i2);
            com.censivn.C3DEngine.a.g().a(this.h, a);
            a.recycle();
        }
        if (this.b.b() != this.h.width) {
            this.b.a(this.h.width);
        }
        if (this.b.c() != this.h.height) {
            this.b.b(this.h.height);
        }
        return this.b;
    }

    @Override // com.tsf.shell.e.i.c.g
    public void a() {
        super.a();
        this.a = null;
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.tsf.shell.e.i.c.g
    public void b() {
        if (this.h.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.h);
        }
    }

    @Override // com.tsf.shell.e.i.c.g
    public void g() {
    }

    @Override // com.tsf.shell.e.i.c.g
    public void h() {
    }

    @Override // com.tsf.shell.e.i.c.g
    public void e() {
    }

    @Override // com.tsf.shell.e.i.c.g
    public void f() {
    }
}
