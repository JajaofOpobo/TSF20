package com.tsf.extend.theme;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
/* renamed from: com.tsf.extend.theme.an */
/* loaded from: classes.dex */
public class C1695an {

    /* renamed from: a */
    private Context f5454a;

    /* renamed from: b */
    private ResolveInfo f5455b;

    /* renamed from: c */
    private Drawable f5456c;

    /* renamed from: d */
    private String f5457d;

    /* renamed from: e */
    private int f5458e;

    /* renamed from: f */
    private String f5459f;

    public C1695an(Context context, ResolveInfo resolveInfo) {
        this.f5454a = context;
        this.f5455b = resolveInfo;
        m7787a(resolveInfo.loadIcon(context.getPackageManager()));
        m7784b(resolveInfo.loadLabel(context.getPackageManager()).toString());
        m7786a(resolveInfo.activityInfo.packageName);
    }

    public C1695an(Context context, Drawable drawable, int i) {
        this.f5454a = context;
        m7787a(drawable);
        m7788a(i);
    }

    /* renamed from: a */
    public ResolveInfo m7789a() {
        return this.f5455b;
    }

    /* renamed from: b */
    public Drawable m7785b() {
        return this.f5456c;
    }

    /* renamed from: a */
    private void m7787a(Drawable drawable) {
        this.f5456c = drawable;
    }

    /* renamed from: c */
    public String m7783c() {
        return this.f5457d;
    }

    /* renamed from: b */
    private void m7784b(String str) {
        this.f5457d = str;
    }

    /* renamed from: d */
    public int m7782d() {
        return this.f5458e;
    }

    /* renamed from: a */
    private void m7788a(int i) {
        m7784b(this.f5454a.getString(i));
        this.f5458e = i;
    }

    /* renamed from: e */
    public String m7781e() {
        return this.f5459f;
    }

    /* renamed from: a */
    public void m7786a(String str) {
        this.f5459f = str;
    }

    public String toString() {
        return "appInfo:" + m7789a().toString() + "\niconResource:" + m7785b().toString() + "\nAppName:" + m7783c() + "\npackageName:" + m7781e();
    }
}
