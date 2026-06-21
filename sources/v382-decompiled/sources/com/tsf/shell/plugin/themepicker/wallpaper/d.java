package com.tsf.shell.plugin.themepicker.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.support.v4.app.p;
import java.util.List;

/* loaded from: classes.dex */
public class d extends p {
    private List a;
    private PackageManager b;
    private Context c;

    public d(k kVar, List list, Context context) {
        super(kVar);
        this.c = context;
        this.b = context.getPackageManager();
        this.a = list;
    }

    @Override // android.support.v4.app.p
    public Fragment a(int i) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("PageIndex", i);
        bundle.putParcelable("resolveInfo", (Parcelable) this.a.get(i));
        eVar.g(bundle);
        return eVar;
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        return this.a.size();
    }

    @Override // android.support.v4.view.ad
    public CharSequence c(int i) {
        String str = "";
        for (String str2 : ((ResolveInfo) this.a.get(i)).loadLabel(this.b).toString().split(" ")) {
            if (str.length() < 10) {
                str = String.valueOf(str) + str2 + " ";
            }
        }
        if (str.length() > 11) {
            str.subSequence(0, 10);
        }
        return str;
    }
}
