package android.support.p013v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.view.C0335au;
import android.support.p013v7.p014a.C0535a;
import android.view.ViewConfiguration;
/* renamed from: android.support.v7.view.a */
/* loaded from: classes.dex */
public class C0606a {

    /* renamed from: a */
    private Context f1387a;

    /* renamed from: a */
    public static C0606a m11878a(Context context) {
        return new C0606a(context);
    }

    private C0606a(Context context) {
        this.f1387a = context;
    }

    /* renamed from: a */
    public int m11879a() {
        return this.f1387a.getResources().getInteger(C0535a.C0542g.abc_max_action_buttons);
    }

    /* renamed from: b */
    public boolean m11877b() {
        return Build.VERSION.SDK_INT >= 19 || !C0335au.m12756b(ViewConfiguration.get(this.f1387a));
    }

    /* renamed from: c */
    public int m11876c() {
        return this.f1387a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean m11875d() {
        return this.f1387a.getApplicationInfo().targetSdkVersion >= 16 ? this.f1387a.getResources().getBoolean(C0535a.C0537b.abc_action_bar_embed_tabs) : this.f1387a.getResources().getBoolean(C0535a.C0537b.abc_action_bar_embed_tabs_pre_jb);
    }

    /* renamed from: e */
    public int m11874e() {
        TypedArray obtainStyledAttributes = this.f1387a.obtainStyledAttributes(null, C0535a.C0546k.ActionBar, C0535a.C0536a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0535a.C0546k.ActionBar_height, 0);
        Resources resources = this.f1387a.getResources();
        if (!m11875d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0535a.C0539d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m11873f() {
        return this.f1387a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int m11872g() {
        return this.f1387a.getResources().getDimensionPixelSize(C0535a.C0539d.abc_action_bar_stacked_tab_max_width);
    }
}
