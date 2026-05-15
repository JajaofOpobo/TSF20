package com.tsf.extend.theme;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class an {
    private Context a;
    private ResolveInfo b;
    private Drawable c;
    private String d;
    private int e;
    private String f;

    public an(Context context, ResolveInfo resolveInfo) {
        this.a = context;
        this.b = resolveInfo;
        a(resolveInfo.loadIcon(context.getPackageManager()));
        b(resolveInfo.loadLabel(context.getPackageManager()).toString());
        a(resolveInfo.activityInfo.packageName);
    }

    public an(Context context, Drawable drawable, int i) {
        this.a = context;
        a(drawable);
        a(i);
    }

    public ResolveInfo a() {
        return this.b;
    }

    public Drawable b() {
        return this.c;
    }

    private void a(Drawable drawable) {
        this.c = drawable;
    }

    public String c() {
        return this.d;
    }

    private void b(String str) {
        this.d = str;
    }

    public int d() {
        return this.e;
    }

    private void a(int i) {
        b(this.a.getString(i));
        this.e = i;
    }

    public String e() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public String toString() {
        return "appInfo:" + a().toString() + "\niconResource:" + b().toString() + "\nAppName:" + c() + "\npackageName:" + e();
    }
}
