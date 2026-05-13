package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.AbstractC0105r;
import android.support.p002v4.app.Fragment;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.View$OnClickListenerC3866i;
import java.util.List;
/* renamed from: com.tsf.shell.plugin.themepicker.theme.c */
/* loaded from: classes.dex */
public class C3912c extends AbstractC0105r {

    /* renamed from: a */
    private List<ResolveInfo> f12820a;

    /* renamed from: b */
    private PackageManager f12821b;

    /* renamed from: c */
    private Context f12822c;

    public C3912c(AbstractC0094o abstractC0094o, List<ResolveInfo> list, Context context) {
        super(abstractC0094o);
        this.f12822c = context;
        this.f12821b = context.getPackageManager();
        this.f12820a = list;
    }

    @Override // android.support.p002v4.app.AbstractC0105r
    /* renamed from: a */
    public Fragment mo990a(int i) {
        if (i == 0) {
            return new View$OnClickListenerC3908b();
        }
        int i2 = i - 1;
        View$OnClickListenerC3866i view$OnClickListenerC3866i = new View$OnClickListenerC3866i();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i2);
        bundle.putParcelable("resolveInfo", this.f12820a.get(i2));
        view$OnClickListenerC3866i.m13748g(bundle);
        return view$OnClickListenerC3866i;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public int mo938b() {
        if (this.f12820a != null) {
            return 1 + this.f12820a.size();
        }
        return 1;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: c */
    public CharSequence mo989c(int i) {
        if (i == 0) {
            return this.f12822c.getString(C3852f.C3862j.theme_picker_system);
        }
        String str = "";
        String[] split = this.f12820a.get(i - 1).loadLabel(this.f12821b).toString().split(" ");
        for (int i2 = 0; i2 < split.length; i2++) {
            if (str.length() < 10) {
                str = str + split[i2] + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
            return str;
        }
        return str;
    }
}
