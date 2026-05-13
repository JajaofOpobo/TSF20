package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.AbstractC0105r;
import android.support.p002v4.app.Fragment;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.wallpaper.c */
/* loaded from: classes.dex */
public class C3962c extends AbstractC0105r {

    /* renamed from: a */
    private List<ResolveInfo> f12990a;

    /* renamed from: b */
    private PackageManager f12991b;

    /* renamed from: c */
    private Context f12992c;

    public C3962c(AbstractC0094o abstractC0094o, List<ResolveInfo> list, Context context) {
        super(abstractC0094o);
        this.f12992c = context;
        this.f12991b = context.getPackageManager();
        this.f12990a = list;
    }

    @Override // android.support.p002v4.app.AbstractC0105r
    /* renamed from: a */
    public Fragment mo990a(int i) {
        View$OnClickListenerC3963d view$OnClickListenerC3963d = new View$OnClickListenerC3963d();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i);
        bundle.putParcelable("resolveInfo", this.f12990a.get(i));
        view$OnClickListenerC3963d.m13748g(bundle);
        return view$OnClickListenerC3963d;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public int mo938b() {
        return this.f12990a.size();
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: c */
    public CharSequence mo989c(int i) {
        String str = "";
        String[] split = this.f12990a.get(i).loadLabel(this.f12991b).toString().split(" ");
        for (int i2 = 0; i2 < split.length; i2++) {
            if (str.length() < 10) {
                str = str + split[i2] + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
        }
        return str;
    }
}
